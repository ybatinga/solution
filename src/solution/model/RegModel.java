package solution.model;

public class RegModel {

    private String document_type;
    private Property_info property_info;
    private Owner_info owner_info;
    private Buyer_info buyer_info;
    private Sale_agreement_contract_info sale_agreement_contract_info;

    public String getDocument_type() {
        return document_type;
    }

    public void setDocument_type(String document_type) {
        this.document_type = document_type;
    }

    public Property_info getProperty_info() {
        return property_info;
    }

    public void setProperty_info(Property_info property_info) {
        this.property_info = property_info;
    }

    public Owner_info getOwner_info() {
        return owner_info;
    }

    public void setOwner_info(Owner_info owner_info) {
        this.owner_info = owner_info;
    }

    public Buyer_info getBuyer_info() {
        return buyer_info;
    }

    public void setBuyer_info(Buyer_info buyer_info) {
        this.buyer_info = buyer_info;
    }

    public Sale_agreement_contract_info getSale_agreement_contract_info() {
        return sale_agreement_contract_info;
    }

    public void setSale_agreement_contract_info(Sale_agreement_contract_info sale_agreement_contract_info) {
        this.sale_agreement_contract_info = sale_agreement_contract_info;
    }

    
    public class Property_info {

        private float inscription_number;
        private String inscription_id;
        private String reveal_transaction_genesis_id;
        private float block_height_genesis;
        private String block_hash_genesis;
        private String timestamp;
        private String property_address;
        private float property_area_square_meters;

        // Getter Methods 
        public float getInscription_number() {
            return inscription_number;
        }

        public String getInscription_id() {
            return inscription_id;
        }

        public String getReveal_transaction_genesis_id() {
            return reveal_transaction_genesis_id;
        }

        public float getBlock_height_genesis() {
            return block_height_genesis;
        }

        public String getBlock_hash_genesis() {
            return block_hash_genesis;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public String getProperty_address() {
            return property_address;
        }

        public float getProperty_area_square_meters() {
            return property_area_square_meters;
        }

        // Setter Methods 
        public void setInscription_number(float inscription_number) {
            this.inscription_number = inscription_number;
        }

        public void setInscription_id(String inscription_id) {
            this.inscription_id = inscription_id;
        }

        public void setReveal_transaction_genesis_id(String reveal_transaction_genesis_id) {
            this.reveal_transaction_genesis_id = reveal_transaction_genesis_id;
        }

        public void setBlock_height_genesis(float block_height_genesis) {
            this.block_height_genesis = block_height_genesis;
        }

        public void setBlock_hash_genesis(String block_hash_genesis) {
            this.block_hash_genesis = block_hash_genesis;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        public void setProperty_address(String property_address) {
            this.property_address = property_address;
        }

        public void setProperty_area_square_meters(float property_area_square_meters) {
            this.property_area_square_meters = property_area_square_meters;
        }
    }
    
    public class Buyer_info {

        private String national_id;
        private String buyer_name;
        private String buyer_wallet_address;
        private String buyer_wallet_public_key_address;

        // Getter Methods 
        public String getNational_id() {
            return national_id;
        }

        public String getBuyer_name() {
            return buyer_name;
        }

        public String getBuyer_wallet_address() {
            return buyer_wallet_address;
        }

        public String getBuyer_wallet_public_key_address() {
            return buyer_wallet_public_key_address;
        }

        // Setter Methods 
        public void setNational_id(String national_id) {
            this.national_id = national_id;
        }

        public void setBuyer_name(String buyer_name) {
            this.buyer_name = buyer_name;
        }

        public void setBuyer_wallet_address(String buyer_wallet_address) {
            this.buyer_wallet_address = buyer_wallet_address;
        }

        public void setBuyer_wallet_public_key_address(String buyer_wallet_public_key_address) {
            this.buyer_wallet_public_key_address = buyer_wallet_public_key_address;
        }
    }

    public class Owner_info {

        private String name;
        private String national_id;
        private String owner_name;
        private String owner_wallet_address;
        private String owner_wallet_public_key_address;

        // Getter Methods 
        public String getName() {
            return name;
        }

        public String getNational_id() {
            return national_id;
        }

        public String getOwner_name() {
            return owner_name;
        }

        public String getOwner_wallet_address() {
            return owner_wallet_address;
        }

        public String getOwner_wallet_public_key_address() {
            return owner_wallet_public_key_address;
        }

        // Setter Methods 
        public void setName(String name) {
            this.name = name;
        }

        public void setNational_id(String national_id) {
            this.national_id = national_id;
        }

        public void setOwner_name(String owner_name) {
            this.owner_name = owner_name;
        }

        public void setOwner_wallet_address(String owner_wallet_address) {
            this.owner_wallet_address = owner_wallet_address;
        }

        public void setOwner_wallet_public_key_address(String owner_wallet_public_key_address) {
            this.owner_wallet_public_key_address = owner_wallet_public_key_address;
        }
    }

    
    

    public class Sale_agreement_contract_info {

        private float sale_price;

        // Getter Methods 
        public float getSale_price() {
            return sale_price;
        }

        // Setter Methods 
        public void setSale_price(float sale_price) {
            this.sale_price = sale_price;
        }
    }
}
