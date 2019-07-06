/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryManagement;


public class Start {
    public static void main(String[] args) throws InterruptedException {
        ProgressBar progressbar = new ProgressBar();
        
        for(int i=0;i<=100;i++){
            Thread.sleep(20);
            progressbar.setVisible(true);
            progressbar.Redirecting.setText("Loading..."+i+"%");
            progressbar.Load.setValue(i);
            
            if(i==100){
                //next page er object
               Library bs = new Library();
                bs.setVisible(true);
                
                //splash.dispose();
            }
        }
    }
}
