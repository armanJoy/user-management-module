package com.arcgen.usermgt.models.view.menudef;

import java.util.List;

public class MenuActiveAccessDef {

    List<ActiveAccess> allActiveAccess;

    ActiveAccess activeAccess;

    public MenuActiveAccessDef() {
    }

    public List<ActiveAccess> getAllActiveAccess() {
        return allActiveAccess;
    }

    public void setAllActiveAccess(List<ActiveAccess> allActiveAccess) {
        this.allActiveAccess = allActiveAccess;
    }

    public ActiveAccess getActiveAccess() {
        return activeAccess;
    }

    public void setActiveAccess(ActiveAccess activeAccess) {
        this.activeAccess = activeAccess;
    }

}
