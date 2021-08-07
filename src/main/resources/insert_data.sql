INSERT INTO sensor( id, description,end_point,locations,model_unit,name,sensor_model, sensor_type,
                    start_point)
VALUES ( '1', 'this is greece','500','north','VOLTAGE','test', 'user','VOLTAGE' ,'200');

INSERT INTO roles(name) VALUES('ROLE_VIEWER');
INSERT INTO roles(name) VALUES('ROLE_ADMIN');