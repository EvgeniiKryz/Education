package com.Application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactForm extends JFrame {

    JTextField name_field, email_field;
    JRadioButton male, female;

    public ContactForm() {
        super("Контактна форма");
        super.setBounds(200, 100, 300, 230);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(5,2,2,10));

        JLabel name = new JLabel("Введіть ім'я:");
//        це я намагався зробити валідацію
//        if (name == "") throw new IllegalArgumentException("поле не заповнене");

        name_field = new JTextField("", 1);
        JLabel email = new JLabel("Введіть email:");
        email_field = new JTextField("", 1);

        container.add(name);
        container.add(name_field);
        container.add(email);
        container.add(email_field);

        male = new JRadioButton("Чоловічий");
        female = new JRadioButton("Жіночий");
        JCheckBox check = new JCheckBox("Згоден?", false);
        JButton send_button = new JButton("Відправити");

        male.setSelected(true);
        container.add(male);
        container.add(female);

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        container.add(check);
        container.add(send_button);

        send_button.addActionListener(new ButtonEventManager());
    }

   class ButtonEventManager implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String name = name_field.getText();
            String email = email_field.getText();

            String isMale = "Чоловічий";
            if(!male.isSelected())   // якщо male не вибраний то isMale стане "Жіночий"
                isMale = "Жіночий";

            JOptionPane.showMessageDialog(null, "Ваша пошта: " +
                    email + "\nВаша стать: " + isMale, "Привіт, " +
                    name, JOptionPane.PLAIN_MESSAGE);

        }
    }

}
