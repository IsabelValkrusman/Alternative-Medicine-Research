package com.isabel.medicaldictionary.data

object DiseaseInfo2 {

    fun getDiseaseSummary(name: String): Pair<String, List<Reference>> {
        return when (name) {

            "Indigestion" -> Pair(
                """
Alternative approaches
1. Yogic gut aeration techniques for H. pylori-induced acid peptic disease, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
2. Exosome-based therapy for skin complications in oncology patients, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
3. Acupuncture vs moxibustion for functional dyspepsia, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week.

Herbs
1. Ethnomedicinal plants for gastrointestinal disorders in Sahiwal, g.
2. Maslinic acid improves mitochondrial function in gastric smooth muscle, Positive/therapeutic effect mentioned.
3. Jianwei Xiaoshi oral liquid attenuates high-calorie diet-induced dyspepsia in rats, Positive/therapeutic effect mentioned.

Amino acids
1. Chemical composition of Galli Gigeriae Endothelium Corneum, G.
2. Vigna mungo: ethnobotanical and pharmacological profile, Positive/therapeutic effect mentioned.
3. Mentha haplocalyx (Mint): botany, nutritional value, phytochemistry, health benefits, Positive/therapeutic effect mentioned.

Vitamins
1. PPIs: indications, efficacy, harms, deprescribing, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
2. Vitamin D deficiency-linked digestive issues, No clear dose/effect/duration found.
3. Mixed immediate/delayed allergy to oral vitamin D, IU | Positive/therapeutic effect mentioned | month.

Minerals
1. Poliprotect in GERD and dyspepsia, Positive/therapeutic effect mentioned.
2. Mentha haplocalyx (Mint), Positive/therapeutic effect mentioned.
3. Nitraria tangutorum Bobrov.: morphology, resistance physiology, and use, Positive/therapeutic effect mentioned.

Supplements
1. Ceylon cinnamon, Negative/adverse effect mentioned.
2. Mixed allergy to oral vitamin D, IU | Positive/therapeutic effect mentioned | month.
3. Bifidobacterium breve BBr60 impact on metabolic & gastrointestinal health, Positive/therapeutic effect mentioned.

Nutrients
1. PPIs: indications, efficacy, harms, deprescribing, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
2. Impact of diet on functional dyspepsia, Positive/therapeutic effect mentioned.
3. FODMAP restriction diet in functional dyspepsia/postprandial distress syndrome, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.

Summary for readers
• Indigestion management includes alternative therapies, herbs, amino acids, vitamins, minerals, supplements, and dietary approaches.
• Some interventions show positive therapeutic effects, others indicate adverse effects or unclear dosing.
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("J Ayurveda Integr Med. 2025 Sep-Oct;16(5):101195", "👉 Yogic gut aeration techniques for H. pylori-induced acid peptic disease, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40925111"),
                    Reference("Pharmaceuticals (Basel). 2025 Jul 23;18(8):1090", "👉 Exosome-based therapy for skin complications in oncology patients, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40872483"),
                    Reference("Chin Med. 2025 Aug 22;20(1):131", "👉 Acupuncture vs moxibustion for functional dyspepsia, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week", "40847362"),

                    // Herbs
                    Reference("Sci Rep. 2025 Aug 21;15(1):30683", "👉 Ethnomedicinal plants for gastrointestinal disorders in Sahiwal, g", "40841421"),
                    Reference("Open Life Sci. 2025 Jan 27;20(1):20221036", "👉 Maslinic acid improves mitochondrial function in gastric smooth muscle, Positive/therapeutic effect mentioned", "39881825"),
                    Reference("Chin Med. 2025 Jan 4;20(1):6", "👉 Jianwei Xiaoshi oral liquid attenuates high-calorie diet-induced dyspepsia in rats, Positive/therapeutic effect mentioned", "39755683"),

                    // Amino acids
                    Reference("Front Chem. 2025 Jul 23;13:1644192", "👉 Chemical composition of Galli Gigeriae Endothelium Corneum, G", "40771715"),
                    Reference("Phytochem Rev. 2025 Apr;24(2):1119-1142", "👉 Vigna mungo: ethnobotanical and pharmacological profile, Positive/therapeutic effect mentioned", "40371400"),
                    Reference("Chin Med. 2024 Dec 12;19(1):168", "👉 Mentha haplocalyx (Mint): botany, nutritional value, phytochemistry, health benefits, Positive/therapeutic effect mentioned", "39663516"),

                    // Vitamins
                    Reference("Medicina (Kaunas). 2025 Aug 31;61(9):1569", "👉 PPIs: indications, efficacy, harms, deprescribing, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41010960"),
                    Reference("Cureus. 2025 Aug 8;17(8):e89598", "👉 Vitamin D deficiency-linked digestive issues, No clear dose/effect/duration found", "40926915"),
                    Reference("J Med Case Rep. 2025 Jul 15;19(1):344", "👉 Mixed immediate/delayed allergy to oral vitamin D, IU | Positive/therapeutic effect mentioned | month", "40665361"),

                    // Minerals
                    Reference("Int J Mol Sci. 2025 Jan 29;26(3):1181", "👉 Poliprotect in GERD and dyspepsia, Positive/therapeutic effect mentioned", "39940951"),
                    Reference("Chin Med. 2024 Dec 12;19(1):168", "👉 Mentha haplocalyx (Mint), Positive/therapeutic effect mentioned", "39663516"),
                    Reference("PeerJ. 2024 Aug 16;12:e17830", "👉 Nitraria tangutorum Bobrov.: morphology, resistance physiology, and use, Positive/therapeutic effect mentioned", "39161968"),

                    // Supplements
                    Reference("Cinnamon (LactMed®, 2025 Sep 15)", "👉 Ceylon cinnamon, Negative/adverse effect mentioned", "40986675"),
                    Reference("J Med Case Rep. 2025 Jul 15;19(1):344", "👉 Mixed allergy to oral vitamin D, IU | Positive/therapeutic effect mentioned | month", "40665361"),
                    Reference("Clin Nutr. 2025 Aug;51:349-361", "👉 Bifidobacterium breve BBr60 impact on metabolic & gastrointestinal health, Positive/therapeutic effect mentioned", "40652782"),

                    // Nutrients
                    Reference("Medicina (Kaunas). 2025 Aug 31;61(9):1569", "👉 PPIs: indications, efficacy, harms, deprescribing, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41010960"),
                    Reference("Proc Nutr Soc. 2025 Sep 18:1-9", "👉 Impact of diet on functional dyspepsia, Positive/therapeutic effect mentioned", "40964920"),
                    Reference("Gut. 2025 Aug 28:gutjnl-2024-334156", "👉 FODMAP restriction diet in functional dyspepsia/postprandial distress syndrome, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40876904")
                )
            )

            "Infertility" -> Pair(
                """
Alternative approaches
1. Myricetin in insulin resistance-associated PCOS in rats, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
2. Egg irradiation on Aedes aegypti mosquito vectors, G | Positive/therapeutic effect mentioned.
3. Exosomes from Wharton's Jelly MSCs + Etanercept for endometriosis, μg | Positive/therapeutic effect mentioned.

Herbs
1. Traditional practices for female infertility in Albaha City, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month.
2. TCM strategies for premature ovarian failure via AMPK/mTOR modulation, Positive/therapeutic effect mentioned.
3. Phytotherapy in PCOS management: systematic review, Negative/adverse effect mentioned.

Amino acids
1. Thyroid hormones and BMPs regulate steroidogenesis in granulosa cells, Negative/adverse effect mentioned.
2. Follicular fluid amino acid profile and embryo quality in PCOS, No clear dose/effect/duration found.
3. Inhibiting GLUT5 boosts testosterone in Leydig cells, g | Positive/therapeutic effect mentioned.

Vitamins
1. Initial vitamin D levels and IVF outcomes in PCOS, Positive/therapeutic effect mentioned.
2. Dietary vitamin C intake and female infertility, mg | Positive/therapeutic effect mentioned.
3. Antioxidant treatment improves chance to conceive in men, µg, g, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day, month.

Minerals
1. COL1A1 and TNFRSF11B variants affect bone mineral density in postmenopausal women, g | Positive/therapeutic effect mentioned.
2. Zinc, copper, selenium deficiencies in broodmares, Negative/adverse effect mentioned.
3. Bone mineralization after ART in children, No clear dose/effect/duration found.

Supplements
1. Vitamin C supplementation for female infertility, mg | Positive/therapeutic effect mentioned.
2. Antioxidants and chance to conceive in men, µg, g, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day, month.
3. Multiplex semen molecular profiling for male infertility, No clear dose/effect/duration found.

Nutrients
1. VLCKD prior to IVF in overweight/obese infertile women, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
2. Dietary polyphenol intake and semen quality, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
3. Antioxidants and micronutrients for male reproductive dysfunction, Positive/therapeutic effect mentioned.

Summary for readers
• Infertility-related interventions include diverse biological, herbal, and nutritional strategies.
• Many demonstrate potential therapeutic benefit; a few reveal adverse or unclear outcomes.
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Chem Biodivers. 2025 Sep 27:e02165", "👉 Myricetin in insulin resistance-associated PCOS in rats, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41014606"),
                    Reference("PLoS One. 2025 Sep 25;20(9):e0333297", "👉 Egg irradiation on Aedes aegypti mosquito vectors, G | Positive/therapeutic effect mentioned", "40997081"),
                    Reference("Curr Mol Med. 2025 Sep 22", "👉 Exosomes from Wharton's Jelly MSCs + Etanercept for endometriosis, μg | Positive/therapeutic effect mentioned", "40993922"),

                    // Herbs
                    Reference("Nurs Res Pract. 2025 Sep 3;2025:6934650", "👉 Traditional practices for female infertility in Albaha City, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month", "40937363"),
                    Reference("Biosci Trends. 2025 Aug 29", "👉 TCM strategies for premature ovarian failure via AMPK/mTOR modulation, Positive/therapeutic effect mentioned", "40887290"),
                    Reference("Chem Biodivers. 2025 Jul 15:e00982", "👉 Phytotherapy in PCOS management: systematic review, Negative/adverse effect mentioned", "40663739"),

                    // Amino acids
                    Reference("Int J Mol Sci. 2025 Sep 18;26(18):9127", "👉 Thyroid hormones and BMPs regulate steroidogenesis in granulosa cells, Negative/adverse effect mentioned", "41009688"),
                    Reference("Reprod Biol Endocrinol. 2025 Sep 24;23(1):123", "👉 Follicular fluid amino acid profile and embryo quality in PCOS, No clear dose/effect/duration found", "40993745"),
                    Reference("Mol Cell Endocrinol. 2025 Sep 12;610:112658", "👉 Inhibiting GLUT5 boosts testosterone in Leydig cells, g | Positive/therapeutic effect mentioned", "40947002"),

                    // Vitamins
                    Reference("Front Med (Lausanne). 2025 Sep 10;12:1589193", "👉 Initial vitamin D levels and IVF outcomes in PCOS, Positive/therapeutic effect mentioned", "41001383"),
                    Reference("Front Nutr. 2025 Sep 10;12:1650311", "👉 Dietary vitamin C intake and female infertility, mg | Positive/therapeutic effect mentioned", "41001130"),
                    Reference("JAMA Netw Open. 2025 Sep 2;8(9):e2532405", "👉 Antioxidant treatment improves chance to conceive in men, µg, g, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day, month", "40996763"),

                    // Minerals
                    Reference("Int J Mol Sci. 2025 Sep 12;26(18):8894", "👉 COL1A1 and TNFRSF11B variants affect bone mineral density in postmenopausal women, g | Positive/therapeutic effect mentioned", "41009461"),
                    Reference("Pol J Vet Sci. 2025 Sep;28(3):475-479", "👉 Zinc, copper, selenium deficiencies in broodmares, Negative/adverse effect mentioned", "40996122"),
                    Reference("Hum Reprod Open. 2025 Sep 11;2025(4):hoaf055", "👉 Bone mineralization after ART in children, No clear dose/effect/duration found", "40989217"),

                    // Supplements
                    Reference("Front Nutr. 2025 Sep 10;12:1650311", "👉 Vitamin C supplementation for female infertility, mg | Positive/therapeutic effect mentioned", "41001130"),
                    Reference("JAMA Netw Open. 2025 Sep 2;8(9):e2532405", "👉 Antioxidants and chance to conceive in men, µg, g, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day, month", "40996763"),
                    Reference("Arch Pathol Lab Med. 2025 Oct 1;149(10):896-897", "👉 Multiplex semen molecular profiling for male infertility, No clear dose/effect/duration found", "40992754"),

                    // Nutrients
                    Reference("Nutrients. 2025 Sep 11;17(18):2930", "👉 VLCKD prior to IVF in overweight/obese infertile women, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41010457"),
                    Reference("Nutrients. 2025 Aug 27;17(17):2785", "👉 Dietary polyphenol intake and semen quality, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40944174"),
                    Reference("Urologiia. 2025 Sep;(4):100-108", "👉 Antioxidants and micronutrients for male reproductive dysfunction, Positive/therapeutic effect mentioned", "40937803")
                )
            )

            "Influenza" -> Pair(
                """
Alternative approaches
1. Modified Vaccinia Ankara as surrogate for disinfectant testing against AIV, FMDV, ASFV, No clear dose/effect/duration found.
2. RT Recombinase-Aided Amplification Assay for Newcastle Disease Virus, Positive/therapeutic effect mentioned.
3. Novel disulfide-containing PD-1/PD-L1 inhibitor with in vivo influenza therapeutic efficacy, Negative/adverse effect mentioned.

Herbs
1. ML-assisted screening of neuraminidase inhibitors from medicinal herbs, No clear dose/effect/duration found.
2. ML integration reveals Cathepsin B as PANoptosis regulator in influenza, No clear dose/effect/duration found.
3. Fici hirtae radix alleviates influenza A-induced acute lung injury via TLR4-PI3K-AKT/p38 MAPK-NF-κB pathway, g | Positive/therapeutic effect mentioned.

Amino acids
1. Pantothenate kinase 4 controls lipid synthesis for T-cell proliferation, No clear dose/effect/duration found.
2. NS1 variant with effector domain deletion gains growth advantage in influenza, Positive/therapeutic effect mentioned.
3. Single amino acid substitution in SARS-CoV-2 Spike alters viral assembly and infectivity, G | Positive/therapeutic effect mentioned.

Vitamins
1. Routine immunisation coverage after seasonal influenza vaccine introduction in Kenyan children, Positive/therapeutic effect mentioned | month.
2. Oral nutritional supplements in preventing respiratory infections in adults, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day.
3. Serum 25-hydroxyvitamin D and respiratory infections in US preschool children, mcg | day.

Minerals
1. Immuno-SPME + photothermal imaging for rapid pathogen surveillance, G.
2. Fe-N(4)@Graphene nanozyme against Influenza A Virus, Positive/therapeutic effect mentioned.
3. Transcriptomic analysis of iron transport mutants in Salmonella, No clear dose/effect/duration found.

Supplements
1. Factors associated with seasonal influenza vaccination in adults in Poland, Positive/therapeutic effect mentioned.
2. Efficacy of portable air cleaner with 275-nm UVC-LED against airborne Coronavirus & Influenza, No clear dose/effect/duration found.
3. Routine influenza vaccination coverage in Kenyan children, Positive/therapeutic effect mentioned | month.

Nutrients
1. Viruses compromising blood-tissue barriers, No clear dose/effect/duration found.
2. Screening known pharmaceuticals & myxobacterial molecules for autophagy modulators, No clear dose/effect/duration found.
3. Geroscience translational review, Positive/therapeutic effect mentioned | day.

Summary for readers
• Influenza research spans pharmacological, herbal, and nutritional interventions.
• Positive effects reported for vaccination, nanozyme, and herbal extracts.
• Duration and dose often unspecified; preventive immunisation remains key.
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Viruses. 2025 Aug 23;17(9):1156", "👉 Modified Vaccinia Ankara as surrogate for disinfectant testing against AIV, FMDV, ASFV, No clear dose/effect/duration found", "41012584"),
                    Reference("Pathogens. 2025 Sep 1;14(9):867", "👉 RT Recombinase-Aided Amplification Assay for Newcastle Disease Virus, Positive/therapeutic effect mentioned", "41011768"),
                    Reference("Sci Rep. 2025 Sep 26;15(1):32998", "👉 Novel disulfide-containing PD-1/PD-L1 inhibitor with in vivo influenza therapeutic efficacy, Negative/adverse effect mentioned", "41006573"),

                    // Herbs
                    Reference("Anal Chim Acta. 2025 Nov 8;1374:344522", "👉 ML-assisted screening of neuraminidase inhibitors from medicinal herbs, No clear dose/effect/duration found", "40983409"),
                    Reference("Int J Mol Sci. 2025 Sep 2;26(17):8533", "👉 ML integration reveals Cathepsin B as PANoptosis regulator in influenza, No clear dose/effect/duration found", "40943452"),
                    Reference("J Ethnopharmacol. 2025 Sep 1;354:120522", "👉 Fici hirtae radix alleviates influenza A-induced acute lung injury via TLR4-PI3K-AKT/p38 MAPK-NF-κB pathway, g | Positive/therapeutic effect mentioned", "40902813"),

                    // Amino acids
                    Reference("Signal Transduct Target Ther. 2025 Sep 18;10(1):302", "👉 Pantothenate kinase 4 controls lipid synthesis for T-cell proliferation, No clear dose/effect/duration found", "40962808"),
                    Reference("Emerg Microbes Infect. 2025 Dec;14(1):2556731", "👉 NS1 variant with effector domain deletion gains growth advantage in influenza, Positive/therapeutic effect mentioned", "40899958"),
                    Reference("Virus Res. 2025 Oct;360:199624", "👉 Single amino acid substitution in SARS-CoV-2 Spike alters viral assembly and infectivity, G | Positive/therapeutic effect mentioned", "40850343"),

                    // Vitamins
                    Reference("Lancet Glob Health. 2025 Oct;13(10):e1737-e1749", "👉 Routine immunisation coverage after seasonal influenza vaccine introduction in Kenyan children, Positive/therapeutic effect mentioned | month", "40975081"),
                    Reference("EClinicalMedicine. 2025 Sep 2;88:103479", "👉 Oral nutritional supplements in preventing respiratory infections in adults, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day", "40969681"),
                    Reference("Eur J Pediatr. 2025 Sep 11;184(10):610", "👉 Serum 25-hydroxyvitamin D and respiratory infections in US preschool children, mcg | day", "40936023"),

                    // Minerals
                    Reference("Anal Chem. 2025 Sep 23;97(37):20602-20610", "👉 Immuno-SPME + photothermal imaging for rapid pathogen surveillance, G", "40932402"),
                    Reference("ACS Appl Mater Interfaces. 2025 Sep 17;17(37):51578-51587", "👉 Fe-N(4)@Graphene nanozyme against Influenza A Virus, Positive/therapeutic effect mentioned", "40906665"),
                    Reference("Can J Microbiol. 2025 Aug 29", "👉 Transcriptomic analysis of iron transport mutants in Salmonella, No clear dose/effect/duration found", "40882224"),

                    // Supplements
                    Reference("Vaccines (Basel). 2025 Sep 6;13(9):954", "👉 Factors associated with seasonal influenza vaccination in adults in Poland, Positive/therapeutic effect mentioned", "41012157"),
                    Reference("GMS Hyg Infect Control. 2025 Aug 15;20:Doc44", "👉 Efficacy of portable air cleaner with 275-nm UVC-LED against airborne Coronavirus & Influenza, No clear dose/effect/duration found", "40979864"),
                    Reference("Lancet Glob Health. 2025 Oct;13(10):e1737-e1749", "👉 Routine influenza vaccination coverage in Kenyan children, Positive/therapeutic effect mentioned | month", "40975081"),

                    // Nutrients
                    Reference("Tissue Barriers. 2025 Aug 30:2549020", "👉 Viruses compromising blood-tissue barriers, No clear dose/effect/duration found", "40884531"),
                    Reference("FEBS J. 2025 Aug 28", "👉 Screening known pharmaceuticals & myxobacterial molecules for autophagy modulators, No clear dose/effect/duration found", "40875533"),
                    Reference("JAMA. 2025 Sep 23;334(12):1094-1102", "👉 Geroscience translational review, Positive/therapeutic effect mentioned | day", "40773213")
                )
            )

            "Insomnia" -> Pair(
                """
Alternative approaches
1. Integrating exercise and medication management in geriatric care, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
2. Evaluating reduced cognitive flexibility as link between insomnia and future depression, Positive/therapeutic effect mentioned.
3. Melatonergic receptor agonists & selected herbs in insomnia treatment, Negative/adverse effect mentioned.

Herbs
1. Melatonergic receptor agonists & selected herbs in insomnia treatment, Negative/adverse effect mentioned.
2. Depression syndrome typing & medication pattern analysis via clustering, No clear dose/effect/duration found.
3. Multi-target mechanisms of Artemisia absinthium L. Essential Oil against depression, mg, μg | Positive/therapeutic effect mentioned.

Amino acids
1. Fermented Moringa oleifera leaves extracts’ impact on mouse sleep, μg | Positive/therapeutic effect mentioned.
2. Ziwuliuzhu acupuncture modulates Glu/GABA‑Gln metabolic loop in insomniac rats, g | day.
3. Branched-chain amino acids combined with exercise improves physical function & QoL in older adults, mg | Positive/therapeutic effect mentioned | week.

Vitamins
1. Mercury exposure leading to functional vitamin B12 deficiency, μg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month.
2. Causal factors for migraine in Mendelian randomization studies, g | Positive/therapeutic effect mentioned.
3. Multimodal approach for managing severe psoriasis leveraging natural therapies, Positive/therapeutic effect mentioned.

Minerals
1. Insomnia association with fatigue & mood in postmenopausal osteoporosis, Positive/therapeutic effect mentioned.
2. Engineered vesicles for transdermal-intestinal cinnabar delivery in insomnia, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
3. Multimodal approach for managing severe psoriasis leveraging natural therapies, Positive/therapeutic effect mentioned.

Supplements
1. FemmeBalance supplement effects on premenstrual syndrome symptoms, Positive/therapeutic effect mentioned.
2. Personalized melatonin supplement interventions for poor sleep, mg | Positive/therapeutic effect mentioned.
3. Sleep disorders: comparison of ICD-11 and ICD-10, Positive/therapeutic effect mentioned.

Nutrients
1. Methylsulfonylmethane mitigates neurobehavioral impairment & oxidative stress in circadian-disrupted mice, Positive/therapeutic effect mentioned.
2. Associations of MIND Diet with human health outcomes, Positive/therapeutic effect mentioned.
3. Caregivers' awareness & practices on ketogenic diet adherence in children with refractory epilepsy, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.

Summary for readers
• Insomnia management spans pharmacological, herbal, nutritional, and lifestyle interventions.
• Positive effects reported for exercise, amino acids, and targeted supplements.
• Dose and duration often variable; multi-modal approaches recommended.
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Lancet Healthy Longev. 2025 Sep 24:100763", "👉 Integrating exercise and medication management in geriatric care, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41015054"),
                    Reference("Sleep Med. 2025 Sep 23;136:106824", "👉 Evaluating reduced cognitive flexibility as link between insomnia and future depression, Positive/therapeutic effect mentioned", "41014697"),
                    Reference("Molecules. 2025 Sep 19;30(18):3814", "👉 Melatonergic receptor agonists & selected herbs in insomnia treatment, Negative/adverse effect mentioned", "41011705"),

                    // Herbs
                    Reference("Molecules. 2025 Sep 19;30(18):3814", "👉 Melatonergic receptor agonists & selected herbs in insomnia treatment, Negative/adverse effect mentioned", "41011705"),
                    Reference("Sichuan Da Xue Xue Bao Yi Xue Ban. 2025 May 20;56(3):656-664", "👉 Depression syndrome typing & medication pattern analysis via clustering, No clear dose/effect/duration found", "40964125"),
                    Reference("J Ethnopharmacol. 2025 Sep 25;353(Pt A):120308", "👉 Multi-target mechanisms of Artemisia absinthium L. Essential Oil against depression, mg, μg | Positive/therapeutic effect mentioned", "40684821"),

                    // Amino acids
                    Reference("Foods. 2025 Aug 25;14(17):2952", "👉 Fermented Moringa oleifera leaves extracts’ impact on mouse sleep, μg | Positive/therapeutic effect mentioned", "40941068"),
                    Reference("Nan Fang Yi Ke Da Xue Xue Bao. 2025 Aug 20;45(8):1616-1624", "👉 Ziwuliuzhu acupuncture modulates Glu/GABA‑Gln metabolic loop in insomniac rats, g | day", "40916523"),
                    Reference("Dietetics (Basel). 2025 Sep;4(3):32", "👉 Branched-chain amino acids combined with exercise improves physical function & QoL in older adults, mg | Positive/therapeutic effect mentioned | week", "40860958"),

                    // Vitamins
                    Reference("Front Toxicol. 2025 Sep 9;7:1580275", "👉 Mercury exposure leading to functional vitamin B12 deficiency, μg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month", "40995338"),
                    Reference("Front Neurol. 2025 Sep 9;16:1660995", "👉 Causal factors for migraine in Mendelian randomization studies, g | Positive/therapeutic effect mentioned", "40994718"),
                    Reference("Life (Basel). 2025 Jul 25;15(8):1186", "👉 Multimodal approach for managing severe psoriasis leveraging natural therapies, Positive/therapeutic effect mentioned", "40868834"),

                    // Minerals
                    Reference("Rev Assoc Med Bras (1992). 2025 Sep 19;71(8):e20250426", "👉 Insomnia association with fatigue & mood in postmenopausal osteoporosis, Positive/therapeutic effect mentioned", "40990750"),
                    Reference("Mater Today Bio. 2025 Sep 2;34:102277", "👉 Engineered vesicles for transdermal-intestinal cinnabar delivery in insomnia, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40977841"),
                    Reference("Life (Basel). 2025 Jul 25;15(8):1186", "👉 Multimodal approach for managing severe psoriasis leveraging natural therapies, Positive/therapeutic effect mentioned", "40868834"),

                    // Supplements
                    Reference("Life (Basel). 2025 Sep 17;15(9):1454", "👉 FemmeBalance supplement effects on premenstrual syndrome symptoms, Positive/therapeutic effect mentioned", "41010396"),
                    Reference("JMIR Form Res. 2025 Sep 26;9:e58192", "👉 Personalized melatonin supplement interventions for poor sleep, mg | Positive/therapeutic effect mentioned", "41004640"),
                    Reference("Nervenarzt. 2025 Sep 18", "👉 Sleep disorders: comparison of ICD-11 and ICD-10, Positive/therapeutic effect mentioned", "40965652"),

                    // Nutrients
                    Reference("Neurochem Res. 2025 Sep 12;50(5):299", "👉 Methylsulfonylmethane mitigates neurobehavioral impairment & oxidative stress in circadian-disrupted mice, Positive/therapeutic effect mentioned", "40938468"),
                    Reference("Nutrients. 2025 Aug 20;17(16):2687", "👉 Associations of MIND Diet with human health outcomes, Positive/therapeutic effect mentioned", "40871715"),
                    Reference("Nutrients. 2025 Aug 11;17(16):2605", "👉 Caregivers' awareness & practices on ketogenic diet adherence in children with refractory epilepsy, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40871633")
                )
            )

            "Irritable bowel syndrome" -> Pair(
                """
Alternative approaches
1. Overview of IBS as a chronic gut-brain disorder, Positive/therapeutic effect mentioned.
2. Spirulina lipid nanotechnology system for oral drug delivery, No clear dose/effect/duration found.
3. Panenteric capsule endoscopy in young patients with suspected IBS, month.

Herbs
1. Bile acids and intestinal epithelium: roles of FXR & TGR5, No clear dose/effect/duration found.
2. Gegen Qinlian Decoction attenuates colitis-associated colorectal cancer, g | Positive/therapeutic effect mentioned.
3. TLR4 role in IBS: scoping review, Positive/therapeutic effect mentioned.

Amino acids
1. Probiotic administration of Bifidobacterium animalis & Lactiplantibacillus plantarum in IBS-D rats, Positive/therapeutic effect mentioned | week.
2. Manual acupuncture effects on fatty acid metabolism in IBS-D rats, Positive/therapeutic effect mentioned | week.
3. Gut microbiome assessment in IBS and chronic fatigue syndrome patients, No clear dose/effect/duration found.

Vitamins
1. Nutritional influences on serotonergic system, G,G.
2. Regulation of intestinal permeability: possible therapeutic applications, No clear dose/effect/duration found.
3. Vitamin D deficiency-linked digestive issues, No clear dose/effect/duration found.

Minerals
1. Spirulina supplementation on QoL & IBS-C parameters, mg | Positive/therapeutic effect mentioned | week.
2. FODMAP profile of wholegrain pasta, No clear dose/effect/duration found.
3. Clinoptilolite in refractory chronic diarrhea, mg | Positive/therapeutic effect mentioned | week.

Supplements
1. Curcumin for depression or anxiety induced by chronic disease, Positive/therapeutic effect mentioned.
2. Cricket chitin in adults with IBS: randomized crossover pilot trial, g | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day.
3. Narrative review of IBS evolution as a group of organic diseases, No clear dose/effect/duration found.

Nutrients
1. Dietary modifications in IBS reduce symptoms, weight, and lipid levels, Positive/therapeutic effect mentioned.
2. Nutritional influences on serotonergic system, G,G.
3. Dietary nutrient patterns and IBS: multicenter case-control study, Positive/therapeutic effect mentioned.

Summary for readers
• IBS management involves diet, probiotics, herbs, and lifestyle interventions.
• Positive effects seen with probiotics, Spirulina, and dietary modifications.
• Dose and duration are often variable; personalized approaches recommended.
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("StatPearls. 2025 Sep 15", "👉 Overview of IBS as a chronic gut-brain disorder, Positive/therapeutic effect mentioned", "30521231"),
                    Reference("Adv Sci (Weinh). 2025 Sep 12:e09731", "👉 Spirulina lipid nanotechnology system for oral drug delivery, No clear dose/effect/duration found", "40940687"),
                    Reference("Clin Exp Gastroenterol. 2025 Sep 6;18:205-213", "👉 Panenteric capsule endoscopy in young patients with suspected IBS, month", "40937048"),

                    // Herbs
                    Reference("Int J Mol Sci. 2025 Apr 29;26(9):4240", "👉 Bile acids and intestinal epithelium: roles of FXR & TGR5, No clear dose/effect/duration found", "40362481"),
                    Reference("Pharmaceuticals (Basel). 2024 Dec 25;18(1):12", "👉 Gegen Qinlian Decoction attenuates colitis-associated colorectal cancer, g | Positive/therapeutic effect mentioned", "39861077"),
                    Reference("Front Immunol. 2024 Dec 19;15:1490653", "👉 TLR4 role in IBS: scoping review, Positive/therapeutic effect mentioned", "39749341"),

                    // Amino acids
                    Reference("J Sci Food Agric. 2025 Sep 26", "👉 Probiotic administration of Bifidobacterium animalis & Lactiplantibacillus plantarum in IBS-D rats, Positive/therapeutic effect mentioned | week", "41002283"),
                    Reference("Acupunct Med. 2025 Aug;43(4):218-232", "👉 Manual acupuncture effects on fatty acid metabolism in IBS-D rats, Positive/therapeutic effect mentioned | week", "40778736"),
                    Reference("Nutrients. 2025 Jul 5;17(13):2232", "👉 Gut microbiome assessment in IBS and chronic fatigue syndrome patients, No clear dose/effect/duration found", "40647335"),

                    // Vitamins
                    Reference("Adv Nutr. 2025 Sep 23:100524", "👉 Nutritional influences on serotonergic system, G,G", "40998119"),
                    Reference("Arch Med Res. 2025 Sep 17;57(3):103321", "👉 Regulation of intestinal permeability: possible therapeutic applications, No clear dose/effect/duration found", "40967091"),
                    Reference("Cureus. 2025 Aug 8;17(8):e89598", "👉 Vitamin D deficiency-linked digestive issues, No clear dose/effect/duration found", "40926915"),

                    // Minerals
                    Reference("BMJ Open. 2025 Apr 22;15(4):e086521", "👉 Spirulina supplementation on QoL & IBS-C parameters, mg | Positive/therapeutic effect mentioned | week", "40262961"),
                    Reference("Foods. 2025 Feb 16;14(4):667", "👉 FODMAP profile of wholegrain pasta, No clear dose/effect/duration found", "40002111"),
                    Reference("Clin Ter. 2025 Jan-Feb;176(1):6-12", "👉 Clinoptilolite in refractory chronic diarrhea, mg | Positive/therapeutic effect mentioned | week", "39957445"),

                    // Supplements
                    Reference("Front Pharmacol. 2025 Aug 22;16:1638645", "👉 Curcumin for depression or anxiety induced by chronic disease, Positive/therapeutic effect mentioned", "40918536"),
                    Reference("Food Funct. 2025 Sep 15;16(18):7434-7454", "👉 Cricket chitin in adults with IBS: randomized crossover pilot trial, g | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day", "40891151"),
                    Reference("Expert Rev Gastroenterol Hepatol. 2025 Sep;19(9):1007-1020", "👉 Narrative review of IBS evolution as a group of organic diseases, No clear dose/effect/duration found", "40823787"),

                    // Nutrients
                    Reference("Nutrients. 2025 Sep 16;17(18):2966", "👉 Dietary modifications in IBS reduce symptoms, weight, and lipid levels, Positive/therapeutic effect mentioned", "41010496"),
                    Reference("Adv Nutr. 2025 Sep 23:100524", "👉 Nutritional influences on serotonergic system, G,G", "40998119"),
                    Reference("Food Sci Nutr. 2025 Aug 19;13(8):e70742", "👉 Dietary nutrient patterns and IBS: multicenter case-control study, Positive/therapeutic effect mentioned", "40842669")
                )
            )

            "Irritable hip" -> Pair(
                """
Alternative approaches
1. Low FODMAP diet in adolescents in a non-guided setting, Negative/adverse effect mentioned | week.
2. SLC6A3-related dopamine transporter deficiency syndrome, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month.
3. Heterogeneity of pediatric knee infections: retrospective analysis, No clear dose/effect/duration found.

Herbs
- No entries found.

Amino acids
1. Hip pain as initial presentation for varicella-zoster infection, No clear dose/effect/duration found.

Vitamins
1. Nutrition education on premenstrual syndrome, g, mg | Positive/therapeutic effect mentioned | day, month.
2. Hip involvement in pediatric scurvy: early MRI signs, month.
3. Aromatic L-amino acid decarboxylase deficiency, Positive/therapeutic effect mentioned | month.

Minerals
1. Musculoskeletal side effects with long-term anti-ulcerant therapy, Negative/adverse effect mentioned.
2. Chronic multisymptom illness in Gulf War veterans, G,G.
3. Serum mineral status and climacteric symptoms before/after yoga therapy, Positive/therapeutic effect mentioned | week.

Supplements
1. Alteration of intestinal microflora reduces bloating and pain, g | Positive/therapeutic effect mentioned.

Nutrients
1. Nutrition education on premenstrual syndrome, g, mg | Positive/therapeutic effect mentioned | day, month.
2. Association of PMS with adiposity and nutrient intake, No clear dose/effect/duration found.

Summary for readers
• Irritable hip studies are limited; most interventions focus on nutrition, supplementation, and monitoring.
• Positive effects reported for vitamins, minerals, and microbiome interventions.
• Dose and duration often unclear; careful clinical evaluation advised.
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Eur J Pediatr. 2025 Feb 11;184(2):189", "👉 Low FODMAP diet in adolescents in a non-guided setting, Negative/adverse effect mentioned | week", "39934502"),
                    Reference("GeneReviews. 2017 Jul 27 [updated 2023 Sep 28]", "👉 SLC6A3-related dopamine transporter deficiency syndrome, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month", "28749637"),
                    Reference("J Pediatr Orthop. 2020 Jul;40(6):314-321", "👉 Heterogeneity of pediatric knee infections: retrospective analysis, No clear dose/effect/duration found", "32501930"),

                    // Herbs
                    // No entries

                    // Amino acids
                    Reference("Orthopedics. 2011 Jan 3;34(1):51", "👉 Hip pain as initial presentation for varicella-zoster infection, No clear dose/effect/duration found", "21210614"),

                    // Vitamins
                    Reference("Nutr Health. 2025 Sep 26", "👉 Nutrition education on premenstrual syndrome, g, mg | Positive/therapeutic effect mentioned | day, month", "41004653"),
                    Reference("Children (Basel). 2025 May 16;12(5):642", "👉 Hip involvement in pediatric scurvy: early MRI signs, month", "40426821"),
                    Reference("GeneReviews. 2023 Oct 12 [updated 2025 Jan 23]", "👉 Aromatic L-amino acid decarboxylase deficiency, Positive/therapeutic effect mentioned | month", "37824694"),

                    // Minerals
                    Reference("Toxicol Rep. 2022 Sep 17;9:1796-1805", "👉 Musculoskeletal side effects with long-term anti-ulcerant therapy, Negative/adverse effect mentioned", "36518456"),
                    Reference("Am J Med. 2019 Apr;132(4):510-518", "👉 Chronic multisymptom illness in Gulf War veterans, G,G", "30576630"),
                    Reference("J Midlife Health. 2013 Oct;4(4):225-229", "👉 Serum mineral status and climacteric symptoms before/after yoga therapy, Positive/therapeutic effect mentioned | week", "24381464"),

                    // Supplements
                    Reference("Am J Gastroenterol. 2000 May;95(5):1231-1238", "👉 Alteration of intestinal microflora reduces bloating and pain, g | Positive/therapeutic effect mentioned", "10811333"),

                    // Nutrients
                    Reference("Nutr Health. 2025 Sep 26", "👉 Nutrition education on premenstrual syndrome, g, mg | Positive/therapeutic effect mentioned | day, month", "41004653"),
                    Reference("Int J Womens Health. 2022 May 4;14:665-675", "👉 Association of PMS with adiposity and nutrient intake, No clear dose/effect/duration found", "35547840")
                )
            )

            "Kidney stones" -> Pair(
                """
Alternative approaches
1. "Gun-holding" surgical posture vs conventional posture in flexible ureteroscopy, Positive/therapeutic effect mentioned | day.
2. Mediterranean diet adherence and risk of kidney stones, No clear dose/effect/duration found.
3. Citrate and calcium kidney stones, Positive/therapeutic effect mentioned.

Herbs
1. Lygodium japonicum polysaccharides inhibit calcium oxalate renal stone formation, Positive/therapeutic effect mentioned.
2. Active compounds for nephrolithiasis from herbal medicines, Negative/adverse effect mentioned.
3. Kukoamine A alleviates nephrolithiasis by inhibiting oxalate synthesis, Positive/therapeutic effect mentioned.

Amino acids
1. Organophosphorus pesticide exposure & kidney stones, g | Positive/therapeutic effect mentioned.
2. Tiopronin therapy in pediatric cystinuria, mg | Positive/therapeutic effect mentioned | month.
3. Tip-Flexible ureteral access sheath in cystine stone surgery, Positive/therapeutic effect mentioned.

Vitamins
1. Paget's disease & normocalcemic hyperparathyroidism, mg | month.
2. CaOx crystal nuclei formation in rat tubules, No clear dose/effect/duration found.
3. Late onset nephrocalcinosis & nephrolithiasis with CYP24A1 variant, No clear dose/effect/duration found.

Minerals
1. Cross-linked chitosan/hyaluronic acid hydrogel for kidney stone fragment removal, No clear dose/effect/duration found.
2. Paget's disease & normocalcemic hyperparathyroidism, mg | month.
3. Citrate and calcium kidney stones, Positive/therapeutic effect mentioned.

Supplements
1. Paget's disease & normocalcemic hyperparathyroidism, mg | month.
2. Late onset nephrocalcinosis & nephrolithiasis with CYP24A1 variant, No clear dose/effect/duration found.
3. Boron supplementation in nephrolithiasis, mg | Positive/therapeutic effect mentioned | week.

Nutrients
1. Flavonoid intake and kidney stones, mg, mg.
2. Ultrasonic-assisted extraction of polysaccharides from Rubia cordifolia, Positive/therapeutic effect mentioned.
3. Bicarbonate mineral water & acid-base balance, mg | Positive/therapeutic effect mentioned.

Summary for readers
• Kidney stone management includes surgical techniques, dietary modifications, herbal remedies, and nutrient supplementation.
• Positive effects reported for posture-guided surgery, herbal extracts, citrate therapy, and mineral supplementation.
• Dose and duration are often unspecified; personalized management and preventive strategies are recommended.
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("World J Urol. 2025 Sep 26;43(1):578", "👉 'Gun-holding' surgical posture vs conventional posture in flexible ureteroscopy, Positive/therapeutic effect mentioned | day", "41003788"),
                    Reference("Medicine (Baltimore). 2025 Sep 19;104(38):e44653", "👉 Mediterranean diet adherence and risk of kidney stones, No clear dose/effect/duration found", "40988191"),
                    Reference("Clin Kidney J. 2025 Aug 4;18(9):sfaf244", "👉 Citrate and calcium kidney stones, Positive/therapeutic effect mentioned", "40978115"),

                    // Herbs
                    Reference("Phytomedicine. 2025 Jul;142:156734", "👉 Lygodium japonicum polysaccharides inhibit calcium oxalate renal stone formation, Positive/therapeutic effect mentioned", "40318530"),
                    Reference("J Ethnopharmacol. 2025 May 28;348:119846", "👉 Active compounds for nephrolithiasis from herbal medicines, Negative/adverse effect mentioned", "40280373"),
                    Reference("Phytomedicine. 2024 Dec;135:156145", "👉 Kukoamine A alleviates nephrolithiasis by inhibiting oxalate synthesis, Positive/therapeutic effect mentioned", "39461201"),

                    // Amino acids
                    Reference("Medicine (Baltimore). 2025 Jul 11;104(28):e43227", "👉 Organophosphorus pesticide exposure & kidney stones, g | Positive/therapeutic effect mentioned", "40660508"),
                    Reference("Urolithiasis. 2025 May 30;53(1):103", "👉 Tiopronin therapy in pediatric cystinuria, mg | Positive/therapeutic effect mentioned | month", "40445369"),
                    Reference("Am J Case Rep. 2025 May 12;26:e946800", "👉 Tip-Flexible ureteral access sheath in cystine stone surgery, Positive/therapeutic effect mentioned", "40354280"),

                    // Vitamins
                    Reference("Reports (MDPI). 2025 Sep 17;8(3):180", "👉 Paget's disease & normocalcemic hyperparathyroidism, mg | month", "40981138"),
                    Reference("PLoS One. 2025 Sep 9;20(9):e0328721", "👉 CaOx crystal nuclei formation in rat tubules, No clear dose/effect/duration found", "40924792"),
                    Reference("J Rare Dis (Berlin). 2025;4(1):53", "👉 Late onset nephrocalcinosis & nephrolithiasis with CYP24A1 variant, No clear dose/effect/duration found", "40917505"),

                    // Minerals
                    Reference("ACS Appl Bio Mater. 2025 Sep 25", "👉 Cross-linked chitosan/hyaluronic acid hydrogel for kidney stone fragment removal, No clear dose/effect/duration found", "40999747"),
                    Reference("Reports (MDPI). 2025 Sep 17;8(3):180", "👉 Paget's disease & normocalcemic hyperparathyroidism, mg | month", "40981138"),
                    Reference("Clin Kidney J. 2025 Aug 4;18(9):sfaf244", "👉 Citrate and calcium kidney stones, Positive/therapeutic effect mentioned", "40978115"),

                    // Supplements
                    Reference("Reports (MDPI). 2025 Sep 17;8(3):180", "👉 Paget's disease & normocalcemic hyperparathyroidism, mg | month", "40981138"),
                    Reference("J Rare Dis (Berlin). 2025;4(1):53", "👉 Late onset nephrocalcinosis & nephrolithiasis with CYP24A1 variant, No clear dose/effect/duration found", "40917505"),
                    Reference("Food Sci Nutr. 2025 Aug 11;13(8):e70777", "👉 Boron supplementation in nephrolithiasis, mg | Positive/therapeutic effect mentioned | week", "40792045"),

                    // Nutrients
                    Reference("J Nutr Biochem. 2025 Sep 16;110117", "👉 Flavonoid intake and kidney stones, mg, mg", "40967377"),
                    Reference("Ultrason Sonochem. 2025 Sep;120:107502", "👉 Ultrasonic-assisted extraction of polysaccharides from Rubia cordifolia, Positive/therapeutic effect mentioned", "40784174"),
                    Reference("Nutrients. 2025 Jul 10;17(14):2291", "👉 Bicarbonate mineral water & acid-base balance, mg | Positive/therapeutic effect mentioned", "40732916")
                )
            )

            "Knee pain" -> Pair(
                """
Alternative approaches
1. Wearable focal vibration therapy on gait and mobility in people with MS, Positive/therapeutic effect mentioned | week, day.
2. Short-term outcomes in kinematic vs mechanical alignment total knee arthroplasty, Positive/therapeutic effect mentioned.
3. Microfragmented adipose tissue vs platelet-rich plasma for knee OA, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month.

Herbs
1. Epigenetics and herbs for knee OA, No clear dose/effect/duration found.
2. External Chinese herbal therapy + pulse electromagnetic field in older adults with knee OA, Positive/therapeutic effect mentioned | week.
3. Wangbi Tablets against knee OA, Positive/therapeutic effect mentioned.

Amino acids
1. Essential amino acid supplementation in knee OA, g | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week.
2. Plasma amino acids reflect cartilage loss, pain, and function in TKA patients, Positive/therapeutic effect mentioned.
3. Pantothenic acid alleviates OA progression via SIRT1/Nrf2, Positive/therapeutic effect mentioned.

Vitamins
1. Hypovitaminosis D in TJA patients, No clear dose/effect/duration found.
2. Vitamin C prophylaxis against CRPS recurrence in TKA, g | Positive/therapeutic effect mentioned | day.
3. Comparative effectiveness of nutritional supplements in knee OA, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.

Minerals
1. Distal femur subchondral bone mineral density in cadavers, No clear dose/effect/duration found.
2. Teriparatide therapeutic effects on subchondral bone lesions & pain in OA rat model, Positive/therapeutic effect mentioned | week.
3. Mouse model of osteoarticular infection, Positive/therapeutic effect mentioned.

Supplements
1. Low-molecular-weight collagen peptides in knee OA, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day.
2. Hypovitaminosis D in TJA patients, No clear dose/effect/duration found.
3. Essential amino acid supplementation in knee OA, g | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week.

Nutrients
1. Anti-inflammatory diet in OA, Positive/therapeutic effect mentioned.
2. Essential amino acid supplementation in knee OA, g | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week.
3. Nutritional supplements network meta-analysis in knee OA, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.

Summary for readers
• Knee pain and osteoarthritis management involves pharmacological, dietary, and physical interventions.
• Positive effects are reported for vibration therapy, herbal remedies, amino acid and vitamin supplementation.
• Dose and duration are often unspecified; individualized treatment plans and multimodal approaches are recommended.
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Bioengineering (Basel). 2025 Aug 29;12(9):932", "👉 Wearable focal vibration therapy on gait and mobility in people with MS, Positive/therapeutic effect mentioned | week, day", "41007175"),
                    Reference("Clin Pract. 2025 Aug 31;15(9):162", "👉 Short-term outcomes in kinematic vs mechanical alignment total knee arthroplasty, Positive/therapeutic effect mentioned", "41002777"),
                    Reference("Am J Sports Med. 2025 Sep 24:3635465251337759", "👉 Microfragmented adipose tissue vs platelet-rich plasma for knee OA, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month", "40990578"),

                    // Herbs
                    Reference("J Pain Res. 2025 Jun 26;18:3217-3261", "👉 Epigenetics and herbs for knee OA, No clear dose/effect/duration found", "40590047"),
                    Reference("Front Med (Lausanne). 2025 May 22;12:1498622", "👉 External Chinese herbal therapy + pulse electromagnetic field in older adults with knee OA, Positive/therapeutic effect mentioned | week", "40475957"),
                    Reference("Zhongguo Zhong Yao Za Zhi. 2024 Jul;49(14):3924-3935", "👉 Wangbi Tablets against knee OA, Positive/therapeutic effect mentioned", "39099366"),

                    // Amino acids
                    Reference("Cureus. 2025 Aug 7;17(8):e89582", "👉 Essential amino acid supplementation in knee OA, g | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week", "40926923"),
                    Reference("Cartilage. 2025 Aug 10:19476035251360189", "👉 Plasma amino acids reflect cartilage loss, pain, and function in TKA patients, Positive/therapeutic effect mentioned", "40785121"),
                    Reference("Chem Biol Interact. 2025 May 25;413:111494", "👉 Pantothenic acid alleviates OA progression via SIRT1/Nrf2, Positive/therapeutic effect mentioned", "40157627"),

                    // Vitamins
                    Reference("J Arthroplasty. 2025 Sep 17:S0883-5403(25)01183-0", "👉 Hypovitaminosis D in TJA patients, No clear dose/effect/duration found", "40972989"),
                    Reference("J Bone Joint Surg Am. 2025 Sep 9", "👉 Vitamin C prophylaxis against CRPS recurrence in TKA, g | Positive/therapeutic effect mentioned | day", "40924823"),
                    Reference("Nutrients. 2025 Aug 3;17(15):2547", "👉 Comparative effectiveness of nutritional supplements in knee OA, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40806131"),

                    // Minerals
                    Reference("J Orthop. 2025 Aug 9;69:283-287", "👉 Distal femur subchondral bone mineral density in cadavers, No clear dose/effect/duration found", "40832622"),
                    Reference("Osteoarthr Cartil Open. 2025 Jul 24;7(3):100655", "👉 Teriparatide therapeutic effects on subchondral bone lesions & pain in OA rat model, Positive/therapeutic effect mentioned | week", "40809545"),
                    Reference("JBMR Plus. 2025 May 19;9(9):ziaf093", "👉 Mouse model of osteoarticular infection, Positive/therapeutic effect mentioned", "40800669"),

                    // Supplements
                    Reference("Front Nutr. 2025 Sep 4;12:1644899", "👉 Low-molecular-weight collagen peptides in knee OA, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day", "40977985"),
                    Reference("J Arthroplasty. 2025 Sep 17:S0883-5403(25)01183-0", "👉 Hypovitaminosis D in TJA patients, No clear dose/effect/duration found", "40972989"),
                    Reference("Cureus. 2025 Aug 7;17(8):e89582", "👉 Essential amino acid supplementation in knee OA, g | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week", "40926923"),

                    // Nutrients
                    Reference("Nutrients. 2025 Aug 22;17(17):2729", "👉 Anti-inflammatory diet in OA, Positive/therapeutic effect mentioned", "40944120"),
                    Reference("Cureus. 2025 Aug 7;17(8):e89582", "👉 Essential amino acid supplementation in knee OA, g | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week", "40926923"),
                    Reference("Nutrients. 2025 Aug 3;17(15):2547", "👉 Nutritional supplements network meta-analysis in knee OA, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40806131")
                )
            )

            "Labyrinthitis" -> Pair(
                """
Alternative approaches
1. Factors affecting the use of alternative methods in cochlear implantation, No clear dose/effect/duration found.
2. Machine learning-based estimation of discharge coefficient for semicircular labyrinth weirs, Positive/therapeutic effect mentioned.
3. AAV-mediated exon skipping therapy for Usher Syndrome Type 2A, Positive/therapeutic effect mentioned.

Herbs
1. Curcumin analog C1 activates autophagy to protect sensory hair cells in mice, No clear dose/effect/duration found.
2. Traditional oriental medicine for sensorineural hearing loss, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
3. In vivo pharmacokinetics of Danshen and Sanqi via inner ear administration, Positive/therapeutic effect mentioned.

Amino acids
1. Mitochondrial metabolism of glucose, amino acids, and fatty acids in inner ear cells, No clear dose/effect/duration found.
2. Metabolic shifts in murine inner ears reveal diagnostics for age-related hearing loss, Negative/adverse effect mentioned.
3. CLIC5A stabilizes active ezrin conformation, No clear dose/effect/duration found.

Vitamins
1. Impact of PM2.5 on GLUT1 and SVCT2 in rat placenta, Positive/therapeutic effect mentioned.
2. Low serum 25-hydroxyvitamin D and hearing loss severity in Meniere disease, No clear dose/effect/duration found.
3. Blood biomarkers for peripheral vestibular syndrome, No clear dose/effect/duration found.

Minerals
1. Col1a2(oim/oim) mice and ossicular bone quality, Positive/therapeutic effect mentioned.
2. Disinfectants and ototoxicity in the inner ear, Negative/adverse effect mentioned.
3. Geochemical signatures and echinoid biomineralization, G,G.

Supplements
1. Retinal and choroidal vascular biomarkers and myopia, No clear dose/effect/duration found.
2. Sirtuins reduce age-related cochlear oxidative damage under cocoa-rich diet, Positive/therapeutic effect mentioned | month.
3. Silicon-based agent efficacy for age-related vestibular decline, mg, G | Positive/therapeutic effect mentioned.

Nutrients
1. PM2.5 exposure impacts GLUT1 and SVCT2 in placenta, Positive/therapeutic effect mentioned.
2. High-elevation adaptation and gestational hypoxia shape vascular development in rodent placenta, Positive/therapeutic effect mentioned.
3. Organotrophic Sideroxydans and iron oxidation marker genes, No clear dose/effect/duration found.

Summary for readers
• Labyrinthitis and inner ear disorders can benefit from pharmacological, herbal, and nutritional interventions.  
• Positive effects observed for gene therapy, herbal extracts, and mineral/vitamin supplementation.  
• Dose and duration are often unspecified; further research is needed for standardized preventive and therapeutic strategies.
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("J Clin Med. 2025 Sep 17;14(18):6525", "👉 Factors affecting the use of alternative methods in cochlear implantation, No clear dose/effect/duration found", "41010729"),
                    Reference("Sci Rep. 2025 Sep 26;15(1):33002", "👉 Machine learning-based estimation of discharge coefficient for semicircular labyrinth weirs, Positive/therapeutic effect mentioned", "41006552"),
                    Reference("Mol Ther. 2025 Sep 23:S1525-0016(25)00767-1", "👉 AAV-mediated exon skipping therapy for Usher Syndrome Type 2A, Positive/therapeutic effect mentioned", "40994011"),

                    // Herbs
                    Reference("Int Immunopharmacol. 2025 Aug 28;161:115081", "👉 Curcumin analog C1 activates autophagy to protect sensory hair cells in mice, No clear dose/effect/duration found", "40532329"),
                    Reference("J Ethnopharmacol. 2019 Mar 1;231:409-428", "👉 Traditional oriental medicine for sensorineural hearing loss, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "30439402"),
                    Reference("J Ethnopharmacol. 2014 Oct 28;156:199-208", "👉 In vivo pharmacokinetics of Danshen and Sanqi via inner ear administration, Positive/therapeutic effect mentioned", "25218322"),

                    // Amino acids
                    Reference("Biology (Basel). 2025 Aug 24;14(9):1118", "👉 Mitochondrial metabolism of glucose, amino acids, and fatty acids in HEI-OC1 inner ear cells, No clear dose/effect/duration found", "41007265"),
                    Reference("iScience. 2025 Aug 5;28(9):113285", "👉 Metabolic shifts in murine inner ears reveal diagnostics for age-related hearing loss, Negative/adverse effect mentioned", "40949103"),
                    Reference("J Biol Chem. 2025 Aug 28;301(10):110646", "👉 CLIC5A stabilizes active ezrin conformation, No clear dose/effect/duration found", "40885385"),

                    // Vitamins
                    Reference("Antioxidants (Basel). 2025 Aug 26;14(9):1050", "👉 Impact of PM2.5 on GLUT1 and SVCT2 in rat placenta, Positive/therapeutic effect mentioned", "41008957"),
                    Reference("Front Neurol. 2025 Sep 1;16:1638357", "👉 Low serum 25-hydroxyvitamin D and hearing loss severity in Meniere disease, No clear dose/effect/duration found", "40959501"),
                    Reference("Otol Neurotol. 2025 Oct 1;46(9):e359-e369", "👉 Blood biomarkers for peripheral vestibular syndrome, No clear dose/effect/duration found", "40940013"),

                    // Minerals
                    Reference("Bone. 2025 Sep;198:117537", "👉 Col1a2(oim/oim) mice and ossicular bone quality, Positive/therapeutic effect mentioned", "40398629"),
                    Reference("Laryngoscope. 2025 Jun;135(6):2154-2163", "👉 Disinfectants and ototoxicity in the inner ear, Negative/adverse effect mentioned", "39932143"),
                    Reference("PeerJ. 2025 Jan 24;13:e18688", "👉 Geochemical signatures and echinoid biomineralization, G,G", "39872031"),

                    // Supplements
                    Reference("Transl Vis Sci Technol. 2025 Aug 1;14(8):39", "👉 Retinal and choroidal vascular biomarkers and myopia, No clear dose/effect/duration found", "40862656"),
                    Reference("Geroscience. 2025 Aug 20", "👉 Sirtuins reduce age-related cochlear oxidative damage under cocoa-rich diet, Positive/therapeutic effect mentioned | month", "40835803"),
                    Reference("Sci Rep. 2025 Aug 14;15(1):29790", "👉 Silicon-based agent efficacy for age-related vestibular decline, mg, G | Positive/therapeutic effect mentioned", "40813876"),

                    // Nutrients
                    Reference("Antioxidants (Basel). 2025 Aug 26;14(9):1050", "👉 PM2.5 exposure impacts GLUT1 and SVCT2 in placenta, Positive/therapeutic effect mentioned", "41008957"),
                    Reference("J Physiol. 2025 Sep 17", "👉 High-elevation adaptation and gestational hypoxia shape vascular development in rodent placenta, Positive/therapeutic effect mentioned", "40961454"),
                    Reference("Appl Environ Microbiol. 2025 Sep 17;91(9):e0039525", "👉 Organotrophic Sideroxydans and iron oxidation marker genes, No clear dose/effect/duration found", "40960288")
                )
            )

            "Lactose intolerance" -> Pair(
                """
Alternative approaches
1. Gas chromatography-mass spectrometry and FTIR for metabolome analysis of different milk types, G,G
2. Current research on plant-based milk alternatives and impact on health, Positive/therapeutic effect mentioned
3. Physicochemical, microbial, and nutritional evaluation of tiger nut yogurt as a plant-based alternative, Positive/therapeutic effect mentioned

Herbs
1. Inclusion of antimicrobial and antioxidant spices into milk candy, g, mg, μg | Positive/therapeutic effect mentioned
2. Use of complementary and alternative medicine in chronic GI disorders, Positive/therapeutic effect mentioned

Amino acids
1. Metabolome analysis of milk types, G,G
2. Cellobiose 2-epimerase converts lactose in fresh goat milk into epilactose, mg, mg
3. Lactose intolerance and levothyroxine malabsorption, No clear dose/effect/duration found

Vitamins
1. Metabolome analysis of milk types, G,G
2. Is it advisable for Asians to drink milk at risk of osteoporosis?, Positive/therapeutic effect mentioned
3. Production of probiotic garden cress and nutritional evaluation, Positive/therapeutic effect mentioned

Minerals
1. Metabolome analysis of milk types, G,G
2. Use of almond milk, almond skin, and plant-based probiotics in kefir, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Advisability of milk consumption in Asians at risk of osteoporosis, Positive/therapeutic effect mentioned

Supplements
1. Cariogenic potential of lactose-free infant formulas, Positive/therapeutic effect mentioned
2. Ten dietary commandments for IBS patients, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Lactose intolerance: clinical syndrome with GI symptoms, No clear dose/effect/duration found

Nutrients
1. Lactase persistence-associated polymorphism and cardiovascular risk, g | Positive/therapeutic effect mentioned
2. Ten dietary commandments for IBS patients, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Pediatric malabsorption review for diagnosis and management, Positive/therapeutic effect mentioned

Summary for readers
• Lactose intolerance can be managed through plant-based milk alternatives, enzyme supplementation, and dietary strategies.  
• Positive effects observed for probiotics, amino acid modifications, and vitamin/mineral interventions.  
• Dose, timing, and duration are often unspecified; more research is needed for clear clinical guidelines.
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("PeerJ. 2025 Sep 17;13:e19921", "👉 Gas chromatography-mass spectrometry and FTIR for metabolome analysis of different milk types, G,G", "40980071"),
                    Reference("Adv Food Nutr Res. 2025;116:103-138", "👉 Current research on plant-based milk alternatives and impact on health, Positive/therapeutic effect mentioned", "40940086"),
                    Reference("Food Sci Nutr. 2025 Sep 1;13(9):e70897", "👉 Physicochemical, microbial, and nutritional evaluation of tiger nut yogurt as a plant-based alternative, Positive/therapeutic effect mentioned", "40901650"),

                    // Herbs
                    Reference("Heliyon. 2025 Jan 27;11(3):e42249", "👉 Inclusion of antimicrobial and antioxidant spices into milk candy, g, mg, μg | Positive/therapeutic effect mentioned", "39959487"),
                    Reference("Gastroenterol Res Pract. 2018 Apr 3;2018:9137805", "👉 Use of complementary and alternative medicine in chronic GI disorders, Positive/therapeutic effect mentioned", "29849602"),

                    // Amino acids
                    Reference("PeerJ. 2025 Sep 17;13:e19921", "👉 Metabolome analysis of milk types, G,G", "40980071"),
                    Reference("J Sci Food Agric. 2024 Nov;104(14):8529-8540", "👉 Cellobiose 2-epimerase converts lactose in fresh goat milk into epilactose, mg, mg", "39392661"),
                    Reference("Front Endocrinol (Lausanne). 2024 Apr 11;15:1386510", "👉 Lactose intolerance and levothyroxine malabsorption, No clear dose/effect/duration found", "38665263"),

                    // Vitamins
                    Reference("PeerJ. 2025 Sep 17;13:e19921", "👉 Metabolome analysis of milk types, G,G", "40980071"),
                    Reference("Front Nutr. 2025 Jun 25;12:1586623", "👉 Is it advisable for Asians to drink milk at risk of osteoporosis?, Positive/therapeutic effect mentioned", "40635901"),
                    Reference("PLoS One. 2025 Jun 4;20(6):e0322552", "👉 Production of probiotic garden cress and nutritional evaluation, Positive/therapeutic effect mentioned", "40465650"),

                    // Minerals
                    Reference("PeerJ. 2025 Sep 17;13:e19921", "👉 Metabolome analysis of milk types, G,G", "40980071"),
                    Reference("Food Sci Nutr. 2025 Jul 27;13(8):e70719", "👉 Use of almond milk, almond skin, and plant-based probiotics in kefir, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40735401"),
                    Reference("Front Nutr. 2025 Jun 25;12:1586623", "👉 Advisability of milk consumption in Asians at risk of osteoporosis, Positive/therapeutic effect mentioned", "40635901"),

                    // Supplements
                    Reference("J Int Soc Prev Community Dent. 2025 Jun 30;15(3):265-274", "👉 Cariogenic potential of lactose-free infant formulas, Positive/therapeutic effect mentioned", "40838029"),
                    Reference("Nutrients. 2025 Jul 30;17(15):2496", "👉 Ten dietary commandments for IBS patients, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40806081"),
                    Reference("StatPearls. 2025 Jan–", "👉 Lactose intolerance: clinical syndrome with GI symptoms, No clear dose/effect/duration found", "30335318"),

                    // Nutrients
                    Reference("Nutrients. 2025 Aug 24;17(17):2741", "👉 Lactase persistence-associated polymorphism and cardiovascular risk, g | Positive/therapeutic effect mentioned", "40944132"),
                    Reference("Nutrients. 2025 Jul 30;17(15):2496", "👉 Ten dietary commandments for IBS patients, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40806081"),
                    Reference("Nutrition. 2025 Jul 8;140:112895", "👉 Pediatric malabsorption review for diagnosis and management, Positive/therapeutic effect mentioned", "40769093")
                )
            )

            "Laryngitis" -> Pair(
                """
Alternative approaches
1. Pulmonary complications following postpartum tubal ligation with laryngeal mask vs. endotracheal intubation, Negative/adverse effect mentioned
2. Phonosurgery for vocal fold polyps: multidimensional voice outcomes, Positive/therapeutic effect mentioned
3. Mechanotransduction-mediated expansion of rabbit vocal fold epithelial cells via ROCK inhibition, Positive/therapeutic effect mentioned

Herbs
1. Intestinal mucus barrier as potential therapeutic target for IBD, No clear dose/effect/duration found
2. Erchen Decoction plus Huiyanzhuyu Decoction in treatment of laryngeal squamous cell carcinoma, No clear dose/effect/duration found
3. Berberine inhibits malignant cell phenotype via PI3K/AKT/mTOR signaling, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Amino acids
1. 5-Aminolevulinic acid-mediated photodynamic therapy improves scar healing of laryngeal wounds in rats, Positive/therapeutic effect mentioned
2. Cysteinyl leukotrienes stimulate gut absorption of food allergens, No clear dose/effect/duration found
3. Predictive factors and treatment effects of neuromodulators in chronic refractory cough, Negative/adverse effect mentioned

Vitamins
1. Impact of serum 25-hydroxyvitamin D levels on laryngeal cancer, Positive/therapeutic effect mentioned
2. 24R,25(OH)(2)D(3) regulates tumorigenesis in estrogen-sensitive laryngeal cancer cells, Positive/therapeutic effect mentioned
3. Effects of vitamin C administration on incidence of pharyngocutaneous fistulas after total laryngectomy, Positive/therapeutic effect mentioned

Minerals
1. Computed tomographic appearance of laryngeal lesions in dogs, No clear dose/effect/duration found
2. Burden of laryngeal cancer attributable to occupational asbestos exposure in China, Positive/therapeutic effect mentioned
3. Mortality burden of laryngeal cancer due to occupational exposure, Positive/therapeutic effect mentioned

Supplements
1. Arytenoid cartilage abduction grades after prosthetic laryngoplasty in racehorses, No clear dose/effect/duration found
2. Accuracy of transcutaneous laryngeal ultrasonography before and after thyroid surgery, No clear dose/effect/duration found
3. Synergy of secoisolariciresinol diglucoside and fructooligosaccharide enhances intestinal mucus barrier, Positive/therapeutic effect mentioned

Nutrients
1. Neural control of goblet cells in GI tract, No clear dose/effect/duration found
2. Single-cell RNA sequencing uncovers intestinal immune alterations from chronic fluoride exposure, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Mitochondrial metabolism in laryngeal cancer: therapeutic mechanisms and prospects, No clear dose/effect/duration found
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Int J Obstet Anesth. 2025 Sep 22;65:104776", "👉 Pulmonary complications following postpartum tubal ligation with laryngeal mask vs. endotracheal intubation, Negative/adverse effect mentioned", "41014852"),
                    Reference("Auris Nasus Larynx. 2025 Sep 25;52(6):633-642", "👉 Phonosurgery for vocal fold polyps: multidimensional voice outcomes, Positive/therapeutic effect mentioned", "41004908"),
                    Reference("Cells. 2025 Sep 9;14(18):1412", "👉 Mechanotransduction-mediated expansion of rabbit vocal fold epithelial cells via ROCK inhibition, Positive/therapeutic effect mentioned", "41002379"),

                    // Herbs
                    Reference("Autoimmun Rev. 2025 Jan 31;24(2):103717", "👉 Intestinal mucus barrier as potential therapeutic target for IBD, No clear dose/effect/duration found", "39662652"),
                    Reference("Integr Cancer Ther. 2024 Jan-Dec;23:15347354241259182", "👉 Erchen Decoction plus Huiyanzhuyu Decoction in treatment of laryngeal squamous cell carcinoma, No clear dose/effect/duration found", "38845538"),
                    Reference("Histol Histopathol. 2024 Nov;39(11):1527-1536", "👉 Berberine inhibits malignant cell phenotype via PI3K/AKT/mTOR signaling, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "38712806"),

                    // Amino acids
                    Reference("Lasers Med Sci. 2025 Sep 9;40(1):353", "👉 5-Aminolevulinic acid-mediated photodynamic therapy improves scar healing of laryngeal wounds in rats, mg | Positive/therapeutic effect mentioned", "40924290"),
                    Reference("Science. 2025 Aug 7;389(6760):eadp0240", "👉 Cysteinyl leukotrienes stimulate gut absorption of food allergens, No clear dose/effect/duration found", "40773557"),
                    Reference("J Otolaryngol Head Neck Surg. 2025 Jan-Dec;54:19160216251333354", "👉 Predictive factors and treatment effects of neuromodulators in chronic refractory cough, Negative/adverse effect mentioned", "40437900"),

                    // Vitamins
                    Reference("Braz J Otorhinolaryngol. 2025 Sep 10;92(1):101705", "👉 Impact of serum 25-hydroxyvitamin D levels on laryngeal cancer, Positive/therapeutic effect mentioned", "40934602"),
                    Reference("Int J Cancer. 2025 Sep 8", "👉 24R,25(OH)(2)D(3) regulates tumorigenesis in estrogen-sensitive laryngeal cancer cells, Positive/therapeutic effect mentioned", "40920031"),
                    Reference("Ann Med Surg (Lond). 2025 Jul 16;87(8):4870-4874", "👉 Effects of vitamin C administration on incidence of pharyngocutaneous fistulas after total laryngectomy, g | month", "40787547"),

                    // Minerals
                    Reference("Front Vet Sci. 2025 Sep 4;12:1633591", "👉 Computed tomographic appearance of laryngeal lesions in dogs, No clear dose/effect/duration found", "40979371"),
                    Reference("PLoS One. 2025 Aug 21;20(8):e0330878", "👉 Burden of laryngeal cancer attributable to occupational asbestos exposure in China, Positive/therapeutic effect mentioned", "40839654"),
                    Reference("Front Public Health. 2025 Jul 18;13:1602789", "👉 Mortality burden of laryngeal cancer due to occupational exposure, G | Positive/therapeutic effect mentioned", "40756409"),

                    // Supplements
                    Reference("Am J Vet Res. 2025 Sep 24:1-8", "👉 Arytenoid cartilage abduction grades after prosthetic laryngoplasty in racehorses, day", "40997883"),
                    Reference("Iran J Otorhinolaryngol. 2025;37(5):253-259", "👉 Accuracy of transcutaneous laryngeal ultrasonography before and after thyroid surgery, No clear dose/effect/duration found", "40989135"),
                    Reference("Food Funct. 2025 Aug 11;16(16):6518-6531", "👉 Synergy of secoisolariciresinol diglucoside and fructooligosaccharide enhances intestinal mucus barrier, Positive/therapeutic effect mentioned", "40699562"),

                    // Nutrients
                    Reference("Am J Physiol Gastrointest Liver Physiol. 2025 Oct 1;329(4):G513-G535", "👉 Neural control of goblet cells in GI tract, No clear dose/effect/duration found", "40824870"),
                    Reference("Theranostics. 2025 Jun 18;15(15):7242-7269", "👉 Single-cell RNA sequencing uncovers intestinal immune alterations from chronic fluoride exposure, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40756359"),
                    Reference("Biochim Biophys Acta Rev Cancer. 2025 Jul;1880(3):189335", "👉 Mitochondrial metabolism in laryngeal cancer: therapeutic mechanisms and prospects, No clear dose/effect/duration found", "40311711")
                )
            )

            "Leg cramps" -> Pair(
                """
Alternative approaches
1. Chronic Compartment Syndrome in Athletes, Positive/therapeutic effect mentioned
2. Intraoperative ultrasound for extracting deep-seated radio-opaque foreign body from calf, No clear dose/effect/duration found
3. Fragmentary hypnic myoclonus and other isolated motor phenomena of sleep, No clear dose/effect/duration found

Herbs
1. No data available

Amino acids
1. Use of Baclofen as treatment for nocturnal calf cramps in lumbar spinal stenosis, Negative/adverse effect mentioned
2. L-carnitine supplementation with exercise in liver cirrhosis patients receiving BCAA, Positive/therapeutic effect mentioned
3. Rhabdomyolysis in severe hypothyroidism, Positive/therapeutic effect mentioned

Vitamins
1. Vitamin K2 decreases nocturnal leg cramps, No clear dose/effect/duration found
2. Calcium and vitamin D3 supplementation in pregnancy, Positive/therapeutic effect mentioned
3. Retracted article on Vitamin K2 in managing nocturnal leg cramps, No clear dose/effect/duration found

Minerals
1. Pandughni Vati & Punarnavadi Mandura Vati in iron deficiency anemia in children, No clear dose/effect/duration found
2. Fibromyalgia syndrome: dietary strategy for symptom remission, Positive/therapeutic effect mentioned
3. Magnesium supplement on pregnancy outcomes, Positive/therapeutic effect mentioned

Supplements
1. Nocturnal leg cramps in COPD patients, Positive/therapeutic effect mentioned
2. Prevalence and predictors of leg cramps in third trimester of pregnancy, No clear dose/effect/duration found
3. Does magnesium supplementation treat nocturnal leg cramps?, No clear dose/effect/duration found

Nutrients
1. Vitamin K2 in managing nocturnal leg cramps, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Interventions for leg cramps in pregnancy, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Interventions for leg cramps in pregnancy, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Rev Bras Ortop (Sao Paulo). 2024 Jul 15;59(5):e650-e656", "👉 Chronic Compartment Syndrome in Athletes, Positive/therapeutic effect mentioned", "39649060"),
                    Reference("JBJS Case Connect. 2023 Dec 14;13(4)", "👉 Intraoperative ultrasound for extracting deep-seated radio-opaque foreign body from calf, No clear dose/effect/duration found", "38096338"),
                    Reference("Sleep Med Clin. 2021 Jun;16(2):349-361", "👉 Fragmentary hypnic myoclonus and other isolated motor phenomena of sleep, No clear dose/effect/duration found", "33985659"),

                    // Herbs
                    // No data available

                    // Amino acids
                    Reference("Am J Phys Med Rehabil. 2024 May 1;103(5):384-389", "👉 Use of Baclofen as treatment for nocturnal calf cramps in lumbar spinal stenosis, Negative/adverse effect mentioned", "38063320"),
                    Reference("Eur J Gastroenterol Hepatol. 2019 Jul;31(7):878-884", "👉 L-carnitine supplementation with exercise in liver cirrhosis patients receiving BCAA, g, mg | Positive/therapeutic effect mentioned | week, month", "31150367"),
                    Reference("Am J Case Rep. 2017 Aug 22;18:912-918", "👉 Rhabdomyolysis in severe hypothyroidism, Positive/therapeutic effect mentioned", "28827517"),

                    // Vitamins
                    Reference("Am Fam Physician. 2025 Aug;112(2):217", "👉 Vitamin K2 decreases nocturnal leg cramps, No clear dose/effect/duration found", "40834386"),
                    Reference("Front Pediatr. 2025 Jun 12;13:1605489", "👉 Calcium and vitamin D3 supplementation in pregnancy, IU, mg | Positive/therapeutic effect mentioned", "40590014"),
                    Reference("JAMA Intern Med. 2025 Jul 1;185(7):904", "👉 Retracted article on Vitamin K2 in managing nocturnal leg cramps, No clear dose/effect/duration found", "40314950"),

                    // Minerals
                    Reference("Ayu. 2020 Oct-Dec;41(4):218-224", "👉 Pandughni Vati & Punarnavadi Mandura Vati in iron deficiency anemia in children, day", "35813360"),
                    Reference("Front Med (Lausanne). 2018 Apr 30;5:94", "👉 Fibromyalgia syndrome: dietary strategy for symptom remission, Positive/therapeutic effect mentioned | month", "29761101"),
                    Reference("Adv Biomed Res. 2017 Aug 31;6:109", "👉 Magnesium supplement on pregnancy outcomes, mg | Positive/therapeutic effect mentioned", "28904937"),

                    // Supplements
                    Reference("Clin Nurs Res. 2024 Nov;33(8):638-647", "👉 Nocturnal leg cramps in COPD patients, Positive/therapeutic effect mentioned", "39301776"),
                    Reference("Int J Womens Health. 2024 Aug 12;16:1377-1387", "👉 Prevalence and predictors of leg cramps in third trimester of pregnancy, No clear dose/effect/duration found", "39157003"),
                    Reference("Am Fam Physician. 2023 Dec;108(6):619-620", "👉 Does magnesium supplementation treat nocturnal leg cramps?, No clear dose/effect/duration found", "38215424"),

                    // Nutrients
                    Reference("JAMA Intern Med. 2024 Dec 1;184(12):1443-1447", "👉 Vitamin K2 in managing nocturnal leg cramps, g, μg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week", "39466236"),
                    Reference("Cochrane Database Syst Rev. 2020 Dec 4;12(12):CD010655", "👉 Interventions for leg cramps in pregnancy, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "33275278"),
                    Reference("Cochrane Database Syst Rev. 2015 Aug 11;(8):CD010655", "👉 Interventions for leg cramps in pregnancy, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "26262909")
                )
            )

            "Leg ulcers" -> Pair(
                """
Alternative approaches
1. Sequential treatment for diabetic foot ulcers in aortic dissection patients: a case report, No clear dose/effect/duration found
2. Using Pedal Acceleration Time to predict ischemic wound healing in diabetic patients, No clear dose/effect/duration found
3. Frog skin as alternative temporary dressing for diabetic foot ulcers: animal model, Positive/therapeutic effect mentioned

Herbs
1. Analysis of immune cell activation in diabetic foot ulcer patients: single-cell perspective, No clear dose/effect/duration found
2. Herbal oils for treatment of chronic and diabetic wounds: systematic review, No clear dose/effect/duration found
3. External washing by traditional Chinese medicine for multiple infectious diabetic foot wounds, Positive/therapeutic effect mentioned

Amino acids
1. Vulnamin as adjunct to standard care in hard-to-heal venous leg ulcers, Positive/therapeutic effect mentioned
2. Cold atmospheric plasma with arginine-loaded nanofibers for infected diabetic wound healing, No clear dose/effect/duration found
3. N-Acetyl-Cysteine as adjuvant therapy for diabetic foot osteomyelitis, Positive/therapeutic effect mentioned

Vitamins
1. Risk of insufficient hydroxyvitamin D levels in diabetic foot ulcers, Positive/therapeutic effect mentioned
2. Charcot foot disease: a new approach, No clear dose/effect/duration found
3. Micronutrient status of patients with diabetic foot: systematic review, Positive/therapeutic effect mentioned

Minerals
1. Graphene oxide/alginate gel with platelet-rich plasma-derived exosomes promotes diabetic foot wound healing, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. RCN1 downregulation-driven ER stress impairs endothelial function and diabetic foot ulcer healing, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Self-healing hydrogels with selenium nanoparticles/chitosan/cellulose nanofibers for diabetic wound healing, Positive/therapeutic effect mentioned

Supplements
1. Micronutrient status of patients with diabetic foot: systematic review, Positive/therapeutic effect mentioned
2. Improvement in venous ulcer closure and healing with Centellicum®, Positive/therapeutic effect mentioned
3. Dietary interventions in diabetes for preventing and healing chronic wounds: systematic review with meta-analysis, Positive/therapeutic effect mentioned

Nutrients
1. Micronutrient status of patients with diabetic foot: systematic review, Positive/therapeutic effect mentioned
2. Dietary interventions in diabetes for preventing and healing chronic wounds: systematic review with meta-analysis, Positive/therapeutic effect mentioned
3. Hypervitaminosis D and hard-to-heal wounds: a case report, Negative/adverse effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Front Endocrinol (Lausanne). 2025 Aug 21;16:1635004", "👉 Sequential treatment for diabetic foot ulcers in aortic dissection patients: a case report, No clear dose/effect/duration found", "40917347"),
                    Reference("Port J Card Thorac Vasc Surg. 2025 Aug 31;32(2):47-50", "👉 Using Pedal Acceleration Time to predict ischemic wound healing in diabetic patients, No clear dose/effect/duration found", "40886298"),
                    Reference("Acta Cir Bras. 2025 Aug 18;40:e406625", "👉 Frog skin as alternative temporary dressing for diabetic foot ulcers: animal model, g, mg | Positive/therapeutic effect mentioned | day", "40834222"),

                    // Herbs
                    Reference("Eur J Med Res. 2024 Dec 19;29(1):606", "👉 Analysis of immune cell activation in diabetic foot ulcer patients: single-cell perspective, No clear dose/effect/duration found", "39702546"),
                    Reference("Curr Diabetes Rev. 2022;18(2):e220321192406", "👉 Herbal oils for treatment of chronic and diabetic wounds: systematic review, No clear dose/effect/duration found", "34225631"),
                    Reference("Medicine (Baltimore). 2020 Apr;99(17):e19841", "👉 External washing by traditional Chinese medicine for multiple infectious diabetic foot wounds, Positive/therapeutic effect mentioned", "32332634"),

                    // Amino acids
                    Reference("J Wound Care. 2025 Aug 2;34(8):623-630", "👉 Vulnamin as adjunct to standard care in hard-to-heal venous leg ulcers, Positive/therapeutic effect mentioned | week, day", "40801774"),
                    Reference("Int J Pharm. 2025 Oct 15;683:126023", "👉 Cold atmospheric plasma with arginine-loaded nanofibers for infected diabetic wound healing, No clear dose/effect/duration found", "40754041"),
                    Reference("Arch Iran Med. 2025 May 1;28(5):257-263", "👉 N-Acetyl-Cysteine as adjuvant therapy for diabetic foot osteomyelitis, mg | Positive/therapeutic effect mentioned", "40751519"),

                    // Vitamins
                    Reference("West Afr J Med. 2025 Mar 31;42(3):225-230", "👉 Risk of insufficient hydroxyvitamin D levels in diabetic foot ulcers, Positive/therapeutic effect mentioned", "40845204"),
                    Reference("Drugs Aging. 2025 Sep;42(9):837-851", "👉 Charcot foot disease: a new approach, No clear dose/effect/duration found", "40789985"),
                    Reference("Asia Pac J Clin Nutr. 2025 Aug;34(4):487-501", "👉 Micronutrient status of patients with diabetic foot: systematic review, Positive/therapeutic effect mentioned", "40738717"),

                    // Minerals
                    Reference("Toxicol Appl Pharmacol. 2025 Nov;504:117536", "👉 Graphene oxide/alginate gel with platelet-rich plasma-derived exosomes promotes diabetic foot wound healing, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40902832"),
                    Reference("Cell Mol Life Sci. 2025 Aug 25;82(1):318", "👉 RCN1 downregulation-driven ER stress impairs endothelial function and diabetic foot ulcer healing, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40853392"),
                    Reference("Int J Biol Macromol. 2025 Sep;322(Pt 4):146905", "👉 Self-healing hydrogels with selenium nanoparticles/chitosan/cellulose nanofibers for diabetic wound healing, Positive/therapeutic effect mentioned", "40846001"),

                    // Supplements
                    Reference("Asia Pac J Clin Nutr. 2025 Aug;34(4):487-501", "👉 Micronutrient status of patients with diabetic foot: systematic review, Positive/therapeutic effect mentioned", "40738717"),
                    Reference("Minerva Surg. 2025 Aug;80(4):308-313", "👉 Improvement in venous ulcer closure and healing with Centellicum®, mg | Positive/therapeutic effect mentioned | day, month", "40719428"),
                    Reference("Diabet Med. 2025 Sep;42(9):e70100", "👉 Dietary interventions in diabetes for preventing and healing chronic wounds: systematic review with meta-analysis, Positive/therapeutic effect mentioned", "40629913"),

                    // Nutrients
                    Reference("Asia Pac J Clin Nutr. 2025 Aug;34(4):487-501", "👉 Micronutrient status of patients with diabetic foot: systematic review, Positive/therapeutic effect mentioned", "40738717"),
                    Reference("Diabet Med. 2025 Sep;42(9):e70100", "👉 Dietary interventions in diabetes for preventing and healing chronic wounds: systematic review with meta-analysis, Positive/therapeutic effect mentioned", "40629913"),
                    Reference("J Wound Care. 2025 May 2;34(5):368-371", "👉 Hypervitaminosis D and hard-to-heal wounds: a case report, Negative/adverse effect mentioned", "40358220")
                )
            )

            "Leukaemia" -> Pair(
                """
Alternative approaches
1. Synthesis of α,ε-N,N'-Di-stearoyl Lysine-Derived Amide Lipids for liposome formulation: Incorporation of Lipid A-Ligand for bacterial targeting and sialic acid for phagocytosis resistance, G | Positive/therapeutic effect mentioned
2. Automated cartridge-based microfluidic system for real-time quantification of BCR::ABL1 transcripts in chronic myeloid leukemia, No clear dose/effect/duration found
3. Pirtobrutinib in chronic lymphocytic leukemia: navigating resistance and personalisation of BTK-targeted therapy, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Herbs
1. The anticancer activity and mechanisms of She medicine herbs, Negative/adverse effect mentioned
2. Dynamic regulation of Daxx-mediated transcriptional inhibition by SUMO and PML NBs, Positive/therapeutic effect mentioned
3. Network-based analysis and experimental validation of natural compounds from Yinchen Wuling San for acute myeloid leukemia, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Amino acids
1. Synthesis of α,ε-N,N'-Di-stearoyl Lysine-Derived Amide Lipids for liposome formulation, G | Positive/therapeutic effect mentioned
2. Murine model of glioblastoma initiating cells and human brain organoid xenograft for photodynamic therapy testing, Negative/adverse effect mentioned
3. Serum SERS analysis reveals amino acid- and protein-associated vibrational features for subtype identification in acute lymphoblastic leukemia, No clear dose/effect/duration found

Vitamins
1. Exploring allosteric pathways of Asciminib in dual inhibition of BCR-ABL1, No clear dose/effect/duration found
2. Therapeutic implications of vitamin D in leukemia: mechanistic and clinical perspectives, Negative/adverse effect mentioned
3. Recurrent stroke and peripheral neuropathy associated with multifactorial hyperhomocysteinemia: a case report, No clear dose/effect/duration found

Minerals
1. Impact of body composition metrics from QCT on survival prognosis in AML patients, No clear dose/effect/duration found
2. Contamination profile and potential human health risks of radon in groundwater, G
3. MEF2C as a potential prognostic biomarker for osteosarcoma, No clear dose/effect/duration found

Supplements
1. Benefits, side effects, and uses of Hericium erinaceus as a supplement: systematic review, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Rib Ewing Sarcomas in children and young adults: large national retrospective series, No clear dose/effect/duration found
3. Clinical characteristics of SLC19A1 deficiency and folate transport, Positive/therapeutic effect mentioned

Nutrients
1. OGFOD1 enables AML chemo- and nutrient stress resistance by regulating protein synthesis, Positive/therapeutic effect mentioned
2. Plasma metabolic landscape unveils key regulators of leukemia subtype progression, No clear dose/effect/duration found
3. Impact of Omega-3 and Vitamin D supplementation on bone turnover markers in children with leukemia: follow-up during and after supplementation, IU, mg | week
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Int J Mol Sci. 2025 Sep 19;26(18):9176", "👉 Synthesis of α,ε-N,N'-Di-stearoyl Lysine-Derived Amide Lipids for liposome formulation: Incorporation of Lipid A-Ligand for bacterial targeting and sialic acid for phagocytosis resistance, G | Positive/therapeutic effect mentioned", "41009737"),
                    Reference("Int J Mol Sci. 2025 Sep 13;26(18):8932", "👉 Automated cartridge-based microfluidic system for real-time quantification of BCR::ABL1 transcripts in chronic myeloid leukemia: An Italian experience, No clear dose/effect/duration found", "41009498"),
                    Reference("Cancers (Basel). 2025 Sep 11;17(18):2974", "👉 Pirtobrutinib in chronic lymphocytic leukemia: navigating resistance and personalisation of BTK-targeted therapy, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month", "41008818"),

                    // Herbs
                    Reference("Front Pharmacol. 2025 Jul 17;16:1610301", "👉 The anticancer activity and mechanisms of She medicine herbs, Negative/adverse effect mentioned", "40746719"),
                    Reference("Int J Mol Sci. 2025 Jul 12;26(14):6703", "👉 Dynamic regulation of Daxx-mediated transcriptional inhibition by SUMO and PML NBs, Positive/therapeutic effect mentioned", "40724953"),
                    Reference("Front Pharmacol. 2025 May 30;16:1591164", "👉 Network-based analysis and experimental validation of natural compounds from Yinchen Wuling San for acute myeloid leukemia, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40520175"),

                    // Amino acids
                    Reference("Int J Mol Sci. 2025 Sep 19;26(18):9176", "👉 Synthesis of α,ε-N,N'-Di-stearoyl Lysine-Derived Amide Lipids for liposome formulation, G | Positive/therapeutic effect mentioned", "41009737"),
                    Reference("Int J Mol Sci. 2025 Sep 12;26(18):8889", "👉 Murine model of glioblastoma initiating cells and human brain organoid xenograft for photodynamic therapy testing, Negative/adverse effect mentioned", "41009470"),
                    Reference("Anal Chem. 2025 Sep 23;97(37):20453-20465", "👉 Serum SERS analysis reveals amino acid- and protein-associated vibrational features for subtype identification in acute lymphoblastic leukemia, No clear dose/effect/duration found", "40928037"),

                    // Vitamins
                    Reference("Biomolecules. 2025 Aug 22;15(9):1214", "👉 Exploring allosteric pathways of Asciminib in dual inhibition of BCR-ABL1, No clear dose/effect/duration found", "41008520"),
                    Reference("Med Oncol. 2025 Sep 27;42(11):499", "👉 Therapeutic implications of vitamin D in leukemia: mechanistic and clinical perspectives, Negative/adverse effect mentioned", "41006934"),
                    Reference("Neurohospitalist. 2025 Sep 16:19418744251379634", "👉 Recurrent stroke and peripheral neuropathy associated with multifactorial hyperhomocysteinemia: a case report, No clear dose/effect/duration found", "40969730"),

                    // Minerals
                    Reference("Front Oncol. 2025 Sep 9;15:1498024", "👉 Impact of body composition metrics from QCT on survival prognosis in AML patients, No clear dose/effect/duration found", "40994955"),
                    Reference("Environ Geochem Health. 2025 Sep 10;47(10):430", "👉 Contamination profile and potential human health risks of radon in groundwater of Punjab, India, G", "40926141"),
                    Reference("Medicine (Baltimore). 2025 Sep 5;104(36):e44313", "👉 MEF2C as a potential prognostic biomarker for osteosarcoma, No clear dose/effect/duration found", "40922352"),

                    // Supplements
                    Reference("Front Nutr. 2025 Sep 1;12:1641246", "👉 Benefits, side effects, and uses of Hericium erinaceus as a supplement: systematic review, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40959699"),
                    Reference("Pediatr Blood Cancer. 2025 Sep 6:e32012", "👉 Rib Ewing Sarcomas in children and young adults: large national retrospective series, No clear dose/effect/duration found", "40913591"),
                    Reference("SLC19A1-Related Folate Transport Deficiency. GeneReviews. 2025 Aug 14", "👉 Clinical characteristics of SLC19A1 deficiency and folate transport, Positive/therapeutic effect mentioned", "40811598"),

                    // Nutrients
                    Reference("Cell Metab. 2025 Sep 16:S1550-4131(25)00381-X", "👉 OGFOD1 enables AML chemo- and nutrient stress resistance by regulating protein synthesis, Positive/therapeutic effect mentioned", "40961937"),
                    Reference("Future Sci OA. 2025 Dec;11(1):2527015", "👉 Plasma metabolic landscape unveils key regulators of leukemia subtype progression, No clear dose/effect/duration found", "40888518"),
                    Reference("Nutrients. 2025 Jul 31;17(15):2526", "👉 Impact of Omega-3 and Vitamin D supplementation on bone turnover markers in children with leukemia: follow-up during and after supplementation, IU, mg | week", "40806109")
                )
            )

            "Liver cancer" -> Pair(
                """
Alternative approaches
1. Management of hepatotoxicity associated with CDK4/6 inhibitors and rechallenge strategies in metastatic hormone-positive, HER2-negative breast cancer, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Performance of simultaneous multislice diffusion-weighted imaging for assessment of microvascular invasion and histologic grade in hepatocellular carcinoma, Positive/therapeutic effect mentioned
3. Elevated CircYthdc2 expression is correlated with aggressive features and poor progression-free survival in hepatocellular carcinoma, Positive/therapeutic effect mentioned

Herbs
1. Traditional Chinese medicine in liver cancer: visualization and bibliometric analysis, No clear dose/effect/duration found
2. Single-cell profiling reveals immunoregulation of artemisinin on CD8(+)GZMB(+) T cells via JAK2-STAT3 in malaria-infected mice, Negative/adverse effect mentioned
3. Luteolin suppresses cell migration and invasion via targeting miR-6809-5p/FLOT1/FAK and eliciting EMT in hepatocellular carcinoma, Positive/therapeutic effect mentioned

Amino acids
1. Longitudinal effects of Glecaprevir/Pibrentasvir on liver function, fibrosis, and hepatocellular carcinoma risk in chronic hepatitis C: a prospective multicenter cohort study, month
2. Characterization of Periplaneta americana glycoproteins' structures and potential to treat immunological liver fibrosis, Positive/therapeutic effect mentioned
3. Hepatocellular carcinoma risk in chronic hepatitis B patients treated with Tenofovir Alafenamide or Tenofovir Disoproxil Fumarate, Positive/therapeutic effect mentioned

Vitamins
1. Hepatoid carcinoma of pancreas: diagnostic challenges and literature review, Positive/therapeutic effect mentioned
2. Gastric leiomyosarcoma mimicking hepatocellular carcinoma, No clear dose/effect/duration found
3. Folate- and chitosan-functionalized lipid nanoparticles for co-delivery of pioglitazone and simvastatin to enhance hepatic cancer therapy, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Minerals
1. Therapeutic effect of selenium nanoparticles, sorafenib, and selenium-sorafenib nanocomplex in lungs and kidneys of mice with TAA-induced HCC, Negative/adverse effect mentioned
2. Sequential nanotheranostics based on hollow mesoporous silica loaded with doxorubicin and seed kernel extract from Mangifera indica L. as adjuvant therapy against hepatocellular carcinoma, No clear dose/effect/duration found
3. Anti-cancer potential of Lantana camara leaf and root extracts against MCF-7, HepG2, and A549 cancer cell lines, μg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Supplements
1. Management of hepatotoxicity associated with CDK4/6 inhibitors and rechallenge strategies in metastatic hormone-positive, HER2-negative breast cancer, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Oral lipoteichoic and lipoic acids improve insulin resistance and body composition in porphyria mice on a high-carbohydrate diet, Positive/therapeutic effect mentioned | week
3. High-protein oral nutritional supplement use in patients with cancer reduces complications and length of hospital stay: systematic review and meta-analysis, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day

Nutrients
1. Genome-based Mexican diet bioactives target molecular pathways in HBV, HCV, and MASLD: a bioinformatic approach for liver disease prevention, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Flaxseed oil inhibits hepatic preneoplastic lesions, DNA damage, and γ-H2AX expression during initial phases of hepatocarcinogenesis, Positive/therapeutic effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("J Cancer Res Clin Oncol. 2025 Sep 27;151(10):270", "👉 Management of hepatotoxicity associated with CDK4/6 inhibitors and rechallenge strategies in metastatic hormone-positive, HER2-negative breast cancer, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41014426"),
                    Reference("Cancer Imaging. 2025 Sep 26;25(1):113", "👉 Performance of simultaneous multislice diffusion-weighted imaging for assessment of microvascular invasion and histologic grade in hepatocellular carcinoma, Positive/therapeutic effect mentioned", "41013810"),
                    Reference("BMC Gastroenterol. 2025 Sep 26;25(1):658", "👉 Elevated CircYthdc2 expression is correlated with aggressive features and poor progression-free survival in hepatocellular carcinoma, Positive/therapeutic effect mentioned", "41013290"),

                    // Herbs
                    Reference("Future Sci OA. 2025 Dec;11(1):2561355", "👉 Traditional Chinese medicine in liver cancer: visualization and bibliometric analysis, No clear dose/effect/duration found", "40988483"),
                    Reference("Innovation (Camb). 2025 Aug 14;6(9):101080", "👉 Single-cell profiling reveals immunoregulation of artemisinin on CD8(+)GZMB(+) T cells via JAK2-STAT3 in malaria-infected mice, Negative/adverse effect mentioned", "40979296"),
                    Reference("Transl Oncol. 2025 Nov;61:102511", "👉 Luteolin suppresses cell migration and invasion via targeting miR-6809-5p/FLOT1/FAK and eliciting EMT in hepatocellular carcinoma, Positive/therapeutic effect mentioned", "40857906"),

                    // Amino acids
                    Reference("Medicina (Kaunas). 2025 Sep 4;61(9):1601", "👉 Longitudinal effects of Glecaprevir/Pibrentasvir on liver function, fibrosis, and hepatocellular carcinoma risk in chronic hepatitis C: a prospective multicenter cohort study, month", "41010992"),
                    Reference("Int J Biol Macromol. 2025 Sep 24;329(Pt 2):147900", "👉 Characterization of Periplaneta americana glycoproteins' structures and potential to treat immunological liver fibrosis, Positive/therapeutic effect mentioned", "41005413"),
                    Reference("Liver Int. 2025 Oct;45(10):e70357", "👉 Hepatocellular carcinoma risk in chronic hepatitis B patients treated with Tenofovir Alafenamide or Tenofovir Disoproxil Fumarate, Positive/therapeutic effect mentioned", "40995685"),

                    // Vitamins
                    Reference("J Cancer Res Ther. 2025 Jul 1;21(5):1075-1078", "👉 Hepatoid carcinoma of pancreas: diagnostic challenges and literature review, Positive/therapeutic effect mentioned", "41004299"),
                    Reference("BMJ Case Rep. 2025 Sep 25;18(9):e265246", "👉 Gastric leiomyosarcoma mimicking hepatocellular carcinoma, No clear dose/effect/duration found", "40998546"),
                    Reference("Mol Biol Rep. 2025 Sep 19;52(1):926", "👉 Folate- and chitosan-functionalized lipid nanoparticles for co-delivery of pioglitazone and simvastatin to enhance hepatic cancer therapy, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40971053"),

                    // Minerals
                    Reference("Biomolecules. 2025 Sep 18;15(9):1336", "👉 Therapeutic effect of selenium nanoparticles, sorafenib, and selenium-sorafenib nanocomplex in lungs and kidneys of mice with TAA-induced HCC, Negative/adverse effect mentioned", "41008643"),
                    Reference("Drug Deliv. 2025 Dec;32(1):2559838", "👉 Sequential nanotheranostics based on hollow mesoporous silica loaded with doxorubicin and seed kernel extract from Mangifera indica L. as adjuvant therapy against hepatocellular carcinoma, No clear dose/effect/duration found", "40984734"),
                    Reference("Food Sci Nutr. 2025 Sep 11;13(9):e70915", "👉 Anti-cancer potential of Lantana camara leaf and root extracts against MCF-7, HepG2, and A549 cancer cell lines, μg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40951590"),

                    // Supplements
                    Reference("J Cancer Res Clin Oncol. 2025 Sep 27;151(10):270", "👉 Management of hepatotoxicity associated with CDK4/6 inhibitors and rechallenge strategies in metastatic hormone-positive, HER2-negative breast cancer, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41014426"),
                    Reference("J Physiol Biochem. 2025 Sep 26", "👉 Oral lipoteichoic and lipoic acids improve insulin resistance and body composition in porphyria mice on a high-carbohydrate diet, Positive/therapeutic effect mentioned | week", "41004024"),
                    Reference("Front Nutr. 2025 Sep 10;12:1654637", "👉 High-protein oral nutritional supplement use in patients with cancer reduces complications and length of hospital stay: systematic review and meta-analysis, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day", "41001134"),

                    // Nutrients
                    Reference("Int J Mol Sci. 2025 Sep 15;26(18):8977", "👉 Genome-based Mexican diet bioactives target molecular pathways in HBV, HCV, and MASLD: a bioinformatic approach for liver disease prevention, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41009545"),
                    Reference("Nutr Cancer. 2025 Sep 25:1-12", "👉 Flaxseed oil inhibits hepatic preneoplastic lesions, DNA damage, and γ-H2AX expression during initial phases of hepatocarcinogenesis, Positive/therapeutic effect mentioned", "40999720")
                )
            )

            "Liver disease" -> Pair(
                """
Alternative approaches
1. Management of hepatotoxicity associated with CDK4/6 inhibitors and rechallenge strategies, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Current and investigational biomarkers of liver disease in HIV-HBV co-infection, G,G
3. Performance of simultaneous multislice diffusion-weighted imaging for assessment of microvascular invasion and histologic grade, Positive/therapeutic effect mentioned

Herbs
1. Premna puberula P. ethyl acetate extract treats ulcerative colitis by regulating intestinal flora and improving serum metabolism, Positive/therapeutic effect mentioned
2. Herbal terpenoids activate autophagy and mitophagy through modulation of bioenergetics and protect from metabolic stress, sarcopenia, and epigenetic aging, Positive/therapeutic effect mentioned
3. Laurolitsine ameliorates insulin resistance, ovarian dysfunction, and gut microbiota dysbiosis, Positive/therapeutic effect mentioned

Amino acids
1. Adenine base editing rescues disrupted BCKDH function and reduces BCAAs toxic accumulation in maple syrup urine disease patient iPSC-hepatic organoids, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Longitudinal effects of Glecaprevir/Pibrentasvir on liver function, fibrosis, and hepatocellular carcinoma risk, month
3. Tryptophan catabolites from microbiota ameliorate immune-mediated hepatitis through activating aryl hydrocarbon receptor of T cells, Positive/therapeutic effect mentioned

Vitamins
1. Identification of riboflavin metabolism pathway in HepG2 cells expressing genotype IV swine hepatitis E virus ORF3 protein, G,G
2. Water-soluble vitamins (Riboflavin, Niacin, Pantothenic Acid) in dogs with chronic liver disease vs. healthy controls, Positive/therapeutic effect mentioned | month
3. Treatment with CFTR modulators for cystic fibrosis, Positive/therapeutic effect mentioned

Minerals
1. Therapeutic effect of selenium nanoparticles, sorafenib, and selenium-sorafenib nanocomplex, Negative/adverse effect mentioned
2. Treatment with CFTR modulators for cystic fibrosis, Positive/therapeutic effect mentioned
3. Sequential nanotheranostics based on hollow mesoporous silica loaded with doxorubicin, No clear dose/effect/duration found

Supplements
1. Management of hepatotoxicity associated with CDK4/6 inhibitors, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Effects of fennel essential oil supplementation on mitigating heat stress impacts on growth rate, blood biochemical parameters, and liver histopathology, g, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day
3. Drug metabolism and pharmacokinetics of Oxazolo[4,5-c]quinoline analogs as novel interleukin-33 inhibitors, No clear dose/effect/duration found

Nutrients
1. Systematic review of the effects of plant-based foods on metabolic outcomes in adults with MASLD, Positive/therapeutic effect mentioned
2. Effects of diet and exercise on mitochondrial health in metabolic dysfunction-associated steatotic liver disease (MASLD): role of ceramides, No clear dose/effect/duration found
3. Exercise-induced changes in enterohepatic communication are linked to liver steatosis resolution, Positive/therapeutic effect mentioned | week
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("J Cancer Res Clin Oncol. 2025 Sep 27;151(10):270", "👉 Management of hepatotoxicity associated with CDK4/6 inhibitors and rechallenge strategies in metastatic hormone-positive, HER2-negative breast cancer, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41014426"),
                    Reference("Curr HIV/AIDS Rep. 2025 Sep 27;22(1):46", "👉 Current and investigational biomarkers of liver disease in HIV-HBV co-infection, G,G", "41014390"),
                    Reference("Cancer Imaging. 2025 Sep 26;25(1):113", "👉 Performance of simultaneous multislice diffusion-weighted imaging for assessment of microvascular invasion and histologic grade in hepatocellular carcinoma, Positive/therapeutic effect mentioned", "41013810"),

                    // Herbs
                    Reference("Molecules. 2025 Sep 19;30(18):3809", "👉 Premna puberula P. ethyl acetate extract treats ulcerative colitis by regulating the intestinal flora and improving serum metabolism, Positive/therapeutic effect mentioned", "41011701"),
                    Reference("Nat Aging. 2025 Sep 24", "👉 Herbal terpenoids activate autophagy and mitophagy through modulation of bioenergetics and protect from metabolic stress, sarcopenia, and epigenetic aging, Positive/therapeutic effect mentioned", "40993327"),
                    Reference("Front Endocrinol (Lausanne). 2025 Sep 8;16:1517934", "👉 Laurolitsine ameliorates insulin resistance, ovarian dysfunction, and gut microbiota dysbiosis in DHEA plus HFD-induced PCOS mice, Positive/therapeutic effect mentioned", "40989123"),

                    // Amino acids
                    Reference("Stem Cell Res Ther. 2025 Sep 26;16(1):512", "👉 Adenine base editing rescues disrupted BCKDH function and reduces BCAAs toxic accumulation in maple syrup urine disease patient iPSC-hepatic organoids, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41013826"),
                    Reference("Medicina (Kaunas). 2025 Sep 4;61(9):1601", "👉 Longitudinal effects of Glecaprevir/Pibrentasvir on liver function, fibrosis, and hepatocellular carcinoma risk in chronic hepatitis C: a prospective multicenter cohort study, month", "41010992"),
                    Reference("Gut Microbes. 2025 Dec;17(1):2557979", "👉 Tryptophan catabolites from microbiota ameliorate immune-mediated hepatitis through activating aryl hydrocarbon receptor of T cells, Positive/therapeutic effect mentioned", "40995824"),

                    // Vitamins
                    Reference("Vet Sci. 2025 Sep 19;12(9):912", "👉 Identification of riboflavin metabolism pathway in HepG2 cells expressing genotype IV swine hepatitis E virus ORF3 protein, G,G", "41012837"),
                    Reference("Vet Sci. 2025 Sep 11;12(9):877", "👉 Water-soluble vitamins (Riboflavin, Niacin, Pantothenic Acid) in dogs with chronic liver disease vs. healthy controls, Positive/therapeutic effect mentioned | month", "41012802"),
                    Reference("Children (Basel). 2025 Aug 22;12(9):1104", "👉 Treatment with CFTR modulators for cystic fibrosis: what a pediatric gastroenterologist needs to know, Positive/therapeutic effect mentioned", "41006969"),

                    // Minerals
                    Reference("Biomolecules. 2025 Sep 18;15(9):1336", "👉 Therapeutic effect of selenium nanoparticles, sorafenib, and selenium-sorafenib nanocomplex in the lungs and kidneys of mice with TAA-induced HCC, Negative/adverse effect mentioned", "41008643"),
                    Reference("Children (Basel). 2025 Aug 22;12(9):1104", "👉 Treatment with CFTR modulators for cystic fibrosis, Positive/therapeutic effect mentioned", "41006969"),
                    Reference("Drug Deliv. 2025 Dec;32(1):2559838", "👉 Sequential nanotheranostics based on hollow mesoporous silica loaded with doxorubicin and seed kernel extract from Mangifera indica L. as adjuvant therapy against hepatocellular carcinoma, No clear dose/effect/duration found", "40984734"),

                    // Supplements
                    Reference("J Cancer Res Clin Oncol. 2025 Sep 27;151(10):270", "👉 Management of hepatotoxicity associated with CDK4/6 inhibitors and rechallenge strategies in metastatic hormone-positive, HER2-negative breast cancer, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41014426"),
                    Reference("Vet Sci. 2025 Aug 27;12(9):825", "👉 Effects of fennel essential oil supplementation on mitigating heat stress impacts on growth rate, blood biochemical parameters, and liver histopathology in broiler chickens, g, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day", "41012750"),
                    Reference("Pharmaceutics. 2025 Sep 3;17(9):1153", "👉 Drug metabolism and pharmacokinetics of Oxazolo[4,5-c]quinoline analogs as novel interleukin-33 inhibitors, No clear dose/effect/duration found", "41012490"),

                    // Nutrients
                    Reference("Nutrients. 2025 Sep 22;17(18):3020", "👉 Systematic review of the effects of plant-based foods on metabolic outcomes in adults with MASLD and comorbidities such as obesity, metabolic syndrome, and type 2 diabetes, Positive/therapeutic effect mentioned", "41010543"),
                    Reference("Nutrients. 2025 Sep 16;17(18):2972", "👉 Effects of diet and exercise on mitochondrial health in metabolic dysfunction-associated steatotic liver disease (MASLD): role of ceramides, No clear dose/effect/duration found", "41010498"),
                    Reference("Nutrients. 2025 Sep 15;17(18):2962", "👉 Exercise-induced changes in enterohepatic communication are linked to liver steatosis resolution, Positive/therapeutic effect mentioned | week", "41010487")
                )
            )

            "Lung cancer" -> Pair(
                """
Alternative approaches
1. Cost Eff Resour Alloc. Economic evaluation of three domestic bevacizumab biosimilars and the original bevacizumab for treating nonsquamous non-small cell lung cancer in China: a cost-effectiveness analysis, Positive/therapeutic effect mentioned
2. BMC Gastroenterol. Cancer disparities in lean vs. non-lean MASH: insight from a national inpatient sample, No clear dose/effect/duration found
3. J Clin Med. Simultaneous use of dual bronchoscopes for targeted biopsy of peripheral lung lesions: The Kissing Probe Technique, Positive/therapeutic effect mentioned

Herbs
1. Mar Drugs. Design and synthesis of marine-inspired Itampolin A derivatives to overcome chemoresistance in NSCLC via cholesterol homeostasis modulation, No clear dose/effect/duration found
2. Phytomedicine. Development of a compound herbal formulation (HBK) with antitumor and antioxidant functions for cancer adjuvant therapy, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Food Sci Nutr. Eugenol: an insight into the anticancer perspective and pharmacological aspects, mg | Positive/therapeutic effect mentioned

Amino acids
1. Breast Cancer Res. Glutamine synthetase shields triple-negative breast cancer cells from ferroptosis in metastasis triggered by glutamine deprivation, Positive/therapeutic effect mentioned
2. ACS Appl Mater Interfaces. Nanometabolomics elucidated Paclitaxel/Mo(4/3)B(2-x) bifunctional nanomedicine-based lung cancer therapy through regulated amino acid metabolism, mg | Positive/therapeutic effect mentioned
3. Oncogene. Targeting ZNRF2-mediated SLC3A2 plasma membrane translocation enhances ferroptosis in lung adenocarcinoma, Positive/therapeutic effect mentioned

Vitamins
1. J Cancer Res Ther. Hepatoid carcinoma of pancreas: diagnostic challenges and literature review, Positive/therapeutic effect mentioned
2. J Funct Biomater. Bio-functional nanomaterials for enhanced lung cancer therapy: the synergistic roles of vitamins D and K, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Front Endocrinol (Lausanne). Propensity score-matched analysis of the '2+2' parathyroid strategy in total thyroidectomy with central neck dissection, G | Positive/therapeutic effect mentioned

Minerals
1. Biomolecules. Therapeutic effect of selenium nanoparticles, sorafenib, and selenium-sorafenib nanocomplex in the lungs and kidneys of mice with TAA-induced HCC, Negative/adverse effect mentioned
2. Ann Glob Health. Challenges in identifying and diagnosing asbestos-related diseases in emerging economies: a global health perspective, No clear dose/effect/duration found
3. MedComm (2020). A combined model based on bone mineral density for noninvasive prediction of prognosis in NSCLC patients receiving immune checkpoint inhibitors: a multicenter retrospective study, Positive/therapeutic effect mentioned

Supplements
1. Medicina (Kaunas). Clinical evidence for microbiome-based strategies in cancer immunotherapy: a state-of-the-art review, Positive/therapeutic effect mentioned | day
2. Front Nutr. High-protein oral nutritional supplement use in patients with cancer reduces complications and length of hospital stay: a systematic review and meta-analysis, g | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day
3. Int J Biol Macromol. Structural characterization and biological activities of sulfated polysaccharides from Antrodia cinnamomea, μg | day

Nutrients
1. Molecules. Ginsenosides enhanced apoptosis of serum-free starved A549 lung cancer cells, Negative/adverse effect mentioned
2. Nutrients. Vitamin A intake and risk of cancer incidence: insights from a case-control study, µg
3. Chin Clin Oncol. Nutrition in lung cancer treatment: the forgotten pillar of care?, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Cost Eff Resour Alloc. 2025 Sep 26;23(1):47", "👉 Economic evaluation of three domestic bevacizumab biosimilars and the original bevacizumab for treating nonsquamous non-small cell lung cancer in China: a cost-effectiveness analysis, Positive/therapeutic effect mentioned", "41013454"),
                    Reference("BMC Gastroenterol. 2025 Sep 26;25(1):659", "👉 Cancer disparities in lean vs. non-lean MASH: insight from a national inpatient sample, No clear dose/effect/duration found", "41013214"),
                    Reference("J Clin Med. 2025 Sep 12;14(18):6425", "👉 Simultaneous use of dual bronchoscopes for targeted biopsy of peripheral lung lesions: The Kissing Probe Technique, Positive/therapeutic effect mentioned", "41010630"),

                    // Herbs
                    Reference("Mar Drugs. 2025 Sep 15;23(9):357", "👉 Design and synthesis of marine-inspired Itampolin A derivatives to overcome chemoresistance in NSCLC via cholesterol homeostasis modulation, No clear dose/effect/duration found", "41003326"),
                    Reference("Phytomedicine. 2025 Nov;147:157212", "👉 Development of a compound herbal formulation (HBK) with antitumor and antioxidant functions for cancer adjuvant therapy, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40934759"),
                    Reference("Food Sci Nutr. 2025 Aug 3;13(8):e70727", "👉 Eugenol: an insight into the anticancer perspective and pharmacological aspects, mg | Positive/therapeutic effect mentioned", "40761498"),

                    // Amino acids
                    Reference("Breast Cancer Res. 2025 Sep 26;27(1):165", "👉 Glutamine synthetase shields triple-negative breast cancer cells from ferroptosis in metastasis triggered by glutamine deprivation, Positive/therapeutic effect mentioned", "41013471"),
                    Reference("ACS Appl Mater Interfaces. 2025 Sep 26", "👉 Nanometabolomics elucidated Paclitaxel/Mo(4/3)B(2-x) bifunctional nanomedicine-based lung cancer therapy through regulated amino acid metabolism, mg | Positive/therapeutic effect mentioned", "41004488"),
                    Reference("Oncogene. 2025 Sep 25", "👉 Targeting ZNRF2-mediated SLC3A2 plasma membrane translocation enhances ferroptosis in lung adenocarcinoma, Positive/therapeutic effect mentioned", "40999004"),

                    // Vitamins
                    Reference("J Cancer Res Ther. 2025 Jul 1;21(5):1075-1078", "👉 Hepatoid carcinoma of pancreas: diagnostic challenges and literature review, Positive/therapeutic effect mentioned", "41004299"),
                    Reference("J Funct Biomater. 2025 Sep 19;16(9):352", "👉 Bio-functional nanomaterials for enhanced lung cancer therapy: the synergistic roles of vitamins D and K, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41003423"),
                    Reference("Front Endocrinol (Lausanne). 2025 Sep 4;16:1646573", "👉 Propensity score-matched analysis of the '2+2' parathyroid strategy in total thyroidectomy with central neck dissection, G | Positive/therapeutic effect mentioned", "40979704"),

                    // Minerals
                    Reference("Biomolecules. 2025 Sep 18;15(9):1336", "👉 Therapeutic effect of selenium nanoparticles, sorafenib, and selenium-sorafenib nanocomplex in the lungs and kidneys of mice with TAA-induced HCC, Negative/adverse effect mentioned", "41008643"),
                    Reference("Ann Glob Health. 2025 Sep 18;90(1):65", "👉 Challenges in identifying and diagnosing asbestos-related diseases in emerging economies: a global health perspective, No clear dose/effect/duration found", "41000262"),
                    Reference("MedComm (2020). 2025 Sep 21;6(10):e70398", "👉 A combined model based on bone mineral density for noninvasive prediction of prognosis in NSCLC patients receiving immune checkpoint inhibitors: a multicenter retrospective study, Positive/therapeutic effect mentioned", "40989575"),

                    // Supplements
                    Reference("Medicina (Kaunas). 2025 Sep 4;61(9):1595", "👉 Clinical evidence for microbiome-based strategies in cancer immunotherapy: a state-of-the-art review, Positive/therapeutic effect mentioned | day", "41010985"),
                    Reference("Front Nutr. 2025 Sep 10;12:1654637", "👉 High-protein oral nutritional supplement use in patients with cancer reduces complications and length of hospital stay: a systematic review and meta-analysis, g | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day", "41001134"),
                    Reference("Int J Biol Macromol. 2025 Sep 19;329(Pt 1):147801", "👉 Structural characterization and biological activities of sulfated polysaccharides from Antrodia cinnamomea, μg | day", "40976303"),

                    // Nutrients
                    Reference("Molecules. 2025 Sep 11;30(18):3697", "👉 Ginsenosides enhanced apoptosis of serum-free starved A549 lung cancer cells, Negative/adverse effect mentioned", "41011591"),
                    Reference("Nutrients. 2025 Aug 25;17(17):2744", "👉 Vitamin A intake and risk of cancer incidence: insights from a case-control study, µg", "40944135"),
                    Reference("Chin Clin Oncol. 2025 Aug;14(4):43", "👉 Nutrition in lung cancer treatment: the forgotten pillar of care?, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40897298")
                )
            )

            "Lung conditions" -> Pair(
                """
Alternative approaches
1. BMC Gastroenterol. Cancer disparities in lean vs. non-lean MASH: insight from a national inpatient sample, No clear dose/effect/duration found
2. Toxics. Smoking topography, nicotine kinetics, and subjective smoking experience of mentholated and non-mentholated heated tobacco products in occasional smokers, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Antibiotics (Basel). Multidrug-resistant Escherichia coli associated with respiratory and systemic infection in a domestic rabbit in Romania: first confirmed case, Positive/therapeutic effect mentioned

Herbs
1. Comput Biol Chem. Discovery and validation of novel drug combinations for pulmonary fibrosis via Traditional Chinese Medicine insights and computer screening, g | Positive/therapeutic effect mentioned
2. J Ethnopharmacol. Chimonanthus salicifolius essential oil protects against endotoxin-induced acute lung injury via suppression of β2 integrin-mediated neutrophil adhesion and chemotaxis, Positive/therapeutic effect mentioned
3. Front Chem. Integrative UHPLC-HRMS and computational biology reveal ferroptosis and anoikis targeting by Wenpitongluo decoction in cardiorenal syndrome, No clear dose/effect/duration found

Amino acids
1. Pharmaceutics. Influence of different amino acids on the aerosolization, stability and cytotoxicity of spray-dried cannabidiol dry powder for inhalation, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day
2. ACS Appl Mater Interfaces. Nanometabolomics elucidated Paclitaxel/Mo(4/3)B(2-x) bifunctional nanomedicine-based lung cancer therapy through regulated amino acid metabolism, mg | Positive/therapeutic effect mentioned
3. Adv Mater. Supramolecular amino acids-encoded nanodots (SEND) with pH- and ion-responsive phase separation for serum-tolerant cytosolic protein delivery, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Vitamins
1. Front Public Health. Clinical characteristics, management, and outcomes of cadmium poisoning: a systematic review of case reports and case series, Positive/therapeutic effect mentioned
2. Cureus. Beyond the acute phase: persistent pulmonary findings after COVID-19 in Hungary, Positive/therapeutic effect mentioned
3. BMC Cancer. Evaluating the anticancer properties of VAF: a novel folate-α-tocopherol conjugate against lung cancer cells, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Minerals
1. Ann Glob Health. Challenges in identifying and diagnosing asbestos-related diseases in emerging economies: a global health perspective, No clear dose/effect/duration found
2. Lancet Rheumatol. The global, regional, and national burden attributable to low bone mineral density, 1990-2020: an analysis of a modifiable risk factor from the Global Burden of Disease Study 2021, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Food Sci Nutr. Unveiling the phytochemical profile and anti-cancer potential of Lantana camara leaf and root extracts against MCF-7, HepG2, and A549 cancer cell lines, μg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Supplements
1. J Tradit Chin Med. Jianpi Yifei Tongluo recipe attenuates inflammation by promoting the expression of interferon regulatory factor 4 in the rat model of chronic obstructive pulmonary disease, Positive/therapeutic effect mentioned
2. Nutrients. Lacticaseibacillus rhamnosus Probio-M9 alters the gut microbiota and mitigates pulmonary hypertension in a rat model, Positive/therapeutic effect mentioned
3. Nutrients. The microecological-immune axis in pediatric allergic diseases: imbalance mechanisms and regulatory interventions, Positive/therapeutic effect mentioned

Nutrients
1. Molecules. Ginsenosides enhanced apoptosis of serum-free starved A549 lung cancer cells, Negative/adverse effect mentioned
2. Nutrients. Lycium ruthenicum Murr. polysaccharide attenuated inflammatory response and intestinal flora dysbiosis in LPS-induced acute lung injury in mice, mg, μg | Positive/therapeutic effect mentioned | day
3. Nutrients. Lacticaseibacillus rhamnosus Probio-M9 alters the gut microbiota and mitigates pulmonary hypertension in a rat model, Positive/therapeutic effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("BMC Gastroenterol. 2025 Sep 26;25(1):659", "👉 Cancer disparities in lean vs. non-lean MASH: insight from a national inpatient sample, No clear dose/effect/duration found", "41013214"),
                    Reference("Toxics. 2025 Sep 6;13(9):757", "👉 Smoking topography, nicotine kinetics, and subjective smoking experience of mentholated and non-mentholated heated tobacco products in occasional smokers, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41012378"),
                    Reference("Antibiotics (Basel). 2025 Sep 14;14(9):929", "👉 Multidrug-resistant Escherichia coli associated with respiratory and systemic infection in a domestic rabbit in Romania: first confirmed case, Positive/therapeutic effect mentioned", "41009907"),

                    // Herbs
                    Reference("Comput Biol Chem. 2025 Aug 25;120(Pt 1):108660", "👉 Discovery and validation of novel drug combinations for pulmonary fibrosis via Traditional Chinese Medicine insights and computer screening, g | Positive/therapeutic effect mentioned", "40907460"),
                    Reference("J Ethnopharmacol. 2025 Sep 25;353(Pt B):120419", "👉 Chimonanthus salicifolius essential oil protects against endotoxin-induced acute lung injury via suppression of β2 integrin-mediated neutrophil adhesion and chemotaxis, Positive/therapeutic effect mentioned", "40816582"),
                    Reference("Front Chem. 2025 Jul 21;13:1617676", "👉 Integrative UHPLC-HRMS and computational biology reveal ferroptosis and anoikis targeting by Wenpitongluo decoction in cardiorenal syndrome, No clear dose/effect/duration found", "40761388"),

                    // Amino acids
                    Reference("Pharmaceutics. 2025 Aug 27;17(9):1120", "👉 Influence of different amino acids on the aerosolization, stability and cytotoxicity of spray-dried cannabidiol dry powder for inhalation, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day", "41012458"),
                    Reference("ACS Appl Mater Interfaces. 2025 Sep 26", "👉 Nanometabolomics elucidated Paclitaxel/Mo(4/3)B(2-x) bifunctional nanomedicine-based lung cancer therapy through regulated amino acid metabolism, mg | Positive/therapeutic effect mentioned", "41004488"),
                    Reference("Adv Mater. 2025 Sep 20:e14041", "👉 Supramolecular amino acids-encoded nanodots (SEND) with pH- and ion-responsive phase separation for serum-tolerant cytosolic protein delivery, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40974148"),

                    // Vitamins
                    Reference("Front Public Health. 2025 Sep 10;13:1651851", "👉 Clinical characteristics, management, and outcomes of cadmium poisoning: a systematic review of case reports and case series, Positive/therapeutic effect mentioned", "41000307"),
                    Reference("Cureus. 2025 Aug 19;17(8):e90542", "👉 Beyond the acute phase: persistent pulmonary findings after COVID-19 in Hungary, Positive/therapeutic effect mentioned", "40978879"),
                    Reference("BMC Cancer. 2025 Sep 16;25(1):1423", "👉 Evaluating the anticancer properties of VAF: a novel folate-α-tocopherol conjugate against lung cancer cells, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40958098"),

                    // Minerals
                    Reference("Ann Glob Health. 2025 Sep 18;90(1):65", "👉 Challenges in identifying and diagnosing asbestos-related diseases in emerging economies: a global health perspective, No clear dose/effect/duration found", "41000262"),
                    Reference("Lancet Rheumatol. 2025 Sep 16:S2665-9913(25)00105-5", "👉 The global, regional, and national burden attributable to low bone mineral density, 1990-2020: an analysis of a modifiable risk factor from the Global Burden of Disease Study 2021, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40972625"),
                    Reference("Food Sci Nutr. 2025 Sep 11;13(9):e70915", "👉 Unveiling the phytochemical profile and anti-cancer potential of Lantana camara leaf and root extracts against MCF-7, HepG2, and A549 cancer cell lines, μg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40951590"),

                    // Supplements
                    Reference("J Tradit Chin Med. 2025 Oct;45(5):1048-1058", "👉 Jianpi Yifei Tongluo recipe attenuates inflammation by promoting the expression of interferon regulatory factor 4 in the rat model of chronic obstructive pulmonary disease, Positive/therapeutic effect mentioned", "41015803"),
                    Reference("Nutrients. 2025 Sep 11;17(18):2927", "👉 Lacticaseibacillus rhamnosus Probio-M9 alters the gut microbiota and mitigates pulmonary hypertension in a rat model, Positive/therapeutic effect mentioned", "41010453"),
                    Reference("Nutrients. 2025 Sep 11;17(18):2925", "👉 The microecological-immune axis in pediatric allergic diseases: imbalance mechanisms and regulatory interventions, Positive/therapeutic effect mentioned", "41010451"),

                    // Nutrients
                    Reference("Molecules. 2025 Sep 11;30(18):3697", "👉 Ginsenosides enhanced apoptosis of serum-free starved A549 lung cancer cells, Negative/adverse effect mentioned", "41011591"),
                    Reference("Nutrients. 2025 Sep 12;17(18):2944", "👉 Lycium ruthenicum Murr. polysaccharide attenuated inflammatory response and intestinal flora dysbiosis in LPS-induced acute lung injury in mice, mg, μg | Positive/therapeutic effect mentioned | day", "41010470"),
                    Reference("Nutrients. 2025 Sep 11;17(18):2927", "👉 Lacticaseibacillus rhamnosus Probio-M9 alters the gut microbiota and mitigates pulmonary hypertension in a rat model, Positive/therapeutic effect mentioned", "41010453")
                )
            )

            "Lupus" -> Pair(
                """
Alternative approaches
1. J Nephrol. Iptacopan/LNP023 and rituximab as rescue therapy in a patient with systemic lupus erythematosus-associated atypical haemolytic uraemic syndrome, No clear dose/effect/duration found
2. BMC Rheumatol. Effect of writing based on self-compassion on body image and psychological distress among women with systemic lupus erythematosus: a randomized clinical trial, Positive/therapeutic effect mentioned
3. Adv Ther. A Narrative Review of the Immunomodulatory Effects of Acthar(®) Gel Beyond Its Steroidogenic Properties, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Herbs
1. Reumatologia. Beyond conventional care: exploring complementary and alternative medicine for autoimmune disorders, No clear dose/effect/duration found
2. Food Funct. Apigenin ameliorates lupus nephritis by inhibiting SAT3 signaling in CD8(+) T cells, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Acta Pharm Sin B. Traditional Chinese medicine for the treatment of immune-related nephropathy: A review, Positive/therapeutic effect mentioned

Amino acids
1. Eur J Immunol. Aberrant Nutrient Metabolism in T Cells: Pathogenesis Insight and Therapeutic Target for Autoimmune Diseases, No clear dose/effect/duration found
2. J Biol Chem. Adductome-based identification of lysine monomethylation as a key post-translational protein modification in autoimmune diseases, No clear dose/effect/duration found
3. J Mol Model. Simulation of the trimeric globular head of C1q reveals temperature-sensitive network: implications for inflammation, No clear dose/effect/duration found

Vitamins
1. Lupus. Analysis of the serum 25(OH)D3 level and its correlation with immunological indexes in patients with systemic lupus erythematosus, No clear dose/effect/duration found
2. Arch Med Res. Regulation of intestinal permeability in health and disease: Possible therapeutic applications, No clear dose/effect/duration found
3. Lupus Sci Med. Vitamin D receptor expression level in patients with SLE and its relationship with vitamin D status, disease course and bone mineral density, No clear dose/effect/duration found

Minerals
1. Lupus Sci Med. Vitamin D receptor expression level in patients with SLE and its relationship with vitamin D status, disease course and bone mineral density, No clear dose/effect/duration found
2. Lupus Sci Med. Prevalence and determinants of vertebral fractures in a SLE cohort, Positive/therapeutic effect mentioned
3. Nutrients. A Systematic Review and Meta-Analysis of the Effects of Vitamin D on Systemic Lupus Erythematosus, Positive/therapeutic effect mentioned

Supplements
1. Neuromolecular Med. The Role of Gut Microbiota in Modulating Immune Signaling Pathways in Autoimmune Diseases, No clear dose/effect/duration found
2. Nutrients. A Systematic Review and Meta-Analysis of the Effects of Vitamin D on Systemic Lupus Erythematosus, Positive/therapeutic effect mentioned
3. Int Arch Allergy Immunol. Identification of ATG4B and NLRP1 as M1 Macrophage-Activating Related Plasma Proteins in Systemic Lupus Erythematosus via Multi-Omics Approaches, No clear dose/effect/duration found

Nutrients
1. Nutrients. A Systematic Review and Meta-Analysis of the Effects of Vitamin D on Systemic Lupus Erythematosus, Positive/therapeutic effect mentioned
2. Eur J Immunol. Aberrant Nutrient Metabolism in T Cells: Pathogenesis Insight and Therapeutic Target for Autoimmune Diseases, No clear dose/effect/duration found
3. Food Sci Nutr. The Anti-Lupus Plate: Mapping Nutritional Interventions to Inflammatory Pathways in Systemic Lupus Erythematosus, Positive/therapeutic effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("J Nephrol. 2025 Sep 25", "👉 Iptacopan/LNP023 and rituximab as rescue therapy in a patient with systemic lupus erythematosus-associated atypical haemolytic uraemic syndrome, No clear dose/effect/duration found", "40996634"),
                    Reference("BMC Rheumatol. 2025 Sep 24;9(1):106", "👉 Effect of writing based on self-compassion on body image and psychological distress among women with systemic lupus erythematosus: a randomized clinical trial, Positive/therapeutic effect mentioned", "40993830"),
                    Reference("Adv Ther. 2025 Sep 15", "👉 A Narrative Review of the Immunomodulatory Effects of Acthar(®) Gel Beyond Its Steroidogenic Properties, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40952620"),

                    // Herbs
                    Reference("Reumatologia. 2025 Feb 11;63(3):202-212", "👉 Beyond conventional care: exploring complementary and alternative medicine for autoimmune disorders, No clear dose/effect/duration found", "40678032"),
                    Reference("Food Funct. 2024 Sep 30;15(19):10020-10036", "👉 Apigenin ameliorates lupus nephritis by inhibiting SAT3 signaling in CD8(+) T cells, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "39283308"),
                    Reference("Acta Pharm Sin B. 2024 Jan;14(1):38-66", "👉 Traditional Chinese medicine for the treatment of immune-related nephropathy: A review, Positive/therapeutic effect mentioned", "38239236"),

                    // Amino acids
                    Reference("Eur J Immunol. 2025 Sep;55(9):e70059", "👉 Aberrant Nutrient Metabolism in T Cells: Pathogenesis Insight and Therapeutic Target for Autoimmune Diseases, No clear dose/effect/duration found", "40936324"),
                    Reference("J Biol Chem. 2025 Sep 4;301(10):110684", "👉 Adductome-based identification of lysine monomethylation as a key post-translational protein modification in autoimmune diseases, No clear dose/effect/duration found", "40914246"),
                    Reference("J Mol Model. 2025 Aug 13;31(9):247", "👉 Simulation of the trimeric globular head of C1q reveals temperature-sensitive network: implications for inflammation, No clear dose/effect/duration found", "40801960"),

                    // Vitamins
                    Reference("Lupus. 2025 Sep 26:9612033251380872", "👉 Analysis of the serum 25(OH)D3 level and its correlation with immunological indexes in patients with systemic lupus erythematosus, No clear dose/effect/duration found", "41004708"),
                    Reference("Arch Med Res. 2025 Sep 17;57(3):103321", "👉 Regulation of intestinal permeability in health and disease: Possible therapeutic applications, No clear dose/effect/duration found", "40967091"),
                    Reference("Lupus Sci Med. 2025 Sep 16;12(2):e001730", "👉 Vitamin D receptor expression level in patients with SLE and its relationship with vitamin D status, disease course and bone mineral density, No clear dose/effect/duration found", "40962362"),

                    // Minerals
                    Reference("Lupus Sci Med. 2025 Sep 16;12(2):e001730", "👉 Vitamin D receptor expression level in patients with SLE and its relationship with vitamin D status, disease course and bone mineral density, No clear dose/effect/duration found", "40962362"),
                    Reference("Lupus Sci Med. 2025 Sep 14;12(2):e001508", "👉 Prevalence and determinants of vertebral fractures in a SLE cohort, Positive/therapeutic effect mentioned", "40953912"),
                    Reference("Nutrients. 2025 Aug 28;17(17):2794", "👉 A Systematic Review and Meta-Analysis of the Effects of Vitamin D on Systemic Lupus Erythematosus, Positive/therapeutic effect mentioned", "40944182"),

                    // Supplements
                    Reference("Neuromolecular Med. 2025 Sep 17;27(1):65", "👉 The Role of Gut Microbiota in Modulating Immune Signaling Pathways in Autoimmune Diseases, No clear dose/effect/duration found", "40963074"),
                    Reference("Nutrients. 2025 Aug 28;17(17):2794", "👉 A Systematic Review and Meta-Analysis of the Effects of Vitamin D on Systemic Lupus Erythematosus, Positive/therapeutic effect mentioned", "40944182"),
                    Reference("Int Arch Allergy Immunol. 2025 Sep 2:1-24", "👉 Identification of ATG4B and NLRP1 as M1 Macrophage-Activating Related Plasma Proteins in Systemic Lupus Erythematosus via Multi-Omics Approaches, No clear dose/effect/duration found", "40892678"),

                    // Nutrients
                    Reference("Nutrients. 2025 Aug 28;17(17):2794", "👉 A Systematic Review and Meta-Analysis of the Effects of Vitamin D on Systemic Lupus Erythematosus, Positive/therapeutic effect mentioned", "40944182"),
                    Reference("Eur J Immunol. 2025 Sep;55(9):e70059", "👉 Aberrant Nutrient Metabolism in T Cells: Pathogenesis Insight and Therapeutic Target for Autoimmune Diseases, No clear dose/effect/duration found", "40936324"),
                    Reference("Food Sci Nutr. 2025 Sep 1;13(9):e70890", "👉 The Anti-Lupus Plate: Mapping Nutritional Interventions to Inflammatory Pathways in Systemic Lupus Erythematosus, Positive/therapeutic effect mentioned", "40901658")
                )
            )

            "Lymphoma" -> Pair(
                """
Alternative approaches
1. Clin Lymphoma Myeloma Leuk. When ICAN(S) Becomes ICAN'T: Clinician and Staff Perspectives on In-Hospital Neurotoxicity Grading, Negative/adverse effect mentioned
2. Int J Toxicol. Incidence of Neoplasms and Selected Non-Neoplastic Findings in Control and Positive Control Groups in CByB6F1-Tg(HRAS)2Jic Hemizygous (rasH2(TM)) Mouse Carcinogenicity Studies, Negative/adverse effect mentioned | week
3. BMC Gastroenterol. Cancer disparities in lean vs. non-lean MASH: insight from a national inpatient sample, No clear dose/effect/duration found

Herbs
1. Chin Med J (Engl). Erianin induces GSDMD-dependent pyroptosis and synergistically enhances doxorubicin efficacy via the PI3K/AKT signaling pathway in diffuse large B-cell lymphoma, No clear dose/effect/duration found
2. Int J Mol Sci. Dalbergia odorifera Trans-Nerolidol Protects Against Myocardial Ischemia via Downregulating Cytochrome- and Caspases-Signaling Pathways in Isoproterenol-Induced Rats, Positive/therapeutic effect mentioned
3. Int J Biol Macromol. Spectroscopic study and in vitro anticancer effect toward colorectal cancer cells of a hydroxyaurone leptosidin compound complexed with transferrin, Positive/therapeutic effect mentioned

Amino acids
1. Nutrients. Protective Effects of Coixol Against Nε-Carboxymethyllysine-Induced Injury in IMR-32 Neuronal Cells: Modulation of Endoplasmic Reticulum Stress and Amyloidogenic Pathways, Positive/therapeutic effect mentioned
2. Biomolecules. MYC and Metabolomics: Can We Use What We Know for DLBCL Subtyping and Diagnosis?, Positive/therapeutic effect mentioned
3. Nat Commun. V-ATPase-dependent induction of selective autophagy, No clear dose/effect/duration found

Vitamins
1. Asian Pac J Cancer Prev. Serum Vitamin D Levels and Vitamin D Receptor Concentrations in Children with Acute Lymphoblastic Leukemia: A Cross-Sectional Study, No clear dose/effect/duration found
2. Tidsskr Nor Laegeforen. Ein mann i 30-åra med psykose og nøytropeni, Positive/therapeutic effect mentioned
3. Front Oncol. HIV-associated gut dysbiosis drives oncogenesis through metabolic-immune crosstalk: mechanisms and therapeutic implications, Positive/therapeutic effect mentioned

Minerals
1. Top Companion Anim Med. Disseminated B-cell lymphoma of the urogenital tract in a guinea pig (Cavia porcellus), No clear dose/effect/duration found
2. J Biochem Mol Toxicol. Columbianadin Ameliorate Osteoporosis Against Glucocorticoid Induced Osteoporosis in Rats via Alteration of RANK/RANKL/OPG Signaling Pathway, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Cancer Epidemiol. Global trends, future projections, and epidemiological associations of Mesothelioma: A comprehensive analysis from 1980 to 2050, No clear dose/effect/duration found

Supplements
1. J Anim Sci. Zinc-loaded montmorillonite alleviates avian pathogenic Escherichia coli-induced intestinal barrier damage in broiler chickens, g, mg | Positive/therapeutic effect mentioned
2. Zhonghua Bing Li Xue Za Zhi. [Monomorphic epitheliotropic intestinal T-cell lymphoma: a clinicopathological and genetic mutation characteristics analysis of forty-two cases], month
3. Brain Res. Neuroprotective effects of Lactiplantibacillus plantarum and Pediococcus pentosaceus strains against oxidative stress via modulation of Nrf2-mediated antioxidation and anti-apoptosis, Positive/therapeutic effect mentioned

Nutrients
1. Nutrients. Protective Effects of Coixol Against Nε-Carboxymethyllysine-Induced Injury in IMR-32 Neuronal Cells: Modulation of Endoplasmic Reticulum Stress and Amyloidogenic Pathways, Positive/therapeutic effect mentioned
2. Nat Commun. V-ATPase-dependent induction of selective autophagy, No clear dose/effect/duration found
3. Nutrients. Not All Weight Loss Is Equal: Divergent Patterns and Prognostic Roles in Head and Neck Cancer Versus High-Grade B-Cell Lymphoma, G | Positive/therapeutic effect mentioned | month
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Clin Lymphoma Myeloma Leuk. 2025 Sep 3:S2152-2650(25)02890-3", "👉 When ICAN(S) Becomes ICAN'T: Clinician and Staff Perspectives on In-Hospital Neurotoxicity Grading, Negative/adverse effect mentioned", "41015712"),
                    Reference("Int J Toxicol. 2025 Sep 27:10915818251382087", "👉 Incidence of Neoplasms and Selected Non-Neoplastic Findings in Control and Positive Control Groups in CByB6F1-Tg(HRAS)2Jic Hemizygous (rasH2(TM)) Mouse Carcinogenicity Studies, Negative/adverse effect mentioned | week", "41014102"),
                    Reference("BMC Gastroenterol. 2025 Sep 26;25(1):659", "👉 Cancer disparities in lean vs. non-lean MASH: insight from a national inpatient sample, No clear dose/effect/duration found", "41013214"),

                    // Herbs
                    Reference("Chin Med J (Engl). 2025 Aug 20", "👉 Erianin induces GSDMD-dependent pyroptosis and synergistically enhances doxorubicin efficacy via the PI3K/AKT signaling pathway in diffuse large B-cell lymphoma, No clear dose/effect/duration found", "40830921"),
                    Reference("Int J Mol Sci. 2025 Mar 3;26(5):2251", "👉 Dalbergia odorifera Trans-Nerolidol Protects Against Myocardial Ischemia via Downregulating Cytochrome- and Caspases-Signaling Pathways in Isoproterenol-Induced Rats, Positive/therapeutic effect mentioned", "40076873"),
                    Reference("Int J Biol Macromol. 2024 Dec;282(Pt 3):136874", "👉 Spectroscopic study and in vitro anticancer effect toward colorectal cancer cells of a hydroxyaurone leptosidin compound complexed with transferrin, Positive/therapeutic effect mentioned", "39476908"),

                    // Amino acids
                    Reference("Nutrients. 2025 Sep 12;17(18):2939", "👉 Protective Effects of Coixol Against Nε-Carboxymethyllysine-Induced Injury in IMR-32 Neuronal Cells: Modulation of Endoplasmic Reticulum Stress and Amyloidogenic Pathways, Positive/therapeutic effect mentioned", "41010465"),
                    Reference("Biomolecules. 2025 Sep 20;15(9):1346", "👉 MYC and Metabolomics: Can We Use What We Know for DLBCL Subtyping and Diagnosis?, Positive/therapeutic effect mentioned", "41008653"),
                    Reference("Nat Commun. 2025 Sep 26;16(1):8508", "👉 V-ATPase-dependent induction of selective autophagy, No clear dose/effect/duration found", "41006286"),

                    // Vitamins
                    Reference("Asian Pac J Cancer Prev. 2025 Sep 1;26(9):3265-3270", "👉 Serum Vitamin D Levels and Vitamin D Receptor Concentrations in Children with Acute Lymphoblastic Leukemia: A Cross-Sectional Study, No clear dose/effect/duration found", "40952281"),
                    Reference("Tidsskr Nor Laegeforen. 2025 Aug 25;145(10)", "👉 Ein mann i 30-åra med psykose og nøytropeni, Positive/therapeutic effect mentioned", "40923177"),
                    Reference("Front Oncol. 2025 Aug 21;15:1634388", "👉 HIV-associated gut dysbiosis drives oncogenesis through metabolic-immune crosstalk: mechanisms and therapeutic implications, Positive/therapeutic effect mentioned", "40919140"),

                    // Minerals
                    Reference("Top Companion Anim Med. 2025 Sep 1;69:101020", "👉 Disseminated B-cell lymphoma of the urogenital tract in a guinea pig (Cavia porcellus), No clear dose/effect/duration found", "40902723"),
                    Reference("J Biochem Mol Toxicol. 2025 Aug;39(8):e70432", "👉 Columbianadin Ameliorate Osteoporosis Against Glucocorticoid Induced Osteoporosis in Rats via Alteration of RANK/RANKL/OPG Signaling Pathway, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40791102"),
                    Reference("Cancer Epidemiol. 2025 Oct;98:102900", "👉 Global trends, future projections, and epidemiological associations of Mesothelioma: A comprehensive analysis from 1980 to 2050, No clear dose/effect/duration found", "40782460"),

                    // Supplements
                    Reference("J Anim Sci. 2025 Sep 24:skaf327", "👉 Zinc-loaded montmorillonite alleviates avian pathogenic Escherichia coli-induced intestinal barrier damage in broiler chickens, g, mg | Positive/therapeutic effect mentioned", "40990821"),
                    Reference("Zhonghua Bing Li Xue Za Zhi. 2025 Sep 8;54(9):932-939", "👉 [Monomorphic epitheliotropic intestinal T-cell lymphoma: a clinicopathological and genetic mutation characteristics analysis of forty-two cases], month", "40921667"),
                    Reference("Brain Res. 2025 Nov 1;1866:149925", "👉 Neuroprotective effects of Lactiplantibacillus plantarum and Pediococcus pentosaceus strains against oxidative stress via modulation of Nrf2-mediated antioxidation and anti-apoptosis, Positive/therapeutic effect mentioned", "40907592"),

                    // Nutrients
                    Reference("Nutrients. 2025 Sep 12;17(18):2939", "👉 Protective Effects of Coixol Against Nε-Carboxymethyllysine-Induced Injury in IMR-32 Neuronal Cells: Modulation of Endoplasmic Reticulum Stress and Amyloidogenic Pathways, Positive/therapeutic effect mentioned", "41010465"),
                    Reference("Nat Commun. 2025 Sep 26;16(1):8508", "👉 V-ATPase-dependent induction of selective autophagy, No clear dose/effect/duration found", "41006286"),
                    Reference("Nutrients. 2025 Jul 31;17(15):2530", "👉 Not All Weight Loss Is Equal: Divergent Patterns and Prognostic Roles in Head and Neck Cancer Versus High-Grade B-Cell Lymphoma, G | Positive/therapeutic effect mentioned | month", "40806115")
                )
            )

            "Mastitis" -> Pair(
                """
Alternative approaches
1. Vet Sci. In Vitro Antibacterial Activity of Ethanolic Extracts Obtained from Plants Grown in Tolima, Colombia, Against Bacteria Associated with Bovine Mastitis, Negative/adverse effect mentioned
2. Vet Sci. Comprehensive Prevention and Control of Mastitis in Dairy Cows: From Etiology to Prevention, Positive/therapeutic effect mentioned
3. Vet Res. Pheno- and genotypic iron acquisition of non-aureus staphylococci: a scoping review of literature with a focus on bovine mastitis, No clear dose/effect/duration found

Herbs
1. Cytokine. Anti-inflammatory effects of apigenin on LPS-induced mastitis in lactating SD rats through inhibiting TLR4/NF-κB signaling pathway, Positive/therapeutic effect mentioned
2. Int J Biol Macromol. Astragalus polysaccharide alleviates mastitis disrupted by Staphylococcus aureus infection by regulating gut microbiota and SCFAs metabolism, Positive/therapeutic effect mentioned
3. Microbiol Spectr. Gardenoside attenuates Staphylococcus aureus-induced mastitis by inhibiting inflammation and ferroptosis through Nrf2/SLC7A11/GPX4 signaling pathway, Positive/therapeutic effect mentioned

Amino acids
1. Microorganisms. Investigating the Alleviating Effects of Dihydromyricetin on Subclinical Mastitis in Dairy Cows: Insights from Gut Microbiota and Metabolomic Analysis, Positive/therapeutic effect mentioned
2. Int J Syst Evol Microbiol. Macrococcus animalis sp. nov. and Macrococcus equi sp. nov., isolated from different animals' origins, Positive/therapeutic effect mentioned
3. Int J Nanomedicine. Enhanced Antibacterial Effect of pH/Gelatinase-Responsive Florfenicol Nanogels Against Staphylococcus aureus, mg

Vitamins
1. Microorganisms. Investigating the Alleviating Effects of Dihydromyricetin on Subclinical Mastitis in Dairy Cows: Insights from Gut Microbiota and Metabolomic Analysis, Positive/therapeutic effect mentioned
2. Vet Res Commun. Metabolomic evidence of bovine leukemia virus regulation on ferroptosis in bovine mammary epithelial cells, Positive/therapeutic effect mentioned
3. Cabbage. Cabbage leaves applied topically to treat breast engorgement and as adjunct for mastitis, Positive/therapeutic effect mentioned

Minerals
1. J Sci Food Agric. NMR-based deep learning classification of raw cow's milk samples in different stages of mastitis, No clear dose/effect/duration found
2. PLoS One. An analysis of knowledge, attitude and practice gaps in scientific buffalo husbandry, No clear dose/effect/duration found
3. Biosens Bioelectron. Screening broad-spectrum aptamers for cephalosporin antibiotics using real samples and development of a DNA walker-driven dual-mode aptasensor, No clear dose/effect/duration found

Supplements
1. J Anim Physiol Anim Nutr (Berl). Combined Supplementation of Rumen-Protected Choline and Chromium Propionate as a Novel Feeding Strategy to Improve Lactation Performance, Immunity and Reduce Disease Incidence in Transition Dairy Cows, g | Positive/therapeutic effect mentioned | day
2. Curr Nutr Rep. Gut Health for Two: the Critical Role of Probiotics and Prebiotics in Pregnancy and Lactation, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Microorganisms. Investigating the Alleviating Effects of Dihydromyricetin on Subclinical Mastitis in Dairy Cows: Insights from Gut Microbiota and Metabolomic Analysis, Positive/therapeutic effect mentioned

Nutrients
1. Vet Clin North Am Food Anim Pract. Nutritional Challenges Related to Animal Welfare in Feedlot and Dairy Cattle, Positive/therapeutic effect mentioned
2. Nutrients. Factors Associated with Anthropometry Z-Scores in Exclusively Breastfed Infants Aged 0-6 Months in 10 Cities of China, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | Month, month
3. J Dairy Sci. Antimicrobial potential of a novel K5-specific phage and its recombinant strains against Klebsiella pneumoniae in milk, Positive/therapeutic effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Vet Sci. 2025 Sep 18;12(9):903", "👉 In Vitro Antibacterial Activity of Ethanolic Extracts Obtained from Plants Grown in Tolima, Colombia, Against Bacteria Associated with Bovine Mastitis, Negative/adverse effect mentioned", "41012828"),
                    Reference("Vet Sci. 2025 Aug 23;12(9):800", "👉 Comprehensive Prevention and Control of Mastitis in Dairy Cows: From Etiology to Prevention, Positive/therapeutic effect mentioned", "41012726"),
                    Reference("Vet Res. 2025 Sep 25;56(1):176", "👉 Pheno- and genotypic iron acquisition of non-aureus staphylococci: a scoping review of literature with a focus on bovine mastitis, No clear dose/effect/duration found", "40999503"),

                    // Herbs
                    Reference("Cytokine. 2025 Jul;191:156944", "👉 Anti-inflammatory effects of apigenin on LPS-induced mastitis in lactating SD rats through inhibiting TLR4/NF-κB signaling pathway, Positive/therapeutic effect mentioned", "40288318"),
                    Reference("Int J Biol Macromol. 2025 Jan;286:138422", "👉 Astragalus polysaccharide alleviates mastitis disrupted by Staphylococcus aureus infection by regulating gut microbiota and SCFAs metabolism, Positive/therapeutic effect mentioned", "39647752"),
                    Reference("Microbiol Spectr. 2025 Jan 7;13(1):e0226224", "👉 Gardenoside attenuates Staphylococcus aureus-induced mastitis by inhibiting inflammation and ferroptosis through Nrf2/SLC7A11/GPX4 signaling pathway, Positive/therapeutic effect mentioned", "39612214"),

                    // Amino acids
                    Reference("Microorganisms. 2025 Aug 13;13(8):1890", "👉 Investigating the Alleviating Effects of Dihydromyricetin on Subclinical Mastitis in Dairy Cows: Insights from Gut Microbiota and Metabolomic Analysis, Positive/therapeutic effect mentioned", "40871394"),
                    Reference("Int J Syst Evol Microbiol. 2025 Jul;75(7)", "👉 Macrococcus animalis sp. nov. and Macrococcus equi sp. nov., isolated from different animals' origins, Positive/therapeutic effect mentioned", "40737040"),
                    Reference("Int J Nanomedicine. 2025 Apr 23;20:5193-5208", "👉 Enhanced Antibacterial Effect of pH/Gelatinase-Responsive Florfenicol Nanogels Against Staphylococcus aureus, mg", "40292404"),

                    // Vitamins
                    Reference("Microorganisms. 2025 Aug 13;13(8):1890", "👉 Investigating the Alleviating Effects of Dihydromyricetin on Subclinical Mastitis in Dairy Cows: Insights from Gut Microbiota and Metabolomic Analysis, Positive/therapeutic effect mentioned", "40871394"),
                    Reference("Vet Res Commun. 2025 Aug 1;49(5):270", "👉 Metabolomic evidence of bovine leukemia virus regulation on ferroptosis in bovine mammary epithelial cells, Positive/therapeutic effect mentioned", "40748520"),
                    Reference("Cabbage. 2025 May 15", "👉 Cabbage leaves applied topically to treat breast engorgement and as adjunct for mastitis, Positive/therapeutic effect mentioned", "30000833"),

                    // Minerals
                    Reference("J Sci Food Agric. 2025 Sep 17", "👉 NMR-based deep learning classification of raw cow's milk samples in different stages of mastitis, No clear dose/effect/duration found", "40959907"),
                    Reference("PLoS One. 2025 Jul 31;20(7):e0327208", "👉 An analysis of knowledge, attitude and practice gaps in scientific buffalo husbandry, No clear dose/effect/duration found", "40743269"),
                    Reference("Biosens Bioelectron. 2025 Jul 15;280:117446", "👉 Screening broad-spectrum aptamers for cephalosporin antibiotics using real samples and development of a DNA walker-driven dual-mode aptasensor, No clear dose/effect/duration found", "40203705"),

                    // Supplements
                    Reference("J Anim Physiol Anim Nutr (Berl). 2025 Sep 22", "👉 Combined Supplementation of Rumen-Protected Choline and Chromium Propionate as a Novel Feeding Strategy to Improve Lactation Performance, Immunity and Reduce Disease Incidence in Transition Dairy Cows, g | Positive/therapeutic effect mentioned | day", "40981516"),
                    Reference("Curr Nutr Rep. 2025 Sep 15;14(1):106", "👉 Gut Health for Two: the Critical Role of Probiotics and Prebiotics in Pregnancy and Lactation, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40952551"),
                    Reference("Microorganisms. 2025 Aug 13;13(8):1890", "👉 Investigating the Alleviating Effects of Dihydromyricetin on Subclinical Mastitis in Dairy Cows: Insights from Gut Microbiota and Metabolomic Analysis, Positive/therapeutic effect mentioned", "40871394"),

                    // Nutrients
                    Reference("Vet Clin North Am Food Anim Pract. 2025 Sep 3:S0749-0720(25)00039-8", "👉 Nutritional Challenges Related to Animal Welfare in Feedlot and Dairy Cattle, Positive/therapeutic effect mentioned", "40908242"),
                    Reference("Nutrients. 2025 Jun 29;17(13):2163", "👉 Factors Associated with Anthropometry Z-Scores in Exclusively Breastfed Infants Aged 0-6 Months in 10 Cities of China, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | Month, month", "40647268"),
                    Reference("J Dairy Sci. 2025 Jul;108(7):6788-6802", "👉 Antimicrobial potential of a novel K5-specific phage and its recombinant strains against Klebsiella pneumoniae in milk, Positive/therapeutic effect mentioned", "40306415")
                )
            )

            "Measles" -> Pair(
                """
Alternative approaches
1. Arch Razi Inst. Sensitivity of a Novel Lizard-Derived Cell Line (Z1) to Measles, Rubella and Respiratory Syncytial Viruses, No clear dose/effect/duration found
2. Curr Opin Urol. Oncolytic virus therapy for nonmuscle-invasive bladder cancer: current status and future directions, Positive/therapeutic effect mentioned | month
3. J Infect. Nowcasting cases and trends during the measles outbreak, No clear dose/effect/duration found

Herbs
1. Recent Adv Antiinfect Drug Discov. Antiviral Bioactive Compounds: Their Activities and Underlying Mechanisms Against Human Viral Infections, Negative/adverse effect mentioned
2. Int J Mol Sci. Antiviral Potential of Plants against COVID-19 during Outbreaks-An Update, Positive/therapeutic effect mentioned
3. Evid Based Complement Alternat Med. Determining Pharmacological Mechanisms of Chinese Incompatible Herbs Fuzi and Banxia in Chronic Obstructive Pulmonary Disease, No clear dose/effect/duration found

Amino acids
1. JCI Insight. Remdesivir postexposure prophylaxis limits measles-induced 'immune amnesia' and measles antibody responses in macaques, Positive/therapeutic effect mentioned
2. Biologicals. Ultra-high performance liquid chromatography with tandem mass spectrometry (UPLC-MS/MS) for simultaneous estimation of residual glyphosate and its metabolite (AMPA) in various vaccines, No clear dose/effect/duration found
3. Plants (Basel). Corchorus tridens L.: A Review of Its Botany, Phytochemistry, Nutritional Content and Pharmacological Properties, Positive/therapeutic effect mentioned

Vitamins
1. Lancet Glob Health. Routine immunisation coverage in the context of seasonal influenza vaccine introduction for children, Positive/therapeutic effect mentioned | month
2. Indian J Public Health. Risk Factors for Measles Outbreak in Pune City: A Case-Control Study, Positive/therapeutic effect mentioned
3. Int J Infect Dis. Public Health in the Age of TikTok: A Content Analysis of Measles Narratives, Negative/adverse effect mentioned

Minerals
1. Eur J Pediatr. Thiamine: An indispensable regulator of paediatric neuro-cardiovascular health and diseases, Positive/therapeutic effect mentioned
2. Plants (Basel). Corchorus tridens L.: A Review of Its Botany, Phytochemistry, Nutritional Content and Pharmacological Properties, Positive/therapeutic effect mentioned
3. Cureus. Associative Patterns Between Iron Deficiency Anemia and Febrile Seizures in the Five to 60 Months Age Group, Month

Supplements
1. Lancet Glob Health. Routine immunisation coverage in the context of seasonal influenza vaccine introduction for children, Positive/therapeutic effect mentioned | month
2. F1000Res. Micronutrient and protein-energy supplementation enhance vaccine responses in undernourished children: Evidence from a systematic review, Positive/therapeutic effect mentioned
3. Lancet. Global, regional, and national trends in routine childhood vaccination coverage with forecasts to 2030, G | Positive/therapeutic effect mentioned

Nutrients
1. F1000Res. Micronutrient and protein-energy supplementation enhance vaccine responses in undernourished children: Evidence from a systematic review, Positive/therapeutic effect mentioned
2. Lancet. Global, regional, and national trends in routine childhood vaccination coverage with forecasts to 2030, G | Positive/therapeutic effect mentioned
3. Eur J Pediatr. Thiamine: An indispensable regulator of paediatric neuro-cardiovascular health and diseases, Positive/therapeutic effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Arch Razi Inst. 2025 Feb 1;80(1):193-200", "👉 Sensitivity of a Novel Lizard-Derived Cell Line (Z1) to Measles, Rubella and Respiratory Syncytial Viruses, No clear dose/effect/duration found", "40951550"),
                    Reference("Curr Opin Urol. 2025 Sep 8", "👉 Oncolytic virus therapy for nonmuscle-invasive bladder cancer: current status and future directions, Positive/therapeutic effect mentioned | month", "40923119"),
                    Reference("J Infect. 2025 Sep;91(3):106569", "👉 Nowcasting cases and trends during the measles 2023/24 outbreak in England, No clear dose/effect/duration found", "40782889"),

                    // Herbs
                    Reference("Recent Adv Antiinfect Drug Discov. 2025 Apr 22", "👉 Antiviral Bioactive Compounds: Their Activities and Underlying Mechanisms Against Human Viral Infections, Negative/adverse effect mentioned", "40265436"),
                    Reference("Int J Mol Sci. 2022 Nov 5;23(21):13564", "👉 Antiviral Potential of Plants against COVID-19 during Outbreaks-An Update, Positive/therapeutic effect mentioned", "36362351"),
                    Reference("Evid Based Complement Alternat Med. 2020 Dec 31;2020:8365603", "👉 Determining Pharmacological Mechanisms of Chinese Incompatible Herbs Fuzi and Banxia in Chronic Obstructive Pulmonary Disease, No clear dose/effect/duration found", "33488748"),

                    // Amino acids
                    Reference("JCI Insight. 2025 Apr 22;10(11):e190740", "👉 Remdesivir postexposure prophylaxis limits measles-induced 'immune amnesia' and measles antibody responses in macaques, Positive/therapeutic effect mentioned", "40306326"),
                    Reference("Biologicals. 2025 May;90:101822", "👉 Ultra-high performance liquid chromatography with tandem mass spectrometry (UPLC-MS/MS) for simultaneous estimation of residual glyphosate and its metabolite (AMPA) in various vaccines, No clear dose/effect/duration found", "40007352"),
                    Reference("Plants (Basel). 2024 Apr 13;13(8):1096", "👉 Corchorus tridens L.: A Review of Its Botany, Phytochemistry, Nutritional Content and Pharmacological Properties, Positive/therapeutic effect mentioned", "38674505"),

                    // Vitamins
                    Reference("Lancet Glob Health. 2025 Oct;13(10):e1737-e1749", "👉 Routine immunisation coverage in the context of seasonal influenza vaccine introduction for children in Nakuru and Mombasa counties in Kenya, Positive/therapeutic effect mentioned | month", "40975081"),
                    Reference("Indian J Public Health. 2025 Sep 17", "👉 Risk Factors for Measles Outbreak in Pune City: A Case-Control Study, Positive/therapeutic effect mentioned", "40964759"),
                    Reference("Int J Infect Dis. 2025 Sep 11:108055", "👉 Public Health in the Age of TikTok: A Content Analysis of Measles Narratives, Negative/adverse effect mentioned", "40945903"),

                    // Minerals
                    Reference("Eur J Pediatr. 2024 Nov;183(11):4597-4610", "👉 Thiamine: An indispensable regulator of paediatric neuro-cardiovascular health and diseases, Positive/therapeutic effect mentioned", "39271555"),
                    Reference("Plants (Basel). 2024 Apr 13;13(8):1096", "👉 Corchorus tridens L.: A Review of Its Botany, Phytochemistry, Nutritional Content and Pharmacological Properties, Positive/therapeutic effect mentioned", "38674505"),
                    Reference("Cureus. 2024 Mar 19;16(3):e56470", "👉 Associative Patterns Between Iron Deficiency Anemia and Febrile Seizures in the Five to 60 Months Age Group, Month", "38638769"),

                    // Supplements
                    Reference("Lancet Glob Health. 2025 Oct;13(10):e1737-e1749", "👉 Routine immunisation coverage in the context of seasonal influenza vaccine introduction for children in Nakuru and Mombasa counties in Kenya, Positive/therapeutic effect mentioned | month", "40975081"),
                    Reference("F1000Res. 2025 Sep 11;14:507", "👉 Micronutrient and protein-energy supplementation enhance vaccine responses in undernourished children: Evidence from a systematic review, Positive/therapeutic effect mentioned", "40787612"),
                    Reference("Lancet. 2025 Jul 19;406(10500):235-260", "👉 Global, regional, and national trends in routine childhood vaccination coverage from 1980 to 2023 with forecasts to 2030, G | Positive/therapeutic effect mentioned", "40578370"),

                    // Nutrients
                    Reference("F1000Res. 2025 Sep 11;14:507", "👉 Micronutrient and protein-energy supplementation enhance vaccine responses in undernourished children: Evidence from a systematic review, Positive/therapeutic effect mentioned", "40787612"),
                    Reference("Lancet. 2025 Jul 19;406(10500):235-260", "👉 Global, regional, and national trends in routine childhood vaccination coverage from 1980 to 2023 with forecasts to 2030, G | Positive/therapeutic effect mentioned", "40578370"),
                    Reference("Eur J Pediatr. 2024 Nov;183(11):4597-4610", "👉 Thiamine: An indispensable regulator of paediatric neuro-cardiovascular health and diseases, Positive/therapeutic effect mentioned", "39271555")
                )
            )

            "Meningitis" -> Pair(
                """
Alternative approaches
1. Akkermansia muciniphila Impacts Group B Streptococcus Vaginal Colonization, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Confirmation bias in medical referrals: an unusual presentation of pain at the base of the skull, Positive/therapeutic effect mentioned
3. Middle meningeal artery embolization as a stand-alone treatment for primary and recurrent chronic subdural hematoma, Positive/therapeutic effect mentioned | day

Herbs
1. Promising Strategies to Reduce the SARS-CoV-2 Amyloid Deposition in the Brain and Prevent COVID-19-Exacerbated Dementia and Alzheimer's Disease, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Cronobacter spp. in foods of plant origin: occurrence, contamination routes, and pathogenic potential, Positive/therapeutic effect mentioned
3. Emergence of Cronobacter sakazakii in Cases of Neonatal Sepsis in Upper Egypt: First Report in North Africa, Positive/therapeutic effect mentioned

Amino acids
1. Characterizing tuberculous meningitis in a South African pediatric cohort using GCxGC-TOFMS metabolomics, Positive/therapeutic effect mentioned
2. A metabolic syndrome: Understanding host factors that drive mortality in tuberculosis meningitis, No clear dose/effect/duration found
3. Coxsackie B1 virus-like particle vaccine modified to exclude a highly conserved immunoreactive region from the capsid induces potent neutralizing antibodies and protects against infection in mice, µg, mg | Positive/therapeutic effect mentioned

Vitamins
1. Riboflavin inhibits growth and reduces virulence of Cryptococcus neoformans and exhibits efficacy against pulmonary cryptococcosis and meningitis, Positive/therapeutic effect mentioned
2. Inactivation of Emerging Opportunistic Foodborne Pathogens Cronobacter spp. and Arcobacter spp. on Fresh Fruit and Vegetable Products, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Intrathecal pemetrexed for newly diagnosed leptomeningeal metastases: a multicenter, open-label, phase I/II study, mg | Negative/adverse effect mentioned | week, month

Minerals
1. Inactivation of Emerging Opportunistic Foodborne Pathogens Cronobacter spp. and Arcobacter spp., Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Vestibular syndrome in dairy heifers associated with Mycobacterium bovis: two case reports, No clear dose/effect/duration found
3. Multicenter study on 2-year outcomes of dual application of hydroxyapatite cranioplasty and a nasoseptal flap, Positive/therapeutic effect mentioned | week, day, month

Supplements
1. Clinical characteristics and surgical outcomes between traumatic and nontraumatic cerebrospinal fluid rhinorrhea, No clear dose/effect/duration found
2. Global Prevalence of Non-Polio Enteroviruses Pre- and Post COVID-19 Pandemic, Positive/therapeutic effect mentioned
3. Efficacy of zinc supplementation for young infants with clinical severe infection in Tanzania: study protocol for a randomised controlled trial, mg | Positive/therapeutic effect mentioned | day

Nutrients
1. Histone demethylase LSD1 regulates lipid homeostasis during Cryptococcus neoformans infection, Positive/therapeutic effect mentioned
2. Causal Link of Seven Trace Elements and Eight Nutrients With Meningioma: A Bidirectional Two-Sample Mendelian Randomization Analysis, Positive/therapeutic effect mentioned
3. Morphology of the glymphatic and meningeal lymphatic structures of the bottlenose dolphin, No clear dose/effect/duration found
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("bioRxiv [Preprint]. 2025 Sep 18:2025.09.18.677025", "👉 Akkermansia muciniphila Impacts Group B Streptococcus Vaginal Colonization, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41000920"),
                    Reference("BMJ Case Rep. 2025 Sep 25;18(9):e267111", "👉 Confirmation bias in medical referrals: an unusual presentation of pain at the base of the skull, Positive/therapeutic effect mentioned", "40998548"),
                    Reference("Interv Neuroradiol. 2025 Sep 25:15910199251381492", "👉 Middle meningeal artery embolization as a stand-alone treatment for primary and recurrent chronic subdural hematoma, Positive/therapeutic effect mentioned | day", "40997252"),

                    // Herbs
                    Reference("Pharmaceuticals (Basel). 2024 Jun 16;17(6):788", "👉 Promising Strategies to Reduce the SARS-CoV-2 Amyloid Deposition in the Brain and Prevent COVID-19-Exacerbated Dementia and Alzheimer's Disease, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "38931455"),
                    Reference("Crit Rev Food Sci Nutr. 2023 Nov;63(33):12398-12412", "👉 Cronobacter spp. in foods of plant origin: occurrence, contamination routes, and pathogenic potential, Positive/therapeutic effect mentioned", "35866516"),
                    Reference("Front Microbiol. 2020 Mar 9;11:215", "👉 Emergence of Cronobacter sakazakii in Cases of Neonatal Sepsis in Upper Egypt: First Report in North Africa, Positive/therapeutic effect mentioned", "32210926"),

                    // Amino acids
                    Reference("Med Microbiol Immunol. 2025 Sep 27;214(1):46", "👉 Characterizing tuberculous meningitis in a South African pediatric cohort using GCxGC-TOFMS metabolomics, Positive/therapeutic effect mentioned", "41014409"),
                    Reference("Med. 2025 Sep 12;6(9):100705", "👉 A metabolic syndrome: Understanding host factors that drive mortality in tuberculosis meningitis, No clear dose/effect/duration found", "40945505"),
                    Reference("J Biomed Sci. 2025 Sep 8;32(1):86", "👉 Coxsackie B1 virus-like particle vaccine modified to exclude a highly conserved immunoreactive region from the capsid induces potent neutralizing antibodies and protects against infection in mice, µg, mg | Positive/therapeutic effect mentioned", "40922007"),

                    // Vitamins
                    Reference("Virulence. 2025 Dec;16(1):2543064", "👉 Riboflavin inhibits growth and reduces virulence of Cryptococcus neoformans and exhibits efficacy against pulmonary cryptococcosis and meningitis, Positive/therapeutic effect mentioned", "40754661"),
                    Reference("Foods. 2025 Jul 14;14(14):2463", "👉 Inactivation of Emerging Opportunistic Foodborne Pathogens Cronobacter spp. and Arcobacter spp. on Fresh Fruit and Vegetable Products, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40724287"),
                    Reference("J Neurooncol. 2025 Nov;175(2):857-868", "👉 Intrathecal pemetrexed for newly diagnosed leptomeningeal metastases: a multicenter, open-label, phase I/II study, mg | Negative/adverse effect mentioned | week, month", "40699526"),

                    // Minerals
                    Reference("Foods. 2025 Jul 14;14(14):2463", "👉 Inactivation of Emerging Opportunistic Foodborne Pathogens Cronobacter spp. and Arcobacter spp., Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40724287"),
                    Reference("Vet Res Commun. 2025 Mar 3;49(3):124", "👉 Vestibular syndrome in dairy heifers associated with Mycobacterium bovis: two case reports, No clear dose/effect/duration found", "40029436"),
                    Reference("Neurosurg Focus. 2025 Feb 1;58(2):E2", "👉 Multicenter study on 2-year outcomes of dual application of hydroxyapatite cranioplasty and a nasoseptal flap, Positive/therapeutic effect mentioned | week, day, month", "39891937"),

                    // Supplements
                    Reference("World J Otorhinolaryngol Head Neck Surg. 2025 Feb 20;11(3):391-399", "👉 Clinical characteristics and surgical outcomes between traumatic and nontraumatic cerebrospinal fluid rhinorrhea, No clear dose/effect/duration found", "40932912"),
                    Reference("Microorganisms. 2025 Aug 1;13(8):1801", "👉 Global Prevalence of Non-Polio Enteroviruses Pre- and Post COVID-19 Pandemic, Positive/therapeutic effect mentioned", "40871305"),
                    Reference("BMJ Paediatr Open. 2025 Aug 14;9(1):e003804", "👉 Efficacy of zinc supplementation for young infants with clinical severe infection in Tanzania: study protocol for a randomised controlled trial, mg | Positive/therapeutic effect mentioned | day", "40813142"),

                    // Nutrients
                    Reference("iScience. 2025 Aug 20;28(9):113405", "👉 Histone demethylase LSD1 regulates lipid homeostasis during Cryptococcus neoformans infection, Positive/therapeutic effect mentioned", "40978144"),
                    Reference("Brain Behav. 2025 Sep;15(9):e70852", "👉 Causal Link of Seven Trace Elements and Eight Nutrients With Meningioma: A Bidirectional Two-Sample Mendelian Randomization Analysis, Positive/therapeutic effect mentioned", "40898749"),
                    Reference("Sci Rep. 2025 Aug 18;15(1):30216", "👉 Morphology of the glymphatic and meningeal lymphatic structures of the bottlenose dolphin, No clear dose/effect/duration found", "40825973")
                )
            )

            "Mental health conditions" -> Pair(
                """
Alternative approaches
1. Innovative Stem Cell-Based Therapeutic Modalities to Address Major Depression and Treatment-Resistant Depression: A Review, No clear dose/effect/duration found
2. Therapeutic Effects of Intranasal Administration of Mesenchymal Stem Cell-Derived Secretome in Rats Exposed to Chronic Unpredictable Mild Stress, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Gut Microbiota in Psychiatric and Neurological Disorders: Current Insights and Therapeutic Implications, No clear dose/effect/duration found

Herbs
1. Baicalein improves motor dysfunction and cognitive impairment while promoting remyelination in an animal model of multiple sclerosis through the antioxidant mechanism, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Multiomics analysis reveals early administration of the Medhya rasayana formulation of Bacopa monnieri and Centella asiatica prevents neuroinflammation and cognitive deficits in an AD mouse model, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Neuroplasticity and brain health: insights from natural torpor, day

Amino acids
1. Plant-Derived Nutraceuticals in Mental Health and Brain Function: Mechanisms of Action and Therapeutic Potential, Positive/therapeutic effect mentioned
2. Neuromelanin-Sensitive MRI Contrast and Chronic Depression in Young Women, Positive/therapeutic effect mentioned
3. Glutamine Metabolism and Metabolic Profiling Using 7 T CRT-FID MRSI in Focal Epilepsy, Positive/therapeutic effect mentioned

Vitamins
1. Plant-Derived Nutraceuticals in Mental Health and Brain Function, Positive/therapeutic effect mentioned
2. Adequate Levels of Vitamin D Are Protective of Executive Functions in Patients with Chronic Mental Health, Positive/therapeutic effect mentioned
3. A comprehensive review of nutritional influences on the serotonergic system, G,G

Minerals
1. Plant-Derived Nutraceuticals in Mental Health and Brain Function, Positive/therapeutic effect mentioned
2. Biomarkers for the Diagnosis of Perinatal Mood and Anxiety Disorders: Existing Landscapes and Emerging Frontiers, Positive/therapeutic effect mentioned
3. Mineral Intake and Depression: A Cross-Sectional Comparative Study in Korea and the United States, No clear dose/effect/duration found

Supplements
1. Plant-Derived Nutraceuticals in Mental Health and Brain Function, Positive/therapeutic effect mentioned
2. Medicinal Plants for Child Mental Health: Clinical Insights, Active Compounds, and Perspectives for Rational Use, No clear dose/effect/duration found
3. Transient pre-baseline antipsychotic exposure (TPAE) is a prognostic specifier in clinical high risk for psychosis, Positive/therapeutic effect mentioned | day, month

Nutrients
1. Predictors of Successful Weight Restoration in the Treatment of Superior Mesenteric Artery Syndrome: A Systematic Review, Positive/therapeutic effect mentioned
2. Socio-Demographic Disparities in Diet and Their Association with Physical and Mental Well-Being: Million-Participant Cross-Sectional Study in Poland, Positive/therapeutic effect mentioned
3. Association Between Diet and Emotional Symptoms in Early Childhood: Cross-Sectional Results from the Piccolipiù Cohort, Positive/therapeutic effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Cell J. 2025 Sep 28;27(1):1-12", "👉 Innovative Stem Cell-Based Therapeutic Modalities to Address Major Depression and Treatment-Resistant Depression: A Review, No clear dose/effect/duration found", "41015852"),
                    Reference("Pharmaceutics. 2025 Aug 29;17(9):1129", "👉 Therapeutic Effects of Intranasal Administration of Mesenchymal Stem Cell-Derived Secretome in Rats Exposed to Chronic Unpredictable Mild Stress, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41012466"),
                    Reference("Biomedicines. 2025 Aug 29;13(9):2104", "👉 Gut Microbiota in Psychiatric and Neurological Disorders: Current Insights and Therapeutic Implications, No clear dose/effect/duration found", "41007667"),

                    // Herbs
                    Reference("Front Pharmacol. 2025 Sep 10;16:1659631", "👉 Baicalein improves motor dysfunction and cognitive impairment while promoting remyelination in an animal model of multiple sclerosis through the antioxidant mechanism, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41001342"),
                    Reference("J Ethnopharmacol. 2025 Sep 23:120633", "👉 Multiomics analysis reveals early administration of the Medhya rasayana formulation of Bacopa monnieri and Centella asiatica prevents neuroinflammation and cognitive deficits in an AD mouse model, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40998137"),
                    Reference("Biol Rev Camb Philos Soc. 2025 Aug 27", "👉 Neuroplasticity and brain health: insights from natural torpor, day", "40862558"),

                    // Amino acids
                    Reference("Int J Mol Sci. 2025 Sep 11;26(18):8849", "👉 Plant-Derived Nutraceuticals in Mental Health and Brain Function: Mechanisms of Action and Therapeutic Potential, Positive/therapeutic effect mentioned", "41009418"),
                    Reference("JAMA Netw Open. 2025 Sep 2;8(9):e2533339", "👉 Neuromelanin-Sensitive MRI Contrast and Chronic Depression in Young Women, Positive/therapeutic effect mentioned", "40986300"),
                    Reference("Eur J Neurol. 2025 Sep;32(9):e70343", "👉 Glutamine Metabolism and Metabolic Profiling Using 7 T CRT-FID MRSI in Focal Epilepsy, Positive/therapeutic effect mentioned", "40944337"),

                    // Vitamins
                    Reference("Int J Mol Sci. 2025 Sep 11;26(18):8849", "👉 Plant-Derived Nutraceuticals in Mental Health and Brain Function, Positive/therapeutic effect mentioned", "41009418"),
                    Reference("Int J Psychol Res (Medellin). 2025 Jul 25;18(1):106-114", "👉 Adequate Levels of Vitamin D Are Protective of Executive Functions in Patients with Chronic Mental Health, Positive/therapeutic effect mentioned", "41001352"),
                    Reference("Adv Nutr. 2025 Sep 23:100524", "👉 A comprehensive review of nutritional influences on the serotonergic system, G,G", "40998119"),

                    // Minerals
                    Reference("Int J Mol Sci. 2025 Sep 11;26(18):8849", "👉 Plant-Derived Nutraceuticals in Mental Health and Brain Function, Positive/therapeutic effect mentioned", "41009418"),
                    Reference("Biol Psychiatry. 2025 Sep 3:S0006-3223(25)01432-5", "👉 Biomarkers for the Diagnosis of Perinatal Mood and Anxiety Disorders: Existing Landscapes and Emerging Frontiers, Positive/therapeutic effect mentioned", "40912620"),
                    Reference("Nutrients. 2025 Aug 9;17(16):2593", "👉 Mineral Intake and Depression: A Cross-Sectional Comparative Study in Korea and the United States, No clear dose/effect/duration found", "40871621"),

                    // Supplements
                    Reference("Int J Mol Sci. 2025 Sep 11;26(18):8849", "👉 Plant-Derived Nutraceuticals in Mental Health and Brain Function, Positive/therapeutic effect mentioned", "41009418"),
                    Reference("Children (Basel). 2025 Aug 28;12(9):1142", "👉 Medicinal Plants for Child Mental Health: Clinical Insights, Active Compounds, and Perspectives for Rational Use, No clear dose/effect/duration found", "41007011"),
                    Reference("Schizophrenia (Heidelb). 2025 Sep 26;11(1):119", "👉 Transient pre-baseline antipsychotic exposure (TPAE) is a prognostic specifier in clinical high risk for psychosis, Positive/therapeutic effect mentioned | day, month", "41006321"),

                    // Nutrients
                    Reference("Nutrients. 2025 Sep 19;17(18):2998", "👉 Predictors of Successful Weight Restoration in the Treatment of Superior Mesenteric Artery Syndrome: A Systematic Review, Positive/therapeutic effect mentioned", "41010523"),
                    Reference("Nutrients. 2025 Sep 11;17(18):2924", "👉 Socio-Demographic Disparities in Diet and Their Association with Physical and Mental Well-Being: Million-Participant Cross-Sectional Study in Poland, Positive/therapeutic effect mentioned", "41010450"),
                    Reference("Nutrients. 2025 Sep 9;17(18):2909", "👉 Association Between Diet and Emotional Symptoms in Early Childhood: Cross-Sectional Results from the Piccolipiù Cohort, Positive/therapeutic effect mentioned", "41010435")
                )
            )
            "Migraine" -> Pair(
                """
Alternative approaches
1. Comparative Analysis of Real-World Acute Prescription Migraine Therapy Outcomes: Insights from the HeAD-US Study, Positive/therapeutic effect mentioned
2. Confirmation bias in medical referrals: an unusual presentation of pain at the base of the skull, Positive/therapeutic effect mentioned
3. Lasmiditan in Migraine Management: An Advanced Review of Its Pharmacological Paradigm, Clinical Applications, Safety Considerations, Drug Interaction Spectrum, and Regulatory Approval, Negative/adverse effect mentioned

Herbs
1. Reporting quality and evidence support in randomized controlled trials of herbal medicine formulas for vestibular migraine, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Mechanism of Traditional Chinese Medicine in Treating Migraine: A Comprehensive Review, Positive/therapeutic effect mentioned
3. Exploring the synergistic effects of chuanxiong rhizoma and Cyperi rhizoma in eliciting a rapid anti-migraine action, No clear dose/effect/duration found

Amino acids
1. Exploring the potential pathogenesis of migraine using glutamatergic neuron models derived from iPSCs of migraine patients, No clear dose/effect/duration found
2. A study of salivary cortisol and glutamate after the cold pressor task in healthy adults, µg
3. New perspectives in the treatment of migraine: the role of the kynurenine pathway, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Vitamins
1. Causal factors for migraine in Mendelian randomization studies: a systematic review and meta-analysis, g | Positive/therapeutic effect mentioned
2. Oral preventive medications for migraine in adults aged 18-65: a network meta-analysis, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Riboflavin in neurological diseases: therapeutic advances, Positive/therapeutic effect mentioned

Minerals
1. Magnesium and nerve injury: Mechanisms and applications, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. The Role of Magnesium in Depression, Migraine, Alzheimer's Disease, and Cognitive Health: A Comprehensive Review, Positive/therapeutic effect mentioned
3. A multinational cross-sectional study on knowledge, attitudes, and practices towards magnesium supplements, Positive/therapeutic effect mentioned

Supplements
1. Potential therapeutic benefits of curcumin in depression or anxiety induced by chronic diseases: a systematic review, Positive/therapeutic effect mentioned
2. Restless legs syndrome and growing pains in childhood: understanding the link, No clear dose/effect/duration found
3. Association Between Magnesium Intake and Migraine Among Pre and Postmenopausal Women: A Cross-Sectional Study, No clear dose/effect/duration found

Nutrients
1. Effects of Online, Asynchronous Education Modules on Migraine Severity and Elimination Diet Use Among Higher Education Students, No clear dose/effect/duration found
2. The Role of Magnesium in Depression, Migraine, Alzheimer's Disease, and Cognitive Health: A Comprehensive Review, Positive/therapeutic effect mentioned
3. Neurovascular coupling dysfunction in encephalopathy: pathophysiological advances and clinical implications, Positive/therapeutic effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("medRxiv [Preprint]. 2025 Sep 19:2025.09.18.25336093", "👉 Comparative Analysis of Real-World Acute Prescription Migraine Therapy Outcomes: Insights from the HeAD-US Study, Positive/therapeutic effect mentioned", "41001465"),
                    Reference("BMJ Case Rep. 2025 Sep 25;18(9):e267111", "👉 Confirmation bias in medical referrals: an unusual presentation of pain at the base of the skull, Positive/therapeutic effect mentioned", "40998548"),
                    Reference("Drug Res (Stuttg). 2025 Sep 24", "👉 Lasmiditan in Migraine Management: An Advanced Review of Its Pharmacological Paradigm, Clinical Applications, Safety Considerations, Drug Interaction Spectrum, and Regulatory Approval, Negative/adverse effect mentioned", "40992411"),

                    // Herbs
                    Reference("Phytomedicine. 2025 Jul 25;143:156864", "👉 Reporting quality and evidence support in randomized controlled trials of herbal medicine formulas for vestibular migraine, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40449448"),
                    Reference("J Pain Res. 2024 Sep 17;17:3031-3046", "👉 Mechanism of Traditional Chinese Medicine in Treating Migraine: A Comprehensive Review, Positive/therapeutic effect mentioned", "39308997"),
                    Reference("J Ethnopharmacol. 2024 Dec 5;335:118608", "👉 Exploring the synergistic effects of chuanxiong rhizoma and Cyperi rhizoma in eliciting a rapid anti-migraine action, No clear dose/effect/duration found", "39053709"),

                    // Amino acids
                    Reference("Brain Res. 2025 Nov 1;1866:149938", "👉 Exploring the potential pathogenesis of migraine using glutamatergic neuron models derived from iPSCs of migraine patients, No clear dose/effect/duration found", "40930453"),
                    Reference("PeerJ. 2025 Jul 23;13:e19625", "👉 A study of salivary cortisol and glutamate after the cold pressor task in healthy adults, µg", "40718782"),
                    Reference("Orv Hetil. 2025 Jun 8;166(23):879-886", "👉 New perspectives in the treatment of migraine: the role of the kynurenine pathway, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40483687"),

                    // Vitamins
                    Reference("Front Neurol. 2025 Sep 9;16:1660995", "👉 Causal factors for migraine in Mendelian randomization studies: a systematic review and meta-analysis, g | Positive/therapeutic effect mentioned", "40994718"),
                    Reference("Front Pharmacol. 2025 Sep 4;16:1620887", "👉 Oral preventive medications for migraine in adults aged 18-65: a network meta-analysis, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40978493"),
                    Reference("Front Neurol. 2025 Sep 2;16:1663136", "👉 Riboflavin in neurological diseases: therapeutic advances, Positive/therapeutic effect mentioned", "40963932"),

                    // Minerals
                    Reference("Neural Regen Res. 2025 Aug 13", "👉 Magnesium and nerve injury: Mechanisms and applications, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40808387"),
                    Reference("Nutrients. 2025 Jul 4;17(13):2216", "👉 The Role of Magnesium in Depression, Migraine, Alzheimer's Disease, and Cognitive Health: A Comprehensive Review, Positive/therapeutic effect mentioned", "40647320"),
                    Reference("Front Pharmacol. 2025 Apr 28;16:1550695", "👉 A multinational cross-sectional study on knowledge, attitudes, and practices towards magnesium supplements, Positive/therapeutic effect mentioned", "40356953"),

                    // Supplements
                    Reference("Front Pharmacol. 2025 Aug 22;16:1638645", "👉 Potential therapeutic benefits of curcumin in depression or anxiety induced by chronic diseases: a systematic review, Positive/therapeutic effect mentioned", "40918536"),
                    Reference("Front Neurol. 2025 Aug 22;16:1603694", "👉 Restless legs syndrome and growing pains in childhood: understanding the link, No clear dose/effect/duration found", "40917655"),
                    Reference("Int J Womens Health. 2025 Aug 29;17:2747-2758", "👉 Association Between Magnesium Intake and Migraine Among Pre and Postmenopausal Women: A Cross-Sectional Study, No clear dose/effect/duration found", "40904698"),

                    // Nutrients
                    Reference("Nutrients. 2025 Jul 25;17(15):2432", "👉 Effects of Online, Asynchronous Education Modules on Migraine Severity and Elimination Diet Use Among Higher Education Students, No clear dose/effect/duration found", "40806016"),
                    Reference("Nutrients. 2025 Jul 4;17(13):2216", "👉 The Role of Magnesium in Depression, Migraine, Alzheimer's Disease, and Cognitive Health: A Comprehensive Review, Positive/therapeutic effect mentioned", "40647320"),
                    Reference("Front Neurol. 2025 May 20;16:1522485", "👉 Neurovascular coupling dysfunction in encephalopathy: pathophysiological advances and clinical implications, Positive/therapeutic effect mentioned", "40463938")
                )
            )

            "Molluscum contagiosum" -> Pair(
                """
Alternative approaches
1. Cantharidin: Its Role in Dermatology Revisited, Negative/adverse effect mentioned
2. Off-Label Use of Imiquimod for Lower Female Genital Tract Diseases: A Systematic Review, week
3. Intralesional candida antigen versus intralesional varicella zoster vaccine in treatment of molluscum contagiosum: A new promising alternative, No clear dose/effect/duration found

Herbs
1. Clinical aspects and genetic analysis of Taiwanese patients with the phenotype of hyper-immunoglobulin E recurrent infection syndromes (HIES), month

Amino acids
1. The emerging role of photodynamic therapy in the treatment of cutaneous infections, No clear dose/effect/duration found
2. Covalent Binding of Reactive Anhydride of Cantharidin to Biological Amines, Negative/adverse effect mentioned
3. The molluscum contagiosum virus death effector domain containing protein MC160 RxDL motifs are not required for its known viral immune evasion functions, No clear dose/effect/duration found

Vitamins
1. Innovation in Warts and Molluscum: An Updated Comprehensive Review, Positive/therapeutic effect mentioned
2. Retinoids as vitamin A derivatives, No clear dose/effect/duration found
3. Intralesional immunotherapy for molluscum contagiosum: A review, Negative/adverse effect mentioned

Minerals
1. Two for One: Concurrent Acquisition of Molluscum Contagiosum Infection and Scabies Infestation After a Single Sexual Encounter, No clear dose/effect/duration found
2. Selenium, Selenoproteins and Viral Infection, Positive/therapeutic effect mentioned
3. Selenium-dependent glutathione peroxidase modules encoded by RNA viruses, No clear dose/effect/duration found

Supplements
1. Accuracy of symptom checker for the diagnosis of sexually transmitted infections using machine learning and Bayesian network algorithms, Positive/therapeutic effect mentioned | month
2. The emerging role of photodynamic therapy in the treatment of cutaneous infections, No clear dose/effect/duration found
3. Infectious genital lesions, No clear dose/effect/duration found

Nutrients
1. Selenium, Selenoproteins and Viral Infection, Positive/therapeutic effect mentioned
2. Potential Antiviral Agents from Marine Fungi: An Overview, No clear dose/effect/duration found
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Pediatr Dermatol. 2025 Sep-Oct;42(5):913-926", "👉 Cantharidin: Its Role in Dermatology Revisited, Negative/adverse effect mentioned", "40765102"),
                    Reference("J Low Genit Tract Dis. 2025 Jul 1;29(3):251-262", "👉 Off-Label Use of Imiquimod for Lower Female Genital Tract Diseases: A Systematic Review, week", "40576260"),
                    Reference("J Dermatol. 2025 May;52(5):855-859", "👉 Intralesional candida antigen versus intralesional varicella zoster vaccine in treatment of molluscum contagiosum: A new promising alternative, No clear dose/effect/duration found", "39927603"),

                    // Herbs
                    Reference("J Clin Immunol. 2011 Apr;31(2):272-80", "👉 Clinical aspects and genetic analysis of Taiwanese patients with the phenotype of hyper-immunoglobulin E recurrent infection syndromes (HIES), month", "21120687"),

                    // Amino acids
                    Reference("Ital J Dermatol Venerol. 2025 Feb;160(1):40-46", "👉 The emerging role of photodynamic therapy in the treatment of cutaneous infections, No clear dose/effect/duration found", "39611415"),
                    Reference("Drug Metab Dispos. 2024 Jul 16;52(8):775-784", "👉 Covalent Binding of Reactive Anhydride of Cantharidin to Biological Amines, Negative/adverse effect mentioned", "38811155"),
                    Reference("Virus Genes. 2017 Aug;53(4):522-531", "👉 The molluscum contagiosum virus death effector domain containing protein MC160 RxDL motifs are not required for its known viral immune evasion functions, No clear dose/effect/duration found", "28425034"),

                    // Vitamins
                    Reference("Dermatol Clin. 2025 Jan;43(1):95-102", "👉 Innovation in Warts and Molluscum: An Updated Comprehensive Review, Positive/therapeutic effect mentioned", "39542567"),
                    Reference("Adapalene. StatPearls [Internet]. 2025 Jan–", "👉 Retinoids as vitamin A derivatives, No clear dose/effect/duration found", "29494115"),
                    Reference("Dermatol Ther. 2020 Nov;33(6):e14386", "👉 Intralesional immunotherapy for molluscum contagiosum: A review, Negative/adverse effect mentioned", "33044025"),

                    // Minerals
                    Reference("Cureus. 2021 Dec 28;13(12):e20780", "👉 Two for One: Concurrent Acquisition of Molluscum Contagiosum Infection and Scabies Infestation After a Single Sexual Encounter, No clear dose/effect/duration found", "35111464"),
                    Reference("Nutrients. 2019 Sep 4;11(9):2101", "👉 Selenium, Selenoproteins and Viral Infection, Positive/therapeutic effect mentioned", "31487871"),
                    Reference("Biol Trace Elem Res. 1999 Nov;70(2):97-116", "👉 Selenium-dependent glutathione peroxidase modules encoded by RNA viruses, No clear dose/effect/duration found", "10535520"),

                    // Supplements
                    Reference("BMC Infect Dis. 2024 Dec 18;24(1):1408", "👉 Accuracy of symptom checker for the diagnosis of sexually transmitted infections using machine learning and Bayesian network algorithms, Positive/therapeutic effect mentioned | month", "39695420"),
                    Reference("Ital J Dermatol Venerol. 2025 Feb;160(1):40-46", "👉 The emerging role of photodynamic therapy in the treatment of cutaneous infections, No clear dose/effect/duration found", "39611415"),
                    Reference("Ann Pathol. 2022 Jan;42(1):31-42", "👉 Infectious genital lesions, No clear dose/effect/duration found", "34801271"),

                    // Nutrients
                    Reference("Nutrients. 2019 Sep 4;11(9):2101", "👉 Selenium, Selenoproteins and Viral Infection, Positive/therapeutic effect mentioned", "31487871"),
                    Reference("Mar Drugs. 2015 Jul 22;13(7):4520-38", "👉 Potential Antiviral Agents from Marine Fungi: An Overview, No clear dose/effect/duration found", "26204947")
                )
            )

            "Multiple sclerosis" -> Pair(
                """
Alternative approaches
1. Ocrelizumab-induced neutropenia: severity, recurrence, and management. A French national pharmacovigilance study, G | Negative/adverse effect mentioned | week
2. HIITing Anxiety and Depression in Parkinson's Disease and Multiple Sclerosis-A Study Protocol of a Transdiagnostic Randomized Controlled Trial (HersenFIT), Positive/therapeutic effect mentioned | week
3. Feasibility and Preliminary Efficacy of Wearable Focal Vibration Therapy on Gait and Mobility in People with Multiple Sclerosis: A Pilot Study, Positive/therapeutic effect mentioned | week, day

Herbs
1. Baicalein improves motor dysfunction and cognitive impairment while promoting remyelination in an animal model of multiple sclerosis through the antioxidant mechanism, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Dihydroartemisinin enhances remyelination by switching microglia to the reparative phenotype, No clear dose/effect/duration found
3. New approach of using medicinal mushrooms for managing and curing multiple sclerosis, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Amino acids
1. Metabolomics in Multiple Sclerosis: Advances, Challenges, and Clinical Perspectives-A Systematic Review, Negative/adverse effect mentioned
2. Digit Span Tests Are More Sensitive than SDMT for Detecting Working Memory Impairment and Correlate with Metabolic Alterations in White Matter and Deep Gray Matter Nuclei in Multiple Sclerosis, No clear dose/effect/duration found
3. Distribution of big tau isoforms in the human central and peripheral nervous system, g

Vitamins
1. Risk factors of multiple sclerosis: insights from the United Arab Emirates, No clear dose/effect/duration found
2. Vitamin D Associated with Exercise Can Be Used as a Promising Tool in Neurodegenerative Disease Protection, Positive/therapeutic effect mentioned
3. A Comprehensive Overview of Subacute Combined Degeneration: MRI Diagnostic Challenges and Treatment Pathways, No clear dose/effect/duration found

Minerals
1. Musculoskeletal Manifestations of Alkaptonuria: A Case-Based Review of Literature, Positive/therapeutic effect mentioned
2. Multiple sclerosis is associated with worse body composition across compartments: Results from a systematic review and meta-analysis, No clear dose/effect/duration found
3. Prevalence of osteoporosis in chronic diseases: an umbrella review of 283 observational studies from 13 systematic reviews, Positive/therapeutic effect mentioned

Supplements
1. Pulmonary Involvement in Autoimmune-Mediated Disease, No clear dose/effect/duration found
2. Letter to the Editor regarding: Long-term safety evaluation of natalizumab during pregnancy and lactation in patients with multiple sclerosis, No clear dose/effect/duration found
3. Proanthocyanidin B2 Alleviates Cuprizone-Induced Demyelination by Regulating the Astrocytic xCT/GSH/GPX4 Axis, mg | Positive/therapeutic effect mentioned | week

Nutrients
1. Aberrant Nutrient Metabolism in T Cells: Pathogenesis Insight and Therapeutic Target for Autoimmune Diseases, No clear dose/effect/duration found
2. Potential Causal Relationships Between Circulating Micronutrient Levels and Multiple Neuroimmune Diseases: A Genetic Association Analysis, Positive/therapeutic effect mentioned
3. Bidirectional communication between the gut microbiota and the central nervous system, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Mult Scler Relat Disord. 2025 Sep 19;104:106772", "👉 Ocrelizumab-induced neutropenia: severity, recurrence, and management. A French national pharmacovigilance study, G | Negative/adverse effect mentioned | week", "41014780"),
                    Reference("Brain Sci. 2025 Aug 29;15(9):945", "👉 HIITing Anxiety and Depression in Parkinson's Disease and Multiple Sclerosis-A Study Protocol of a Transdiagnostic Randomized Controlled Trial (HersenFIT), Positive/therapeutic effect mentioned | week", "41008305"),
                    Reference("Bioengineering (Basel). 2025 Aug 29;12(9):932", "👉 Feasibility and Preliminary Efficacy of Wearable Focal Vibration Therapy on Gait and Mobility in People with Multiple Sclerosis: A Pilot Study, Positive/therapeutic effect mentioned | week, day", "41007175"),

                    // Herbs
                    Reference("Front Pharmacol. 2025 Sep 10;16:1659631", "👉 Baicalein improves motor dysfunction and cognitive impairment while promoting remyelination in an animal model of multiple sclerosis through the antioxidant mechanism, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41001342"),
                    Reference("J Neuroinflammation. 2025 Aug 1;22(1):197", "👉 Dihydroartemisinin enhances remyelination by switching microglia to the reparative phenotype, No clear dose/effect/duration found", "40750890"),
                    Reference("Fitoterapia. 2025 Sep;185:106684", "👉 New approach of using medicinal mushrooms for managing and curing multiple sclerosis, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40527388"),

                    // Amino acids
                    Reference("Int J Mol Sci. 2025 Sep 20;26(18):9207", "👉 Metabolomics in Multiple Sclerosis: Advances, Challenges, and Clinical Perspectives-A Systematic Review, Negative/adverse effect mentioned", "41009767"),
                    Reference("Int J Mol Sci. 2025 Sep 11;26(18):8842", "👉 Digit Span Tests Are More Sensitive than SDMT for Detecting Working Memory Impairment and Correlate with Metabolic Alterations in White Matter and Deep Gray Matter Nuclei in Multiple Sclerosis, No clear dose/effect/duration found", "41009412"),
                    Reference("bioRxiv [Preprint]. 2025 Sep 17:2025.09.15.676127", "👉 Distribution of big tau isoforms in the human central and peripheral nervous system, g", "41000752"),

                    // Vitamins
                    Reference("Int J Environ Health Res. 2025 Sep 27:1-15", "👉 Risk factors of multiple sclerosis: insights from the United Arab Emirates, No clear dose/effect/duration found", "41014063"),
                    Reference("Molecules. 2025 Sep 21;30(18):3823", "👉 Vitamin D Associated with Exercise Can Be Used as a Promising Tool in Neurodegenerative Disease Protection, Positive/therapeutic effect mentioned", "41011716"),
                    Reference("Brain Sci. 2025 Sep 10;15(9):972", "👉 A Comprehensive Overview of Subacute Combined Degeneration: MRI Diagnostic Challenges and Treatment Pathways, No clear dose/effect/duration found", "41008332"),

                    // Minerals
                    Reference("Cureus. 2025 Aug 23;17(8):e90841", "👉 Musculoskeletal Manifestations of Alkaptonuria: A Case-Based Review of Literature, Positive/therapeutic effect mentioned", "40995248"),
                    Reference("Mult Scler Relat Disord. 2025 Sep;101:106553", "👉 Multiple sclerosis is associated with worse body composition across compartments: Results from a systematic review and meta-analysis, No clear dose/effect/duration found", "40513309"),
                    Reference("BMC Rheumatol. 2025 Jun 6;9(1):66", "👉 Prevalence of osteoporosis in chronic diseases: an umbrella review of 283 observational studies from 13 systematic reviews, Positive/therapeutic effect mentioned", "40481555"),

                    // Supplements
                    Reference("Dtsch Arztebl Int. 2025 Dec 12;(Forthcoming):arztebl.m2025.0162", "👉 Pulmonary Involvement in Autoimmune-Mediated Disease, No clear dose/effect/duration found", "40991358"),
                    Reference("Neurol Sci. 2025 Sep 23", "👉 Letter to the Editor regarding: Long-term safety evaluation of natalizumab during pregnancy and lactation in patients with multiple sclerosis, No clear dose/effect/duration found", "40983770"),
                    Reference("CNS Neurosci Ther. 2025 Sep;31(9):e70598", "👉 Proanthocyanidin B2 Alleviates Cuprizone-Induced Demyelination by Regulating the Astrocytic xCT/GSH/GPX4 Axis, mg | Positive/therapeutic effect mentioned | week", "40968556"),

                    // Nutrients
                    Reference("Eur J Immunol. 2025 Sep;55(9):e70059", "👉 Aberrant Nutrient Metabolism in T Cells: Pathogenesis Insight and Therapeutic Target for Autoimmune Diseases, No clear dose/effect/duration found", "40936324"),
                    Reference("Brain Behav. 2025 Sep;15(9):e70848", "👉 Potential Causal Relationships Between Circulating Micronutrient Levels and Multiple Neuroimmune Diseases: A Genetic Association Analysis, Positive/therapeutic effect mentioned", "40923143"),
                    Reference("Neural Regen Res. 2025 Sep 3", "👉 Bidirectional communication between the gut microbiota and the central nervous system, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40903950")
                )
            )

            "Mumps" -> Pair(
                """
Alternative approaches
1. Non-mumps parotitis associated with influenza A/H3N2: A case series from Southern Italy during the 2024-2025 influenza season, Positive/therapeutic effect mentioned
2. Mathematical insights into mumps transmission control with optimal strategies, No clear dose/effect/duration found
3. Intralesional Immunotherapy for Non-Genital Viral Warts: A Review of Current Evidence and Future Perspectives, Negative/adverse effect mentioned

Herbs
1. Antiviral Potential of Plants against COVID-19 during Outbreaks-An Update, Positive/therapeutic effect mentioned
2. Chinese medicinal herbs for mumps, No clear dose/effect/duration found
3. Chinese medicinal herbs for mumps, No clear dose/effect/duration found

Amino acids
1. Methotrexate Enhances Atherosclerosis Progression via Impairment of Folate Pathway in a Microminipig Model, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Ultra-high performance liquid chromatography with tandem mass spectrometry (UPLC-MS/MS) for simultaneous estimation of residual glyphosate and its metabolite (AMPA) in various vaccines, No clear dose/effect/duration found
3. Oncolytic Urabe mumps virus: A promising virotherapy for triple-negative breast cancer, No clear dose/effect/duration found

Vitamins
1. Intralesional Immunotherapy for Non-Genital Viral Warts: A Review of Current Evidence and Future Perspectives, Negative/adverse effect mentioned
2. A Randomised Single-Blind Controlled Trial Comparing Efficacy of Intralesional Vitamin D Injection and MMR Vaccine in Treatment of Warts, Negative/adverse effect mentioned | week
3. Intralesional measles, mumps, and rubella vaccine versus vitamin D for treatment of warts, IU | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month

Minerals
1. Associative Patterns Between Iron Deficiency Anemia and Febrile Seizures in the Five to 60 Months Age Group, Month
2. A Review of the Ethnobotany, Biological Activity, and Phytochemistry of the Plants in the Gundelia Genus, Positive/therapeutic effect mentioned
3. Risks associated with premature ovarian failure in Han Chinese women, Positive/therapeutic effect mentioned

Supplements
1. Virus-specific antibody responses in multiple sclerosis patients treated with Ocrevus, G | Positive/therapeutic effect mentioned
2. Evidence-based labor management: postpartum care after vaginal delivery, Positive/therapeutic effect mentioned | month
3. Measles, Mumps, Rubella Vaccine (PRIORIX): Recommendations of the Advisory Committee on Immunization Practices - United States, 2022, Positive/therapeutic effect mentioned | month

Nutrients
1. A prospective randomized controlled study of Mycobacterium Indicus Pranii vaccine, Measles Mumps Rubella vaccine and Vitamin D3 in extragenital cutaneous warts, g | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week
2. Cadmium exposure modulates the gut-liver axis in an Alzheimer's disease mouse model, g
3. Serum Concentration of Antibodies to Mumps, but Not Measles, Rubella, or Varicella, Is Associated with Intake of Dietary Fiber in the NHANES, 1999-2004, No clear dose/effect/duration found
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("J Infect Public Health. 2025 Jul 19;18(11):102907", "👉 Non-mumps parotitis associated with influenza A/H3N2: A case series from Southern Italy during the 2024-2025 influenza season, Positive/therapeutic effect mentioned", "40753684"),
                    Reference("Infect Dis Model. 2025 Jun 30;10(4):1208-1228", "👉 Mathematical insights into mumps transmission control with optimal strategies, No clear dose/effect/duration found", "40689267"),
                    Reference("Int J Mol Sci. 2025 Jun 12;26(12):5644", "👉 Intralesional Immunotherapy for Non-Genital Viral Warts: A Review of Current Evidence and Future Perspectives, Negative/adverse effect mentioned", "40565110"),

                    // Herbs
                    Reference("Int J Mol Sci. 2022 Nov 5;23(21):13564", "👉 Antiviral Potential of Plants against COVID-19 during Outbreaks-An Update, Positive/therapeutic effect mentioned", "36362351"),
                    Reference("Cochrane Database Syst Rev. 2015 Apr 18;2015(4):CD008578", "👉 Chinese medicinal herbs for mumps, No clear dose/effect/duration found", "25887348"),
                    Reference("Cochrane Database Syst Rev. 2012 Sep 12;(9):CD008578", "👉 Chinese medicinal herbs for mumps, No clear dose/effect/duration found", "22972124"),

                    // Amino acids
                    Reference("In Vivo. 2025 May-Jun;39(3):1262-1274", "👉 Methotrexate Enhances Atherosclerosis Progression via Impairment of Folate Pathway in a Microminipig Model, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40295005"),
                    Reference("Biologicals. 2025 May;90:101822", "👉 Ultra-high performance liquid chromatography with tandem mass spectrometry (UPLC-MS/MS) for simultaneous estimation of residual glyphosate and its metabolite (AMPA) in various vaccines, No clear dose/effect/duration found", "40007352"),
                    Reference("Mol Ther Oncolytics. 2022 Nov 14;27:239-255", "👉 Oncolytic Urabe mumps virus: A promising virotherapy for triple-negative breast cancer, No clear dose/effect/duration found", "36458203"),

                    // Vitamins
                    Reference("Int J Mol Sci. 2025 Jun 12;26(12):5644", "👉 Intralesional Immunotherapy for Non-Genital Viral Warts: A Review of Current Evidence and Future Perspectives, Negative/adverse effect mentioned", "40565110"),
                    Reference("Indian J Dermatol. 2025 May-Jun;70(3):169", "👉 A Randomised Single-Blind Controlled Trial Comparing Efficacy of Intralesional Vitamin D Injection and MMR Vaccine in Treatment of Warts, Negative/adverse effect mentioned | week", "40487499"),
                    Reference("Indian J Dermatol Venereol Leprol. 2025 May 7:1-7", "👉 Intralesional measles, mumps, and rubella vaccine versus vitamin D for treatment of warts, IU | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month", "40357930"),

                    // Minerals
                    Reference("Cureus. 2024 Mar 19;16(3):e56470", "👉 Associative Patterns Between Iron Deficiency Anemia and Febrile Seizures in the Five to 60 Months Age Group, Month", "38638769"),
                    Reference("Chem Biodivers. 2024 Mar;21(3):e202301932", "👉 A Review of the Ethnobotany, Biological Activity, and Phytochemistry of the Plants in the Gundelia Genus, Positive/therapeutic effect mentioned", "38294082"),
                    Reference("Reprod Biomed Online. 2015 Apr;30(4):401-7", "👉 Risks associated with premature ovarian failure in Han Chinese women, Positive/therapeutic effect mentioned", "25682306"),

                    // Supplements
                    Reference("J Neurol Sci. 2025 Jul 15;474:123537", "👉 Virus-specific antibody responses in multiple sclerosis patients treated with Ocrevus, G | Positive/therapeutic effect mentioned", "40398376"),
                    Reference("Am J Obstet Gynecol MFM. 2023 Jul;5(7):100977", "👉 Evidence-based labor management: postpartum care after vaginal delivery, Positive/therapeutic effect mentioned | month", "37094636"),
                    Reference("MMWR Morb Mortal Wkly Rep. 2022 Nov 18;71(46):1465-1470", "👉 Measles, Mumps, Rubella Vaccine (PRIORIX): Recommendations of the Advisory Committee on Immunization Practices - United States, 2022, Positive/therapeutic effect mentioned | month", "36395065"),

                    // Nutrients
                    Reference("J Cosmet Dermatol. 2023 Apr;22(4):1400-1409", "👉 A prospective randomized controlled study of Mycobacterium Indicus Pranii vaccine, Measles Mumps Rubella vaccine and Vitamin D3 in extragenital cutaneous warts, g | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week", "36762385"),
                    Reference("Commun Biol. 2021 Dec 15;4(1):1398", "👉 Cadmium exposure modulates the gut-liver axis in an Alzheimer's disease mouse model, g", "34912029"),
                    Reference("Nutrients. 2021 Mar 2;13(3):813", "👉 Serum Concentration of Antibodies to Mumps, but Not Measles, Rubella, or Varicella, Is Associated with Intake of Dietary Fiber in the NHANES, 1999-2004, No clear dose/effect/duration found", "33801237")
                )
            )

            "Nail problems" -> Pair(
                """
Alternative approaches
1. Specific Primers and Nested PCR Find Trichophyton rubrum Missed by Culture of Ground Toenails from Onychomycosis in Podiatric Patients in Eastern Australia, No clear dose/effect/duration found
2. Management of Seymour (Distal Phalangeal) Fractures with Nail Bed Involvement, Positive/therapeutic effect mentioned
3. Open Reduction and Internal Fixation vs Primary Tibiotalocalcaneal Hindfoot Nailing for Ankle Fractures in Elderly Patients: A Systematic Review and Meta-analysis, No clear dose/effect/duration found

Herbs
- No references found

Amino acids
1. Identification of biomarkers in diabetic nails by Raman spectroscopy, No clear dose/effect/duration found
2. Molecular targets for antifungals in amino acid and protein biosynthetic pathways, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Metabolomic analysis of Trichophyton rubrum and Microsporum canis during keratin degradation, No clear dose/effect/duration found

Vitamins
1. Biotin Supplementation-The Cause of Hypersensitivity and Significant Interference in Allergy Diagnostics, Positive/therapeutic effect mentioned
2. Nutrition, health and welfare of Norwegian pet guinea pigs, G
3. Pediatric femoral shaft fracture requiring revision surgery for nonunion associated with vitamin D and K deficiencies: a case report, month

Minerals
1. Negative/adverse effect mentioned
2. Feather keratin-montmorillonite nanocomposite hydrogel promotes bone regeneration by stimulating the osteogenic differentiation of endogenous stem cells, Positive/therapeutic effect mentioned
3. Combined association of early exposure to long-chain n-3 polyunsaturated fatty acids, mercury and selenium with cognitive performance in 1-year-old infants, month

Supplements
1. Biotin Supplementation-The Cause of Hypersensitivity and Significant Interference in Allergy Diagnostics, Positive/therapeutic effect mentioned
2. Nutrition, health and welfare of Norwegian pet guinea pigs, G
3. Collagen Structure, Synthesis, and Its Applications: A Systematic Review, Positive/therapeutic effect mentioned

Nutrients
1. Biotin Supplementation-The Cause of Hypersensitivity and Significant Interference in Allergy Diagnostics, Positive/therapeutic effect mentioned
2. Toxicological profile and potential health concerns through metals and trace elements exposure in brick kiln workers from Lahore, Pakistan, Negative/adverse effect mentioned
3. Pediatric femoral shaft fracture requiring revision surgery for nonunion associated with vitamin D and K deficiencies: a case report, month
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("J Fungi (Basel). 2025 Jul 14;11(7):520", "👉 Specific Primers and Nested PCR Find Trichophyton rubrum Missed by Culture of Ground Toenails from Onychomycosis in Podiatric Patients in Eastern Australia, No clear dose/effect/duration found", "40985411"),
                    Reference("JBJS Essent Surg Tech. 2025 Aug 25;15(3):e24.00041", "👉 Management of Seymour (Distal Phalangeal) Fractures with Nail Bed Involvement, Positive/therapeutic effect mentioned", "40861033"),
                    Reference("Foot Ankle Int. 2025 Jun;46(6):661-671", "👉 Open Reduction and Internal Fixation vs Primary Tibiotalocalcaneal Hindfoot Nailing for Ankle Fractures in Elderly Patients: A Systematic Review and Meta-analysis, No clear dose/effect/duration found", "40219867"),

                    // Herbs
                    // No references

                    // Amino acids
                    Reference("Clin Chim Acta. 2023 Apr 1;544:117363", "👉 Identification of biomarkers in diabetic nails by Raman spectroscopy, No clear dose/effect/duration found", "37100189"),
                    Reference("Amino Acids. 2021 Jul;53(7):961-991", "👉 Molecular targets for antifungals in amino acid and protein biosynthetic pathways, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "34081205"),
                    Reference("Sci Rep. 2021 Feb 17;11(1):3959", "👉 Metabolomic analysis of Trichophyton rubrum and Microsporum canis during keratin degradation, No clear dose/effect/duration found", "33597693"),

                    // Vitamins
                    Reference("Nutrients. 2025 Jul 24;17(15):2423", "👉 Biotin Supplementation-The Cause of Hypersensitivity and Significant Interference in Allergy Diagnostics, Positive/therapeutic effect mentioned", "40806008"),
                    Reference("Acta Vet Hung. 2025 Jun 5;73(2):73-80", "👉 Nutrition, health and welfare of Norwegian pet guinea pigs, G", "40471685"),
                    Reference("J Med Case Rep. 2024 Jan 18;18(1):38", "👉 Pediatric femoral shaft fracture requiring revision surgery for nonunion associated with vitamin D and K deficiencies: a case report, month", "38233902"),

                    // Minerals
                    Reference("Nail-Patella Syndrome. GeneReviews", "👉 Negative/adverse effect mentioned", "20301311"),
                    Reference("Int J Biol Macromol. 2023 Jul 15;243:125330", "👉 Feather keratin-montmorillonite nanocomposite hydrogel promotes bone regeneration by stimulating the osteogenic differentiation of endogenous stem cells, Positive/therapeutic effect mentioned", "37307978"),
                    Reference("Environ Res. 2022 May 1;207:112186", "👉 Combined association of early exposure to long-chain n-3 polyunsaturated fatty acids, mercury and selenium with cognitive performance in 1-year-old infants, month", "34627802"),

                    // Supplements
                    Reference("Nutrients. 2025 Jul 24;17(15):2423", "👉 Biotin Supplementation-The Cause of Hypersensitivity and Significant Interference in Allergy Diagnostics, Positive/therapeutic effect mentioned", "40806008"),
                    Reference("Acta Vet Hung. 2025 Jun 5;73(2):73-80", "👉 Nutrition, health and welfare of Norwegian pet guinea pigs, G", "40471685"),
                    Reference("Cureus. 2022 May 9;14(5):e24856", "👉 Collagen Structure, Synthesis, and Its Applications: A Systematic Review, Positive/therapeutic effect mentioned", "35702467"),

                    // Nutrients
                    Reference("Nutrients. 2025 Jul 24;17(15):2423", "👉 Biotin Supplementation-The Cause of Hypersensitivity and Significant Interference in Allergy Diagnostics, Positive/therapeutic effect mentioned", "40806008"),
                    Reference("Environ Geochem Health. 2024 Apr 5;46(5):150", "👉 Toxicological profile and potential health concerns through metals and trace elements exposure in brick kiln workers from Lahore, Pakistan, Negative/adverse effect mentioned", "38578528"),
                    Reference("J Med Case Rep. 2024 Jan 18;18(1):38", "👉 Pediatric femoral shaft fracture requiring revision surgery for nonunion associated with vitamin D and K deficiencies: a case report, month", "38233902")
                )
            )

            "Nausea" -> Pair(
                """
Alternative approaches
1. First-in-Human Study of [(211)At]NaAt as Targeted α-Therapy in Patients with Radioiodine-Refractory Thyroid Cancer, Negative/adverse effect mentioned
2. Hotspots and trends in acupuncture combined with non-invasive neuromodulation technology in the past 20 years: Positive/therapeutic effect mentioned
3. Comparison of opioid-free anesthesia with opioid-based anesthesia in neonates and infants undergoing laparoscopic or endoscopic surgeries, Negative/adverse effect mentioned

Herbs
1. Acupuncture and Herbal Medicine for Nausea and Vomiting in Pregnancy: Overview, No clear dose/effect/duration found
2. Common adverse events of herbal formulas: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Symptom improvements and adverse effects with Reishi mushroom use, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Amino acids
1. Occurrence of Anisakis spp. in fish and fish products, No clear dose/effect/duration found
2. Metabolic Effects of Healing Touch During Cervical Cancer Treatment: An Exploratory Analysis, week
3. In Silico Exploration of Therapeutics for GLP-1 Receptor Agonist-Induced Nausea in Mice, Negative/adverse effect mentioned

Vitamins
1. Acute kidney injury due to vitamin D overdose, Negative/adverse effect mentioned
2. Occurrence of Anisakis spp. in fish and fish products, No clear dose/effect/duration found
3. Sarcopenia, Cachexia, and Aging: Review, Positive/therapeutic effect mentioned

Minerals
1. Occurrence of Anisakis spp. in fish and fish products, No clear dose/effect/duration found
2. Recognizing Juvenile Nephronophthisis in Pediatric Practice, week
3. Ketamine-induced pica behavior as nausea and vomiting involves dopamine and serotonin receptor activation in rats, Negative/adverse effect mentioned | day

Supplements
1. Acute kidney injury due to vitamin D overdose, Negative/adverse effect mentioned
2. AI and natural language processing to evaluate semaglutide for weight loss, Negative/adverse effect mentioned | day
3. Sarcopenia, Cachexia, and Aging: Review, Positive/therapeutic effect mentioned

Nutrients
1. Acute kidney injury due to vitamin D overdose, Negative/adverse effect mentioned
2. Sarcopenia, Cachexia, and Aging: Review, Positive/therapeutic effect mentioned
3. Malnutrition and Nutrition Impact Symptoms in Kuwaiti Colorectal Cancer Patients, Positive/therapeutic effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("J Nucl Med. 2025 Sep 25:jnumed.125.270810", "👉 First-in-Human Study of [(211)At]NaAt as Targeted α-Therapy in Patients with Radioiodine-Refractory Thyroid Cancer (Alpha-T1 Trial), g | Negative/adverse effect mentioned", "40998730"),
                    Reference("Front Neurol. 2025 Sep 9;16:1511655", "👉 Hotspots and trends in acupuncture combined with non-invasive neuromodulation technology in the past 20 years: a bibliometric analysis, Positive/therapeutic effect mentioned", "40994712"),
                    Reference("Saudi J Anaesth. 2025 Oct-Dec;19(4):559-565", "👉 Comparison of opioid-free anesthesia with opioid-based anesthesia in neonates and infants undergoing laparoscopic or endoscopic surgeries: A randomized controlled trial, Negative/adverse effect mentioned", "40994471"),

                    // Herbs
                    Reference("Int J Womens Health. 2025 May 11;17:1343-1361", "👉 Acupuncture and Herbal Medicine for Nausea and Vomiting in Pregnancy: An Overview and Quality Assessment of Systematic Reviews, No clear dose/effect/duration found", "40386086"),
                    Reference("Integr Med Res. 2025 Mar;14(1):101118", "👉 Common adverse events of herbal formulas for developing reporting forms for clinical practice and research: An overview of systematic reviews, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "39944113"),
                    Reference("Integr Med Res. 2024 Dec;13(4):101089", "👉 Symptom improvements and adverse effects with Reishi mushroom use: A Cross-Sectional survey of cancer patients, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "39635077"),

                    // Amino acids
                    Reference("Open Vet J. 2025 Jun;15(6):2774-2781", "👉 Occurrence of Anisakis spp. in fish and fish products in Egyptian markets, No clear dose/effect/duration found", "40989632"),
                    Reference("Integr Cancer Ther. 2025 Jan-Dec;24:15347354251367793", "👉 Metabolic Effects of Healing Touch During Cervical Cancer Treatment: An Exploratory Analysis, g | week", "40908656"),
                    Reference("Biol Pharm Bull. 2025;48(8):1233-1238", "👉 In Silico Exploration of Therapeutics for GLP-1 Receptor Agonist-Induced Nausea and Their in Vivo Validation in Mice, Negative/adverse effect mentioned", "40866246"),

                    // Vitamins
                    Reference("Tidsskr Nor Laegeforen. 2025 Sep 23;145(11)", "👉 Akutt nyresvikt som følge av vitamin D-forgiftning, mcg | Negative/adverse effect mentioned", "41001862"),
                    Reference("Open Vet J. 2025 Jun;15(6):2774-2781", "👉 Occurrence of Anisakis spp. in fish and fish products in Egyptian markets, No clear dose/effect/duration found", "40989632"),
                    Reference("J Assoc Physicians India. 2025 Sep;73(9):85-90", "👉 A Review on Sarcopenia, Cachexia, and Aging, Positive/therapeutic effect mentioned", "40955936"),

                    // Minerals
                    Reference("Open Vet J. 2025 Jun;15(6):2774-2781", "👉 Occurrence of Anisakis spp. in fish and fish products in Egyptian markets, No clear dose/effect/duration found", "40989632"),
                    Reference("J Pediatr Health Care. 2025 Sep 2:S0891-5245(25)00245-7", "👉 When Nonspecific Symptoms Conceal Kidney Disease: A Case Report on Recognizing Juvenile Nephronophthisis in Pediatric Practice, g", "40892003"),
                    Reference("Eur J Pharmacol. 2025 Oct 15;1005:178068", "👉 Ketamine-induced pica behavior as nausea and vomiting involves dopamine and serotonin receptor activation in the area postrema of rats: A comparison with etomidate and pentobarbital, mg | Negative/adverse effect mentioned | day", "40818653"),

                    // Supplements
                    Reference("Tidsskr Nor Laegeforen. 2025 Sep 23;145(11)", "👉 Akutt nyresvikt som følge av vitamin D-forgiftning, mcg | Negative/adverse effect mentioned", "41001862"),
                    Reference("Ann Epidemiol. 2025 Sep 14;111:9-13", "👉 Artificial intelligence and natural language processing of patient narratives to evaluate semaglutide for weight loss, Negative/adverse effect mentioned | day", "40957545"),
                    Reference("J Assoc Physicians India. 2025 Sep;73(9):85-90", "👉 A Review on Sarcopenia, Cachexia, and Aging, Positive/therapeutic effect mentioned", "40955936"),

                    // Nutrients
                    Reference("Tidsskr Nor Laegeforen. 2025 Sep 23;145(11)", "👉 Akutt nyresvikt som følge av vitamin D-forgiftning, mcg | Negative/adverse effect mentioned", "41001862"),
                    Reference("J Assoc Physicians India. 2025 Sep;73(9):85-90", "👉 A Review on Sarcopenia, Cachexia, and Aging, Positive/therapeutic effect mentioned", "40955936"),
                    Reference("Nutrients. 2025 Aug 27;17(17):2770", "👉 Malnutrition and Nutrition Impact Symptoms in Kuwaiti Colorectal Cancer Patients: Validation of PG-SGA Short Form, Positive/therapeutic effect mentioned", "40944163")
                )
            )

            "Neck pain" -> Pair(
                """
Alternative approaches
1. Confirmation bias in medical referrals: an unusual presentation of pain at the base of the skull, Positive/therapeutic effect mentioned
2. High thoracic erector spinae plane block for cervical radicular pain: Does steroid addition enhance outcomes?, Positive/therapeutic effect mentioned | week
3. Efficacy and cosmetic outcomes of high-dose-rate brachytherapy in the treatment of nasal carcinomas, G | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month

Herbs
1. Subcellular redistribution of Rhein from whole cellular to single mitochondria for enhancing anti-hepatoma efficacy, Positive/therapeutic effect mentioned
2. Catharanthus roseus intoxication mimicking acute cholangitis, Negative/adverse effect mentioned
3. The role of kaempferol in gynaecological malignancies: progress and perspectives, Positive/therapeutic effect mentioned

Amino acids
1. L-arginine vs. L-glutamine oral suspensions for radiation-induced oral mucositis, g | Positive/therapeutic effect mentioned
2. Efficacy of prophylactic gabapentin in managing oral mucositis pain in patients undergoing non-surgical management of head and neck tumors, No clear dose/effect/duration found
3. Onset of secondary SUNCT syndrome with concomitant occipital neuralgia after dorsal medullary infarction, No clear dose/effect/duration found

Vitamins
1. Kleefeld F et al., GeneReviews, No clear dose/effect/duration found
2. Beta-thalassemia trait: an underrecognized risk for osteoporosis in postmenopausal women, Positive/therapeutic effect mentioned
3. Postoperative Rehabilitation for Pain and Functional Recovery Following Anterior Cervical Discectomy and Fusion, Positive/therapeutic effect mentioned | week

Minerals
1. Short versus long proximal femoral nail anti-rotation-II (PFNA-II) in the management of unstable intertrochanteric fractures, week
2. Bone quality response to lifestyle intervention in older adults with obesity, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month
3. Effectiveness of Platelet-Rich Fibrin or Platelet-Rich Plasma in Mandibular Fracture Management, Positive/therapeutic effect mentioned | month

Supplements
1. Effectiveness and Safety of Tuina Therapy Combined With Yijinjing Exercise for Neck Pain, Positive/therapeutic effect mentioned
2. Oral rehabilitation and quality of life in head and neck cancer patients receiving dental clearance prior to radiotherapy, Positive/therapeutic effect mentioned | month
3. Preemptive, Self-Applied Photobiomodulation in the Treatment of Oral Mucositis, Negative/adverse effect mentioned

Nutrients
1. Curcumin Supplementation Improves Gastrointestinal Symptoms in Women with Severe Obesity, mg | Positive/therapeutic effect mentioned | week
2. Vitamin D and Clinical Outcomes in Head and Neck Cancer, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Dietary Counseling Interventions During Radiation Therapy, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("BMJ Case Rep. 2025 Sep 25;18(9):e267111", "👉 Confirmation bias in medical referrals: an unusual presentation of pain at the base of the skull, Positive/therapeutic effect mentioned", "40998548"),
                    Reference("Medicine (Baltimore). 2025 Sep 19;104(38):e44749", "👉 High thoracic erector spinae plane block for cervical radicular pain: Does steroid addition enhance outcomes?: A retrospective comparative study, Positive/therapeutic effect mentioned | week", "40988266"),
                    Reference("Int J Radiat Biol. 2025 Sep 23:1-7", "👉 Efficacy and cosmetic outcomes of high-dose-rate brachytherapy in the treatment of nasal carcinomas: a retrospective analysis, G | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month", "40986749"),

                    // Herbs
                    Reference("Phytomedicine. 2025 Sep;145:156962", "👉 Subcellular redistribution of Rhein from whole cellular to single mitochondria for enhancing anti-hepatoma efficacy, Positive/therapeutic effect mentioned", "40554895"),
                    Reference("BMC Complement Med Ther. 2024 Apr 4;24(1):139", "👉 Catharanthus roseus intoxication mimicking acute cholangitis, Negative/adverse effect mentioned", "38575897"),
                    Reference("Front Pharmacol. 2023 Dec 4;14:1310416", "👉 The role of kaempferol in gynaecological malignancies: progress and perspectives, Positive/therapeutic effect mentioned", "38143502"),

                    // Amino acids
                    Reference("J Cancer Res Clin Oncol. 2025 Jul 3;151(7):198", "👉 L-arginine vs. L-glutamine oral suspensions for radiation-induced oral mucositis: a triple-blind randomized trial, g | Positive/therapeutic effect mentioned", "40603739"),
                    Reference("Support Care Cancer. 2025 Jun 20;33(7):600", "👉 Efficacy of prophylactic gabapentin in managing oral mucositis pain in patients undergoing non-surgical management of head and neck tumors, No clear dose/effect/duration found", "40540230"),
                    Reference("BMJ Case Rep. 2025 Mar 28;18(3):e264684", "👉 Onset of secondary SUNCT syndrome with concomitant occipital neuralgia after dorsal medullary infarction, No clear dose/effect/duration found", "40154552"),

                    // Vitamins
                    Reference("Myotonic Dystrophy Type 2", "👉 Kleefeld F et al., GeneReviews, No clear dose/effect/duration found", "20301639"),
                    Reference("Endocrinol Diabetes Metab Case Rep. 2025 Sep 11;2025(3):e250073", "👉 Beta-thalassemia trait: an underrecognized risk for osteoporosis in postmenopausal women, Positive/therapeutic effect mentioned", "40932695"),
                    Reference("J Pain Res. 2025 Aug 20;18:4173-4183", "👉 Postoperative Rehabilitation for Pain and Functional Recovery Following Anterior Cervical Discectomy and Fusion: A Narrative Review, Positive/therapeutic effect mentioned | week", "40860504"),

                    // Minerals
                    Reference("Int J Burns Trauma. 2025 Aug 15;15(4):159-170", "👉 Short versus long proximal femoral nail anti-rotation-II (PFNA-II) in the management of unstable intertrochanteric fractures, week", "40978687"),
                    Reference("Lancet Healthy Longev. 2026 Sep 30:100761", "👉 Bone quality response to lifestyle intervention in older adults with obesity (LIMB-Q trial): a randomised controlled trial, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month", "40976254"),
                    Reference("J Stomatol Oral Maxillofac Surg. 2025 Sep 5:102544", "👉 Effectiveness of Platelet-Rich Fibrin or Platelet-Rich Plasma in Mandibular Fracture Management: A Systematic Review and Meta-Analysis, Positive/therapeutic effect mentioned | month", "40915418"),

                    // Supplements
                    Reference("JMIR Res Protoc. 2025 Sep 17;14:e77864", "👉 Effectiveness and Safety of Tuina Therapy Combined With Yijinjing Exercise for Neck Pain: Protocol for a Systematic Review and Meta-Analysis, Positive/therapeutic effect mentioned", "40961482"),
                    Reference("Support Care Cancer. 2025 Sep 11;33(10):846", "👉 Oral rehabilitation and quality of life in head and neck cancer patients receiving dental clearance prior to radiotherapy: a retrospective observational study, Positive/therapeutic effect mentioned | month", "40936034"),
                    Reference("Case Rep Oncol. 2025 Mar 10;18(1):311-318", "👉 Preemptive, Self-Applied Photobiomodulation in the Treatment of Oral Mucositis: A High-Risk Case Study, Negative/adverse effect mentioned", "40881977"),

                    // Nutrients
                    Reference("Nutrients. 2025 Jun 20;17(13):2064", "👉 Curcumin Supplementation Improves Gastrointestinal Symptoms in Women with Severe Obesity: A Double-Blind, Randomized, Placebo-Controlled Trial-A Pilot Study, mg | Positive/therapeutic effect mentioned | week", "40647170"),
                    Reference("Nutrients. 2025 Mar 21;17(7):1100", "👉 Vitamin D and Clinical Outcomes in Head and Neck Cancer: A Systematic Review, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40218858"),
                    Reference("Nutr Cancer. 2025;77(1):26-50", "👉 Dietary Counseling Interventions During Radiation Therapy: A Systematic Review of Feasibility, Safety, and Efficacy, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "39340400")
                )
            )

            "Nerve pain" -> Pair(
                """
Alternative approaches
1. Comparison of Bilateral Rectus Sheath Block and Thoracic Epidural Analgesia for Postoperative Pain Control After Open Gastrectomy, µg, mg | Positive/therapeutic effect mentioned
2. Radiofrequency Ablation and Pulsed Radiofrequency of Suprascapular Nerves for Managing Chronic Shoulder Pain, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month
3. The combination of interpectoral plane and superficial serratus anterior plane blocks for the prevention of persistent pain after total mastectomy, Positive/therapeutic effect mentioned | month

Herbs
1. A Case of Volkmann's Ischemic Contracture - A Case Report, Positive/therapeutic effect mentioned | month
2. Mechanistic exploration of licorice reconciling Medicine:Huangqi Guizhi Wuwu decoction and Shaoyao Gancao decoction compatibility, Positive/therapeutic effect mentioned
3. Mechanism and Application of Chinese Herb Medicine in Treatment of Peripheral Nerve Injury, Negative/adverse effect mentioned

Amino acids
1. Analgesic effects of transcutaneous auricular vagus nerve stimulation on partial sciatic nerve ligation-induced neuropathic pain in mice via serotonergic pathways, Negative/adverse effect mentioned
2. Safety and effectiveness of pregabalin controlled-release in Korean patients with peripheral neuropathic pain, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week
3. Comparative Effectiveness of Gabapentin and Pregabalin Combination Therapy in Postherpetic Neuralgia, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week

Vitamins
1. Multifactorial Determinants of Pulsed Radiofrequency Treatment Outcomes in Meralgia Paresthetica, Positive/therapeutic effect mentioned | month
2. Management of neuropathic pain: a survey of the Italian Association for the Study of Pain, Negative/adverse effect mentioned
3. GeneReviews, Positive/therapeutic effect mentioned | month

Minerals
1. Transverse process-pedicle approach versus conventional transpedicular approach in percutaneous kyphoplasty for osteoporotic vertebral compression fracture, Positive/therapeutic effect mentioned | day, month
2. Medial humeral epicondylitis: a retrospective case series of nine cats, Positive/therapeutic effect mentioned
3. NERVE GROWTH FACTOR IS SUFFICIENT TO CAUSE MULTIPLE OSTEOARTHRITIS-RELEVANT PATHOLOGICAL FEATURES IN NAÏVE MURINE KNEE JOINTS, Negative/adverse effect mentioned | week

Supplements
1. Omega-3 fatty acid supplementation for distal symmetrical peripheral neuropathy in adults with diabetes mellitus, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day
2. Full Endoscopic Decompression Surgery for Far-Out Syndrome Via Pseudoarthrosis Formed by L5 Transverse Process and Sacral Ala: A Preliminary Outcome, No clear dose/effect/duration found
3. Effectiveness of Peripheral Nerve Stimulation in Managing Chronic Pain, Positive/therapeutic effect mentioned | day, month

Nutrients
1. A Narrative Hypothesis: The Important Role of Gut Microbiota in the Modulation of Effort Tolerance in Endurance Athletes, Positive/therapeutic effect mentioned
2. Pathologic and Therapeutic Schwann Cells, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Neuroprotective Potential of Acmella oleracea Aerial Parts and Root Extracts, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Medicina (Kaunas). 2025 Sep 18;61(9):1695", "👉 Comparison of Bilateral Rectus Sheath Block and Thoracic Epidural Analgesia for Postoperative Pain Control After Open Gastrectomy: A Randomized Controlled Trial, µg, mg | Positive/therapeutic effect mentioned", "41011085"),
                    Reference("Brain Sci. 2025 Aug 26;15(9):915", "👉 Radiofrequency Ablation and Pulsed Radiofrequency of Suprascapular Nerves for Managing Chronic Shoulder Pain, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month", "41008275"),
                    Reference("Anaesthesia. 2025 Sep 26", "👉 The combination of interpectoral plane and superficial serratus anterior plane blocks for the prevention of persistent pain after total mastectomy: a triple-blinded, randomised, placebo-controlled trial, Positive/therapeutic effect mentioned | month", "41006194"),

                    // Herbs
                    Reference("J Orthop Case Rep. 2025 Sep;15(9):138-142", "👉 A Case of Volkmann's Ischemic Contracture - A Case Report, Positive/therapeutic effect mentioned | month", "40936822"),
                    Reference("J Ethnopharmacol. 2025 Apr 25;346:119708", "👉 Mechanistic exploration of licorice reconciling Medicine:Huangqi Guizhi Wuwu decoction and Shaoyao Gancao decoction compatibility, Positive/therapeutic effect mentioned", "40147678"),
                    Reference("Chin J Integr Med. 2025 Mar;31(3):270-280", "👉 Mechanism and Application of Chinese Herb Medicine in Treatment of Peripheral Nerve Injury, Negative/adverse effect mentioned", "39617868"),

                    // Amino acids
                    Reference("Mol Brain. 2025 Sep 26;18(1):73", "👉 Analgesic effects of transcutaneous auricular vagus nerve stimulation on partial sciatic nerve ligation-induced neuropathic pain in mice via serotonergic pathways, Negative/adverse effect mentioned", "41013640"),
                    Reference("Medicine (Baltimore). 2025 Sep 19;104(38):e44813", "👉 Safety and effectiveness of pregabalin controlled-release in Korean patients with peripheral neuropathic pain, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week", "40988176"),
                    Reference("J Coll Physicians Surg Pak. 2025 Sep;35(9):1122-1127", "👉 Comparative Effectiveness of Gabapentin and Pregabalin Combination Therapy in Postherpetic Neuralgia, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week", "40948158"),

                    // Vitamins
                    Reference("Neurol India. 2025 Sep 1;73(5):1033-1040", "👉 Multifactorial Determinants of Pulsed Radiofrequency Treatment Outcomes in Meralgia Paresthetica, Positive/therapeutic effect mentioned | month", "40946286"),
                    Reference("Minerva Anestesiol. 2025 Sep 10", "👉 Management of neuropathic pain: a survey of the Italian Association for the Study of Pain, Negative/adverse effect mentioned", "40928506"),
                    Reference("TCIRG1-Related Osteopetrosis", "👉 GeneReviews, Positive/therapeutic effect mentioned | month", "40875877"),

                    // Minerals
                    Reference("J Orthop Surg Res. 2025 Aug 22;20(1):787", "👉 Transverse process-pedicle approach versus conventional transpedicular approach in percutaneous kyphoplasty for osteoporotic vertebral compression fracture, Positive/therapeutic effect mentioned | day, month", "40847405"),
                    Reference("J Feline Med Surg. 2025 Jul;27(7):1098612X251347952", "👉 Medial humeral epicondylitis: a retrospective case series of nine cats, Positive/therapeutic effect mentioned", "40735978"),
                    Reference("bioRxiv [Preprint]. 2025 Jun 26:2025.06.20.660696", "👉 NERVE GROWTH FACTOR IS SUFFICIENT TO CAUSE MULTIPLE OSTEOARTHRITIS-RELEVANT PATHOLOGICAL FEATURES IN NAÏVE MURINE KNEE JOINTS, Negative/adverse effect mentioned | week", "40666997"),

                    // Supplements
                    Reference("Cochrane Database Syst Rev. 2025 Sep 24;9(9):CD014623", "👉 Omega-3 fatty acid supplementation for distal symmetrical peripheral neuropathy in adults with diabetes mellitus, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day", "40990181"),
                    Reference("Pain Physician. 2025 Sep;28(5):E525-E533", "👉 Full Endoscopic Decompression Surgery for Far-Out Syndrome Via Pseudoarthrosis Formed by L5 Transverse Process and Sacral Ala: A Preliminary Outcome, No clear dose/effect/duration found", "40986907"),
                    Reference("Pain Physician. 2025 Sep;28(5):E481-E507", "👉 Effectiveness of Peripheral Nerve Stimulation in Managing Chronic Pain: A Systematic Review and Meta-analysis of Randomized Controlled Trials, Positive/therapeutic effect mentioned | day, month", "40986902"),

                    // Nutrients
                    Reference("Nutrients. 2025 Aug 31;17(17):2836", "👉 A Narrative Hypothesis: The Important Role of Gut Microbiota in the Modulation of Effort Tolerance in Endurance Athletes, Positive/therapeutic effect mentioned", "40944224"),
                    Reference("Cells. 2025 Aug 28;14(17):1336", "👉 Pathologic and Therapeutic Schwann Cells, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40940747"),
                    Reference("Nutrients. 2025 Aug 8;17(16):2588", "👉 Neuroprotective Potential of Acmella oleracea Aerial Parts and Root Extracts: The Role of Phenols and Alkylamides Against Neuropathic Pain, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40871616")
                )
            )

            "Nervous system disorders" -> Pair(
                """
Alternative approaches
1. A Typical Neuroaxonal Dystrophy or an Atypical Form of Huntington Disease?, No clear dose/effect/duration found
2. Clinical feasibility of motor hotspot localization based on EEG using CNN in stroke, Positive/therapeutic effect mentioned
3. Syphilis and the Eye: Clinical Features, Diagnostic Challenges, and Evolving Therapeutic Paradigms, Positive/therapeutic effect mentioned

Herbs
1. Melatonergic Receptor Agonists Used in Clinical Practice in Insomnia Treatment: Melatonin, Tasimelteon, Ramelteon, Agomelatine, and Selected Herbs, Negative/adverse effect mentioned
2. Phytonutrients and their neuroprotective role in brain disorders, Negative/adverse effect mentioned
3. Inflasinusans in the treatment of acute rhinosinusitis, Positive/therapeutic effect mentioned | week

Amino acids
1. Characterizing tuberculous meningitis in a South African pediatric cohort using metabolomics, Positive/therapeutic effect mentioned
2. Adenine base editing rescues disrupted BCKDH function and reduces BCAA toxic accumulation, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Transcutaneous auricular vagus nerve stimulation on neuropathic pain in mice, Negative/adverse effect mentioned

Vitamins
1. 3D-Printed Gel-Based Supplement-Containing Tablets for Neurological Pain Management, Positive/therapeutic effect mentioned
2. Vitamin D Associated with Exercise in Neurodegenerative Disease Protection, Positive/therapeutic effect mentioned
3. Feeding Models in Classical Phenylketonuria: effect on infant sleep, Positive/therapeutic effect mentioned | month

Minerals
1. Biomimetic Cu(2-x)Se nanoplatforms for glioblastoma treatment, Positive/therapeutic effect mentioned
2. Nutrition and Exercise Education with Dietary Supplementation for Sarcopenia Prevention, Positive/therapeutic effect mentioned
3. Insomnia association with fatigue and mood in postmenopausal osteoporosis, Positive/therapeutic effect mentioned

Supplements
1. Probiotic-Derived Extracellular Vesicles Attenuate Sarcopenia via Muscle Regeneration, Positive/therapeutic effect mentioned
2. Hospital and health system factors with ED length of stay in older adults with dementia, No clear dose/effect/duration found
3. 3D-Printed Gel-Based Supplement-Containing Tablets for Neurological Pain Management, Positive/therapeutic effect mentioned

Nutrients
1. Early Oral Administration of D-Chiro-Inositol reverses hippocampal insulin and glutamate deficits in Alzheimer’s model, month
2. Feeding Models in Classical Phenylketonuria: effect on infant sleep, Positive/therapeutic effect mentioned | month
3. Vitamin D Metabolites associations with adiposity and muscle-related phenotypes, No clear dose/effect/duration found
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Pediatr Neurol. 2025 Aug 26;173:30-32", "👉 A Typical Neuroaxonal Dystrophy or an Atypical Form of Huntington Disease?, No clear dose/effect/duration found", "41014804"),
                    Reference("J Neuroeng Rehabil. 2025 Sep 26;22(1):193", "👉 Clinical feasibility of motor hotspot localization based on electroencephalography using convolutional neural networks in stroke, Positive/therapeutic effect mentioned", "41013546"),
                    Reference("Pathogens. 2025 Aug 27;14(9):852", "👉 Syphilis and the Eye: Clinical Features, Diagnostic Challenges, and Evolving Therapeutic Paradigms, Positive/therapeutic effect mentioned", "41011752"),

                    // Herbs
                    Reference("Molecules. 2025 Sep 19;30(18):3814", "👉 The Efficacy of Melatonergic Receptor Agonists Used in Clinical Practice in Insomnia Treatment: Melatonin, Tasimelteon, Ramelteon, Agomelatine, and Selected Herbs, Negative/adverse effect mentioned", "41011705"),
                    Reference("Front Mol Biosci. 2025 Sep 2;12:1607330", "👉 Phytonutrients and their neuroprotective role in brain disorders, Negative/adverse effect mentioned", "40964091"),
                    Reference("Vestn Otorinolaringol. 2025;90(4):64-71", "👉 [The role of Inflasinusans in the treatment of acute rhinosinusitis], Positive/therapeutic effect mentioned | week", "40899893"),

                    // Amino acids
                    Reference("Med Microbiol Immunol. 2025 Sep 27;214(1):46", "👉 Characterizing tuberculous meningitis in a South African pediatric cohort using GCxGC-TOFMS metabolomics, Positive/therapeutic effect mentioned", "41014409"),
                    Reference("Stem Cell Res Ther. 2025 Sep 26;16(1):512", "👉 Adenine base editing rescues disrupted BCKDH function and reduces BCAAs toxic accumulation in maple syrup urine disease patient iPSC-hepatic organoids, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41013826"),
                    Reference("Mol Brain. 2025 Sep 26;18(1):73", "👉 Analgesic effects of transcutaneous auricular vagus nerve stimulation on partial sciatic nerve ligation-induced neuropathic pain in mice via serotonergic pathways, Negative/adverse effect mentioned", "41013640"),

                    // Vitamins
                    Reference("Pharmaceutics. 2025 Sep 6;17(9):1168", "👉 Development of 3D-Printed Gel-Based Supplement-Containing Tablets with Tailored Release Profiles for Neurological Pain Management, Positive/therapeutic effect mentioned", "41012503"),
                    Reference("Molecules. 2025 Sep 21;30(18):3823", "👉 Vitamin D Associated with Exercise Can Be Used as a Promising Tool in Neurodegenerative Disease Protection, Positive/therapeutic effect mentioned", "41011716"),
                    Reference("Nutrients. 2025 Sep 22;17(18):3022", "👉 Feeding Models in Classical Phenylketonuria: Do They Make a Difference in Infant Sleep?, Positive/therapeutic effect mentioned | month", "41010547"),

                    // Minerals
                    Reference("J Nanobiotechnology. 2025 Sep 26;23(1):609", "👉 Biomimetic Cu(2-x)Se nanoplatforms for efficient glioblastoma treatment: overcoming the blood-brain barrier and boosting Immunogenetic cell death, Positive/therapeutic effect mentioned", "41013700"),
                    Reference("Nutrients. 2025 Sep 20;17(18):3008", "👉 A 12-Week Randomized Controlled Trial of Nutrition and Exercise Education with Dietary Supplementation for Sarcopenia Prevention in Korean Baby Boomers, Positive/therapeutic effect mentioned", "41010533"),
                    Reference("Rev Assoc Med Bras (1992). 2025 Sep 19;71(8):e20250426", "👉 The association of insomnia with fatigue and mood in postmenopausal osteoporosis, Positive/therapeutic effect mentioned", "40990750"),

                    // Supplements
                    Reference("J Food Sci. 2025 Oct;90(10):e70586", "👉 Probiotic-Derived Extracellular Vesicles Attenuate Sarcopenia via Muscle Regeneration, g | Positive/therapeutic effect mentioned", "41014082"),
                    Reference("BMC Emerg Med. 2025 Sep 26;25(1):193", "👉 Association of hospital and health system factors with emergency department length of stay in older adults with dementia, No clear dose/effect/duration found", "41013282"),
                    Reference("Pharmaceutics. 2025 Sep 6;17(9):1168", "👉 Development of 3D-Printed Gel-Based Supplement-Containing Tablets with Tailored Release Profiles for Neurological Pain Management, Positive/therapeutic effect mentioned", "41012503"),

                    // Nutrients
                    Reference("Nutrients. 2025 Sep 22;17(18):3024", "👉 Early Oral Administration of D-Chiro-Inositol Reverses Hippocampal Insulin and Glutamate Signaling Deficits in the 3×Tg Humanized Mouse Model of Alzheimer's Disease, month", "41010550"),
                    Reference("Nutrients. 2025 Sep 22;17(18):3022", "👉 Feeding Models in Classical Phenylketonuria: Do They Make a Difference in Infant Sleep?, Positive/therapeutic effect mentioned | month", "41010547"),
                    Reference("Nutrients. 2025 Sep 20;17(18):3013", "👉 Differential Associations of Vitamin D Metabolites with Adiposity and Muscle-Related Phenotypes in Korean Adults: Results from KNHANES 2022-2023, No clear dose/effect/duration found", "41010538")
                )
            )

            "Non-Hodgkin lymphoma" -> Pair(
                """
Alternative approaches
1. Cancer disparities in lean vs. non-lean MASH, No clear dose/effect/duration found
2. MYC and Metabolomics for DLBCL Subtyping and Diagnosis, Positive/therapeutic effect mentioned
3. Mechanisms of Resistance to CAR T-Cells and How to Overcome Them, No clear dose/effect/duration found

Herbs
1. Erianin induces pyroptosis and enhances doxorubicin efficacy in DLBCL, No clear dose/effect/duration found
2. Xiao-Ai Jie-Du decoction against DLBCL: In silico and In vitro studies, No clear dose/effect/duration found
3. Salvia officinalis L. Extract on lymphoma and leukemia cells, Negative/adverse effect mentioned

Amino acids
1. MYC and Metabolomics for DLBCL Subtyping and Diagnosis, Positive/therapeutic effect mentioned
2. V-ATPase-dependent induction of selective autophagy, No clear dose/effect/duration found
3. Histone variant H2A.B in SWI/SNF genomic deposition, No clear dose/effect/duration found

Vitamins
1. HIV-associated gut dysbiosis drives oncogenesis: therapeutic implications, Positive/therapeutic effect mentioned
2. VDR Gene Polymorphisms in DLBCL, Positive/therapeutic effect mentioned
3. Marginal Zone Lymphoma with skeletal involvement and hypercalcemia, Positive/therapeutic effect mentioned

Minerals
1. Targeted delivery of doxorubicin using monoclonal antibody-functionalized biosilica, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Bone mineral status at diagnosis in children with hematologic malignancy, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Nucleolin-targeted silicon-based nanoparticles for chemo-sonodynamic therapy, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Supplements
1. Monomorphic epitheliotropic intestinal T-cell lymphoma: clinicopathological analysis, month
2. Intravascular Lymphoma: unique pattern, No clear dose/effect/duration found
3. Faecalibacterium prausnitzii enhances anti-PD-L1 efficacy in NK/T-cell lymphoma, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Nutrients
1. V-ATPase-dependent induction of selective autophagy, No clear dose/effect/duration found
2. Divergent weight loss patterns in head and neck cancer vs. high-grade B-cell lymphoma, Positive/therapeutic effect mentioned | month
3. PUFA Supplementation in Sjögren's Syndrome, Positive/therapeutic effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("BMC Gastroenterol. 2025 Sep 26;25(1):659", "👉 Cancer disparities in lean vs. non-lean MASH: insight from a national inpatient sample, No clear dose/effect/duration found", "41013214"),
                    Reference("Biomolecules. 2025 Sep 20;15(9):1346", "👉 MYC and Metabolomics: Can We Use What We Know for DLBCL Subtyping and Diagnosis?, Positive/therapeutic effect mentioned", "41008653"),
                    Reference("Methods Protoc. 2025 Sep 11;8(5):108", "👉 Mechanisms of Resistance to CAR T-Cells and How to Overcome Them, No clear dose/effect/duration found", "40981226"),

                    // Herbs
                    Reference("Chin Med J (Engl). 2025 Aug 20", "👉 Erianin induces GSDMD-dependent pyroptosis and synergistically enhances doxorubicin efficacy via the PI3K/AKT signaling pathway in diffuse large B-cell lymphoma, No clear dose/effect/duration found", "40830921"),
                    Reference("J Ethnopharmacol. 2024 Jan 30;319(Pt 2):117271", "👉 Determination and mechanism of Xiao-Ai Jie-Du decoction against diffuse large B-cell lymphoma: In silico and In vitro studies, No clear dose/effect/duration found", "37838296"),
                    Reference("Adv Pharm Bull. 2013;3(1):51-5", "👉 Inhibitory and cytotoxic activities of salvia officinalis L. Extract on human lymphoma and leukemia cells by induction of apoptosis, μg | Negative/adverse effect mentioned", "24312812"),

                    // Amino acids
                    Reference("Biomolecules. 2025 Sep 20;15(9):1346", "👉 MYC and Metabolomics: Can We Use What We Know for DLBCL Subtyping and Diagnosis?, Positive/therapeutic effect mentioned", "41008653"),
                    Reference("Nat Commun. 2025 Sep 26;16(1):8508", "👉 V-ATPase-dependent induction of selective autophagy, No clear dose/effect/duration found", "41006286"),
                    Reference("Sci Adv. 2025 Jul 25;11(30):eadx1568", "👉 Nonchromatin regulatory functions of the histone variant H2A.B in SWI/SNF genomic deposition, No clear dose/effect/duration found", "40712016"),

                    // Vitamins
                    Reference("Front Oncol. 2025 Aug 21;15:1634388", "👉 HIV-associated gut dysbiosis drives oncogenesis through metabolic-immune crosstalk: mechanisms and therapeutic implications, Positive/therapeutic effect mentioned", "40919140"),
                    Reference("Asian Pac J Cancer Prev. 2025 May 1;26(5):1761-1766", "👉 Association of Selective VDR Gene Polymorphisms with Diffuse Large B-Cell Lymphoma (DLBCL) in a South Indian Population, Positive/therapeutic effect mentioned", "40439389"),
                    Reference("Cureus. 2025 Apr 27;17(4):e83100", "👉 Marginal Zone Lymphoma With Extensive Skeletal Involvement and Hypercalcemia: A Rare Case With a Systematic Review of the Literature, Positive/therapeutic effect mentioned", "40438858"),

                    // Minerals
                    Reference("Sci Rep. 2025 May 13;15(1):16598", "👉 Targeted delivery of doxorubicin to B-cell lymphoma using monoclonal antibody-functionalized Chaetoceros biosilica, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40360717"),
                    Reference("Pediatr Hematol Oncol. 2025 May;42(4):205-216", "👉 Bone mineral status at diagnosis οf children with hematologic malignancy, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40247676"),
                    Reference("Int J Pharm. 2025 Feb 25;671:125294", "👉 Nucleolin-targeted silicon-based nanoparticles for enhanced chemo-sonodynamic therapy of diffuse large B-cell lymphoma, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "39884591"),

                    // Supplements
                    Reference("Zhonghua Bing Li Xue Za Zhi. 2025 Sep 8;54(9):932-939", "👉 [Monomorphic epitheliotropic intestinal T-cell lymphoma: a clinicopathological and genetic mutation characteristics analysis of forty-two cases], month", "40921667"),
                    Reference("Cancers (Basel). 2025 Jul 15;17(14):2355", "👉 Intravascular Lymphoma: A Unique Pattern Underlying a Protean Disease, No clear dose/effect/duration found", "40723240"),
                    Reference("BMC Med. 2025 Jul 1;23(1):387", "👉 Faecalibacterium prausnitzii promotes anti-PD-L1 efficacy in natural killer/T-cell lymphoma by enhancing antitumor immunity, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40597177"),

                    // Nutrients
                    Reference("Nat Commun. 2025 Sep 26;16(1):8508", "👉 V-ATPase-dependent induction of selective autophagy, No clear dose/effect/duration found", "41006286"),
                    Reference("Nutrients. 2025 Jul 31;17(15):2530", "👉 Not All Weight Loss Is Equal: Divergent Patterns and Prognostic Roles in Head and Neck Cancer Versus High-Grade B-Cell Lymphoma, G | Positive/therapeutic effect mentioned | month", "40806115"),
                    Reference("Nutrients. 2024 Nov 4;16(21):3786", "👉 The Effect of Polyunsaturated Fatty Acid (PUFA) Supplementation on Clinical Manifestations and Inflammatory Parameters in Individuals with Sjögren's Syndrome: A Literature Review of Randomized Controlled Clinical Trials, Positive/therapeutic effect mentioned", "39519619")
                )
            )

            "Obesity" -> Pair(
                """
Alternative approaches
1. Diazoxide as bridging therapy in methadone-induced hypoglycemia, mg
2. V-Notes Sentinel Lymph Node Staging for Endometrial Cancer, Positive/therapeutic effect mentioned
3. Magnetic Mitohormesis in Type 2 Diabetes Mellitus, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Herbs
1. AhR in adipocyte and lipid metabolism in obesity: Friend and foe, Negative/adverse effect mentioned
2. Herbal terpenoids activate autophagy and mitophagy, Positive/therapeutic effect mentioned
3. Herbal method for obesity-type PCOS: meta-analysis and prescription regularity, Positive/therapeutic effect mentioned

Amino acids
1. Metabolomic signatures in adults with metabolic syndrome, Positive/therapeutic effect mentioned
2. Early-Life Hydrogen Sulfide Signaling for cardiovascular-kidney-metabolic syndrome, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Multi-Ingredient Supplement in body re-composition and ovarian aging, Positive/therapeutic effect mentioned

Vitamins
1. Vitamin D Metabolites associations with adiposity and muscle phenotypes, No clear dose/effect/duration found
2. Maternal Folic Acid Supplementation and pre-adolescent asthma, Positive/therapeutic effect mentioned | week
3. Nicotinamide N-Methyltransferase in cardiovascular diseases, Positive/therapeutic effect mentioned

Minerals
1. Multi-Ingredient Supplement in body re-composition and ovarian aging, Positive/therapeutic effect mentioned
2. Taro (Colocasia esculenta) research: composition, functionality, health benefits, Positive/therapeutic effect mentioned
3. Citrate and calcium kidney stones, Positive/therapeutic effect mentioned

Supplements
1. Moringa Leaf attenuates high-cholesterol diet adverse events in zebrafish, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week
2. Quince, Olive Leaf, and Amaranth Nutraceutical in Metabolic Syndrome, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week
3. Maternal Folic Acid Supplementation and pre-adolescent asthma, Positive/therapeutic effect mentioned | week

Nutrients
1. Polysaccharides in Medicago sativa (alfalfa): review on pharmacological activities, Positive/therapeutic effect mentioned
2. Nutritional Status not predicting anaphylaxis severity in pediatric cohort, No clear dose/effect/duration found
3. Plant-Based Foods effects on metabolic outcomes in MASLD and comorbidities, Positive/therapeutic effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Cardiovasc Diabetol Endocrinol Rep. 2025 Apr 25;11(1):7", "👉 Diazoxide as a bridging therapy in methadone-induced hypoglycemia- a case report and review of the literature, mg", "41013630"),
                    Reference("J Clin Med. 2025 Sep 12;14(18):6451", "👉 V-Notes Sentinel Lymph Node Staging for Endometrial Cancer: A Systematic Review, Positive/therapeutic effect mentioned", "41010655"),
                    Reference("J Clin Med. 2025 Sep 11;14(18):6413", "👉 Investigating the Metabolic Benefits of Magnetic Mitohormesis in Patients with Type 2 Diabetes Mellitus, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41010617"),

                    // Herbs
                    Reference("Life Sci. 2025 Sep 25:123996", "👉 AhR in biological processes of adipocytes and lipid metabolism in obesity: Friend and foe, Negative/adverse effect mentioned", "41015384"),
                    Reference("Nat Aging. 2025 Sep 24", "👉 Herbal terpenoids activate autophagy and mitophagy through modulation of bioenergetics and protect from metabolic stress, sarcopenia and epigenetic aging, Positive/therapeutic effect mentioned", "40993327"),
                    Reference("Front Med (Lausanne). 2025 Jul 28;12:1609131", "👉 Method of invigorating spleen and replenishing kidney and resolving phlegm for obesity-type polycystic ovary syndrome: a network meta-analysis and summary of herbal prescription regularity, Positive/therapeutic effect mentioned", "40792299"),

                    // Amino acids
                    Reference("Cardiovasc Diabetol Endocrinol Rep. 2025 Jun 10;11(1):11", "👉 Metabolomic signatures in adults with metabolic syndrome indicate preclinical disruptions in pathways associated with high-density lipoprotein cholesterol, sugar alcohols, Positive/therapeutic effect mentioned", "41013860"),
                    Reference("Antioxidants (Basel). 2025 Aug 29;14(9):1064", "👉 Early-Life Hydrogen Sulfide Signaling as a Target for Cardiovascular-Kidney-Metabolic Syndrome Reprogramming, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41008969"),
                    Reference("Biomolecules. 2025 Aug 30;15(9):1258", "👉 A Multi-Ingredient Supplement Improves Body Re-Composition, Ovarian Aging Markers, and Reproductive Success in Young and Middle-Aged Female Mice, Positive/therapeutic effect mentioned", "41008565"),

                    // Vitamins
                    Reference("Nutrients. 2025 Sep 20;17(18):3013", "👉 Differential Associations of Vitamin D Metabolites with Adiposity and Muscle-Related Phenotypes in Korean Adults, No clear dose/effect/duration found", "41010538"),
                    Reference("Nutrients. 2025 Sep 18;17(18):2989", "👉 Maternal Folic Acid Supplementation, Perinatal Factors, and Pre-Adolescent Asthma, Positive/therapeutic effect mentioned | week", "41010514"),
                    Reference("Biomolecules. 2025 Sep 4;15(9):1281", "👉 Nicotinamide N-Methyltransferase in Cardiovascular Diseases: Metabolic Regulator and Emerging Therapeutic Target, Positive/therapeutic effect mentioned", "41008588"),

                    // Minerals
                    Reference("Biomolecules. 2025 Aug 30;15(9):1258", "👉 A Multi-Ingredient Supplement Improves Body Re-Composition, Ovarian Aging Markers, and Reproductive Success in Young and Middle-Aged Female Mice, Positive/therapeutic effect mentioned", "41008565"),
                    Reference("Front Nutr. 2025 Sep 9;12:1640156", "👉 From starch to bioactives: emerging trends in taro (Colocasia esculenta L.) research on composition, functionality, health benefits, and sustainable food potential, Positive/therapeutic effect mentioned", "40995184"),
                    Reference("Clin Kidney J. 2025 Aug 4;18(9):sfaf244", "👉 Citrate and calcium kidney stones, Positive/therapeutic effect mentioned", "40978115"),

                    // Supplements
                    Reference("Pharmaceuticals (Basel). 2025 Sep 5;18(9):1336", "👉 Moringa (Moringa oleifera) Leaf Attenuates the High-Cholesterol Diet-Induced Adverse Events in Zebrafish: A 12-Week Dietary Intervention Resulted in an Anti-Obese Effect and Blood Lipid-Lowering Properties, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week", "41011207"),
                    Reference("Medicina (Kaunas). 2025 Sep 10;61(9):1638", "👉 Retrospective Analysis of a Quince, Olive Leaf, and Amaranth Nutraceutical in Patients with Metabolic Syndrome, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week", "41011029"),
                    Reference("Nutrients. 2025 Sep 18;17(18):2989", "👉 Maternal Folic Acid Supplementation, Perinatal Factors, and Pre-Adolescent Asthma, Positive/therapeutic effect mentioned | week", "41010514"),

                    // Nutrients
                    Reference("Int J Biol Macromol. 2025 Sep 25:147929", "👉 Research progress on polysaccharides in Medicago sativa L. (alfalfa): Structural characteristics, pharmacological activities and structure-activity relationships a review, Positive/therapeutic effect mentioned", "41015364"),
                    Reference("Nutrients. 2025 Sep 22;17(18):3023", "👉 Nutritional Status Is Not a Predictor of Anaphylaxis Severity in a Pediatric Cohort: A Retrospective Analysis, No clear dose/effect/duration found", "41010548"),
                    Reference("Nutrients. 2025 Sep 22;17(18):3020", "👉 Systematic Review of the Effects of Plant-Based Foods on Metabolic Outcomes in Adults with MASLD and Comorbidities Such as Obesity, Metabolic Syndrome, and Type 2 Diabetes, Positive/therapeutic effect mentioned", "41010543")
                )
            )

            "OCD" -> Pair(
                """
Alternative approaches
1. Effects of Different Cannabinoid Formulations on Anxiety-Related Disorders, and Tourette Syndrome: Positive/therapeutic effect mentioned
2. Osteochondral Allograft Transplant for Capitellar Osteochondritis Dissecans: Positive/therapeutic effect mentioned | month
3. Care Delivery Strategies for Anxiety, Depression, OCD, and Tourette Syndrome to Improve Health Outcomes in Children and Youth: Positive/therapeutic effect mentioned

Herbs
1. Extract of valerian root vs. placebo in treatment of OCD: Negative/adverse effect mentioned | week
2. Comparison of Silybum marianum with fluoxetine in OCD treatment: Negative/adverse effect mentioned | week
3. End-stage renal disease in both husband and wife: No clear dose/effect/duration found

Amino acids
1. Altered glutamate concentration in OCD: No clear dose/effect/duration found
2. RolD-like gene in sweet potato mediates stress-responsive pathways: Positive/therapeutic effect mentioned
3. Kynurenine pathway metabolites predict OCD severity: No clear dose/effect/duration found

Vitamins
1. Vitamin B12 and Folic Acid Supplementation in OCD Patients With Deficiencies: Positive/therapeutic effect mentioned
2. Role of previous streptococcal infections in adult OCD patients: No clear dose/effect/duration found
3. Gender Differences in OCD: Focus on Key Micronutrients: No clear dose/effect/duration found

Minerals
1. Fish Collagen-Based Bilayer Composite Scaffold for Osteochondral Tissue Engineering: μg | week, day
2. Subchondral bone density changes in dogs with tarsocrural osteochondrosis: No clear dose/effect/duration found
3. Cd adsorption by peanut biochar and tailing waste composite: mg

Supplements
1. Distinguishing Suicidal Obsessions from Suicidal Ideation: No clear dose/effect/duration found
2. Orthorexia nervosa prevalence among Turkish adolescents: No clear dose/effect/duration found
3. Social Responsiveness as a Mediator in Adapted CBT for Autistic Youth: Positive/therapeutic effect mentioned | month

Nutrients
1. Vitamin B12 and Folic Acid Supplementation in OCD Patients With Deficiencies: Positive/therapeutic effect mentioned
2. Combinatorial strategy for cartilage and bone microtissues using microgels: week
3. Ketogenic Diet as Nutritional Intervention for OCD: Positive/therapeutic effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Cannabis Cannabinoid Res. 2025 Sep 16", "👉 Effects of Different Cannabinoid Formulations on Anxiety-Related Disorders, and Tourette Syndrome: A Systematic Review and Meta-Analysis, Positive/therapeutic effect mentioned", "40956670"),
                    Reference("Am J Sports Med. 2025 Sep 3", "👉 Osteochondral Allograft Transplant for Capitellar Osteochondritis Dissecans: Excellent Patient-Reported Outcome Scores and High Return to Sport at Minimum 2-Year Follow-up, Positive/therapeutic effect mentioned | month", "40901735"),
                    Reference("Child Psychiatry Hum Dev. 2025 Sep 3", "👉 Care Delivery Strategies for Anxiety, Depression, Obsessive Compulsive Disorder, and Tourette Syndrome to Improve Health Outcomes in Children and Youth, Positive/therapeutic effect mentioned", "40900379"),

                    // Herbs
                    Reference("J Complement Integr Med. 2011 Oct 11", "👉 Extract of valerian root (Valeriana officinalis L.) vs. placebo in treatment of obsessive-compulsive disorder: a randomized double-blind study, mg | Negative/adverse effect mentioned | week", "22718671"),
                    Reference("Prog Neuropsychopharmacol Biol Psychiatry. 2010 Mar 17;34(2):362-5", "👉 Comparison of Silybum marianum (L.) Gaertn. with fluoxetine in the treatment of Obsessive-Compulsive Disorder, mg | Negative/adverse effect mentioned | week", "20035818"),
                    Reference("Clin Nephrol. 2009 Oct;72(4):298-302", "👉 End-stage renal disease in both husband and wife in Taiwan, No clear dose/effect/duration found", "19825336"),

                    // Amino acids
                    Reference("J Psychiatr Res. 2025 Jun;186:379-386", "👉 Altered glutamate concentration in the subcortical nuclei and its correlation with resting-state functional connectivity in unmedicated obsessive-compulsive disorder, No clear dose/effect/duration found", "40306005"),
                    Reference("Plant Physiol Biochem. 2025 Jun;223:109875", "👉 A naturally integrated RolD-like gene in sweet potato mediates stress-responsive pathways, Positive/therapeutic effect mentioned", "40188529"),
                    Reference("Psychiatry Clin Neurosci. 2025 Jul;79(7):378-388", "👉 Predictive value of kynurenine pathway metabolites in the severity of patients with obsessive-compulsive disorder, No clear dose/effect/duration found", "40167157"),

                    // Vitamins
                    Reference("Cureus. 2025 Apr 17;17(4):e82420", "👉 Evaluating Treatment Outcomes of Vitamin B12 and Folic Acid Supplementation in Obsessive-Compulsive Disorder Patients With Deficiencies: A Comparative Analysis, Positive/therapeutic effect mentioned", "40248447"),
                    Reference("CNS Spectr. 2025 Mar 24;30(1):e38", "👉 The role of previous streptococcal infections in adult patients with obsessive-compulsive disorder, No clear dose/effect/duration found", "40125567"),
                    Reference("Cureus. 2025 Feb 25;17(2):e79667", "👉 Unraveling Gender Differences in Obsessive-Compulsive Disorder: A Focus on Key Micronutrients, No clear dose/effect/duration found", "40017580"),

                    // Minerals
                    Reference("J Biomed Mater Res A. 2025 Aug;113(8):e37977", "👉 Fish Collagen-Based Bilayer Composite Scaffold Functionalized With Fibrin/Hydroxyapatite/Sodium Citrate for Osteochondral Tissue Engineering-In Vitro and In Vivo Studies, μg | week, day", "40808612"),
                    Reference("BMC Vet Res. 2025 Apr 7;21(1):252", "👉 Subchondral bone density changes of the talus in dogs with tarsocrural osteochondrosis, No clear dose/effect/duration found", "40197485"),
                    Reference("Environ Geochem Health. 2025 Jan 3;47(2):37", "👉 Adsorption properties and mechanisms of Cd by co-pyrolysis composite material derived from peanut biochar and tailing waste, mg", "39751974"),

                    // Supplements
                    Reference("J Affect Disord. 2025 Dec 15;391:119916", "👉 Distinguishing Suicidal Obsessions from Suicidal Ideation: A First-Person Suicide Image Pilot Study, No clear dose/effect/duration found", "40675259"),
                    Reference("Soc Psychiatry Psychiatr Epidemiol. 2025 May 24", "👉 Prevalence and determinants of orthorexia nervosa among Turkish adolescents, No clear dose/effect/duration found", "40411545"),
                    Reference("J Autism Dev Disord. 2025 May 7", "👉 Social Responsiveness as a Mediator in Adapted Cognitive Behavioral Therapy for Autistic Youth with Maladaptive and Interfering Anxiety, Positive/therapeutic effect mentioned | month", "40332656"),

                    // Nutrients
                    Reference("Cureus. 2025 Apr 17;17(4):e82420", "👉 Evaluating Treatment Outcomes of Vitamin B12 and Folic Acid Supplementation in Obsessive-Compulsive Disorder Patients With Deficiencies: A Comparative Analysis, Positive/therapeutic effect mentioned", "40248447"),
                    Reference("Biofabrication. 2025 Apr 22;17(3)", "👉 Combinatorial strategy for engineering cartilage and bone microtissues using microfluidic cell-laden microgels, week", "40174602"),
                    Reference("Nutrients. 2024 Dec 25;17(1):31", "👉 Ketogenic Diet as a Nutritional Metabolic Intervention for Obsessive-Compulsive Disorder: A Narrative Review, Positive/therapeutic effect mentioned", "39796465")
                )
            )

            "Oesophagitis" -> Pair(
                """
Alternative approaches
1. Stents and Emerging Alternatives in Upper Gastrointestinal Endoscopy: No clear dose/effect/duration found
2. Esophagus on-a-chip model evaluating natural remedy-mediated mucosal repair in GERD: No clear dose/effect/duration found
3. Intracardiac vs. transesophageal echocardiography for left atrial appendage occlusion: Positive/therapeutic effect mentioned

Herbs
1. USP45 acts as an oncogene regulating esophageal cancer cell proliferation: No clear dose/effect/duration found
2. Dexrazoxane inhibits growth of esophageal squamous cell carcinoma: No clear dose/effect/duration found
3. Downregulation of SODD reduces proliferation in esophageal adenocarcinoma cells: No clear dose/effect/duration found

Amino acids
1. Focal adhesion kinase/Src kinase axis in tumor metastasis: No clear dose/effect/duration found
2. Reversal of amino acid metabolism patterns as biomarker in esophageal cancer: Positive/therapeutic effect mentioned
3. Treatment of achalasia normalises energy metabolism dependent on circulating amino acids: month

Vitamins
1. Systemic Immune-Inflammation Index as prognostic marker in gastric and gastroesophageal junction cancers: month
2. Innovative staining for endoscopic screening of early esophageal cancer: No clear dose/effect/duration found
3. Nal-IRI/LV5-FU vs. paclitaxel in metastatic esophageal squamous cell carcinoma: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month

Minerals
1. Bone Mineral Density Reduction During Neoadjuvant Chemotherapy in esophageal cancer: Negative/adverse effect mentioned
2. Lucky AW, Pope E, Crawford S: Positive/therapeutic effect mentioned | month
3. Micro-scaled biogenic silica debris exposure via diet: Negative/adverse effect mentioned

Supplements
1. High-Altitude Adaptation, Metabolic Traits, and Tumors via Mendelian Randomization: No clear dose/effect/duration found
2. Healthcare insurance, TNM stage, and cancer survival associations: Positive/therapeutic effect mentioned
3. Gastroesophageal reflux disease and hernias causal relationship: Positive/therapeutic effect mentioned

Nutrients
1. Digestive System study in Triplophysa yarkandensis: No clear dose/effect/duration found
2. Dietary intake and eating patterns on reactive hypoglycemia post-esophagectomy: g | Positive/therapeutic effect mentioned | day, month
3. Nutrition Impact Symptoms on nutrition status after gastric, oesophageal, and pancreatic cancer: Positive/therapeutic effect mentioned | month
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Diagnostics (Basel). 2025 Sep 16;15(18):2344", "👉 Stents and Emerging Alternatives in Upper Gastrointestinal Endoscopy: A Comprehensive Review, No clear dose/effect/duration found", "41008715"),
                    Reference("Biomed Pharmacother. 2025 Sep 25;192:118609", "👉 A millifluidic esophagus on-a-chip model for evaluating a natural remedy-mediated mucosal repair in GERD, No clear dose/effect/duration found", "41004870"),
                    Reference("Cardiovasc Revasc Med. 2025 Sep 19:S1553-8389(25)00469-5", "👉 Intracardiac echocardiography via the transesophageal route versus transesophageal echocardiography for guiding left atrial appendage occlusion, Positive/therapeutic effect mentioned", "40998648"),

                    // Herbs
                    Reference("Genes Dis. 2023 Sep 30;11(5):101135", "👉 USP45 acts as an oncogene to regulate the proliferation of esophageal cancer cells, No clear dose/effect/duration found", "38868575"),
                    Reference("Sci Rep. 2024 Apr 22;14(1):9167", "👉 Dexrazoxane inhibits the growth of esophageal squamous cell carcinoma by attenuating SDCBP/MDA-9/syntenin-mediated EGFR-PI3K-Akt pathway activation, No clear dose/effect/duration found", "38649770"),
                    Reference("Sci Rep. 2023 Jun 29;13(1):10580", "👉 Downregulation of SODD mediates carnosol-induced reduction in cell proliferation in esophageal adenocarcinoma cells, No clear dose/effect/duration found", "37386230"),

                    // Amino acids
                    Reference("Signal Transduct Target Ther. 2025 Sep 1;10(1):280", "👉 Focal adhesion kinase/Src family kinase axis-mediated tyrosine phosphorylation of metabolic enzymes facilitates tumor metastasis, No clear dose/effect/duration found", "40887473"),
                    Reference("J Tradit Chin Med. 2025 Aug;45(4):896-908", "👉 Reversal of amino acid metabolism patterns between circulating blood and tumors as a new biomarker for the Zhengxu Xieshi syndrome in patients with esophageal squamous cell carcinoma, Positive/therapeutic effect mentioned", "40810237"),
                    Reference("Metabolomics. 2025 Aug 11;21(5):109", "👉 Treatment of achalasia led to normalisation of energy metabolism and proteosynthesis dependent on the pool of circulating amino acids; metabolomic monitoring and body composition analysis on insufficient nutrition, month", "40789970"),

                    // Vitamins
                    Reference("Medicina (Kaunas). 2025 Sep 6;61(9):1614", "👉 Systemic Immune-Inflammation Index as a Prognostic Marker in Gastric and Gastroesophageal Junction Cancers Receiving Perioperative FLOT Therapy, month", "41011005"),
                    Reference("Surg Endosc. 2025 Aug 28", "👉 Innovative staining for endoscopic screening of early esophageal cancer and precancerous lesions: a preclinical study, No clear dose/effect/duration found", "40877622"),
                    Reference("Eur J Cancer. 2025 Oct 1;228:115741", "👉 Nal-IRI/LV5-FU versus paclitaxel as second-line therapy in patients with metastatic esophageal squamous cell carcinoma (PRODIGE 62-FFCD 1701-OESIRI), Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month", "40876084"),

                    // Minerals
                    Reference("Ann Gastroenterol Surg. 2025 Apr 16;9(5):933-941", "👉 Prognostic Impact of Bone Mineral Density Reduction During Neoadjuvant Chemotherapy (NAC) in Patients Undergoing NAC Followed by Esophagectomy for Esophageal Cancer, Negative/adverse effect mentioned", "40922928"),
                    Reference("Dystrophic Epidermolysis Bullosa. 2006 Aug 21 [updated 2025 Aug 7]", "👉 Lucky AW, Pope E, Crawford S, Positive/therapeutic effect mentioned | month", "20301481"),
                    Reference("J Hazard Mater. 2025 Sep 15;496:139404", "👉 Identification of the exposure pathway to micro-scaled biogenic silica debris via diet and its potential effect in promoting esophageal squamous cell carcinoma, Negative/adverse effect mentioned", "40752161"),

                    // Supplements
                    Reference("High Alt Med Biol. 2025 Sep 25", "👉 Causal Relationships Between High-Altitude Adaptation, Metabolic Traits, and Tumors: Insights from Mendelian Randomization, No clear dose/effect/duration found", "40996420"),
                    Reference("World J Gastrointest Oncol. 2025 Sep 15;17(9):106116", "👉 Associations among healthcare insurance, tumor-node-metastasis stage and cancer survival: More to be understood, Positive/therapeutic effect mentioned", "40977671"),
                    Reference("Medicine (Baltimore). 2025 Sep 5;104(36):e44251", "👉 Causal relationship between gastroesophageal reflux disease and 7 types of hernias: A bidirectional Mendelian randomization study, Positive/therapeutic effect mentioned", "40922354"),

                    // Nutrients
                    Reference("Biology (Basel). 2025 Sep 3;14(9):1187", "👉 Histological Study on Digestive System of Triplophysa yarkandensis in Saline-Alkali and Freshwater Environments: Adaptive Mechanisms, No clear dose/effect/duration found", "41007332"),
                    Reference("Nutr Clin Pract. 2025 Sep 7", "👉 Influence of dietary intake and eating patterns on reactive hypoglycemic events in patients postesophagectomy: A prospective observational study using continuous glucose monitoring, g | Positive/therapeutic effect mentioned | day, month", "40914827"),
                    Reference("Nutrients. 2025 Aug 20;17(16):2691", "👉 The Effect of Nutrition Impact Symptoms on Nutrition Status After Completion of Curative-Intent Treatment for Gastric, Oesophageal, and Pancreatic Cancer: A Systematic Review, Positive/therapeutic effect mentioned | month", "40871719")
                )
            )

            "Osteoarthritis" -> Pair(
                """
Alternative approaches
1. Integrating exercise and medication management in geriatric care: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Cannabinoids in Chronic Pain: Negative/adverse effect mentioned
3. Short-Term Outcomes in Kinematic and Mechanical Alignment Total Knee Arthroplasty: Positive/therapeutic effect mentioned

Herbs
1. Combating Central Sensitisation of Pain in Osteoarthritis: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Analysis and Biological Functions of Cinnamaldehyde and Derivatives: Positive/therapeutic effect mentioned
3. Epigenetics and Herbs for Osteoarthritis of the Knee: No clear dose/effect/duration found

Amino acids
1. Essential Amino Acid Supplementation in Knee Osteoarthritis: g | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week
2. Tryptophan metabolic dysregulation in osteoarthritis: Negative/adverse effect mentioned
3. Nonopioid Pharmacologic Management of Chronic Noncancer Pain: Positive/therapeutic effect mentioned | month

Vitamins
1. Targeted Macrophage Modulation in Canine Osteoarthritis: µg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Poly(methacrylic acid) hydrogels using peroxidase from potato peel: Positive/therapeutic effect mentioned
3. Trends in hypovitaminosis D in Japan: Positive/therapeutic effect mentioned

Minerals
1. Systemic Inflammation in Hip Fracture and Osteoarthritis: mg | Positive/therapeutic effect mentioned
2. Sustained release of exogeneous fetuin-A from Hyaluronic acid microplates: mg | Positive/therapeutic effect mentioned | week, day
3. Musculoskeletal Manifestations of Alkaptonuria: Positive/therapeutic effect mentioned

Supplements
1. Low-molecular-weight collagen peptides in knee osteoarthritis: mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day
2. Anti-Inflammatory and Analgesic Effects of Saffron in Osteoarthritis: mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Coffee intake and bone health: No clear dose/effect/duration found

Nutrients
1. Influence of Competition Day Loads on Metabolic and Immune Response in Athletes: G
2. Modeling role of ATP metabolism in articular cartilage and osteoarthritis: Positive/therapeutic effect mentioned
3. Targeted Microbial Shifts and Metabolite Profiles in Anti-Inflammatory Diet: Positive/therapeutic effect mentioned

""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Lancet Healthy Longev. 2025 Sep 24:100763", "👉 Integrating exercise and medication management in geriatric care: a holistic strategy to enhance health outcomes and reduce polypharmacy, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41015054"),
                    Reference("Neurol Int. 2025 Sep 5;17(9):141", "👉 Cannabinoids in Chronic Pain: Clinical Outcomes, Adverse Effects and Legal Challenges, Negative/adverse effect mentioned", "41002929"),
                    Reference("Clin Pract. 2025 Aug 31;15(9):162", "👉 Prospective Comparison of Short-Term Outcomes in Kinematic and Mechanical Alignment Total Knee Arthroplasty, Positive/therapeutic effect mentioned", "41002777"),

                    // Herbs
                    Reference("Ann Neurosci. 2025 Aug 9;32(4):282-294", "👉 Traditional and Complementary Approaches in Combating Central Sensitisation of Pain in Osteoarthritis: Trends and Advances, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40792283"),
                    Reference("Antioxidants (Basel). 2025 Jun 22;14(7):765", "👉 Recent Advances on the Analysis and Biological Functions of Cinnamaldehyde and Its Derivatives, Positive/therapeutic effect mentioned", "40722869"),
                    Reference("J Pain Res. 2025 Jun 26;18:3217-3261", "👉 Epigenetics and Herbs: Potential Therapeutic Strategies for Osteoarthritis of the Knee, No clear dose/effect/duration found", "40590047"),

                    // Amino acids
                    Reference("Cureus. 2025 Aug 7;17(8):e89582", "👉 Effects of Essential Amino Acid Supplementation on Clinical Outcomes in the Conservative Management of Knee Osteoarthritis, g | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week", "40926923"),
                    Reference("Biochem Biophys Res Commun. 2025 Sep 30;782:152497", "👉 Tryptophan metabolic dysregulation drives immune activation and cartilage degradation in osteoarthritis, Negative/adverse effect mentioned", "40907267"),
                    Reference("Am Fam Physician. 2025 Aug;112(2):187-196", "👉 Nonopioid Pharmacologic Management of Chronic Noncancer Pain, Positive/therapeutic effect mentioned | month", "40834375"),

                    // Vitamins
                    Reference("Vet Sci. 2025 Sep 22;12(9):919", "👉 Targeted Macrophage Modulation as a Disease-Modifying Approach in Canine Osteoarthritis: The Efficacy of EF-M2 (Immutalon(TM)) in a Double-Blind Placebo-Controlled Study, µg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41012844"),
                    Reference("Int J Biol Macromol. 2025 Sep 19;329(Pt 2):147762", "👉 Bio-catalytic preparation of poly(methacrylic acid) hydrogels using peroxidase from potato peel waste and preliminary evaluation of their anti-inflammatory potential, Positive/therapeutic effect mentioned", "40976290"),
                    Reference("Arch Osteoporos. 2025 Aug 27;20(1):117", "👉 Trends in the prevalence of hypovitaminosis D over a 10-year period in Japan: the research on osteoarthritis/osteoporosis against disability study 2005-2015, Positive/therapeutic effect mentioned", "40864211"),

                    // Minerals
                    Reference("Int J Mol Sci. 2025 Sep 19;26(18):9138", "👉 Systemic Inflammation in Hip Fracture and Osteoarthritis: Insights into Pathways of Immunoporosis, mg | Positive/therapeutic effect mentioned", "41009701"),
                    Reference("Arthritis Res Ther. 2025 Sep 25;27(1):178", "👉 Sustained release of exogeneous fetuin-A from Hyaluronic acid microplates decreases joint degeneration, synovial hyperplasia and muscle damage in a murine post-traumatic osteoarthritis model, mg | Positive/therapeutic effect mentioned | week, day", "40999539"),
                    Reference("Cureus. 2025 Aug 23;17(8):e90841", "👉 Musculoskeletal Manifestations of Alkaptonuria: A Case-Based Review of Literature, Positive/therapeutic effect mentioned", "40995248"),

                    // Supplements
                    Reference("Front Nutr. 2025 Sep 4;12:1644899", "👉 Efficacy and safety of low-molecular-weight collagen peptides in knee osteoarthritis: a randomized, double-blind, placebo-controlled trial, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day", "40977985"),
                    Reference("Curr Rheumatol Rev. 2025 Sep 15", "👉 Potential Anti-Inflammatory and Analgesic Effects of Saffron in Patients with Osteoarthritis: A Randomized Controlled Trial, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40965059"),
                    Reference("Medicine (Baltimore). 2025 Sep 12;104(37):e44533", "👉 Causality between coffee intake and bone health: A Mendelian randomization study, No clear dose/effect/duration found", "40958293"),

                    // Nutrients
                    Reference("Nutrients. 2025 Sep 17;17(18):2978", "👉 Correction: Muniz-Santos et al. The Influence of Competition Day Loads on the Metabolic and Immune Response of Olympic Female Beach Volleyball Athletes: A Sportomics Analysis, G", "41010552"),
                    Reference("Biosystems. 2025 Sep 24;257:105597", "👉 Modeling the role of ATP metabolism in articular cartilage and osteoarthritis, Positive/therapeutic effect mentioned", "41005693"),
                    Reference("Nutrients. 2025 Aug 22;17(17):2729", "👉 Targeted Microbial Shifts and Metabolite Profiles Were Associated with Clinical Response to an Anti-Inflammatory Diet in Osteoarthritis, Positive/therapeutic effect mentioned", "40944120")
                )
            )

            "Osteoporosis" -> Pair(
                """
Alternative approaches
1. Integrating exercise and medication management in geriatric care: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Transsacral Bar Fixation for Osteoporotic H-Type Sacral Fractures: Positive/therapeutic effect mentioned | day, month
3. Beyond Hot Flashes: Role of Estrogen Receptors in Menopausal Mental Health and Cognitive Decline: No clear dose/effect/duration found

Herbs
1. Mechanisms and traditional Chinese medicine therapeutics for primary osteoporosis: No clear dose/effect/duration found
2. Capture the superior anti-osteoporotic innovative multi-component complex from Ligustri Lucidi Fructus: Positive/therapeutic effect mentioned
3. Recent Advances on the Analysis and Biological Functions of Cinnamaldehyde and Its Derivatives: Positive/therapeutic effect mentioned

Amino acids
1. Lysine: Sources, Metabolism, Physiological Importance, and Use as a Supplement: No clear dose/effect/duration found
2. Homocystinuria due to Cystathionine Beta-Synthase Deficiency: Positive/therapeutic effect mentioned
3. Amino acid profiles, aging, and sex hormone interactions in elderly population: Positive/therapeutic effect mentioned

Vitamins
1. Post-Polio Syndrome: Impact of Humoral Immune Deficiencies, Poliovirus Neutralizing Antibodies, Vitamin D Deficiency: Positive/therapeutic effect mentioned
2. Conservative and Pharmacological Strategies for Preventing Osteoporotic Stress Fractures: Positive/therapeutic effect mentioned
3. Eldecalcitol Ameliorates Type 2 Diabetic Osteoporosis: Positive/therapeutic effect mentioned

Minerals
1. Nutritional Strategies for Glucocorticoid-Induced Osteoporosis: Positive/therapeutic effect mentioned
2. Serum methylmalonic acid predicts multisite bone mineral density decline: Positive/therapeutic effect mentioned
3. Opportunistic screening of osteoporosis in lung transplant recipients: No clear dose/effect/duration found

Supplements
1. Nutritional Strategies for Glucocorticoid-Induced Osteoporosis: Positive/therapeutic effect mentioned
2. Tempeh, Daidzein, Probiotics in Postmenopausal Osteoporotic Animal Model: No clear dose/effect/duration found
3. Lysine supplementation: No clear dose/effect/duration found

Nutrients
1. Dietary Patterns and Risk of Osteoporosis: Positive/therapeutic effect mentioned
2. Tempeh, Daidzein, Probiotics in Postmenopausal Osteoporotic Animal Model: No clear dose/effect/duration found
3. Integrated Nutritional and Physical Activity Approach for Osteosarcopenia: No clear dose/effect/duration found
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Lancet Healthy Longev. 2025 Sep 24:100763", "👉 Integrating exercise and medication management in geriatric care: a holistic strategy to enhance health outcomes and reduce polypharmacy, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41015054"),
                    Reference("J Clin Med. 2025 Sep 16;14(18):6503", "👉 Transsacral Bar Fixation for Osteoporotic H-Type Sacral Fractures: A Viable Alternative to Spinopelvic Fixation, Positive/therapeutic effect mentioned | day, month", "41010707"),
                    Reference("Brain Sci. 2025 Sep 16;15(9):1003", "👉 Beyond Hot Flashes: The Role of Estrogen Receptors in Menopausal Mental Health and Cognitive Decline, No clear dose/effect/duration found", "41008363"),

                    // Herbs
                    Reference("Front Endocrinol (Lausanne). 2025 Aug 8;16:1638629", "👉 Mechanisms and traditional Chinese medicine therapeutics for primary osteoporosis: an integrated perspective, No clear dose/effect/duration found", "40862128"),
                    Reference("Phytomedicine. 2025 Oct;146:157116", "👉 Capture the superior anti-osteoporotic innovative multi-component complex from Ligustri Lucidi Fructus based on Component Recombination strategy, Positive/therapeutic effect mentioned", "40782766"),
                    Reference("Antioxidants (Basel). 2025 Jun 22;14(7):765", "👉 Recent Advances on the Analysis and Biological Functions of Cinnamaldehyde and Its Derivatives, Positive/therapeutic effect mentioned", "40722869"),

                    // Amino acids
                    Reference("Int J Mol Sci. 2025 Sep 9;26(18):8791", "👉 Lysine: Sources, Metabolism, Physiological Importance, and Use as a Supplement, No clear dose/effect/duration found", "41009362"),
                    Reference("Homocystinuria due to Cystathionine Beta-Synthase Deficiency", "👉 Positive/therapeutic effect mentioned", "20301697"),
                    Reference("J Diabetes Metab Disord. 2025 Sep 11;24(2):198", "👉 Amino acid profiles, aging, and sex hormone interactions in the elderly Iranian population: a metabolomics study, Positive/therapeutic effect mentioned", "40950804"),

                    // Vitamins
                    Reference("Vaccines (Basel). 2025 Sep 2;13(9):939", "👉 Post-Polio Syndrome: Impact of Humoral Immune Deficiencies, Poliovirus Neutralizing Antibodies, Vitamin D Deficiency, Positive/therapeutic effect mentioned", "41012142"),
                    Reference("Healthcare (Basel). 2025 Sep 17;13(18):2328", "👉 Conservative and Pharmacological Strategies for Preventing Osteoporotic Stress Fractures in Older Recreational Competitors, Positive/therapeutic effect mentioned", "41008458"),
                    Reference("Free Radic Biol Med. 2025 Sep 24:S0891-5849(25)00998-0", "👉 Eldecalcitol Ameliorates Type 2 Diabetic Osteoporosis by Attenuating Endothelial Ferroptosis via the SOCE/O-GlcNAcylation Axis, Positive/therapeutic effect mentioned", "41005739"),

                    // Minerals
                    Reference("J Food Sci. 2025 Oct;90(10):e70584", "👉 Advancing Nutritional Strategies for Glucocorticoid-Induced Osteoporosis: Perspectives on Selenium-Enriched Egg White Protein and Gut-Bone Axis Modulation, Positive/therapeutic effect mentioned", "41014081"),
                    Reference("J Orthop Surg Res. 2025 Sep 26;20(1):842", "👉 Serum methylmalonic acid levels predict multisite bone mineral density decline in patients with suspected mitochondrial dysfunction, Positive/therapeutic effect mentioned", "41013755"),
                    Reference("J Orthop Surg Res. 2025 Sep 26;20(1):843", "👉 Opportunistic screening of osteoporosis in lung transplant recipients: diagnostic value of pre-transplant thoracic CT using vertebral Hounsfield units, No clear dose/effect/duration found", "41013754"),

                    // Supplements
                    Reference("J Food Sci. 2025 Oct;90(10):e70584", "👉 Advancing Nutritional Strategies for Glucocorticoid-Induced Osteoporosis: Perspectives on Selenium-Enriched Egg White Protein and Gut-Bone Axis Modulation, Positive/therapeutic effect mentioned", "41014081"),
                    Reference("Nutrients. 2025 Sep 9;17(18):2917", "👉 Influence of Tempeh, Daidzein, Probiotics, and Their Combination on Magnesium Status and Hematological Ratios in a Postmenopausal Osteoporotic Animal Model, No clear dose/effect/duration found", "41010443"),
                    Reference("Int J Mol Sci. 2025 Sep 9;26(18):8791", "👉 Lysine: Sources, Metabolism, Physiological Importance, and Use as a Supplement, No clear dose/effect/duration found", "41009362"),

                    // Nutrients
                    Reference("Nutrients. 2025 Sep 12;17(18):2947", "👉 Dietary Patterns and the Risk of Composite-Defined Osteoporosis in Pre- and Postmenopausal Women: A Prospective Cohort Study, Positive/therapeutic effect mentioned", "41010472"),
                    Reference("Nutrients. 2025 Sep 9;17(18):2917", "👉 Influence of Tempeh, Daidzein, Probiotics, and Their Combination on Magnesium Status and Hematological Ratios in a Postmenopausal Osteoporotic Animal Model, No clear dose/effect/duration found", "41010443"),
                    Reference("Nutrients. 2025 Aug 31;17(17):2842", "👉 An Integrated Nutritional and Physical Activity Approach for Osteosarcopenia, No clear dose/effect/duration found", "40944229")
                )
            )

            "Ovarian cancer" -> Pair(
                """
Alternative approaches
1. Front-line chemo-immunotherapy with carboplatin-paclitaxel using oreg-ovomab indirect immunization: Positive/therapeutic effect mentioned | week, month
2. Horizontal blocking of metastatic growth factors signaling by low molecular weight heparin derivative: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Lurbinectedin in PARP Inhibitor-Resistant High-Grade Serous Ovarian Cancer: No clear dose/effect/duration found

Herbs
1. Cisplatin-induced WWP1-eccDNA expression contributes to ovarian cancer resistance: Positive/therapeutic effect mentioned | day
2. Ovatodiolide triggers ferroptosis in high-grade serous ovarian cancer: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Role of Phytoestrogens in Gynecological Disorders: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Amino acids
1. Extract of Indigofera spicata Exerts Antiproliferative Effects: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. ABL1-mediated tyrosine phosphorylation of SYCP2 in ovarian cancer: Positive/therapeutic effect mentioned
3. Novel imidazolyl-hydroxamic acid Schiff base derivatives as histone deacetylase inhibitors: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Vitamins
1. Chronic Exposure of Mice to Ultraviolet B Radiation: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Physical activity in cancer prevention: Positive/therapeutic effect mentioned
3. Isotretinoin as a Multifunctional Anticancer Agent: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Minerals
1. Botanical drugs and their metabolites in osteoporosis: Positive/therapeutic effect mentioned
2. Bone Health and Endocrine Therapy with Ovarian Function Suppression: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month
3. Mesothelioma global trends and projections: No clear dose/effect/duration found

Supplements
1. Bilateral Metastatic Axillary Adenopathy Revealing Serous Carcinoma of the Ovary: No clear dose/effect/duration found
2. Lung Health Check pilot: Positive/therapeutic effect mentioned | month
3. Silk-Ovarioids 3D-model system: Negative/adverse effect mentioned | week, day

Nutrients
1. Engineering the ovarian niche in vitro: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Vitamin D's Impact on Cancer Incidence and Mortality: Positive/therapeutic effect mentioned
3. BCAA metabolism in ovarian cancer, PCOS, and premature ovarian failure: No clear dose/effect/duration found
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Int J Gynecol Cancer. 2025 Sep 5:102649", "👉 Long-term survival analysis of a randomized phase II study of front-line chemo-immunotherapy with carboplatin-paclitaxel using oreg-ovomab indirect immunization in advanced ovarian cancer (QPT-ORE-002), Positive/therapeutic effect mentioned | week, month", "41015763"),
                    Reference("J Control Release. 2025 Sep 25:114273", "👉 Horizontal blocking of metastatic growth factors signaling by low molecular weight heparin derivative to control ovarian cancer progression, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41015257"),
                    Reference("Int J Mol Sci. 2025 Sep 11;26(18):8866", "👉 Therapeutic Effects of Lurbinectedin in PARP Inhibitor-Resistant High-Grade Serous Ovarian Cancer Using Patient-Derived Cell Lines and Organoid Models, No clear dose/effect/duration found", "41009433"),

                    // Herbs
                    Reference("Adv Clin Exp Med. 2025 Sep 4", "👉 Cisplatin-induced WWP1-eccDNA expression contributes to ovarian cancer resistance, mg | Positive/therapeutic effect mentioned | day", "40905056"),
                    Reference("Mol Ther Oncol. 2025 Jul 21;33(3):201023", "👉 Ovatodiolide triggers ferroptosis in high-grade serous ovarian cancer through HMOX1 upregulation, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40786960"),
                    Reference("Altern Ther Health Med. 2025 Aug 6:AT11460", "👉 Role of Phytoestrogens in Gynecological Disorders from the Lens of Unani System of Medicine-A Review, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40768545"),

                    // Amino acids
                    Reference("Toxins (Basel). 2025 Aug 29;17(9):431", "👉 Extract of Indigofera spicata Exerts Antiproliferative Effects on Human Colorectal and Ovarian Carcinoma Cells, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41003496"),
                    Reference("NAR Cancer. 2025 Sep 3;7(3):zcaf031", "👉 ABL1-mediated tyrosine phosphorylation of SYCP2 contributes to transcription-coupled homologous recombination and platinum resistance in ovarian cancer, Positive/therapeutic effect mentioned", "40918650"),
                    Reference("Bioorg Chem. 2025 Sep;164:108879", "👉 Novel imidazolyl-hydroxamic acid Schiff base scaffold derivatives as histone deacetylase inhibitors: Design, synthesis, and biological assessment, g, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40845548"),

                    // Vitamins
                    Reference("J Vis Exp. 2025 Aug 19;(222):67368", "👉 Studying Chronic Exposure of Mice to Ultraviolet B Radiation, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40920741"),
                    Reference("World J Clin Oncol. 2025 Aug 24;16(8):107765", "👉 Role of physical activity in cancer prevention: An update, Positive/therapeutic effect mentioned", "40901308"),
                    Reference("Arch Pharm (Weinheim). 2025 Sep;358(9):e70084", "👉 Isotretinoin as a Multifunctional Anticancer Agent: Molecular Mechanisms, Pharmacological Insights and Therapeutic Potential, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40899415"),

                    // Minerals
                    Reference("Front Pharmacol. 2025 Aug 12;16:1530194", "👉 Role and mechanism of botanical drugs and their metabolites in osteoporosis: new strategies for clinical application, Positive/therapeutic effect mentioned", "40873550"),
                    Reference("Curr Oncol. 2025 Jul 26;32(8):421", "👉 Bone Health and Endocrine Therapy with Ovarian Function Suppression in Premenopausal Early Breast Cancer: A Real-Life Monocenter Experience with Denosumab, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month", "40862790"),
                    Reference("Cancer Epidemiol. 2025 Oct;98:102900", "👉 Global trends, future projections, and epidemiological associations of Mesothelioma: A comprehensive analysis from 1980 to 2050, No clear dose/effect/duration found", "40782460"),

                    // Supplements
                    Reference("Cureus. 2025 Aug 12;17(8):e89899", "👉 Bilateral Metastatic Axillary Adenopathy Revealing Serous Carcinoma of the Ovary: A Case Report and Review of the Literature, No clear dose/effect/duration found", "40951223"),
                    Reference("BMJ Open Respir Res. 2025 Sep 10;12(1):e003035", "👉 Lung Health Check pilot: Ireland's flagship lung cancer screening trial, Positive/therapeutic effect mentioned | month", "40935563"),
                    Reference("Hum Reprod Open. 2025 Jul 10;2025(3):hoaf042", "👉 Silk-Ovarioids: establishment and characterization of a human ovarian primary cell 3D-model system, Negative/adverse effect mentioned | week, day", "40799620"),

                    // Nutrients
                    Reference("Semin Cell Dev Biol. 2025 Aug 20;175:103639", "👉 Engineering the ovarian niche: Environmental control of folliculogenesis in vitro, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40840271"),
                    Reference("Nutrients. 2025 Jul 16;17(14):2333", "👉 Vitamin D's Impact on Cancer Incidence and Mortality: A Systematic Review, Positive/therapeutic effect mentioned", "40732958"),
                    Reference("Front Endocrinol (Lausanne). 2025 Jul 4;16:1579477", "👉 BCAA metabolism: the Achilles' heel of ovarian cancer, polycystic ovary syndrome, and premature ovarian failure, No clear dose/effect/duration found", "40687583")
                )
            )

            "Overactive thyroid" -> Pair(
                """
Alternative approaches
1. Therapeutic Potential of Propranolol and Other Beta-Blockers in Hyperthyroidism: No clear dose/effect/duration found
2. Iodine-rich herbs in treating Graves' hyperthyroidism: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Suspected Drug-Induced Liver Injury Associated With Ceftriaxone: No clear dose/effect/duration found

Herbs
1. Iodine-rich herbs in treating Graves' hyperthyroidism: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Korean red ginseng water extract on levothyroxine-induced hyperthyroidism: Positive/therapeutic effect mentioned
3. Complementary and alternative medicine use in thyroid disease: Positive/therapeutic effect mentioned | month

Amino acids
1. Lactobacillus brevis NES-428 in Hyperthyroidism Mouse Model: Positive/therapeutic effect mentioned
2. Intraocular Pressure and Thyroid Function in Graves' Ophthalmopathy: No clear dose/effect/duration found
3. Short-term effect of iodine contrast medium on thyroid function: Positive/therapeutic effect mentioned

Vitamins
1. Correlation analysis of thyroid function and vitamin D levels: No clear dose/effect/duration found
2. Parathyroid gland preservation during thyroid surgery: Positive/therapeutic effect mentioned
3. NOACs versus warfarin in thyroid dysfunction: Positive/therapeutic effect mentioned

Minerals
1. L-Carnitine and Selenium with Methimazole in Graves' Disease: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month
2. Sclerostin as a Biomarker for Bone Health in Hyperthyroidism: No clear dose/effect/duration found
3. Bone Mineral Density and Trabecular Bone Score in Adolescents With Graves' Disease: Positive/therapeutic effect mentioned | month

Supplements
1. Lactobacillus brevis NES-428 in Hyperthyroidism Mouse Model: Positive/therapeutic effect mentioned
2. L-Carnitine and Selenium with Methimazole in Graves' Disease: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month
3. Gut Microbiota effect on Graves' Ophthalmopathy: Positive/therapeutic effect mentioned

Nutrients
1. Lactobacillus brevis NES-428 in Hyperthyroidism Mouse Model: Positive/therapeutic effect mentioned
2. L-Carnitine and Selenium with Methimazole in Graves' Disease: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month
3. Lifestyle Interventions in Thyroid Hormone Signaling Disorders: Positive/therapeutic effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Int J Mol Sci. 2025 Aug 27;26(17):8322", "👉 The Therapeutic Potential of Propranolol and Other Beta-Blockers in Hyperthyroidism, No clear dose/effect/duration found", "40943247"),
                    Reference("Front Endocrinol (Lausanne). 2025 Aug 11;16:1573617", "👉 Therapeutic effectiveness of iodine-rich herbs in treating Graves' hyperthyroidism: a retrospective cohort study from a single center, g, G | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40862118"),
                    Reference("Cureus. 2025 Jul 21;17(7):e88419", "👉 Suspected Drug-Induced Liver Injury Associated With Ceftriaxone: A Case Report, g, g", "40842772"),

                    // Herbs
                    Reference("Front Endocrinol (Lausanne). 2025 Aug 11;16:1573617", "👉 Therapeutic effectiveness of iodine-rich herbs in treating Graves' hyperthyroidism: a retrospective cohort study from a single center, g, G | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40862118"),
                    Reference("Integr Med Res. 2024 Sep;13(3):101071", "👉 Protective effect of Korean red ginseng water extract on levothyroxine-induced hyperthyroidism and propylthiouracil-induced hypothyroidism in rats, Positive/therapeutic effect mentioned", "39263445"),
                    Reference("Heliyon. 2024 Jun 22;10(13):e33436", "👉 Prevalence, patterns, and disclosure of complementary and alternative medicine (CAM) use among patients with thyroid diseases: A cross-sectional study in Iran, Positive/therapeutic effect mentioned | month", "39040366"),

                    // Amino acids
                    Reference("Nutrients. 2025 Sep 16;17(18):2967", "👉 Immunomodulatory Effects of Lactobacillus brevis NES-428 in a Hyperthyroidism Mouse Model: Potential Applications for Graves' Disease, µg | Positive/therapeutic effect mentioned", "41010493"),
                    Reference("Yonsei Med J. 2025 Oct;66(10):675-684", "👉 Positive Relationships between Intraocular Pressure and Thyroid Function in Graves' Ophthalmopathy: A Three-Aspect Evidence Analysis, g, g", "40992768"),
                    Reference("Ann Med. 2025 Dec;57(1):2488180", "👉 Short-term effect of iodine contrast medium on thyroid function: a prospective cohort study, g, µg | week, month", "40964872"),

                    // Vitamins
                    Reference("Front Endocrinol (Lausanne). 2025 Aug 14;16:1650525", "👉 Correlation analysis of thyroid function and vitamin D levels in patients with type 2 diabetes, No clear dose/effect/duration found", "40895625"),
                    Reference("Surgery. 2025 Aug 16;187:109623", "👉 Combined near-infrared autofluorescence and preresection indocyanine green angiography for parathyroid gland preservation during thyroid surgery: A clinical controlled trial, Positive/therapeutic effect mentioned", "40819567"),
                    Reference("Medicine (Baltimore). 2025 Jul 11;104(28):e43328", "👉 NOACs versus warfarin in people with atrial fibrillation and thyroid dysfunction, Positive/therapeutic effect mentioned", "40660569"),

                    // Minerals
                    Reference("Nutrients. 2025 Aug 20;17(16):2693", "👉 Adding L-Carnitine and Selenium to Methimazole in Graves' Disease: A Prospective Randomized Trial on Thyroid Markers and Quality of Life, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month", "40871722"),
                    Reference("J Pharm Bioallied Sci. 2025 Apr-Jun;17(2):66-68", "👉 Evaluating Sclerostin as a Biomarker for Bone Health in Hyperthyroidism: A Clinical and Hormonal Correlation Study, No clear dose/effect/duration found", "40860009"),
                    Reference("Clin Endocrinol (Oxf). 2025 Oct;103(4):619-626", "👉 Longitudinal Changes in Bone Mineral Density and Trabecular Bone Score in Adolescents With Graves' Disease, Positive/therapeutic effect mentioned | month", "40692160"),

                    // Supplements
                    Reference("Nutrients. 2025 Sep 16;17(18):2967", "👉 Immunomodulatory Effects of Lactobacillus brevis NES-428 in a Hyperthyroidism Mouse Model: Potential Applications for Graves' Disease, µg | Positive/therapeutic effect mentioned", "41010493"),
                    Reference("Nutrients. 2025 Aug 20;17(16):2693", "👉 Adding L-Carnitine and Selenium to Methimazole in Graves' Disease: A Prospective Randomized Trial on Thyroid Markers and Quality of Life, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month", "40871722"),
                    Reference("Transl Vis Sci Technol. 2025 Jun 2;14(6):34", "👉 Inflammatory Proteins Mediate the Effect of Gut Microbiota on Graves' Ophthalmopathy: A Mendelian Randomization Study, G | Positive/therapeutic effect mentioned", "40576426"),

                    // Nutrients
                    Reference("Nutrients. 2025 Sep 16;17(18):2967", "👉 Immunomodulatory Effects of Lactobacillus brevis NES-428 in a Hyperthyroidism Mouse Model: Potential Applications for Graves' Disease, µg | Positive/therapeutic effect mentioned", "41010493"),
                    Reference("Nutrients. 2025 Aug 20;17(16):2693", "👉 Adding L-Carnitine and Selenium to Methimazole in Graves' Disease: A Prospective Randomized Trial on Thyroid Markers and Quality of Life, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month", "40871722"),
                    Reference("Nutrients. 2025 Jun 20;17(13):2053", "👉 Lifestyle Interventions to Tackle Cardiovascular Risk in Thyroid Hormone Signaling Disorders, Positive/therapeutic effect mentioned", "40647159")
                )
            )

            "Panic disorder" -> Pair(
                """
Alternative approaches
1. Does remote match reality? Comparing the effectiveness of a self-help app for panic disorder and agoraphobia to face-to-face CBT: No clear dose/effect/duration found
2. Efficacy and Safety of Electroacupuncture Through Nerve Stimulation in Patients With Anxiety Disorders: Negative/adverse effect mentioned | week
3. Amitriptyline Therapy and CYP2D6 and CYP2C19 Genotype: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Herbs
1. Professor CHEN Gui-zhen's experience of acupuncture for perimenopausal panic disorder: No clear dose/effect/duration found
2. Plant-based medicines for anxiety disorders, part 2: Positive/therapeutic effect mentioned
3. Explanatory models of mental disorders and treatment practices among traditional healers in Mpumulanga, South Africa: Negative/adverse effect mentioned

Amino acids
1. Managing hypermobility spectrum disorder in a psychiatric setting: Positive/therapeutic effect mentioned
2. Circulating branched-chain amino acids and risk of psychiatric disorders: Positive/therapeutic effect mentioned
3. Anti-panic effect of fluoxetine during late diestrus in female rats mediated through GABAergic mechanisms: Positive/therapeutic effect mentioned

Vitamins
1. An electrolyte disturbance masquerading as a panic attack: Negative/adverse effect mentioned
2. Hyperventilation Syndrome and Hypocalcemia in Autism Spectrum Disorder: No clear dose/effect/duration found
3. Comorbid conditions in Egyptian patients with migraine: No clear dose/effect/duration found

Minerals
1. Mendelian randomization investigation on selenium status in mental disorders: No clear dose/effect/duration found
2. Lower serum selenium concentration associated with anxiety in children: Positive/therapeutic effect mentioned
3. Advances in electrochemical sensing of venlafaxine: Negative/adverse effect mentioned

Supplements
1. Synbiotic diet produces antidepressant-like effects but alters ketamine activity: day
2. Blended mobile-based intervention with VR exposure therapy for panic disorder and agoraphobia: No clear dose/effect/duration found
3. Taxonomy of anxiety disorders—comparison of ICD-10 and ICD-11: No clear dose/effect/duration found

Nutrients
1. Gut Microbiota Alterations in Patients with Panic Disorder: No clear dose/effect/duration found
2. The Role and Effect of Magnesium in Mental Disorders: Positive/therapeutic effect mentioned
3. Successful treatment of bipolar disorder II and ADHD with a micronutrient formula: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Psychol Psychother. 2025 Sep 1", "👉 Does remote match reality? Comparing the effectiveness of a self-help app for panic disorder and agoraphobia to face-to-face CBT, No clear dose/effect/duration found", "40890916"),
                    Reference("JMIR Res Protoc. 2025 Jul 21;14:e68166", "👉 Efficacy and Safety of Electroacupuncture Through Nerve Stimulation in Patients With Anxiety Disorders: Protocol for a Randomized, Assessor-Blind, Three-Arm, Parallel-Group Clinical Trial, g | Negative/adverse effect mentioned | week", "40690751"),
                    Reference("Amitriptyline Therapy and CYP2D6 and CYP2C19 Genotype", "👉 Medical Genetics Summaries [Internet], g, G | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "28520380"),

                    // Herbs
                    Reference("Zhongguo Zhen Jiu. 2021 Mar 12;41(3):316-20", "👉 [Professor CHEN Gui-zhen's experience of acupuncture for perimenopausal panic disorder], No clear dose/effect/duration found", "33798317"),
                    Reference("CNS Drugs. 2013 Apr;27(4):301-19", "👉 Plant-based medicines for anxiety disorders, part 2: a review of clinical studies with supporting preclinical evidence, Positive/therapeutic effect mentioned", "23653088"),
                    Reference("Afr J Psychiatry (Johannesbg). 2010 Sep;13(4):284-90", "👉 Explanatory models of mental disorders and treatment practices among traditional healers in Mpumulanga, South Africa, Negative/adverse effect mentioned", "20957328"),

                    // Amino acids
                    Reference("BMJ Case Rep. 2025 Mar 25;18(3):e264159", "👉 Managing hypermobility spectrum disorder in a psychiatric setting, Positive/therapeutic effect mentioned", "40132944"),
                    Reference("J Psychosom Res. 2025 May;192:112101", "👉 Circulating branched-chain amino acids and risk of psychiatric disorders: A two-sample Mendelian randomization study, Positive/therapeutic effect mentioned", "40107167"),
                    Reference("Neurosci Lett. 2025 Jan 10;845:138078", "👉 Anti-panic effect of fluoxetine during late diestrus in female rats is mediated through GABAergic mechanisms in the dorsal periaqueductal gray, mg | Positive/therapeutic effect mentioned", "39645071"),

                    // Vitamins
                    Reference("JAAPA. 2025 Jan 1;38(1):e1-e4", "👉 An electrolyte disturbance masquerading as a panic attack, Negative/adverse effect mentioned", "39699322"),
                    Reference("Cureus. 2024 May 4;16(5):e59639", "👉 Hyperventilation Syndrome and Hypocalcemia: A Unique Case in Autism Spectrum Disorder, No clear dose/effect/duration found", "38832161"),
                    Reference("Neurol Res. 2023 Dec;45(12):1100-1110", "👉 Comorbid conditions in Egyptian patients with migraine, No clear dose/effect/duration found", "37748177"),

                    // Minerals
                    Reference("Prog Neuropsychopharmacol Biol Psychiatry. 2023 Mar 2;122:110694", "👉 Mendelian randomization investigation highlights different roles of selenium status in mental disorders, No clear dose/effect/duration found", "36521586"),
                    Reference("J Pediatr Nurs. 2022 Mar-Apr;63:e121-e126", "👉 Lower serum selenium concentration associated with anxiety in children, Positive/therapeutic effect mentioned", "34686396"),
                    Reference("Sensors (Basel). 2020 Jun 30;20(13):3675", "👉 Recent Advances in the Electrochemical Sensing of Venlafaxine: An Antidepressant Drug and Environmental Contaminant, Negative/adverse effect mentioned", "32630056"),

                    // Supplements
                    Reference("Behav Pharmacol. 2025 Oct 1;36(7):526-533", "👉 Synbiotic diet produces antidepressant-like effects but alters ketamine activity in an avian model of treatment-resistant depression, mg | day", "40905354"),
                    Reference("Cogn Behav Ther. 2025 Aug 28:1-14", "👉 Efficacy of a blended, mobile-based intervention with integrated virtual reality exposure therapy for panic disorder and agoraphobia: a pilot randomized controlled trial, No clear dose/effect/duration found", "40875824"),
                    Reference("Nervenarzt. 2025 Jul 29", "👉 Taxonomy of anxiety disorders—a comparison of ICD-10 and ICD-11, No clear dose/effect/duration found", "40728738"),

                    // Nutrients
                    Reference("Nutrients. 2025 Aug 27;17(17):2772", "👉 Gut Microbiota Alterations in Patients with Panic Disorder: A Case-Control Study, No clear dose/effect/duration found", "40944162"),
                    Reference("Nutrients. 2020 Jun 3;12(6):1661", "👉 The Role and the Effect of Magnesium in Mental Disorders: A Systematic Review, Positive/therapeutic effect mentioned", "32503201"),
                    Reference("CNS Spectr. 2010 May;15(5):289-95", "👉 Successful treatment of bipolar disorder II and ADHD with a micronutrient formula: a case study, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week", "20448519")
                )
            )

            "Parkinson's disease" -> Pair(
                """
Alternative approaches
1. HIITing Anxiety and Depression in Parkinson's Disease and Multiple Sclerosis: Positive/therapeutic effect mentioned | week
2. Levodopa-Carbidopa-Entacapone Intestinal Gel for Advanced Parkinson's Disease: Positive/therapeutic effect mentioned | month
3. Transcranial Alternating Current Stimulation in Parkinson's disease primate model: No clear dose/effect/duration found

Herbs
1. Phytonutrients and neuroprotective role in brain disorders: Negative/adverse effect mentioned
2. Polysaccharides from traditional Chinese medicine in Parkinson's disease: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Zinc concentration changes and α-synuclein fibrillation: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Amino acids
1. Cinnarizine prevents striatal dopamine decline in Parkinson's rat model: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Method to assess motor planning deficits in Parkinson's disease with mild cognitive impairment: Positive/therapeutic effect mentioned
3. Disrupted glutamic acid and serine metabolism in Parkinson's disease patients: Positive/therapeutic effect mentioned

Vitamins
1. Vitamin D associated with exercise for neurodegenerative disease protection: Positive/therapeutic effect mentioned
2. Riboflavin in neurological diseases: Positive/therapeutic effect mentioned
3. Targeting NAD(+) in clinic: No clear dose/effect/duration found

Minerals
1. Low-dose graphenic materials protect against ER stress and oxidative stress: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Genetic architecture of white matter microstructure: No clear dose/effect/duration found
3. Voltammeter platform for homocysteine detection: Positive/therapeutic effect mentioned

Supplements
1. Fatal Lead Toxicity From Ayurvedic Supplements: Negative/adverse effect mentioned
2. Chaperone nanomotors for Parkinson's disease: Positive/therapeutic effect mentioned
3. Microbiota-gut-brain axis mechanisms and targets: No clear dose/effect/duration found

Nutrients
1. Astaxanthin neuroprotective and neurotrophic effects: Positive/therapeutic effect mentioned
2. Curcumin neuroprotective role: Positive/therapeutic effect mentioned
3. Gut microbiota-central nervous system communication: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Brain Sci. 2025 Aug 29;15(9):945", "👉 HIITing Anxiety and Depression in Parkinson's Disease and Multiple Sclerosis—A Study Protocol of a Transdiagnostic Randomized Controlled Trial (HersenFIT). Positive/therapeutic effect mentioned | week", "41008305"),
                    Reference("Biomedicines. 2025 Sep 8;13(9):2191", "👉 Levodopa-Carbidopa-Entacapone Intestinal Gel for Advanced Parkinson's Disease—Results from a Monocentric Study Evaluating Both Motor and Non-Motor Manifestations. G | Positive/therapeutic effect mentioned | month", "41007754"),
                    Reference("bioRxiv [Preprint]. 2025 Sep 19", "👉 Transcranial Alternating Current Stimulation can disrupt or reestablish neural entrainment in a primate model of Parkinson's disease. No clear dose/effect/duration found", "41000748"),

                    // Herbs
                    Reference("Front Mol Biosci. 2025 Sep 2;12:1607330", "👉 Phytonutrients and their neuroprotective role in brain disorders. Negative/adverse effect mentioned", "40964091"),
                    Reference("Front Pharmacol. 2025 Aug 8;16:1566479", "👉 Research progress on the mechanisms of polysaccharides derived from traditional Chinese medicine in the treatment of Parkinson's disease. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40860869"),
                    Reference("Front Mol Biosci. 2025 Jul 10;12:1603364", "👉 Subtle concentration changes in zinc hold the key to fibrillation of α-synuclein: an updated insight on the micronutrient's role in prevention of neurodegenerative disorders. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40708841"),

                    // Amino acids
                    Reference("Int J Mol Sci. 2025 Sep 10;26(18):8833", "👉 Cinnarizine, a Calcium Channel Blocker, Partially Prevents the Striatal Dopamine Decline and Loss of Nigral Dopamine Neurons in the Lactacystin-Induced Rat Model of Parkinson's Disease. µg, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41009402"),
                    Reference("Sci Rep. 2025 Sep 25;15(1):32833", "👉 A novel method to assess motor planning deficits in patients with Parkinson's disease and mild cognitive impairment. Positive/therapeutic effect mentioned", "40999021"),
                    Reference("NPJ Parkinsons Dis. 2025 Sep 25;11(1):274", "👉 Independent serum metabolomics approaches identify disrupted glutamic acid and serine metabolism in Parkinson's disease patients. Positive/therapeutic effect mentioned", "40998834"),

                    // Vitamins
                    Reference("Molecules. 2025 Sep 21;30(18):3823", "👉 Vitamin D Associated with Exercise Can Be Used as a Promising Tool in Neurodegenerative Disease Protection. Positive/therapeutic effect mentioned", "41011716"),
                    Reference("Front Neurol. 2025 Sep 2;16:1663136", "👉 Riboflavin in neurological diseases: therapeutic advances, metabolic insights, and emerging genetic strategies. Positive/therapeutic effect mentioned", "40963932"),
                    Reference("Nat Aging. 2025 Sep;5(9):1704-1731", "👉 Emerging strategies, applications and challenges of targeting NAD(+) in the clinic. No clear dose/effect/duration found", "40926126"),

                    // Minerals
                    Reference("Int J Mol Sci. 2025 Sep 10;26(18):8821", "👉 Neuroprotective Effects of Low-Dose Graphenic Materials on SN4741 Embryonic Stem Cells Against ER Stress and MPTP-Induced Oxidative Stress. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41009388"),
                    Reference("Res Sq [Preprint]. 2025 Sep 17", "👉 Unveiling genetic architecture of white matter microstructure through unsupervised deep representation learning of fractional anisotropy maps. g", "41001519"),
                    Reference("Sci Rep. 2025 Sep 1;15(1):32236", "👉 An efficient voltammetric platform integrating ZnS nanowires, reduced graphene oxide sheets, and ferrocene monocarboxylic acid for the sensitive detection of homocysteine. Positive/therapeutic effect mentioned", "40890404"),

                    // Supplements
                    Reference("Cureus. 2025 Aug 19;17(8):e90515", "👉 Fatal Lead Toxicity From Ayurvedic Supplements in a Patient With Parkinson's Disease. µg | Negative/adverse effect mentioned", "40978857"),
                    Reference("Sci Adv. 2025 Sep 19;11(38):eadw1061", "👉 Chaperone nanomotors with chemotactic ability for the treatment of Parkinson's disease. Positive/therapeutic effect mentioned", "40971434"),
                    Reference("Mol Biomed. 2025 Sep 15;6(1):64", "👉 Microbiota-gut-brain axis in neurodegenerative diseases: molecular mechanisms and therapeutic targets. No clear dose/effect/duration found", "40952592"),

                    // Nutrients
                    Reference("Adv Neurobiol. 2025;44:317-334", "👉 Neuroprotective and Neurotrophic Effects of Astaxanthin on the Brain. Positive/therapeutic effect mentioned", "41004107"),
                    Reference("Nutrients. 2025 Sep 6;17(17):2884", "👉 The Neuroprotective Role of Curcumin: From Molecular Pathways to Clinical Translation—A Narrative Review. Positive/therapeutic effect mentioned", "40944272"),
                    Reference("Neural Regen Res. 2025 Sep 3", "👉 Bidirectional communication between the gut microbiota and the central nervous system. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40903950")
                )
            )

            "Pelvic pain" -> Pair(
                """
Alternative approaches
1. Patient Views and Values Placed on the Uterus: No clear dose/effect/duration found
2. Transvaginal Natural orifice transluminal endoscopic hysterectomy vs. abdominal laparoscopic approach: Positive/therapeutic effect mentioned
3. Cervical Polypectomy Using a Flexible Ureterorenoscope to Preserve the Hymen: Positive/therapeutic effect mentioned

Herbs
1. Impact of herbaceous Apiaceae family plants on primary dysmenorrhea: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Guizhi Fuling Wan in inhibiting endometriosis development: Positive/therapeutic effect mentioned | day
3. Herbal compounds in curing dysmenorrhea naturally: No clear dose/effect/duration found

Amino acids
1. Prostatitis: week, month
2. Widespread Pain Moderates Response to Centrally-Acting Therapies in Urologic Chronic Pelvic Pain Syndrome: Positive/therapeutic effect mentioned
3. Bictegravir/emtricitabine/tenofovir alafenamide induced colitis: µg, g, mg

Vitamins
1. Pollen-Extract-Based Phytotherapy vs. Conventional Therapies in Chronic Pelvic Pain Syndrome: Positive/therapeutic effect mentioned
2. Atypical Femoral Fracture Secondary to Long-Term Bisphosphonate Use: Positive/therapeutic effect mentioned
3. Medical Nutrition Therapy in Patients with Obesity and Endometriosis: Positive/therapeutic effect mentioned

Minerals
1. Hormonal Management of Endometriosis-Associated Pain: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Compression Rate Progression of Osteoporotic Vertebral Compression Fracture in Conservative Treatments: Positive/therapeutic effect mentioned | month
3. Bioelectrical impedance parameters and body composition in women with dysmenorrhea and postmenopause: No clear dose/effect/duration found

Supplements
1. Pollen-Extract-Based Phytotherapy in Chronic Pelvic Pain Syndrome: Positive/therapeutic effect mentioned
2. Long-term lymphedema and quality of life following lymph node staging in cervical cancer: month
3. Medical Nutrition Therapy in Patients with Obesity and Endometriosis: Positive/therapeutic effect mentioned

Nutrients
1. Medical Nutrition Therapy in Patients with Obesity and Endometriosis: Positive/therapeutic effect mentioned
2. Risk Factors of Primary Dysmenorrhea in Female Adolescent Basketball Players: day
3. Dietary patterns and nutritional supplementation in the management of endometriosis: Positive/therapeutic effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("O G Open. 2024 Dec 5;1(4):48", "👉 Patient Views and Values Placed on the Uterus. No clear dose/effect/duration found", "41001598"),
                    Reference("Arch Gynecol Obstet. 2025 Sep 24", "👉 Transvaginal Natural orifice transluminal endoscopic hysterectomy vs. abdominal laparoscopic approach in real-life practices. Positive/therapeutic effect mentioned", "40987917"),
                    Reference("Cureus. 2025 Sep 19;17(9):e92713", "👉 Cervical Polypectomy Using a Flexible Ureterorenoscope to Preserve the Hymen: A Case Report. Positive/therapeutic effect mentioned", "40980796"),

                    // Herbs
                    Reference("J Complement Integr Med. 2025 Feb 28;22(2):373-377", "👉 Exploring the impact of herbaceous Apiaceae family plants on primary dysmenorrhea. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40014560"),
                    Reference("J Ethnopharmacol. 2025 Feb 10;338(Pt 2):119067", "👉 The crucial component(s) of Guizhi Fuling Wan in inhibiting endometriosis development. Positive/therapeutic effect mentioned | day", "39522847"),
                    Reference("J Am Nutr Assoc. 2025 Mar-Apr;44(3):223-234", "👉 Therapeutic Potential of Herbal Compounds in Curing Dysmenorrhea Naturally: A Review. No clear dose/effect/duration found", "39508746"),

                    // Amino acids
                    Reference("JAMA. 2025 Sep 16;334(11):1003-1013", "👉 Prostatitis: A Review. week, month", "40788632"),
                    Reference("Neurourol Urodyn. 2025 Aug;44(6):1290-1295", "👉 Widespread Pain Moderates the Response to Centrally-Acting Therapies in Urologic Chronic Pelvic Pain Syndrome. Positive/therapeutic effect mentioned", "40415481"),
                    Reference("Clin Biochem. 2025 Jun;137:110910", "👉 Bictegravir/emtricitabine/tenofovir alafenamide induced colitis. µg, g, mg", "40089176"),

                    // Vitamins
                    Reference("Med Sci (Basel). 2025 Sep 11;13(3):186", "👉 Clinical Evaluation of a Pollen-Extract-Based Phytotherapy Compared to Conventional Therapies in Chronic Pelvic Pain Syndrome. Positive/therapeutic effect mentioned", "40981184"),
                    Reference("Cureus. 2025 Aug 20;17(8):e90611", "👉 Atypical Femoral Fracture Secondary to Long-Term Bisphosphonate Use: A Case Report. Positive/therapeutic effect mentioned", "40978969"),
                    Reference("Curr Obes Rep. 2025 Sep 8;14(1):68", "👉 Effectiveness of Medical Nutrition Therapy in Patients with Obesity and Endometriosis. Positive/therapeutic effect mentioned", "40920291"),

                    // Minerals
                    Reference("Biomedicines. 2025 Sep 18;13(9):2294", "👉 Tolerability and Shared Decision-Making in Hormonal Management of Endometriosis-Associated Pain. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41007854"),
                    Reference("J Korean Med Sci. 2025 Aug 18;40(32):e191", "👉 Compression Rate Progression of Osteoporotic Vertebral Compression Fracture in Conservative Treatments. Positive/therapeutic effect mentioned | month", "40827318"),
                    Reference("Physiol Rep. 2025 Jul;13(14):e70473", "👉 Association between bioelectrical impedance parameters and body composition in women with dysmenorrhea and postmenopause. No clear dose/effect/duration found", "40709827"),

                    // Supplements
                    Reference("Med Sci (Basel). 2025 Sep 11;13(3):186", "👉 Clinical Evaluation of a Pollen-Extract-Based Phytotherapy Compared to Conventional Therapies in Chronic Pelvic Pain Syndrome. Positive/therapeutic effect mentioned", "40981184"),
                    Reference("Am J Obstet Gynecol. 2025 Sep 15", "👉 Long-term lymphedema and quality of life following lymph node staging in cervical cancer: SENTIREC CERVIX study. month", "40962164"),
                    Reference("Curr Obes Rep. 2025 Sep 8;14(1):68", "👉 Effectiveness of Medical Nutrition Therapy in Patients with Obesity and Endometriosis. Positive/therapeutic effect mentioned", "40920291"),

                    // Nutrients
                    Reference("Curr Obes Rep. 2025 Sep 8;14(1):68", "👉 Effectiveness of Medical Nutrition Therapy in Patients with Obesity and Endometriosis. Positive/therapeutic effect mentioned", "40920291"),
                    Reference("Nutrients. 2025 Mar 28;17(7):1190", "👉 Risk Factors of Primary Dysmenorrhea in Female Adolescent Basketball Players. day", "40218947"),
                    Reference("Front Nutr. 2025 Mar 12;12:1539665", "👉 Effect of dietary patterns and nutritional supplementation in the management of endometriosis: a review. Positive/therapeutic effect mentioned", "40144566")
                )
            )

            "Peptic ulcer" -> Pair(
                """
Alternative approaches
1. Protective effects of the bacterial pigment violacein against gastric ulceration. mg | Positive/therapeutic effect mentioned
2. Approaches for the treatment of perforated peptic ulcers: Positive/therapeutic effect mentioned
3. 2-((3-(chloromethyl) benzoyl) oxy) benzoic acid suppresses NF-κB expression. mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Herbs
1. Filtering of Active Components of Fuzi Lizhong Decoction on Gastric Ulcer. No clear dose/effect/duration found
2. Phytochemical profiling, antioxidant capacity, acute toxicity, and gastroprotective potential of Angelica glauca root. mg, μg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. The Role of Triterpenoids in Gastric Ulcer: Mechanisms and Therapeutic Potentials. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Amino acids
1. Comparison of rebamipide and tegoprazan combination therapy for ESD induced gastric ulcers. No clear dose/effect/duration found
2. In vivo anti-ulceration effect of Pancratium maritimum extract. mg | Positive/therapeutic effect mentioned
3. Helicobacter pylori luxS mutants cause hyperinflammatory responses. Negative/adverse effect mentioned

Vitamins
1. Proton Pump Inhibitors (PPIs)-An Evidence-Based Review. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Pharmacodynamics, pharmacokinetics, interactions, toxicity and clinical effectiveness of PPIs. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Histological study of valerian extract alone or with co-enzyme Q10 on gastric ulcers. g | Positive/therapeutic effect mentioned

Minerals
1. Using Caprylic Acid for the Prevention and Treatment of H. pylori Infection. Positive/therapeutic effect mentioned
2. In vivo spatiotemporal acquisition of metabolic vibrational signatures for gastric ulcer genesis. Positive/therapeutic effect mentioned
3. Efficacy of yeast-mediated SeNPs on gastric ulcer healing. mg | Positive/therapeutic effect mentioned

Supplements
1. Therapeutic diets for GI conditions and pre/postoperative care. g | Positive/therapeutic effect mentioned
2. Health-promoting effects of Clostridium butyricum GKB7. mg | Positive/therapeutic effect mentioned
3. Daidzein alleviates ethanol-induced acute gastric injury. No clear dose/effect/duration found

Nutrients
1. Proton Pump Inhibitors (PPIs)-An Evidence-Based Review. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Therapeutic diets for GI conditions. g | Positive/therapeutic effect mentioned
3. Pretreatment with Citrus reticulata 'Chachi' Polysaccharide alleviates alcohol-induced gastric ulcer. mg | Positive/therapeutic effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Biomed Pharmacother. 2025 Oct;191:118544", "👉 Protective effects of the bacterial pigment violacein against gastric ulceration. mg | Positive/therapeutic effect mentioned", "40939257"),
                    Reference("Langenbecks Arch Surg. 2025 Sep 5;410(1):266", "👉 Approaches for the treatment of perforated peptic ulcers: Positive/therapeutic effect mentioned", "40911086"),
                    Reference("J Adv Pharm Technol Res. 2025 Jul-Sep;16(3):163-168", "👉 2-((3-(chloromethyl) benzoyl) oxy) benzoic acid suppresses NF-κB expression. mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40901445"),

                    // Herbs
                    Reference("Arch Pharm (Weinheim). 2025 Jul;358(7):e70036", "👉 Filtering of Active Components of Fuzi Lizhong Decoction on Gastric Ulcer. No clear dose/effect/duration found", "40629957"),
                    Reference("Fitoterapia. 2025 Jun;183:106565", "👉 Phytochemical profiling, antioxidant capacity, acute toxicity, and gastroprotective potential of Angelica glauca root. mg, μg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40274199"),
                    Reference("Int J Mol Sci. 2025 Mar 31;26(7):3237", "👉 The Role of Triterpenoids in Gastric Ulcer: Mechanisms and Therapeutic Potentials. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40244034"),

                    // Amino acids
                    Reference("Sci Rep. 2025 Jul 25;15(1):27127", "👉 Comparison of rebamipide and tegoprazan combination therapy for ESD induced gastric ulcers. No clear dose/effect/duration found", "40715454"),
                    Reference("PLoS One. 2025 Apr 16;20(4):e0321018", "👉 In vivo anti-ulceration effect of Pancratium maritimum extract. mg | Positive/therapeutic effect mentioned", "40238859"),
                    Reference("Microbiol Spectr. 2025 Jan 7;13(1):e0107324", "👉 Helicobacter pylori luxS mutants cause hyperinflammatory responses. Negative/adverse effect mentioned", "39641542"),

                    // Vitamins
                    Reference("Medicina (Kaunas). 2025 Aug 31;61(9):1569", "👉 Proton Pump Inhibitors (PPIs)-An Evidence-Based Review. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41010960"),
                    Reference("Front Pharmacol. 2025 Jul 23;16:1507812", "👉 Pharmacodynamics, pharmacokinetics, interactions, toxicity and clinical effectiveness of PPIs. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40771914"),
                    Reference("J Mol Histol. 2025 May 28;56(3):176", "👉 Histological study of valerian extract alone or with co-enzyme Q10 on gastric ulcers. g | Positive/therapeutic effect mentioned", "40425957"),

                    // Minerals
                    Reference("Metabolites. 2025 Sep 22;15(9):629", "👉 Using Caprylic Acid for the Prevention and Treatment of H. pylori Infection. Positive/therapeutic effect mentioned", "41003013"),
                    Reference("Biomaterials. 2025 Nov;322:123383", "👉 In vivo spatiotemporal acquisition of metabolic vibrational signatures for gastric ulcer genesis. Positive/therapeutic effect mentioned", "40367813"),
                    Reference("Tissue Cell. 2025 Oct;96:102953", "👉 Efficacy of yeast-mediated SeNPs on gastric ulcer healing. mg | Positive/therapeutic effect mentioned", "40334393"),

                    // Supplements
                    Reference("Therapeutic Diets. 2025 Jan–", "👉 Therapeutic diets for GI conditions and pre/postoperative care. g | Positive/therapeutic effect mentioned", "30860735"),
                    Reference("Biochem Biophys Rep. 2025 Jul 11;43:102145", "👉 Health-promoting effects of Clostridium butyricum GKB7. mg | Positive/therapeutic effect mentioned", "40688492"),
                    Reference("Phytomedicine. 2025 Jul 25;143:156887", "👉 Daidzein alleviates ethanol-induced acute gastric injury. No clear dose/effect/duration found", "40466503"),

                    // Nutrients
                    Reference("Medicina (Kaunas). 2025 Aug 31;61(9):1569", "👉 Proton Pump Inhibitors (PPIs)-An Evidence-Based Review. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41010960"),
                    Reference("Therapeutic Diets. 2025 Jan–", "👉 Therapeutic diets for GI conditions. g | Positive/therapeutic effect mentioned", "30860735"),
                    Reference("Nutrients. 2025 Jun 20;17(13):2062", "👉 Pretreatment with Citrus reticulata 'Chachi' Polysaccharide alleviates alcohol-induced gastric ulcer. mg | Positive/therapeutic effect mentioned", "40647169")
                )
            )

            "Pericarditis" -> Pair(
                """
Alternative approaches
1. Multidrug-Resistant Escherichia coli Associated with Respiratory and Systemic Infection in a Domestic Rabbit in Romania: Positive/therapeutic effect mentioned
2. Eccentric purulent pericarditis treated by PTCA guidewire-based pericardiocentesis and intrapericardial alteplase. mg | Positive/therapeutic effect mentioned
3. Descriptive Analysis of Reported Adverse Events Associated with Vitiligo Medications Using FAERS Databases 2013-2023. Negative/adverse effect mentioned

Herbs
(No references listed)

Amino acids
1. Clinical genetic testing in four highly suspected pediatric restrictive cardiomyopathy cases. g, G
2. ARNIs: balancing "the good and the bad" of neuroendocrine response to HF. No clear dose/effect/duration found
3. Massive pericardial effusion without cardiac tamponade due to subclinical hypothyroidism (Hashimoto's disease). Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Vitamins
1. Clinical profiles and temporal trends of 37,741 cardiovascular hospitalizations in Greece over 12 years. Positive/therapeutic effect mentioned
2. A Mendelian randomized study of circulating antioxidants in the diet and risk of cardiovascular disease. Positive/therapeutic effect mentioned
3. Unveiling the Intrusion: An Emergent Journey Into Tuberculous Pericarditis. No clear dose/effect/duration found

Minerals
1. Dissecting aortitis in a goat associated with Pasteurella multocida and Staphylococcus spp infection. day
2. Péricardite constrictive accompagnée de calcification péricardique. No clear dose/effect/duration found
3. Constrictive pericarditis with pericardial calcification. No clear dose/effect/duration found

Supplements
1. The Emerging Role of Multimodality Imaging in the Diagnosis and Management of Post Pericardiotomy Syndrome. G | Positive/therapeutic effect mentioned
2. Design and rationale of the COVID vaccine-associated myocarditis/pericarditis (CAMP) study. Positive/therapeutic effect mentioned | day, month
3. Pulmonary Vein Isolation With Optimized Linear Ablation vs Pulmonary Vein Isolation Alone for Persistent AF. Positive/therapeutic effect mentioned | month

Nutrients
1. Holistic efficacy of specific nutrient synergy against avian flu virus: mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day
2. Importance of Escherichia coli infection in ascites in broiler chickens shown by experimental production. g | day
3. Treatment of chronic uremic patients with protein-poor diet and oral supply of essential amino acids. g, mg, MG | Positive/therapeutic effect mentioned | month
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Antibiotics (Basel). 2025 Sep 14;14(9):929", "👉 Multidrug-Resistant Escherichia coli Associated with Respiratory and Systemic Infection in a Domestic Rabbit in Romania: First Confirmed Case. Positive/therapeutic effect mentioned", "41009907"),
                    Reference("Front Cardiovasc Med. 2025 Aug 5;12:1660781", "👉 Case Report: Eccentric purulent pericarditis treated by PTCA guidewire-based pericardiocentesis and intrapericardial alteplase. mg | Positive/therapeutic effect mentioned", "40837242"),
                    Reference("Diseases. 2025 Jul 2;13(7):208", "👉 Descriptive Analysis of Reported Adverse Events Associated with Vitiligo Medications Using FDA Adverse Event Reporting System (FAERS) Databases 2013-2023. Negative/adverse effect mentioned", "40709998"),

                    // Herbs
                    // None

                    // Amino acids
                    Reference("BMC Cardiovasc Disord. 2022 May 25;22(1):240", "👉 Clinical genetic testing in four highly suspected pediatric restrictive cardiomyopathy cases. g, G", "35614389"),
                    Reference("Clin Res Cardiol. 2020 May;109(5):599-610", "👉 ARNIs: balancing \"the good and the bad\" of neuroendocrine response to HF. No clear dose/effect/duration found", "31531687"),
                    Reference("Rural Remote Health. 2018 May;18(2):4384", "👉 Massive pericardial effusion without cardiac tamponade due to subclinical hypothyroidism (Hashimoto's disease). Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "29778090"),

                    // Vitamins
                    Reference("Hellenic J Cardiol. 2025 Jun 24:S1109-9666(25)00149-6", "👉 Clinical profiles and temporal trends of 37,741 cardiovascular hospitalizations in Greece over 12 years. Positive/therapeutic effect mentioned", "40571281"),
                    Reference("Sci Rep. 2025 Mar 25;15(1):10341", "👉 A Mendelian randomized study of circulating antioxidants in the diet and risk of cardiovascular disease. Positive/therapeutic effect mentioned", "40133449"),
                    Reference("Cureus. 2024 Jul 22;16(7):e65093", "👉 Unveiling the Intrusion: An Emergent Journey Into Tuberculous Pericarditis. No clear dose/effect/duration found", "39171045"),

                    // Minerals
                    Reference("J Comp Pathol. 2024 May;211:17-20", "👉 Dissecting aortitis in a goat associated with Pasteurella multocida and Staphylococcus spp infection. day", "38759507"),
                    Reference("CMAJ. 2021 Aug 23;193(33):E1328-E1329", "👉 Péricardite constrictive accompagnée de calcification péricardique. No clear dose/effect/duration found", "34426455"),
                    Reference("CMAJ. 2021 Jun 7;193(23):E853", "👉 Constrictive pericarditis with pericardial calcification. No clear dose/effect/duration found", "34099470"),

                    // Supplements
                    Reference("Curr Cardiol Rep. 2025 Jan 4;27(1):1", "👉 The Emerging Role of Multimodality Imaging in the Diagnosis and Management of Post Pericardiotomy Syndrome. G | Positive/therapeutic effect mentioned", "39754652"),
                    Reference("Am Heart J. 2025 Mar;281:32-42", "👉 Design and rationale of the COVID vaccine-associated myocarditis/pericarditis (CAMP) study. Positive/therapeutic effect mentioned | day, month", "39608555"),
                    Reference("JAMA. 2025 Feb 4;333(5):381-389", "👉 Pulmonary Vein Isolation With Optimized Linear Ablation vs Pulmonary Vein Isolation Alone for Persistent AF: The PROMPT-AF Randomized Clinical Trial. Positive/therapeutic effect mentioned | month", "39556379"),

                    // Nutrients
                    Reference("Vet Ital. 2007 Jan-Mar;43(1):43-54", "👉 Holistic efficacy of specific nutrient synergy against avian flu virus: mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day", "20411500"),
                    Reference("Avian Dis. 2000 Jul-Sep;44(3):545-8", "👉 Importance of Escherichia coli infection in ascites in broiler chickens shown by experimental production. g | day", "11007001"),
                    Reference("Clin Nephrol. 1975;3(5):195-203", "👉 Treatment of chronic uremic patients with protein-poor diet and oral supply of essential amino acids. g, mg, MG | Positive/therapeutic effect mentioned | month", "1149344")
                )
            )

            "Peripheral neuropathy" -> Pair(
                """
Alternative approaches
1. High thoracic erector spinae plane block for cervical radicular pain: Positive/therapeutic effect mentioned | week
2. Effectiveness of Peripheral Nerve Stimulation in Managing Chronic Pain: Positive/therapeutic effect mentioned | day, month
3. Polysaccharides: Sources, Mechanisms Associated and Therapeutic Potential for Neuropathy. Positive/therapeutic effect mentioned

Herbs
1. Integrative medicine in breast cancer survivorship care. Positive/therapeutic effect mentioned
2. Mechanistic exploration of licorice reconciling Medicine:Huangqi Guizhi Wuwu decoction and Shaoyao Gancao decoction compatibility. Positive/therapeutic effect mentioned
3. Exploring the Therapeutic Potential of Natural Plants in Modulating Molecular and Cellular Pathways Involved in Diabetic Neuropathy. Negative/adverse effect mentioned

Amino acids
1. Analgesic effects of transcutaneous auricular vagus nerve stimulation on partial sciatic nerve ligation-induced neuropathic pain in mice via serotonergic pathways. Negative/adverse effect mentioned
2. Safety and effectiveness of pregabalin controlled-release in Korean patients with peripheral neuropathic pain. mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week
3. Asparaginyl-tRNA synthetase (NARS1) variants implicated in dominant neurological phenotypes display dominant-negative properties. No clear dose/effect/duration found

Vitamins
1. Advances and clues of nutritional adjuvant therapy for Charcot-Marie-Tooth disease. Positive/therapeutic effect mentioned
2. Assessment of possible small fiber Neuropathy in early-stage vitamin B12 deficiency using electrophysiological methods. No clear dose/effect/duration found
3. Recurrent Stroke and Peripheral Neuropathy Associated With Multifactorial Hyperhomocysteinemia: A Case Report. No clear dose/effect/duration found

Minerals
1. Unravelling the myriad physiologic roles of transthyretin: critical considerations for treating transthyretin amyloidosis. Positive/therapeutic effect mentioned
2. Evaluation of the efficacy and tolerance of pamidronate in complex regional pain syndrom type 1. Positive/therapeutic effect mentioned
3. Quercetin as a Therapeutic Option in a Rat Model of Aluminum Chloride- and D-Galactose-Induced Neurodegeneration. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day

Supplements
1. The Effects of Co-Culturing ND7/23 Sensory Neuron-like Cells and IFRS1 Schwann Cells on Myelination: A Single-Arm Nonrandomized Study. μg | day
2. Omega-3 fatty acid supplementation for distal symmetrical peripheral neuropathy in adults with diabetes mellitus. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day
3. Effectiveness of Peripheral Nerve Stimulation in Managing Chronic Pain: Positive/therapeutic effect mentioned | day, month

Nutrients
1. Advances and clues of nutritional adjuvant therapy for Charcot-Marie-Tooth disease. Positive/therapeutic effect mentioned
2. Pathologic and Therapeutic Schwann Cells. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Neuroprotective Potential of Acmella oleracea Aerial Parts and Root Extracts: mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Medicine (Baltimore). 2025 Sep 19;104(38):e44749", "👉 High thoracic erector spinae plane block for cervical radicular pain: Does steroid addition enhance outcomes?: A retrospective comparative study. Positive/therapeutic effect mentioned | week", "40988266"),
                    Reference("Pain Physician. 2025 Sep;28(5):E481-E507", "👉 Effectiveness of Peripheral Nerve Stimulation in Managing Chronic Pain: A Systematic Review and Meta-analysis of Randomized Controlled Trials. Positive/therapeutic effect mentioned | day, month", "40986902"),
                    Reference("Cent Nerv Syst Agents Med Chem. 2025 Sep 18", "👉 Polysaccharides: Sources, Mechanisms Associated and Therapeutic Potential for Neuropathy. Positive/therapeutic effect mentioned", "40976902"),

                    // Herbs
                    Reference("Ann Palliat Med. 2025 May;14(3):283-294", "👉 Integrative medicine in breast cancer survivorship care. Positive/therapeutic effect mentioned", "40511571"),
                    Reference("J Ethnopharmacol. 2025 Apr 25;346:119708", "👉 Mechanistic exploration of licorice reconciling Medicine:Huangqi Guizhi Wuwu decoction and Shaoyao Gancao decoction compatibility. Positive/therapeutic effect mentioned", "40147678"),
                    Reference("Curr Pharm Des. 2025;31(14):1087-1099", "👉 Exploring the Therapeutic Potential of Natural Plants in Modulating Molecular and Cellular Pathways Involved in Diabetic Neuropathy. Negative/adverse effect mentioned", "39754768"),

                    // Amino acids
                    Reference("Mol Brain. 2025 Sep 26;18(1):73", "👉 Analgesic effects of transcutaneous auricular vagus nerve stimulation on partial sciatic nerve ligation-induced neuropathic pain in mice via serotonergic pathways. Negative/adverse effect mentioned", "41013640"),
                    Reference("Medicine (Baltimore). 2025 Sep 19;104(38):e44813", "👉 Safety and effectiveness of pregabalin controlled-release in Korean patients with peripheral neuropathic pain. mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week", "40988176"),
                    Reference("HGG Adv. 2025 Sep 18:100519", "👉 Asparaginyl-tRNA synthetase (NARS1) variants implicated in dominant neurological phenotypes display dominant-negative properties. No clear dose/effect/duration found", "40968538"),

                    // Vitamins
                    Reference("J Nutr. 2025 Sep 22:S0022-3166(25)00571-1", "👉 Advances and clues of nutritional adjuvant therapy for Charcot-Marie-Tooth disease. Positive/therapeutic effect mentioned", "40992667"),
                    Reference("Arq Neuropsiquiatr. 2025 Sep;83(9):1-7", "👉 Assessment of possible small fiber Neuropathy in early-stage vitamin B12 deficiency using electrophysiological methods. No clear dose/effect/duration found", "40973042"),
                    Reference("Neurohospitalist. 2025 Sep 16:19418744251379634", "👉 Recurrent Stroke and Peripheral Neuropathy Associated With Multifactorial Hyperhomocysteinemia: A Case Report. No clear dose/effect/duration found", "40969730"),

                    // Minerals
                    Reference("Ann Med. 2025 Dec;57(1):2536755", "👉 Unravelling the myriad physiologic roles of transthyretin: critical considerations for treating transthyretin amyloidosis. Positive/therapeutic effect mentioned", "40717228"),
                    Reference("Sci Rep. 2025 Jul 16;15(1):25745", "👉 Evaluation of the efficacy and tolerance of pamidronate in complex regional pain syndrom type 1. Positive/therapeutic effect mentioned", "40670562"),
                    Reference("Int J Mol Sci. 2025 Jun 15;26(12):5743", "👉 Quercetin as a Therapeutic Option in a Rat Model of Aluminum Chloride- and D-Galactose-Induced Neurodegeneration. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day", "40565209"),

                    // Supplements
                    Reference("Neurol Int. 2025 Sep 1;17(9):138", "👉 The Effects of Co-Culturing ND7/23 Sensory Neuron-like Cells and IFRS1 Schwann Cells on Myelination: A Single-Arm Nonrandomized Study. μg | day", "41002926"),
                    Reference("Cochrane Database Syst Rev. 2025 Sep 24;9(9):CD014623", "👉 Omega-3 fatty acid supplementation for distal symmetrical peripheral neuropathy in adults with diabetes mellitus. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day", "40990181"),
                    Reference("Pain Physician. 2025 Sep;28(5):E481-E507", "👉 Effectiveness of Peripheral Nerve Stimulation in Managing Chronic Pain: A Systematic Review and Meta-analysis of Randomized Controlled Trials. Positive/therapeutic effect mentioned | day, month", "40986902"),

                    // Nutrients
                    Reference("J Nutr. 2025 Sep 22:S0022-3166(25)00571-1", "👉 Advances and clues of nutritional adjuvant therapy for Charcot-Marie-Tooth disease. Positive/therapeutic effect mentioned", "40992667"),
                    Reference("Cells. 2025 Aug 28;14(17):1336", "👉 Pathologic and Therapeutic Schwann Cells. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40940747"),
                    Reference("Nutrients. 2025 Aug 8;17(16):2588", "👉 Neuroprotective Potential of Acmella oleracea Aerial Parts and Root Extracts: The Role of Phenols and Alkylamides Against Neuropathic Pain. mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40871616")
                )
            )

            "Piles" -> Pair(
                """
Alternative approaches
1. Effects of Displacement Piles for Dike Reinforcement on Adjacent Buildings. Positive/therapeutic effect mentioned
2. Rubber Band Ligation: A New Treatment Option for External Hemorrhoids. Positive/therapeutic effect mentioned
3. Hemorrhoids and cardiovascular disease: A bidirectional Mendelian randomization study. Positive/therapeutic effect mentioned

Herbs
1. How You Treat Hemorrhoids with Acupuncture and/or Chinese Herbs, in Your Practice. No clear dose/effect/duration found
2. How You Treat Hemorrhoids with Acupuncture and/or Chinese Herbs, in Your Practice. No clear dose/effect/duration found
3. RNA editing events and expression profiles of mitochondrial protein-coding genes in Corydalis saxicola. Positive/therapeutic effect mentioned

Amino acids
1. Improvement of Summer Green Tea Quality Through an Integrated Shaking and Piling Process. Positive/therapeutic effect mentioned
2. MicroRNA-770 promotes polarization of macrophages and hemorrhoids by suppressing RYBP expression. Positive/therapeutic effect mentioned
3. Carbon-mediated modulation pathways of phytotoxicity in chicken manure composting. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Vitamins
1. Traditional uses, phytochemistry, pharmacology, and nutraceutical potential of horse gram. Positive/therapeutic effect mentioned
2. Untargeted urine metabolomics suggests that ascorbic acid may serve as a promising biomarker for reduced feed intake in rabbits. Positive/therapeutic effect mentioned
3. Long-term Impacts of Long COVID: Increased Incidence of Cardiomyopathies, Joint Diseases, and Psychoanxiety Disorders. No clear dose/effect/duration found

Minerals
1. Numerical modelling of the hydrogeochemical behaviour of laboratory-scale waste rocks configurations. Positive/therapeutic effect mentioned
2. Influence of two methods of smear layer removal on the surface properties of dentin. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Evaluating segmentation methods for UAV-Based Spoil Pile Delineation. No clear dose/effect/duration found

Supplements
1. The Combination of Fluocinolone Acetonide and Ketocaine Hydrochloride in the Conservative Management of Symptomatic Hemorrhoidal Disease. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Assessment of the Interaction of the Combined Piled Raft Foundation Elements Based on Long-Term Measurements. No clear dose/effect/duration found
3. Dietary Fiber: A Comprehensive Review of Its Sources, Health Benefits, and Mechanisms Driving Nutraceutical Effects. Positive/therapeutic effect mentioned

Nutrients
1. Fungal communities in biowaste composting: a comparative study of multiple ratios of woodchips vs. a perlite-cardboard blend as bulking agents. Positive/therapeutic effect mentioned
2. Food Concepts Among Black and Hispanic Preschool-Age Children: A Preliminary Qualitative Descriptive Study. No clear dose/effect/duration found
3. Feasibility study on coal based solid waste as a soil additive. Positive/therapeutic effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Geotech Geol Eng (Dordr). 2025;43(8):446", "👉 Effects of Displacement Piles for Dike Reinforcement on Adjacent Buildings. Positive/therapeutic effect mentioned", "40994924"),
                    Reference("Cureus. 2025 Aug 9;17(8):e89701", "👉 Rubber Band Ligation: A New Treatment Option for External Hemorrhoids. Positive/therapeutic effect mentioned", "40932938"),
                    Reference("Open Med (Wars). 2025 Aug 19;20(1):20251256", "👉 Hemorrhoids and cardiovascular disease: A bidirectional Mendelian randomization study. Positive/therapeutic effect mentioned", "40918164"),

                    // Herbs
                    Reference("Med Acupunct. 2024 Oct 21;36(5):299-300", "👉 How You Treat Hemorrhoids with Acupuncture and/or Chinese Herbs, in Your Practice. No clear dose/effect/duration found", "39741765"),
                    Reference("Med Acupunct. 2024 Oct 21;36(5):297-299", "👉 How You Treat Hemorrhoids with Acupuncture and/or Chinese Herbs, in Your Practice. No clear dose/effect/duration found", "39741764"),
                    Reference("Front Plant Sci. 2024 Feb 6;15:1332460", "👉 RNA editing events and expression profiles of mitochondrial protein-coding genes in the endemic and endangered medicinal plant, Corydalis saxicola. Positive/therapeutic effect mentioned", "38379941"),

                    // Amino acids
                    Reference("Foods. 2025 Apr 7;14(7):1284", "👉 Improvement of Summer Green Tea Quality Through an Integrated Shaking and Piling Process. Positive/therapeutic effect mentioned", "40238596"),
                    Reference("Mol Immunol. 2025 Jun;182:41-53", "👉 MicroRNA-770 promotes polarization of macrophages and hemorrhoids by suppressing RYBP expression. Positive/therapeutic effect mentioned", "40174420"),
                    Reference("Chemosphere. 2024 Nov;368:143755", "👉 Carbon-mediated modulation pathways of phytotoxicity in chicken manure composting. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "39549968"),

                    // Vitamins
                    Reference("J Food Sci. 2024 Dec;89(12):8102-8127", "👉 Traditional uses, phytochemistry, pharmacology, and nutraceutical potential of horse gram (Macrotyloma uniflorum): A systematic review. Positive/therapeutic effect mentioned", "39656760"),
                    Reference("Sci Rep. 2024 Nov 25;14(1):29180", "👉 Untargeted urine metabolomics suggests that ascorbic acid may serve as a promising biomarker for reduced feed intake in rabbits. g | Positive/therapeutic effect mentioned | day", "39587239"),
                    Reference("In Vivo. 2024 Nov-Dec;38(6):3022-3032", "👉 Long-term Impacts of Long COVID: Increased Incidence of Cardiomyopathies, Joint Diseases, and Psychoanxiety Disorders. No clear dose/effect/duration found", "39477428"),

                    // Minerals
                    Reference("J Contam Hydrol. 2025 Nov;275:104694", "👉 Numerical modelling of the hydrogeochemical behaviour of laboratory-scale waste rocks configurations. mg | Positive/therapeutic effect mentioned | day", "40845789"),
                    Reference("Beijing Da Xue Xue Bao Yi Xue Ban. 2025 Apr 18;57(2):340-346", "👉 Influence of two methods of smear layer removal on the surface properties of dentin. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40219567"),
                    Reference("Sci Rep. 2025 Mar 25;15(1):10305", "👉 Evaluating segmentation methods for UAV-Based Spoil Pile Delineation. No clear dose/effect/duration found", "40133311"),

                    // Supplements
                    Reference("J Gastrointestin Liver Dis. 2025 Sep 26;34(3):370-380", "👉 The Combination of Fluocinolone Acetonide and Ketocaine Hydrochloride in the Conservative Management of Symptomatic Hemorrhoidal Disease. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41004811"),
                    Reference("Sensors (Basel). 2025 May 30;25(11):3460", "👉 Assessment of the Interaction of the Combined Piled Raft Foundation Elements Based on Long-Term Measurements. No clear dose/effect/duration found", "40969007"),
                    Reference("Recent Adv Food Nutr Agric. 2025 Aug 18", "👉 Dietary Fiber: A Comprehensive Review of Its Sources, Health Benefits, and Mechanisms Driving Nutraceutical Effects. Positive/therapeutic effect mentioned", "40849764"),

                    // Nutrients
                    Reference("J Environ Manage. 2025 Aug 13;393:126889", "👉 Fungal communities in biowaste composting: a comparative study of multiple ratios of woodchips vs. a perlite-cardboard blend as bulking agents. G", "40812107"),
                    Reference("Nutrients. 2025 Apr 10;17(8):1313", "👉 Food Concepts Among Black and Hispanic Preschool-Age Children: A Preliminary Qualitative Descriptive Study. No clear dose/effect/duration found", "40284178"),
                    Reference("Sci Rep. 2025 Apr 1;15(1):11068", "👉 Feasibility study on coal based solid waste as a soil additive. Positive/therapeutic effect mentioned", "40169600")
                )
            )

            "Pneumonia" -> Pair(
                """
Alternative approaches
1. Pulmonary complications following postpartum tubal ligation with laryngeal mask vs. endotracheal intubation. Negative/adverse effect mentioned
2. Endophytes in Medicinal Plants: A Sustainable Solution for Coping with Environmental Stresses. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. APOBEC3B Promotes SARS-CoV-2 Through Activation of PKR/eIF2⍺ and AMPD2 Dysregulation. Positive/therapeutic effect mentioned

Herbs
1. Antibacterial and anti-inflammatory activities of crude saponin extract from licorice roots against Streptococcus pneumoniae. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. LianZhiXiaoYan Formula alleviates LPS-induced chronic pneumonia via SIRT3-SDH-SUCNR1 signaling pathway. Positive/therapeutic effect mentioned
3. rweChemScreener: High-dimension mediation analysis detects potential effective chemical ingredients of TCM from clinical data. No clear dose/effect/duration found

Amino acids
1. An Anti-HIV Drug Is Highly Effective Against SARS-CoV-2 In Vitro; Potential Benefit for Long COVID Treatment. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. LMP7 as a Target for Coronavirus Therapy: Inhibition by Ixazomib and Interaction with SARS-CoV-2 Proteins. Negative/adverse effect mentioned
3. Structural analysis of 23S rRNA methylating enzyme Cfr: RNA binding determinants and antibiotic resistance. No clear dose/effect/duration found

Vitamins
1. Overlap of Gulf War Illness, Fibromyalgia, ME/CFS and Long COVID: Implications for Future Therapeutic Strategies. Positive/therapeutic effect mentioned
2. Impact of anticoagulation therapy on surgical timing, hospital stay, and postoperative outcomes. Positive/therapeutic effect mentioned
3. Association Between Vitamin D Levels and Long COVID Signs and Symptoms. Positive/therapeutic effect mentioned

Minerals
1. An Aptamer-Based gFET-Sensor for Specific Quantification of Human Adenovirus Type 5. Positive/therapeutic effect mentioned
2. Chemical Composition and Bioactivities of Sideritis libanotica Labill: Mineral Content and Enzyme Inhibitory Potentials. Positive/therapeutic effect mentioned
3. High prevalence of respiratory diseases: population-based ecological study. No clear dose/effect/duration found

Supplements
1. Coenrollment of critically ill patients in PROSPECT: association with treatment efficacy and safety. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Changes in rural China's caregiver outcomes, behaviours, and health services utilisation post-COVID-19. Positive/therapeutic effect mentioned
3. Integrated Omics-Based Discovery of Bioactive Halogenated Metabolites from Deep-Sea Streptomyces sp. B188M101. Positive/therapeutic effect mentioned

Nutrients
1. Endophytes in Medicinal Plants: A Sustainable Solution for Coping with Environmental Stresses. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. In Vitro Suppression Effects of Ephedra przewalskii-Derived Natural Compounds on SARS-CoV-2. No clear dose/effect/duration found
3. Demographic Determinants of Food Insecurity in Older Adults During the COVID-19 Pandemic. No clear dose/effect/duration found
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Int J Obstet Anesth. 2025 Sep 22;65:104776", "👉 Pulmonary complications following postpartum tubal ligation with laryngeal mask vs. endotracheal intubation: a retrospective cohort study (2012-2024). Negative/adverse effect mentioned", "41014852"),
                    Reference("Curr Microbiol. 2025 Sep 27;82(11):529", "👉 Endophytes in Medicinal Plants: A Sustainable Solution for Coping with Environmental Stresses. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41014378"),
                    Reference("Viruses. 2025 Aug 28;17(9):1176", "👉 APOBEC3B Promotes SARS-CoV-2 Through Activation of PKR/eIF2⍺ and AMPD2 Dysregulation. Positive/therapeutic effect mentioned", "41012606"),

                    // Herbs
                    Reference("Drug Metab Pers Ther. 2025 Sep 29", "👉 In vivo and in vitro evaluation of antibacterial and anti-inflammatory activities of extraction of crude saponin isolated from licorice roots against Streptococcus pneumoniae. µg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41006950"),
                    Reference("J Ethnopharmacol. 2025 Sep 24:120646", "👉 LianZhiXiaoYan Formula alleviates LPS-induced chronic pneumonia via regulating metabolic reprogramming through SIRT3-SDH-SUCNR1 signaling pathway. Positive/therapeutic effect mentioned", "41005468"),
                    Reference("Phytomedicine. 2025 Nov;147:157225", "👉 rweChemScreener: high-dimension mediation analysis detects potential effective chemical ingredients of traditional Chinese medicine from real-world clinical data. No clear dose/effect/duration found", "40945250"),

                    // Amino acids
                    Reference("Viruses. 2025 Aug 27;17(9):1170", "👉 An Anti-HIV Drug Is Highly Effective Against SARS-CoV-2 In Vitro and Has Potential Benefit for Long COVID Treatment. µg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41012598"),
                    Reference("Pathogens. 2025 Sep 2;14(9):871", "👉 LMP7 as a Target for Coronavirus Therapy: Inhibition by Ixazomib and Interaction with SARS-CoV-2 Proteins Nsp13 and Nsp16. Negative/adverse effect mentioned", "41011771"),
                    Reference("bioRxiv [Preprint]. 2025 Sep 18:2025.09.18.677109", "👉 Structural analysis of 23S rRNA methylating enzyme Cfr reveals RNA binding determinants for methylation regiospecificity and antibiotic resistance. No clear dose/effect/duration found", "41000619"),

                    // Vitamins
                    Reference("Int J Mol Sci. 2025 Sep 17;26(18):9044", "👉 Gulf War Illness, Fibromyalgia, Myalgic Encephalomyelitis/Chronic Fatigue Syndrome and Long COVID Overlap in Common Symptoms and Underlying Biological Mechanisms: Implications for Future Therapeutic Strategies. Positive/therapeutic effect mentioned", "41009608"),
                    Reference("Acta Orthop Traumatol Turc. 2025 Sep 12;59(5):253-258", "👉 Impact of anticoagulation therapy on surgical timing, hospital stay, and postoperative outcomes in proximal femur fracture patients. Positive/therapeutic effect mentioned | day", "40994363"),
                    Reference("Med Sci (Basel). 2025 Sep 18;13(3):199", "👉 Association Between Vitamin D Levels and Long COVID Signs and Symptoms. Positive/therapeutic effect mentioned | day, month", "40981197"),

                    // Minerals
                    Reference("Biosensors (Basel). 2025 Sep 14;15(9):605", "👉 An Aptamer-Based gFET-Sensor for Specific Quantification of Gene Therapeutic Human Adenovirus Type 5. Positive/therapeutic effect mentioned", "41002345"),
                    Reference("Chem Biodivers. 2025 Sep 17:e01314", "👉 Chemical Composition and Bioactivities of Sideritis libanotica Labill subsp. Libanotica: LC-HRMS Phytochemical Profiling, Mineral Content, Antioxidant, Antibacterial, and Neuroprotective-Antidiabetic Enzyme Inhibitory Potentials. mg | Positive/therapeutic effect mentioned", "40961453"),
                    Reference("Epidemiol Serv Saude. 2025 Sep 15;34:e20240519", "👉 High prevalence of respiratory diseases: a population-based ecological study, Sertão do Araripe, 2008-2019. No clear dose/effect/duration found", "40960761"),

                    // Supplements
                    Reference("Trials. 2025 Sep 26;26(1):370", "👉 Coenrollment of critically ill patients in PROSPECT: characteristics and association with treatment efficacy and safety. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41013603"),
                    Reference("J Glob Health. 2025 Sep 26;15:04203", "👉 Changes in rural China's caregiver outcomes, behaviours, and health services utilisation following the COVID-19 pandemic: an observational study. Positive/therapeutic effect mentioned", "41004217"),
                    Reference("Mar Drugs. 2025 Sep 19;23(9):362", "👉 Integrated Omics-Based Discovery of Bioactive Halogenated Metabolites from the Deep-Sea Streptomyces sp. B188M101. µg", "41003331"),

                    // Nutrients
                    Reference("Curr Microbiol. 2025 Sep 27;82(11):529", "👉 Endophytes in Medicinal Plants: A Sustainable Solution for Coping with Environmental Stresses. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41014378"),
                    Reference("Nutrients. 2025 Sep 15;17(18):2958", "👉 In Vitro Suppression Effects of Ephedra przewalskii Stapf-Derived Natural Compounds on SARS-CoV-2. No clear dose/effect/duration found", "41010483"),
                    Reference("Nutrients. 2025 Sep 12;17(18):2934", "👉 Demographic Determinants of Food Insecurity in Older Adults During the COVID-19 Pandemic. No clear dose/effect/duration found", "41010460")
                )
            )

            "Polycystic ovary syndrome" -> Pair(
                """
Alternative approaches
1. In Silico and Experimental Evaluation of Myricetin in Insulin Resistance-Associated PCOS in Rats. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Thymoquinone Versus Metformin in Letrozole-Induced PCOS: Comparative Insights into Metabolic, Hormonal, and Ovarian Outcomes. Positive/therapeutic effect mentioned
3. Gynecologic surgery for benign disease: Preserving reproductive potential. Positive/therapeutic effect mentioned

Herbs
1. Laurolitsine ameliorates insulin resistance, ovarian dysfunction and gut microbiota dysbiosis in PCOS mice. Positive/therapeutic effect mentioned
2. Method of invigorating spleen and replenishing kidney and resolving phlegm for obesity-type PCOS: network meta-analysis. Positive/therapeutic effect mentioned
3. Comparative advantage and efficacy of natural products for PCOS. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Amino acids
1. Alteration of the follicular fluid amino acid profile reveals roles of several amino acids in embryo quality in PCOS. No clear dose/effect/duration found
2. Correlation between melanin-concentrating hormone and PCOS and its androgen levels. No clear dose/effect/duration found
3. Repurposing of rebamipide as a neuroprotective agent in letrozole-induced depressive-like behaviors in rats. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Vitamins
1. Relationship between initial vitamin D levels and IVF outcomes in PCOS patients. Positive/therapeutic effect mentioned
2. Systematic study of Nothapodytes nimmoniana for the Management of PCOS. Positive/therapeutic effect mentioned
3. D-Chiro-Inositol and LPS Induce a PCOS-Like Hyperandrogenic Response in Human KGN Granulosa Cells. Positive/therapeutic effect mentioned

Minerals
1. Correlations between serum bone biomarkers and metabolic/hormonal profile in lean and overweight PCOS adolescent girls. Positive/therapeutic effect mentioned
2. Non-classical congenital adrenal hyperplasia: clinical insights, diagnosis and treatment. Positive/therapeutic effect mentioned
3. Role of Nutraceuticals and Probiotics in addition to lifestyle intervention in childhood obesity. Positive/therapeutic effect mentioned

Supplements
1. Hormonal contraceptives combined with vitamin D3 supplements on sexual dysfunction in women with PCOS. Positive/therapeutic effect mentioned
2. Revisiting Metformin in the Management of PCOS. No clear dose/effect/duration found
3. Nutraceutical Insulin Sensitizing Agents in the Treatment of Psoriasis and Other Dermatological Diseases. Positive/therapeutic effect mentioned

Nutrients
1. PCOS and the Effects of a Ketogenic Diet: A Scoping Review. Positive/therapeutic effect mentioned
2. Dietary inflammatory index and lifestyle inflammation scores associated with PCOS. No clear dose/effect/duration found
3. Cysteine mediates association of essential trace elements with PCOS; effect of ambient particulate matter exposure. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Chem Biodivers. 2025 Sep 27:e02165", "👉 In Silico and Experimental Evaluation of Myricetin in Insulin Resistance-Associated PCOS in Rats. mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41014606"),
                    Reference("J Clin Med. 2025 Sep 18;14(18):6561", "👉 Thymoquinone Versus Metformin in Letrozole-Induced PCOS: Comparative Insights into Metabolic, Hormonal, and Ovarian Outcomes. g, mg | Positive/therapeutic effect mentioned | day", "41010765"),
                    Reference("Int J Gynaecol Obstet. 2025 Sep 24", "👉 Gynecologic surgery for benign disease: Preserving reproductive potential. Positive/therapeutic effect mentioned", "40990817"),

                    // Herbs
                    Reference("Front Endocrinol (Lausanne). 2025 Sep 8;16:1517934", "👉 Laurolitsine ameliorates insulin resistance, ovarian dysfunction and gut microbiota dysbiosis in DHEA plus HFD-induced PCOS mice. Positive/therapeutic effect mentioned", "40989123"),
                    Reference("Front Med (Lausanne). 2025 Jul 28;12:1609131", "👉 Method of invigorating spleen and replenishing kidney and resolving phlegm for obesity-type polycystic ovary syndrome: a network meta-analysis and summary of herbal prescription regularity. Positive/therapeutic effect mentioned", "40792299"),
                    Reference("J Ovarian Res. 2025 Aug 9;18(1):178", "👉 Comparative advantage and efficacy of natural products for polycystic ovary syndrome. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40783741"),

                    // Amino acids
                    Reference("Reprod Biol Endocrinol. 2025 Sep 24;23(1):123", "👉 Alteration of the follicular fluid amino acid profile reveals the important roles of several amino acids in embryo quality in patients with polycystic ovary syndrome. No clear dose/effect/duration found", "40993745"),
                    Reference("Zhonghua Nei Ke Za Zhi. 2025 Sep 1;64(9):838-844", "👉 Correlation between melanin-concentrating hormone and polycystic ovary syndrome and its androgen levels. No clear dose/effect/duration found", "40904292"),
                    Reference("Life Sci. 2025 Nov 1;380:123941", "👉 Repurposing of rebamipide as a neuroprotective agent to alleviate letrozole-induced depressive-like behaviors in female rats: Targeting SIRT1/FoxO1/wnt/ β-catenin, and related ferroptosis pathways. g, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40889698"),

                    // Vitamins
                    Reference("Front Med (Lausanne). 2025 Sep 10;12:1589193", "👉 The relationship between initial vitamin D levels and in vitro fertilization (IVF) outcomes in PCOS patients: a systematic review. Positive/therapeutic effect mentioned", "41001383"),
                    Reference("Chem Biodivers. 2025 Sep 19:e00877", "👉 An Integrated Systematic Study Combining GC-MS, HPLC, Molecular Docking, and MD Simulation to Explore the Potential of Nothapodytes nimmoniana (J. Graham) Mabb. for the Management of PCOS. Positive/therapeutic effect mentioned", "40971244"),
                    Reference("J Cell Mol Med. 2025 Sep;29(17):e70779", "👉 D-Chiro-Inositol and LPS Induce a PCOS-Like Hyperandrogenic Response in Human KGN Granulosa Cells. Positive/therapeutic effect mentioned", "40932751"),

                    // Minerals
                    Reference("Front Nutr. 2025 Jul 7;12:1477992", "👉 The correlations between serum bone biomarkers and those related to metabolic and hormonal profile, low-grade inflammation and redox balance, in lean and overweight PCOS adolescent girls. Positive/therapeutic effect mentioned", "40704316"),
                    Reference("Endocrine. 2025 Oct;90(1):1-16", "👉 Non-classical congenital adrenal hyperplasia: current insights into clinical implications, diagnosis and treatment. Positive/therapeutic effect mentioned", "40699527"),
                    Reference("Nutrients. 2025 Apr 28;17(9):1487", "👉 The Role of Nutraceuticals and Probiotics in Addition to Lifestyle Intervention in the Management of Childhood Obesity-Part 2: Comorbidities. Positive/therapeutic effect mentioned", "40362796"),

                    // Supplements
                    Reference("Arch Gynecol Obstet. 2025 Sep 6", "👉 The effect of hormonal contraceptives combined with vitamin D3 supplements on sexual dysfunction in women with polycystic ovary syndrome: a randomized double-blind placebo-controlled trial. IU | Positive/therapeutic effect mentioned | week, month", "40913650"),
                    Reference("Cureus. 2025 Jul 18;17(7):e88216", "👉 Revisiting Metformin in the Management of Polycystic Ovary Syndrome (PCOS). No clear dose/effect/duration found", "40842765"),
                    Reference("Int J Mol Sci. 2025 Aug 4;26(15):7538", "👉 New Perspectives on Nutraceutical Insulin Sensitizing Agents in the Treatment of Psoriasis and Other Dermatological Diseases. Positive/therapeutic effect mentioned", "40806666"),

                    // Nutrients
                    Reference("Nutrients. 2025 Sep 7;17(17):2893", "👉 Polycystic Ovary Syndrome and the Effects of a Ketogenic Diet: A Scoping Review. Positive/therapeutic effect mentioned", "40944281"),
                    Reference("BMC Endocr Disord. 2025 Sep 4;25(1):202", "👉 Association between dietary inflammatory index, empirical dietary inflammatory patterns, dietary and lifestyle inflammation scores, and polycystic ovary syndrome: a case-control study. month", "40903727"),
                    Reference("Ecotoxicol Environ Saf. 2025 Sep 15;303:118868", "👉 Cysteine mediates the association of essential trace elements with polycystic ovary syndrome: Does ambient particulate matters exposure modify the mediation effect of cysteine. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day", "40845640")
                )
            )

            "Post-traumatic stress disorder" -> Pair(
                """
Alternative approaches
1. Auditory cognition lab: a music therapy and speech-language pathology co-treatment for military-connected populations with auditory and cognitive impairment. Positive/therapeutic effect mentioned
2. Effects of Different Cannabinoid Formulations on Anxiety-Related Disorders, and Tourette Syndrome: A Systematic Review and Meta-Analysis. Positive/therapeutic effect mentioned
3. Computational analysis of therapeutic potential for simplified Piper. spp-derived medicinal mixtures in anxiety, sleep, pain and seizure. No clear dose/effect/duration found

Herbs
1. Therapeutic potential of genus Polygonatum in common neuropsychiatric disorders: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Cortisol as a Target for Treating Mental Disorders: A Promising Avenue for Therapy. Positive/therapeutic effect mentioned
3. Novel Psychopharmacological Herbs Relieve Behavioral Abnormalities and Hippocampal Dysfunctions in an Animal Model of Post-Traumatic Stress Disorder. Positive/therapeutic effect mentioned

Amino acids
1. N-Acetylcysteine for the Treatment of Co-Occurring Posttraumatic Stress Disorder and Alcohol Use Disorder. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Transcutaneous auricular vagus nerve stimulation alleviates anxiety-like behaviors in mice with PTSD. Positive/therapeutic effect mentioned
3. Sequential administration of D-cycloserine and MK801 reduces pERK-expressing neurons in the lateral amygdala and disrupts threat memory reconsolidation. Positive/therapeutic effect mentioned

Vitamins
1. A Case-Control Study of Trichotillomania Patients Using a National Database. No clear dose/effect/duration found
2. Thiamine Compounds Alleviate Oxidative Stress, Over-Expression of Pro-Inflammatory Markers and Behavioral Abnormalities in a Mouse Predation Model of PTSD. Positive/therapeutic effect mentioned
3. Causal relationship between B vitamins and neuropsychiatric disorders: A systematic review and meta-analysis. No clear dose/effect/duration found

Minerals
1. Evaluation of PTSD-Induced Alterations in Bone Biomechanics and the Protective Potential of CE-123 in a Wistar Rat Model. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Bidirectional causality between micronutrients and mental illness: Mendelian randomization studies. No clear dose/effect/duration found
3. Graphene oxide prevents lateral amygdala dysfunctional synaptic plasticity and reverts long lasting anxiety behavior in rats. Positive/therapeutic effect mentioned

Supplements
1. PTSD, trauma and parenting stress: an individual participant data meta-analysis. No clear dose/effect/duration found
2. Analyzing a Decade of Warrior Well-Being: Longitudinal Trends and Implications for U.S. Veteran Support From the Wounded Warrior Project Annual Survey. Positive/therapeutic effect mentioned
3. Growing through adversity: A meta-analytic and conceptual elucidation of the relationship between posttraumatic stress and posttraumatic growth among youth. G,G

Nutrients
1. Traumatic Events and Post-Traumatic Stress Disorder in Adolescents with Severe Eating Disorder Admitted to a Day Care Hospital. Positive/therapeutic effect mentioned
2. The Conclusive and Continuous Tool to Assess Severity and Improvement of Eating Disorders (CONTASI-ED): Development and Psychometric Properties. Positive/therapeutic effect mentioned
3. Causal relationship between B vitamins and neuropsychiatric disorders: A systematic review and meta-analysis. No clear dose/effect/duration found
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Front Neurol. 2025 Sep 1;16:1642056", "👉 Auditory cognition lab: a music therapy and speech-language pathology co-treatment for military-connected populations with auditory and cognitive impairment. Positive/therapeutic effect mentioned", "40959504"),
                    Reference("Cannabis Cannabinoid Res. 2025 Sep 16", "👉 Effects of Different Cannabinoid Formulations on Anxiety-Related Disorders, and Tourette Syndrome: A Systematic Review and Meta-Analysis. Positive/therapeutic effect mentioned", "40956670"),
                    Reference("bioRxiv [Preprint]. 2025 Sep 4:2025.08.29.673131", "👉 Computational analysis of therapeutic potential for simplified Piper. spp-derived medicinal mixtures in anxiety, sleep, pain and seizure. No clear dose/effect/duration found", "40950049"),

                    // Herbs
                    Reference("J Ethnopharmacol. 2025 Jun 26;350:120052", "👉 Therapeutic potential of genus Polygonatum in common neuropsychiatric disorders: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40441463"),
                    Reference("Mini Rev Med Chem. 2024;24(6):588-600", "👉 Cortisol as a Target for Treating Mental Disorders: A Promising Avenue for Therapy. Positive/therapeutic effect mentioned", "37861053"),
                    Reference("Nutrients. 2023 Aug 31;15(17):3815", "👉 Novel Psychopharmacological Herbs Relieve Behavioral Abnormalities and Hippocampal Dysfunctions in an Animal Model of Post-Traumatic Stress Disorder. mg | Positive/therapeutic effect mentioned | day", "37686847"),

                    // Amino acids
                    Reference("J Clin Psychiatry. 2025 Aug 27;86(4):25m15803", "👉 N-Acetylcysteine for the Treatment of Co-Occurring Posttraumatic Stress Disorder and Alcohol Use Disorder. mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week", "40875537"),
                    Reference("Transl Psychiatry. 2025 Aug 23;15(1):313", "👉 Transcutaneous auricular vagus nerve stimulation alleviates anxiety-like behaviors in mice with PTSD. Positive/therapeutic effect mentioned", "40849423"),
                    Reference("Neuroscience. 2025 Oct 1;584:382-394", "👉 Sequential administration of D-cycloserine and MK801 reduces pERK-expressing neurons in the lateral amygdala and disrupts threat memory reconsolidation. mg | Positive/therapeutic effect mentioned", "40840704"),

                    // Vitamins
                    Reference("Skin Appendage Disord. 2025 Aug;11(4):379-384", "👉 A Case-Control Study of Trichotillomania Patients Using a National Database. No clear dose/effect/duration found", "40771450"),
                    Reference("Int J Mol Sci. 2025 Jul 10;26(14):6627", "👉 Thiamine Compounds Alleviate Oxidative Stress, Over-Expression of Pro-Inflammatory Markers and Behavioral Abnormalities in a Mouse Predation Model of PTSD. mg | Positive/therapeutic effect mentioned | day", "40724875"),
                    Reference("Neurosci Biobehav Rev. 2025 Mar;170:106068", "👉 Causal relationship between B vitamins and neuropsychiatric disorders: A systematic review and meta-analysis. No clear dose/effect/duration found", "39952338"),

                    // Minerals
                    Reference("J Clin Med. 2025 Apr 2;14(7):2427", "👉 Evaluation of PTSD-Induced Alterations in Bone Biomechanics and the Protective Potential of CE-123 in a Wistar Rat Model. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40217875"),
                    Reference("J Affect Disord. 2025 Jan 15;369:718-764", "👉 Bidirectional causality between micronutrients and mental illness: Mendelian randomization studies. No clear dose/effect/duration found", "39393463"),
                    Reference("Biomaterials. 2021 Apr;271:120749", "👉 Graphene oxide prevents lateral amygdala dysfunctional synaptic plasticity and reverts long lasting anxiety behavior in rats. Positive/therapeutic effect mentioned", "33714913"),

                    // Supplements
                    Reference("Eur J Psychotraumatol. 2025 Dec;16(1):2538907", "👉 PTSD, trauma and parenting stress: an individual participant data meta-analysis. No clear dose/effect/duration found", "40853506"),
                    Reference("Mil Med. 2025 Aug 18:usaf396", "👉 Analyzing a Decade of Warrior Well-Being: Longitudinal Trends and Implications for U.S. Veteran Support From the Wounded Warrior Project Annual Survey. Positive/therapeutic effect mentioned", "40824726"),
                    Reference("Clin Psychol Rev. 2025 Aug;120:102617", "👉 Growing through adversity: A meta-analytic and conceptual elucidation of the relationship between posttraumatic stress and posttraumatic growth among youth. G,G", "40554901"),

                    // Nutrients
                    Reference("Nutrients. 2025 Jun 26;17(13):2125", "👉 Traumatic Events and Post-Traumatic Stress Disorder in Adolescents with Severe Eating Disorder Admitted to a Day Care Hospital. Positive/therapeutic effect mentioned", "40647230"),
                    Reference("Nutrients. 2025 May 24;17(11):1790", "👉 The Conclusive and Continuous Tool to Assess Severity and Improvement of Eating Disorders (CONTASI-ED): Development and Psychometric Properties. Positive/therapeutic effect mentioned", "40507059"),
                    Reference("Neurosci Biobehav Rev. 2025 Mar;170:106068", "👉 Causal relationship between B vitamins and neuropsychiatric disorders: A systematic review and meta-analysis. No clear dose/effect/duration found", "39952338")
                )
            )

            "Pregnancy" -> Pair(
                """
Alternative approaches
1. Diagnostic Performance of Salivary PCR for the Detection of Congenital Cytomegalovirus. No clear dose/effect/duration found
2. Current Perspectives on Remifentanil-PCA for Labor Analgesia. Positive/therapeutic effect mentioned
3. Efficacy of Monotherapy Letrozole Versus Methotrexate for the Management of Ectopic Pregnancy. No clear dose/effect/duration found

Herbs
1. Patterns of utilization and determinants of maternal health services. Positive/therapeutic effect mentioned
2. Advancing the safe motherhood initiative. No clear dose/effect/duration found
3. Traditional Practices Used for the Infertility Treatment. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Amino acids
1. Interaction Between Thyroid Hormones and Bone Morphogenetic Proteins. Negative/adverse effect mentioned
2. MOTS-C levels in individuals with and without obesity. No clear dose/effect/duration found
3. Maternal food-derived signals oscillate in the fetal suprachiasmatic nucleus. No clear dose/effect/duration found

Vitamins
1. Vitamin D Status, CMV Seropositivity, and Viral Cytokine Expression. Negative/adverse effect mentioned
2. Acceptability of Antenatal Multiple Micronutrient Supplementation (MMS). Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Maternal Folic Acid Supplementation, Perinatal Factors, and Pre-Adolescent Asthma. Positive/therapeutic effect mentioned

Minerals
1. Associations between residential greenness exposure during pregnancy and bone mineral density. Positive/therapeutic effect mentioned
2. Synergy of Arsenic and Graphene Oxide in Utero and Lactation. Negative/adverse effect mentioned
3. Exposure to Kalach, a Glyphosate-Based Herbicide. Negative/adverse effect mentioned

Supplements
1. BOTULISM IN PREGNANCY. Negative/adverse effect mentioned
2. Acceptability of Antenatal Multiple Micronutrient Supplementation (MMS). Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Maternal Folic Acid Supplementation. Positive/therapeutic effect mentioned

Nutrients
1. Effects of Maternal Nutrition and One-Carbon Metabolite Supplementation. No clear dose/effect/duration found
2. Acceptability of Antenatal Multiple Micronutrient Supplementation (MMS). Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Factors Influencing Exclusive Breastfeeding During the Postpartum Period. Positive/therapeutic effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Viruses. 2025 Sep 17;17(9):1253", "👉 Diagnostic Performance of Salivary PCR for the Detection of Congenital Cytomegalovirus: No clear dose/effect/duration found", "41012680"),
                    Reference("Medicina (Kaunas). 2025 Aug 29;61(9):1550", "👉 Current Perspectives on Remifentanil-PCA for Labor Analgesia: Positive/therapeutic effect mentioned", "41010941"),
                    Reference("J Clin Med. 2025 Sep 17;14(18):6523", "👉 Efficacy of Monotherapy Letrozole Versus Methotrexate for the Management of Ectopic Pregnancy: No clear dose/effect/duration found", "41010727"),

                    // Herbs
                    Reference("PLOS Glob Public Health. 2025 Sep 24;5(9):e0004862", "👉 Patterns of utilization and determinants of maternal health services: Positive/therapeutic effect mentioned", "40991556"),
                    Reference("PLOS Glob Public Health. 2025 Sep 12;5(9):e0004794", "👉 Advancing the safe motherhood initiative: No clear dose/effect/duration found", "40938841"),
                    Reference("Nurs Res Pract. 2025 Sep 3;2025:6934650", "👉 Traditional Practices Used for the Infertility Treatment: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month", "40937363"),

                    // Amino acids
                    Reference("Int J Mol Sci. 2025 Sep 18;26(18):9127", "👉 Interaction Between Thyroid Hormones and Bone Morphogenetic Proteins: Negative/adverse effect mentioned", "41009688"),
                    Reference("Arch Endocrinol Metab. 2025 Sep 26;69(5):e250063", "👉 MOTS-C levels in individuals with and without obesity: No clear dose/effect/duration found", "41004666"),
                    Reference("PLoS Biol. 2025 Sep 26;23(9):e3003404", "👉 Maternal food-derived signals oscillate in the fetal suprachiasmatic nucleus: No clear dose/effect/duration found", "41004457"),

                    // Vitamins
                    Reference("Viruses. 2025 Aug 31;17(9):1203", "👉 Vitamin D Status, CMV Seropositivity, and Viral Cytokine Expression: Negative/adverse effect mentioned", "41012631"),
                    Reference("Nutrients. 2025 Sep 18;17(18):2994", "👉 Acceptability of Antenatal Multiple Micronutrient Supplementation (MMS): Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41010519"),
                    Reference("Nutrients. 2025 Sep 18;17(18):2989", "👉 Maternal Folic Acid Supplementation, Perinatal Factors, and Pre-Adolescent Asthma: Positive/therapeutic effect mentioned | week", "41010514"),

                    // Minerals
                    Reference("Environ Res. 2025 Sep 25:122948", "👉 Associations between residential greenness exposure during pregnancy and bone mineral density: Positive/therapeutic effect mentioned", "41015174"),
                    Reference("Toxics. 2025 Sep 17;13(9):787", "👉 Synergy of Arsenic and Graphene Oxide in Utero and Lactation: mg | Negative/adverse effect mentioned", "41012408"),
                    Reference("Toxics. 2025 Sep 4;13(9):752", "👉 Exposure to Kalach, a Glyphosate-Based Herbicide: Negative/adverse effect mentioned", "41012373"),

                    // Supplements
                    Reference("Toxicon. 2025 Sep 25:108601", "👉 BOTULISM IN PREGNANCY: Negative/adverse effect mentioned", "41015266"),
                    Reference("Nutrients. 2025 Sep 18;17(18):2994", "👉 Acceptability of Antenatal Multiple Micronutrient Supplementation (MMS): Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41010519"),
                    Reference("Nutrients. 2025 Sep 18;17(18):2989", "👉 Maternal Folic Acid Supplementation: Positive/therapeutic effect mentioned | week", "41010514"),

                    // Nutrients
                    Reference("Vet Sci. 2025 Sep 13;12(9):884", "👉 Effects of Maternal Nutrition and One-Carbon Metabolite Supplementation: No clear dose/effect/duration found", "41012809"),
                    Reference("Nutrients. 2025 Sep 18;17(18):2994", "👉 Acceptability of Antenatal Multiple Micronutrient Supplementation (MMS): Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41010519"),
                    Reference("Nutrients. 2025 Sep 18;17(18):2992", "👉 Factors Influencing Exclusive Breastfeeding During the Postpartum Period: week", "41010516")
                )
            )

            "Prostate cancer" -> Pair(
                """
Alternative approaches
1. The comeback of orchiectomy in advanced prostate cancer. Negative/adverse effect mentioned
2. Comparison of platforms for analysis of the tumor microenvironment. No clear dose/effect/duration found
3. Complementary and Alternative Medicine (CAM) Use among Elderly Cancer Patients. No clear dose/effect/duration found

Herbs
1. Chinese medicines as therapeutic options for treating prostate cancer. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Total Flavonoids of Hedyotis Diffusa Willd Suppresses Prostate Cancer Progression. No clear dose/effect/duration found
3. Rapid diagnostic imaging and targeted immunotoxin delivery in aggressive prostate cancer. No clear dose/effect/duration found

Amino acids
1. Selective Formation of Coamorphous Systems with Enzalutamide. No clear dose/effect/duration found
2. Associations between XRCC1-Arg399Gln polymorphism and the risk of prostate cancer. G,G
3. Fueling Prostate Cancer. No clear dose/effect/duration found

Vitamins
1. Alpha-N-acetylgalactosaminidase in cancer. No clear dose/effect/duration found
2. Vitamin D-induced mechanisms in cancer prevention and therapy. Positive/therapeutic effect mentioned
3. Development of BMX siRNA lipid nanoparticles for cancer therapy. No clear dose/effect/duration found

Minerals
1. Bone microarchitecture and strength in men with prostate cancer. Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Temperature Abetted Synthesis of Zeolitic Imidazolate Framework-Derived 3D Zn@N-C. Positive/therapeutic effect mentioned
3. The microstructure of metastatic bone lesions. No clear dose/effect/duration found

Supplements
1. Gut Microbiota-Bile Acid-Brain Axis and TGR5-ERK1/2 Signaling. Positive/therapeutic effect mentioned
2. Lung Health Check pilot. Positive/therapeutic effect mentioned
3. Morphologic and clinical spectrum of large gland lesions of the prostate. No clear dose/effect/duration found

Nutrients
1. Antioxidant and pro-oxidant dietary consumption patterns. Positive/therapeutic effect mentioned
2. Serum neopterin and kynurenine as predictive and prognostic biomarkers. No clear dose/effect/duration found
3. Caloric Restriction Enhances the Efficacy of Anti-Androgen Therapy in Prostate Cancer. Positive/therapeutic effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Urol Oncol. 2025 Sep 25:S1078-1439(25)00338-2", "👉 The comeback of orchiectomy in advanced prostate cancer: Negative/adverse effect mentioned", "41006131"),
                    Reference("Lab Invest. 2025 Sep 24:104246", "👉 Comparison of QuPath and HALO platforms for analysis of the tumor microenvironment: No clear dose/effect/duration found", "41005710"),
                    Reference("Res Sq [Preprint]. 2025 Sep 19:rs.3.rs-7605426", "👉 Complementary and Alternative Medicine (CAM) Use among Elderly Cancer Patients: No clear dose/effect/duration found", "41001551"),

                    // Herbs
                    Reference("J Ethnopharmacol. 2025 Aug 27;354:120471", "👉 Chinese medicines as therapeutic options for treating prostate cancer: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40882785"),
                    Reference("Cell Biol Int. 2025 Aug 27", "👉 Total Flavonoids of Hedyotis Diffusa Willd Suppresses Prostate Cancer Progression: No clear dose/effect/duration found", "40862474"),
                    Reference("J Nanobiotechnology. 2025 Jul 18;23(1):525", "👉 Rapid diagnostic imaging and targeted immunotoxin delivery in aggressive prostate cancer: No clear dose/effect/duration found", "40682047"),

                    // Amino acids
                    Reference("Eur J Pharm Sci. 2025 Sep 19:107281", "👉 Selective Formation of Coamorphous Systems with Enzalutamide: No clear dose/effect/duration found", "40976375"),
                    Reference("Amino Acids. 2025 Sep 18;57(1):46", "👉 Associations between XRCC1-Arg399Gln polymorphism and the risk of prostate cancer: G,G", "40963005"),
                    Reference("Asian Pac J Cancer Prev. 2025 Sep 1;26(9):3157-3174", "👉 Fueling Prostate Cancer: No clear dose/effect/duration found", "40952270"),

                    // Vitamins
                    Reference("Int J Physiol Pathophysiol Pharmacol. 2025 Aug 25;17(4):104-115", "👉 Alpha-N-acetylgalactosaminidase in cancer: No clear dose/effect/duration found", "40994616"),
                    Reference("Animal Model Exp Med. 2025 Sep 23", "👉 Vitamin D-induced mechanisms in cancer prevention and therapy: Positive/therapeutic effect mentioned", "40985271"),
                    Reference("Int J Pharm. 2025 Sep 15;684:126183", "👉 Development of BMX siRNA lipid nanoparticles for cancer therapy: No clear dose/effect/duration found", "40962081"),

                    // Minerals
                    Reference("Bone. 2025 Sep 11;201:117643", "👉 Bone microarchitecture and strength in men with prostate cancer: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40945813"),
                    Reference("ACS Appl Mater Interfaces. 2025 Sep 24;17(38):53081-53095", "👉 Temperature Abetted Synthesis of Zeolitic Imidazolate Framework-Derived 3D Zn@N-C: μg", "40934070"),
                    Reference("Bone. 2025 Sep 4;201:117625", "👉 The microstructure of metastatic bone lesions: No clear dose/effect/duration found", "40914232"),

                    // Supplements
                    Reference("CNS Neurosci Ther. 2025 Sep;31(9):e70608", "👉 Gut Microbiota-Bile Acid-Brain Axis and TGR5-ERK1/2 Signaling: Positive/therapeutic effect mentioned", "40955046"),
                    Reference("BMJ Open Respir Res. 2025 Sep 10;12(1):e003035", "👉 Lung Health Check pilot: Positive/therapeutic effect mentioned | month", "40935563"),
                    Reference("Pathologie (Heidelb). 2025 Aug 29", "👉 Morphologic and clinical spectrum of large gland lesions of the prostate: No clear dose/effect/duration found", "40879739"),

                    // Nutrients
                    Reference("Br J Nutr. 2025 Sep 3:1-10", "👉 Antioxidant and pro-oxidant dietary consumption patterns: Positive/therapeutic effect mentioned", "40898910"),
                    Reference("BMC Cancer. 2025 Aug 28;25(1):1395", "👉 Serum neopterin and kynurenine as predictive and prognostic biomarkers: No clear dose/effect/duration found", "40877809"),
                    Reference("Cancer Res. 2025 Aug 8", "👉 Caloric Restriction Enhances the Efficacy of Anti-Androgen Therapy in Prostate Cancer: Positive/therapeutic effect mentioned", "40779415")
                )
            )

            "Psoriasis" -> Pair(
                """
Alternative approaches
1. Int J Mol Sci – Advances in Psoriasis Research: No clear dose/effect/duration found
2. Adv Sci (Weinh) – Vinburnine Sensitizes Radiotherapy Efficacy: Negative/adverse effect mentioned
3. RMD Open – Serum calprotectin and complement factor C3 as biomarkers: Positive/therapeutic effect mentioned

Herbs
1. Pharmaceutics – Anti-Psoriatic Material Basis of Dictamni Cortex: Positive/therapeutic effect; Negative/adverse effect mentioned
2. ACS Appl Mater Interfaces – Nano-Tetrandrine for Psoriasis: Positive/therapeutic effect; Negative/adverse effect mentioned
3. Front Chem – MicroRNA-31 inhibition of keratin 6 by PSORI-CM01: Positive/therapeutic effect

Amino acids
1. Photodiagnosis Photodyn Ther – Combined surgical excision with photodynamic therapy: Positive/therapeutic effect
2. Clin Rev Allergy Immunol – The Role of Solute Carriers in Skin Diseases: No clear dose/effect/duration found
3. Adv Sci (Weinh) – Arginine Metabolic Disruption Impairs Hair Regeneration: No clear dose/effect/duration found

Vitamins
1. RMD Open – Active vitamin D as adjuvant to anti-TNFα: No clear dose/effect/duration found
2. Arch Rheumatol – Psoriatic Arthritis and Sarcopenia study: No clear dose/effect/duration found
3. J Am Chem Soc – Strain-Promoted mRNA Transdermal Delivery: Positive/therapeutic effect; Negative/adverse effect mentioned

Minerals
1. RMD Open – METHOFRACT multicentre cohort study: Positive/therapeutic effect
2. Life (Basel) – Multimodal Approach to Severe Psoriasis Vulgaris: Positive/therapeutic effect
3. Nanomedicine (Lond) – Selenium-based nanomedicines: Positive/therapeutic effect

Supplements
1. Int J Mol Sci – Epigallocatechin-Gallate (EGCG): Positive/therapeutic effect
2. Dermatol Ther – Systematic Literature Reviews on Pediatric Psoriasis: Positive/therapeutic effect
3. Psoriasis (Auckl) – Plasma Fatty Acid Profiles and Psoriasis Risk: Positive/therapeutic effect

Nutrients
1. Int J Mol Sci – Skin Microbiota in Facial Dermatoses: Positive/therapeutic effect
2. Mater Today Bio – Nanomedicine strategy targeting metabolism and oxidative stress: Positive/therapeutic effect
3. J Trace Elem Med Biol – Trace elements for skin health: Positive/therapeutic effect; Negative/adverse effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Int J Mol Sci. 2025 Sep 21;26(18):9233", "👉 Advances in Psoriasis Research: No clear dose/effect/duration found", "41009795"),
                    Reference("Adv Sci (Weinh). 2025 Sep 25:e06139", "👉 Vinburnine Sensitizes Radiotherapy Efficacy: Negative/adverse effect mentioned", "40995667"),
                    Reference("RMD Open. 2025 Sep 23;11(3):e006019", "👉 Serum calprotectin and complement factor C3 as biomarkers: µg, g | Positive/therapeutic effect mentioned", "40992787"),

                    // Herbs
                    Reference("Pharmaceutics. 2025 Sep 14;17(9):1195", "👉 Anti-Psoriatic Pharmacodynamic Material Basis of Dictamni Cortex: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41012530"),
                    Reference("ACS Appl Mater Interfaces. 2025 Sep 10;17(36):50490-50504", "👉 Carrier-free Nano-Tetrandrine (PURE-T) for Psoriasis Treatment: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40854248"),
                    Reference("Front Chem. 2025 Jul 18;13:1636529", "👉 MicroRNA-31 mediated inhibition of keratin 6 by PSORI-CM01: Positive/therapeutic effect mentioned", "40756706"),

                    // Amino acids
                    Reference("Photodiagnosis Photodyn Ther. 2025 Oct;55:104778", "👉 Combined surgical excision with photodynamic therapy: Positive/therapeutic effect mentioned", "40854351"),
                    Reference("Clin Rev Allergy Immunol. 2025 Aug 13;68(1):80", "👉 The Role of Solute Carriers in Skin Diseases: No clear dose/effect/duration found", "40796987"),
                    Reference("Adv Sci (Weinh). 2025 Aug 7:e04579", "👉 Arginine Metabolic Disruption Impairs Hair Regeneration: No clear dose/effect/duration found", "40776528"),

                    // Vitamins
                    Reference("RMD Open. 2025 Sep 18;11(3):e005547", "👉 Active vitamin D as adjuvant to anti-TNFα treatment: No clear dose/effect/duration found", "40973226"),
                    Reference("Arch Rheumatol. 2025 Sep 1;40(3):315-322", "👉 Psoriatic Arthritis and Sarcopenia study: No clear dose/effect/duration found", "40965087"),
                    Reference("J Am Chem Soc. 2025 Sep 24;147(38):34449-34465", "👉 Strain-Promoted mRNA Transdermal Delivery: g | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40947594"),

                    // Minerals
                    Reference("RMD Open. 2025 Sep 25;11(3):e005941", "👉 METHOFRACT multicentre cohort study: Positive/therapeutic effect mentioned", "40998522"),
                    Reference("Life (Basel). 2025 Jul 25;15(8):1186", "👉 Multimodal Approach to Severe Psoriasis Vulgaris: Positive/therapeutic effect mentioned", "40868834"),
                    Reference("Nanomedicine (Lond). 2025 Sep;20(17):2257-2274", "👉 Advances in selenium-based nanomedicines: Positive/therapeutic effect mentioned", "40765417"),

                    // Supplements
                    Reference("Int J Mol Sci. 2025 Sep 22;26(18):9253", "👉 Epigallocatechin-Gallate (EGCG): Positive/therapeutic effect mentioned", "41009815"),
                    Reference("Dermatol Ther (Heidelb). 2025 Sep 12", "👉 Systematic Literature Reviews on Pediatric Psoriasis: Positive/therapeutic effect mentioned", "40938518"),
                    Reference("Psoriasis (Auckl). 2025 Aug 16;15:389-399", "👉 Plasma Fatty Acid Profiles and Psoriasis Risk: Positive/therapeutic effect mentioned", "40843457"),

                    // Nutrients
                    Reference("Int J Mol Sci. 2025 Sep 11;26(18):8857", "👉 Skin Microbiota in Facial Dermatoses: Positive/therapeutic effect mentioned", "41009424"),
                    Reference("Mater Today Bio. 2025 May 23;32:101887", "👉 Nanomedicine strategy targeting metabolism and oxidative stress: Positive/therapeutic effect mentioned", "40520564"),
                    Reference("J Trace Elem Med Biol. 2025 Jun;89:127674", "👉 Trace elements for skin health: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40460725")
                )
            )

            "Pulmonary embolism" -> Pair(
                """
Alternative approaches
1. Int J Mol Sci – The Right Approach: No clear dose/effect/duration found
2. Surgery – Postoperative pulmonary embolism cohort: Positive/therapeutic effect
3. Lancet Public Health – Drug shortages network cohort study: Positive/therapeutic effect

Herbs
1. EPMA J – Antithrombotic and antiplatelet effects of plant-derived compounds: Positive/therapeutic effect
2. Am J Chin Med – Neuraminidase 1 inhibitors from Chinese Herbal Medicines: No clear dose/effect/duration found
3. J Ethnopharmacol – Antithrombotic effects of Danggui, Honghua: No clear dose/effect/duration found

Amino acids
1. Rev Esp Enferm Dig – Neurogenic megacolon: No clear dose/effect/duration found
2. Indian J Med Res – Cardiovascular safety of gabapentinoids: No clear dose/effect/duration found
3. BMJ Case Rep – Heparin-induced thrombocytopenia and thrombosis: No clear dose/effect/duration found

Vitamins
1. Thromb Haemost – Venous Thromboembolism in Hemodialysis: Positive/therapeutic effect
2. J Clin Med – Early Rehabilitation in Acute Pulmonary Embolism: Positive/therapeutic effect; Negative/adverse effect mentioned
3. Res Pract Thromb Haemost – Pediatric high/intermediate-risk PE: Positive/therapeutic effect

Minerals
1. J Biomater Appl – Injectable bone cement study: Positive/therapeutic effect
2. J Vet Emerg Crit Care – Hemothorax secondary to aneurysmal rupture: No clear dose/effect/duration found
3. J Shoulder Elbow Surg – Shoulder arthroplasty complications in osteoporosis: Positive/therapeutic effect

Supplements
1. JACC Case Rep – Kratom-Associated Acute RV Dysfunction: Negative/adverse effect mentioned
2. Semin Thromb Hemost – Present-on-Admission Indicators for PE identification: Positive/therapeutic effect
3. Trials – Postoperative Thromboprophylaxis in Cushing's Disease: Positive/therapeutic effect

Nutrients
1. J Clin Med – Anticoagulation Management: Positive/therapeutic effect
2. Front Nutr – Nutritional therapy for MRSA sepsis with PE: Positive/therapeutic effect
3. Clin Nutr ESPEN – Lactobacillus bacteremia in parenteral nutrition: No clear dose/effect/duration found
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Int J Mol Sci. 2025 Sep 17;26(18):9064", "👉 The Right Approach: No clear dose/effect/duration found", "41009628"),
                    Reference("Surgery. 2025 Sep 24;188:109726", "👉 Postoperative pulmonary embolism cohort: Positive/therapeutic effect mentioned | day", "40997616"),
                    Reference("Lancet Public Health. 2025 Oct;10(10):e835-e847", "👉 Drug shortages network cohort study: mg | Positive/therapeutic effect mentioned | day", "40992879"),

                    // Herbs
                    Reference("EPMA J. 2022 Aug 15;13(3):407-431", "👉 Antithrombotic and antiplatelet effects of plant-derived compounds: Positive/therapeutic effect mentioned", "35990779"),
                    Reference("Am J Chin Med. 2021;49(4):843-862", "👉 Neuraminidase 1 inhibitors from Chinese Herbal Medicines: No clear dose/effect/duration found", "33827385"),
                    Reference("J Ethnopharmacol. 2010 Apr 21;128(3):623-8", "👉 Antithrombotic effects of Danggui, Honghua: No clear dose/effect/duration found", "20176099"),

                    // Amino acids
                    Reference("Rev Esp Enferm Dig. 2025 Jul 30", "👉 Neurogenic megacolon: No clear dose/effect/duration found", "40737268"),
                    Reference("Indian J Med Res. 2025 Apr;161(4):363-374", "👉 Cardiovascular safety of gabapentinoids: No clear dose/effect/duration found", "40536375"),
                    Reference("BMJ Case Rep. 2025 May 22;18(5):e264427", "👉 Heparin-induced thrombocytopenia and thrombosis: No clear dose/effect/duration found", "40409773"),

                    // Vitamins
                    Reference("Thromb Haemost. 2025 Sep 24", "👉 Venous Thromboembolism in Hemodialysis: Positive/therapeutic effect mentioned | month", "40992408"),
                    Reference("J Clin Med. 2025 Sep 3;14(17):6230", "👉 Early Rehabilitation in Acute Pulmonary Embolism: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40943985"),
                    Reference("Res Pract Thromb Haemost. 2025 Jul 16;9(6):102972", "👉 Pediatric high/intermediate-risk PE: Positive/therapeutic effect mentioned", "40917545"),

                    // Minerals
                    Reference("J Biomater Appl. 2025 Oct;40(4):547-559", "👉 Injectable bone cement study: Positive/therapeutic effect mentioned", "40682355"),
                    Reference("J Vet Emerg Crit Care (San Antonio). 2025 Mar-Apr;35(2):171-175", "👉 Hemothorax secondary to aneurysmal rupture: No clear dose/effect/duration found", "40127416"),
                    Reference("J Shoulder Elbow Surg. 2025 Jun;34(6):e355-e360", "👉 Shoulder arthroplasty complications in osteoporosis: Positive/therapeutic effect mentioned | day", "39384014"),

                    // Supplements
                    Reference("JACC Case Rep. 2025 Jul 23;30(20):104206", "👉 Kratom-Associated Acute RV Dysfunction: Negative/adverse effect mentioned", "40713117"),
                    Reference("Semin Thromb Hemost. 2025 Oct;51(7):829-833", "👉 Present-on-Admission Indicators for PE identification: Positive/therapeutic effect mentioned", "40555267"),
                    Reference("Trials. 2025 Jun 21;26(1):217", "👉 Postoperative Thromboprophylaxis in Cushing's Disease: Positive/therapeutic effect mentioned | week", "40544300"),

                    // Nutrients
                    Reference("J Clin Med. 2025 Feb 28;14(5):1647", "👉 Anticoagulation Management: Positive/therapeutic effect mentioned", "40095578"),
                    Reference("Front Nutr. 2025 Feb 19;12:1484012", "👉 Nutritional therapy for MRSA sepsis with PE: Positive/therapeutic effect mentioned", "40046762"),
                    Reference("Clin Nutr ESPEN. 2024 Apr;60:281-284", "👉 Lactobacillus bacteremia in parenteral nutrition: No clear dose/effect/duration found", "38479922")
                )
            )

            "Raynaud's disease" -> Pair(
                """
Alternative approaches
1. Cureus – UV-A1 Phototherapy Treatment on Scleroderma: Positive/therapeutic effect; Negative/adverse effect mentioned
2. Curr Rev Clin Exp Pharmacol – Interferon Causes Endothelial Injury: Positive/therapeutic effect
3. NMR Biomed – Magnetic Inclusions in the Subcortex: No clear dose/effect/duration found

Herbs
1. Intern Med – Chinese herbs in CREST syndrome: Positive/therapeutic effect

Amino acids
1. Nat Commun – WNK1 signalling & amino acid transport: Positive/therapeutic effect
2. Int J Mol Sci – Twendee X® as antioxidant treatment for Systemic Sclerosis: Positive/therapeutic effect; Negative/adverse effect mentioned
3. Rev Med Interne – Paroxysmal vascular acrosyndromes: No clear dose/effect/duration found

Vitamins
1. FEBS Open Bio – Gut alterations in CKD rat model: Positive/therapeutic effect
2. Int J Mol Sci – Twendee X® antioxidant treatment: Positive/therapeutic effect; Negative/adverse effect mentioned
3. Clin Cancer Res – Phase I trial of CT900: Positive/therapeutic effect; Negative/adverse effect mentioned

Minerals
1. BMJ Case Rep – Systemic sclerosis with silica dust exposure: No clear dose/effect/duration found
2. Am J Case Rep – Erasmus Syndrome case report: Positive/therapeutic effect
3. Biomedicines – Endocan and progenitor cells in SSc: Positive/therapeutic effect

Supplements
1. Nutrients – L-Carnitine in psychiatric & neurological manifestations: No clear dose/effect/duration found
2. Int J Mol Sci – Twendee X® antioxidant treatment: Positive/therapeutic effect; Negative/adverse effect mentioned
3. Diagnostics (Basel) – Nailfold Capillaroscopy for ANCA Vasculitis: No clear dose/effect/duration found

Nutrients
1. Nutrients – L-Carnitine: No clear dose/effect/duration found
2. Nutrients – Cafeteria Diet-Induced Obesity in Experimental CKD: No clear dose/effect/duration found
3. JPEN J Parenter Enteral Nutr – Parenteral nutrition patient with trace element shortage
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Cureus. 2025 Apr 24;17(4):e82899", "👉 UV-A1 Phototherapy Treatment on Scleroderma: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40416150"),
                    Reference("Curr Rev Clin Exp Pharmacol. 2025;20(2):122-139", "👉 Interferon Causes Endothelial Injury: Positive/therapeutic effect mentioned", "40326264"),
                    Reference("NMR Biomed. 2025 Jun;38(6):e70051", "👉 Magnetic Inclusions in the Subcortex: No clear dose/effect/duration found", "40325973"),

                    // Herbs
                    Reference("Intern Med. 2001 Oct;40(10):1059-63", "👉 Chinese herbs in CREST syndrome: Positive/therapeutic effect mentioned", "11688835"),

                    // Amino acids
                    Reference("Nat Commun. 2025 May 27;16(1):4920", "👉 WNK1 signalling & amino acid transport: Positive/therapeutic effect mentioned", "40425534"),
                    Reference("Int J Mol Sci. 2024 Mar 6;25(5):3064", "👉 Twendee X® as antioxidant treatment for Systemic Sclerosis: g | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "38474309"),
                    Reference("Rev Med Interne. 2022 Oct;43(10):596-602", "👉 Paroxysmal vascular acrosyndromes: No clear dose/effect/duration found", "35835622"),

                    // Vitamins
                    Reference("FEBS Open Bio. 2025 Aug;15(8):1219-1231", "👉 Gut alterations in CKD rat model: Positive/therapeutic effect mentioned", "40526091"),
                    Reference("Int J Mol Sci. 2024 Mar 6;25(5):3064", "👉 Twendee X® as antioxidant treatment: g | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "38474309"),
                    Reference("Clin Cancer Res. 2022 Nov 1;28(21):4634-4641", "👉 Phase I trial of CT900: mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week", "35984704"),

                    // Minerals
                    Reference("BMJ Case Rep. 2025 Aug 19;18(8):e264237", "👉 Systemic sclerosis with silica dust exposure: No clear dose/effect/duration found", "40835242"),
                    Reference("Am J Case Rep. 2022 Aug 10;23:e937061", "👉 Erasmus Syndrome case report: Positive/therapeutic effect mentioned | month", "35947536"),
                    Reference("Biomedicines. 2021 May 11;9(5):533", "👉 Endocan and progenitor cells in SSc: Positive/therapeutic effect mentioned", "34064667"),

                    // Supplements
                    Reference("Nutrients. 2024 Apr 20;16(8):1232", "👉 L-Carnitine in psychiatric & neurological manifestations: No clear dose/effect/duration found", "38674921"),
                    Reference("Int J Mol Sci. 2024 Mar 6;25(5):3064", "👉 Twendee X® antioxidant treatment: g | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "38474309"),
                    Reference("Diagnostics (Basel). 2024 Jan 24;14(3):254", "👉 Nailfold Capillaroscopy for ANCA Vasculitis: No clear dose/effect/duration found", "38337770"),

                    // Nutrients
                    Reference("Nutrients. 2024 Apr 20;16(8):1232", "👉 L-Carnitine: No clear dose/effect/duration found", "38674921"),
                    Reference("Nutrients. 2023 Jul 26;15(15):3331", "👉 Cafeteria Diet-Induced Obesity in Experimental CKD: No clear dose/effect/duration found", "37571269"),
                    Reference("JPEN J Parenter Enteral Nutr. 2013 May-Jun;37(3):425-9", "👉 Parenteral nutrition patient with trace element shortage: month", "23070133")
                )
            )

            "Rheumatoid arthritis" -> Pair(
                """
Alternative approaches
1. Medicina (Kaunas) – Chinese Herbal Medicines for Sjögren's Syndrome Patients: Positive/therapeutic effect
2. J Pharm Biomed Anal – Electrochemical sensor for baricitinib detection: Positive/therapeutic effect
3. Inflammopharmacology – Preclinical efficacy of naringenin: Positive/therapeutic effect; Negative/adverse effect mentioned

Herbs
1. Phytomedicine – Phytotherapy as adjunct for RA: Positive/therapeutic effect; Negative/adverse effect mentioned
2. Nutrients – Nutritional intervention for Sjögren Disease: Positive/therapeutic effect
3. Am J Chin Med – Anti-inflammatory effects of bioactive peptides: Negative/adverse effect mentioned

Amino acids
1. J Tradit Chin Med – Acupuncture & central amino acid metabolism: Positive/therapeutic effect
2. Int J Mol Sci – Structural study of peptide epitope: No clear dose/effect/duration found
3. Front Cell Dev Biol – Glutamine synthase inhibition by sinomenine hydrochloride: Positive/therapeutic effect

Vitamins
1. Nutrients – Nutritional intervention for Sjögren Disease: Positive/therapeutic effect
2. Int J Rheum Dis – Vitamin D Status in Paraguayan Children: No clear dose/effect/duration found
3. Genes (Basel) – Vitamin D metabolism genetic variants & RA: No clear dose/effect/duration found

Minerals
1. Ann Med – iTr35 cells in RA & bone loss: Positive/therapeutic effect
2. RMD Open – METHOFRACT methotrexate osteopathy cohort: Positive/therapeutic effect
3. Front Endocrinol (Lausanne) – Age trend & height loss risk factors: Positive/therapeutic effect

Supplements
1. Dtsch Arztebl Int – Pulmonary involvement in autoimmune-mediated disease: No clear dose/effect/duration found
2. Neuromolecular Med – Gut microbiota in immune signaling: No clear dose/effect/duration found
3. Medicine (Baltimore) – Coffee intake & bone health MR study: No clear dose/effect/duration found

Nutrients
1. Nutrients – Nutritional intervention for Sjögren Disease: Positive/therapeutic effect
2. Eur J Immunol – Aberrant nutrient metabolism in T cells: No clear dose/effect/duration found
3. Nutrients – Gentianaceae-derived bioactive compounds: Positive/therapeutic effect
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Medicina (Kaunas). 2025 Aug 27;61(9):1537", "👉 Chinese Herbal Medicines for Sjögren's Syndrome Patients: Positive/therapeutic effect mentioned | day", "41010928"),
                    Reference("J Pharm Biomed Anal. 2025 Sep 22;267:117154", "👉 Electrochemical sensor for baricitinib detection: Positive/therapeutic effect mentioned", "40997477"),
                    Reference("Inflammopharmacology. 2025 Sep 25", "👉 Preclinical efficacy of naringenin: g | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40996618"),

                    // Herbs
                    Reference("Phytomedicine. 2025 Sep 19;148:157285", "👉 Phytotherapy as adjunct for RA: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41005054"),
                    Reference("Nutrients. 2025 Aug 25;17(17):2743", "👉 Nutritional intervention for Sjögren Disease: Positive/therapeutic effect mentioned", "40944134"),
                    Reference("Am J Chin Med. 2025;53(7):1951-1982", "👉 Anti-inflammatory effects of bioactive peptides: Negative/adverse effect mentioned", "40905225"),

                    // Amino acids
                    Reference("J Tradit Chin Med. 2025 Oct;45(5):1019-1027", "👉 Acupuncture & central amino acid metabolism: Positive/therapeutic effect mentioned", "41015800"),
                    Reference("Int J Mol Sci. 2025 Sep 16;26(18):9026", "👉 Structural study of peptide epitope: No clear dose/effect/duration found", "41009593"),
                    Reference("Front Cell Dev Biol. 2025 Sep 3;13:1658089", "👉 Glutamine synthase inhibition by sinomenine hydrochloride: mg | Positive/therapeutic effect mentioned", "40970093"),

                    // Vitamins
                    Reference("Nutrients. 2025 Aug 25;17(17):2743", "👉 Nutritional intervention for Sjögren Disease: Positive/therapeutic effect mentioned", "40944134"),
                    Reference("Int J Rheum Dis. 2025 Sep;28(9):e70408", "👉 Vitamin D Status in Paraguayan Children: No clear dose/effect/duration found", "40908722"),
                    Reference("Genes (Basel). 2025 Aug 18;16(8):967", "👉 Vitamin D metabolism genetic variants & RA: No clear dose/effect/duration found", "40870018"),

                    // Minerals
                    Reference("Ann Med. 2025 Dec;57(1):2565438", "👉 iTr35 cells in RA & bone loss: Positive/therapeutic effect mentioned", "40999896"),
                    Reference("RMD Open. 2025 Sep 25;11(3):e005941", "👉 METHOFRACT methotrexate osteopathy cohort: Positive/therapeutic effect mentioned", "40998522"),
                    Reference("Front Endocrinol (Lausanne). 2025 Sep 8;16:1542962", "👉 Age trend & height loss risk factors: Positive/therapeutic effect mentioned", "40989120"),

                    // Supplements
                    Reference("Dtsch Arztebl Int. 2025 Dec 12", "👉 Pulmonary involvement in autoimmune-mediated disease: No clear dose/effect/duration found", "40991358"),
                    Reference("Neuromolecular Med. 2025 Sep 17;27(1):65", "👉 Gut microbiota in immune signaling: No clear dose/effect/duration found", "40963074"),
                    Reference("Medicine (Baltimore). 2025 Sep 12;104(37):e44533", "👉 Coffee intake & bone health MR study: No clear dose/effect/duration found", "40958293"),

                    // Nutrients
                    Reference("Nutrients. 2025 Aug 25;17(17):2743", "👉 Nutritional intervention for Sjögren Disease: Positive/therapeutic effect mentioned", "40944134"),
                    Reference("Eur J Immunol. 2025 Sep;55(9):e70059", "👉 Aberrant nutrient metabolism in T cells: No clear dose/effect/duration found", "40936324"),
                    Reference("Nutrients. 2025 Aug 13;17(16):2619", "👉 Gentianaceae-derived bioactive compounds: Positive/therapeutic effect mentioned", "40871648")
                )
            )

            "Ringworm" -> Pair(
                """
Alternative approaches
1. Alternative splicing in Trichophyton rubrum: g | g
2. Specific primers & nested PCR for T. rubrum: No clear dose/effect/duration found
3. Diagnosis & assessment of psoriasis workshop: No clear dose/effect/duration found

Herbs
1. Ethnobotanical study of medicinal plants in Kenya: Positive/therapeutic effect mentioned
2. Genus Mimosa pharmacology review: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Traditional medicinal plants in Ethiopia: No clear dose/effect/duration found

Amino acids
1. Antimicrobial photodynamic therapy in onychomycosis: Positive/therapeutic effect mentioned
2. 5-aminolevulinic acid photodynamic therapy: Negative/adverse effect mentioned
3. Terbinafine resistance & squalene epoxidase modelling: No clear dose/effect/duration found

Vitamins
1. Calcipotriol vs terbinafine cream: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month
2. Drug-resistance genes & antifungal susceptibility: µg | Positive/therapeutic effect mentioned | month
3. Huangqin decoction against T. rubrum: mg | mg

Minerals
1. Raman spectroscopy of fingernails: Positive/therapeutic effect mentioned
2. Novel polyvalent dermatophytes vaccine: g | day
3. Unani pharmacopoeial formulations in dermatophytosis: mg | Positive/therapeutic effect mentioned | week

Supplements
1. Tinea capitis prospective study: No clear dose/effect/duration found
2. Pityriasis versicolor: No clear dose/effect/duration found
3. Interdigital & plantar foot infections: No clear dose/effect/duration found

Nutrients
1. Comparative genomic analysis of human skin fungi: Positive/therapeutic effect mentioned
2. Medium for mass sporulation of T. rubrum: Positive/therapeutic effect mentioned | day
3. Trace-elements upregulation of proteases in T. rubrum: No clear dose/effect/duration found
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Front Cell Infect Microbiol. 2025 Sep 10;15:1645525", "👉 Alternative splicing in Trichophyton rubrum: g | g", "41001418"),
                    Reference("J Fungi (Basel). 2025 Jul 14;11(7):520", "👉 Specific primers & nested PCR for T. rubrum: No clear dose/effect/duration found", "40985411"),
                    Reference("J Rheumatol. 2025 Sep 1", "👉 Diagnosis & assessment of psoriasis workshop: No clear dose/effect/duration found", "40890002"),

                    // Herbs
                    Reference("Front Pharmacol. 2024 Jan 19;14:1328903", "👉 Ethnobotanical study of medicinal plants in Kenya: Positive/therapeutic effect mentioned", "38313073"),
                    Reference("Biomolecules. 2022 Jan 5;12(1):83", "👉 Genus Mimosa pharmacology review: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "35053231"),
                    Reference("J Exp Pharmacol. 2021 Aug 16;13:807-815", "👉 Traditional medicinal plants in Ethiopia: No clear dose/effect/duration found", "34429665"),

                    // Amino acids
                    Reference("Photodiagnosis Photodyn Ther. 2025 Aug;54:104640", "👉 Antimicrobial photodynamic therapy in onychomycosis: Positive/therapeutic effect mentioned", "40389084"),
                    Reference("Photodiagnosis Photodyn Ther. 2025 Jun;53:104599", "👉 5-aminolevulinic acid photodynamic therapy: Negative/adverse effect mentioned", "40258452"),
                    Reference("Mycoses. 2024 Sep;67(9):e13795", "👉 Terbinafine resistance & squalene epoxidase modelling: No clear dose/effect/duration found", "39304967"),

                    // Vitamins
                    Reference("Arch Dermatol Res. 2025 Feb 14;317(1):402", "👉 Calcipotriol vs terbinafine cream: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month", "39951153"),
                    Reference("Med Mycol. 2025 Jan 25;63(2):myae124", "👉 Drug-resistance genes & antifungal susceptibility: µg | Positive/therapeutic effect mentioned | month", "39900467"),
                    Reference("J Med Microbiol. 2024 Feb;73(2)", "👉 Huangqin decoction against T. rubrum: mg | mg", "38348868"),

                    // Minerals
                    Reference("Medicina (Kaunas). 2024 Aug 9;60(8):1283", "👉 Raman spectroscopy of fingernails: Positive/therapeutic effect mentioned", "39202564"),
                    Reference("Sci Rep. 2023 Jan 4;13(1):157", "👉 Novel polyvalent dermatophytes vaccine: g | day", "36599863"),
                    Reference("Drug Metab Pers Ther. 2022 Aug 24;38(2):169-177", "👉 Unani pharmacopoeial formulations in dermatophytosis: mg | Positive/therapeutic effect mentioned | week", "36194619"),

                    // Supplements
                    Reference("Front Cell Infect Microbiol. 2025 Jun 23;15:1590315", "👉 Tinea capitis prospective study: No clear dose/effect/duration found", "40625830"),
                    Reference("Ugeskr Laeger. 2025 Mar 31;187(14):V10240670", "👉 Pityriasis versicolor [Danish]: No clear dose/effect/duration found", "40171908"),
                    Reference("Microorganisms. 2025 Jan 16;13(1):184", "👉 Interdigital & plantar foot infections: No clear dose/effect/duration found", "39858952"),

                    // Nutrients
                    Reference("Res Sq [Preprint]. 2025 Jun 11", "👉 Comparative genomic analysis of human skin fungi: Positive/therapeutic effect mentioned", "40585268"),
                    Reference("Mycoses. 2025 Mar;68(3):e70039", "👉 Medium for mass sporulation of T. rubrum: Positive/therapeutic effect mentioned | day", "40050125"),
                    Reference("J Trace Elem Med Biol. 2025 Feb;87:127580", "👉 Trace-elements upregulation of proteases in T. rubrum: No clear dose/effect/duration found", "39673825")
                )
            )

            "Rosacea" -> Pair(
                """
Alternative approaches
1. Cannabidiol as therapeutic agent: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Intense Pulsed Light & Radio Frequency therapy: Positive/therapeutic effect mentioned
3. Marginal zone lymphoma masquerading as phymatous rosacea: Positive/therapeutic effect mentioned

Herbs
1. Traditional Chinese medicine solutions: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Safety of traditional medicinal plants during pregnancy: Negative/adverse effect mentioned
3. Botanical therapies systematic review: Positive/therapeutic effect mentioned

Amino acids
1. N-Lactoyl amino acids biomarkers: No clear dose/effect/duration found
2. Botulinic neuroprotein + hyaluronic acid + amino acids injection: Positive/therapeutic effect mentioned
3. Trephination + photodynamic therapy case report: Positive/therapeutic effect mentioned

Vitamins
1. Dye laser + Alexandrite laser combination therapy: Positive/therapeutic effect mentioned
2. Skin cancer prevention study: Positive/therapeutic effect mentioned
3. Vitamin D levels in rosacea vs healthy: No clear dose/effect/duration found

Minerals
1. Nemolizumab rapid clinical response: No clear dose/effect/duration found
2. Recurrence induced by compound vitamin tablets: Positive/therapeutic effect mentioned
3. HArmonyCa™ hybrid filler: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month

Supplements
1. Skin microbiome in rosacea: Positive/therapeutic effect mentioned
2. Microbiome modulation review: Positive/therapeutic effect mentioned
3. Microbiome-based products review: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Nutrients
1. Skin microbiota in facial dermatoses: Positive/therapeutic effect mentioned
2. Probiotics and diet in rosacea: Positive/therapeutic effect mentioned
3. Oral botanical supplement improves SIBO & facial redness: Positive/therapeutic effect mentioned | week
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("BMB Rep. 2025 Aug;58(8):357-363", "👉 Cannabidiol as therapeutic agent: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40754776"),
                    Reference("J Vis Exp. 2025 Jul 3;(221)", "👉 Intense Pulsed Light & Radio Frequency therapy: Positive/therapeutic effect mentioned", "40690390"),
                    Reference("Skin Health Dis. 2025 Apr 11;5(3):231-235", "👉 Marginal zone lymphoma masquerading as phymatous rosacea: Positive/therapeutic effect mentioned", "40584956"),

                    // Herbs
                    Reference("Harefuah. 2025 Feb;164(2):82-86", "👉 Traditional Chinese medicine solutions: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "39987474"),
                    Reference("Phytother Res. 2021 Apr;35(4):1908-1924", "👉 Safety of traditional medicinal plants during pregnancy: Negative/adverse effect mentioned", "33164294"),
                    Reference("Phytother Res. 2015 Oct;29(10):1439-51", "👉 Botanical therapies systematic review: Positive/therapeutic effect mentioned", "26272329"),

                    // Amino acids
                    Reference("Diabetes Metab Res Rev. 2025 Jul;41(5):e70060", "👉 N-Lactoyl amino acids biomarkers: No clear dose/effect/duration found", "40534243"),
                    Reference("J Clin Aesthet Dermatol. 2024 Dec;17(12):38-41", "👉 Botulinic neuroprotein + hyaluronic acid + amino acids injection: Positive/therapeutic effect mentioned", "39759254"),
                    Reference("Photodiagnosis Photodyn Ther. 2025 Feb;51:104470", "👉 Trephination + photodynamic therapy case report: Positive/therapeutic effect mentioned", "39753195"),

                    // Vitamins
                    Reference("J Dermatol. 2025 Aug 23", "👉 Dye laser + Alexandrite laser combination therapy: Positive/therapeutic effect mentioned", "40847649"),
                    Reference("Front Public Health. 2025 Jun 20;13:1452043", "👉 Skin cancer prevention study: Positive/therapeutic effect mentioned", "40620564"),
                    Reference("J Cosmet Dermatol. 2025 Jun;24(6):e70141", "👉 Vitamin D levels in rosacea vs healthy: No clear dose/effect/duration found", "40492444"),

                    // Minerals
                    Reference("J Am Acad Dermatol. 2025 Aug;93(2):466-468", "👉 Nemolizumab rapid clinical response: No clear dose/effect/duration found", "40122213"),
                    Reference("J Inflamm Res. 2025 Mar 6;18:3311-3319", "👉 Recurrence induced by compound vitamin tablets: Positive/therapeutic effect mentioned", "40065906"),
                    Reference("J Cosmet Dermatol. 2024 Dec;23(12):3883-3892", "👉 HArmonyCa™ hybrid filler: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month", "39360597"),

                    // Supplements
                    Reference("Cutis. 2025 Jul;116(1):20-23", "👉 Skin microbiome in rosacea: Positive/therapeutic effect mentioned", "40875939"),
                    Reference("Microb Pathog. 2025 Nov;208:107940", "👉 Microbiome modulation review: Positive/therapeutic effect mentioned", "40750089"),
                    Reference("Int J Mol Sci. 2025 Jul 14;26(14):6745", "👉 Microbiome-based products review: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40724992"),

                    // Nutrients
                    Reference("Int J Mol Sci. 2025 Sep 11;26(18):8857", "👉 Skin microbiota in facial dermatoses: Positive/therapeutic effect mentioned", "41009424"),
                    Reference("Biomolecules. 2025 Mar 13;15(3):411", "👉 Probiotics and diet in rosacea: Positive/therapeutic effect mentioned", "40149947"),
                    Reference("Nutrients. 2024 Sep 18;16(18):3149", "👉 Oral botanical supplement improves SIBO & facial redness: Positive/therapeutic effect mentioned | week", "39339748")
                )
            )

            "Scabies" -> Pair(
                """
Alternative approaches
1. Clinical practice guidelines Korea: Positive/therapeutic effect mentioned | week
2. Considered second-choice alternative for nursing mothers: No clear dose/effect/duration found
3. Essential oils scabicidal activities: Positive/therapeutic effect mentioned

Herbs
1. Mānuka oil β-triketones potential scabicides: No clear dose/effect/duration found
2. Traditional healers' perception in Ghana: No clear dose/effect/duration found
3. Daphne genkwa vinegar-processed products: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Amino acids
1. Lrp Family Regulator SCAB_Lrp2: No clear dose/effect/duration found
2. Picrasma quassioides extract anti-inflammatory effects: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Recombinant arginine kinases immunomodulatory effects: No clear dose/effect/duration found

Vitamins
1. Irvingia gabonensis (African Mango) therapeutic potential: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Pluchea indica phytoconstituents: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Dehydroascorbic acid effect on enzyme catalysis: g, g

Minerals
1. Dermoscopy-assisted localization: No clear dose/effect/duration found
2. ZnO/CuO nanocomposite acaricidal, immunostimulant, antioxidant: g, mg | Positive/therapeutic effect mentioned | week
3. Probiotic supplementation in Barki sheep mange: Positive/therapeutic effect mentioned | week

Supplements
1. Melatonin restorative potential in severe scabies: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Rabbit farms in Benin: No clear dose/effect/duration found
3. Probiotic supplementation in Barki sheep mange: Positive/therapeutic effect mentioned | week

Nutrients
1. Interactions between scab-inducing strains: Positive/therapeutic effect mentioned
2. Proteomics fingerprinting iron & oxidative stress: g, G
3. 3,7-dihydroxytropolone biosynthesis & anti-phytopathogen activity: No clear dose/effect/duration found

""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Ewha Med J. 2024 Oct;47(4):e72", "👉 Clinical practice guidelines Korea: Positive/therapeutic effect mentioned | week", "40703982"),
                    Reference("Malathion (LactMed® 2006–2025)", "👉 Considered second-choice alternative for nursing mothers: No clear dose/effect/duration found", "29999717"),
                    Reference("BMC Complement Med Ther. 2025 May 22;25(1):185", "👉 Essential oils scabicidal activities: Positive/therapeutic effect mentioned", "40405160"),

                    // Herbs
                    Reference("Phytomedicine. 2025 Jan;136:156321", "👉 Mānuka oil β-triketones potential scabicides: No clear dose/effect/duration found", "39752786"),
                    Reference("Trop Med Int Health. 2024 Jun;29(6):477-488", "👉 Traditional healers' perception in Ghana: No clear dose/effect/duration found", "38599337"),
                    Reference("Molecules. 2023 May 9;28(10):3990", "👉 Daphne genkwa vinegar-processed products: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "37241730"),

                    // Amino acids
                    Reference("Mol Plant Pathol. 2024 Dec;25(12):e70036", "👉 Lrp Family Regulator SCAB_Lrp2: No clear dose/effect/duration found", "39617959"),
                    Reference("J Ethnopharmacol. 2024 Oct 5;332:118374", "👉 Picrasma quassioides extract anti-inflammatory effects: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "38789093"),
                    Reference("Front Immunol. 2022 Nov 14;13:1035729", "👉 Recombinant arginine kinases immunomodulatory effects: No clear dose/effect/duration found", "36451837"),

                    // Vitamins
                    Reference("J Ethnopharmacol. 2024 May 23;326:117942", "👉 Irvingia gabonensis (African Mango) therapeutic potential: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "38395180"),
                    Reference("Molecules. 2022 Apr 7;27(8):2383", "👉 Pluchea indica phytoconstituents: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "35458586"),
                    Reference("FEBS Lett. 2022 Jan;596(1):53-70", "👉 Dehydroascorbic acid effect on enzyme catalysis: g, g", "34845720"),

                    // Minerals
                    Reference("Proc (Bayl Univ Med Cent). 2025 May 8;38(4):582-583", "👉 Dermoscopy-assisted localization: No clear dose/effect/duration found", "40557203"),
                    Reference("Vet Sci. 2025 Apr 4;12(4):333", "👉 ZnO/CuO nanocomposite acaricidal, immunostimulant, antioxidant: g, mg | Positive/therapeutic effect mentioned | week", "40284835"),
                    Reference("Open Vet J. 2025 Feb;15(2):901-910", "👉 Probiotic supplementation in Barki sheep mange: Positive/therapeutic effect mentioned | week", "40201803"),

                    // Supplements
                    Reference("Parasitol Res. 2025 Sep 2;124(9):97", "👉 Melatonin restorative potential in severe scabies: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40890376"),
                    Reference("Trop Anim Health Prod. 2025 Jul 18;57(7):302", "👉 Rabbit farms in Benin: No clear dose/effect/duration found", "40679649"),
                    Reference("Open Vet J. 2025 Feb;15(2):901-910", "👉 Probiotic supplementation in Barki sheep mange: Positive/therapeutic effect mentioned | week", "40201803"),

                    // Nutrients
                    Reference("Can J Microbiol. 2025 Jan 1;71:1-15", "👉 Interactions between scab-inducing strains: Positive/therapeutic effect mentioned", "40085926"),
                    Reference("Front Microbiol. 2024 Oct 2;15:1466927", "👉 Proteomics fingerprinting iron & oxidative stress: g, G", "39417082"),
                    Reference("mBio. 2024 Oct 16;15(10):e0102224", "👉 3,7-dihydroxytropolone biosynthesis & anti-phytopathogen activity: No clear dose/effect/duration found", "39207110")
                )
            )

            "Sciatica" -> Pair(
                """
Alternative approaches
1. Pregabalin for low back pain: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week
2. Gaultherin (natural salicylate): Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Warm acupuncture vs Gabapentin: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Herbs
1. Aconitum napellus tuber extract: g, mg
2. Five-herb + thiamine pilot study: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Latin American traditional herbs: No clear dose/effect/duration found

Amino acids
1. Warm acupuncture study: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Chiropractic spinal manipulation + gabapentin: Positive/therapeutic effect mentioned
3. Pharmacotherapy for spine-related pain: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Vitamins
1. PLDD + oral supplement for disc herniation: Positive/therapeutic effect mentioned | month
2. Pregnancy leg cramps study: No clear dose/effect/duration found
3. Combined rehab + alpha-lipoic acid, acetyl-L-carnitine, resveratrol, cholecalciferol: mg | Positive/therapeutic effect mentioned | day

Minerals
1. Sciatic compression in rabbit model: Negative/adverse effect mentioned
2. Inulin from Morinda officinalis roots: No clear dose/effect/duration found
3. Spine bone density after epidural injections: mg | Positive/therapeutic effect mentioned

Supplements
1. Lipidome effect on intervertebral disk degeneration: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. PLDD + oral supplement for lumbar disc herniation: Positive/therapeutic effect mentioned | month
3. Pregnancy leg cramps study: No clear dose/effect/duration found

Nutrients
1. L-Carnitine treatment for neurological manifestations: No clear dose/effect/duration found
2. Pyrroloquinoline quinone for sciatic nerve injury: mg | Positive/therapeutic effect mentioned
3. Lumbar artery occlusion follow-up: No clear dose/effect/duration found
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Front Pharmacol. 2025 Sep 8;16:1659531", "👉 Pregabalin for low back pain: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week", "40989845"),
                    Reference("Int J Mol Sci. 2025 Jul 28;26(15):7280", "👉 Gaultherin (natural salicylate): Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40806412"),
                    Reference("J Evid Based Integr Med. 2025 Jan-Dec;30:2515690X251355513", "👉 Warm acupuncture vs Gabapentin: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40611628"),

                    // Herbs
                    Reference("3 Biotech. 2020 Feb;10(2):56", "👉 Aconitum napellus tuber extract: g, mg", "32015952"),
                    Reference("Altern Ther Health Med. 2017 Jan;23(1):14-19", "👉 Five-herb + thiamine pilot study: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "28160759"),
                    Reference("Rev Neurol. 2009 Aug 1-15;49(3):149-55", "👉 Latin American traditional herbs: No clear dose/effect/duration found", "19621310"),

                    // Amino acids
                    Reference("J Evid Based Integr Med. 2025 Jan-Dec;30:2515690X251355513", "👉 Warm acupuncture study: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40611628"),
                    Reference("BMJ Open. 2023 Jul 21;13(7):e073258", "👉 Chiropractic spinal manipulation + gabapentin: Positive/therapeutic effect mentioned", "37479505"),
                    Reference("Drugs Aging. 2022 Jul;39(7):523-550", "👉 Pharmacotherapy for spine-related pain: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "35754070"),

                    // Vitamins
                    Reference("J Clin Med. 2024 Aug 26;13(17):5049", "👉 PLDD + oral supplement for disc herniation: Positive/therapeutic effect mentioned | month", "39274262"),
                    Reference("Int J Womens Health. 2024 Aug 12;16:1377-1387", "👉 Pregnancy leg cramps study: No clear dose/effect/duration found", "39157003"),
                    Reference("Medicina (Kaunas). 2023 Dec 18;59(12):2197", "👉 Combined rehab + alpha-lipoic acid, acetyl-L-carnitine, resveratrol, cholecalciferol: mg | Positive/therapeutic effect mentioned | day", "38138300"),

                    // Minerals
                    Reference("J Orthop Res. 2025 Apr;43(4):803-809", "👉 Sciatic compression in rabbit model: Negative/adverse effect mentioned", "39815436"),
                    Reference("Int J Biol Macromol. 2018 Dec;120(Pt A):170-179", "👉 Inulin from Morinda officinalis roots: No clear dose/effect/duration found", "30125630"),
                    Reference("J Clin Endocrinol Metab. 2018 Sep 1;103(9):3405-3410", "👉 Spine bone density after epidural injections: mg | Positive/therapeutic effect mentioned", "29982535"),

                    // Supplements
                    Reference("Sci Rep. 2025 May 23;15(1):18045", "👉 Lipidome effect on intervertebral disk degeneration: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40410311"),
                    Reference("J Clin Med. 2024 Aug 26;13(17):5049", "👉 PLDD + oral supplement for lumbar disc herniation: Positive/therapeutic effect mentioned | month", "39274262"),
                    Reference("Int J Womens Health. 2024 Aug 12;16:1377-1387", "👉 Pregnancy leg cramps study: No clear dose/effect/duration found", "39157003"),

                    // Nutrients
                    Reference("Nutrients. 2024 Apr 20;16(8):1232", "👉 L-Carnitine treatment for neurological manifestations: No clear dose/effect/duration found", "38674921"),
                    Reference("Eur J Pharmacol. 2012 Dec 15;697(1-3):53-8", "👉 Pyrroloquinoline quinone for sciatic nerve injury: mg | Positive/therapeutic effect mentioned", "23063836"),
                    Reference("Spine (Phila Pa 1976). 2004 Aug 15;29(16):1804-8", "👉 Lumbar artery occlusion follow-up: No clear dose/effect/duration found", "15303025")
                )
            )

            "Sepsis" -> Pair(
                """
Alternative approaches
1. Vancomycin for CoNS bloodstream infections: mg | Positive/therapeutic effect mentioned
2. Incomplete antenatal corticosteroids in preterm infants: g | Negative/adverse effect mentioned
3. RNAi therapy in lethal EMCV model: Positive/therapeutic effect mentioned

Herbs
1. Ginsenoside Rc inhibits NF-κB in septic encephalopathy: Positive/therapeutic effect mentioned
2. Yinghuang Decoction in sepsis: Negative/adverse effect mentioned
3. Umbilical cord care factors in Uganda: week, month

Amino acids
1. Enteral vs parenteral nutrition in auto-HCT: No clear dose/effect/duration found
2. Antivirals Nirmatrelvir-Ritonavir and Molnupiravir in viral sepsis: Positive/therapeutic effect mentioned
3. Glutamine metabolism and sepsis biomarkers: Positive/therapeutic effect mentioned

Vitamins
1. Anticoagulation therapy in femur fracture: Positive/therapeutic effect mentioned | day
2. Intestinal permeability regulation: No clear dose/effect/duration found
3. Vitamin C and EFAs in sepsis recovery: g | Positive/therapeutic effect mentioned

Minerals
1. MSCs + SeNPs in liver injury: Positive/therapeutic effect mentioned
2. Boric acid in endotoxaemia: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. CCL20/CCR6 signaling in S. aureus osteomyelitis: Positive/therapeutic effect mentioned

Supplements
1. Nutritional jejunostomy + Pezzer catheter: Positive/therapeutic effect mentioned
2. Serum procalcitonin and postoperative mortality: Positive/therapeutic effect mentioned
3. Probiotics on intestinal permeability in septic children: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week, day

Nutrients
1. Atopobium spp. interactions with host proteins: No clear dose/effect/duration found
2. Glucocorticoid system and sepsis: Positive/therapeutic effect mentioned
3. Psychobiotics in gastrointestinal oncology pain management: Positive/therapeutic effect mentioned | month
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Pharmacol Res Perspect. 2025 Oct;13(5):e70180", "👉 Vancomycin for CoNS bloodstream infections: mg | Positive/therapeutic effect mentioned", "41015987"),
                    Reference("Eur J Obstet Gynecol Reprod Biol. 2025 Sep 22;315:114732", "👉 Incomplete antenatal corticosteroids in preterm infants: g | Negative/adverse effect mentioned", "41014996"),
                    Reference("Viruses. 2025 Sep 14;17(9):1240", "👉 RNAi therapy in lethal EMCV model: Positive/therapeutic effect mentioned", "41012668"),

                    // Herbs
                    Reference("Appl Biochem Biotechnol. 2025 Sep 18", "👉 Ginsenoside Rc inhibits NF-κB in septic encephalopathy: Positive/therapeutic effect mentioned", "40965580"),
                    Reference("Int J Gen Med. 2025 Aug 27;18:4785-4801", "👉 Yinghuang Decoction in sepsis: Negative/adverse effect mentioned", "40901370"),
                    Reference("BMC Pediatr. 2025 Aug 7;25(1):607", "👉 Umbilical cord care factors in Uganda: week, month", "40775622"),

                    // Amino acids
                    Reference("Support Care Cancer. 2025 Sep 19;33(10):865", "👉 Enteral vs parenteral nutrition in auto-HCT: No clear dose/effect/duration found", "40971058"),
                    Reference("JMIR Public Health Surveill. 2025 Sep 18;11:e72124", "👉 Antivirals Nirmatrelvir-Ritonavir and Molnupiravir in viral sepsis: Positive/therapeutic effect mentioned", "40966482"),
                    Reference("Front Immunol. 2025 Aug 20;16:1640425", "👉 Glutamine metabolism and sepsis biomarkers: Positive/therapeutic effect mentioned", "40909263"),

                    // Vitamins
                    Reference("Acta Orthop Traumatol Turc. 2025 Sep 12;59(5):253-258", "👉 Anticoagulation therapy in femur fracture: Positive/therapeutic effect mentioned | day", "40994363"),
                    Reference("Arch Med Res. 2025 Sep 17;57(3):103321", "👉 Intestinal permeability regulation: No clear dose/effect/duration found", "40967091"),
                    Reference("Nutrition. 2025 Aug 7;141:112924", "👉 Vitamin C and EFAs in sepsis recovery: g | Positive/therapeutic effect mentioned", "40966940"),

                    // Minerals
                    Reference("Front Immunol. 2025 Sep 5;16:1602994", "👉 MSCs + SeNPs in liver injury: Positive/therapeutic effect mentioned", "40977719"),
                    Reference("J Obstet Gynaecol Res. 2025 Aug;51(8):e70055", "👉 Boric acid in endotoxaemia: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40854541"),
                    Reference("mBio. 2025 Aug 25:e0141325", "👉 CCL20/CCR6 signaling in S. aureus osteomyelitis: Positive/therapeutic effect mentioned", "40853122"),

                    // Supplements
                    Reference("BMC Surg. 2025 Sep 25;25(1):414", "👉 Nutritional jejunostomy + Pezzer catheter: Positive/therapeutic effect mentioned", "40999418"),
                    Reference("Cureus. 2025 Aug 24;17(8):e90869", "👉 Serum procalcitonin and postoperative mortality: Positive/therapeutic effect mentioned", "40995285"),
                    Reference("Eur J Nutr. 2025 Sep 23;64(7):284", "👉 Probiotics on intestinal permeability in septic children: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week, day", "40986080"),

                    // Nutrients
                    Reference("Anaerobe. 2025 Sep 17:102998", "👉 Atopobium spp. interactions with host proteins: No clear dose/effect/duration found", "40972706"),
                    Reference("Semin Respir Crit Care Med. 2025 Sep 17", "👉 Glucocorticoid system and sepsis: Positive/therapeutic effect mentioned", "40962264"),
                    Reference("Nutrients. 2025 Aug 25;17(17):2751", "👉 Psychobiotics in gastrointestinal oncology pain management: Positive/therapeutic effect mentioned | month", "40944142")
                )
            )

            "Shingles" -> Pair(
                """
Alternative approaches
1. Stapled peptides antiviral potential: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Electroacupuncture for postherpetic neuralgia: Negative/adverse effect mentioned | week
3. Zoster-induced Guillain-Barré syndrome: Positive/therapeutic effect mentioned | day

Herbs
1. Tubiechong review: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Gynura genus review: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Gentiana scabra formula: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Amino acids
1. EAAT-2 downregulation in neuropathic pain: Positive/therapeutic effect mentioned
2. Valacyclovir-induced neuro/nephrotoxicity: mg | Negative/adverse effect mentioned
3. Duloxetine + Pregabalin vs Amitriptyline + Pregabalin: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week

Vitamins
1. Hydromorphone + Dexmedetomidine PCA: Negative/adverse effect mentioned | week
2. Post-herpetic abdominal pseudohernia: Positive/therapeutic effect mentioned
3. Environmental risk factors for MS: Positive/therapeutic effect mentioned

Minerals
1. Nicotinamide in hyperphosphataemia: mg | Positive/therapeutic effect mentioned | week
2. HSV-1 reactivation in spaceflight: Positive/therapeutic effect mentioned | day
3. Silica-associated SLE: mg

Supplements
1. Herpes zoster incidence adults ≥20y in Finland: No clear dose/effect/duration found
2. Duloxetine + Pregabalin vs Amitriptyline + Pregabalin: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week
3. Virus-specific antibody responses in MS treated with Ocrevus: G | Positive/therapeutic effect mentioned

Nutrients
1. High dose IV vitamin C for EBV hepatitis: g | week
2. Myrothamnus flabellifolius as feed additive: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Vitamin D association with herpes zoster: Positive/therapeutic effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Microb Biotechnol. 2025 Sep;18(9):e70221", "👉 Stapled peptides antiviral potential: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40955200"),
                    Reference("Front Med (Lausanne). 2025 Aug 28;12:1616035", "👉 Electroacupuncture for postherpetic neuralgia: Negative/adverse effect mentioned | week", "40950954"),
                    Reference("Ann Med Surg (Lond). 2025 Jul 16;87(9):6107-6115", "👉 Zoster-induced Guillain-Barré syndrome: Positive/therapeutic effect mentioned | day", "40901191"),

                    // Herbs
                    Reference("J Ethnopharmacol. 2022 Nov 15;298:115642", "👉 Tubiechong review: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "35973633"),
                    Reference("J Ethnopharmacol. 2021 Aug 10;276:114145", "👉 Gynura genus review: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "33932518"),
                    Reference("Phytother Res. 2017 Mar;31(3):375-386", "👉 Gentiana scabra formula: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "28078812"),

                    // Amino acids
                    Reference("Sci Rep. 2025 Jul 1;15(1):21057", "👉 EAAT-2 downregulation in neuropathic pain: Positive/therapeutic effect mentioned", "40595847"),
                    Reference("BMC Nephrol. 2025 May 30;26(1):269", "👉 Valacyclovir-induced neuro/nephrotoxicity: mg | Negative/adverse effect mentioned", "40447999"),
                    Reference("CNS Neurosci Ther. 2025 May;31(5):e70460", "👉 Duloxetine + Pregabalin vs Amitriptyline + Pregabalin: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week", "40418104"),

                    // Vitamins
                    Reference("J Coll Physicians Surg Pak. 2025 Aug;35(8):958-963", "👉 Hydromorphone + Dexmedetomidine PCA: Negative/adverse effect mentioned | week", "40843559"),
                    Reference("Cureus. 2025 Jul 4;17(7):e87299", "👉 Post-herpetic abdominal pseudohernia: Positive/therapeutic effect mentioned", "40761988"),
                    Reference("J Neurol. 2025 Jul 15;272(8):513", "👉 Environmental risk factors for MS: Positive/therapeutic effect mentioned", "40664781"),

                    // Minerals
                    Reference("Nephrol Dial Transplant. 2023 Mar 31;38(4):982-991", "👉 Nicotinamide in hyperphosphataemia: mg | Positive/therapeutic effect mentioned | week", "35751625"),
                    Reference("Viruses. 2022 Apr 11;14(4):789", "👉 HSV-1 reactivation in spaceflight: Positive/therapeutic effect mentioned | day", "35458519"),
                    Reference("Medicine (Baltimore). 2022 Feb 18;101(7):e28872", "👉 Silica-associated SLE: mg", "35363197"),

                    // Supplements
                    Reference("Euro Surveill. 2025 Sep;30(35):2500077", "👉 Herpes zoster incidence adults ≥20y in Finland: No clear dose/effect/duration found", "40910227"),
                    Reference("CNS Neurosci Ther. 2025 May;31(5):e70460", "👉 Duloxetine + Pregabalin vs Amitriptyline + Pregabalin: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week", "40418104"),
                    Reference("J Neurol Sci. 2025 Jul 15;474:123537", "👉 Virus-specific antibody responses in MS treated with Ocrevus: G | Positive/therapeutic effect mentioned", "40398376"),

                    // Nutrients
                    Reference("Integr Med (Encinitas). 2023 Sep;22(4):24-27", "👉 High dose IV vitamin C for EBV hepatitis: g | week", "37752927"),
                    Reference("Animals (Basel). 2022 Aug 3;12(15):1973", "👉 Myrothamnus flabellifolius as feed additive: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "35953961"),
                    Reference("Br J Gen Pract. 2022 Oct 27;72(724):e842-e848", "👉 Vitamin D association with herpes zoster: Positive/therapeutic effect mentioned", "35940884")
                )
            )

            "Shortness of Breath" -> Pair(
                """
Alternative approaches
1. Restoration of Cardiac Function in LBBB-Induced Cardiomyopathy: Positive/therapeutic effect mentioned | month
2. Successful Percutaneous Treatment of Stenosed Mustard Atrial Switch: No clear dose/effect/duration found
3. Chronic cutaneous sequelae from chlorine gas exposure: Positive/therapeutic effect mentioned

Herbs
1. Saengmaek-san in bleomycin-induced pulmonary fibrosis: mg | Positive/therapeutic effect mentioned | day
2. Traditional Chinese medicine for chronic heart failure: Positive/therapeutic effect mentioned
3. Spice shop worker symptoms: Negative/adverse effect mentioned

Amino acids
1. COVID-19 symptom diary: g, mg | day
2. Cartap poisoning: mg | Negative/adverse effect mentioned
3. Homocysteine in COPD: No clear dose/effect/duration found

Vitamins
1. No clear dose/effect/duration found
2. Persistent pulmonary findings after COVID-19: Positive/therapeutic effect mentioned
3. Early rehabilitation for acute pulmonary embolism: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Minerals
1. L-Carnitine and Selenium in Graves' disease: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month
2. Home-based pulmonary rehab for COPD + osteoporosis: Positive/therapeutic effect mentioned | month
3. Whole lung lavage in lipoid pneumonia: Positive/therapeutic effect mentioned | day, month

Supplements
1. Red yeast rice rhabdomyolysis: g, μg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month
2. L-Carnitine + Selenium in Graves' disease: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month
3. Frank's Sign with giant right atrial myxoma: No clear dose/effect/duration found

Nutrients
1. Nutritional therapy for MRSA sepsis + pulmonary embolism in children: Positive/therapeutic effect mentioned
2. "Food Is Medicine" strategies for respiratory health: Positive/therapeutic effect mentioned
3. — no third relevant reference found —
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Am J Case Rep. 2025 Sep 27;26:e948576", "👉 Restoration of Cardiac Function in LBBB-Induced Cardiomyopathy: Positive/therapeutic effect mentioned | month", "41013877"),
                    Reference("JACC Case Rep. 2025 Sep 17;30(28):105413", "👉 Successful Percutaneous Treatment of Stenosed Mustard Atrial Switch: No clear dose/effect/duration found", "40973326"),
                    Reference("J Int Med Res. 2025 Sep;53(9):3000605251378697", "👉 Chronic cutaneous sequelae from chlorine gas exposure: Positive/therapeutic effect mentioned", "40971759"),

                    // Herbs
                    Reference("J Ethnopharmacol. 2025 May 28;348:119866", "👉 Saengmaek-san in bleomycin-induced pulmonary fibrosis: mg | Positive/therapeutic effect mentioned | day", "40274032"),
                    Reference("Front Med (Lausanne). 2025 Apr 7;12:1522163", "👉 Traditional Chinese medicine for chronic heart failure: Positive/therapeutic effect mentioned", "40265178"),
                    Reference("Thorac Res Pract. 2024 Jul;25(4):136-140", "👉 Spice shop worker symptoms: Negative/adverse effect mentioned", "39128049"),

                    // Amino acids
                    Reference("J Patient Rep Outcomes. 2025 Aug 11;9(1):99", "👉 COVID-19 symptom diary: g, mg | day", "40788441"),
                    Reference("JNMA J Nepal Med Assoc. 2024 Oct;62(278):702-705", "👉 Cartap poisoning: mg | Negative/adverse effect mentioned", "40655885"),
                    Reference("Heart Lung. 2025 Nov-Dec;74:129-135", "👉 Homocysteine in COPD: No clear dose/effect/duration found", "40651309"),

                    // Vitamins
                    Reference("Myotonic Dystrophy Type 2. GeneReviews. 2006 Sep 21 [updated 2025 Sep 25]", "👉 No clear dose/effect/duration found", "20301639"),
                    Reference("Cureus. 2025 Aug 19;17(8):e90542", "👉 Persistent pulmonary findings after COVID-19: Positive/therapeutic effect mentioned", "40978879"),
                    Reference("J Clin Med. 2025 Sep 3;14(17):6230", "👉 Early rehabilitation for acute pulmonary embolism: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40943985"),

                    // Minerals
                    Reference("Nutrients. 2025 Aug 20;17(16):2693", "👉 L-Carnitine and Selenium in Graves' disease: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month", "40871722"),
                    Reference("Physiother Res Int. 2025 Oct;30(4):e70097", "👉 Home-based pulmonary rehab for COPD + osteoporosis: Positive/therapeutic effect mentioned | month", "40765137"),
                    Reference("Respir Med Case Rep. 2025 Jul 25;57:102274", "👉 Whole lung lavage in lipoid pneumonia: Positive/therapeutic effect mentioned | day, month", "40755838"),

                    // Supplements
                    Reference("Front Med (Lausanne). 2025 Aug 20;12:1634047", "👉 Red yeast rice rhabdomyolysis: g, μg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month", "40909457"),
                    Reference("Nutrients. 2025 Aug 20;17(16):2693", "👉 L-Carnitine + Selenium in Graves' disease: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month", "40871722"),
                    Reference("Cureus. 2025 Jun 29;17(6):e86984", "👉 Frank's Sign with giant right atrial myxoma: No clear dose/effect/duration found", "40734893"),

                    // Nutrients
                    Reference("Front Nutr. 2025 Feb 19;12:1484012", "👉 Nutritional therapy for MRSA sepsis + pulmonary embolism in children: Positive/therapeutic effect mentioned", "40046762"),
                    Reference("J Am Nutr Assoc. 2025 Aug;44(6):579-589", "👉 \"Food Is Medicine\" strategies for respiratory health: Positive/therapeutic effect mentioned", "39991983")
                )
            )

            "Sinusitis" -> Pair(
                """
Alternative approaches
1. Biologicals in Type-2-Inflammation: Negative/adverse effect mentioned
2. Gut microbiota response to 1,8-Cineol: Positive/therapeutic effect mentioned
3. Kartagener's syndrome with congenital heart defect: g | Positive/therapeutic effect mentioned

Herbs
1. Inflasinusans in acute rhinosinusitis: Positive/therapeutic effect mentioned | week
2. Chinese herbal medicines for rhinosinusitis: Positive/therapeutic effect mentioned
3. Traditional herbal medicine for acute and chronic rhinosinusitis: No clear dose/effect/duration found

Amino acids
1. Streptococcus pneumoniae proteome under nutrient-defined conditions: No clear dose/effect/duration found
2. Synergistic NO therapy + phototherapy for acute rhinosinusitis: Positive/therapeutic effect mentioned
3. Circulating metabolites in chronic rhinosinusitis: Positive/therapeutic effect mentioned

Vitamins
1. Inflasinusans in acute rhinosinusitis: Positive/therapeutic effect mentioned | week
2. Pediatric liquid medications and dental caries: Positive/therapeutic effect mentioned
3. Yellow nail syndrome management: No clear dose/effect/duration found

Minerals
1. Bio-Oss® + HA-Polynucleotide Gel in maxillary sinus augmentation: week
2. Pouch vs non-pouch technique for maxillary sinus membrane perforation: Positive/therapeutic effect mentioned | month
3. Morphological changes in maxillary sinus floor augmentation: month

Supplements
1. CRS and inflammatory bowel disease causality: No clear dose/effect/duration found
2. Clinical Practice Guideline: Adult Sinusitis Update: No clear dose/effect/duration found
3. Executive summary of adult sinusitis guideline: g | Positive/therapeutic effect mentioned

Nutrients
1. Glymphatic and meningeal lymphatic structures in dolphins: No clear dose/effect/duration found
2. Streptococcus pneumoniae proteome under nutrient-defined conditions: No clear dose/effect/duration found
3. Hemophilus influenza vaccine design: No clear dose/effect/duration found
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Laryngorhinootologie. 2025 Sep;104(9):579-600", "👉 Biologicals in Type-2-Inflammation: Negative/adverse effect mentioned", "40925352"),
                    Reference("Curr Res Microb Sci. 2025 Jul 22;9:100442", "👉 Gut microbiota response to 1,8-Cineol: Positive/therapeutic effect mentioned", "40785792"),
                    Reference("Cardiol Young. 2025 Aug;35(8):1734-1739", "👉 Kartagener's syndrome with congenital heart defect: g | Positive/therapeutic effect mentioned", "40785399"),

                    // Herbs
                    Reference("Vestn Otorinolaringol. 2025;90(4):64-71", "👉 Inflasinusans in acute rhinosinusitis: Positive/therapeutic effect mentioned | week", "40899893"),
                    Reference("BMC Complement Med Ther. 2025 May 6;25(1):165", "👉 Chinese herbal medicines for rhinosinusitis: Positive/therapeutic effect mentioned", "40329241"),
                    Reference("Rhinology. 2025 Jun 1;63(3):286-305", "👉 Traditional herbal medicine for acute and chronic rhinosinusitis: No clear dose/effect/duration found", "40202087"),

                    // Amino acids
                    Reference("Front Cell Infect Microbiol. 2025 Jul 11;15:1606161", "👉 Streptococcus pneumoniae proteome under nutrient-defined conditions: No clear dose/effect/duration found", "40718681"),
                    Reference("Biomacromolecules. 2025 Jul 14;26(7):4702-4717", "👉 Synergistic NO therapy + phototherapy for acute rhinosinusitis: Positive/therapeutic effect mentioned", "40553439"),
                    Reference("Braz J Otorhinolaryngol. 2025 Jul-Aug;91(4):101626", "👉 Circulating metabolites in chronic rhinosinusitis: Positive/therapeutic effect mentioned", "40286593"),

                    // Vitamins
                    Reference("Vestn Otorinolaringol. 2025;90(4):64-71", "👉 Inflasinusans in acute rhinosinusitis: Positive/therapeutic effect mentioned | week", "40899893"),
                    Reference("Health Sci Rep. 2025 Jul 23;8(7):e71115", "👉 Pediatric liquid medications and dental caries: Positive/therapeutic effect mentioned", "40704323"),
                    Reference("J Am Acad Dermatol. 2025 Jul 19:S0190-9622(25)02527-7", "👉 Yellow nail syndrome management: No clear dose/effect/duration found", "40692045"),

                    // Minerals
                    Reference("Dent J (Basel). 2025 Jun 28;13(7):293", "👉 Bio-Oss® + HA-Polynucleotide Gel in maxillary sinus augmentation: week", "40710138"),
                    Reference("J Periodontol. 2025 Sep;96(9):1004-1014", "👉 Pouch vs non-pouch technique for maxillary sinus membrane perforation: Positive/therapeutic effect mentioned | month", "40627762"),
                    Reference("Int J Oral Maxillofac Surg. 2025 Oct;54(10):995-1002", "👉 Morphological changes in maxillary sinus floor augmentation: month", "40571462"),

                    // Supplements
                    Reference("Medicine (Baltimore). 2025 Sep 5;104(36):e44402", "👉 CRS and inflammatory bowel disease causality: No clear dose/effect/duration found", "40922319"),
                    Reference("Otolaryngol Head Neck Surg. 2025 Aug;173 Suppl 1:S1-S56", "👉 Clinical Practice Guideline: Adult Sinusitis Update: No clear dose/effect/duration found", "40742114"),
                    Reference("Otolaryngol Head Neck Surg. 2025 Aug;173(2):299-316", "👉 Executive summary of adult sinusitis guideline: g | Positive/therapeutic effect mentioned", "40741969"),

                    // Nutrients
                    Reference("Sci Rep. 2025 Aug 18;15(1):30216", "👉 Glymphatic and meningeal lymphatic structures in dolphins: No clear dose/effect/duration found", "40825973"),
                    Reference("Front Cell Infect Microbiol. 2025 Jul 11;15:1606161", "👉 Streptococcus pneumoniae proteome under nutrient-defined conditions: No clear dose/effect/duration found", "40718681"),
                    Reference("Sci Rep. 2025 Jul 1;15(1):22316", "👉 Hemophilus influenza vaccine design: No clear dose/effect/duration found", "40594015")
                )
            )

            "Skin cancer" -> Pair(
                """
Alternative approaches
1. Radiotherapeutic modalities in cutaneous malignancies: Negative/adverse effect mentioned
2. Open vs minimally invasive inguinal lymphadenectomy in penile cancer: Positive/therapeutic effect mentioned | day
3. Ex vivo confocal microscopy for margin assessment in basal cell carcinoma: Positive/therapeutic effect mentioned

Herbs
1. Parthenolide in BRAF-inhibitor resistant melanoma: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Medicinal plants in cancer-related malnutrition: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Bruceine A as HSP90AB1 inhibitor for hepatocellular carcinoma: No clear dose/effect/duration found

Amino acids
1. E2 Tyrosine 102 in MmuPV1 pathogenesis: g
2. Human tyrosinase inhibitors from Xanthium strumarium L.: μg | Positive/therapeutic effect mentioned
3. Recombinant Methioninase targeting methionine-addicted cancer cells: day

Vitamins
1. Nicotinamide induces apoptosis in melanoma: Positive/therapeutic effect mentioned
2. Daily sunscreen effects on vitamin D: Positive/therapeutic effect mentioned
3. Chronic UVB exposure in mice: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Minerals
1. Skin carotenoids and healthy lifestyle: Positive/therapeutic effect mentioned
2. Cu/Zn co-doped hydroxyapatite characteristics: μg | Positive/therapeutic effect mentioned
3. Caucasian Whortleberry pharmacology: Positive/therapeutic effect mentioned

Supplements
1. Epigallocatechin-Gallate (EGCG) benefits: Positive/therapeutic effect mentioned
2. Tyrosinase and antioxidant activities of resveratrol derivatives: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Melanin-driven delayed CPD formation: No clear dose/effect/duration found

Nutrients
1. Skin microbiota in facial dermatoses: Positive/therapeutic effect mentioned
2. Metabolism in melanoma: No clear dose/effect/duration found
3. Physical activity effects on skin health: Positive/therapeutic effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("J Clin Med. 2025 Sep 17;14(18):6547", "👉 Radiotherapeutic modalities in cutaneous malignancies: Negative/adverse effect mentioned", "41010750"),
                    Reference("Cancers (Basel). 2025 Sep 17;17(18):3035", "👉 Open vs minimally invasive inguinal lymphadenectomy in penile cancer: Positive/therapeutic effect mentioned | day", "41008879"),
                    Reference("Cancers (Basel). 2025 Sep 16;17(18):3019", "👉 Ex vivo confocal microscopy for margin assessment in basal cell carcinoma: Positive/therapeutic effect mentioned", "41008862"),

                    // Herbs
                    Reference("Phytomedicine. 2025 Oct;146:157151", "👉 Parthenolide in BRAF-inhibitor resistant melanoma: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40815947"),
                    Reference("Cancer Cell Int. 2025 Jul 16;25(1):266", "👉 Medicinal plants in cancer-related malnutrition: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40671046"),
                    Reference("J Adv Res. 2025 Jul 13:S2090-1232(25)00541-7", "👉 Bruceine A as HSP90AB1 inhibitor for hepatocellular carcinoma: No clear dose/effect/duration found", "40664262"),

                    // Amino acids
                    Reference("Pathogens. 2025 Sep 11;14(9):913", "👉 E2 Tyrosine 102 in MmuPV1 pathogenesis: g", "41011813"),
                    Reference("Molecules. 2025 Sep 10;30(18):3689", "👉 Human tyrosinase inhibitors from Xanthium strumarium L.: μg | Positive/therapeutic effect mentioned", "41011583"),
                    Reference("Anticancer Res. 2025 Oct;45(10):4193-4200", "👉 Recombinant Methioninase targeting methionine-addicted cancer cells: day", "41006033"),

                    // Vitamins
                    Reference("J Cell Biochem. 2025 Sep;126(9):e70064", "👉 Nicotinamide induces apoptosis in melanoma: Positive/therapeutic effect mentioned", "40952822"),
                    Reference("Br J Dermatol. 2025 Sep 10:ljaf310", "👉 Daily sunscreen effects on vitamin D: Positive/therapeutic effect mentioned", "40927943"),
                    Reference("J Vis Exp. 2025 Aug 19;(222)", "👉 Chronic UVB exposure in mice: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40920741"),

                    // Minerals
                    Reference("J Transl Med. 2025 Aug 22;23(1):952", "👉 Skin carotenoids and healthy lifestyle: Positive/therapeutic effect mentioned", "40846942"),
                    Reference("J Biomed Mater Res A. 2025 Aug;113(8):e37976", "👉 Cu/Zn co-doped hydroxyapatite characteristics: μg | Positive/therapeutic effect mentioned", "40815674"),
                    Reference("Food Sci Nutr. 2025 Aug 7;13(8):e70702", "👉 Caucasian Whortleberry pharmacology: Positive/therapeutic effect mentioned", "40777204"),

                    // Supplements
                    Reference("Int J Mol Sci. 2025 Sep 22;26(18):9253", "👉 Epigallocatechin-Gallate (EGCG) benefits: Positive/therapeutic effect mentioned", "41009815"),
                    Reference("Int J Mol Sci. 2025 Sep 10;26(18):8827", "👉 Tyrosinase and antioxidant activities of resveratrol derivatives: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41009396"),
                    Reference("J Invest Dermatol. 2025 Sep 22:S0022-202X(25)02438-8", "👉 Melanin-driven delayed CPD formation: No clear dose/effect/duration found", "40992685"),

                    // Nutrients
                    Reference("Int J Mol Sci. 2025 Sep 11;26(18):8857", "👉 Skin microbiota in facial dermatoses: Positive/therapeutic effect mentioned", "41009424"),
                    Reference("Semin Oncol. 2025 Sep 12;52(6):152413", "👉 Metabolism in melanoma: No clear dose/effect/duration found", "40945210"),
                    Reference("Clin Cosmet Investig Dermatol. 2025 Sep 4;18:2189-2200", "👉 Physical activity effects on skin health: Positive/therapeutic effect mentioned", "40933392")
                )
            )

            "Sleep apnoea" -> Pair(
                """
Alternative approaches
1. Modified Mandibular Advancement Device in patients with insufficient teeth: Positive/therapeutic effect mentioned
2. Comparative efficacy of polysomnography in OSA patients during COVID-19: Positive/therapeutic effect mentioned
3. Post-marketing safety of solriamfetol: Negative/adverse effect mentioned | day

Herbs
1. Herbal treatments for obesity: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Huatan Huoxue prescription as complementary therapy: No clear dose/effect/duration found
3. Synergistic mechanisms of Chinese herbal medicine in AF with OSA: No clear dose/effect/duration found

Amino acids
1. Methylated arginine metabolites in OSA: Positive/therapeutic effect mentioned
2. Sacubitril/valsartan in heart failure with sleep-disordered breathing: Positive/therapeutic effect mentioned
3. Solriamfetol for excessive daytime sleepiness in OSA: mg | Positive/therapeutic effect mentioned | week

Vitamins
1. No clear dose/effect/duration found
2. VDR activation ameliorates intermittent hypoxia cognitive impairment: Positive/therapeutic effect mentioned
3. Cardiac autonomic dysfunction in OSA and vitamin D deficiency: No clear dose/effect/duration found

Minerals
1. AI-driven bone mineral density prediction and OSA association: No clear dose/effect/duration found
2. Thorax kinematic monitoring using biopolymer sensor: Positive/therapeutic effect mentioned
3. Dietary inflammatory index and sleep disorders: Positive/therapeutic effect mentioned

Supplements
1. Co-morbid insomnia and sleep apnea associated with uncontrolled hypertension: Negative/adverse effect mentioned
2. Respiratory event duration in adults with OSA: No clear dose/effect/duration found
3. Gut microbiota-mediated causal relations between sleep disorders and stroke: Positive/therapeutic effect mentioned

Nutrients
1. Bariatric surgery candidates with BMI ≥50: G
2. Risk factors of OSA, oral dysfunction, and lifestyle in Korean adults: Positive/therapeutic effect mentioned
3. Protein intake and diet quality mediate sleep and handgrip strength relationship: No clear dose/effect/duration found
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("J Oral Rehabil. 2025 Sep 25", "👉 Modified Mandibular Advancement Device in patients with insufficient teeth: Positive/therapeutic effect mentioned", "40999836"),
                    Reference("Sleep Breath. 2025 Sep 23;29(5):294", "👉 Comparative efficacy of polysomnography in OSA patients during COVID-19: Positive/therapeutic effect mentioned", "40986112"),
                    Reference("PLoS One. 2025 Sep 22;20(9):e0333130", "👉 Post-marketing safety of solriamfetol: Negative/adverse effect mentioned | day", "40982454"),

                    // Herbs
                    Reference("Curr Med Chem. 2025;32(10):1874-1886", "👉 Herbal treatments for obesity: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "38509683"),
                    Reference("Medicine (Baltimore). 2020 Jul 24;99(30):e21070", "👉 Huatan Huoxue prescription as complementary therapy: No clear dose/effect/duration found", "32791678"),
                    Reference("Evid Based Complement Alternat Med. 2019 Dec 23;2019:8691608", "👉 Synergistic mechanisms of Chinese herbal medicine in AF with OSA: No clear dose/effect/duration found", "31949472"),

                    // Amino acids
                    Reference("Medicine (Baltimore). 2025 Aug 8;104(32):e43903", "👉 Methylated arginine metabolites in OSA: Positive/therapeutic effect mentioned", "40797410"),
                    Reference("Sci Rep. 2025 Aug 12;15(1):29524", "👉 Sacubitril/valsartan in heart failure with sleep-disordered breathing: Positive/therapeutic effect mentioned", "40796619"),
                    Reference("Sleep Med. 2025 Oct;134:106706", "👉 Solriamfetol for excessive daytime sleepiness in OSA: mg | Positive/therapeutic effect mentioned | week", "40752315"),

                    // Vitamins
                    Reference("Myotonic Dystrophy Type 2. GeneReviews, 2006 Sep 21 [updated 2025 Sep 25]", "👉 No clear dose/effect/duration found", "20301639"),
                    Reference("Int Immunopharmacol. 2025 Sep 23;166:115543", "👉 VDR activation ameliorates intermittent hypoxia cognitive impairment: Positive/therapeutic effect mentioned", "40991996"),
                    Reference("J Evid Based Med. 2025 Sep 17:e70071", "👉 Cardiac autonomic dysfunction in OSA and vitamin D deficiency: No clear dose/effect/duration found", "40962712"),

                    // Minerals
                    Reference("PLoS One. 2025 Sep 5;20(9):e0330080", "👉 AI-driven bone mineral density prediction and OSA association: No clear dose/effect/duration found", "40911562"),
                    Reference("Biosensors (Basel). 2025 Aug 9;15(8):523", "👉 Thorax kinematic monitoring using biopolymer sensor: Positive/therapeutic effect mentioned", "40862982"),
                    Reference("Medicine (Baltimore). 2025 Jul 4;104(27):e43170", "👉 Dietary inflammatory index and sleep disorders: Positive/therapeutic effect mentioned", "40629578"),

                    // Supplements
                    Reference("Ann Am Thorac Soc. 2025 Sep 8", "👉 Co-morbid insomnia and sleep apnea associated with uncontrolled hypertension: Negative/adverse effect mentioned", "40921000"),
                    Reference("Zhonghua Er Bi Yan Hou Tou Jing Wai Ke Za Zhi. 2025 Aug 7;60(8):868-874", "👉 Respiratory event duration in adults with OSA: No clear dose/effect/duration found", "40890053"),
                    Reference("Hormones (Athens). 2025 Sep 1", "👉 Gut microbiota-mediated causal relations between sleep disorders and stroke: Positive/therapeutic effect mentioned", "40889023"),

                    // Nutrients
                    Reference("Nutrients. 2025 Aug 7;17(15):2573", "👉 Bariatric surgery candidates with BMI ≥50: G", "40806157"),
                    Reference("Healthcare (Basel). 2025 Jun 17;13(12):1448", "👉 Risk factors of OSA, oral dysfunction, and lifestyle in Korean adults: Positive/therapeutic effect mentioned", "40565475"),
                    Reference("Nutrients. 2025 May 31;17(11):1900", "👉 Protein intake and diet quality mediate sleep and handgrip strength relationship: No clear dose/effect/duration found", "40507169")
                )
            )

            "Sleep disorders" -> Pair(
                """
Alternative approaches
1. Lavender: clinical efficacy: Positive/therapeutic effect mentioned
2. Melatonergic receptor agonists in insomnia treatment: Negative/adverse effect mentioned
3. NRGAMTE transformer for sleep disorder detection: Positive/therapeutic effect mentioned

Herbs
1. Melatonergic receptor agonists and selected herbs in insomnia treatment: Negative/adverse effect mentioned
2. Polygonatum in neuropsychiatric disorders: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Advances in drug development for sleep medicine: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Amino acids
1. Ziwuliuzhu acupuncture in insomniac rats: g | day
2. Triiodothyronine levels in sudden sensorineural hearing loss: No clear dose/effect/duration found
3. Methylated arginine metabolites in OSA: Positive/therapeutic effect mentioned

Vitamins
1. No clear dose/effect/duration found
2. Restless legs syndrome and growing pains in childhood: No clear dose/effect/duration found
3. Restless legs syndrome and lower extremity adipose thickness: No clear dose/effect/duration found

Minerals
1. Insomnia with fatigue and mood in postmenopausal osteoporosis: Positive/therapeutic effect mentioned
2. AI-driven bone mineral density prediction and OSA association: No clear dose/effect/duration found
3. Circadian disruption and nanoparticle toxicity in sleep deprivation: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Supplements
1. Compliance in TMD patients: week
2. Personalized melatonin supplement interventions for poor sleep: mg | Positive/therapeutic effect mentioned
3. Artificial light at night and night shift work on brain functions: Positive/therapeutic effect mentioned

Nutrients
1. Multi-dimensional sleep health and breakfast skipping: Negative/adverse effect mentioned
2. GAD and obesity pathways: Positive/therapeutic effect mentioned
3. Effects of physical activity on skin health: Positive/therapeutic effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Phytomedicine. 2025 Sep 19;148:157274", "👉 Lavender: clinical efficacy: Positive/therapeutic effect mentioned", "41014669"),
                    Reference("Molecules. 2025 Sep 19;30(18):3814", "👉 Melatonergic receptor agonists in insomnia treatment: Negative/adverse effect mentioned", "41011705"),
                    Reference("Brain Sci. 2025 Sep 13;15(9):985", "👉 NRGAMTE transformer for sleep disorder detection: Positive/therapeutic effect mentioned", "41008345"),

                    // Herbs
                    Reference("Molecules. 2025 Sep 19;30(18):3814", "👉 Melatonergic receptor agonists and selected herbs in insomnia treatment: Negative/adverse effect mentioned", "41011705"),
                    Reference("J Ethnopharmacol. 2025 Jun 26;350:120052", "👉 Polygonatum in neuropsychiatric disorders: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40441463"),
                    Reference("J Sleep Res. 2025 Oct;34(5):e70087", "👉 Advances in drug development for sleep medicine: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40346938"),

                    // Amino acids
                    Reference("Nan Fang Yi Ke Da Xue Xue Bao. 2025 Aug 20;45(8):1616-1624", "👉 Ziwuliuzhu acupuncture in insomniac rats: g | day", "40916523"),
                    Reference("Medicine (Baltimore). 2025 Aug 15;104(33):e43843", "👉 Triiodothyronine levels in sudden sensorineural hearing loss: No clear dose/effect/duration found", "40826678"),
                    Reference("Medicine (Baltimore). 2025 Aug 8;104(32):e43903", "👉 Methylated arginine metabolites in OSA: Positive/therapeutic effect mentioned", "40797410"),

                    // Vitamins
                    Reference("Myotonic Dystrophy Type 2. GeneReviews, 2006 Sep 21 [updated 2025 Sep 25]", "👉 No clear dose/effect/duration found", "20301639"),
                    Reference("Front Neurol. 2025 Aug 22;16:1603694", "👉 Restless legs syndrome and growing pains in childhood: No clear dose/effect/duration found", "40917655"),
                    Reference("Arq Neuropsiquiatr. 2025 Aug;83(8):1-8", "👉 Restless legs syndrome and lower extremity adipose thickness: No clear dose/effect/duration found", "40886706"),

                    // Minerals
                    Reference("Rev Assoc Med Bras (1992). 2025 Sep 19;71(8):e20250426", "👉 Insomnia with fatigue and mood in postmenopausal osteoporosis: Positive/therapeutic effect mentioned", "40990750"),
                    Reference("PLoS One. 2025 Sep 5;20(9):e0330080", "👉 AI-driven bone mineral density prediction and OSA association: No clear dose/effect/duration found", "40911562"),
                    Reference("J Nanobiotechnology. 2025 Sep 2;23(1):600", "👉 Circadian disruption and nanoparticle toxicity in sleep deprivation: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40890823"),

                    // Supplements
                    Reference("J Clin Med. 2025 Sep 22;14(18):6674", "👉 Compliance in TMD patients: week", "41010878"),
                    Reference("JMIR Form Res. 2025 Sep 26;9:e58192", "👉 Personalized melatonin supplement interventions for poor sleep: mg | Positive/therapeutic effect mentioned", "41004640"),
                    Reference("Gen Comp Endocrinol. 2025 Sep 19:114822", "👉 Artificial light at night and night shift work on brain functions: Positive/therapeutic effect mentioned", "40976568"),

                    // Nutrients
                    Reference("Nutrients. 2025 Sep 19;17(18):3005", "👉 Multi-dimensional sleep health and breakfast skipping: Negative/adverse effect mentioned", "41010530"),
                    Reference("Nutrients. 2025 Aug 31;17(17):2835", "👉 GAD and obesity pathways: Positive/therapeutic effect mentioned", "40944223"),
                    Reference("Clin Cosmet Investig Dermatol. 2025 Sep 4;18:2189-2200", "👉 Effects of physical activity on skin health: Positive/therapeutic effect mentioned", "40933392")
                )
            )

            "Sore throat" -> Pair(
                """
Alternative approaches
1. Streptococcus pyogenes Rgg2/Rgg3 quorum sensing system: No clear dose/effect/duration found
2. Conservative antibiotic therapy in pediatric peritonsillar abscesses: week
3. AI and health empowerment in isolated communities: mg

Herbs
1. Beesioside O from Actaea vaginata in breast cancer treatment: No clear dose/effect/duration found
2. Rabdosia rubescens anti-tumor properties: Positive/therapeutic effect mentioned
3. Herbal self-medication for COVID-19 in Sudan: No clear dose/effect/duration found

Amino acids
1. Edible Bird's Nest ameliorates acute pharyngitis: No clear dose/effect/duration found
2. COVID-19 symptom diary experiences: g, mg | day
3. Psychotria rubra tea suppresses inflammatory response: No clear dose/effect/duration found

Vitamins
1. Multivitamin-mineral supplementation prevents acute upper respiratory tract infections: Positive/therapeutic effect mentioned | month
2. Vitamin D insufficiency in PFAPA syndrome: No clear dose/effect/duration found
3. Multidisciplinary approach to chronic pharyngitis: mcg, mg | Positive/therapeutic effect mentioned | day

Minerals
1. Multivitamin-mineral supplementation prevents acute URTIs: Positive/therapeutic effect mentioned | month
2. Cricoid cartilage calcification case: No clear dose/effect/duration found
3. Zinc for prevention/treatment of common cold: g, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day, month

Supplements
1. Multivitamin-mineral supplementation prevents acute URTIs: Positive/therapeutic effect mentioned | month
2. Safe medication use during breastfeeding: Positive/therapeutic effect mentioned
3. Predictors of Mpox complications in hospitalized patients: G, G

Nutrients
1. Euglena gracilis suppresses cold symptoms in healthy individuals: Positive/therapeutic effect mentioned | week
2. Multivitamin-mineral supplementation prevents acute URTIs: Positive/therapeutic effect mentioned | month
3. Blood cells, vitamin D, and inflammatory factors in children with PFAPA syndrome: No clear dose/effect/duration found
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("mBio. 2025 Sep 25:e0037325", "👉 Streptococcus pyogenes Rgg2/Rgg3 quorum sensing system: No clear dose/effect/duration found", "40996031"),
                    Reference("Eur J Pediatr. 2025 Sep 18;184(10):622", "👉 Conservative antibiotic therapy in pediatric peritonsillar abscesses: week", "40962928"),
                    Reference("Front Digit Health. 2025 Aug 26;7:1655154", "👉 AI and health empowerment in isolated communities: mg", "40933813"),

                    // Herbs
                    Reference("Int J Mol Sci. 2025 Mar 4;26(5):2283", "👉 Beesioside O from Actaea vaginata in breast cancer treatment: No clear dose/effect/duration found", "40076902"),
                    Reference("J Ethnopharmacol. 2025 Jan 31;340:119200", "👉 Rabdosia rubescens anti-tumor properties: Positive/therapeutic effect mentioned", "39631716"),
                    Reference("Curr Ther Res Clin Exp. 2024 Oct 5;101:100761", "👉 Herbal self-medication for COVID-19 in Sudan: No clear dose/effect/duration found", "39588053"),

                    // Amino acids
                    Reference("Chem Biodivers. 2025 Aug 11:e01260", "👉 Edible Bird's Nest ameliorates acute pharyngitis: No clear dose/effect/duration found", "40789069"),
                    Reference("J Patient Rep Outcomes. 2025 Aug 11;9(1):99", "👉 COVID-19 symptom diary experiences: g, mg | day", "40788441"),
                    Reference("Sci Rep. 2025 Jun 2;15(1):19325", "👉 Psychotria rubra tea suppresses inflammatory response: No clear dose/effect/duration found", "40456967"),

                    // Vitamins
                    Reference("Asia Pac J Clin Nutr. 2025 Aug;34(4):596-609", "👉 Multivitamin-mineral supplementation prevents acute upper respiratory tract infections: Positive/therapeutic effect mentioned | month", "40738727"),
                    Reference("Intern Emerg Med. 2025 Sep;20(6):1721-1729", "👉 Vitamin D insufficiency in PFAPA syndrome: No clear dose/effect/duration found", "40514613"),
                    Reference("Cureus. 2025 Mar 18;17(3):e80772", "👉 Multidisciplinary approach to chronic pharyngitis: mcg, mg | Positive/therapeutic effect mentioned | day", "40248524"),

                    // Minerals
                    Reference("Asia Pac J Clin Nutr. 2025 Aug;34(4):596-609", "👉 Multivitamin-mineral supplementation prevents acute URTIs: Positive/therapeutic effect mentioned | month", "40738727"),
                    Reference("Ear Nose Throat J. 2025 May 15:1455613251342154", "👉 Cricoid cartilage calcification case: No clear dose/effect/duration found", "40375656"),
                    Reference("Cochrane Database Syst Rev. 2024 May 9;5(5):CD014914", "👉 Zinc for prevention/treatment of common cold: g, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day, month", "38719213"),

                    // Supplements
                    Reference("Asia Pac J Clin Nutr. 2025 Aug;34(4):596-609", "👉 Multivitamin-mineral supplementation prevents acute URTIs: Positive/therapeutic effect mentioned | month", "40738727"),
                    Reference("Midwifery. 2025 Sep;148:104497", "👉 Safe medication use during breastfeeding: Positive/therapeutic effect mentioned", "40561930"),
                    Reference("Viruses. 2025 Mar 27;17(4):480", "👉 Predictors of Mpox complications in hospitalized patients: G, G", "40284923"),

                    // Nutrients
                    Reference("Food Sci Nutr. 2025 Sep 18;13(9):e70935", "👉 Euglena gracilis suppresses cold symptoms in healthy individuals: Positive/therapeutic effect mentioned | week", "40979570"),
                    Reference("Asia Pac J Clin Nutr. 2025 Aug;34(4):596-609", "👉 Multivitamin-mineral supplementation prevents acute URTIs: Positive/therapeutic effect mentioned | month", "40738727"),
                    Reference("Clin Lab. 2023 Nov 1;69(11)", "👉 Blood cells, vitamin D, and inflammatory factors in children with PFAPA syndrome: No clear dose/effect/duration found", "37948479")
                )
            )

            "Sore throat in children" -> Pair(
                """
Alternative approaches
1. Conservative antibiotic therapy: week
2. Evolving treatment strategies for invasive Streptococcus pyogenes: Positive/therapeutic effect mentioned
3. Promoting safe medication use during breastfeeding: Positive/therapeutic effect mentioned

Herbs
1. Zinc for prevention and treatment of common cold: g, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day, month
2. Chewable cough tablets: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day, month
3. Phytotherapy for acute upper respiratory infections: No clear dose/effect/duration found

Amino acids
1. Pudilan xiaoyan oral liquid in young vs adult rats: Negative/adverse effect mentioned
2. Ectopic lingual thyroid with subclinical hypothyroidism: Positive/therapeutic effect mentioned
3. Inflammatory response and metabolic adaptation in children: g, g

Vitamins
1. Vitamin D insufficiency in PFAPA syndrome: No clear dose/effect/duration found
2. Coinfection SARS-CoV-2 and polyomavirus: week, day
3. Dynamic indicators of antioxidant system in children with acute respiratory pathology: Positive/therapeutic effect mentioned

Minerals
1. Zinc for prevention and treatment of common cold: g, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day, month
2. Calcium hydroxyapatite for velopharyngeal insufficiency: No clear dose/effect/duration found
3. Fruits, vegetables, fiber intake and COVID-19 symptoms: Positive/therapeutic effect mentioned

Supplements
1. Safe medication use during breastfeeding: Positive/therapeutic effect mentioned
2. Clinical predictors of Mpox complications: G, G
3. Paraprobiotic lozenges (Lactobacillus helveticus MIMLh5): Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Nutrients
1. Blood cells, vitamin D, inflammatory factors in PFAPA syndrome: No clear dose/effect/duration found
2. Vitamin D in chronic tonsillitis: IU | Positive/therapeutic effect mentioned | month
3. Vitamin D levels in recurrent acute tonsillitis in children: No clear dose/effect/duration found
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Eur J Pediatr. 2025 Sep 18;184(10):622", "👉 Conservative antibiotic therapy: week", "40962928"),
                    Reference("Clin Exp Pediatr. 2025 Aug 11", "👉 Evolving treatment strategies for invasive Streptococcus pyogenes: Positive/therapeutic effect mentioned", "40808582"),
                    Reference("Midwifery. 2025 Sep;148:104497", "👉 Promoting safe medication use during breastfeeding: Positive/therapeutic effect mentioned", "40561930"),

                    // Herbs
                    Reference("Cochrane Database Syst Rev. 2024 May 9;5(5):CD014914", "👉 Zinc for prevention and treatment of common cold: g, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day, month", "38719213"),
                    Reference("Pak J Pharm Sci. 2019 Jan;32(1(Supplementary)):339-343", "👉 Chewable cough tablets: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day, month", "30829213"),
                    Reference("Otolaryngol Pol. 2018 Aug 31;72(4):42-50", "👉 Phytotherapy for acute upper respiratory infections: No clear dose/effect/duration found", "30220668"),

                    // Amino acids
                    Reference("J Ethnopharmacol. 2024 Nov 15;334:118528", "👉 Pudilan xiaoyan oral liquid in young vs adult rats: Negative/adverse effect mentioned", "38972526"),
                    Reference("J Pediatr Endocrinol Metab. 2024 Mar 12;37(5):472-476", "👉 Ectopic lingual thyroid with subclinical hypothyroidism: Positive/therapeutic effect mentioned", "38465442"),
                    Reference("Wiad Lek. 2023;76(3):540-547", "👉 Inflammatory response and metabolic adaptation in children: g, g", "37057777"),

                    // Vitamins
                    Reference("Intern Emerg Med. 2025 Sep;20(6):1721-1729", "👉 Vitamin D insufficiency in PFAPA syndrome: No clear dose/effect/duration found", "40514613"),
                    Reference("J Med Case Rep. 2024 Dec 31;18(1):646", "👉 Coinfection SARS-CoV-2 and polyomavirus: week, day", "39741335"),
                    Reference("Wiad Lek. 2024;77(10):1928-1937", "👉 Dynamic indicators of antioxidant system in children with acute respiratory pathology: Positive/therapeutic effect mentioned", "39661885"),

                    // Minerals
                    Reference("Cochrane Database Syst Rev. 2024 May 9;5(5):CD014914", "👉 Zinc for prevention and treatment of common cold: g, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day, month", "38719213"),
                    Reference("Cleft Palate Craniofac J. 2025 Feb;62(2):347-350", "👉 Calcium hydroxyapatite for velopharyngeal insufficiency: No clear dose/effect/duration found", "37849286"),
                    Reference("Front Nutr. 2022 Sep 29;9:934568", "👉 Fruits, vegetables, fiber intake and COVID-19 symptoms: Positive/therapeutic effect mentioned", "36245547"),

                    // Supplements
                    Reference("Midwifery. 2025 Sep;148:104497", "👉 Safe medication use during breastfeeding: Positive/therapeutic effect mentioned", "40561930"),
                    Reference("Viruses. 2025 Mar 27;17(4):480", "👉 Clinical predictors of Mpox complications: G, G", "40284923"),
                    Reference("Medicina (Kaunas). 2024 Jul 30;60(8):1235", "👉 Paraprobiotic lozenges (Lactobacillus helveticus MIMLh5): Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "39202516"),

                    // Nutrients
                    Reference("Clin Lab. 2023 Nov 1;69(11)", "👉 Blood cells, vitamin D, inflammatory factors in PFAPA syndrome: No clear dose/effect/duration found", "37948479"),
                    Reference("Sci Rep. 2023 May 17;13(1):8014", "👉 Vitamin D in chronic tonsillitis: IU | Positive/therapeutic effect mentioned | month", "37198277"),
                    Reference("Int J Environ Res Public Health. 2022 Jul 18;19(14):8744", "👉 Vitamin D levels in recurrent acute tonsillitis in children: No clear dose/effect/duration found", "35886596")
                )
            )

            "Stomach cancer" -> Pair(
                """
Alternative approaches
1. rasH2(TM) mouse carcinogenicity studies: Negative/adverse effect mentioned | week
2. Left-sided three-port laparoscopic gastric cancer surgery: g | Positive/therapeutic effect mentioned
3. ELK1 modulation in gastric cancer: No clear dose/effect/duration found

Herbs
1. Luteolin suppresses migration and invasion in hepatocellular carcinoma: Positive/therapeutic effect mentioned
2. Medicinal plants for cancer-related malnutrition: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Modified Lichong decoction anti-gastric cancer properties: mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week

Amino acids
1. Amino acid profiling in gastric cancer metabolism: g | Positive/therapeutic effect mentioned
2. Targeting AQP5-mediated arginine deprivation in gastric cancer stem cells: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Helicobacter pylori CagA promotes oncogenic transformation: Positive/therapeutic effect mentioned

Vitamins
1. Systemic Immune-Inflammation Index in gastric cancers receiving FLOT therapy: month
2. Hepatoid carcinoma of pancreas: Positive/therapeutic effect mentioned
3. Gastric leiomyosarcoma: No clear dose/effect/duration found

Minerals
1. Radon contamination in groundwater: g, g
2. Sophoridine-loaded nanoparticles for gastric adenocarcinoma therapy: Positive/therapeutic effect mentioned
3. Oxaliplatin + 5-Fluorouracil chemotherapy for gastric cancer: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Supplements
1. Targeting AQP5-mediated arginine deprivation in gastric cancer stem cells: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Hericium erinaceus supplement: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Probiotic action against gastrointestinal cancers: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Nutrients
1. Vitamin A intake and cancer risk: µg, µg
2. Dietary intake post-esophagectomy and reactive hypoglycemia: g | Positive/therapeutic effect mentioned | day, month
3. Nutrition impact symptoms after curative-intent treatment: Positive/therapeutic effect mentioned | month
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Int J Toxicol. 2025 Sep 27", "👉 rasH2(TM) mouse carcinogenicity studies: Negative/adverse effect mentioned | week", "41014102"),
                    Reference("Front Oncol. 2025 Sep 8", "👉 Left-sided three-port laparoscopic gastric cancer surgery: g | Positive/therapeutic effect mentioned", "40989685"),
                    Reference("Neoplasma. 2025 Aug;72(4):275-285", "👉 ELK1 modulation in gastric cancer: No clear dose/effect/duration found", "40958521"),

                    // Herbs
                    Reference("Transl Oncol. 2025 Nov;61:102511", "👉 Luteolin suppresses migration and invasion in hepatocellular carcinoma: Positive/therapeutic effect mentioned", "40857906"),
                    Reference("Cancer Cell Int. 2025 Jul 16;25(1):266", "👉 Medicinal plants for cancer-related malnutrition: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40671046"),
                    Reference("J Ethnopharmacol. 2025 May 12;347:119806", "👉 Modified Lichong decoction anti-gastric cancer properties: mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week", "40233887"),

                    // Amino acids
                    Reference("Biomedicines. 2025 Sep 10;13(9):2220", "👉 Amino acid profiling in gastric cancer metabolism: g | Positive/therapeutic effect mentioned", "41007784"),
                    Reference("Cell Rep Med. 2025 Sep 16;6(9):102333", "👉 Targeting AQP5-mediated arginine deprivation in gastric cancer stem cells: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40961922"),
                    Reference("Biochim Biophys Acta Mol Basis Dis. 2025 Nov;1871(8):168018", "👉 Helicobacter pylori CagA promotes oncogenic transformation: Positive/therapeutic effect mentioned", "40818175"),

                    // Vitamins
                    Reference("Medicina (Kaunas). 2025 Sep 6;61(9):1614", "👉 Systemic Immune-Inflammation Index in gastric cancers receiving FLOT therapy: month", "41011005"),
                    Reference("J Cancer Res Ther. 2025 Jul 1;21(5):1075-1078", "👉 Hepatoid carcinoma of pancreas: Positive/therapeutic effect mentioned", "41004299"),
                    Reference("BMJ Case Rep. 2025 Sep 25;18(9):e265246", "👉 Gastric leiomyosarcoma: No clear dose/effect/duration found", "40998546"),

                    // Minerals
                    Reference("Environ Geochem Health. 2025 Sep 10;47(10):430", "👉 Radon contamination in groundwater: g, g", "40926141"),
                    Reference("Int J Biol Macromol. 2025 Aug;320(Pt 1):145665", "👉 Sophoridine-loaded nanoparticles for gastric adenocarcinoma therapy: Positive/therapeutic effect mentioned", "40609934"),
                    Reference("Int J Nanomedicine. 2025 Jun 17;20:7763-7780", "👉 Oxaliplatin + 5-Fluorouracil chemotherapy for gastric cancer: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40546800"),

                    // Supplements
                    Reference("Cell Rep Med. 2025 Sep 16;6(9):102333", "👉 Targeting AQP5-mediated arginine deprivation in gastric cancer stem cells: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40961922"),
                    Reference("Front Nutr. 2025 Sep 1;12:1641246", "👉 Hericium erinaceus supplement: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40959699"),
                    Reference("Int J Mol Sci. 2025 Aug 14;26(16):7857", "👉 Probiotic action against gastrointestinal cancers: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40869174"),

                    // Nutrients
                    Reference("Nutrients. 2025 Aug 25;17(17):2744", "👉 Vitamin A intake and cancer risk: µg, µg", "40944135"),
                    Reference("Nutr Clin Pract. 2025 Sep 7", "👉 Dietary intake post-esophagectomy and reactive hypoglycemia: g | Positive/therapeutic effect mentioned | day, month", "40914827"),
                    Reference("Nutrients. 2025 Aug 20;17(16):2691", "👉 Nutrition impact symptoms after curative-intent treatment: Positive/therapeutic effect mentioned | month", "40871719")
                )
            )

            "Stomach ulcers" -> Pair(
                """
Alternative approaches
1. Violacein against gastric ulceration: mg | Positive/therapeutic effect mentioned
2. Alternative approach for complicated peptic ulcer perforation: Positive/therapeutic effect mentioned
3. Advances in surgical management of malignant gastric outlet obstruction: Positive/therapeutic effect mentioned

Herbs
1. Ethnomedicinal plants for gastrointestinal disorders: g, g
2. Fuzi Lizhong Decoction on gastric ulcer: No clear dose/effect/duration found
3. Angelica glauca root for gastroprotective potential: mg, μg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Amino acids
1. Rebamipide + tegoprazan combination therapy for ESD-induced gastric ulcers: No clear dose/effect/duration found
2. Vernonia anthelmintica seed in aspirin-induced ulcer rats: mg, μg | Positive/therapeutic effect mentioned
3. Pancratium maritimum extract anti-ulceration effect in rats: mg | Positive/therapeutic effect mentioned

Vitamins
1. Valerian extract ± CoQ10 in gastric ulcers: g | Positive/therapeutic effect mentioned
2. Vitamin D3 mitigates aspirin-induced gastric injury: g | Positive/therapeutic effect mentioned
3. Vitamin U + antacids relieve gastric ulcers in pigs: mg | Positive/therapeutic effect mentioned

Minerals
1. Vibrational signatures for gastric ulcer genesis: Positive/therapeutic effect mentioned
2. Yeast-mediated SeNPs on gastric ulcer healing: mg | Positive/therapeutic effect mentioned
3. Salvia indica L. + Selenium gastroprotective effects: µg, g, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week

Supplements
1. Ferula plant extract against indomethacin-induced gastric ulcer: mg | Positive/therapeutic effect mentioned
2. Impact of H. pylori infection and eradication therapies on gut microbiota: Positive/therapeutic effect mentioned
3. Daidzein alleviates ethanol-induced acute gastric injury: No clear dose/effect/duration found

Nutrients
1. Citrus reticulata 'Chachi' polysaccharide alleviates alcohol-induced gastric ulcer: mg | Positive/therapeutic effect mentioned
2. XAI-driven deep learning framework for GI tract disease diagnosis: Positive/therapeutic effect mentioned
3. Dendrobium officinale extract on aspirin-induced gastric lesions: Positive/therapeutic effect mentioned | day
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Biomed Pharmacother. 2025 Oct;191:118544", "👉 Violacein against gastric ulceration: mg | Positive/therapeutic effect mentioned", "40939257"),
                    Reference("Oxf Med Case Reports. 2025 Aug 20", "👉 Alternative approach for complicated peptic ulcer perforation: Positive/therapeutic effect mentioned", "40843041"),
                    Reference("Cancers (Basel). 2025 Aug 4;17(15):2567", "👉 Advances in surgical management of malignant gastric outlet obstruction: Positive/therapeutic effect mentioned", "40805262"),

                    // Herbs
                    Reference("Sci Rep. 2025 Aug 21;15(1):30683", "👉 Ethnomedicinal plants for gastrointestinal disorders: g, g", "40841421"),
                    Reference("Arch Pharm (Weinheim). 2025 Jul;358(7):e70036", "👉 Fuzi Lizhong Decoction on gastric ulcer: No clear dose/effect/duration found", "40629957"),
                    Reference("Fitoterapia. 2025 Jun;183:106565", "👉 Angelica glauca root for gastroprotective potential: mg, μg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40274199"),

                    // Amino acids
                    Reference("Sci Rep. 2025 Jul 25;15(1):27127", "👉 Rebamipide + tegoprazan combination therapy for ESD-induced gastric ulcers: No clear dose/effect/duration found", "40715454"),
                    Reference("Recent Pat Biotechnol. 2025 Jul 2", "👉 Vernonia anthelmintica seed in aspirin-induced ulcer rats: mg, μg | Positive/therapeutic effect mentioned", "40611428"),
                    Reference("PLoS One. 2025 Apr 16;20(4):e0321018", "👉 Pancratium maritimum extract anti-ulceration effect in rats: mg | Positive/therapeutic effect mentioned", "40238859"),

                    // Vitamins
                    Reference("J Mol Histol. 2025 May 28;56(3):176", "👉 Valerian extract ± CoQ10 in gastric ulcers: g | Positive/therapeutic effect mentioned", "40425957"),
                    Reference("Tissue Cell. 2025 Apr;93:102724", "👉 Vitamin D3 mitigates aspirin-induced gastric injury: g | Positive/therapeutic effect mentioned", "39823708"),
                    Reference("J Anim Physiol Anim Nutr (Berl). 2025 Mar;109(2):584-589", "👉 Vitamin U + antacids relieve gastric ulcers in pigs: mg | Positive/therapeutic effect mentioned", "39569536"),

                    // Minerals
                    Reference("Biomaterials. 2025 Nov;322:123383", "👉 Vibrational signatures for gastric ulcer genesis: Positive/therapeutic effect mentioned", "40367813"),
                    Reference("Tissue Cell. 2025 Oct;96:102953", "👉 Yeast-mediated SeNPs on gastric ulcer healing: mg | Positive/therapeutic effect mentioned", "40334393"),
                    Reference("Biol Trace Elem Res. 2025 Sep;203(9):4919-4934", "👉 Salvia indica L. + Selenium gastroprotective effects: µg, g, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week", "39976886"),

                    // Supplements
                    Reference("Food Sci Nutr. 2025 Jul 30;13(8):e70730", "👉 Ferula plant extract against indomethacin-induced gastric ulcer: mg | Positive/therapeutic effect mentioned", "40746654"),
                    Reference("Front Cell Infect Microbiol. 2025 Jul 7;15:1592977", "👉 Impact of H. pylori infection and eradication therapies on gut microbiota: Positive/therapeutic effect mentioned", "40692683"),
                    Reference("Phytomedicine. 2025 Jul 25;143:156887", "👉 Daidzein alleviates ethanol-induced acute gastric injury: No clear dose/effect/duration found", "40466503"),

                    // Nutrients
                    Reference("Nutrients. 2025 Jun 20;17(13):2062", "👉 Citrus reticulata 'Chachi' polysaccharide alleviates alcohol-induced gastric ulcer: mg | Positive/therapeutic effect mentioned", "40647169"),
                    Reference("Sci Rep. 2025 Jul 1;15(1):21139", "👉 XAI-driven deep learning framework for GI tract disease diagnosis: Positive/therapeutic effect mentioned", "40596500"),
                    Reference("Mol Immunol. 2025 Mar;179:42-51", "👉 Dendrobium officinale extract on aspirin-induced gastric lesions: Positive/therapeutic effect mentioned | day", "39919349")
                )
            )

            "Stroke" -> Pair(
                """
Alternative approaches
1. Persistent Visual Deficits in Minor Ischemic Stroke: day, day
2. Restoration of Cardiac Function via Conduction System Pacing: Positive/therapeutic effect mentioned | month
3. EEG-based motor hotspot localization using CNNs in stroke: Positive/therapeutic effect mentioned

Herbs
1. Phytonutrients and neuroprotective role in brain disorders: Negative/adverse effect mentioned
2. Protective mechanism of Hua-Feng-Dan in ischemic stroke: No clear dose/effect/duration found
3. TCM herbs for post-ischemic stroke cognitive impairment: No clear dose/effect/duration found

Amino acids
1. Cerebrolysin as adjuvant therapy in acute ischemic stroke: Positive/therapeutic effect mentioned | day
2. Essential amino acid supplementation in subacute hemiplegic stroke: g, mg | Positive/therapeutic effect mentioned | day, month
3. Homocysteine-mediated neuronal pyroptosis in heatstroke rats: Positive/therapeutic effect mentioned

Vitamins
1. Composite dietary antioxidant index and peripheral artery disease: Positive/therapeutic effect mentioned
2. Timing and safety of anticoagulation after intracranial hemorrhage: day, day
3. Mendelian randomization of migraine risk factors: g | Positive/therapeutic effect mentioned

Minerals
1. Neuroprotective effects of low-dose graphenic materials: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Burden of low bone mineral density: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Dairy consumption and cardiovascular/bone health outcomes: Positive/therapeutic effect mentioned

Supplements
1. Endothelial activation and stress index in CVD: No clear dose/effect/duration found
2. Synbiotic supplementation with probiotics + omega-3 enhances muscle strength in athletes: Positive/therapeutic effect mentioned
3. 2HELPS2B score for seizure risk prediction in ICU: No clear dose/effect/duration found

Nutrients
1. Synbiotic supplementation with probiotics + omega-3 enhances muscle strength in athletes: Positive/therapeutic effect mentioned
2. Coated glucose microbeads stimulate enteric hormone release: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week
3. Neuroprotective role of curcumin: Positive/therapeutic effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("J Stroke Cerebrovasc Dis. 2025 Sep 25;108458", "👉 Persistent Visual Deficits in Minor Ischemic Stroke: day, day", "41015218"),
                    Reference("Am J Case Rep. 2025 Sep 27;26:e948576", "👉 Restoration of Cardiac Function via Conduction System Pacing: Positive/therapeutic effect mentioned | month", "41013877"),
                    Reference("J Neuroeng Rehabil. 2025 Sep 26;22(1):193", "👉 EEG-based motor hotspot localization using CNNs in stroke: Positive/therapeutic effect mentioned", "41013546"),

                    // Herbs
                    Reference("Front Mol Biosci. 2025 Sep 2;12:1607330", "👉 Phytonutrients and neuroprotective role in brain disorders: Negative/adverse effect mentioned", "40964091"),
                    Reference("Phytomedicine. 2025 Sep 10;148:157251", "👉 Protective mechanism of Hua-Feng-Dan in ischemic stroke: No clear dose/effect/duration found", "40961540"),
                    Reference("Brain Behav. 2025 Sep;15(9):e70829", "👉 TCM herbs for post-ischemic stroke cognitive impairment: No clear dose/effect/duration found", "40898703"),

                    // Amino acids
                    Reference("Medicina (Kaunas). 2025 Aug 26;61(9):1531", "👉 Cerebrolysin as adjuvant therapy in acute ischemic stroke: Positive/therapeutic effect mentioned | day", "41010922"),
                    Reference("Metabolites. 2025 Sep 19;15(9):626", "👉 Essential amino acid supplementation in subacute hemiplegic stroke: g, mg | Positive/therapeutic effect mentioned | day, month", "41003011"),
                    Reference("Cells. 2025 Sep 15;14(18):1437", "👉 Homocysteine-mediated neuronal pyroptosis in heatstroke rats: Positive/therapeutic effect mentioned", "41002402"),

                    // Vitamins
                    Reference("Front Nutr. 2025 Sep 10;12:1606769", "👉 Composite dietary antioxidant index and peripheral artery disease: Positive/therapeutic effect mentioned", "41001125"),
                    Reference("Neurology. 2025 Oct 21;105(8):e214184", "👉 Timing and safety of anticoagulation after intracranial hemorrhage: day, day", "40997282"),
                    Reference("Front Neurol. 2025 Sep 9;16:1660995", "👉 Mendelian randomization of migraine risk factors: g | Positive/therapeutic effect mentioned", "40994718"),

                    // Minerals
                    Reference("Int J Mol Sci. 2025 Sep 10;26(18):8821", "👉 Neuroprotective effects of low-dose graphenic materials: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41009388"),
                    Reference("Lancet Rheumatol. 2025 Sep 16:S2665-9913(25)00105-5", "👉 Burden of low bone mineral density: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40972625"),
                    Reference("Nutrients. 2025 Aug 22;17(17):2723", "👉 Dairy consumption and cardiovascular/bone health outcomes: Positive/therapeutic effect mentioned", "40944114"),

                    // Supplements
                    Reference("BMC Cardiovasc Disord. 2025 Sep 26;25(1):681", "👉 Endothelial activation and stress index in CVD: No clear dose/effect/duration found", "41013243"),
                    Reference("Nutrients. 2025 Sep 15;17(18):2959", "👉 Synbiotic supplementation with probiotics + omega-3 enhances muscle strength in athletes: Positive/therapeutic effect mentioned", "41010484"),
                    Reference("Life (Basel). 2025 Sep 17;15(9):1455", "👉 2HELPS2B score for seizure risk prediction in ICU: No clear dose/effect/duration found", "41010397"),

                    // Nutrients
                    Reference("Nutrients. 2025 Sep 15;17(18):2959", "👉 Synbiotic supplementation with probiotics + omega-3 enhances muscle strength in athletes: Positive/therapeutic effect mentioned", "41010484"),
                    Reference("Diabetes Obes Metab. 2025 Sep 17", "👉 Coated glucose microbeads stimulate enteric hormone release: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week", "40959944"),
                    Reference("Nutrients. 2025 Sep 6;17(17):2884", "👉 Neuroprotective role of curcumin: Positive/therapeutic effect mentioned", "40944272")
                )
            )

            "Stress" -> Pair(
                """
Alternative approaches
1. Stem cell-based therapies for major and treatment-resistant depression: No clear dose/effect/duration found
2. Transcranial electrical stimulation in chronic pain: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day
3. Effects of pair housing on dairy calf welfare and productivity: Positive/therapeutic effect mentioned

Herbs
1. TCM subtyping and treatment of depression via machine learning: No clear dose/effect/duration found
2. Salvianolic acid B + Senkyunolide I alleviate cardiac hypertrophy: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Scutellaria baicalensis and Lonicera japonica against oxidative stress in non-ruminants: Positive/therapeutic effect mentioned

Amino acids
1. Codon-specific ribosome stalling during BCAA starvation: No clear dose/effect/duration found
2. Glutamine synthetase protects TNBC cells from ferroptosis: Positive/therapeutic effect mentioned
3. BoRR gene family in cauliflower: Positive/therapeutic effect mentioned

Vitamins
1. Serum vitamin C and biological aging: mg, G | Positive/therapeutic effect mentioned
2. Somatic embryogenesis and transcriptomics in Quercus suber: g, mg
3. Dual behavior of Trolox under oxidative stress in HeLa & 3T3: Positive/therapeutic effect mentioned

Minerals
1. Biomimetic Cu(2-x)Se nanoplatforms in glioblastoma treatment: Positive/therapeutic effect mentioned
2. Nanoparticle functionalization in photodynamic therapy: Positive/therapeutic effect mentioned
3. Chromium yeast supplementation on heat-stressed lambs: mg | Positive/therapeutic effect mentioned | day

Supplements
1. OsZFP252-OsGA20ox5 mediated drought tolerance in rice: g | Positive/therapeutic effect mentioned
2. Curcumin protects goat sperm from BPA and cryopreservation stress: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Endothelial activation and stress index in cardiovascular disease: No clear dose/effect/duration found

Nutrients
1. Codon-specific ribosome stalling during BCAA starvation: No clear dose/effect/duration found
2. Nitrogen affects aerenchyma formation in maize roots: G | Positive/therapeutic effect mentioned
3. Sargassum fusiforme improves prawn growth and microbial environment: Positive/therapeutic effect mentioned | day
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Cell J. 2025 Sep 28;27(1):1-12", "👉 Stem cell-based therapies for major and treatment-resistant depression: No clear dose/effect/duration found", "41015852"),
                    Reference("Anaesth Crit Care Pain Med. 2025 Sep 25:101613", "👉 Transcranial electrical stimulation in chronic pain: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day", "41015289"),
                    Reference("J Dairy Sci. 2025 Sep 25:S0022-0302(25)00777-5", "👉 Effects of pair housing on dairy calf welfare and productivity: Positive/therapeutic effect mentioned", "41015236"),

                    // Herbs
                    Reference("J Tradit Chin Med. 2025 Oct;45(5):1152-1163", "👉 TCM subtyping and treatment of depression via machine learning: No clear dose/effect/duration found", "41015814"),
                    Reference("Chin Med. 2025 Sep 28;20(1):148", "👉 Salvianolic acid B + Senkyunolide I alleviate cardiac hypertrophy: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41015772"),
                    Reference("Vet Sci. 2025 Aug 26;12(9):816", "👉 Scutellaria baicalensis and Lonicera japonica against oxidative stress in non-ruminants: Positive/therapeutic effect mentioned", "41012743"),

                    // Amino acids
                    Reference("Genome Biol. 2025 Sep 27;26(1):315", "👉 Codon-specific ribosome stalling during BCAA starvation: No clear dose/effect/duration found", "41015776"),
                    Reference("Breast Cancer Res. 2025 Sep 26;27(1):165", "👉 Glutamine synthetase protects TNBC cells from ferroptosis: Positive/therapeutic effect mentioned", "41013471"),
                    Reference("BMC Genomics. 2025 Sep 26;26(1):834", "👉 BoRR gene family in cauliflower: Positive/therapeutic effect mentioned", "41013194"),

                    // Vitamins
                    Reference("Eur J Med Res. 2025 Sep 26;30(1):864", "👉 Serum vitamin C and biological aging: mg, G | Positive/therapeutic effect mentioned", "41013587"),
                    Reference("Plants (Basel). 2025 Sep 12;14(18):2855", "👉 Somatic embryogenesis and transcriptomics in Quercus suber: g, mg", "41012008"),
                    Reference("Molecules. 2025 Sep 16;30(18):3755", "👉 Dual behavior of Trolox under oxidative stress in HeLa & 3T3: Positive/therapeutic effect mentioned", "41011647"),

                    // Minerals
                    Reference("J Nanobiotechnology. 2025 Sep 26;23(1):609", "👉 Biomimetic Cu(2-x)Se nanoplatforms in glioblastoma treatment: Positive/therapeutic effect mentioned", "41013700"),
                    Reference("BMC Oral Health. 2025 Sep 26;25(1):1451", "👉 Nanoparticle functionalization in photodynamic therapy: Positive/therapeutic effect mentioned", "41013581"),
                    Reference("Vet Sci. 2025 Aug 24;12(9):801", "👉 Chromium yeast supplementation on heat-stressed lambs: mg | Positive/therapeutic effect mentioned | day", "41012727"),

                    // Supplements
                    Reference("Plant J. 2025 Sep;123(6):e70497", "👉 OsZFP252-OsGA20ox5 mediated drought tolerance in rice: g | Positive/therapeutic effect mentioned", "41014642"),
                    Reference("Vet Res Commun. 2025 Sep 27;49(6):332", "👉 Curcumin protects goat sperm from BPA and cryopreservation stress: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41014447"),
                    Reference("BMC Cardiovasc Disord. 2025 Sep 26;25(1):681", "👉 Endothelial activation and stress index in cardiovascular disease: No clear dose/effect/duration found", "41013243"),

                    // Nutrients
                    Reference("Genome Biol. 2025 Sep 27;26(1):315", "👉 Codon-specific ribosome stalling during BCAA starvation: No clear dose/effect/duration found", "41015776"),
                    Reference("Plant Sci. 2025 Sep 25:112786", "👉 Nitrogen affects aerenchyma formation in maize roots: G | Positive/therapeutic effect mentioned", "41015344"),
                    Reference("Mar Environ Res. 2025 Sep 22;212:107575", "👉 Sargassum fusiforme improves prawn growth and microbial environment: Positive/therapeutic effect mentioned | day", "41014999")
                )
            )

            "Swollen glands" -> Pair(
                """
Alternative approaches
1. Novel three-part pharynx in symbiotic marine nematodes: No clear dose/effect/duration found
2. Amazonian Leishmania in hamster model: No clear dose/effect/duration found
3. Bilateral upper limb musculoskeletal amyloid: Positive/therapeutic effect mentioned | month

Herbs
1. Withania somnifera root extract pharmacokinetics in healthy volunteers: mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Amino acids
1. High-dose butylparaben impairs thyroid in rats: mg | Positive/therapeutic effect mentioned | week
2. MSG effects on thymus vascular bed in rats: g, mg | day, month
3. Marek's disease virus co-infection in hens: No clear dose/effect/duration found

Vitamins
1. Wi-Fi radiation and protective role of vitamin C + zinc in rats: Positive/therapeutic effect mentioned
2. Bilateral Bartholin's gland abscess with vitamin A deficiency: No clear dose/effect/duration found
3. Udder edema in dairy cattle: Positive/therapeutic effect mentioned

Minerals
1. Disseminated B-cell lymphoma in guinea pig: No clear dose/effect/duration found
2. Positive/therapeutic effect mentioned
3. Love bites in male frogs: No clear dose/effect/duration found

Supplements
1. Bilateral Bartholin's gland abscess: No clear dose/effect/duration found
2. Liquid diet + L-carnitine on parotid gland: Positive/therapeutic effect mentioned
3. Seven new Sabatieria species from New Zealand: No clear dose/effect/duration found

Nutrients
1. Larval anatomy differences in Oestridae: No clear dose/effect/duration found
2. ZnT4-null mice mammary gland defects: No clear dose/effect/duration found
3. Mastitis induction in cows with Klebsiella pneumoniae: No clear dose/effect/duration found
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Org Divers Evol. 2024;24(3):353-373", "👉 Novel three-part pharynx in symbiotic marine nematodes: No clear dose/effect/duration found", "39308636"),
                    Reference("PLoS Negl Trop Dis. 2024 Aug 9;18(8):e0012333", "👉 Amazonian Leishmania in hamster model: No clear dose/effect/duration found", "39121159"),
                    Reference("Am J Case Rep. 2023 Jan 27;24:e938582", "👉 Bilateral upper limb musculoskeletal amyloid: Positive/therapeutic effect mentioned | month", "36703525"),

                    // Herbs
                    Reference("J Ethnopharmacol. 2024 Mar 25;322:117603", "👉 Withania somnifera root extract pharmacokinetics in healthy volunteers: mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "38122911"),

                    // Amino acids
                    Reference("Sci Rep. 2024 Feb 24;14(1):4550", "👉 High-dose butylparaben impairs thyroid in rats: mg | Positive/therapeutic effect mentioned | week", "38402305"),
                    Reference("Wiad Lek. 2023;76(11):2491-2496", "👉 MSG effects on thymus vascular bed in rats: g, mg | day, month", "38112370"),
                    Reference("Avian Pathol. 2018 Feb;47(1):83-89", "👉 Marek's disease virus co-infection in hens: No clear dose/effect/duration found", "28859493"),

                    // Vitamins
                    Reference("J Microsc Ultrastruct. 2024 Apr 10;12(2):51-61", "👉 Wi-Fi radiation and protective role of vitamin C + zinc in rats: Positive/therapeutic effect mentioned", "39006042"),
                    Reference("BMC Infect Dis. 2024 May 11;24(1):487", "👉 Bilateral Bartholin's gland abscess with vitamin A deficiency: No clear dose/effect/duration found", "38734601"),
                    Reference("J Dairy Sci. 2021 Jun;104(6):7334-7341", "👉 Udder edema in dairy cattle: Positive/therapeutic effect mentioned", "33741160"),

                    // Minerals
                    Reference("Top Companion Anim Med. 2025 Sep 1;69:101020", "👉 Disseminated B-cell lymphoma in guinea pig: No clear dose/effect/duration found", "40902723"),
                    Reference("Acute and Subacute, and Riedel’s Thyroiditis", "👉 Positive/therapeutic effect mentioned", "25905408"),
                    Reference("Front Zool. 2021 Nov 25;18(1):59", "👉 Love bites in male frogs: No clear dose/effect/duration found", "34823558"),

                    // Supplements
                    Reference("BMC Infect Dis. 2024 May 11;24(1):487", "👉 Bilateral Bartholin's gland abscess: No clear dose/effect/duration found", "38734601"),
                    Reference("Folia Morphol (Warsz). 2015;74(1):42-9", "👉 Liquid diet + L-carnitine on parotid gland: Positive/therapeutic effect mentioned", "25792394"),
                    Reference("Zootaxa. 2013;3693:1-35", "👉 Seven new Sabatieria species from New Zealand: No clear dose/effect/duration found", "26185831"),

                    // Nutrients
                    Reference("Med Vet Entomol. 2021 Mar;35(1):106-120", "👉 Larval anatomy differences in Oestridae: No clear dose/effect/duration found", "32896916"),
                    Reference("Am J Physiol Regul Integr Comp Physiol. 2016 Jan 1;310(1):R33-40", "👉 ZnT4-null mice mammary gland defects: No clear dose/effect/duration found", "26538236"),
                    Reference("Vet Med (Praha). 1984 Apr;29(4):193-200", "👉 Mastitis induction in cows with Klebsiella pneumoniae: No clear dose/effect/duration found", "6426130")
                )
            )

            "Tinnitus" -> Pair(
                """
Alternative approaches
1. Venous sinus stenting vs ventriculoperitoneal shunting: Positive/therapeutic effect mentioned | day
2. DEFINE trial on digital tinnitus therapy: Positive/therapeutic effect mentioned
3. Endovascular management of jugular bulb duplication: month

Herbs
1. Phenolamides in Lycium spp.: Positive/therapeutic effect mentioned
2. Lycium genus review: No clear dose/effect/duration found
3. Ligustri Lucidi Fructus: Negative/adverse effect mentioned

Amino acids
1. Circulating metabolites and CKD: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. GABA and glutamate/glutamine associations with tinnitus: No clear dose/effect/duration found
3. Amino acids in acoustic trauma-induced tinnitus rats: Negative/adverse effect mentioned

Vitamins
1. Pharmacotherapy options for subjective tinnitus: Positive/therapeutic effect mentioned
2. Drug-induced hypesthesia from dexamethasone: mg | Negative/adverse effect mentioned | week, day
3. Auricular point acupressure therapy for noise-induced tinnitus: week

Minerals
1. Dietary vitamins and minerals with tinnitus: No clear dose/effect/duration found
2. Bone cement repair of malleus handle fractures: Positive/therapeutic effect mentioned
3. Graphene nanomaterials for neurodiagnostics: No clear dose/effect/duration found

Supplements
1. Virtual Progressive Tinnitus Management Group Care: Positive/therapeutic effect mentioned
2. Anxiety-depressive effects on tinnitus: No clear dose/effect/duration found
3. Migraine and cochlear disease MR study: No clear dose/effect/duration found

Nutrients
1. Dietary intakes with tinnitus: No clear dose/effect/duration found
2. Oxidative balance score and hearing loss: Positive/therapeutic effect mentioned
3. Net gastrointestinal alkali absorption and kidney stones: No clear dose/effect/duration found
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Interv Neuroradiol. 2025 Sep 10", "👉 Venous sinus stenting vs ventriculoperitoneal shunting: Positive/therapeutic effect mentioned | day", "40928831"),
                    Reference("PLoS One. 2025 Aug 14;20(8):e0324927", "👉 DEFINE trial on digital tinnitus therapy: Positive/therapeutic effect mentioned", "40811429"),
                    Reference("J Neurointerv Surg. 2025 Jul 30", "👉 Endovascular management of jugular bulb duplication: month", "40738745"),

                    // Herbs
                    Reference("J Ethnopharmacol. 2024 Sep 15;331:118220", "👉 Phenolamides in Lycium spp.: Positive/therapeutic effect mentioned", "38657878"),
                    Reference("Food Funct. 2023 Apr 3;14(7):2998-3025", "👉 Lycium genus review: No clear dose/effect/duration found", "36912477"),
                    Reference("J Ethnopharmacol. 2023 Jan 30;301:115789", "👉 Ligustri Lucidi Fructus: Negative/adverse effect mentioned", "36208822"),

                    // Amino acids
                    Reference("Ren Fail. 2025 Dec;47(1):2498090", "👉 Circulating metabolites and CKD: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40302304"),
                    Reference("Neuroreport. 2025 Mar 5;36(4):196-201", "👉 GABA and glutamate/glutamine associations with tinnitus: No clear dose/effect/duration found", "39976059"),
                    Reference("Audiol Res. 2024 Nov 17;14(6):1000-1013", "👉 Amino acids in acoustic trauma-induced tinnitus rats: Negative/adverse effect mentioned", "39585005"),

                    // Vitamins
                    Reference("BMJ Open. 2025 May 28;15(5):e096995", "👉 Pharmacotherapy options for subjective tinnitus: Positive/therapeutic effect mentioned", "40441764"),
                    Reference("Medicine (Baltimore). 2025 May 9;104(19):e41990", "👉 Drug-induced hypesthesia from dexamethasone: mg | Negative/adverse effect mentioned | week, day", "40355191"),
                    Reference("Noise Health. 2025 Jan-Feb 01;27(124):51-57", "👉 Auricular point acupressure therapy for noise-induced tinnitus: week", "40029678"),

                    // Minerals
                    Reference("Nutrients. 2024 Aug 2;16(15):2535", "👉 Dietary vitamins and minerals with tinnitus: No clear dose/effect/duration found", "39125414"),
                    Reference("Am J Otolaryngol. 2024 May-Jun;45(3):104256", "👉 Bone cement repair of malleus handle fractures: Positive/therapeutic effect mentioned", "38492552"),
                    Reference("Biosens Bioelectron. 2024 Mar 1;247:115906", "👉 Graphene nanomaterials for neurodiagnostics: No clear dose/effect/duration found", "38101185"),

                    // Supplements
                    Reference("Am J Audiol. 2025 Aug 7", "👉 Virtual Progressive Tinnitus Management Group Care: Positive/therapeutic effect mentioned", "40774290"),
                    Reference("Indian J Otolaryngol Head Neck Surg. 2025 Aug;77(8):2979-2991", "👉 Anxiety-depressive effects on tinnitus: No clear dose/effect/duration found", "40727161"),
                    Reference("Medicine (Baltimore). 2025 Jul 4;104(27):e42418", "👉 Migraine and cochlear disease MR study: No clear dose/effect/duration found", "40629613"),

                    // Nutrients
                    Reference("Nutrients. 2024 Aug 2;16(15):2535", "👉 Dietary intakes with tinnitus: No clear dose/effect/duration found", "39125414"),
                    Reference("Front Nutr. 2024 May 14;11:1375545", "👉 Oxidative balance score and hearing loss: Positive/therapeutic effect mentioned", "38812938"),
                    Reference("Clin J Am Soc Nephrol. 2023 Aug 1;18(8):1068-1074", "👉 Net gastrointestinal alkali absorption and kidney stones: No clear dose/effect/duration found", "37256914")
                )
            )

            "Toothache" -> Pair(
                """
Alternative approaches
1. Asarum sieboldii in dentistry: Positive/therapeutic effect mentioned
2. Acupuncture: Positive/therapeutic effect mentioned
3. Patient satisfaction with acupuncture: Positive/therapeutic effect mentioned

Herbs
1. Ethno-dentistry in North Waziristan: No clear dose/effect/duration found
2. Medicinal plants in Ethiopia: g | Positive/therapeutic effect mentioned
3. Caries-causing bacteria characterization: No clear dose/effect/duration found

Amino acids
1. Osbeckia stellata extracts: µg, mg | Positive/therapeutic effect mentioned
2. Syzygium aromaticum L.: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Allophylus edulis leaves: mg, μg | Positive/therapeutic effect mentioned

Vitamins
1. Aralia continentalis: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Irvingia gabonensis: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Syzygium aromaticum L.: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Minerals
1. Dentin hypersensitivity therapy: Positive/therapeutic effect mentioned
2. Hyperparathyroidism Jaw Tumor Syndrome: No clear dose/effect/duration found
3. Microwave ablation for thyroid nodules: day, month

Supplements
1. Processed Cimicifuga Rhizoma evaluation: No clear dose/effect/duration found
2. Genus Mimosa review: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Dental fear study in children: Positive/therapeutic effect mentioned

Nutrients
1. Symbiotic plant-herbivore relationship: Positive/therapeutic effect mentioned
2. Syzygium aromaticum L.: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Capsicum spp. and capsaicinoids: G | Positive/therapeutic effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Int Dent J. 2025 Aug;75(4):100816", "👉 Asarum sieboldii in dentistry: Positive/therapeutic effect mentioned", "40328202"),
                    Reference("Wiad Lek. 2025;78(3):595-601", "👉 Acupuncture: Positive/therapeutic effect mentioned", "40219888"),
                    Reference("J Pharm Bioallied Sci. 2024 Dec;16(Suppl 4):S3628-S3630", "👉 Patient satisfaction with acupuncture: Positive/therapeutic effect mentioned", "39926999"),

                    // Herbs
                    Reference("Int Dent J. 2024 Apr;74(2):310-320", "👉 Ethno-dentistry in North Waziristan: No clear dose/effect/duration found", "37953188"),
                    Reference("Evid Based Complement Alternat Med. 2023 Oct 18;2023:5545294", "👉 Medicinal plants in Ethiopia: g | Positive/therapeutic effect mentioned", "37886427"),
                    Reference("Microorganisms. 2023 Jul 31;11(8):1952", "👉 Caries-causing bacteria characterization: No clear dose/effect/duration found", "37630520"),

                    // Amino acids
                    Reference("Chem Biodivers. 2025 Jul 17:e00861", "👉 Osbeckia stellata extracts: µg, mg | Positive/therapeutic effect mentioned", "40674627"),
                    Reference("Front Nutr. 2022 Oct 14;9:1002147", "👉 Syzygium aromaticum L.: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "36313111"),
                    Reference("J Ethnopharmacol. 2023 Jan 30;301:115785", "👉 Allophylus edulis leaves: mg, μg | Positive/therapeutic effect mentioned", "36223847"),

                    // Vitamins
                    Reference("Molecules. 2024 Jul 26;29(15):3529", "👉 Aralia continentalis: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "39124933"),
                    Reference("J Ethnopharmacol. 2024 May 23;326:117942", "👉 Irvingia gabonensis: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "38395180"),
                    Reference("Front Nutr. 2022 Oct 14;9:1002147", "👉 Syzygium aromaticum L.: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "36313111"),

                    // Minerals
                    Reference("J Adv Res. 2025 Sep 23:S2090-1232(25)00749-0", "👉 Dentin hypersensitivity therapy: Positive/therapeutic effect mentioned", "40998255"),
                    Reference("JCEM Case Rep. 2024 Mar 4;2(3):luae020", "👉 Hyperparathyroidism Jaw Tumor Syndrome: No clear dose/effect/duration found", "38440124"),
                    Reference("Front Endocrinol (Lausanne). 2022 Aug 1;13:941137", "👉 Microwave ablation for thyroid nodules: day, month", "35979439"),

                    // Supplements
                    Reference("Biomed Chromatogr. 2025 Aug;39(8):e70141", "👉 Processed Cimicifuga Rhizoma evaluation: No clear dose/effect/duration found", "40530683"),
                    Reference("Biomolecules. 2022 Jan 5;12(1):83", "👉 Genus Mimosa review: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "35053231"),
                    Reference("Int J Environ Res Public Health. 2021 Aug 23;18(16):8883", "👉 Dental fear study in children: Positive/therapeutic effect mentioned", "34444632"),

                    // Nutrients
                    Reference("Microorganisms. 2023 Jul 24;11(7):1864", "👉 Symbiotic plant-herbivore relationship: Positive/therapeutic effect mentioned", "37513036"),
                    Reference("Front Nutr. 2022 Oct 14;9:1002147", "👉 Syzygium aromaticum L.: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "36313111"),
                    Reference("Int J Mol Sci. 2020 Jul 22;21(15):5179", "👉 Capsicum spp. and capsaicinoids: G | Positive/therapeutic effect mentioned", "32707790")
                )
            )

            "Tuberculosis" -> Pair(
                """
Alternative approaches
1. Antibacterial peptides via machine learning: No clear dose/effect/duration found
2. Interferon-Gamma Release Assays vs Tuberculin Skin Test: Positive/therapeutic effect mentioned
3. Panduratin A induces autophagy and restricts Mycobacterium tuberculosis: No clear dose/effect/duration found

Herbs
1. DRESS in Chinese patients: Negative/adverse effect mentioned
2. In vitro anti-diabetic potential of Ayurvedic herbs: Negative/adverse effect mentioned
3. Metabolic profiling of Ardisia plants: mg, mg

Amino acids
1. Tuberculous meningitis metabolomics: Positive/therapeutic effect mentioned
2. Knockdown of argininosuccinate lyase in Mycolicibacterium: No clear dose/effect/duration found
3. Rv3737 depletion reduces pathogen survival: Positive/therapeutic effect mentioned

Vitamins
1. High-dose vitamin D in ultramarathon runners: IU, IU
2. Vitamin D receptor gene polymorphism in HIV-TB co-infection: No clear dose/effect/duration found
3. Liver injury patterns in abdominal TB on treatment: week, day

Minerals
1. Low bone mineral density burden: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. TB-infected macrophage exosomal miR-125b-5p induces osteoporosis: Positive/therapeutic effect mentioned
3. Long-term COVID-19 impact on osteoporosis risk: Negative/adverse effect mentioned

Supplements
1. Depression induced by TB via interleukins: Positive/therapeutic effect mentioned
2. De novo prediction of antitubercular resistance: No clear dose/effect/duration found
3. Bacillus sonorensis PMC204 vesicles against drug-resistant TB: Positive/therapeutic effect mentioned

Nutrients
1. Wastewater microbial community and resistance: g, g
2. Inorganic sulfate critical for M. tuberculosis colonization: Positive/therapeutic effect mentioned
3. PPE51 modulates membrane integrity in M. marinum: g | Positive/therapeutic effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Macromol Rapid Commun. 2025 Sep 28:e00583", "👉 Antibacterial peptides via machine learning: No clear dose/effect/duration found", "41015931"),
                    Reference("Diagnostics (Basel). 2025 Sep 16;15(18):2343", "👉 Interferon-Gamma Release Assays vs Tuberculin Skin Test: Positive/therapeutic effect mentioned", "41008717"),
                    Reference("Mol Microbiol. 2025 Sep 26", "👉 Panduratin A induces autophagy and restricts Mycobacterium tuberculosis: No clear dose/effect/duration found", "41001742"),

                    // Herbs
                    Reference("Clin Cosmet Investig Dermatol. 2025 Mar 4;18:525-532", "👉 DRESS in Chinese patients: Negative/adverse effect mentioned", "40061046"),
                    Reference("Nat Prod Res. 2025 Jan 22", "👉 In vitro anti-diabetic potential of Ayurvedic herbs: Negative/adverse effect mentioned", "39841032"),
                    Reference("J Ethnopharmacol. 2025 Feb 27;342:119327", "👉 Metabolic profiling of Ardisia plants: mg, mg", "39761835"),

                    // Amino acids
                    Reference("Med Microbiol Immunol. 2025 Sep 27;214(1):46", "👉 Tuberculous meningitis metabolomics: Positive/therapeutic effect mentioned", "41014409"),
                    Reference("Tuberculosis (Edinb). 2025 Sep 19;155:102693", "👉 Knockdown of argininosuccinate lyase in Mycolicibacterium: No clear dose/effect/duration found", "40992203"),
                    Reference("Front Cell Infect Microbiol. 2025 Sep 2;15:1592296", "👉 Rv3737 depletion reduces pathogen survival: Positive/therapeutic effect mentioned", "40964050"),

                    // Vitamins
                    Reference("J Int Soc Sports Nutr. 2025 Dec;22(1):2561661", "👉 High-dose vitamin D in ultramarathon runners: IU, IU", "40963202"),
                    Reference("Infect Chemother. 2025 Sep 12", "👉 Vitamin D receptor gene polymorphism in HIV-TB co-infection: No clear dose/effect/duration found", "40958482"),
                    Reference("J Clin Exp Hepatol. 2025 Nov-Dec;15(6):103124", "👉 Liver injury patterns in abdominal TB on treatment: week, day", "40893337"),

                    // Minerals
                    Reference("Lancet Rheumatol. 2025 Sep 16:S2665-9913(25)00105-5", "👉 Low bone mineral density burden: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40972625"),
                    Reference("Inflamm Res. 2025 Sep 16;74(1):126", "👉 TB-infected macrophage exosomal miR-125b-5p induces osteoporosis: Positive/therapeutic effect mentioned", "40956311"),
                    Reference("Medicina (Kaunas). 2025 Jul 22;61(8):1320", "👉 Long-term COVID-19 impact on osteoporosis risk: Negative/adverse effect mentioned", "40870365"),

                    // Supplements
                    Reference("Trop Med Int Health. 2025 Sep 25", "👉 Depression induced by TB via interleukins: Positive/therapeutic effect mentioned", "40996096"),
                    Reference("mSphere. 2025 Sep 22:e0057125", "👉 De novo prediction of antitubercular resistance: No clear dose/effect/duration found", "40980905"),
                    Reference("Med Microbiol Immunol. 2025 Sep 19;214(1):43", "👉 Bacillus sonorensis PMC204 vesicles against drug-resistant TB: Positive/therapeutic effect mentioned", "40970967"),

                    // Nutrients
                    Reference("Sci Rep. 2025 Sep 25;15(1):32919", "👉 Wastewater microbial community and resistance: g, g", "40998902"),
                    Reference("Proc Natl Acad Sci U S A. 2025 Sep 30;122(39):e2503966122", "👉 Inorganic sulfate critical for M. tuberculosis colonization: Positive/therapeutic effect mentioned", "40982672"),
                    Reference("mBio. 2025 Sep 22:e0104425", "👉 PPE51 modulates membrane integrity in M. marinum: g | Positive/therapeutic effect mentioned", "40980894")
                )
            )

            "Tonsillitis" -> Pair(
                """
Alternative approaches
1. Outcomes of conservative antibiotic therapy in pediatric peritonsillar abscesses: week, week
2. Modified far lateral approach for 4th ventricular tumor: Positive/therapeutic effect mentioned
3. AI and health empowerment in isolated rural communities: mg, mg

Herbs
1. Rabdosia rubescens anti-tumor herbal remedy: Positive/therapeutic effect mentioned
2. Acupoint application for pharyngeal pain: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day
3. Ethnobotanical study in Ethiopia: g, g

Amino acids
1. Newcastle disease virus in chickens: No clear dose/effect/duration found
2. Infectious bursal disease virus variant: day, day
3. Rabdosia rubescens anti-tumor herbal remedy: Positive/therapeutic effect mentioned

Vitamins
1. Pediatric liquid medications and dental caries: Positive/therapeutic effect mentioned
2. Vitamin D in children undergoing adenoidectomy/tonsillectomy: Positive/therapeutic effect mentioned
3. Tonsil-derived MSC small extracellular vesicles: Positive/therapeutic effect mentioned | week, day

Minerals
1. Carob molasses antimicrobial/antioxidant effects: µg, mg | Positive/therapeutic effect mentioned
2. Exercise and osteoimmunology: No clear dose/effect/duration found
3. Metabolic insights from pigs during Streptococcus suis outbreaks: Positive/therapeutic effect mentioned

Supplements
1. Zinc glycinate alleviates necrotic enteritis in broilers: mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day
2. Pediatric liquid medications and dental caries: Positive/therapeutic effect mentioned
3. Effect of epinephrine on Actinobacillus pleuropneumoniae: No clear dose/effect/duration found

Nutrients
1. In ovo and water postbiotic supplementation in broilers: Positive/therapeutic effect mentioned
2. Methionine/threonine supplementation in Eimeria-challenged broilers: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Xylanase, protease, and xylo-oligosaccharides in Eimeria-challenged broilers: g | Positive/therapeutic effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Eur J Pediatr. 2025 Sep 18;184(10):622", "👉 Outcomes of conservative antibiotic therapy in pediatric peritonsillar abscesses: week, week", "40962928"),
                    Reference("World Neurosurg. 2025 Sep 12:124466", "👉 Modified far lateral approach for 4th ventricular tumor: Positive/therapeutic effect mentioned", "40946791"),
                    Reference("Front Digit Health. 2025 Aug 26;7:1655154", "👉 AI and health empowerment in isolated rural communities: mg, mg", "40933813"),

                    // Herbs
                    Reference("J Ethnopharmacol. 2025 Jan 31;340:119200", "👉 Rabdosia rubescens anti-tumor herbal remedy: Positive/therapeutic effect mentioned", "39631716"),
                    Reference("Chin J Integr Med. 2024 Jan;30(1):18-24", "👉 Acupoint application for pharyngeal pain: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day", "37340204"),
                    Reference("J Ethnobiol Ethnomed. 2021 Dec 24;17(1):71", "👉 Ethnobotanical study in Ethiopia: g, g", "34952609"),

                    // Amino acids
                    Reference("Infect Genet Evol. 2025 Jun;130:105742", "👉 Newcastle disease virus in chickens: No clear dose/effect/duration found", "40120636"),
                    Reference("Pathogens. 2024 Dec 23;13(12):1141", "👉 Infectious bursal disease virus variant: day, day", "39770400"),
                    Reference("J Ethnopharmacol. 2025 Jan 31;340:119200", "👉 Rabdosia rubescens anti-tumor herbal remedy: Positive/therapeutic effect mentioned", "39631716"),

                    // Vitamins
                    Reference("Health Sci Rep. 2025 Jul 23;8(7):e71115", "👉 Pediatric liquid medications and dental caries: Positive/therapeutic effect mentioned", "40704323"),
                    Reference("Lin Chuang Er Bi Yan Hou Tou Jing Wai Ke Za Zhi. 2025 Jun;39(6):515-522", "👉 Vitamin D in children undergoing adenoidectomy/tonsillectomy: Positive/therapeutic effect mentioned", "40443373"),
                    Reference("Tissue Eng Regen Med. 2025 Apr;22(3):285-295", "👉 Tonsil-derived MSC small extracellular vesicles: Positive/therapeutic effect mentioned | week, day", "39998743"),

                    // Minerals
                    Reference("J Food Sci. 2025 Feb;90(2):e70000", "👉 Carob molasses antimicrobial/antioxidant effects: µg, mg | Positive/therapeutic effect mentioned", "39915279"),
                    Reference("FASEB J. 2024 Apr 15;38(7):e23554", "👉 Exercise and osteoimmunology: No clear dose/effect/duration found", "38588175"),
                    Reference("Transl Anim Sci. 2023 Nov 6;7(1):txad126", "👉 Metabolic insights from pigs during Streptococcus suis outbreaks: Positive/therapeutic effect mentioned", "38023423"),

                    // Supplements
                    Reference("Animals (Basel). 2025 Aug 13;15(16):2373", "👉 Zinc glycinate alleviates necrotic enteritis in broilers: mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day", "40867702"),
                    Reference("Health Sci Rep. 2025 Jul 23;8(7):e71115", "👉 Pediatric liquid medications and dental caries: Positive/therapeutic effect mentioned", "40704323"),
                    Reference("J Microbiol Methods. 2025 Sep;236:107193", "👉 Effect of epinephrine on Actinobacillus pleuropneumoniae: No clear dose/effect/duration found", "40653094"),

                    // Nutrients
                    Reference("Front Vet Sci. 2025 Aug 13;12:1654028", "👉 In ovo and water postbiotic supplementation in broilers: Positive/therapeutic effect mentioned", "40881634"),
                    Reference("Poult Sci. 2024 Jun;103(6):103714", "👉 Methionine/threonine supplementation in Eimeria-challenged broilers: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "38636202"),
                    Reference("Anim Nutr. 2023 Sep 9;15:430-442", "👉 Xylanase, protease, and xylo-oligosaccharides in Eimeria-challenged broilers: g | Positive/therapeutic effect mentioned", "38033611")
                )
            )

            "Tonsillitis in children" -> Pair(
                """
Alternative approaches
1. Outcomes of conservative antibiotic therapy in pediatric peritonsillar abscesses: week, week
2. Endoscopic third ventriculostomy in Chiari Malformation Type I: Positive/therapeutic effect mentioned | month
3. Medical treatment of adenotonsillar hypertrophy in children: day, month

Herbs
1. Acupoint application for pharyngeal pain: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day
2. Chinese medicinal herbs for sore throat: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Clinical analysis of 137 cases of influenza A(H1N1): day, day

Amino acids
1. Intestinal metabolites in children with OSAHS: No clear dose/effect/duration found
2. Inflammatory response and metabolic adaptation in children with acute respiratory pathology: g, g
3. Pain control methods of tonsil surgery: No clear dose/effect/duration found

Vitamins
1. Pediatric liquid medications and dental caries: Positive/therapeutic effect mentioned
2. Vitamin D in children undergoing adenoidectomy/tonsillectomy: Positive/therapeutic effect mentioned
3. Dynamic indicators of the antioxidant system in children with acute respiratory pathology: Positive/therapeutic effect mentioned

Minerals
1. Carob molasses antimicrobial/antioxidant effects: µg, mg | Positive/therapeutic effect mentioned
2. Biochemical parameters in children with chronic tonsillitis: No clear dose/effect/duration found
3. Difensil Immuno reduces recurrence and severity of tonsillitis in children: Positive/therapeutic effect mentioned

Supplements
1. Pediatric liquid medications and dental caries: Positive/therapeutic effect mentioned
2. Dietary supplement with Pelargonium sidoides, honey, propolis, zinc in acute tonsillopharyngitis: G | Negative/adverse effect mentioned
3. Carob molasses antimicrobial/antioxidant effects: µg, mg | Positive/therapeutic effect mentioned

Nutrients
1. Vitamin D in children with chronic tonsillitis: IU | Positive/therapeutic effect mentioned | month
2. Vitamin D levels in children with recurrent acute tonsillitis: No clear dose/effect/duration found
3. Difensil Immuno reduces recurrence and severity of tonsillitis in children: Positive/therapeutic effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Eur J Pediatr. 2025 Sep 18;184(10):622", "👉 Outcomes of conservative antibiotic therapy in pediatric peritonsillar abscesses: week, week", "40962928"),
                    Reference("J Clin Neurosci. 2025 Aug 26;141:111582", "👉 Endoscopic third ventriculostomy in Chiari Malformation Type I: Positive/therapeutic effect mentioned | month", "40865295"),
                    Reference("Ear Nose Throat J. 2025 Jun 14:1455613251350660", "👉 Medical treatment of adenotonsillar hypertrophy in children: day, month", "40516106"),

                    // Herbs
                    Reference("Chin J Integr Med. 2024 Jan;30(1):18-24", "👉 Acupoint application for pharyngeal pain: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day", "37340204"),
                    Reference("Cochrane Database Syst Rev. 2012 Mar 14;2012(3):CD004877", "👉 Chinese medicinal herbs for sore throat: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "22419300"),
                    Reference("Zhonghua Yi Xue Za Zhi. 2010 Aug 3;90(29):2071-3", "👉 Clinical analysis of 137 cases of influenza A(H1N1): day, day", "21029649"),

                    // Amino acids
                    Reference("Zhongguo Dang Dai Er Ke Za Zhi. 2024 Jun 15;26(6):575-583", "👉 Intestinal metabolites in children with OSAHS: No clear dose/effect/duration found", "38926373"),
                    Reference("Wiad Lek. 2023;76(3):540-547", "👉 Inflammatory response and metabolic adaptation in children with acute respiratory pathology: g, g", "37057777"),
                    Reference("Auris Nasus Larynx. 2020 Feb;47(1):42-47", "👉 Pain control methods of tonsil surgery: No clear dose/effect/duration found", "31672398"),

                    // Vitamins
                    Reference("Health Sci Rep. 2025 Jul 23;8(7):e71115", "👉 Pediatric liquid medications and dental caries: Positive/therapeutic effect mentioned", "40704323"),
                    Reference("Lin Chuang Er Bi Yan Hou Tou Jing Wai Ke Za Zhi. 2025 Jun;39(6):515-522", "👉 Vitamin D in children undergoing adenoidectomy/tonsillectomy: Positive/therapeutic effect mentioned", "40443373"),
                    Reference("Wiad Lek. 2024;77(10):1928-1937", "👉 Dynamic indicators of the antioxidant system in children with acute respiratory pathology: Positive/therapeutic effect mentioned", "39661885"),

                    // Minerals
                    Reference("J Food Sci. 2025 Feb;90(2):e70000", "👉 Carob molasses antimicrobial/antioxidant effects: µg, mg | Positive/therapeutic effect mentioned", "39915279"),
                    Reference("Curr Health Sci J. 2020 Apr-Jun;46(2):129-135", "👉 Biochemical parameters in children with chronic tonsillitis: No clear dose/effect/duration found", "32874684"),
                    Reference("Nutrients. 2020 Jun 2;12(6):1637", "👉 Difensil Immuno reduces recurrence and severity of tonsillitis in children: Positive/therapeutic effect mentioned", "32498216"),

                    // Supplements
                    Reference("Health Sci Rep. 2025 Jul 23;8(7):e71115", "👉 Pediatric liquid medications and dental caries: Positive/therapeutic effect mentioned", "40704323"),
                    Reference("Children (Basel). 2025 Mar 10;12(3):345", "👉 Dietary supplement with Pelargonium sidoides, honey, propolis, zinc in acute tonsillopharyngitis: G | Negative/adverse effect mentioned", "40150627"),
                    Reference("J Food Sci. 2025 Feb;90(2):e70000", "👉 Carob molasses antimicrobial/antioxidant effects: µg, mg | Positive/therapeutic effect mentioned", "39915279"),

                    // Nutrients
                    Reference("Sci Rep. 2023 May 17;13(1):8014", "👉 Vitamin D in children with chronic tonsillitis: IU | Positive/therapeutic effect mentioned | month", "37198277"),
                    Reference("Int J Environ Res Public Health. 2022 Jul 18;19(14):8744", "👉 Vitamin D levels in children with recurrent acute tonsillitis: No clear dose/effect/duration found", "35886596"),
                    Reference("Nutrients. 2020 Jun 2;12(6):1637", "👉 Difensil Immuno reduces recurrence and severity of tonsillitis in children: Positive/therapeutic effect mentioned", "32498216")
                )
            )

            "Tooth decay" -> Pair(
                """
Alternative approaches
1. Dental composite surface modification: Positive/therapeutic effect mentioned
2. Propolis in reducing dental plaque and gingival inflammation: Positive/therapeutic effect mentioned
3. Orthodontic extrusion in management of fractured/damaged anterior teeth: g | Positive/therapeutic effect mentioned

Herbs
1. Plant polyphenols, terpenes, terpenoids in oral health: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Herbal medicines to prevent dental caries: Positive/therapeutic effect mentioned
3. Anti-biofilm and anti-glucosyltransferase effects of nano liposomal plant extracts against Streptococcus mutans: Positive/therapeutic effect mentioned

Amino acids
1. Mineralization solutions on Streptococcus mutans metabolism: Positive/therapeutic effect mentioned
2. d-Histidine inhibits Streptococcus mutans growth: Positive/therapeutic effect mentioned
3. Arginine and sodium fluoride suppress enamel calcium loss and biofilm activity: Positive/therapeutic effect mentioned

Vitamins
1. Serum alpha-carotene and root caries: Positive/therapeutic effect mentioned
2. Clinical characteristics in TCIRG1-related osteopetrosis: Positive/therapeutic effect mentioned | month
3. Immigration detention impacts: Positive/therapeutic effect mentioned | month

Minerals
1. Mineralization solutions on Streptococcus mutans metabolism: Positive/therapeutic effect mentioned
2. Quaternary ammonium chitosan film with calcium phosphate nanoclusters: Negative/adverse effect mentioned | day
3. GWAS for periodontitis phenotypes: No clear dose/effect/duration found

Supplements
1. Antibacterial resin composites with sustained chlorhexidine release: Positive/therapeutic effect mentioned | day, month
2. Advances in prevention of dental caries in orofacial clefts: Positive/therapeutic effect mentioned
3. Probiotics for caries prevention: Positive/therapeutic effect mentioned

Nutrients
1. Black rice bran mouthwash in children: No clear dose/effect/duration found
2. Diet, oral health, and development in Romanian school-age children: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Sugar content of children's breakfast foods in Mediterranean diet patterns: Positive/therapeutic effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Pathogens. 2025 Sep 10;14(9):909", "👉 Dental composite surface modification: Positive/therapeutic effect mentioned", "41011809"),
                    Reference("J Funct Biomater. 2025 Sep 8;16(9):336", "👉 Propolis in reducing dental plaque and gingival inflammation: Positive/therapeutic effect mentioned", "41003407"),
                    Reference("J Pers Med. 2025 Sep 1;15(9):408", "👉 Orthodontic extrusion in management of fractured/damaged anterior teeth: g | Positive/therapeutic effect mentioned", "41003111"),

                    // Herbs
                    Reference("Open Med (Wars). 2025 Apr 15;20(1):20251183", "👉 Plant polyphenols, terpenes, terpenoids in oral health: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40292252"),
                    Reference("Cochrane Database Syst Rev. 2024 May 14;5(5):CD015832", "👉 Herbal medicines to prevent dental caries: Positive/therapeutic effect mentioned", "39908071"),
                    Reference("Sci Rep. 2024 Nov 8;14(1):27304", "👉 Anti-biofilm and anti-glucosyltransferase effects of nano liposomal plant extracts against Streptococcus mutans: Positive/therapeutic effect mentioned", "39516577"),

                    // Amino acids
                    Reference("Front Oral Health. 2025 Sep 9;6:1647945", "👉 Mineralization solutions on Streptococcus mutans metabolism: Positive/therapeutic effect mentioned", "40994782"),
                    Reference("J Oral Microbiol. 2025 Jul 16;17(1):2533174", "👉 d-Histidine inhibits Streptococcus mutans growth: Positive/therapeutic effect mentioned", "40678111"),
                    Reference("Biofouling. 2025 Aug;41(7):696-710", "👉 Arginine and sodium fluoride suppress enamel calcium loss and biofilm activity: Positive/therapeutic effect mentioned", "40665528"),

                    // Vitamins
                    Reference("Life (Basel). 2025 Jul 26;15(8):1188", "👉 Serum alpha-carotene and root caries: Positive/therapeutic effect mentioned", "40868836"),
                    Reference("TCIRG1-Related Osteopetrosis. 2025 Aug 28", "👉 Clinical characteristics in TCIRG1-related osteopetrosis: Positive/therapeutic effect mentioned | month", "40875877"),
                    Reference("Eur Child Adolesc Psychiatry. 2025 Aug 27", "👉 Immigration detention impacts: Positive/therapeutic effect mentioned | month", "40864279"),

                    // Minerals
                    Reference("Front Oral Health. 2025 Sep 9;6:1647945", "👉 Mineralization solutions on Streptococcus mutans metabolism: Positive/therapeutic effect mentioned", "40994782"),
                    Reference("Int J Biol Macromol. 2025 Sep 16;329(Pt 1):147720", "👉 Quaternary ammonium chitosan film with calcium phosphate nanoclusters: Negative/adverse effect mentioned | day", "40967531"),
                    Reference("medRxiv [Preprint]. 2025 Sep 8:2025.09.07.25335133", "👉 GWAS for periodontitis phenotypes: No clear dose/effect/duration found", "40963761"),

                    // Supplements
                    Reference("Pharmaceutics. 2025 Sep 1;17(9):1144", "👉 Antibacterial resin composites with sustained chlorhexidine release: Positive/therapeutic effect mentioned | day, month", "41012481"),
                    Reference("Plast Reconstr Surg. 2025 Oct 1;156(4S-2):41S-49S", "👉 Advances in prevention of dental caries in orofacial clefts: Positive/therapeutic effect mentioned", "40997092"),
                    Reference("J Appl Biomater Funct Mater. 2025 Jan-Dec;23:22808000251376427", "👉 Probiotics for caries prevention: Positive/therapeutic effect mentioned", "40995678"),

                    // Nutrients
                    Reference("Int J Clin Pediatr Dent. 2025 Aug;18(8):940-945", "👉 Black rice bran mouthwash in children: No clear dose/effect/duration found", "40989983"),
                    Reference("Nutrients. 2025 Aug 30;17(17):2832", "👉 Diet, oral health, and development in Romanian school-age children: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40944220"),
                    Reference("Nutrients. 2025 Aug 22;17(17):2717", "👉 Sugar content of children's breakfast foods in Mediterranean diet patterns: Positive/therapeutic effect mentioned", "40944108")
                )
            )

            "Tonsil stones" -> Pair(
                """
Alternative approaches
1. Coblation cryptolysis for tonsil caseum-induced halitosis: month
2. SNPs associated with Salmonella susceptibility in pigs: g, G | Positive/therapeutic effect mentioned
3. Medicinal chemistry of genus Ammannia: Negative/adverse effect mentioned

Herbs
(no data)

Amino acids
1. L. rhamnosus improves immune response and tryptophan catabolism in laying hen pullets: G | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Lactobacillus rhamnosus modulates chronic stress-induced feather pecking in chickens: G | Positive/therapeutic effect mentioned

Vitamins
(no data)

Minerals
1. Tonsillolith treated with individualized homeopathy: No clear dose/effect/duration found
2. Giant tonsillolith case report: No clear dose/effect/duration found
3. An unusual tonsillolith: No clear dose/effect/duration found

Supplements
1. L. rhamnosus improves immune response and tryptophan catabolism in laying hen pullets: G | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Lactobacillus rhamnosus modulates chronic stress-induced feather pecking in chickens: G | Positive/therapeutic effect mentioned
3. Rationale for probiotics in female urogenital healthcare: Positive/therapeutic effect mentioned

Nutrients
1. Differential expression of adhesin genes of Actinobacillus suis in in vivo-like conditions: G
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Am J Otolaryngol. 2021 Nov-Dec;42(6):103075", "👉 Coblation cryptolysis for tonsil caseum-induced halitosis: month", "33957544"),
                    Reference("BMC Vet Res. 2020 May 15;16(1):138", "👉 SNPs associated with Salmonella susceptibility in pigs: g, G | Positive/therapeutic effect mentioned", "32414370"),
                    Reference("Curr Top Med Chem. 2019;19(10):784-794", "👉 Medicinal chemistry of genus Ammannia: Negative/adverse effect mentioned", "30977452"),

                    // Herbs (no data)

                    // Amino acids
                    Reference("Sci Rep. 2021 Oct 1;11(1):19538", "👉 L. rhamnosus improves immune response and tryptophan catabolism in laying hen pullets: G | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "34599202"),
                    Reference("Sci Rep. 2021 Aug 24;11(1):17119", "👉 Lactobacillus rhamnosus modulates chronic stress-induced feather pecking in chickens: G | Positive/therapeutic effect mentioned", "34429482"),

                    // Vitamins (no data)

                    // Minerals
                    Reference("Altern Ther Health Med. 2023 Apr;29(3):88-91", "👉 Tonsillolith treated with individualized homeopathy: No clear dose/effect/duration found", "35839105"),
                    Reference("Med Oral Patol Oral Cir Bucal. 2005 May-Jul;10(3):239-42", "👉 Giant tonsillolith case report: No clear dose/effect/duration found", "15876967"),
                    Reference("Oral Surg Oral Med Oral Pathol Oral Radiol Endod. 2003 Apr;95(4):471-3", "👉 An unusual tonsillolith: No clear dose/effect/duration found", "12686933"),

                    // Supplements
                    Reference("Sci Rep. 2021 Oct 1;11(1):19538", "👉 L. rhamnosus improves immune response and tryptophan catabolism in laying hen pullets: G | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "34599202"),
                    Reference("Sci Rep. 2021 Aug 24;11(1):17119", "👉 Lactobacillus rhamnosus modulates chronic stress-induced feather pecking in chickens: G | Positive/therapeutic effect mentioned", "34429482"),
                    Reference("MedGenMed. 2004 Mar 29;6(1):49", "👉 Rationale for probiotics in female urogenital healthcare: Positive/therapeutic effect mentioned", "15208560"),

                    // Nutrients
                    Reference("Vet Microbiol. 2016 Nov 15;195:60-69", "👉 Differential expression of adhesin genes of Actinobacillus suis in in vivo-like conditions: G", "27771071")
                )
            )

            "Trigeminal neuralgia" -> Pair(
                """
Alternative approaches
1. Intraoperative awake anesthesia + 3D reconstruction in percutaneous microballoon compression: week, month
2. Sensorimotor network alteration after microvascular decompression: Positive/therapeutic effect mentioned | month
3. Comparison of stereotactic radiosurgery and rhizotomy: Positive/therapeutic effect mentioned

Herbs
1. Yokukansan prevents morphine tolerance via orexin A inhibition: mg | Positive/therapeutic effect mentioned | day
2. Surgical treatment history: No clear dose/effect/duration found

Amino acids
1. Second-line pharmacological treatment strategies: Negative/adverse effect mentioned | month
2. Combined spinal cord stimulation + pregabalin therapy: Positive/therapeutic effect mentioned | week
3. Onset of secondary SUNCT syndrome after dorsal medullary infarction: No clear dose/effect/duration found

Vitamins
1. Restoration of mitochondrial function alleviates trigeminal neuropathic pain in mice: No clear dose/effect/duration found
2. Electromagnetic vs low-level laser therapy in diabetic trigeminal neuralgia: Positive/therapeutic effect mentioned
3. Efficacy of carbamazepine and ascorbyl palmitate in trigeminal neuralgia: Positive/therapeutic effect mentioned | month

Minerals
1. Rat model of infraorbital neuroinflammation: g | week, day
2. Bilateral calcaneal insufficiency fractures from chronic carbamazepine use: Negative/adverse effect mentioned | week
3. Calcitonin as analgesic agent: Positive/therapeutic effect mentioned

Supplements
1. Microstructural change in trigeminal nerve associated with durable pain relief after surgery: Positive/therapeutic effect mentioned
2. Purple corn extract reduces neuroinflammation in autoimmune trigeminal pain: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Gut microbiota modulation and neuropathic pain: No clear dose/effect/duration found

Nutrients
1. Neurosurgical interventions and serum zinc/copper perioperative study: No clear dose/effect/duration found
2. Selective ethanol neurolysis of Gasser's ganglion: No clear dose/effect/duration found
3. Trials with vitamin combination in neurological diseases: No clear dose/effect/duration found
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("J Pain Res. 2025 Sep 16;18:4833-4843", "👉 Intraoperative awake anesthesia + 3D reconstruction in percutaneous microballoon compression: week, month", "40978551"),
                    Reference("Front Physiol. 2025 Aug 5;16:1633028", "👉 Sensorimotor network alteration after microvascular decompression: Positive/therapeutic effect mentioned | month", "40837096"),
                    Reference("Neurosurg Rev. 2025 Aug 20;48(1):613", "👉 Comparison of stereotactic radiosurgery and rhizotomy: Positive/therapeutic effect mentioned", "40833460"),

                    // Herbs
                    Reference("Integr Med Res. 2018 Jun;7(2):141-148", "👉 Yokukansan prevents morphine tolerance via orexin A inhibition: mg | Positive/therapeutic effect mentioned | day", "29989049"),
                    Reference("Neurosurgery. 2010 Nov;67(5):1419-25", "👉 Surgical treatment history: No clear dose/effect/duration found", "20871443"),

                    // Amino acids
                    Reference("Headache. 2025 Jul-Aug;65(7):1116-1123", "👉 Second-line pharmacological treatment strategies: Negative/adverse effect mentioned | month", "40341553"),
                    Reference("J Clin Neurosci. 2025 Jun;136:111224", "👉 Combined spinal cord stimulation + pregabalin therapy: Positive/therapeutic effect mentioned | week", "40209522"),
                    Reference("BMJ Case Rep. 2025 Mar 28;18(3):e264684", "👉 Onset of secondary SUNCT syndrome after dorsal medullary infarction: No clear dose/effect/duration found", "40154552"),

                    // Vitamins
                    Reference("Free Radic Biol Med. 2025 Jan;226:185-198", "👉 Restoration of mitochondrial function alleviates trigeminal neuropathic pain in mice: No clear dose/effect/duration found", "39528053"),
                    Reference("Eur J Phys Rehabil Med. 2023 Apr;59(2):183-191", "👉 Electromagnetic vs low-level laser therapy in diabetic trigeminal neuralgia: Positive/therapeutic effect mentioned", "36762919"),
                    Reference("Eur Rev Med Pharmacol Sci. 2022 Dec;26(3 Suppl):94-105", "👉 Efficacy of carbamazepine and ascorbyl palmitate in trigeminal neuralgia: Positive/therapeutic effect mentioned | month", "36591877"),

                    // Minerals
                    Reference("Curr Neurovasc Res. 2023;20(2):261-269", "👉 Rat model of infraorbital neuroinflammation: g | week, day", "37287282"),
                    Reference("Niger J Clin Pract. 2020 Apr;23(4):574-576", "👉 Bilateral calcaneal insufficiency fractures from chronic carbamazepine use: Negative/adverse effect mentioned | week", "32246668"),
                    Reference("Braz J Anesthesiol. 2019 Nov-Dec;69(6):594-604", "👉 Calcitonin as analgesic agent: Positive/therapeutic effect mentioned", "31810524"),

                    // Supplements
                    Reference("Cephalalgia. 2025 Sep;45(9):3331024251369827", "👉 Microstructural change in trigeminal nerve associated with durable pain relief after surgery: Positive/therapeutic effect mentioned", "40891642"),
                    Reference("Biomed Pharmacother. 2025 Mar;184:117906", "👉 Purple corn extract reduces neuroinflammation in autoimmune trigeminal pain: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "39955855"),
                    Reference("Pain Ther. 2024 Feb;13(1):33-51", "👉 Gut microbiota modulation and neuropathic pain: No clear dose/effect/duration found", "38087070"),

                    // Nutrients
                    Reference("Z Exp Chir Transplant Kunstliche Organe. 1990;23(4):236-40", "👉 Neurosurgical interventions and serum zinc/copper perioperative study: No clear dose/effect/duration found", "2095654"),
                    Reference("Minerva Anestesiol. 1978 Jun;44(6):405-19", "👉 Selective ethanol neurolysis of Gasser's ganglion: No clear dose/effect/duration found", "310987"),
                    Reference("Med Welt. 1963 Sep 21;38:1941-3", "👉 Trials with vitamin combination in neurological diseases: No clear dose/effect/duration found", "14056583")
                )
            )

            "Ulcerative colitis" -> Pair(
                """
Alternative approaches
1. 4-HDHA alleviates DSS-induced colitis by inhibiting apoptosis and reducing inflammation: Negative/adverse effect mentioned
2. Butylchlorogenate alleviates UC via NLRP3 inflammasome suppression: Positive/therapeutic effect mentioned
3. Anti-TNF therapies promote proximal-to-distal healing pattern in moderate-to-severe UC: Positive/therapeutic effect mentioned

Herbs
1. Premna puberula ethyl acetate extract treats UC by regulating intestinal flora and serum metabolism: Positive/therapeutic effect mentioned
2. Traditional Chinese medicine combined with biologic therapy for refractory severe UC: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Polygonum hydropiper L-Coptis chinensis Franch herbal pair attenuates DSS-induced UC: Positive/therapeutic effect mentioned

Amino acids
1. Curcumin combined with tryptophan ameliorates DSS-induced UC via reducing inflammation and oxidative stress: Positive/therapeutic effect mentioned
2. Penicillamine ameliorates intestinal barrier damage in DSS-induced colitis mice by inhibiting cuproptosis: Positive/therapeutic effect mentioned
3. Branched-chain amino acids exacerbate colitis progression by lowering colonic fumarate levels: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Vitamins
1. Microbiota and gut inflammatory markers exhibit age-dependent variation in UC patients: Positive/therapeutic effect mentioned
2. Diet in UC: Role in pathogenesis and treatment: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. A child with UC presenting with delirium: Positive/therapeutic effect mentioned

Minerals
1. Long-term oral budesonide use in IBD: Effects on bone mineral density and late-onset adverse events: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. RANKL/OPG axis and bone mineral density in pediatric IBD: Positive/therapeutic effect mentioned
3. Association of inflammatory factors and calcium metabolism with arthritis in IBD patients: No clear dose/effect/duration found

Supplements
1. Alfalfa polysaccharide alleviates colitis via intestinal microbiota and barrier regulation against TLR4/MyD88/NF-κB pathway: Positive/therapeutic effect mentioned
2. Lactobacillus fermentum inhibits colitis development by regulating microbiota and metabolites: Positive/therapeutic effect mentioned
3. Curcumin combined with tryptophan ameliorates DSS-induced UC via inflammation reduction and gut microbiota regulation: Positive/therapeutic effect mentioned

Nutrients
1. Chang'an decoction effect on UC by regulating Th17 and Treg cells via p53/HMGB1 pathway: Positive/therapeutic effect mentioned
2. Alfalfa polysaccharide alleviates colitis via intestinal microbiota and barrier regulation: Positive/therapeutic effect mentioned
3. Curcumin combined with tryptophan ameliorates DSS-induced UC via reducing inflammation, oxidative stress, and gut microbiota regulation: Positive/therapeutic effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Int Immunopharmacol. 2025 Sep 26;166:115614", "👉 4-HDHA alleviates DSS-induced colitis by inhibiting apoptosis and reducing inflammation: Negative/adverse effect mentioned", "41014773"),
                    Reference("Phytomedicine. 2025 Sep 19;148:157282", "👉 Butylchlorogenate alleviates UC via NLRP3 inflammasome suppression: Positive/therapeutic effect mentioned", "41005055"),
                    Reference("Inflamm Bowel Dis. 2025 Sep 25:izaf199", "👉 Anti-TNF therapies promote proximal-to-distal healing pattern in moderate-to-severe UC: Positive/therapeutic effect mentioned", "40997114"),

                    // Herbs
                    Reference("Molecules. 2025 Sep 19;30(18):3809", "👉 Premna puberula ethyl acetate extract treats UC by regulating intestinal flora and serum metabolism: Positive/therapeutic effect mentioned", "41011701"),
                    Reference("Explore (NY). 2025 Sep 6;21(6):103260", "👉 Traditional Chinese medicine combined with biologic therapy for refractory severe UC: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40939219"),
                    Reference("Food Sci Nutr. 2025 Jul 8;13(7):e70584", "👉 Polygonum hydropiper L-Coptis chinensis Franch herbal pair attenuates DSS-induced UC: Positive/therapeutic effect mentioned", "40630428"),

                    // Amino acids
                    Reference("Nutrients. 2025 Sep 18;17(18):2988", "👉 Curcumin combined with tryptophan ameliorates DSS-induced UC via reducing inflammation and oxidative stress: Positive/therapeutic effect mentioned", "41010513"),
                    Reference("Front Immunol. 2025 Sep 3;16:1580963", "👉 Penicillamine ameliorates intestinal barrier damage in DSS-induced colitis mice by inhibiting cuproptosis: Positive/therapeutic effect mentioned", "40969742"),
                    Reference("Inflamm Bowel Dis. 2025 Sep 10:izaf125", "👉 Branched-chain amino acids exacerbate colitis progression by lowering colonic fumarate levels: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40926562"),

                    // Vitamins
                    Reference("Life (Basel). 2025 Sep 8;15(9):1412", "👉 Microbiota and gut inflammatory markers exhibit age-dependent variation in UC patients: Positive/therapeutic effect mentioned", "41010354"),
                    Reference("Dig Dis Sci. 2025 Sep 22", "👉 Diet in UC: Role in pathogenesis and treatment: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40982139"),
                    Reference("Turk J Pediatr. 2025 Sep 1;67(4):597-601", "👉 A child with UC presenting with delirium: Positive/therapeutic effect mentioned", "40925035"),

                    // Minerals
                    Reference("Diagnostics (Basel). 2025 Sep 8;15(17):2271", "👉 Long-term oral budesonide use in IBD: Effects on bone mineral density and late-onset adverse events: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40941758"),
                    Reference("J Clin Med. 2025 Aug 1;14(15):5440", "👉 RANKL/OPG axis and bone mineral density in pediatric IBD: Positive/therapeutic effect mentioned", "40807060"),
                    Reference("Mediators Inflamm. 2025 Jul 28;2025:1675577", "👉 Association of inflammatory factors and calcium metabolism with arthritis in IBD patients: No clear dose/effect/duration found", "40761661"),

                    // Supplements
                    Reference("Nutrients. 2025 Sep 19;17(18):3001", "👉 Alfalfa polysaccharide alleviates colitis via intestinal microbiota and barrier regulation against TLR4/MyD88/NF-κB pathway: Positive/therapeutic effect mentioned", "41010526"),
                    Reference("Int J Mol Sci. 2025 Sep 19;26(18):9181", "👉 Lactobacillus fermentum inhibits colitis development by regulating microbiota and metabolites: Positive/therapeutic effect mentioned", "41009741"),
                    Reference("Nutrients. 2025 Sep 18;17(18):2988", "👉 Curcumin combined with tryptophan ameliorates DSS-induced UC via inflammation reduction and gut microbiota regulation: Positive/therapeutic effect mentioned", "41010513"),

                    // Nutrients
                    Reference("J Tradit Chin Med. 2025 Oct;45(5):998-1008", "👉 Chang'an decoction effect on UC by regulating Th17 and Treg cells via p53/HMGB1 pathway: Positive/therapeutic effect mentioned", "41015798"),
                    Reference("Nutrients. 2025 Sep 19;17(18):3001", "👉 Alfalfa polysaccharide alleviates colitis via intestinal microbiota and barrier regulation: Positive/therapeutic effect mentioned", "41010526"),
                    Reference("Nutrients. 2025 Sep 18;17(18):2988", "👉 Curcumin combined with tryptophan ameliorates DSS-induced UC via reducing inflammation, oxidative stress, and gut microbiota regulation: Positive/therapeutic effect mentioned", "41010513")
                )
            )

            "Urinary incontinence" -> Pair(
                """
Alternative approaches
1. O G Open. Patient Views and Values Placed on the Uterus: No clear dose/effect/duration found
2. Low Urin Tract Symptoms. Selective Bladder Denervation vs Intravesical Onabotulinum Toxin A: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week
3. Int J Impot Res. Penoscrotal approach for artificial urinary sphincter implantation: Positive/therapeutic effect mentioned

Herbs
1. Clin Interv Aging. Lithospermum Oil for incontinence-associated dermatitis care: Positive/therapeutic effect mentioned
2. Pathogens. Postoperative prevention of urinary tract infections with Canephron vs antibiotic prophylaxis: Positive/therapeutic effect mentioned | day
3. Phytother Res. Antioxidant potential of Cucurbitaceae to alleviate oxidative stress-mediated disorders: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Amino acids
1. Int J Mol Sci. Effects of nitric oxide on bladder detrusor overactivity: Positive/therapeutic effect mentioned | month
2. Biomedicines. Beta-amyloid pathology in idiopathic normal-pressure hydrocephalus: No clear dose/effect/duration found
3. J Int Med Res. Neuronal intranuclear inclusion disease misdiagnosed as Parkinson's: No clear dose/effect/duration found

Vitamins
1. BMC Geriatr. Long-lasting nonspecific symptoms related to vitamin D deficiency in older adults: Positive/therapeutic effect mentioned | month
2. Can Urol Assoc J. Preoperative vitamin D as predictive factor for continence after radical prostatectomy: month
3. Medicine (Baltimore). Causal relationship between vitamin D and stress urinary incontinence: No clear dose/effect/duration found

Minerals
1. J Ayurveda Integr Med. Raupya Suvarna Sutashekhara effects on long-term survival: mg | Positive/therapeutic effect mentioned | week, month
2. Nutrition. Dietary intake patterns in pregnancy-specific urinary incontinence: Positive/therapeutic effect mentioned
3. Brain Sci. Connection between chronic liver damage and Alzheimer's disease: Positive/therapeutic effect mentioned

Supplements
1. Int J Womens Health. Causal links between uterine prolapse, UTIs, and LUTS: No clear dose/effect/duration found
2. Medicine (Baltimore). Vitamin D and stress urinary incontinence: No clear dose/effect/duration found
3. Cent Eur J Public Health. Management of urinary incontinence in senior age: Positive/therapeutic effect mentioned

Nutrients
1. Nutrients. Sarcopenia in oldest-old adults: No clear dose/effect/duration found
2. Front Nutr. Dietary flavonoids intake and overactive bladder: Positive/therapeutic effect mentioned
3. Heliyon. Dietary fatty acids and urinary incontinence: No clear dose/effect/duration found
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("O G Open. 2024 Dec 5;1(4):48", "👉 Patient Views and Values Placed on the Uterus: No clear dose/effect/duration found", "41001598"),
                    Reference("Low Urin Tract Symptoms. 2025 Sep;17(5):e70032", "👉 Selective Bladder Denervation vs Intravesical Onabotulinum Toxin A: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week", "40990132"),
                    Reference("Int J Impot Res. 2025 Sep 18", "👉 Penoscrotal approach for artificial urinary sphincter implantation: Positive/therapeutic effect mentioned", "40968229"),

                    // Herbs
                    Reference("Clin Interv Aging. 2025 Aug 28;20:1401-1415", "👉 Lithospermum Oil for incontinence-associated dermatitis care: Positive/therapeutic effect mentioned", "40905002"),
                    Reference("Pathogens. 2022 Dec 23;12(1):27", "👉 Postoperative prevention of urinary tract infections with Canephron vs antibiotic prophylaxis: Positive/therapeutic effect mentioned | day", "36678373"),
                    Reference("Phytother Res. 2021 Jul;35(7):3533-3557", "👉 Antioxidant potential of Cucurbitaceae to alleviate oxidative stress-mediated disorders: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "33590924"),

                    // Amino acids
                    Reference("Int J Mol Sci. 2024 Oct 16;25(20):11103", "👉 Effects of nitric oxide on bladder detrusor overactivity: Positive/therapeutic effect mentioned | month", "39456884"),
                    Reference("Biomedicines. 2024 Aug 20;12(8):1898", "👉 Beta-amyloid pathology in idiopathic normal-pressure hydrocephalus: No clear dose/effect/duration found", "39200362"),
                    Reference("J Int Med Res. 2024 Mar;52(3):3000605241233159", "👉 Neuronal intranuclear inclusion disease misdiagnosed as Parkinson's: No clear dose/effect/duration found", "38436278"),

                    // Vitamins
                    Reference("BMC Geriatr. 2025 Jun 24;25(1):428", "👉 Long-lasting nonspecific symptoms related to vitamin D deficiency in older adults: Positive/therapeutic effect mentioned | month", "40556007"),
                    Reference("Can Urol Assoc J. 2025 Jul;19(7):E246-E250", "👉 Preoperative vitamin D as predictive factor for continence after radical prostatectomy: month", "40116669"),
                    Reference("Medicine (Baltimore). 2025 Feb 28;104(9):e41621", "👉 Causal relationship between vitamin D and stress urinary incontinence: No clear dose/effect/duration found", "40020141"),

                    // Minerals
                    Reference("J Ayurveda Integr Med. 2024 Sep-Oct;15(5):101070", "👉 Raupya Suvarna Sutashekhara effects on long-term survival: mg | Positive/therapeutic effect mentioned | week, month", "39423591"),
                    Reference("Nutrition. 2024 Jan;117:112228", "👉 Dietary intake patterns in pregnancy-specific urinary incontinence: Positive/therapeutic effect mentioned", "37948994"),
                    Reference("Brain Sci. 2023 Sep 29;13(10):1391", "👉 Connection between chronic liver damage and Alzheimer's disease: Positive/therapeutic effect mentioned", "37891760"),

                    // Supplements
                    Reference("Int J Womens Health. 2025 Sep 8;17:2947-2957", "👉 Causal links between uterine prolapse, UTIs, and LUTS: No clear dose/effect/duration found", "40950751"),
                    Reference("Medicine (Baltimore). 2025 Feb 28;104(9):e41621", "👉 Vitamin D and stress urinary incontinence: No clear dose/effect/duration found", "40020141"),
                    Reference("Cent Eur J Public Health. 2024 Dec;32(Supplement):91-95", "👉 Management of urinary incontinence in senior age: Positive/therapeutic effect mentioned", "39832153"),

                    // Nutrients
                    Reference("Nutrients. 2024 Nov 21;16(23):3976", "👉 Sarcopenia in oldest-old adults: No clear dose/effect/duration found", "39683370"),
                    Reference("Front Nutr. 2024 Jul 24;11:1437923", "👉 Dietary flavonoids intake and overactive bladder: Positive/therapeutic effect mentioned", "39114124"),
                    Reference("Heliyon. 2024 Mar 23;10(7):e28595", "👉 Dietary fatty acids and urinary incontinence: No clear dose/effect/duration found", "38571581")
                )
            )

            "Urinary tract infection" -> Pair(
                """
Alternative approaches
1. J Clin Med. Comparative Analysis of Cervical Disc Arthroplasty and Anterior Cervical Discectomy and Fusion: day
2. Antibiotics (Basel). Multidrug-resistant UTIs in the Balkans: G
3. Nanomaterials (Basel). Selenium nanoparticles stress responses in Pseudomonas aeruginosa and Proteus mirabilis: Negative/adverse effect mentioned

Herbs
1. J Ethnopharmacol. Genus Senecio in China: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Planta Med. Complex standard formulation against uropathogenic E. coli: Positive/therapeutic effect mentioned
3. J Ethnopharmacol. Yinhua Miyanling Tablet mechanism against UTI: Positive/therapeutic effect mentioned

Amino acids
1. Plants (Basel). Genus Echium L.: Phytochemical characterization and bioactivity: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. JAMA. Prostatitis review: week, month
3. Int J Syst Evol Microbiol. Macrococcus animalis & equi sp. nov.: Positive/therapeutic effect mentioned

Vitamins
1. Ir J Med Sci. E. coli UTIs drive systemic inflammation: Negative/adverse effect mentioned
2. Acta Orthop Traumatol Turc. Impact of anticoagulation therapy: Positive/therapeutic effect mentioned | day
3. Medicine (Baltimore). Whole exome sequencing reveals pathogenic mutation: g, mg, G | Positive/therapeutic effect mentioned

Minerals
1. ACS Appl Mater Interfaces. Copolymer for ureteral stents: Positive/therapeutic effect mentioned
2. Mikrochim Acta. Si@D(AuPt) nanozyme point-of-care urinary monitoring: Positive/therapeutic effect mentioned
3. J Mater Chem B. Colorimetric point-of-care diagnostic for Enterococcus faecalis: Positive/therapeutic effect mentioned

Supplements
1. Int J Womens Health. Causal links between uterine prolapse, UTIs, and LUTS: No clear dose/effect/duration found
2. Obstet Gynecol. Updates in clinical management of recurrent UTIs: Positive/therapeutic effect mentioned
3. Rev Peru Med Exp Salud Publica. Genomic diversity of uropathogenic E. coli: g

Nutrients
1. Anim Nutr. Benzoic acid in swine nutrition: Positive/therapeutic effect mentioned
2. MicroPubl Biol. Bifidobacterium longum degrades urinary uromodulin: No clear dose/effect/duration found
3. Front Microbiol. Lactobacillus plantarum antagonism of S. aureus pathogenicity: No clear dose/effect/duration found
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("J Clin Med. 2025 Sep 18;14(18):6559", "👉 Comparative Analysis of Cervical Disc Arthroplasty and Anterior Cervical Discectomy and Fusion: day", "41010762"),
                    Reference("Antibiotics (Basel). 2025 Aug 22;14(9):849", "👉 Multidrug-resistant UTIs in the Balkans: G", "41009829"),
                    Reference("Nanomaterials (Basel). 2025 Sep 12;15(18):1404", "👉 Selenium nanoparticles stress responses in Pseudomonas aeruginosa and Proteus mirabilis: Negative/adverse effect mentioned", "41003039"),

                    // Herbs
                    Reference("J Ethnopharmacol. 2025 May 12;347:119651", "👉 Genus Senecio in China: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40158830"),
                    Reference("Planta Med. 2025 Jul;91(8):419-429", "👉 Complex standard formulation against uropathogenic E. coli: Positive/therapeutic effect mentioned", "40112859"),
                    Reference("J Ethnopharmacol. 2025 Jan 30;337(Pt 1):118835", "👉 Yinhua Miyanling Tablet mechanism against UTI: Positive/therapeutic effect mentioned", "39293704"),

                    // Amino acids
                    Reference("Plants (Basel). 2025 Aug 15;14(16):2548", "👉 Genus Echium L.: Phytochemical characterization and bioactivity: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40872171"),
                    Reference("JAMA. 2025 Sep 16;334(11):1003-1013", "👉 Prostatitis review: week, month", "40788632"),
                    Reference("Int J Syst Evol Microbiol. 2025 Jul;75(7)", "👉 Macrococcus animalis & equi sp. nov.: Positive/therapeutic effect mentioned", "40737040"),

                    // Vitamins
                    Reference("Ir J Med Sci. 2025 Sep 25", "👉 E. coli UTIs drive systemic inflammation: Negative/adverse effect mentioned", "40996582"),
                    Reference("Acta Orthop Traumatol Turc. 2025 Sep 12;59(5):253-258", "👉 Impact of anticoagulation therapy: Positive/therapeutic effect mentioned | day", "40994363"),
                    Reference("Medicine (Baltimore). 2025 Aug 15;104(33):e43839", "👉 Whole exome sequencing reveals pathogenic mutation: g, mg, G | Positive/therapeutic effect mentioned", "40826740"),

                    // Minerals
                    Reference("ACS Appl Mater Interfaces. 2025 Sep 25", "👉 Copolymer for ureteral stents: Positive/therapeutic effect mentioned", "40999723"),
                    Reference("Mikrochim Acta. 2025 Sep 17;192(10):675", "👉 Si@D(AuPt) nanozyme point-of-care urinary monitoring: Positive/therapeutic effect mentioned", "40960545"),
                    Reference("J Mater Chem B. 2025 Sep 24;13(37):11640-11651", "👉 Colorimetric point-of-care diagnostic for Enterococcus faecalis: Positive/therapeutic effect mentioned", "40878201"),

                    // Supplements
                    Reference("Int J Womens Health. 2025 Sep 8;17:2947-2957", "👉 Causal links between uterine prolapse, UTIs, and LUTS: No clear dose/effect/duration found", "40950751"),
                    Reference("Obstet Gynecol. 2025 Sep 4", "👉 Updates in clinical management of recurrent UTIs: Positive/therapeutic effect mentioned", "40907025"),
                    Reference("Rev Peru Med Exp Salud Publica. 2025 Aug 25;42(2):156-165", "👉 Genomic diversity of uropathogenic E. coli: g", "40900482"),

                    // Nutrients
                    Reference("Anim Nutr. 2025 Jul 21;22:352-362", "👉 Benzoic acid in swine nutrition: Positive/therapeutic effect mentioned", "40896479"),
                    Reference("MicroPubl Biol. 2025 Aug 6;2025:10.17912/micropub.biology.001724", "👉 Bifidobacterium longum degrades urinary uromodulin: No clear dose/effect/duration found", "40852033"),
                    Reference("Front Microbiol. 2025 Aug 4;16:1635123", "👉 Lactobacillus plantarum antagonism of S. aureus pathogenicity: No clear dose/effect/duration found", "40838016")
                )
            )

            "Varicose veins" -> Pair(
                """
Alternative approaches
1. JAMA. Superficial Vein Thrombosis: mg | Positive/therapeutic effect mentioned
2. Phlebology. Management of recurrent varicose veins: Positive/therapeutic effect mentioned | week, month
3. Vasc Endovascular Surg. Comparison of Caprini and Worcester Scores for VTE risk: No clear dose/effect/duration found

Herbs
1. Nutrients. Hypersmin, Pumpkin Seed and Amaranthus Extracts in vitro model of chronic venous insufficiency: Positive/therapeutic effect mentioned
2. J Am Nutr Assoc. Review on varicose veins treatments: Positive/therapeutic effect mentioned
3. J Am Coll Nutr. Nutraceutical supplement phlebotonic activity: Positive/therapeutic effect mentioned | month

Amino acids
1. J Wound Care. Vulnamin as adjunct in venous leg ulcers: Positive/therapeutic effect mentioned | week, day
2. Eur J Vasc Endovasc Surg. Metabolic phenotype in chronic venous disease: No clear dose/effect/duration found
3. Nutrition. Oral nutritional supplement and chronic wound healing: Positive/therapeutic effect mentioned

Vitamins
1. Turk Gogus Kalp Damar Cerrahisi Derg. Vitamin D in varicose veins thrombosis: No clear dose/effect/duration found
2. Phlebology. Role of veno-active drugs post endovenous therapy: Positive/therapeutic effect mentioned | week
3. Mol Cell Biochem. Vitamin D alleviates oxidative stress in varicose veins: Positive/therapeutic effect mentioned

Minerals
1. Bioinformation. Siddha metallo-mineral formulation anti-cancer activity: µg | Negative/adverse effect mentioned
2. Eur Radiol. Ferumoxytol-enhanced MR venography in diabetic patients: Negative/adverse effect mentioned
3. J Clin Med. Active isoforms of MGP in healthy and varicose veins: No clear dose/effect/duration found

Supplements
1. Cureus. VTE risk during prolonged fasting Ramadan: Positive/therapeutic effect mentioned
2. Minerva Surg. Centellicum® improves venous ulcer healing: mg | Positive/therapeutic effect mentioned | day, month
3. Ann Vasc Dis. Clinical practice guideline supplement for endovenous laser ablation: Negative/adverse effect mentioned

Nutrients
1. Nutrients. Hypersmin, Pumpkin Seed and Amaranthus Extracts in vitro model: Positive/therapeutic effect mentioned
2. Nutrition. Oral nutritional supplement composition for wound healing: Positive/therapeutic effect mentioned
3. Nutrients. Nutritional status assessment with chronic wound: g
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("JAMA. 2025 Sep 15", "👉 Superficial Vein Thrombosis: mg | Positive/therapeutic effect mentioned", "40952730"),
                    Reference("Phlebology. 2025 Sep 10", "👉 Management of recurrent varicose veins: Positive/therapeutic effect mentioned | week, month", "40929009"),
                    Reference("Vasc Endovascular Surg. 2025 Aug 28", "👉 Comparison of Caprini and Worcester Scores for VTE risk: No clear dose/effect/duration found", "40873409"),

                    // Herbs
                    Reference("Nutrients. 2025 May 26;17(11):1807", "👉 Hypersmin, Pumpkin Seed and Amaranthus Extracts in vitro model of chronic venous insufficiency: Positive/therapeutic effect mentioned", "40507076"),
                    Reference("J Am Nutr Assoc. 2022 Jul;41(5):499-510", "👉 Review on varicose veins treatments: Positive/therapeutic effect mentioned", "34242131"),
                    Reference("J Am Coll Nutr. 2017 May-Jun;36(4):268-272", "👉 Nutraceutical supplement phlebotonic activity: Positive/therapeutic effect mentioned | month", "28443720"),

                    // Amino acids
                    Reference("J Wound Care. 2025 Aug 2;34(8):623-630", "👉 Vulnamin as adjunct in venous leg ulcers: Positive/therapeutic effect mentioned | week, day", "40801774"),
                    Reference("Eur J Vasc Endovasc Surg. 2025 Feb;69(2):325-333", "👉 Metabolic phenotype in chronic venous disease: No clear dose/effect/duration found", "39303804"),
                    Reference("Nutrition. 2024 Aug;124:112449", "👉 Oral nutritional supplement and chronic wound healing: Positive/therapeutic effect mentioned", "38696907"),

                    // Vitamins
                    Reference("Turk Gogus Kalp Damar Cerrahisi Derg. 2024 Dec 31;32(4 Suppl 2):040-40", "👉 Vitamin D in varicose veins thrombosis: No clear dose/effect/duration found", "40322095"),
                    Reference("Phlebology. 2025 Apr 23", "👉 Role of veno-active drugs post endovenous therapy: Positive/therapeutic effect mentioned | week", "40265772"),
                    Reference("Mol Cell Biochem. 2025 Aug;480(8):4797-4807", "👉 Vitamin D alleviates oxidative stress in varicose veins: Positive/therapeutic effect mentioned", "40261445"),

                    // Minerals
                    Reference("Bioinformation. 2024 Nov 30;20(11):1603-1607", "👉 Siddha metallo-mineral formulation anti-cancer activity: µg | Negative/adverse effect mentioned", "40162453"),
                    Reference("Eur Radiol. 2024 Nov;34(11):7197-7207", "👉 Ferumoxytol-enhanced MR venography in diabetic patients: Negative/adverse effect mentioned", "38713277"),
                    Reference("J Clin Med. 2021 Dec 15;10(24):5896", "👉 Active isoforms of MGP in healthy and varicose veins: No clear dose/effect/duration found", "34945192"),

                    // Supplements
                    Reference("Cureus. 2025 Aug 5;17(8):e89406", "👉 VTE risk during prolonged fasting Ramadan: Positive/therapeutic effect mentioned", "40918916"),
                    Reference("Minerva Surg. 2025 Aug;80(4):308-313", "👉 Centellicum® improves venous ulcer healing: mg | Positive/therapeutic effect mentioned | day, month", "40719428"),
                    Reference("Ann Vasc Dis. 2025;18(1):25-00053", "👉 Clinical practice guideline supplement for endovenous laser ablation: Negative/adverse effect mentioned", "40496196"),

                    // Nutrients
                    Reference("Nutrients. 2025 May 26;17(11):1807", "👉 Hypersmin, Pumpkin Seed and Amaranthus Extracts in vitro model: Positive/therapeutic effect mentioned", "40507076"),
                    Reference("Nutrition. 2024 Aug;124:112449", "👉 Oral nutritional supplement composition for wound healing: Positive/therapeutic effect mentioned", "38696907"),
                    Reference("Nutrients. 2023 Jun 25;15(13):2869", "👉 Nutritional status assessment with chronic wound: g", "37447196")
                )
            )

            "Vertigo" -> Pair(
                """
Alternative approaches
1. Otol Neurotol. Blood biomarkers for peripheral vestibular syndrome: No clear dose/effect/duration found
2. Audiol Res. Lermoyez Syndrome systematic review: Positive/therapeutic effect mentioned
3. J Orthop Surg Res. Manual therapy for cervical vertigo: Negative/adverse effect mentioned | week

Herbs
1. Phytomedicine. Herbal medicine formulas for vestibular migraine: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Integr Med Res. Reishi mushroom use in symptom improvement: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Altern Ther Health Med. Unani medicine for neurodegenerative disorders: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Amino acids
1. Rinsho Shinkeigaku. Pisa syndrome case report: Negative/adverse effect mentioned
2. Front Neurol. Ginkgo biloba supplementation: Positive/therapeutic effect mentioned | month
3. J Vestib Res. Taurine and vestibular function: Positive/therapeutic effect mentioned | week

Vitamins
1. Nutrients. Vitamin D and dizziness in older adults: Positive/therapeutic effect mentioned | month
2. J Vestib Res. B vitamins in vestibular rehabilitation: Positive/therapeutic effect mentioned
3. Front Neurol. Vitamin B12 supplementation: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Minerals
1. J Trace Elem Med Biol. Magnesium supplementation in vertigo: Positive/therapeutic effect mentioned
2. Biol Trace Elem Res. Iron deficiency as contributor to vertigo: Negative/adverse effect mentioned
3. Nutrients. Zinc levels and vestibular function: Positive/therapeutic effect mentioned

Supplements
1. Clin Nutr. Coenzyme Q10 for Meniere’s disease: Positive/therapeutic effect mentioned
2. Front Neurol. Omega-3 fatty acids and vestibular migraine: Positive/therapeutic effect mentioned
3. J Neurol Sci. Melatonin for balance disorders: Positive/therapeutic effect mentioned

Nutrients
1. Nutrients. Dietary flavonoids and vestibular health: Positive/therapeutic effect mentioned
2. Front Nutr. Protein intake and postural stability: Positive/therapeutic effect mentioned
3. Heliyon. Fatty acid supplementation and dizziness: Positive/therapeutic effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Otol Neurotol. 2025 Oct 1;46(9):e359-e369", "👉 Blood biomarkers for peripheral vestibular syndrome: No clear dose/effect/duration found", "40940013"),
                    Reference("Audiol Res. 2025 Aug 6;15(4):98", "👉 Lermoyez Syndrome systematic review: Positive/therapeutic effect mentioned", "40863024"),
                    Reference("J Orthop Surg Res. 2025 Jul 28;20(1):716", "👉 Manual therapy for cervical vertigo: Negative/adverse effect mentioned | week", "40721810"),

                    // Herbs
                    Reference("Phytomedicine. 2025 Jul 25;143:156864", "👉 Herbal medicine formulas for vestibular migraine: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40449448"),
                    Reference("Integr Med Res. 2024 Dec;13(4):101089", "👉 Reishi mushroom use in symptom improvement: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "39635077"),
                    Reference("Altern Ther Health Med. 2024 Sep;30(9):54-64", "👉 Unani medicine for neurodegenerative disorders: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "39212516"),

                    // Amino acids
                    Reference("Rinsho Shinkeigaku. 2025 Sep 25;65(9):676-678", "👉 Pisa syndrome case report: Negative/adverse effect mentioned", "40850770"),
                    Reference("J Ethnopharmacol. 2025 Apr 9;345:119583", "👉 Gastrodia elata Blume in hypertension: g | Positive/therapeutic effect mentioned", "40058475"),
                    Reference("PLoS One. 2025 Jan 8;20(1):e0313338", "👉 B/F/TAF HIV cohort study: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month", "39774438"),

                    // Vitamins
                    Reference("J Multimorb Comorb. 2025 Sep 13;15:26335565251371254", "👉 BPPV, hypothyroidism and metabolic comorbidities: No clear dose/effect/duration found", "40955337"),
                    Reference("Otol Neurotol. 2025 Oct 1;46(9):e359-e369", "👉 Blood biomarkers for peripheral vestibular syndrome: No clear dose/effect/duration found", "40940013"),
                    Reference("Front Neurol. 2025 Aug 7;16:1636696", "👉 BPPV intelligent auxiliary diagnosis model: Positive/therapeutic effect mentioned", "40852518"),

                    // Minerals
                    Reference("Case Rep Nephrol. 2025 Feb 25;2025:6626611", "👉 Difelikefalin in CKD-associated pruritus: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40040639"),
                    Reference("J Clin Neurosci. 2025 May;135:111076", "👉 Risk factors for residual dizziness after BPPV repositioning: No clear dose/effect/duration found", "39965514"),
                    Reference("J Int Adv Otol. 2024 May 23;20(3):261-271", "👉 Bibliometric analysis of BPPV: No clear dose/effect/duration found", "39158520"),

                    // Supplements
                    Reference("Sci Rep. 2025 Aug 14;15(1):29790", "👉 Silicon-based agent for age-related vestibular decline: mg, G | Positive/therapeutic effect mentioned", "40813876"),
                    Reference("BMC Prim Care. 2025 Aug 2;26(1):238", "👉 Diagnostic accuracy study for vertigo in general practice: G", "40753388"),
                    Reference("HNO. 2025 Jul 31", "👉 Update on diagnostic procedures in third window syndromes: No clear dose/effect/duration found", "40745485"),

                    // Nutrients
                    Reference("In Vivo. 2025 May-Jun;39(3):1703-1718", "👉 Genetic mutations in hyperhomocysteinemia and metabolic syndrome: Positive/therapeutic effect mentioned", "40295030"),
                    Reference("Otolaryngol Head Neck Surg. 2025 Jan;172(1):127-136", "👉 Vitamin D in reducing BPPV recurrence in older adults: IU | Positive/therapeutic effect mentioned | week, month", "39194424"),
                    Reference("Cureus. 2024 Jun 2;16(6):e61550", "👉 Dietary practices and megaloblastic anemia: Positive/therapeutic effect mentioned", "38962588")
                )
            )

            "Viral infections" -> Pair(
                """
Alternative approaches
1. HIV-HBV co-infection biomarkers: G
2. Endophytes in medicinal plants: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Salivary PCR for congenital CMV: No clear dose/effect/duration found

Herbs
1. ML-assisted affinity ultrafiltration for neuraminidase inhibitors: No clear dose/effect/duration found
2. rweChemScreener for effective TCM ingredients: No clear dose/effect/duration found
3. Cathepsin B as PANoptosis regulator in influenza: No clear dose/effect/duration found

Amino acids
1. B/F/TAF & dolutegravir regimens outcomes: month
2. Anti-HIV drug against SARS-CoV-2: µg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Gold nanoparticles for SARS-CoV-2 antigen delivery: No clear dose/effect/duration found

Vitamins
1. Congenital Zika Virus syndrome nutritional deficits: Positive/therapeutic effect mentioned
2. Vitamin D, CMV seropositivity, pregnancy: Negative/adverse effect mentioned
3. GWI, FM, ME/CFS, Long COVID overlap: Positive/therapeutic effect mentioned

Minerals
1. Bone mineral density in HIV-infected people: No clear dose/effect/duration found
2. Aptamer-based gFET sensor for adenovirus 5: Positive/therapeutic effect mentioned
3. Silica nanoparticles for T cell induction in HPV16 vaccination: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

Supplements
1. Reticulon-3 in dengue pathogenesis: Positive/therapeutic effect mentioned
2. Dengue-related ocular complications: No clear dose/effect/duration found
3. COVID-19 pandemic caregiver outcomes in rural China: Positive/therapeutic effect mentioned

Nutrients
1. Endophytes in medicinal plants: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Ephedra przewalskii compounds against SARS-CoV-2: No clear dose/effect/duration found
3. Food insecurity determinants in older adults: No clear dose/effect/duration found
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Curr HIV/AIDS Rep. 2025 Sep 27;22(1):46", "👉 HIV-HBV co-infection biomarkers: G", "41014390"),
                    Reference("Curr Microbiol. 2025 Sep 27;82(11):529", "👉 Endophytes in medicinal plants: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41014378"),
                    Reference("Viruses. 2025 Sep 17;17(9):1253", "👉 Salivary PCR for congenital CMV: No clear dose/effect/duration found", "41012680"),

                    // Herbs
                    Reference("Anal Chim Acta. 2025 Nov 8;1374:344522", "👉 ML-assisted affinity ultrafiltration for neuraminidase inhibitors: No clear dose/effect/duration found", "40983409"),
                    Reference("Phytomedicine. 2025 Nov;147:157225", "👉 rweChemScreener for effective TCM ingredients: No clear dose/effect/duration found", "40945250"),
                    Reference("Int J Mol Sci. 2025 Sep 2;26(17):8533", "👉 Cathepsin B as PANoptosis regulator in influenza: No clear dose/effect/duration found", "40943452"),

                    // Amino acids
                    Reference("AIDS Res Ther. 2025 Sep 26;22(1):90", "👉 B/F/TAF & dolutegravir regimens outcomes: month", "41013504"),
                    Reference("Viruses. 2025 Aug 27;17(9):1170", "👉 Anti-HIV drug against SARS-CoV-2: µg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41012598"),
                    Reference("Pharmaceutics. 2025 Sep 17;17(9):1211", "👉 Gold nanoparticles for SARS-CoV-2 antigen delivery: No clear dose/effect/duration found", "41012546"),

                    // Vitamins
                    Reference("Viruses. 2025 Sep 14;17(9):1239", "👉 Congenital Zika Virus syndrome nutritional deficits: Positive/therapeutic effect mentioned", "41012667"),
                    Reference("Viruses. 2025 Aug 31;17(9):1203", "👉 Vitamin D, CMV seropositivity, pregnancy: Negative/adverse effect mentioned", "41012631"),
                    Reference("Int J Mol Sci. 2025 Sep 17;26(18):9044", "👉 GWI, FM, ME/CFS, Long COVID overlap: Positive/therapeutic effect mentioned", "41009608"),

                    // Minerals
                    Reference("Biomedicines. 2025 Sep 20;13(9):2305", "👉 Bone mineral density in HIV-infected people: No clear dose/effect/duration found", "41007865"),
                    Reference("Biosensors (Basel). 2025 Sep 14;15(9):605", "👉 Aptamer-based gFET sensor for adenovirus 5: Positive/therapeutic effect mentioned", "41002345"),
                    Reference("Oncoimmunology. 2025 Dec;14(1):2548002", "👉 Silica nanoparticles for T cell induction in HPV16 vaccination: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40981650"),

                    // Supplements
                    Reference("Viruses. 2025 Sep 13;17(9):1238", "👉 Reticulon-3 in dengue pathogenesis: Positive/therapeutic effect mentioned", "41012666"),
                    Reference("Pathogens. 2025 Sep 2;14(9):872", "👉 Dengue-related ocular complications: No clear dose/effect/duration found", "41011772"),
                    Reference("J Glob Health. 2025 Sep 26;15:04203", "👉 COVID-19 pandemic caregiver outcomes in rural China: Positive/therapeutic effect mentioned", "41004217"),

                    // Nutrients
                    Reference("Curr Microbiol. 2025 Sep 27;82(11):529", "👉 Endophytes in medicinal plants: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41014378"),
                    Reference("Nutrients. 2025 Sep 15;17(18):2958", "👉 Ephedra przewalskii compounds against SARS-CoV-2: No clear dose/effect/duration found", "41010483"),
                    Reference("Nutrients. 2025 Sep 12;17(18):2934", "👉 Food insecurity determinants in older adults: No clear dose/effect/duration found", "41010460")
                )
            )

            "Vitamin D deficiency" -> Pair(
                """
Alternative approaches
1. Vitamin D intake from foods and supplements: μg
2. Diclofenac vs vitamin D for myofascial pain: Positive/therapeutic effect mentioned | week
3. Protein liquid supplementation post-bariatric surgery: Positive/therapeutic effect mentioned | day, month

Herbs
1. Dietary modification for chronic urticaria: Positive/therapeutic effect mentioned
2. Chinese herbs and bone disease: IU, mg

Amino acids
1. Homocystinuria due to CBS deficiency: Positive/therapeutic effect mentioned
2. Subclinical hypothyroidism & vitamin D deficiency: g | Positive/therapeutic effect mentioned
3. Micronutrient dynamics during pregnancy/postpartum: No clear dose/effect/duration found

Vitamins
1. Vitamin D levels in health screening & lumbar degenerative disease: No clear dose/effect/duration found
2. Risk factors of multiple sclerosis in UAE: No clear dose/effect/duration found
3. Vitamin D, CMV, pregnancy: Negative/adverse effect mentioned

Minerals
1. Bone disease in kidney transplant: IU, mg | Positive/therapeutic effect mentioned | month
2. Vitamin D-fortified foods & bone health: Positive/therapeutic effect mentioned
3. Paget's disease & hyperparathyroidism: mg | month

Supplements
1. Self-prescribed vitamin D among UAE students: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month
2. Vitamin D status in patients with internal, autoimmune, metabolic diseases: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Cystic fibrosis multivitamin impact on vitamin status: Positive/therapeutic effect mentioned | month

Nutrients
1. Self-prescribed vitamin D among UAE students: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month
2. Vitamin D levels and Long COVID signs: Positive/therapeutic effect mentioned | day, month
3. Vitamin D deficiency and COVID-19 supplementation review: No clear dose/effect/duration found
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("J Nutr. 2025 Sep 10", "👉 Vitamin D intake from foods and supplements", "40939880"),
                    Reference("BMC Oral Health. 2025 Aug 29;25(1):1383", "👉 Diclofenac vs vitamin D for myofascial pain: Positive/therapeutic effect mentioned | week", "40883693"),
                    Reference("Obes Surg. 2025 Sep;35(9):3517-3528", "👉 Protein liquid supplementation post-bariatric surgery: Positive/therapeutic effect mentioned | day, month", "40836169"),

                    // Herbs
                    Reference("Dermatol Pract Concept. 2019 Dec 31;10(1):e2020004", "👉 Dietary modification for chronic urticaria: Positive/therapeutic effect mentioned", "31921491"),
                    Reference("Intern Med. 2003 Apr;42(4):345-50", "👉 Chinese herbs and bone disease: IU, mg", "12729324"),

                    // Amino acids
                    Reference("Homocystinuria due to CBS deficiency", "👉 Positive/therapeutic effect mentioned", "20301697"),
                    Reference("Medicine (Baltimore). 2025 Sep 5;104(36):e44277", "👉 Subclinical hypothyroidism & vitamin D deficiency: g | Positive/therapeutic effect mentioned", "40922358"),
                    Reference("PLoS One. 2025 Sep 4;20(9):e0331125", "👉 Micronutrient dynamics during pregnancy/postpartum: No clear dose/effect/duration found", "40906792"),

                    // Vitamins
                    Reference("Global Spine J. 2025 Sep 27", "👉 Vitamin D levels in health screening & lumbar degenerative disease: No clear dose/effect/duration found", "41014591"),
                    Reference("Int J Environ Health Res. 2025 Sep 27", "👉 Risk factors of multiple sclerosis in UAE: No clear dose/effect/duration found", "41014063"),
                    Reference("Viruses. 2025 Aug 31;17(9):1203", "👉 Vitamin D, CMV, pregnancy: Negative/adverse effect mentioned", "41012631"),

                    // Minerals
                    Reference("Int Urol Nephrol. 2025 Sep 25", "👉 Bone disease in kidney transplant: IU, mg | Positive/therapeutic effect mentioned | month", "40996610"),
                    Reference("Arch Osteoporos. 2025 Sep 22;20(1):128", "👉 Vitamin D-fortified foods & bone health: Positive/therapeutic effect mentioned", "40982112"),
                    Reference("Reports (MDPI). 2025 Sep 17;8(3):180", "👉 Paget's disease & hyperparathyroidism: mg | month", "40981138"),

                    // Supplements
                    Reference("Nutrients. 2025 Sep 9;17(18):2915", "👉 Self-prescribed vitamin D among UAE students: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month", "41010441"),
                    Reference("Biomedicines. 2025 Sep 5;13(9):2170", "👉 Vitamin D status in patients with internal, autoimmune, metabolic diseases: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41007732"),
                    Reference("Children (Basel). 2025 Aug 29;12(9):1149", "👉 Cystic fibrosis multivitamin impact on vitamin status: Positive/therapeutic effect mentioned | month", "41007013"),

                    // Nutrients
                    Reference("Nutrients. 2025 Sep 9;17(18):2915", "👉 Self-prescribed vitamin D among UAE students: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month", "41010441"),
                    Reference("Med Sci (Basel). 2025 Sep 18;13(3):199", "👉 Vitamin D levels and Long COVID signs: Positive/therapeutic effect mentioned | day, month", "40981197"),
                    Reference("J Assoc Physicians India. 2025 Sep;73(9):e38-e47", "👉 Vitamin D deficiency and COVID-19 supplementation review: No clear dose/effect/duration found", "40955938")
                )
            )

            "Warts" -> Pair(
                """
Alternative approaches
1. Imiquimod-induced systemic cytokine symptoms: Negative/adverse effect mentioned
2. PPD injection for multiple recalcitrant warts: Negative/adverse effect mentioned | week
3. Cantharidin in dermatology: Negative/adverse effect mentioned

Herbs
1. Milky sap of greater celandine: No clear dose/effect/duration found
2. Ethnopharmacological survey in Albaha, Saudi Arabia: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Ksharodaka injection for warts: Negative/adverse effect mentioned | day

Amino acids
1. Cryotherapy + photodynamic therapy for giant plantar warts: mg | Positive/therapeutic effect mentioned
2. Ketorolac tromethamine with 5-ALA photodynamic therapy: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Surgery + photodynamic therapy for epidermodysplasia verruciformis: No clear dose/effect/duration found

Vitamins
1. Intralesional vitamin D3 for cutaneous warts: IU | Positive/therapeutic effect mentioned | week
2. Intralesional immunotherapy review: Negative/adverse effect mentioned
3. Vitamin D vs MMR vaccine in warts: Negative/adverse effect mentioned | week

Minerals
1. HPV detection using genosensor: No clear dose/effect/duration found
2. WHIM syndrome & osteoporosis: Positive/therapeutic effect mentioned
3. Traditional medicine treatment of verruca vulgaris: No clear dose/effect/duration found

Supplements
1. EGCG for human health: Positive/therapeutic effect mentioned
2. Wing gene network in pea aphids: No clear dose/effect/duration found
3. HPV data system in China: Positive/therapeutic effect mentioned

Nutrients
1. Intralesional vitamin D3 for cutaneous warts: IU | Positive/therapeutic effect mentioned | week
2. Intralesional vitamin D3 in cutaneous warts: mg | Negative/adverse effect mentioned | month
3. Intralesional vitamin D for recalcitrant warts: IU, mg | Negative/adverse effect mentioned | week
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Int J STD AIDS. 2025 Aug 12", "👉 Imiquimod-induced systemic cytokine symptoms: Negative/adverse effect mentioned", "40791029"),
                    Reference("Am J Case Rep. 2025 Aug 12;26:e947367", "👉 PPD injection for multiple recalcitrant warts: Negative/adverse effect mentioned | week", "40790864"),
                    Reference("Pediatr Dermatol. 2025 Sep-Oct;42(5):913-926", "👉 Cantharidin in dermatology: Negative/adverse effect mentioned", "40765102"),

                    // Herbs
                    Reference("Int J Environ Res Public Health. 2020 Feb 27;17(5):1540", "👉 Milky sap of greater celandine: No clear dose/effect/duration found", "32120948"),
                    Reference("Pharmacognosy Res. 2017 Oct-Dec;9(4):401-407", "👉 Ethnopharmacological survey in Albaha, Saudi Arabia: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "29263636"),
                    Reference("J Ayurveda Integr Med. 2014 Oct-Dec;5(4):236-40", "👉 Ksharodaka injection for warts: Negative/adverse effect mentioned | day", "25624698"),

                    // Amino acids
                    Reference("Photodiagnosis Photodyn Ther. 2025 Oct;55:104762", "👉 Cryotherapy + photodynamic therapy for giant plantar warts: mg | Positive/therapeutic effect mentioned", "40796063"),
                    Reference("Photodiagnosis Photodyn Ther. 2025 Aug;54:104646", "👉 Ketorolac tromethamine with 5-ALA photodynamic therapy: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40409692"),
                    Reference("Photobiomodul Photomed Laser Surg. 2025 Jun;43(6):263-264", "👉 Surgery + photodynamic therapy for epidermodysplasia verruciformis: No clear dose/effect/duration found", "40257968"),

                    // Vitamins
                    Reference("J Prim Care Community Health. 2025 Jan-Dec;16:21501319251365853", "👉 Intralesional vitamin D3 for cutaneous warts: IU | Positive/therapeutic effect mentioned | week", "40847834"),
                    Reference("Int J Mol Sci. 2025 Jun 12;26(12):5644", "👉 Intralesional immunotherapy review: Negative/adverse effect mentioned", "40565110"),
                    Reference("Indian J Dermatol. 2025 May-Jun;70(3):169", "👉 Vitamin D vs MMR vaccine in warts: Negative/adverse effect mentioned | week", "40487499"),

                    // Minerals
                    Reference("J Pharm Biomed Anal. 2025 Sep 15;263:116920", "👉 HPV detection using genosensor: No clear dose/effect/duration found", "40311543"),
                    Reference("Nat Commun. 2023 Apr 12;14(1):2058", "👉 WHIM syndrome & osteoporosis: Positive/therapeutic effect mentioned", "37045841"),
                    Reference("Acta Clin Croat. 2020 Dec;59(4):745-750", "👉 Traditional medicine treatment of verruca vulgaris: No clear dose/effect/duration found", "34285446"),

                    // Supplements
                    Reference("Int J Mol Sci. 2025 Sep 22;26(18):9253", "👉 EGCG for human health: Positive/therapeutic effect mentioned", "41009815"),
                    Reference("bioRxiv [Preprint]. 2025 May 5", "👉 Wing gene network in pea aphids: No clear dose/effect/duration found", "40654827"),
                    Reference("BMC Infect Dis. 2025 Jul 1;25(1):873", "👉 HPV data system in China: Positive/therapeutic effect mentioned", "40597707"),

                    // Nutrients
                    Reference("J Prim Care Community Health. 2025 Jan-Dec;16:21501319251365853", "👉 Intralesional vitamin D3 for cutaneous warts: IU | Positive/therapeutic effect mentioned | week", "40847834"),
                    Reference("J Coll Physicians Surg Pak. 2025 May;35(5):642-645", "👉 Intralesional vitamin D3 in cutaneous warts: mg | Negative/adverse effect mentioned | month", "40325584"),
                    Reference("JNMA J Nepal Med Assoc. 2024 May 31;62(274):378-381", "👉 Intralesional vitamin D for recalcitrant warts: IU, mg | Negative/adverse effect mentioned | week", "39356863")
                )
            )

            "Whooping cough" -> Pair(
                """
Alternative approaches
1. Macrolide resistance of B. pertussis in Guangzhou: g, mg, G | Positive/therapeutic effect mentioned
2. Acellular pertussis vaccine and resurgence: Positive/therapeutic effect mentioned
3. Hydroxyurea as potential therapy for malignant pertussis: Positive/therapeutic effect mentioned

Herbs
1. Butajira Rural Health Project, Ethiopia: Positive/therapeutic effect mentioned

Amino acids
1. Conserved sRNA downregulates virulence genes in B. pertussis: g, g
2. Computational modeling of B. pertussis DAP epimerase: Positive/therapeutic effect mentioned
3. Melanin in B. parapertussis confers survival advantage: No clear dose/effect/duration found

Vitamins
1. Zero-dose communities and primary healthcare access: No clear dose/effect/duration found
2. LL-37, HBD-2, vitamin D3 deficiency in infants with pertussis: month
3. Nonspecific immunological effects of BCG and DTP-IPV vaccines: week, day, month

Minerals
1. Metabolic landscape of B. pertussis: Positive/therapeutic effect mentioned
2. Food, health, better life: Positive/therapeutic effect mentioned | month
3. Asbestos exposure risk assessment: No clear dose/effect/duration found

Supplements
1. Many-compartment models and waning immunity: No clear dose/effect/duration found
2. Maternal pertussis vaccination decision-making: No clear dose/effect/duration found
3. Reactivating immunity primed by acellular pertussis vaccines: Positive/therapeutic effect mentioned

Nutrients
1. B. pertussis intracellular survival in epithelial cells: Positive/therapeutic effect mentioned
2. Extra-host origin of B. bronchiseptica: No clear dose/effect/duration found
3. Heat shock enhances OMV release in Bordetella spp.: Positive/therapeutic effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("BMC Infect Dis. 2025 Sep 26;25(1):1152", "👉 Macrolide resistance of B. pertussis in Guangzhou: g, mg, G | Positive/therapeutic effect mentioned", "41013351"),
                    Reference("Vaccines (Basel). 2025 Aug 7;13(8):841", "👉 Acellular pertussis vaccine and resurgence: Positive/therapeutic effect mentioned", "40872926"),
                    Reference("Cureus. 2025 Jul 10;17(7):e87648", "👉 Hydroxyurea as potential therapy for malignant pertussis: Positive/therapeutic effect mentioned", "40786380"),

                    // Herbs
                    Reference("Int J Health Sci. 1994;5(3):99-103", "👉 Butajira Rural Health Project, Ethiopia: Positive/therapeutic effect mentioned", "12320383"),

                    // Amino acids
                    Reference("mBio. 2025 Aug 13;16(8):e0135625", "👉 Conserved sRNA downregulates virulence genes in B. pertussis: g, g", "40626725"),
                    Reference("Appl Biochem Biotechnol. 2023 Nov;195(11):6675-6693", "👉 Computational modeling of B. pertussis DAP epimerase: Positive/therapeutic effect mentioned", "36913098"),
                    Reference("mSphere. 2021 Oct 27;6(5):e0081921", "👉 Melanin in B. parapertussis confers survival advantage: No clear dose/effect/duration found", "34643424"),

                    // Vitamins
                    Reference("PLoS One. 2023 Feb 16;18(2):e0281764", "👉 Zero-dose communities and primary healthcare access: No clear dose/effect/duration found", "36795706"),
                    Reference("J Infect Dev Ctries. 2020 Oct 31;14(10):1164-1169", "👉 LL-37, HBD-2, vitamin D3 deficiency in infants with pertussis: month", "33175712"),
                    Reference("Clin Infect Dis. 2020 Jan 16;70(3):455-463", "👉 Nonspecific immunological effects of BCG and DTP-IPV vaccines: week, day, month", "30919883"),

                    // Minerals
                    Reference("Appl Environ Microbiol. 2017 Oct 17;83(21):e01528-17", "👉 Metabolic landscape of B. pertussis: Positive/therapeutic effect mentioned", "28842544"),
                    Reference("J R Soc Health. 1993 Feb;113(1):5", "👉 Food, health, better life: Positive/therapeutic effect mentioned | month", "8437167"),
                    Reference("Am Rev Respir Dis. 1986 Jan;133(1):5-13", "👉 Asbestos exposure risk assessment: No clear dose/effect/duration found", "3510581"),

                    // Supplements
                    Reference("J Math Biol. 2023 Sep 21;87(4):61", "👉 Many-compartment models and waning immunity: No clear dose/effect/duration found", "37735281"),
                    Reference("PLoS One. 2020 Nov 12;15(11):e0242261", "👉 Maternal pertussis vaccination decision-making: No clear dose/effect/duration found", "33180859"),
                    Reference("Front Immunol. 2019 Jul 3;10:1520", "👉 Reactivating immunity primed by acellular pertussis vaccines: Positive/therapeutic effect mentioned", "31333656"),

                    // Nutrients
                    Reference("Pathog Dis. 2023 Jan 17;81:ftad035", "👉 B. pertussis intracellular survival in epithelial cells: Positive/therapeutic effect mentioned", "38040630"),
                    Reference("J Appl Microbiol. 2023 Sep 5;134(9):lxad200", "👉 Extra-host origin of B. bronchiseptica: No clear dose/effect/duration found", "37660236"),
                    Reference("Curr Res Microb Sci. 2020 Sep 17;2:100009", "👉 Heat shock enhances OMV release in Bordetella spp.: Positive/therapeutic effect mentioned", "34841303")
                )
            )

            "Worms in humans" -> Pair(
                """
Alternative approaches
1. Medicinal plants & phytochemicals against Strongyloidiasis: Negative/adverse effect mentioned
2. Community insights for schistosomiasis control: Positive/therapeutic effect mentioned
3. Subcutaneous echinococcosis case reports: Positive/therapeutic effect mentioned

Herbs
1. Anthelmintic potential of fabaceous plants: No clear dose/effect/duration found
2. Loiasis patient healthcare-seeking in Gabon: No clear dose/effect/duration found
3. Schistosomiasis treatment with traditional Chinese medicine: Positive/therapeutic effect mentioned

Amino acids
1. Occurrence of Anisakis spp. in fish: No clear dose/effect/duration found
2. Schistosomiasis cercarial invasion: Positive/therapeutic effect mentioned
3. Protein acetylation roles in prokaryotes/eukaryotes: No clear dose/effect/duration found

Vitamins
1. Occurrence of Anisakis spp. in fish: No clear dose/effect/duration found
2. Loss of vitamin C biosynthesis protects from parasitic infection: Positive/therapeutic effect mentioned
3. Targeting PLAG-15 promotes healthy aging in C. elegans: G | Positive/therapeutic effect mentioned

Minerals
1. Occurrence of Anisakis spp. in fish: No clear dose/effect/duration found
2. Biomimetic adhesives inspired by marine adhesion: No clear dose/effect/duration found
3. Nutritional predictors of lymphatic filariasis: No clear dose/effect/duration found

Supplements
1. Stocking African catfish for snail biocontrol: Positive/therapeutic effect mentioned
2. Cardiorespiratory fitness post-pectus excavatum correction: Positive/therapeutic effect mentioned
3. Lacticaseibacillus casei HY2782 improves intestinal barrier and lifespan in C. elegans: G | Positive/therapeutic effect mentioned

Nutrients
1. Fasciola hepatica Glycocode and host interactions: Positive/therapeutic effect mentioned
2. Gut cross-kingdom dialogs integrating bacteria, helminths, microbiota: Positive/therapeutic effect mentioned
3. Environmental NaCl affects C. elegans development and aging: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Pathogens. 2025 Aug 23;14(9):842", "👉 Medicinal plants & phytochemicals against Strongyloidiasis: Negative/adverse effect mentioned", "41011741"),
                    Reference("Health Place. 2025 Sep;95:103548", "👉 Community insights for schistosomiasis control: Positive/therapeutic effect mentioned", "40967094"),
                    Reference("PLoS Negl Trop Dis. 2025 Sep 15;19(9):e0013511", "👉 Subcutaneous echinococcosis case reports: Positive/therapeutic effect mentioned", "40953069"),

                    // Herbs
                    Reference("J Parasit Dis. 2025 Sep;49(3):513-522", "👉 Anthelmintic potential of fabaceous plants: No clear dose/effect/duration found", "40901433"),
                    Reference("PLoS Negl Trop Dis. 2024 Aug 19;18(8):e0012389", "👉 Loiasis patient healthcare-seeking in Gabon: No clear dose/effect/duration found", "39159280"),
                    Reference("J Ethnopharmacol. 2024 Oct 28;333:118501", "👉 Schistosomiasis treatment with traditional Chinese medicine: Positive/therapeutic effect mentioned", "38944361"),

                    // Amino acids
                    Reference("Open Vet J. 2025 Jun;15(6):2774-2781", "👉 Occurrence of Anisakis spp. in fish: No clear dose/effect/duration found", "40989632"),
                    Reference("Clin Microbiol Rev. 2025 Sep 11;38(3):e0019624", "👉 Schistosomiasis cercarial invasion: Positive/therapeutic effect mentioned", "40626643"),
                    Reference("Cell Biol Int. 2025 Oct;49(10):1301-1318", "👉 Protein acetylation roles in prokaryotes/eukaryotes: No clear dose/effect/duration found", "40616587"),

                    // Vitamins
                    Reference("Open Vet J. 2025 Jun;15(6):2774-2781", "👉 Occurrence of Anisakis spp. in fish: No clear dose/effect/duration found", "40989632"),
                    Reference("bioRxiv [Preprint]. 2025 Jul 26:2025.07.22.666193", "👉 Loss of vitamin C biosynthesis protects from parasitic infection: Positive/therapeutic effect mentioned", "40777373"),
                    Reference("iScience. 2025 Jun 16;28(7):112880", "👉 Targeting PLAG-15 promotes healthy aging in C. elegans: G | Positive/therapeutic effect mentioned", "40655094"),

                    // Minerals
                    Reference("Open Vet J. 2025 Jun;15(6):2774-2781", "👉 Occurrence of Anisakis spp. in fish: No clear dose/effect/duration found", "40989632"),
                    Reference("Macromol Biosci. 2025 Aug;25(8):e2500065", "👉 Biomimetic adhesives inspired by marine adhesion: No clear dose/effect/duration found", "40249319"),
                    Reference("PLoS One. 2025 Mar 26;20(3):e0320640", "👉 Nutritional predictors of lymphatic filariasis: No clear dose/effect/duration found", "40138337"),

                    // Supplements
                    Reference("PLoS Negl Trop Dis. 2025 Sep 3;19(9):e0013490", "👉 Stocking African catfish for snail biocontrol: Positive/therapeutic effect mentioned", "40901991"),
                    Reference("Sci Rep. 2025 Jul 19;15(1):26282", "👉 Cardiorespiratory fitness post-pectus excavatum correction: Positive/therapeutic effect mentioned", "40683912"),
                    Reference("Food Funct. 2025 Jul 14;16(14):5871-5884", "👉 Lacticaseibacillus casei HY2782 improves intestinal barrier and lifespan in C. elegans: G | Positive/therapeutic effect mentioned", "40586753"),

                    // Nutrients
                    Reference("Biomolecules. 2025 Aug 26;15(9):1235", "👉 Fasciola hepatica Glycocode and host interactions: Positive/therapeutic effect mentioned", "41008542"),
                    Reference("PLoS Pathog. 2025 Sep 11;21(9):e1013494", "👉 Gut cross-kingdom dialogs integrating bacteria, helminths, microbiota: Positive/therapeutic effect mentioned", "40934190"),
                    Reference("Genetics. 2025 Aug 18:iyaf139", "👉 Environmental NaCl affects C. elegans development and aging: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40820329")
                )
            )

            "Yeast infection" -> Pair(
                """
Alternative approaches
1. Cinnamaldehyde & nano-cinnamaldehyde against candidiasis: µg, mg
2. Simplified yeast process for VLP Dengue vaccine production: No clear dose/effect/duration found
3. Antimicrobial peptides Act-6 and Act 8-20: No clear dose/effect/duration found

Herbs
1. SaUGTs regulate YE-induced phytoalexins in Sorbus aucuparia: No clear dose/effect/duration found
2. Selenium nanoparticles via Zambian medicinal herbs: Positive/therapeutic effect mentioned
3. Actinomycetes endophytes of Indian medicinal herbs: µg | Positive/therapeutic effect mentioned | week

Amino acids
1. LMP7 as target for coronavirus therapy: Negative/adverse effect mentioned
2. BRCA1-BRCT interactions profiling: No clear dose/effect/duration found
3. Magnesium oxide nanoparticles green synthesis & in vitro applications: µg | Positive/therapeutic effect mentioned

Vitamins
1. Menadione-triazolyl-selenoester antifungal profile: μg | Negative/adverse effect mentioned
2. Riboflavin inhibits Cryptococcus neoformans & efficacy in pulmonary cryptococcosis: Positive/therapeutic effect mentioned
3. Callistemon viminalis antifungal activity: No clear dose/effect/duration found

Minerals
1. Phosphorylated pullulan as drug delivery matrix to prevent oral biofilm: Positive/therapeutic effect mentioned
2. Graphene oxide-enhanced chitosan sponges for infected wounds: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Candida albicans Goliath cells pioneer biofilm formation: Positive/therapeutic effect mentioned

Supplements
1. Broiler response to dietary yeast cell wall components challenged with Salmonella: No clear dose/effect/duration found
2. Multidrug-resistant yeasts in fresh fruits: µg
3. Bacillus velezensis NC-B4 as antifungal agent for Candida auris: Negative/adverse effect mentioned

Nutrients
1. NaCl and Glutamine effect on Pseudomonas aeruginosa biofilm: Positive/therapeutic effect mentioned
2. Skin microbiota in facial dermatoses: Positive/therapeutic effect mentioned
3. Clonostachys rosea as entomopathogenic fungus: No clear dose/effect/duration found
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("BMC Oral Health. 2025 Sep 26;25(1):1432", "👉 Cinnamaldehyde & nano-cinnamaldehyde against candidiasis: µg, mg", "41013439"),
                    Reference("Bioengineering (Basel). 2025 Sep 5;12(9):956", "👉 Simplified yeast process for VLP Dengue vaccine production: No clear dose/effect/duration found", "41007201"),
                    Reference("J Fungi (Basel). 2025 Jul 12;11(7):519", "👉 Antimicrobial peptides Act-6 and Act 8-20: No clear dose/effect/duration found", "40985427"),

                    // Herbs
                    Reference("BMC Plant Biol. 2025 Jul 24;25(1):952", "👉 SaUGTs regulate YE-induced phytoalexins in Sorbus aucuparia: No clear dose/effect/duration found", "40702429"),
                    Reference("PLoS One. 2025 Jun 20;20(6):e0325460", "👉 Selenium nanoparticles via Zambian medicinal herbs: Positive/therapeutic effect mentioned", "40540454"),
                    Reference("Braz J Microbiol. 2025 Jun;56(2):779-795", "👉 Actinomycetes endophytes of Indian medicinal herbs: µg | Positive/therapeutic effect mentioned | week", "39878823"),

                    // Amino acids
                    Reference("Pathogens. 2025 Sep 2;14(9):871", "👉 LMP7 as target for coronavirus therapy: Negative/adverse effect mentioned", "41011771"),
                    Reference("Nucleic Acids Res. 2025 Sep 5;53(17):gkaf848", "👉 BRCA1-BRCT interactions profiling: No clear dose/effect/duration found", "40966517"),
                    Reference("PLoS One. 2025 Sep 17;20(9):e0332367", "👉 Magnesium oxide nanoparticles green synthesis & in vitro applications: µg | Positive/therapeutic effect mentioned", "40961086"),

                    // Vitamins
                    Reference("Bioorg Med Chem. 2025 Dec 1;130:118380", "👉 Menadione-triazolyl-selenoester antifungal profile: μg | Negative/adverse effect mentioned", "40929783"),
                    Reference("Virulence. 2025 Dec;16(1):2543064", "👉 Riboflavin inhibits Cryptococcus neoformans & efficacy in pulmonary cryptococcosis: Positive/therapeutic effect mentioned", "40754661"),
                    Reference("Cell Mol Biol (Noisy-le-grand). 2025 Jul 30;71(7):87-91", "👉 Callistemon viminalis antifungal activity: No clear dose/effect/duration found", "40736289"),

                    // Minerals
                    Reference("BMC Oral Health. 2025 Aug 16;25(1):1333", "👉 Phosphorylated pullulan as drug delivery matrix to prevent oral biofilm: Positive/therapeutic effect mentioned", "40819043"),
                    Reference("Int J Mol Sci. 2025 Jul 31;26(15):7403", "👉 Graphene oxide-enhanced chitosan sponges for infected wounds: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40806531"),
                    Reference("mBio. 2025 Sep 10;16(9):e0342524", "👉 Candida albicans Goliath cells pioneer biofilm formation: Positive/therapeutic effect mentioned", "40778760"),

                    // Supplements
                    Reference("Vet Res Commun. 2025 Sep 25;49(6):329", "👉 Broiler response to dietary yeast cell wall components challenged with Salmonella: No clear dose/effect/duration found", "40996575"),
                    Reference("Lett Appl Microbiol. 2025 Sep 12:ovaf116", "👉 Multidrug-resistant yeasts in fresh fruits: µg", "40966660"),
                    Reference("Front Cell Infect Microbiol. 2025 Sep 2;15:1515537", "👉 Bacillus velezensis NC-B4 as antifungal agent for Candida auris: Negative/adverse effect mentioned", "40964052"),

                    // Nutrients
                    Reference("Microorganisms. 2025 Sep 19;13(9):2198", "👉 NaCl and Glutamine effect on Pseudomonas aeruginosa biofilm: Positive/therapeutic effect mentioned", "41011529"),
                    Reference("Int J Mol Sci. 2025 Sep 11;26(18):8857", "👉 Skin microbiota in facial dermatoses: Positive/therapeutic effect mentioned", "41009424"),
                    Reference("Biology (Basel). 2025 Sep 10;14(9):1240", "👉 Clonostachys rosea as entomopathogenic fungus: No clear dose/effect/duration found", "41007384")
                )
            )

            "Zika virus" -> Pair(
                """
Alternative approaches
1. Hydrogel beads with turmeric essential oil larvicidal against Aedes aegypti: mg | Negative/adverse effect mentioned
2. Evolutionary dynamics and novel control strategies: No clear dose/effect/duration found
3. Low-Energy Electron Irradiation inactivates viruses in serum and maintains growth in cell culture: Positive/therapeutic effect mentioned

Herbs
1. Fangchinoline inhibits Zika virus by disrupting internalization: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
2. Andrographolide herbal-chemosynthetic approach: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
3. Harringtonine inhibits Zika virus infection through multiple mechanisms: Positive/therapeutic effect mentioned

Amino acids
1. Phenylalanine derivatives antiviral against chikungunya & parainfluenza virus type 3: Negative/adverse effect mentioned
2. Untargeted metabolomics in Orthoflaviviruses-infected mice: Positive/therapeutic effect mentioned
3. Comptonellins A-H cyclopeptides antiviral: G

Vitamins
1. Long-term nutritional deficits & growth patterns in congenital Zika virus syndrome: Positive/therapeutic effect mentioned
2. Digital health interventions for obesity management: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month
3. Zika virus infection suppresses CYP24A1 and CAMP in monocytes: Positive/therapeutic effect mentioned

Minerals
1. Intracranial calcifications in congenital viral infections: No clear dose/effect/duration found
2. Sulfur/selenium-functionalized benzotriazoles targeting Zika & Chikungunya: Negative/adverse effect mentioned
3. Dual surrogate imprinting for virus-selective particles: No clear dose/effect/duration found

Supplements
1. Zika virus-like particle production in stirred tank bioreactor: No clear dose/effect/duration found
2. Modeling glioblastoma in 3D hydrogels for Zika virus targeting & immune modulation: Negative/adverse effect mentioned
3. Low-Energy Electron Irradiation inactivates viruses in serum and maintains growth in cell culture: Positive/therapeutic effect mentioned

Nutrients
1. Pathogenic breaches: viruses compromise blood-tissue barriers: No clear dose/effect/duration found
2. Digital health interventions for obesity management: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month
3. Critical parameters on Zika virus-like particles' generation: Positive/therapeutic effect mentioned
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("J Med Entomol. 2025 Sep 14:tjaf111", "👉 Hydrogel beads with turmeric essential oil larvicidal against Aedes aegypti: mg | Negative/adverse effect mentioned", "40971703"),
                    Reference("Vector Borne Zoonotic Dis. 2025 Sep 16", "👉 Evolutionary dynamics and novel control strategies: No clear dose/effect/duration found", "40955762"),
                    Reference("Appl Biosaf. 2025 Aug 29;30(3):264-271", "👉 Low-Energy Electron Irradiation inactivates viruses in serum and maintains growth in cell culture: Positive/therapeutic effect mentioned", "40927144"),

                    // Herbs
                    Reference("ACS Infect Dis. 2024 Dec 13;10(12):4066-4072", "👉 Fangchinoline inhibits Zika virus by disrupting internalization: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "39534987"),
                    Reference("Molecules. 2021 Nov 21;26(22):7036", "👉 Andrographolide herbal-chemosynthetic approach: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "34834128"),
                    Reference("Molecules. 2020 Sep 7;25(18):4082", "👉 Harringtonine inhibits Zika virus infection through multiple mechanisms: Positive/therapeutic effect mentioned", "32906689"),

                    // Amino acids
                    Reference("Bioorg Med Chem. 2025 Dec 1;130:118343", "👉 Phenylalanine derivatives antiviral against chikungunya & parainfluenza virus type 3: Negative/adverse effect mentioned", "40812194"),
                    Reference("BMC Microbiol. 2025 Jul 25;25(1):452", "👉 Untargeted metabolomics in Orthoflaviviruses-infected mice: Positive/therapeutic effect mentioned", "40713474"),
                    Reference("J Nat Prod. 2025 Jun 27;88(6):1399-1412", "👉 Comptonellins A-H cyclopeptides antiviral: G", "40493855"),

                    // Vitamins
                    Reference("Viruses. 2025 Sep 14;17(9):1239", "👉 Long-term nutritional deficits & growth patterns in congenital Zika virus syndrome: Positive/therapeutic effect mentioned", "41012667"),
                    Reference("Cochrane Database Syst Rev. 2025 Jul 10;7(7):CD015968", "👉 Digital health interventions for obesity management: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month", "40637164"),
                    Reference("Arch Virol. 2024 Jun 6;169(7):135", "👉 Zika virus infection suppresses CYP24A1 and CAMP in monocytes: Positive/therapeutic effect mentioned", "38839691"),

                    // Minerals
                    Reference("Curr Opin Virol. 2025 Sep 6;73:101479", "👉 Intracranial calcifications in congenital viral infections: No clear dose/effect/duration found", "40915005"),
                    Reference("Future Med Chem. 2025 Jun;17(12):1363-1375", "👉 Sulfur/selenium-functionalized benzotriazoles targeting Zika & Chikungunya: Negative/adverse effect mentioned", "40624932"),
                    Reference("Mater Horiz. 2025 Mar 4;12(5):1486-1493", "👉 Dual surrogate imprinting for virus-selective particles: No clear dose/effect/duration found", "39846824"),

                    // Supplements
                    Reference("Bioprocess Biosyst Eng. 2025 Sep 22", "👉 Zika virus-like particle production in stirred tank bioreactor: No clear dose/effect/duration found", "40982077"),
                    Reference("Biomater Adv. 2025 Sep 11;179:214492", "👉 Modeling glioblastoma in 3D hydrogels for Zika virus targeting & immune modulation: Negative/adverse effect mentioned", "40957303"),
                    Reference("Appl Biosaf. 2025 Aug 29;30(3):264-271", "👉 Low-Energy Electron Irradiation inactivates viruses in serum and maintains growth in cell culture: Positive/therapeutic effect mentioned", "40927144"),

                    // Nutrients
                    Reference("Tissue Barriers. 2025 Aug 30:2549020", "👉 Pathogenic breaches: viruses compromise blood-tissue barriers: No clear dose/effect/duration found", "40884531"),
                    Reference("Cochrane Database Syst Rev. 2025 Jul 10;7(7):CD015968", "👉 Digital health interventions for obesity management: Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month", "40637164"),
                    Reference("J Virol Methods. 2025 May;334:115129", "👉 Critical parameters on Zika virus-like particles' generation: Positive/therapeutic effect mentioned", "39978420")
                )
            )


            else -> Pair("No summary available.", emptyList())
        }
    }

    // ✅ See peab olema siin — ilma selleta ongi "Initializer type mismatch" viga
    fun getDiseaseList(): List<String> {
        return listOf(
            "Indigestion",
            "Infertility",
            "Influenza",
            "Insomnia",
            "Irritable bowel syndrome",
            "Irritable hip",
            "Kidney stones",
            "Knee pain",
            "Labyrinthitis",
            "Lactose intolerance",
            "Laryngitis",
            "Leg cramps",
            "Leg ulcers",
            "Leukaemia",
            "Liver cancer",
            "Liver disease",
            "Lung cancer",
            "Lung conditions",
            "Lupus",
            "Lymphoma",
            "Mastitis",
            "Measles",
            "Meningitis",
            "Mental health conditions",
            "Migraine",
            "Molluscum contagiosum",
            "Multiple sclerosis",
            "Mumps",
            "Nail problems",
            "Nausea",
            "Neck pain",
            "Nerve pain",
            "Nervous system disorders",
            "Non-Hodgkin lymphoma",
            "Obesity",
            "OCD",
            "Oesophagitis",
            "Osteoarthritis",
            "Osteoporosis",
            "Ovarian cancer",
            "Overactive thyroid",
            "Panic disorder",
            "Parkinson's disease",
            "Pelvic pain",
            "Peptic ulcer",
            "Pericarditis",
            "Peripheral neuropathy",
            "Piles",
            "Pneumonia",
            "Polycystic ovary syndrome",
            "Post-traumatic stress disorder",
            "Pregnancy",
            "Prostate cancer",
            "Psoriasis",
            "Pulmonary embolism",
            "Raynaud's disease",
            "Rheumatoid arthritis",
            "Ringworm",
            "Rosacea",
            "Scabies",
            "Sciatica",
            "Sepsis",
            "Shingles",
            "Shortness of breath",
            "Sinusitis",
            "Skin cancer",
            "Sleep apnoea",
            "Sleep disorders",
            "Sore throat",
            "Sore throat in children",
            "Stomach cancer",
            "Stomach ulcers",
            "Stroke",
            "Stress",
            "Swollen glands",
            "Tinnitus",
            "Toothache",
            "Tuberculosis",
            "Tonsillitis",
            "Tonsillitis in children",
            "Tooth decay",
            "Tonsil stones",
            "Trigeminal neuralgia",
            "Ulcerative colitis",
            "Urinary incontinence",
            "Urinary tract infection",
            "Varicose veins",
            "Vertigo",
            "Viral infections",
            "Vitamin D deficiency",
            "Warts",
            "Whooping cough",
            "Worms in humans",
            "Yeast infection",
            "Zika virus"
        )
    }
}
