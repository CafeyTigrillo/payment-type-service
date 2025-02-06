package com.mipagina.payment_type_service.controller;

import com.mipagina.payment_type_service.model.PaymentType;
import com.mipagina.payment_type_service.service.PaymentTypeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payment")
@Tag(name = "PaymentType", description = "API for managing payment types")
public class PaymentTypeController {
    @Autowired
    private PaymentTypeService paymentTypeService;

    @Operation(summary = "Create a new payment type", description = "Stores a new payment type in the system")
    @ApiResponse(responseCode = "201", description = "Payment method created successfully")
    @PostMapping("/create")
    public String createPaymentId(@RequestBody PaymentType paymentType) {
        paymentTypeService.savePaymentType(paymentType);
        return "Payment method created successfully";
    }

    @Operation(summary = "Retrieve all payment types", description = "Returns a list of all available payment types")
    @ApiResponse(responseCode = "200", description = "List of payment types retrieved successfully")
    @GetMapping("/bringAll")
    public List<PaymentType> getAllPaymentType() {
        return paymentTypeService.getAllPaymentType();
    }

    @Operation(summary = "Retrieve a payment type by ID", description = "Fetches a payment type based on the provided ID")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Payment type retrieved successfully"),
            @ApiResponse(responseCode = "404", description = "Payment type not found")
    })
    @GetMapping("/bring/{paymentId}")
    public PaymentType getPaymentType(
            @Parameter(description = "ID of the payment type to retrieve", required = true, example = "1")
            @PathVariable Long paymentId) {
        return paymentTypeService.getPaymentType(paymentId);
    }

    @Operation(summary = "Update a payment type", description = "Modifies an existing payment type")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Payment type updated successfully"),
            @ApiResponse(responseCode = "404", description = "Payment type not found")
    })
    @PutMapping("/edit/{paymentId}")
    public String editPaymentType(
            @Parameter(description = "ID of the payment type to edit", required = true, example = "1")
            @PathVariable Long paymentId,
            @RequestBody PaymentType paymentType) {
        paymentTypeService.editPaymentType(paymentId, paymentType);
        return "Payment method edited correctly";
    }

    @Operation(summary = "Delete a payment type", description = "Removes a payment type from the system")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Payment type deleted successfully"),
            @ApiResponse(responseCode = "404", description = "Payment type not found")
    })
    @DeleteMapping("/delete/{paymentId}")
    public String deletePaymentType(
            @Parameter(description = "ID of the payment type to delete", required = true, example = "1")
            @PathVariable Long paymentId) {
        paymentTypeService.deletePaymentType(paymentId);
        return "Payment method deleted correctly";
    }
}