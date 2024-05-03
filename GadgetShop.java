import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GadgetShop extends JFrame implements ActionListener {
    private ArrayList<Gadget> gadgets;
    private JTextField modelTextbox, priceTextbox, weightTextbox, sizeTextbox, 
                        creditTextbox, memoryTextbox, phoneNumberTextbox, 
                        durationTextbox, displayNumberTextbox;
    private JButton addMobileButton, addMP3Button, makeACallButton, 
                    downloadMusicButton, clearButton, displayAllButton;

    public GadgetShop() {
        gadgets = new ArrayList<>();
        initializeComponents();
    }

    private void initializeComponents() {
        setTitle("Gadget Shop");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1, 5, 5)); // Adjust layout to grid for simplicity

        // Panels for UI
        JPanel fieldsPanel = createFieldsPanel();
        JPanel detailsPanel = createDetailsPanel();
        JPanel buttonsPanel = createButtonsPanel();

        // Adding panels to the frame
        add(fieldsPanel);
        add(detailsPanel);
        add(buttonsPanel);

        pack();
        setLocationRelativeTo(null); // Center on screen
        setVisible(true);
    }

    private JPanel createFieldsPanel() {
        JPanel fieldsPanel = new JPanel(new GridLayout(1, 8, 5, 5));
        modelTextbox = new JTextField();
        priceTextbox = new JTextField();
        weightTextbox = new JTextField();
        sizeTextbox = new JTextField();

        fieldsPanel.add(new JLabel("Model:"));
        fieldsPanel.add(modelTextbox);
        fieldsPanel.add(new JLabel("Price:"));
        fieldsPanel.add(priceTextbox);
        fieldsPanel.add(new JLabel("Weight:"));
        fieldsPanel.add(weightTextbox);
        fieldsPanel.add(new JLabel("Size:"));
        fieldsPanel.add(sizeTextbox);
        return fieldsPanel;
    }

    private JPanel createDetailsPanel() {
        JPanel detailsPanel = new JPanel(new GridLayout(1, 6, 5, 5));
        creditTextbox = new JTextField();
        memoryTextbox = new JTextField();
        phoneNumberTextbox = new JTextField();
        durationTextbox = new JTextField();
        displayNumberTextbox = new JTextField();

        detailsPanel.add(new JLabel("Credit:"));
        detailsPanel.add(creditTextbox);
        detailsPanel.add(new JLabel("Memory:"));
        detailsPanel.add(memoryTextbox);
        detailsPanel.add(new JLabel("Phone No:"));
        detailsPanel.add(phoneNumberTextbox);
        detailsPanel.add(new JLabel("Duration:"));
        detailsPanel.add(durationTextbox);
        detailsPanel.add(new JLabel("Display Number:"));
        detailsPanel.add(displayNumberTextbox);
        return detailsPanel;
    }

    private JPanel createButtonsPanel() {
        JPanel buttonsPanel = new JPanel(new GridLayout(1, 6, 5, 5));
        addMobileButton = new JButton("Add Mobile");
        addMP3Button = new JButton("Add MP3");
        makeACallButton = new JButton("Make A Call");
        downloadMusicButton = new JButton("Download Music");
        clearButton = new JButton("Clear");
        displayAllButton = new JButton("Display All");

        addMobileButton.addActionListener(this);
        addMP3Button.addActionListener(this);
        makeACallButton.addActionListener(this);
        downloadMusicButton.addActionListener(this);
        clearButton.addActionListener(this);
        displayAllButton.addActionListener(this);

        buttonsPanel.add(addMobileButton);
        buttonsPanel.add(addMP3Button);
        buttonsPanel.add(clearButton);
        buttonsPanel.add(displayAllButton);
        buttonsPanel.add(makeACallButton);
        buttonsPanel.add(downloadMusicButton);
        return buttonsPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        try {
            if (source == addMobileButton) {
                addMobile();
            } else if (source == addMP3Button) {
                addMP3();
            } else if (source == clearButton) {
                clearFields();
            } else if (source == displayAllButton) {
                displayAllGadgets();
            } else if (source == makeACallButton) {
                makeACall();
            } else if (source == downloadMusicButton) {
                downloadMusic();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please check your data.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void addMobile() {
        // Parse inputs, create mobile, add to list
    }

    private void addMP3() {
        // Parse inputs, create MP3, add to list
    }

    private void makeACall() {
        // Find mobile by display number, make call
    }

    private void downloadMusic() {
        // Find MP3 by display number, download music
    }

    private void clearFields() {
        // Clear all text fields
    }

    private void displayAllGadgets() {
        // Loop through gadgets and call display method
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GadgetShop());
    }
}

