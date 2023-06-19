package enums;

public enum ResCodeEnum {
    /*
    1001 查询成功 1002 查询失败 1003 查询警告
    2001 添加成功 2002 添加失败 2003 添加警告
    3001 删除成功 3002 删除失败 3003 删除警告
    4001 修改成功 4002 修改失败 4003 修改警告
    5001 登录成功 5002 未登录   5003 登录异常
     */
    SELECTOK(1001), SELECTER(1002), SELECTWA(1003),
    ADDOK(2001),ADDER(2002),ADDWA(2003),
    DELECTOK(3001),DELECTER(3002),DELECTWA(3003),
    UPDATEOK(4001),UPDATEER(4002),
    LOGINOK(5001),LOGINER(5002);

    private final Integer ResCode;

    ResCodeEnum(Integer ResCode) {
        this.ResCode=ResCode;
    }

    public Integer getResCode() {
        return ResCode;
    }
}