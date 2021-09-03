Simple Rest Api interacting with Frontend based on Angular10+ngRx for managing data





Инструкция для бакэнда
Нужно поменять настройки базы данных на свою
После того как Hibernate сгенерируют базу данных необходима ввести следующий query
INSERT INTO roles(name) VALUES('ROLE_VIEWER');
INSERT INTO roles(name) VALUES('ROLE_ADMIN');
чтобы в таблице ролей появились роли 
потом с помощи postmana или его аналогов необходима зарегистрировать ползователя в систему при помощи json row в этот url
localhost:8080/api/auth/signup 

{
    "username":"test",
    "password":"testtest",
    "role":["admin"]
}
даннын для проверки 
INSERT INTO sensor(  description,end_point,locations,model_unit,name,sensor_model, sensor_type,
                    start_point)
VALUES (  'this is greece','500','north','VOLTAGE','test', 'user','VOLTAGE' ,'200');
INSERT INTO sensor(  description,end_point,locations,model_unit,name,sensor_model, sensor_type,
                    start_point)
VALUES (  'this is sparta','10','north','VOLTAGE','test2', 'admin','VOLTAGE' ,'1');

