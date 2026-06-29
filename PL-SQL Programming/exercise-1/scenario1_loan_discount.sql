DECLARE
    CURSOR c_customers IS
        SELECT customer_id, age, interest_rate
        FROM customers
        WHERE age > 60;
BEGIN
    FOR rec IN c_customers LOOP
        UPDATE customers
        SET interest_rate = interest_rate - 1
        WHERE customer_id = rec.customer_id;
    END LOOP;
    COMMIT;
END;
/
