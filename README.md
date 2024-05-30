# NightCare Project

A Child Care Center management system, developed by Java, Java Swing and NetBeans RCP platform.

Applied typical `Object-Oriented Programming` design concepts and full stack approach.

## General Structure

The project was made by 3 parts:
- Java Swing front end
- Back end logic
- Database

*I used CSV for data storage to simplify the process*

## Java Swing Front End Design

UI components:
- jPanel
- jTextfield
- jButton
- jTable
- jLabel
- etc.

<img width="1015" alt="Screen Shot 2024-05-30 at 11 26 06 AM" src="https://github.com/James-Z-Zhang00/NightCare/assets/144994336/f7729255-5398-4902-a9f9-8b5732ab239d">

Add data to jTable and basic settings of jFrame

```java
DataHandler dataHandler = new DataHandler();
        dataHandler.loadData();
        children = dataHandler.children;
        for (Child c : children) {
            t.addRow(c.getInfo());
        }
        
        JTableHeader jtb = studentsTable.getTableHeader();
        jtb.setFont(new Font("Helvetica", Font.BOLD, 20));
        this.setResizable(false);
        this.setVisible(true);
```

Load the selected data to side bars for edit or delete by adding click listener to jTable

```java
private void studentsTableMouseClicked(java.awt.event.MouseEvent evt) {                                           
        // TODO add your handling code here:
        int i = studentsTable.getSelectedRow();
        selectedRowIndex = i;
        TableModel selectedModel = studentsTable.getModel();
        selectedTableModel = selectedModel;
        studentIdTextField.setText(selectedModel.getValueAt(i,0).toString());
        nameTextField.setText(selectedModel.getValueAt(i,1).toString());
        ageTextField.setText(selectedModel.getValueAt(i,2).toString());
    } 
```

Button click perform function

```java
private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        selectedTableModel.setValueAt(studentIdTextField.getText(),selectedRowIndex,0);
        selectedTableModel.setValueAt(nameTextField.getText(),selectedRowIndex,1);
        selectedTableModel.setValueAt(ageTextField.getText(),selectedRowIndex,2);
        
        studentIdTextField.setText("");
        ageTextField.setText("");
        nameTextField.setText("");
        classTextField.setText("");
        
    }  
```

## Back End Logic 

Object Oriented Programming Structure

<img width="989" alt="Screen Shot 2024-05-30 at 11 48 02 AM" src="https://github.com/James-Z-Zhang00/NightCare/assets/144994336/e207edd6-7fd6-4ae2-bbb8-738dc7b96ae9">
<img width="507" alt="Screen Shot 2024-05-30 at 11 43 15 AM" src="https://github.com/James-Z-Zhang00/NightCare/assets/144994336/85259442-dfa8-42fb-ad48-62c60c5983de">

Object Oriented Design Concepts:
- Abstraction
- Encapsulation
- Inheritance
- Polymorphism

File I/O

```java
@Override
    public List<Student> getDataFromCSV() {
        List<Student> students = null;
        try {
            students = FileUtil.readFile(Student.class, "StudentData.csv");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }
```

Singleton Factory Design Pattern

```java
public class StudentDataFactory extends AbstractDataFactory {
    private static StudentDataFactory factoryInstance = null;
    private static StudentDataHandler studentDataHandler = null;

    private StudentDataFactory() {

    }

    public static AbstractDataFactory getFactoryInstance() {
        if (factoryInstance == null) {
            factoryInstance = new StudentDataFactory();
        }
        return factoryInstance;
    }

    @Override
    public DataHandler getObject() {
        if (studentDataHandler == null)
            studentDataHandler = new StudentDataHandler();
        return studentDataHandler;
    }
}
```


