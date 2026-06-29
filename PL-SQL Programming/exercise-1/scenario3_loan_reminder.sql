DECLARE
    CURSOR c_loans_due IS
        SELECT l.loan_id, l.due_date, c.name AS customer_name
        FROM loans l
        JOIN customers c ON l.customer_id = c.customer_id
        WHERE l.due_date BETWEEN SYSDATE AND SYSDATE + 30;
BEGIN
    FOR rec IN c_loans_due LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Customer ' || rec.customer_name ||
            ', loan ' || rec.loan_id ||
            ' is due on ' || TO_CHAR(rec.due_date, 'YYYY-MM-DD') || '.'
        );
    END LOOP;
END;
/
