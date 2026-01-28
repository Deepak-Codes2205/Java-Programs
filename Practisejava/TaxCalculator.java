import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TaxCalculator extends Frame implements ActionListener {
    TextField ageField, salaryField;
    Label ageLabel, salaryLabel, resultLabel;
    Button calculateButton;

    TaxCalculator() {
        setLayout(new FlowLayout());

        ageLabel = new Label("Enter Age:");
        ageField = new TextField(5);
        salaryLabel = new Label("Enter Salary:");
        salaryField = new TextField(10);
        calculateButton = new Button("Calculate Tax");
        resultLabel = new Label("");

        add(ageLabel);
        add(ageField);
        add(salaryLabel);
        add(salaryField);
        add(calculateButton);
        add(resultLabel);

        calculateButton.addActionListener(this);

        setSize(300, 200);
        setTitle("Tax Calculator");
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
		if(ae.getSource()==calculateButton)
		{
			try {
				int age = Integer.parseInt(ageField.getText());
				double salary = Double.parseDouble(salaryField.getText());

				if (age < 18 || age > 60) {
					JOptionPane.showMessageDialog(this, "Age must be between 18 and 60!", "Input Error", JOptionPane.WARNING_MESSAGE);
					return;
				}
				if (salary <= 0 || salary >= 300000) {
					JOptionPane.showMessageDialog(this, "Salary must be greater than 0 and less than 300000!", "Input Error", JOptionPane.WARNING_MESSAGE);
					return;
				}
				if(salary<=50000)
				{
					double tax = salary * 0.1;
				}
				else(salary>50000 && salary<300000)
				{
					double tax = 50000 * 0.1 + (salary-50000)*0.15;
				}
					
					// Example tax calculation (10% of salary)
				resultLabel.setText("Calculated Tax: ₹" + tax);

			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(this, "Please enter valid numeric values!", "Input Error", JOptionPane.ERROR_MESSAGE);
			}
		}
    }

    public static void main(String[] args) {
        new TaxCalculator();
    }
}