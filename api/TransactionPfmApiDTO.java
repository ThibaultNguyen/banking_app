package com.soprabanking.dxp.tppconnectortinkais.model.api;

import com.soprabanking.dxp.ais.common.connector.model.api.ReferenceApiDto;
import com.soprabanking.dxp.ais.common.connector.model.api.RemittanceInformationApiDto;
import com.soprabanking.dxp.ais.common.connector.model.entity.constant.CreditDebitIndicator;
import com.soprabanking.dxp.ais.common.connector.model.entity.constant.TransactionStatus;
import com.soprabanking.dxp.commons.constants.DTO;

import javax.money.MonetaryAmount;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * API representation of a Transaction for PFM
 */
public class TransactionPfmApiDTO implements DTO {

    private String id;

    private CategoryPfmApiDTO category;

    private String entryReference;

    private String endToEndIdentification;

    private CreditDebitIndicator creditDebitIndicator;

    private TransactionStatus status;

    private OffsetDateTime bookingDateTime;

    private OffsetDateTime valueDateTime;

    private RemittanceInformationApiDto remittanceInformation;

    private MonetaryAmount amount;

    private List<ReferenceApiDto> counterPartyReferences = new ArrayList<>();

    private String counterPartyName;

    public String getId() {
        return id;
    }

    public TransactionPfmApiDTO setId(String id) {
        this.id = id;
        return this;
    }

    public CategoryPfmApiDTO getCategory() {
        return category;
    }

    public TransactionPfmApiDTO setCategory(CategoryPfmApiDTO category) {
        this.category = category;
        return this;
    }

    public String getEntryReference() {
        return entryReference;
    }

    public TransactionPfmApiDTO setEntryReference(String entryReference) {
        this.entryReference = entryReference;
        return this;
    }

    public String getEndToEndIdentification() {
        return endToEndIdentification;
    }

    public TransactionPfmApiDTO setEndToEndIdentification(String endToEndIdentification) {
        this.endToEndIdentification = endToEndIdentification;
        return this;
    }

    public CreditDebitIndicator getCreditDebitIndicator() {
        return creditDebitIndicator;
    }

    public TransactionPfmApiDTO setCreditDebitIndicator(CreditDebitIndicator creditDebitIndicator) {
        this.creditDebitIndicator = creditDebitIndicator;
        return this;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public TransactionPfmApiDTO setStatus(TransactionStatus status) {
        this.status = status;
        return this;
    }

    public OffsetDateTime getBookingDateTime() {
        return bookingDateTime;
    }

    public TransactionPfmApiDTO setBookingDateTime(OffsetDateTime bookingDateTime) {
        this.bookingDateTime = bookingDateTime;
        return this;
    }

    public OffsetDateTime getValueDateTime() {
        return valueDateTime;
    }

    public TransactionPfmApiDTO setValueDateTime(OffsetDateTime valueDateTime) {
        this.valueDateTime = valueDateTime;
        return this;
    }

    public RemittanceInformationApiDto getRemittanceInformation() {
        return remittanceInformation;
    }

    public TransactionPfmApiDTO setRemittanceInformation(RemittanceInformationApiDto remittanceInformation) {
        this.remittanceInformation = remittanceInformation;
        return this;
    }

    public MonetaryAmount getAmount() {
        return amount;
    }

    public TransactionPfmApiDTO setAmount(MonetaryAmount amount) {
        this.amount = amount;
        return this;
    }

    public List<ReferenceApiDto> getCounterPartyReferences() {
        return counterPartyReferences;
    }

    public TransactionPfmApiDTO setCounterPartyReferences(List<ReferenceApiDto> counterPartyReferences) {
        this.counterPartyReferences = counterPartyReferences;
        return this;
    }

    public String getCounterPartyName() {
        return counterPartyName;
    }

    public TransactionPfmApiDTO setCounterPartyName(String counterPartyName) {
        this.counterPartyName = counterPartyName;
        return this;
    }
}
