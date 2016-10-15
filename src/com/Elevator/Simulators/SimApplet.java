// Copyright (c) 2003 Webware Consulting
package com.Elevator.Simulators;
import javax.swing.JApplet;

public class SimApplet extends JApplet  {
   public SimApplet() {
   }
   public void start(){
      Simulator.main(new String[]  {"Applet"});
   }
}