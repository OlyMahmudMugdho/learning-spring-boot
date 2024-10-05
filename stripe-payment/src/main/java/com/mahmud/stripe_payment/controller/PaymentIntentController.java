package com.mahmud.stripe_payment.controller;

import com.mahmud.stripe_payment.models.RequestDto;
import com.mahmud.stripe_payment.models.ResponseDto;
import org.springframework.web.bind.annotation.RestController;

import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import com.stripe.param.PaymentIntentCreateParams;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentIntentController {
    @PostMapping("/create-payment-intent")
    public ResponseDto createPaymentIntent(@RequestBody RequestDto requestDto) throws StripeException {
        PaymentIntentCreateParams params = PaymentIntentCreateParams.builder()
                .setAmount(requestDto.getAmount() * 100L)
                .putMetadata("productName", requestDto.getProductName())
                .setCurrency("usd")
                .setAutomaticPaymentMethods(
                        PaymentIntentCreateParams
                                .AutomaticPaymentMethods
                                .builder()
                                .setEnabled(true)
                                .build()
                )
                .build();
        PaymentIntent intent = PaymentIntent.create(params);
        return new ResponseDto(
                intent.getId(),
                intent.getClientSecret()
        );
    }
}
