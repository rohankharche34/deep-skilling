CREATE OR REPLACE PROCEDURE TransferFunds(
    p_from_account NUMBER,
    p_to_account NUMBER,
    p_amount NUMBER
) IS
    v_balance NUMBER;
BEGIN
    SELECT balance INTO v_balance
    FROM accounts
    WHERE account_id = p_from_account
    FOR UPDATE;

    IF v_balance >= p_amount THEN
        UPDATE accounts
        SET balance = balance - p_amount
        WHERE account_id = p_from_account;

        UPDATE accounts
        SET balance = balance + p_amount
        WHERE account_id = p_to_account;

        COMMIT;
    ELSE
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account.');
    END IF;
END TransferFunds;
/
