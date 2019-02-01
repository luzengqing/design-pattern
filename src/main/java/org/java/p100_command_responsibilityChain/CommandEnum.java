package org.java.p100_command_responsibilityChain;

/**
 * Created by lzq on 2018/3/27.
 */
public enum CommandEnum {

    LS("LS", "LS命令","LS", 0),
    LS_A("LS_A", "LS_A命令", "LS", 1),
    LS_L("LS_L", "LS_L命令", "LS", 2),
    GIT_CHECKOUT("GIT_CHECKOUT", "GIT_CHECKOUT命令", "GIT", 0),
    GIT_STATUS("GIT_STATUS", "GIT_STATUS命令", "GIT", 1);


    private String code;
    private String name;
    private String type;
    private Integer level;


    CommandEnum(String code, String name, String type, Integer level) {
        this.code = code;
        this.name = name;
        this.type = type;
        this.level = level;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Integer getLevel() {
        return level;
    }
}
