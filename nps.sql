CREATE TABLE
    user
    (
        id BIGINT NOT NULL,
        uname VARCHAR NOT NULL,
        fname VARCHAR NOT NULL,
        lname VARCHAR NOT NULL,
        mobile VARCHAR NOT NULL,
        email VARCHAR NOT NULL,
        password VARCHAR NOT NULL,
        baccount VARCHAR,
        validated BOOLEAN DEFAULT 0,
        linked BOOLEAN DEFAULT 0,
        PRIMARY KEY (id)
    );

CREATE TABLE
    hibernate_sequence
    (
        next_val BIGINT
    );

INSERT INTO user (id, uname, fname, lname, mobile, email, password)
  VALUES (1, 'ninjapay', 'ninja', 'pay', '+31123456789', 'pay@ninja.com', 'pass1234');

INSERT INTO hibernate_sequence (next_val) VALUES (2);