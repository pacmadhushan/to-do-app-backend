
CREATE TABLE IF NOT EXISTS user(
    full_name VARCHAR(256) NOT NULL ,
    user_name VARCHAR(200)  PRIMARY KEY ,
    password VARCHAR(200) NOT NULL
);
CREATE TABLE to_do_item(
                           description VARCHAR(256),
                           id int(250) AUTO_INCREMENT primary key ,
                           user_name VARCHAR(256) NOT NULL,
                           status ENUM('DONE','NOT DONE') NOT NULL,
                           constraint foreign key (user_name) references user(user_name)
);