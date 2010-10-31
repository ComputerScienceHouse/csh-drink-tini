/**
 * @author Angelo DiNardi (adinardi@csh.rit.edu)
 */
class NoOpWorker extends Thread {
    
    public void run() {
        double temp;

        while( true ) {
            //send it
            CommLink.getInstance().getOutgoingLink().sendNoOp();
            
	    //sleep
            try {
                sleep( 60000 );
            }catch( Exception e ) {
                System.out.println( "Sleep Issue." );
            }
        }        
    }
}
