CREATE TABLE PERSONS (
    name VARCHAR(50),
    surname VARCHAR(50),
    age INT,
    phone_number VARCHAR(15),
    city_of_living VARCHAR(100),
    PRIMARY KEY (name, surname, age)
);

INSERT INTO PERSONS (name, surname, age, phone_number, city_of_living) VALUES
('Иван', 'Иванов', 30, '123-456-7890', 'Москва'),
('Петр', 'Петров', 25, '098-765-4321', 'Санкт-Петербург'),
('Анастасия', 'Сидорова', 28, '555-555-5555', 'Екатеринбург'),
('Мария', 'Миронова', 22, '111-222-3333', 'Казань'),
('Дмитрий', 'Сергеев', 35, '444-333-2222', 'Новосибирск');