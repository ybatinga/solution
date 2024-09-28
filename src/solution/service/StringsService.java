/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solution.service;

/**
 *
 * @author ssd
 */
public class StringsService {
    
    public static Desktop PLATFORM;
    
    public static String real_estate_registry_system = "Real Estate Registry System";    
    
    // tab names
    public static String buyer_wallet = "Buyer Wallet";
    public static String owner_wallet = "Owner Wallet";
    public static String register_new_property = "Register New Property";
    public static String register_contract = "Register Contract";      
    public static String create_multisig_address = "Create Multisig";
    public static String send_contract_to_multisig_address = "Send Contract to Multisig";    
    public static String create_multisig_transaction = "Create Multisig Transaction";
    public static String send_signed_contract_to_registry_address = "Send Signed Contract to Registry";
    public static String verify_contract_signatures = "Verify Contract Signatures";    
    public static String send_payment_from_buyer_to_owner = "Send Payment";
    public static String verify_payment = "Verify Payment";
    public static String register_property_transfer = "Register Property Transfer";

    // wallet names
    public static String wallet_name_ord = "ord";
    public static String wallet_name_ord_notary = "ord_notary";
        
    // error messages
    public static String invalid_contract_transaction_ID = "Invalid contract transaction ID";
    
    // veritication messages
    public static String payment_has_been_confirmed_on_the_blockchain = "Payment has been confirmed on the blockchain.";
    public static String payment_has_not_been_confirmed_on_the_blockchain = "Payment has NOT been confirmed on the blockchain.";
    public static String payment_confirmation_message = "Payment Confirmation Message: ";
    
    // https://github.com/BlockchainCommons/Learning-Bitcoin-from-the-Command-Line/blob/master/06_1_Sending_a_Transaction_to_a_Multisig.md#collect-public-keys
    public static String reference_wallet_public_keys = "Collect Public Keys. You can't create a multi-sig with the addresses, as those are the hashes of public keys. You instead need the public keys themselves. This information is readily available with the getaddressinfo command.";
    
//    public static String ord_version = "ord-0.19.1";
    public static String ord_version = "ord-0.20.0";
    
    public static String file_name_new_property = "new_property.json";
    public static String file_name_property_sale_contract = "property_sale_contract_.json";
    public static String file_name_property_transfer = "property_transfer_.json";
    
    public static String file_path = "/home/ssd/Dropbox/thesis/ordinals_metadata_contract_signning/";
    
    public static String document_type_new_property_registry = "New Property Registry";
    public static String document_type_property_sale_agreement_contract = "Property Sale Agreement Contract";
    public static String document_type_property_transfer_registry = "Property Transfer Registry";
    
    public static String propertyAddress = "Rua Rio Grande do Sul - Nova Ubiratã, MT, 78888-000, Brasil";
    public static long propertyAreaSquareMeters = 32;
    public static double paymentAmount = 0.195;
    
    public static double transactionFee = 0.00001;
    
    public static class Laptop{
//        private static final String WALLET_ADDRESS_BUYER = "mgBg38pkq8ULumNQgHugiKMi5uUzVEg35G";
//        private static final String WALLET_ADDRESS_OWNER = "mu6TidaphD9PbALi7KR4bJvPukjSziCWZR";   
//        private static final String WALLET_NAME_BUYER = "legacy_buyer";
//        private static final String WALLET_NAME_OWNER = "legacy_owner";
//        private static final String NATIONAL_ID_BUYER = "450.593.347-48";
//        private static final String NATIONAL_ID_OWNER = "345.564.675-69";
//        private static final String NAME_BUYER = "Joao Silva";
//        private static final String NAME_OWNER = "Maria Oliveira";
        
        private static final String WALLET_ADDRESS_OWNER = "mgBg38pkq8ULumNQgHugiKMi5uUzVEg35G";
        private static final String WALLET_ADDRESS_BUYER = "mu6TidaphD9PbALi7KR4bJvPukjSziCWZR";   
        public static String WALLET_NAME_OWNER = "legacy_buyer";
        public static String WALLET_NAME_BUYER = "legacy_owner";
        private static final String NATIONAL_ID_OWNER = "450.593.347-48";
        private static final String NATIONAL_ID_BUYER = "345.564.675-69";
        private static final String NAME_OWNER = "Joao Silva";
        private static final String NAME_BUYER = "Maria Oliveira";
        
        private static final String ORD_REG_ADDRESS = "bcrt1pmjjg0vg7p9zkfwfd2msasql7t2m4qp37su6ww0gr3g9xgfz32k6qplwajr";
        private static final String GENERATE_TO_ADDRESS_WALLET_BUYER = "n4WHVo6ogtiRivJahJcUG5sHoZCeCvwWm4";

        public static String getWALLET_ADDRESS_BUYER() {
            return WALLET_ADDRESS_BUYER;
        }

        public static String getWALLET_ADDRESS_OWNER() {
            return WALLET_ADDRESS_OWNER;
        }

        public static String getORD_REG_ADDRESS() {
            return ORD_REG_ADDRESS;
        }

        public static String getGENERATE_TO_ADDRESS_WALLET_BUYER() {
            return GENERATE_TO_ADDRESS_WALLET_BUYER;
        }

        public static String getWALLET_NAME_BUYER() {
            return WALLET_NAME_BUYER;
        }

        public static String getWALLET_NAME_OWNER() {
            return WALLET_NAME_OWNER;
        }

        public static String getNATIONAL_ID_OWNER() {
            return NATIONAL_ID_OWNER;
        }

        public static String getNATIONAL_ID_BUYER() {
            return NATIONAL_ID_BUYER;
        }

        public static String getNAME_OWNER() {
            return NAME_OWNER;
        }

        public static String getNAME_BUYER() {
            return NAME_BUYER;
        }
        
    }
    
    public static class Desktop{
        private static final String WALLET_ADDRESS_BUYER = "midFKFXtqdSN8pRTvdqyqRwx9DUnRgezR5";
        private static final String WALLET_ADDRESS_OWNER = "mq2ujk9tzw2EVr111GMxb2uekHqhwG5LiF";   
        private static final String WALLET_NAME_BUYER = "legacy_buyer";
        private static final String WALLET_NAME_OWNER = "legacy_owner";
        private static final String NATIONAL_ID_BUYER = "450.593.347-48";
        private static final String NATIONAL_ID_OWNER = "345.564.675-69";
        private static final String NAME_BUYER = "Joao Silva";
        private static final String NAME_OWNER = "Maria Oliveira";
        
//        private static final String WALLET_ADDRESS_OWNER = "midFKFXtqdSN8pRTvdqyqRwx9DUnRgezR5";
//        private static final String WALLET_ADDRESS_BUYER = "mq2ujk9tzw2EVr111GMxb2uekHqhwG5LiF";   
//        public static String WALLET_NAME_OWNER = "legacy_buyer";
//        public static String WALLET_NAME_BUYER = "legacy_owner";
//        private static final String NATIONAL_ID_OWNER = "450.593.347-48";
//        private static final String NATIONAL_ID_BUYER = "345.564.675-69";
//        private static final String NAME_OWNER = "Joao Silva";
//        private static final String NAME_BUYER = "Maria Oliveira";
        
        
        private static final String ORD_REG_ADDRESS = "bcrt1p28pn5ahzz5tl802ymgq6mug84l5fjj2hplmuamfgwlgu6h2ah0ssrr4j9z";
        private static final String GENERATE_TO_ADDRESS_WALLET_BUYER = "mkNMhQixSRHmPuPy7s3PHN3mHmRE5xWXYz";

//        private static final String ORD_NOTARY_ADDRESS = "bcrt1p2hrhwq2w046upvzxwqxe33mvj5yxvtfg940824j8y2krtdz42cuq548xde";

        public static String getWALLET_ADDRESS_BUYER() {
            return WALLET_ADDRESS_BUYER;
        }

        public static String getWALLET_ADDRESS_OWNER() {
            return WALLET_ADDRESS_OWNER;
        }

        public static String getORD_REG_ADDRESS() {
            return ORD_REG_ADDRESS;
        }

        public static String getGENERATE_TO_ADDRESS_WALLET_BUYER() {
            return GENERATE_TO_ADDRESS_WALLET_BUYER;
        }

        public static String getWALLET_NAME_BUYER() {
            return WALLET_NAME_BUYER;
        }

        public static String getWALLET_NAME_OWNER() {
            return WALLET_NAME_OWNER;
        }
        
                public static String getNATIONAL_ID_OWNER() {
            return NATIONAL_ID_OWNER;
        }

        public static String getNATIONAL_ID_BUYER() {
            return NATIONAL_ID_BUYER;
        }

        public static String getNAME_OWNER() {
            return NAME_OWNER;
        }

        public static String getNAME_BUYER() {
            return NAME_BUYER;
        }
    }
    
    
}
