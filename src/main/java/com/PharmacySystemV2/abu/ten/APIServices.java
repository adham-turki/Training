    package com.PharmacySystemV2.abu.ten;

    import jakarta.annotation.Nonnull;
    import org.springframework.http.HttpHeaders;
    import org.springframework.http.HttpStatus;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;
    import java.io.IOException;
    import java.sql.SQLException;
    import java.util.ArrayList;

    @RestController
    @RequestMapping("/login")
    @CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH,RequestMethod.PUT,RequestMethod.DELETE})
    public class APIServices {

        @GetMapping("/{Eid}/{Ename}") // Log-in page
        public boolean getEmployeeByIdandName(@PathVariable int Eid, @PathVariable String Ename) throws SQLException, ClassNotFoundException {
            return DataBaseServices.getEmployeeByIdandName(Eid, Ename);
        }


        @GetMapping("/getAllMedicine") // medicine page
        public ArrayList<Medicine> getAllMedicine() throws SQLException, ClassNotFoundException, IOException {
            return DataBaseServices.getAllMedicineFromPharmacy();
        }
        @RequestMapping(value = "/getAllMedicine", method = RequestMethod.HEAD)
        public ResponseEntity<Void> headGetAllMedicine() throws SQLException, ClassNotFoundException, IOException {
            HttpHeaders headers = new HttpHeaders();
            headers.add("Custom-Header", "HeaderValue");
            headers.add("Another-Header", "AnotherValue");
            // Optionally, you can set additional headers here if needed
            return new ResponseEntity<>(headers, HttpStatus.OK);
        }
        @PostMapping("/addMedicine")
        public ResponseEntity<String> addMedicine(@Nonnull @RequestBody Medicine medicine) throws SQLException, ClassNotFoundException {

                DataBaseServices.addMedicineInDatabase(medicine);

            return ResponseEntity.ok().body("Medicine added successfully");
        }




        @GetMapping("/medicine/{Mid}")
        public Medicine getMedicineById(@PathVariable int Mid) throws SQLException, ClassNotFoundException {
            return DataBaseServices.getMedicineById(Mid);
        }

        @GetMapping("/getAllEmployee")
        public ArrayList<Employee> getAllEmployee() throws SQLException, ClassNotFoundException, IOException {
            return DataBaseServices.getAllEmployeeFromPharmacy();
        }
        @GetMapping("/getAllOrdersFromCompany")
        public ArrayList<OrderFromCompany> getAllOrderFromCompanies() throws SQLException, ClassNotFoundException, IOException {
            return DataBaseServices.getAllOrdersFromCompany();
        }
        @GetMapping("/getSaleAllOrders")
        public ArrayList<SaleOrder> getAllSaleOrders() throws SQLException, ClassNotFoundException, IOException {
            return DataBaseServices.getAllSaleOrders();
        }

        @GetMapping("/{orderId}")
        public ArrayList<Medicine> getMedicinesInOrder(@PathVariable int orderId) throws SQLException, ClassNotFoundException {
                return  DataBaseServices.getMedicinesInOrder(orderId);

        }
        @PostMapping("/login/editEmployee")
        public ResponseEntity<String> editEmployee(@Nonnull @RequestBody Employee E) {
            System.out.println(E);
            return ResponseEntity.ok().body("Employee edit successfully");
        }
        @PostMapping("/login/addEmployee")
        public ResponseEntity<String> addEmployee(@Nonnull @RequestBody Employee E) {
            System.out.println(E);
            return ResponseEntity.ok().body("Employee added successfully");
        }
        @PostMapping("/login/sellMedicine")
        public ResponseEntity<String> sellMedicine(@Nonnull @RequestBody ArrayList<Medicine> M) {
            System.out.println(M);
            return ResponseEntity.ok().body("Medicine added successfully");
        }
        @PostMapping("/login/deleteEmployee/{id}")
        public ResponseEntity<String> deleteEmployee(@PathVariable String id) {
            System.out.println(id);
            return ResponseEntity.ok().body(id);
        }



    }