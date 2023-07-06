
            }
            if(vpvar.equals("2"))
            {
                try
                {
                    String url = "jdbc:mysql://localhost:3306/votingdata?useSSL=false"; // Disable SSL
                    String user = "root";
                    String password = "Ojas@080109";

                    Connection connection = DriverManager.getConnection(url, user,password);
                    String name = "Button 2";
                    String query = "INSERT INTO vicepresident_data VALUES('"+name+"')";
                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    sta.close();
                    
                    connection.close();

                }
                catch(Exception exception)
                {
                    exception.printStackTrace();
                }
                    
            }
            if(vpvar.equals("3"))
            {
                try
                {
                    String url = "jdbc:mysql://localhost:3306/votingdata?useSSL=false"; // Disable SSL
                    String user = "root";
                    String password = "Ojas@080109";

                    Connection connection = DriverManager.getConnection(url, user,password);
                    
                    String name = "Button 3";
                    String query = "INSERT INTO vicepresident_data VALUES('"+name+"')";
                    System.out.println("Check6");
                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    sta.close();
                    
                    connection.close();

                }
                catch(Exception exception)
                {
                    exception.printStackTrace();
                }
            }

        }
       });;

       
       
       add(panelframe);

       setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
        
        
        
    }

    public static void main(String[] args)
    {
        new votepage();   
    }
    
}
