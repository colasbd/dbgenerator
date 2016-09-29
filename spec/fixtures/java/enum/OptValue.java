package fr.ganfra.realm;

/* DO NOT EDIT | Generated by dbgenerator */

public enum OptValue {

    OPT_VALUE_ONE("opt_value_one"),
    OPT_VALUE_TWO("opt_value_two"),
    OPT_VALUE_THREE("opt_value_three");

    private String jsonValue;

    OptValue(String jsonValue) {
        this.jsonValue = jsonValue;
    }

    public static OptValue get(String jsonValue) {
        for (OptValue type : OptValue.values()) {
            if (type.getJsonValue().equals(jsonValue)) {
                return type;
            }
        }
        return null;
    }

    public String getJsonValue() {
        return jsonValue;
    }
}