package exceptions;


import data.Settings;

class Errors extends InterruptedException {
    public Errors() {
        Settings.getDriver().close();
    }
}
