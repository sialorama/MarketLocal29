package org.example.View;


import org.example.model.ClientOrder;

import java.util.List;

public class ClientOrderView {
    public void AfficheClientOrders(List<ClientOrder> clientOrders) {
        for (ClientOrder clientOrder : clientOrders) {
            System.out.println(clientOrder.getId() + " "
                    + clientOrder.getQuantity()+ " "
                    + clientOrder.getProduct());

        }
    }
}