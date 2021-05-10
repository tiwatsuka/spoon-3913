package example;

import spoon.Launcher;

public class App 
{
    public static void main( String[] args )
    {
        Launcher launcher = new Launcher();
        launcher.addInputResource("src/main/resources/Maps.java");
        launcher.buildModel();
    }
}
