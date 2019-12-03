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



INSERT INTO user (id, uname, fname, lname, mobile, email, password,baccount, validated,linked)
  VALUES (2, 'ninjapay2', 'ninja2', 'pay2', '+31987654321', 'pay2@ninja.com', 'ninja1234', 'IBAN123456', 1, 1);
INSERT INTO user (id, uname, fname, lname, mobile, email, password,baccount,linked)
  VALUES (3, 'ninjajoe', 'ninja', 'joe', '+31112233445', 'joe@ninja.com', 'joe1234','IBAN654321',1);
UPDATE hibernate_sequence set next_val = 4;


INSERT INTO user (id, uname, fname, lname, mobile, email, password,baccount,linked)
  VALUES (4, 'jp', 'Joel', 'Perez', '++31655926724', 'joel@ing.com', 'isthisastrongpassword?','IBAN098765',1);
UPDATE hibernate_sequence set next_val = 5;