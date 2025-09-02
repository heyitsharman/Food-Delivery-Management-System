package com.fooddelivery.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String customerName;
    private String status;
    private String items;

    @ManyToOne
    private Chef assignedChef;

    @ManyToOne
    private DeliveryDriver assignedDriver;

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getItems() { return items; }
    public void setItems(String items) { this.items = items; }

    public Chef getAssignedChef() { return assignedChef; }
    public void setAssignedChef(Chef assignedChef) { this.assignedChef = assignedChef; }

    public DeliveryDriver getAssignedDriver() { return assignedDriver; }
    public void setAssignedDriver(DeliveryDriver assignedDriver) { this.assignedDriver = assignedDriver; }
}
