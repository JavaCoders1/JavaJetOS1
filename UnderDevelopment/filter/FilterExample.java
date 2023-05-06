package UnderDevelopment.filter;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class FilterExample extends JFrame implements ActionListener {
    private JTextField searchField;
    private JButton searchButton;
    private JList<String> resultList;
    private DefaultListModel<String> resultListModel;
    private List<String> allResults;

    public FilterExample() {
        setTitle("Filter Example");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());

        JPanel searchPanel = new JPanel(new BorderLayout());
        searchField = new JTextField();
        searchField.getDocument().addDocumentListener(new SearchFieldListener());
        searchPanel.add(new JLabel("Search: "), BorderLayout.WEST);
        searchPanel.add(searchField, BorderLayout.CENTER);
        searchButton = new JButton("Search");
        searchButton.addActionListener(this);
        searchPanel.add(searchButton, BorderLayout.EAST);

        allResults = new ArrayList<>();
        allResults.add("Apples");
        allResults.add("Bananas");
        allResults.add("Cherries");
        allResults.add("Grapes");
        allResults.add("Oranges");

        resultListModel = new DefaultListModel<>();
        for (String result : allResults) {
            resultListModel.addElement(result);
        }
        resultList = new JList<>(resultListModel);
        panel.add(searchPanel, BorderLayout.NORTH);
        panel.add(new JScrollPane(resultList), BorderLayout.CENTER);

        add(panel);

        setVisible(true);
    }

    private class SearchFieldListener implements DocumentListener {

        @Override
        public void changedUpdate(DocumentEvent e) {
            updateSearchResults();
        }

        @Override
        public void insertUpdate(DocumentEvent e) {
            updateSearchResults();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            updateSearchResults();
        }

        private void updateSearchResults() {
            String searchText = searchField.getText().toLowerCase();
            resultListModel.clear();
            for (String result : allResults) {
                if (result.toLowerCase().contains(searchText)) {
                    resultListModel.addElement(result);
                }
            }
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == searchButton) {
            String searchText = searchField.getText().toLowerCase();
            resultListModel.clear();
            for (String result : allResults) {
                if (result.toLowerCase().contains(searchText)) {
                    resultListModel.addElement(result);
                }
            }
        }
    }

    public static void main(String[] args) {
        new FilterExample();
    }
}
