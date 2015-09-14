package ui;

import app.Bucket;
import app.Shopping;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class CheckoutFrame extends javax.swing.JFrame {
    
    private Shopping shop;

    //number of choosen item
    Vector<Vector<String>> paidItemColums = new Vector<Vector<String>>();
    Vector<String> fullTableHeader = new Vector<>();
    final private String[] tableHeader = new String[]{"Name", "Price"};
    private String username;

    /**
     * Creates new form NewJFrame
     */
    public CheckoutFrame(String name, Double budget) {
        this.username = name;
        //set center in the screen
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //set up variables
        shop = new Shopping();
        
        buildPaidTableItems();
        shop.shop(budget);

        //initialize view
        initComponents();
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableShoppingItem = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableNonPurchasedItem = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTablePurchasedItem = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableShoppingItem.setAutoCreateRowSorter(true);
        jTableShoppingItem.setModel(new DefaultTableModel(paidItemColums, fullTableHeader
        )    );
        jScrollPane1.setViewportView(jTableShoppingItem);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(44, 58, 237));
        jLabel4.setText("Your Shopping Information");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(44, 58, 237));
        jLabel5.setText("Purchased Item");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 41));
        jLabel6.setText("Thank you for shopping at Dexter's House of Pain");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(44, 58, 237));
        jLabel7.setText("Not-Purchased Item");

        Map<String, Double> listNotPurchasedItems = shop.getListNotPurchasedItems();
        int tableSize = listNotPurchasedItems.size();
        String[][] tableData = new String[tableSize][2];
        int count = 0;
        for(String item : listNotPurchasedItems.keySet()){
            tableData[count][0] = item;
            tableData[count][1] = String.valueOf(listNotPurchasedItems.get(item));
            count++;
        }
        jTableNonPurchasedItem.setAutoCreateRowSorter(true);
        jTableNonPurchasedItem.setModel(new javax.swing.table.DefaultTableModel(
            tableData,
            tableHeader
        ));
        jScrollPane4.setViewportView(jTableNonPurchasedItem);

        Map<String, Double> listPurchasedItems = shop.getListPurchasedItems();
        tableSize = listPurchasedItems.size();
        tableData = new String[tableSize][2];
        count = 0;
        for(String item : listPurchasedItems.keySet()){
            tableData[count][0] = item;
            tableData[count][1] = String.valueOf(listPurchasedItems.get(item));
            count++;
        }
        jTablePurchasedItem.setAutoCreateRowSorter(true);
        jTablePurchasedItem.setModel(new javax.swing.table.DefaultTableModel(
            tableData,
            tableHeader
        ));
        jScrollPane6.setViewportView(jTablePurchasedItem);

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 41));
        jLabel8.setText("Hello " + username + ",");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(71, 71, 71))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTableNonPurchasedItem;
    private javax.swing.JTable jTablePurchasedItem;
    private javax.swing.JTable jTableShoppingItem;
    // End of variables declaration//GEN-END:variables

    private void buildPaidItems() {
        Bucket bucket = new Bucket();
        
        List<Double> price = bucket.getPriceArrayList();
        List<Double> qty = bucket.getQuantityArrayList();

        //System.out.println(price);
        System.out.printf("%-14s    %s      %s    %s     %s\n", "Item", "Price", "Qty", "Priority", "Total Price");
        System.out.println("------------------------------------------------------------");
        double total = 0;
        double total2 = 0;
        for (int e = 0; e < 7; e++) {
            
            total += price.get(e);
            total2 += price.get(e) * qty.get(e);
            
            System.out.printf("%-14s    $ %5.2f    %-2d      %-6s      %-6.2f\n", bucket.getName(e), bucket.getPrice(e), bucket.getQuantity(e), bucket.getPriority(e), bucket.getPrice(e) * bucket.getQuantity(e));
        }
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-14s    $ %5.2f          %-5s      %-6.2f\n", "Total per item:", total, "Total:", total2);
        
    }
    
    private void buildPaidTableItems() {
        //build column header
        fullTableHeader.add("Item");
        fullTableHeader.add("Price");
        fullTableHeader.add("Qty");
        fullTableHeader.add("Priority");
        fullTableHeader.add("Total");

        //build table data
        Bucket bucket = new Bucket();
        
        List<Double> price = bucket.getPriceArrayList();
        List<Integer> qty = bucket.getQuantityArrayList();

        //System.out.println(price);
        System.out.printf("%-14s    %s      %s    %s     %s\n", "Item", "Price", "Qty", "Priority", "Total Price");
        System.out.println("------------------------------------------------------------");
        double total = 0;
        double total2 = 0;
        for (int e = 0; e < 7; e++) {
            Vector<String> rowData = new Vector<>();
            total += price.get(e);
            total2 += price.get(e) * qty.get(e);
            
            rowData.add(bucket.getName(e));
            rowData.add(String.valueOf(bucket.getPrice(e)));
            rowData.add(String.valueOf(bucket.getQuantity(e)));
            rowData.add(bucket.getPriority(e));
            rowData.add(String.valueOf(bucket.getPrice(e) * bucket.getQuantity(e)));
            
            paidItemColums.add(rowData);
            System.out.printf("%-14s    $ %5.2f    %-2d      %-6s      %-6.2f\n", bucket.getName(e), bucket.getPrice(e), bucket.getQuantity(e), bucket.getPriority(e), bucket.getPrice(e) * bucket.getQuantity(e));
        }
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-14s    $ %5.2f          %-5s      %-6.2f\n", "Total per item:", total, "Total:", total2);
    }
}
