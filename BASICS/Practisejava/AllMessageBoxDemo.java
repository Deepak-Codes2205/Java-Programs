import javax.swing.JOptionPane;

public class AllMessageBoxDemo {
    public static void main(String[] args) 
	{
        // 1. Informational Message Box
        JOptionPane.showMessageDialog(null, "Your file has been saved successfully.", "Information", JOptionPane.INFORMATION_MESSAGE);

        // 2. Warning Message Box
        JOptionPane.showMessageDialog(null, "Your battery is running low.", "Warning", JOptionPane.WARNING_MESSAGE);

        // 3. Error Message Box
        JOptionPane.showMessageDialog(null, "Failed to connect to the server.", "Error", JOptionPane.ERROR_MESSAGE);

        // 4. Confirmation Message Box
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this file?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) 
		{
            System.out.println("File deleted!");
        } 
		else 
		{
            System.out.println("File not deleted.");
        }

        // 5. Input Message Box
        String name = JOptionPane.showInputDialog(null, "Please enter your name:", "Input", JOptionPane.QUESTION_MESSAGE);
        if (name != null && !name.isEmpty()) 
		{
            JOptionPane.showMessageDialog(null, "Hello, " + name + "!", "Greeting", JOptionPane.PLAIN_MESSAGE);
        } 
		else 
		{
            JOptionPane.showMessageDialog(null, "No name entered.", "Notice", JOptionPane.PLAIN_MESSAGE);
        }
    }
}