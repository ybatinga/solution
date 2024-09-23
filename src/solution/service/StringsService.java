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
    
//    public static String WALLET_ADDRESS_BUYER = Platform.DESKTOP_WALLET_ADDRESS_BUYER;
//    public static String WALLET_ADDRESS_OWNER = Platform.DESKTOP_WALLET_ADDRESS_OWNER;    
//    public static String WALLET_ADDRESS_ORD = Platform.DESKTOP_ORD_ADDRESS;    
    
    public static Laptop PLATFORM;
    
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
    public static String transfer_property = "Transfer Property";

    // wallet names
    public static String wallet_name_ord = "ord";
    public static String wallet_name_ord_notary = "ord_notary";
    public static String wallet_name_buyer = "legacy_buyer";
    public static String wallet_name_owner = "legacy_owner";
        
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
    
    public static String file_name_property_sale_contract = "property_sale_contract_.json";
    
    public static class Laptop{
        private static final String WALLET_ADDRESS_BUYER = "mgBg38pkq8ULumNQgHugiKMi5uUzVEg35G";
        private static final String WALLET_ADDRESS_OWNER = "mu6TidaphD9PbALi7KR4bJvPukjSziCWZR";   
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
        
        
    }
    
    public static class Desktop{
        private static final String WALLET_ADDRESS_BUYER = "midFKFXtqdSN8pRTvdqyqRwx9DUnRgezR5";
        private static final String WALLET_ADDRESS_OWNER = "mq2ujk9tzw2EVr111GMxb2uekHqhwG5LiF";   
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
    }
    
    
}
