import java.io.*;

public class main {
    public static void main (String args[])throws IOException{
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        Queue q = new Queue();
        int choice = 0;
        
        do{
            System.out.print(
                      "1. Enqueue\n"
                    + "2. Dequeue\n"
                    + "3. Clear\n"
                    + "4. Peek\n"
                    + "5. Print\n"
                    + "6. Quit\n"
                    + "Select operation: ");
            
            choice = Integer.parseInt(x.readLine());
            
            switch(choice){
                case 1: System.out.print("Input an element: ");
                        q.enqueue(x.readLine());
                        break;
                case 2: System.out.println(q.dequeue() + " removed!");
                        break;
                case 3: q.clear();
                        System.out.println("cleared!");
                        break;
                case 4: System.out.println(q.peek());
                        break;
                case 5: q.print();
                        break;
            }     
        
        }while(choice < 6 && choice > 0);
    
    }
}
