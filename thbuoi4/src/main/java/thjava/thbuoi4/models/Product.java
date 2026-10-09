package thjava.thbuoi4.models;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Product {
    private Long id;

    @NotBlank(message = "Tên sản phẩm không được để trống")
    @Size(max = 100, message = "Tên sản phẩm không quá 100 ký tự")
    private String name;

    @NotNull(message = "Giá sản phẩm không được để trống")
    @Min(value = 0, message = "Giá sản phẩm phải lớn hơn hoặc bằng 0")
    @Max(value = 999999999, message = "Giá sản phẩm quá lớn")
    private Double price;

    private String description;

    private Category category;

    // 1. Constructor không tham số
    public Product() {
    }

    // 2. Constructor đầy đủ tham số
    public Product(Long id, String name, Double price, String description, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
    }

    // 3. Getter & Setter cho ID (Sửa lỗi dứt điểm dòng 57)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // 4. Các Getter & Setter khác
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}