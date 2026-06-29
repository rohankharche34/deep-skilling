DECLARE
    CURSOR c_customers IS
        SELECT customer_id, balance
        FROM customers
        WHERE balance > 10000;
BEGIN
    FOR rec IN c_customers LOOP
        UPDATE customers
        SET is_vip = TRUE
        WHERE customer_id = rec.customer_id;
    END LOOP;
    COMMIT;
END;
/
