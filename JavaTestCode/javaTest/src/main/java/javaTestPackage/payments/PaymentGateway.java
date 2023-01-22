package javaTestPackage.payments;

public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest request);
}
