<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/oslogin/v1alpha/oslogin.proto

namespace GPBMetadata\Google\Cloud\Oslogin\V1Alpha;

class Oslogin
{
    public static $is_initialized = false;

    public static function initOnce() {
        $pool = \Google\Protobuf\Internal\DescriptorPool::getGeneratedPool();

        if (static::$is_initialized == true) {
          return;
        }
        \GPBMetadata\Google\Api\Annotations::initOnce();
        \GPBMetadata\Google\Cloud\Oslogin\Common::initOnce();
        \GPBMetadata\Google\Protobuf\GPBEmpty::initOnce();
        \GPBMetadata\Google\Protobuf\FieldMask::initOnce();
        $pool->internalAddGeneratedFile(hex2bin(
            "0adc110a2a676f6f676c652f636c6f75642f6f736c6f67696e2f7631616c" .
            "7068612f6f736c6f67696e2e70726f746f121c676f6f676c652e636c6f75" .
            "642e6f736c6f67696e2e7631616c7068611a21676f6f676c652f636c6f75" .
            "642f6f736c6f67696e2f636f6d6d6f6e2e70726f746f1a1b676f6f676c65" .
            "2f70726f746f6275662f656d7074792e70726f746f1a20676f6f676c652f" .
            "70726f746f6275662f6669656c645f6d61736b2e70726f746f22ab020a0c" .
            "4c6f67696e50726f66696c65120c0a046e616d6518012001280912410a0e" .
            "706f7369785f6163636f756e747318022003280b32292e676f6f676c652e" .
            "636c6f75642e6f736c6f67696e2e636f6d6d6f6e2e506f7369784163636f" .
            "756e7412560a0f7373685f7075626c69635f6b65797318032003280b323d" .
            "2e676f6f676c652e636c6f75642e6f736c6f67696e2e7631616c7068612e" .
            "4c6f67696e50726f66696c652e5373685075626c69634b657973456e7472" .
            "7912110a0973757370656e6465641804200128081a5f0a12537368507562" .
            "6c69634b657973456e747279120b0a036b657918012001280912380a0576" .
            "616c756518022001280b32292e676f6f676c652e636c6f75642e6f736c6f" .
            "67696e2e636f6d6d6f6e2e5373685075626c69634b65793a02380122290a" .
            "1944656c657465506f7369784163636f756e7452657175657374120c0a04" .
            "6e616d6518012001280922290a1944656c6574655373685075626c69634b" .
            "657952657175657374120c0a046e616d6518012001280922260a16476574" .
            "4c6f67696e50726f66696c6552657175657374120c0a046e616d65180120" .
            "01280922260a164765745373685075626c69634b65795265717565737412" .
            "0c0a046e616d651801200128092282010a19496d706f7274537368507562" .
            "6c69634b657952657175657374120e0a06706172656e7418012001280912" .
            "410a0e7373685f7075626c69635f6b657918022001280b32292e676f6f67" .
            "6c652e636c6f75642e6f736c6f67696e2e636f6d6d6f6e2e537368507562" .
            "6c69634b657912120a0a70726f6a6563745f6964180320012809225f0a1a" .
            "496d706f72745373685075626c69634b6579526573706f6e736512410a0d" .
            "6c6f67696e5f70726f66696c6518012001280b322a2e676f6f676c652e63" .
            "6c6f75642e6f736c6f67696e2e7631616c7068612e4c6f67696e50726f66" .
            "696c65229d010a195570646174655373685075626c69634b657952657175" .
            "657374120c0a046e616d6518012001280912410a0e7373685f7075626c69" .
            "635f6b657918022001280b32292e676f6f676c652e636c6f75642e6f736c" .
            "6f67696e2e636f6d6d6f6e2e5373685075626c69634b6579122f0a0b7570" .
            "646174655f6d61736b18032001280b321a2e676f6f676c652e70726f746f" .
            "6275662e4669656c644d61736b3293080a0e4f734c6f67696e5365727669" .
            "63651291010a1244656c657465506f7369784163636f756e7412372e676f" .
            "6f676c652e636c6f75642e6f736c6f67696e2e7631616c7068612e44656c" .
            "657465506f7369784163636f756e74526571756573741a162e676f6f676c" .
            "652e70726f746f6275662e456d707479222a82d3e49302242a222f763161" .
            "6c7068612f7b6e616d653d75736572732f2a2f70726f6a656374732f2a7d" .
            "1296010a1244656c6574655373685075626c69634b657912372e676f6f67" .
            "6c652e636c6f75642e6f736c6f67696e2e7631616c7068612e44656c6574" .
            "655373685075626c69634b6579526571756573741a162e676f6f676c652e" .
            "70726f746f6275662e456d707479222f82d3e49302292a272f7631616c70" .
            "68612f7b6e616d653d75736572732f2a2f7373685075626c69634b657973" .
            "2f2a7d12a1010a0f4765744c6f67696e50726f66696c6512342e676f6f67" .
            "6c652e636c6f75642e6f736c6f67696e2e7631616c7068612e4765744c6f" .
            "67696e50726f66696c65526571756573741a2a2e676f6f676c652e636c6f" .
            "75642e6f736c6f67696e2e7631616c7068612e4c6f67696e50726f66696c" .
            "65222c82d3e493022612242f7631616c7068612f7b6e616d653d75736572" .
            "732f2a7d2f6c6f67696e50726f66696c6512a3010a0f4765745373685075" .
            "626c69634b657912342e676f6f676c652e636c6f75642e6f736c6f67696e" .
            "2e7631616c7068612e4765745373685075626c69634b6579526571756573" .
            "741a292e676f6f676c652e636c6f75642e6f736c6f67696e2e636f6d6d6f" .
            "6e2e5373685075626c69634b6579222f82d3e493022912272f7631616c70" .
            "68612f7b6e616d653d75736572732f2a2f7373685075626c69634b657973" .
            "2f2a7d12cd010a12496d706f72745373685075626c69634b657912372e67" .
            "6f6f676c652e636c6f75642e6f736c6f67696e2e7631616c7068612e496d" .
            "706f72745373685075626c69634b6579526571756573741a382e676f6f67" .
            "6c652e636c6f75642e6f736c6f67696e2e7631616c7068612e496d706f72" .
            "745373685075626c69634b6579526573706f6e7365224482d3e493023e22" .
            "2c2f7631616c7068612f7b706172656e743d75736572732f2a7d3a696d70" .
            "6f72745373685075626c69634b65793a0e7373685f7075626c69635f6b65" .
            "7912b9010a125570646174655373685075626c69634b657912372e676f6f" .
            "676c652e636c6f75642e6f736c6f67696e2e7631616c7068612e55706461" .
            "74655373685075626c69634b6579526571756573741a292e676f6f676c65" .
            "2e636c6f75642e6f736c6f67696e2e636f6d6d6f6e2e5373685075626c69" .
            "634b6579223f82d3e493023932272f7631616c7068612f7b6e616d653d75" .
            "736572732f2a2f7373685075626c69634b6579732f2a7d3a0e7373685f70" .
            "75626c69635f6b657942b5010a20636f6d2e676f6f676c652e636c6f7564" .
            "2e6f736c6f67696e2e7631616c706861420c4f734c6f67696e50726f746f" .
            "50015a43676f6f676c652e676f6c616e672e6f72672f67656e70726f746f" .
            "2f676f6f676c65617069732f636c6f75642f6f736c6f67696e2f7631616c" .
            "7068613b6f736c6f67696eaa021c476f6f676c652e436c6f75642e4f734c" .
            "6f67696e2e5631416c706861ca021c476f6f676c655c436c6f75645c4f73" .
            "4c6f67696e5c5631616c706861620670726f746f33"
        ));

        static::$is_initialized = true;
    }
}

