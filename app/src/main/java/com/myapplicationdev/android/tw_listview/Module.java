package com.myapplicationdev.android.tw_listview;

public class Module {
    String module_code;
    boolean isProg;

    public Module(String module_code, boolean isProg) {
        this.module_code = module_code;
        this.isProg = isProg;
    }

    public String getModule_code() {
        return module_code;
    }

    public void setModule_code(String module_code) {
        this.module_code = module_code;
    }

    public boolean isProg() {
        return isProg;
    }

    public void setProg(boolean prog) {
        isProg = prog;
    }
}
