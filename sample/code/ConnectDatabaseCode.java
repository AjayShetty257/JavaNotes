package sample.code;

import sample.code.model.ProductInfo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConnectDatabaseCode {

    public static Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");

            // Network call to check if the machine:port has a database running
            //and user "postgres" has access to the database with password ""
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "");
        } catch (SQLException sql) {
            System.out.println("Failed to connect to database");
            throw new RuntimeException("Database Failed!!!!!!!", sql);
        } catch (ClassNotFoundException ce) {
            System.out.println("Driver class not found!");
            throw new RuntimeException("Driver class not found", ce);
        }
    }

    public static void main(String[] args) {

        Connection c = getConnection();
        try {
            Statement statement = c.createStatement();

            //This is a network call..
            //Database call
            ResultSet resultSet = statement.executeQuery("select * from product_info");

            List<ProductInfo> productInfos = new ArrayList<>();

            while(resultSet.next()) {

                String productId = resultSet.getString("product_id");
                int categoryType = resultSet.getInt("category_type");
                Timestamp createTime = resultSet.getTimestamp("create_time");
                String productIcon = resultSet.getString("product_icon");
                float productPrice = resultSet.getFloat("product_price");

                ProductInfo p = new ProductInfo(productId, categoryType, createTime, productIcon, productPrice);

                productInfos.add(p);
            }

            float sum = 0.f;
            for(ProductInfo p : productInfos) {
               sum += p.getProductPrice();
            }

            System.out.println("Sum of all products is "+sum);
            ProductInfo firstProductInfo = productInfos.get(0);
            Timestamp earliestCreateTime = firstProductInfo.getCreateTime();

            for(ProductInfo p : productInfos) {
                Timestamp currentCreateTime = p.getCreateTime();
                if(earliestCreateTime.compareTo(currentCreateTime)>0){
                    earliestCreateTime = currentCreateTime;
                }
                System.out.println(p);
            }
            System.out.println("First product added is "+earliestCreateTime);

            System.out.println(productInfos.size());
            productInfos.remove(0);
            System.out.println(productInfos.size());
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}