package multithreading;

class Transfer { // Class for transferring messages
    public static void main(String[] args) {
        System.out.println(message + " is sending");
        try{
            Thread.sleep(1000); // display for one second
        }catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println(message + " is sent");
    }
}
class MessageTransfer extends  Thread{ // Class to send messages using threads
    private String message;
    Transfer msgTransfer;
    public MessageTransfer (String msg, Transfer trans){
        message = msg;
        msgTransfer = trans;
    }
    @Override
    public void run(){
        synchronized (msgTransfer){
            msgTransfer.sendMessage(message); // Send message using the thread
        }
    }
}
public class syncThread {
    public static void main(String[] args) {
        Transfer trans = new Transfer(); // new object for message transferring task
        MessageTransfer msg1 = new MessageTransfer("Hello ", trans);
        MessageTransfer msg2 = new MessageTransfer("Hello ", trans);
        MessageTransfer msg3 = new MessageTransfer("Hello ", trans);

    }
}



