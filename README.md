# todolist
controller：实现控制转发，基本参数校验，不复杂的简单业务处理

service：业务逻辑层

impl（实现层）
dao：接口查询接口
pojo（Plain Ordinary Java Object）

do（Data Object）——与数据库对应表（实体类），通过 DAO 层向上传输数据源对象

dto（Data Transfer Object）——数据传输对象，Service 或 Manager 向外传输的对象

后端–>前端的数据

vo（View Object）——显示层对象，通常是 Web 向模板渲染引擎层传输的对象

前端–>后端的数据

resources:
mappers（存放sql语句）

User已实现登陆，还需实现注册，添加todo，查看todo,创建小组等功能。对应页面为localhost：8080/login,/createtodo,...

postgresaql建表文件要自行创建:
![image](https://github.com/syyby/todolist/assets/105273564/2ee950fa-b1a6-40f8-9a68-b6eefe3c658c)


