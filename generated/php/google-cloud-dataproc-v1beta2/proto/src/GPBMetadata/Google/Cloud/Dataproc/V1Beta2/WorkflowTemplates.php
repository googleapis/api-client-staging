<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/dataproc/v1beta2/workflow_templates.proto

namespace GPBMetadata\Google\Cloud\Dataproc\V1Beta2;

class WorkflowTemplates
{
    public static $is_initialized = false;

    public static function initOnce() {
        $pool = \Google\Protobuf\Internal\DescriptorPool::getGeneratedPool();

        if (static::$is_initialized == true) {
          return;
        }
        \GPBMetadata\Google\Api\Annotations::initOnce();
        \GPBMetadata\Google\Cloud\Dataproc\V1Beta2\Clusters::initOnce();
        \GPBMetadata\Google\Cloud\Dataproc\V1Beta2\Jobs::initOnce();
        \GPBMetadata\Google\Longrunning\Operations::initOnce();
        \GPBMetadata\Google\Protobuf\GPBEmpty::initOnce();
        \GPBMetadata\Google\Protobuf\Timestamp::initOnce();
        $pool->internalAddGeneratedFile(hex2bin(
            "0adf2d0a36676f6f676c652f636c6f75642f6461746170726f632f763162" .
            "657461322f776f726b666c6f775f74656d706c617465732e70726f746f12" .
            "1d676f6f676c652e636c6f75642e6461746170726f632e76316265746132" .
            "1a2c676f6f676c652f636c6f75642f6461746170726f632f763162657461" .
            "322f636c7573746572732e70726f746f1a28676f6f676c652f636c6f7564" .
            "2f6461746170726f632f763162657461322f6a6f62732e70726f746f1a23" .
            "676f6f676c652f6c6f6e6772756e6e696e672f6f7065726174696f6e732e" .
            "70726f746f1a1b676f6f676c652f70726f746f6275662f656d7074792e70" .
            "726f746f1a1f676f6f676c652f70726f746f6275662f74696d657374616d" .
            "702e70726f746f22a1030a10576f726b666c6f7754656d706c617465120a" .
            "0a026964180220012809120c0a046e616d65180120012809120f0a077665" .
            "7273696f6e180320012805122f0a0b6372656174655f74696d6518042001" .
            "280b321a2e676f6f676c652e70726f746f6275662e54696d657374616d70" .
            "122f0a0b7570646174655f74696d6518052001280b321a2e676f6f676c65" .
            "2e70726f746f6275662e54696d657374616d70124b0a066c6162656c7318" .
            "062003280b323b2e676f6f676c652e636c6f75642e6461746170726f632e" .
            "763162657461322e576f726b666c6f7754656d706c6174652e4c6162656c" .
            "73456e747279124b0a09706c6163656d656e7418072001280b32382e676f" .
            "6f676c652e636c6f75642e6461746170726f632e763162657461322e576f" .
            "726b666c6f7754656d706c617465506c6163656d656e7412370a046a6f62" .
            "7318082003280b32292e676f6f676c652e636c6f75642e6461746170726f" .
            "632e763162657461322e4f7264657265644a6f621a2d0a0b4c6162656c73" .
            "456e747279120b0a036b6579180120012809120d0a0576616c7565180220" .
            "0128093a02380122be010a19576f726b666c6f7754656d706c617465506c" .
            "6163656d656e7412480a0f6d616e616765645f636c757374657218012001" .
            "280b322d2e676f6f676c652e636c6f75642e6461746170726f632e763162" .
            "657461322e4d616e61676564436c75737465724800124a0a10636c757374" .
            "65725f73656c6563746f7218022001280b322e2e676f6f676c652e636c6f" .
            "75642e6461746170726f632e763162657461322e436c757374657253656c" .
            "6563746f724800420b0a09706c6163656d656e7422de010a0e4d616e6167" .
            "6564436c757374657212140a0c636c75737465725f6e616d651802200128" .
            "09123c0a06636f6e66696718032001280b322c2e676f6f676c652e636c6f" .
            "75642e6461746170726f632e763162657461322e436c7573746572436f6e" .
            "66696712490a066c6162656c7318042003280b32392e676f6f676c652e63" .
            "6c6f75642e6461746170726f632e763162657461322e4d616e6167656443" .
            "6c75737465722e4c6162656c73456e7472791a2d0a0b4c6162656c73456e" .
            "747279120b0a036b6579180120012809120d0a0576616c75651802200128" .
            "093a02380122b0010a0f436c757374657253656c6563746f72120c0a047a" .
            "6f6e6518012001280912590a0e636c75737465725f6c6162656c73180220" .
            "03280b32412e676f6f676c652e636c6f75642e6461746170726f632e7631" .
            "62657461322e436c757374657253656c6563746f722e436c75737465724c" .
            "6162656c73456e7472791a340a12436c75737465724c6162656c73456e74" .
            "7279120b0a036b6579180120012809120d0a0576616c7565180220012809" .
            "3a02380122fb040a0a4f7264657265644a6f62120f0a07737465705f6964" .
            "180120012809123e0a0a6861646f6f705f6a6f6218022001280b32282e67" .
            "6f6f676c652e636c6f75642e6461746170726f632e763162657461322e48" .
            "61646f6f704a6f624800123c0a09737061726b5f6a6f6218032001280b32" .
            "272e676f6f676c652e636c6f75642e6461746170726f632e763162657461" .
            "322e537061726b4a6f62480012400a0b7079737061726b5f6a6f62180420" .
            "01280b32292e676f6f676c652e636c6f75642e6461746170726f632e7631" .
            "62657461322e5079537061726b4a6f624800123a0a08686976655f6a6f62" .
            "18052001280b32262e676f6f676c652e636c6f75642e6461746170726f63" .
            "2e763162657461322e486976654a6f62480012380a077069675f6a6f6218" .
            "062001280b32252e676f6f676c652e636c6f75642e6461746170726f632e" .
            "763162657461322e5069674a6f62480012430a0d737061726b5f73716c5f" .
            "6a6f6218072001280b322a2e676f6f676c652e636c6f75642e6461746170" .
            "726f632e763162657461322e537061726b53716c4a6f62480012450a066c" .
            "6162656c7318082003280b32352e676f6f676c652e636c6f75642e646174" .
            "6170726f632e763162657461322e4f7264657265644a6f622e4c6162656c" .
            "73456e74727912400a0a7363686564756c696e6718092001280b322c2e67" .
            "6f6f676c652e636c6f75642e6461746170726f632e763162657461322e4a" .
            "6f625363686564756c696e67121d0a157072657265717569736974655f73" .
            "7465705f696473180a200328091a2d0a0b4c6162656c73456e747279120b" .
            "0a036b6579180120012809120d0a0576616c75651802200128093a023801" .
            "420a0a086a6f625f7479706522a2040a10576f726b666c6f774d65746164" .
            "61746112100a0874656d706c617465180120012809120f0a077665727369" .
            "6f6e18022001280512470a0e6372656174655f636c757374657218032001" .
            "280b322f2e676f6f676c652e636c6f75642e6461746170726f632e763162" .
            "657461322e436c75737465724f7065726174696f6e123b0a056772617068" .
            "18042001280b322c2e676f6f676c652e636c6f75642e6461746170726f63" .
            "2e763162657461322e576f726b666c6f77477261706812470a0e64656c65" .
            "74655f636c757374657218052001280b322f2e676f6f676c652e636c6f75" .
            "642e6461746170726f632e763162657461322e436c75737465724f706572" .
            "6174696f6e12440a05737461746518062001280e32352e676f6f676c652e" .
            "636c6f75642e6461746170726f632e763162657461322e576f726b666c6f" .
            "774d657461646174612e537461746512140a0c636c75737465725f6e616d" .
            "6518072001280912530a0a706172616d657465727318082003280b323f2e" .
            "676f6f676c652e636c6f75642e6461746170726f632e763162657461322e" .
            "576f726b666c6f774d657461646174612e506172616d6574657273456e74" .
            "72791a310a0f506172616d6574657273456e747279120b0a036b65791801" .
            "20012809120d0a0576616c75651802200128093a02380122380a05537461" .
            "7465120b0a07554e4b4e4f574e1000120b0a0750454e44494e471001120b" .
            "0a0752554e4e494e47100212080a04444f4e45100322450a10436c757374" .
            "65724f7065726174696f6e12140a0c6f7065726174696f6e5f6964180120" .
            "012809120d0a056572726f72180220012809120c0a04646f6e6518032001" .
            "2808224b0a0d576f726b666c6f774772617068123a0a056e6f6465731801" .
            "2003280b322b2e676f6f676c652e636c6f75642e6461746170726f632e76" .
            "3162657461322e576f726b666c6f774e6f64652290020a0c576f726b666c" .
            "6f774e6f6465120f0a07737465705f6964180120012809121d0a15707265" .
            "7265717569736974655f737465705f696473180220032809120e0a066a6f" .
            "625f696418032001280912440a05737461746518052001280e32352e676f" .
            "6f676c652e636c6f75642e6461746170726f632e763162657461322e576f" .
            "726b666c6f774e6f64652e4e6f64655374617465120d0a056572726f7218" .
            "0620012809226b0a094e6f64655374617465121b0a174e4f44455f535441" .
            "5455535f554e5350454349464945441000120b0a07424c4f434b45441001" .
            "120c0a0852554e4e41424c451002120b0a0752554e4e494e471003120d0a" .
            "09434f4d504c455445441004120a0a064641494c4544100522720a1d4372" .
            "65617465576f726b666c6f7754656d706c61746552657175657374120e0a" .
            "06706172656e7418012001280912410a0874656d706c6174651802200128" .
            "0b322f2e676f6f676c652e636c6f75642e6461746170726f632e76316265" .
            "7461322e576f726b666c6f7754656d706c617465223b0a1a476574576f72" .
            "6b666c6f7754656d706c61746552657175657374120c0a046e616d651801" .
            "20012809120f0a0776657273696f6e18022001280522580a22496e737461" .
            "6e7469617465576f726b666c6f7754656d706c6174655265717565737412" .
            "0c0a046e616d65180120012809120f0a0776657273696f6e180220012805" .
            "12130a0b696e7374616e63655f69641803200128092292010a28496e7374" .
            "616e7469617465496e6c696e65576f726b666c6f7754656d706c61746552" .
            "657175657374120e0a06706172656e7418012001280912410a0874656d70" .
            "6c61746518022001280b322f2e676f6f676c652e636c6f75642e64617461" .
            "70726f632e763162657461322e576f726b666c6f7754656d706c61746512" .
            "130a0b696e7374616e63655f696418032001280922620a1d557064617465" .
            "576f726b666c6f7754656d706c6174655265717565737412410a0874656d" .
            "706c61746518012001280b322f2e676f6f676c652e636c6f75642e646174" .
            "6170726f632e763162657461322e576f726b666c6f7754656d706c617465" .
            "22550a1c4c697374576f726b666c6f7754656d706c617465735265717565" .
            "7374120e0a06706172656e7418012001280912110a09706167655f73697a" .
            "6518022001280512120a0a706167655f746f6b656e180320012809227c0a" .
            "1d4c697374576f726b666c6f7754656d706c61746573526573706f6e7365" .
            "12420a0974656d706c6174657318012003280b322f2e676f6f676c652e63" .
            "6c6f75642e6461746170726f632e763162657461322e576f726b666c6f77" .
            "54656d706c61746512170a0f6e6578745f706167655f746f6b656e180220" .
            "012809223e0a1d44656c657465576f726b666c6f7754656d706c61746552" .
            "657175657374120c0a046e616d65180120012809120f0a0776657273696f" .
            "6e18022001280532df0f0a17576f726b666c6f7754656d706c6174655365" .
            "7276696365129d020a16437265617465576f726b666c6f7754656d706c61" .
            "7465123c2e676f6f676c652e636c6f75642e6461746170726f632e763162" .
            "657461322e437265617465576f726b666c6f7754656d706c617465526571" .
            "756573741a2f2e676f6f676c652e636c6f75642e6461746170726f632e76" .
            "3162657461322e576f726b666c6f7754656d706c61746522930182d3e493" .
            "028c0122382f763162657461322f7b706172656e743d70726f6a65637473" .
            "2f2a2f726567696f6e732f2a7d2f776f726b666c6f7754656d706c617465" .
            "733a0874656d706c6174655a46223a2f763162657461322f7b706172656e" .
            "743d70726f6a656374732f2a2f6c6f636174696f6e732f2a7d2f776f726b" .
            "666c6f7754656d706c617465733a0874656d706c6174651281020a134765" .
            "74576f726b666c6f7754656d706c61746512392e676f6f676c652e636c6f" .
            "75642e6461746170726f632e763162657461322e476574576f726b666c6f" .
            "7754656d706c617465526571756573741a2f2e676f6f676c652e636c6f75" .
            "642e6461746170726f632e763162657461322e576f726b666c6f7754656d" .
            "706c617465227e82d3e493027812382f763162657461322f7b6e616d653d" .
            "70726f6a656374732f2a2f726567696f6e732f2a2f776f726b666c6f7754" .
            "656d706c617465732f2a7d5a3c123a2f763162657461322f7b6e616d653d" .
            "70726f6a656374732f2a2f6c6f636174696f6e732f2a2f776f726b666c6f" .
            "7754656d706c617465732f2a7d129f020a1b496e7374616e746961746557" .
            "6f726b666c6f7754656d706c61746512412e676f6f676c652e636c6f7564" .
            "2e6461746170726f632e763162657461322e496e7374616e746961746557" .
            "6f726b666c6f7754656d706c617465526571756573741a1d2e676f6f676c" .
            "652e6c6f6e6772756e6e696e672e4f7065726174696f6e229d0182d3e493" .
            "02960122442f763162657461322f7b6e616d653d70726f6a656374732f2a" .
            "2f726567696f6e732f2a2f776f726b666c6f7754656d706c617465732f2a" .
            "7d3a696e7374616e74696174653a012a5a4b22462f763162657461322f7b" .
            "6e616d653d70726f6a656374732f2a2f6c6f636174696f6e732f2a2f776f" .
            "726b666c6f7754656d706c617465732f2a7d3a696e7374616e7469617465" .
            "3a012a12c5020a21496e7374616e7469617465496e6c696e65576f726b66" .
            "6c6f7754656d706c61746512472e676f6f676c652e636c6f75642e646174" .
            "6170726f632e763162657461322e496e7374616e7469617465496e6c696e" .
            "65576f726b666c6f7754656d706c617465526571756573741a1d2e676f6f" .
            "676c652e6c6f6e6772756e6e696e672e4f7065726174696f6e22b70182d3" .
            "e49302b001224a2f763162657461322f7b706172656e743d70726f6a6563" .
            "74732f2a2f726567696f6e732f2a7d2f776f726b666c6f7754656d706c61" .
            "7465733a696e7374616e7469617465496e6c696e653a0874656d706c6174" .
            "655a58224c2f763162657461322f7b706172656e743d70726f6a65637473" .
            "2f2a2f6c6f636174696f6e732f2a7d2f776f726b666c6f7754656d706c61" .
            "7465733a696e7374616e7469617465496e6c696e653a0874656d706c6174" .
            "6512af020a16557064617465576f726b666c6f7754656d706c617465123c" .
            "2e676f6f676c652e636c6f75642e6461746170726f632e76316265746132" .
            "2e557064617465576f726b666c6f7754656d706c61746552657175657374" .
            "1a2f2e676f6f676c652e636c6f75642e6461746170726f632e7631626574" .
            "61322e576f726b666c6f7754656d706c61746522a50182d3e493029e011a" .
            "412f763162657461322f7b74656d706c6174652e6e616d653d70726f6a65" .
            "6374732f2a2f726567696f6e732f2a2f776f726b666c6f7754656d706c61" .
            "7465732f2a7d3a0874656d706c6174655a4f1a432f763162657461322f7b" .
            "74656d706c6174652e6e616d653d70726f6a656374732f2a2f6c6f636174" .
            "696f6e732f2a2f776f726b666c6f7754656d706c617465732f2a7d3a0874" .
            "656d706c6174651292020a154c697374576f726b666c6f7754656d706c61" .
            "746573123b2e676f6f676c652e636c6f75642e6461746170726f632e7631" .
            "62657461322e4c697374576f726b666c6f7754656d706c61746573526571" .
            "756573741a3c2e676f6f676c652e636c6f75642e6461746170726f632e76" .
            "3162657461322e4c697374576f726b666c6f7754656d706c617465735265" .
            "73706f6e7365227e82d3e493027812382f763162657461322f7b70617265" .
            "6e743d70726f6a656374732f2a2f726567696f6e732f2a7d2f776f726b66" .
            "6c6f7754656d706c617465735a3c123a2f763162657461322f7b70617265" .
            "6e743d70726f6a656374732f2a2f6c6f636174696f6e732f2a7d2f776f72" .
            "6b666c6f7754656d706c6174657312ee010a1644656c657465576f726b66" .
            "6c6f7754656d706c617465123c2e676f6f676c652e636c6f75642e646174" .
            "6170726f632e763162657461322e44656c657465576f726b666c6f775465" .
            "6d706c617465526571756573741a162e676f6f676c652e70726f746f6275" .
            "662e456d707479227e82d3e49302782a382f763162657461322f7b6e616d" .
            "653d70726f6a656374732f2a2f726567696f6e732f2a2f776f726b666c6f" .
            "7754656d706c617465732f2a7d5a3c2a3a2f763162657461322f7b6e616d" .
            "653d70726f6a656374732f2a2f6c6f636174696f6e732f2a2f776f726b66" .
            "6c6f7754656d706c617465732f2a7d4284010a21636f6d2e676f6f676c65" .
            "2e636c6f75642e6461746170726f632e763162657461324216576f726b66" .
            "6c6f7754656d706c6174657350726f746f50015a45676f6f676c652e676f" .
            "6c616e672e6f72672f67656e70726f746f2f676f6f676c65617069732f63" .
            "6c6f75642f6461746170726f632f763162657461323b6461746170726f63" .
            "620670726f746f33"
        ));

        static::$is_initialized = true;
    }
}
