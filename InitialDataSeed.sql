insert into authors (id, first_name, last_name, date_of_birth, created_at, updated_at) values
(uuid_to_bin(uuid()), 'Aldous', 'Huxley', str_to_date('07/26/1894', '%m/%d/%Y'), now(), now()),
(uuid_to_bin(uuid()), 'Jostein', 'Gaarder', str_to_date('08/08/1952', '%m/%d/%Y'), now(), now()),
(uuid_to_bin(uuid()), 'George', 'Orwell', str_to_date('07/25/1903', '%m/%d/%Y'), now(), now()); 