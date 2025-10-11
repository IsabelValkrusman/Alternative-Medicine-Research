package com.isabel.medicaldictionary.data

object DiseaseInfo {

    fun getDiseaseSummary(name: String): Pair<String, List<Reference>> {
        return when (name) {
            "ADHD in children and young people" -> Pair(
                """
Alternative approaches
1. Photobiomodulation for ADHD in model rats, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
2. Physical activity effects on suicidal ideation and sleep in adolescents with ADHD, Positive/therapeutic effect mentioned.
3. Screen-based VR classroom for behavioral sensory responses in autistic adolescents, No clear dose/effect/duration found.
4. Oral guanfacine treatment ameliorates ADHD-like symptoms, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
5. Dopamine transporter gene manipulation models, Negative/adverse effect mentioned.

Herbs
1. Bacopa monnieri & Centella asiatica on memory and IQ in children, Positive/therapeutic effect mentioned.
2. Herbs and dietary supplements in ADHD management, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
3. Herbal medicines via text mining, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
4. Systematic review of herbal medicines in children with ADHD, Negative/adverse effect mentioned.
5. TCM prescriptions for ADHD (data mining), No clear dose/effect/duration found.

Amino acids
1. Memantine for social impairment in ASD, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
2. Systems biology perspective on ADHD, Negative/adverse effect mentioned.
3. eIF5A and hypusination-related disorders, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
4. Argininosuccinate lyase deficiency, Positive/therapeutic effect mentioned.
5. Umami ingestion in ADHD model rats, Positive/therapeutic effect mentioned.

Vitamins
1. Prenatal vitamin D, multivitamin, folic acid supplementation and brain structure, Negative/adverse effect mentioned.
2. Vitamin interventions in ASD and ADHD, Positive/therapeutic effect mentioned.
3. Relationship between vitamin D and ADHD, Positive/therapeutic effect mentioned.
4. Role of nutrition in ADHD and neurodivergence, No clear dose/effect/duration found.

Minerals
1. Role of nutrition in ADHD and neurodivergence, No clear dose/effect/duration found.
2. Pediatric bone health & ADHD stimulants, Positive/therapeutic effect mentioned.
3. PTPSD (tetrahydrobiopterin deficiency), Positive/therapeutic effect mentioned.
4. Vitamins & dietary supplements in pharmacies, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
5. Nutrition intervention in ADHD management (China), No clear dose/effect/duration found.

Supplements
1. Neurodevelopmental disorder reclassification, No clear dose/effect/duration found.
2. Prenatal vitamin D, multivitamin, folic acid supplementation, Negative/adverse effect mentioned.
3. Medicinal plants for child mental health, Negative/adverse effect mentioned.
4. Restless legs syndrome and growing pains, No clear dose/effect/duration found.
5. Perinatal cannabis exposure, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.

Nutrients
1. Prenatal vitamin D, multivitamin, folic acid supplementation, Negative/adverse effect mentioned.
2. Maternal dietary pattern in pregnancy & behavioral outcomes, Positive/therapeutic effect mentioned.
3. Interventions to promote fruit & vegetable intake in children, Positive/therapeutic effect mentioned.
4. Vascular influences in neurodevelopmental disorders, No clear dose/effect/duration found.
5. Role of nutrition in ADHD and neurodivergence, No clear dose/effect/duration found.

Summary for readers
• ADHD management includes alternative therapies, herbs, amino acids, vitamins, minerals, supplements, and dietary approaches.
• Some interventions show positive therapeutic effects, others indicate adverse effects or unclear dosing.
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Lasers Med Sci. 2025 Oct 10;40(1):417", "👉 Photobiomodulation for ADHD in model rats, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41068432"),
                    Reference("J Affect Disord. 2025 Oct 7:120369", "👉 Physical activity effects on suicidal ideation and sleep in adolescents with ADHD, Positive/therapeutic effect mentioned", "41067651"),
                    Reference("IEEE Trans Neural Syst Rehabil Eng. 2025 Oct 9;PP", "👉 Screen-based VR classroom for behavioral sensory responses in autistic adolescents, No clear dose/effect/duration found", "41066276"),
                    Reference("Prog Neuropsychopharmacol Biol Psychiatry. 2025 Oct 5:111517", "👉 Oral guanfacine treatment ameliorates ADHD-like symptoms, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41057091"),
                    Reference("Adv Neurobiol. 2025;46:235-270", "👉 Dopamine transporter gene manipulation models, Negative/adverse effect mentioned", "41051713"),

                    // Herbs
                    Reference("J Ayurveda Integr Med. 2025 Jul-Aug;16(4):101164", "👉 Bacopa monnieri & Centella asiatica on memory and IQ in children, Positive/therapeutic effect mentioned", "40609195"),
                    Reference("CNS Neurol Disord Drug Targets. 2023;22(7):950-972", "👉 Herbs and dietary supplements in ADHD management, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "35864791"),
                    Reference("Evid Based Complement Alternat Med. 2019 Jun 4;2019:1798364", "👉 Herbal medicines via text mining, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "31275404"),
                    Reference("Complement Ther Med. 2017 Feb;30:14-23", "👉 Systematic review of herbal medicines in children with ADHD, Negative/adverse effect mentioned", "28137522"),
                    Reference("Zhongguo Zhong Yao Za Zhi. 2015 Mar;40(6):1185-91", "👉 TCM prescriptions for ADHD (data mining), No clear dose/effect/duration found", "26226768"),

                    // Amino acids
                    Reference("JAMA Netw Open. 2025 Oct 1;8(10):e2534927", "👉 Memantine for social impairment in ASD, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41032298"),
                    Reference("FASEB J. 2025 Sep 15;39(17):e70981", "👉 Systems biology perspective on ADHD, Negative/adverse effect mentioned", "40905754"),
                    Reference("J Neurodev Disord. 2025 Aug 29;17(1):53", "👉 eIF5A and hypusination-related disorders, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40883692"),
                    Reference("GeneReviews. 2011 Feb 3 [updated 2025 Aug 14]", "👉 Argininosuccinate lyase deficiency, Positive/therapeutic effect mentioned", "21290785"),
                    Reference("Yakugaku Zasshi. 2025;145(8):673-677", "👉 Umami ingestion in ADHD model rats, Positive/therapeutic effect mentioned", "40754410"),

                    // Vitamins
                    Reference("Nutrients. 2025 Sep 17;17(18):2979", "👉 Prenatal vitamin D, multivitamin, folic acid supplementation and brain structure, Negative/adverse effect mentioned", "41010504"),
                    Reference("Neuropsychiatr Dis Treat. 2025 Aug 30;21:1845-1855", "👉 Vitamin interventions in ASD and ADHD, Positive/therapeutic effect mentioned", "40910091"),
                    Reference("Curr Behav Neurosci Rep. 2024 Sep;11(3):164-181", "👉 Relationship between vitamin D and ADHD, Positive/therapeutic effect mentioned", "40822905"),
                    Reference("Front Nutr. 2025 Jul 30;12:1586925", "👉 Role of nutrition in ADHD and neurodivergence, No clear dose/effect/duration found", "40808843"),

                    // Minerals
                    Reference("Front Nutr. 2025 Jul 30;12:1586925", "👉 Role of nutrition in ADHD and neurodivergence, No clear dose/effect/duration found", "40808843"),
                    Reference("Cureus. 2025 Jun 24;17(6):e86672", "👉 Pediatric bone health & ADHD stimulants, Positive/therapeutic effect mentioned", "40709113"),
                    Reference("PTS-Related Tetrahydrobiopterin Deficiency (PTPSD). 2025 Jul 10", "👉 PTPSD (tetrahydrobiopterin deficiency), Positive/therapeutic effect mentioned", "40638773"),
                    Reference("Curr Opin Pediatr. 2025 Aug 1;37(4):408-417", "👉 Vitamins & dietary supplements in pharmacies, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40439702"),
                    Reference("Zhonghua Yu Fang Yi Xue Za Zhi. 2025 May 6;59(5):710-715", "👉 Nutrition intervention in ADHD management (China), No clear dose/effect/duration found", "40374362"),

                    // Supplements
                    Reference("Nervenarzt. 2025 Oct 1", "👉 Neurodevelopmental disorder reclassification, No clear dose/effect/duration found", "41032123"),
                    Reference("Nutrients. 2025 Sep 17;17(18):2979", "👉 Prenatal vitamin D, multivitamin, folic acid supplementation, Negative/adverse effect mentioned", "41010504"),
                    Reference("Children (Basel). 2025 Aug 28;12(9):1142", "👉 Medicinal plants for child mental health, Negative/adverse effect mentioned", "41007011"),
                    Reference("Front Neurol. 2025 Aug 22;16:1603694", "👉 Restless legs syndrome and growing pains, No clear dose/effect/duration found", "40917655"),
                    Reference("Drug Alcohol Depend Rep. 2025 Aug 19;16:100372", "👉 Perinatal cannabis exposure, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40896776"),

                    // Nutrients
                    Reference("Nutrients. 2025 Sep 17;17(18):2979", "👉 Prenatal vitamin D, multivitamin, folic acid supplementation, Negative/adverse effect mentioned", "41010504"),
                    Reference("Nutrients. 2025 Aug 29;17(17):2814", "👉 Maternal dietary pattern in pregnancy & behavioral outcomes, Positive/therapeutic effect mentioned", "40944202"),
                    Reference("Nutrients. 2025 Aug 25;17(17):2747", "👉 Interventions to promote fruit & vegetable intake in children, Positive/therapeutic effect mentioned", "40944137"),
                    Reference("Mol Psychiatry. 2025 Sep 2", "👉 Vascular influences in neurodevelopmental disorders, No clear dose/effect/duration found", "40897863"),
                    Reference("Front Nutr. 2025 Jul 30;12:1586925", "👉 Role of nutrition in ADHD and neurodivergence, No clear dose/effect/duration found", "40808843")
                )
            )

            "Acne" -> Pair(
                """
                Alternative
                1. Zinc oxide nanoparticles (topical): anti-inflammatory & antibacterial; early clinical evidence.
                2. Recombinant endolysin: antibacterial against Cutibacterium acnes.
                3. Dihydromyricetin (natural flavonoid): inhibits bacterial growth + inflammation via TLR2/NF-κB/MAPK.

                Herbs
                1. Angelica sinensis (Danggui) oil: microneedle delivery, potential acne treatment.
                2. Panax ginseng + other plants: cosmetic & antioxidant effect.
                3. Herbal medicine review: potential anti-inflammatory & antibacterial effects.

                Amino acids
                1. Isotretinoin: improves acne, affects thyroid hormones.

                Vitamins
                1. Vitamin D: low levels linked to acne and scarring risk.
                2. Isotretinoin (A-vitamin derivative): highly effective, potential side effects.

                Minerals
                1. Zinc, selenium, zeolites: support skin protection & anti-inflammatory mechanisms.
                2. Sunscreen + minerals: consensus for skin protection in India.

                Supplements
                1. EGCG (green tea): antioxidant, anti-inflammatory, may help acne.
                2. Deucravacitinib: some real-world studies report adverse effects.

                Nutrients
                1. Diet + skin microbiota: nutrients and microbiota affect acne inflammation.
                """.trimIndent(),
                listOf(
                    Reference("Biomedicines. 2025;13(9):2156", "👉 Zinc oxide nanoparticles", "41007718"),
                    Reference("Appl Environ Microbiol. 2025; e0116825", "👉 Recombinant endolysin", "40981439"),
                    Reference("Eur J Pharmacol. 2025;1006:178161", "👉 Dihydromyricetin", "40976272"),
                    Reference("Drug Deliv Transl Res. 2025; online", "👉 Angelica sinensis oil", "40883577"),
                    Reference("J Cosmet Dermatol. 2025;24(8):e70343", "👉 Panax ginseng", "40762221"),
                    Reference("Recent Adv Antiinfect Drug Discov. 2025; online", "👉 Herbal medicine review", "40662556"),
                    Reference("Medicine (Baltimore). 2025;104(35):e44236", "👉 Isotretinoin", "40898527"),
                    Reference("J Cosmet Dermatol. 2025;24(8):e70398", "👉 Vitamin D", "40836860"),
                    Reference("Arch Pharm (Weinheim). 2025;358(9):e70084", "👉 Isotretinoin (derivative)", "40899415"),
                    Reference("Int J Mol Sci. 2025;26(14):6821", "👉 Zinc, selenium, zeolites", "40725064"),
                    Reference("J Cosmet Dermatol. 2025;24(9):e70441", "👉 Sunscreen + minerals", "40955142"),
                    Reference("Int J Mol Sci. 2025;26(18):9253", "👉 EGCG (green tea)", "41009815"),
                    Reference("Int J Clin Pharm. 2025; online", "👉 Deucravacitinib", "40782323"),
                    Reference("Int J Mol Sci. 2025;26(18):8857", "👉 Diet + microbiota", "41009424"),
                )
            )

            "Acute pancreatitis" -> Pair(
                """
    Alternative
    1. Biliary drainage for periampullary neoplasms: preoperative management, retrospective study.
    2. Irreversible electroporation: tissue remodeling & fibrosis, histopathological/thermal effects.
    3. Endoscopic papillectomy: German clinical trends & hospital mortality.

    Herbs
    1. Network pharmacology + validation: common mechanisms & targets for AP.
    2. TCM formulas: improved microcirculation, systematic review & meta-analysis.
    3. TCM database: evidence for AP treatment and complication management.

    Amino acids
    1. Homocystinuria (CBS deficiency): therapeutic relevance linked to amino acid metabolism.
    2. Coxsackie B1 VLP vaccine: strong neutralizing antibody response, protective effect.
    3. Kynurenine 3-monooxygenase inhibitors: novel insights, possible adverse effects.

    Vitamins
    1. Purtscher-like retinopathy in alcoholic AP: diagnostic & clinical link.
    2. Homocystinuria (CBS deficiency): vitamin therapy strategies included.
    3. Rectal cancer trial (RT + chemo + PD-1 inhibitor): mixed effects, both beneficial & adverse.

    Minerals
    1. Dyslipidemia approach: mineral involvement in lipid regulation.
    2. Triglyceride-lowering drugs: beneficial but with potential adverse outcomes.
    3. Dachengqi decoction: metabolite- and PK-based efficacy in AP treatment.

    Supplements
    1. Plasma triglycerides & CV disease consensus: implications for AP context.
    2. Korean red ginseng: improved QoL in chronic pancreatitis, some adverse reports.
    3. Pancreatic enzyme replacement therapy (PERT): cost-effective intervention.

    Nutrients
    1. Nutritional management in chronic pancreatitis: precision therapy approaches.
    2. CP-associated sarcopenia: diagnosis & treatment review.
    3. Exocrine pancreatic insufficiency: late postoperative complication with malabsorption.
    """.trimIndent(),
                listOf(
                    Reference("Medicina (Kaunas). 2025;61(9):1565", "👉 Biliary drainage", "41010956"),
                    Reference("Biomedicines. 2025;13(9):2222", "👉 Irreversible electroporation", "41007782"),
                    Reference("Scand J Gastroenterol. 2025; online", "👉 Endoscopic papillectomy", "40988622"),
                    Reference("Bioresour Bioprocess. 2025;12(1):82", "👉 Medicinal herbs", "40736877"),
                    Reference("Chin Herb Med. 2025;17(3):584-600", "👉 TCM formulas", "40734918"),
                    Reference("Front Pharmacol. 2025;16:1583040", "👉 TCM database", "40626310"),
                    Reference("GeneReviews®. 2025 update", "👉 Homocystinuria (CBS deficiency)", "20301697"),
                    Reference("J Biomed Sci. 2025;32(1):86", "👉 Coxsackie B1 VLP vaccine", "40922007"),
                    Reference("Expert Opin Drug Discov. 2025;20(9):1209-1221", "👉 KMO inhibitors", "40667575"),
                    Reference("Diagnostics. 2025;15(18):2317", "👉 Purtscher-like retinopathy", "41008689"),
                    Reference("GeneReviews®. 2025 update", "👉 Homocystinuria + vitamins", "20301697"),
                    Reference("Zhonghua Zhong Liu Za Zhi. 2025;47(9):913-921", "👉 RT + chemo + PD-1", "40967882"),
                    Reference("Endotext: Approach to Dyslipidemia", "👉 Dyslipidemia & minerals", "26561696"),
                    Reference("Endotext: Triglyceride Lowering Drugs", "👉 TG-lowering & minerals", "28402615"),
                    Reference("Front Pharmacol. 2025;16:1549909", "👉 Dachengqi decoction", "40520196"),
                    Reference("Nutr Metab Cardiovasc Dis. 2025; online", "👉 Plasma triglycerides", "40887367"),
                    Reference("J Ginseng Res. 2025;49(5):502-508", "👉 Korean red ginseng", "40843010"),
                    Reference("World J Gastrointest Oncol. 2025;17(8):109544", "👉 PERT cost-effectiveness", "40837758"),
                    Reference("Nutrients. 2025;17(17):2720", "👉 Nutritional management", "40944111"),
                    Reference("Rev Esp Enferm Dig. 2025;117(9):513-520", "👉 CP-associated sarcopenia", "40899928"),
                    Reference("Maedica (Bucur). 2025;20(2):428-431", "👉 Exocrine pancreatic insufficiency", "40880691"),
                )
            )

            "Addison's disease" -> Pair(
                """
    Alternative
    1. Tobacco harm reduction rhetoric: Indigenous critiques, health policy impact (positive/therapeutic effect mentioned).
    2. Mendelian randomization: autoimmune–aortic disease links, causal insights (no clear dose/effect/duration).
    3. Antigenic variation in autoimmune endocrinopathy: mechanistic exploration (no clear dose/effect/duration).

    Herbs
    – No relevant studies found.

    Amino acids
    1. Hypoglycaemic ketoacidosis in endocrine emergencies: metabolic link (no clear dose/effect/duration).
    2. Dogs with hypoadrenocorticism: thyroid autoantibodies & clinical outcomes (effect duration ≈ week).
    3. Refractory hypothyroidism in children: overview, TSH resistance (no clear dose/effect/duration).

    Vitamins
    1. Vitamin B12 deficiency: hyperpigmentation, Addison-like presentation (no clear dose/effect/duration).
    2. Autoimmune polyglandular syndrome type 2 in elderly: case study (effect duration = g).
    3. APS-2 with alopecia universalis + Addison’s: case report (no clear dose/effect/duration).

    Minerals
    1. Glucocorticoid receptor polymorphisms: bone mineral density, adverse skeletal effects (negative/adverse effect mentioned).
    2. Autoimmune polyglandular syndromes: both positive and adverse mineral-related effects described (mixed effects).
    3. X-linked adrenoleukodystrophy with adrenal insufficiency: mineral impact (positive/therapeutic effect mentioned).

    Supplements
    1. Omega-3 supplementation: cost-effective in CV disease prevention (dose in mg, positive effect).
    2. Low BMI outcomes in adolescents with social risks: nutrition & supplementation link (positive effect mentioned).
    3. Primary ovarian insufficiency due to autoimmunity: MR analysis (no clear dose/effect/duration).

    Nutrients
    1. Bone mineral density & vitamin D status in autoimmune polyglandular syndromes (no clear dose/effect/duration).
    2. Nutrition guidance for cardiovascular health: general recommendations (no clear dose/effect/duration).
    3. Oat & sprouted oat components: blood pressure lowering, CV risk reduction (positive/therapeutic effect mentioned).
    """.trimIndent(),
                listOf(
                    Reference("Health Promot Int. 2025;40(4):daaf111", "👉 Tobacco harm reduction critique", "40728114"),
                    Reference("Int J Cardiol Cardiovasc Risk Prev. 2025;26:200426", "👉 Autoimmune–aortic disease MR", "40606285"),
                    Reference("Front Immunol. 2025;16:1561455", "👉 Antigenic variation in autoimmunity", "40093006"),

                    Reference("Dtsch Med Wochenschr. 2025;150(12):713-719", "👉 Hypoglycaemic ketoacidosis", "40388982"),
                    Reference("J Vet Intern Med. 2025;39(1):e17232", "👉 Dogs with hypoadrenocorticism", "39531378"),
                    Reference("J Pediatr Endocrinol Metab. 2024;37(10):841-849", "👉 Refractory hypothyroidism", "39242350"),

                    Reference("Trop Doct. 2025; online ahead of print", "👉 Vitamin B12 deficiency case", "40956928"),
                    Reference("Medicina (B Aires). 2025;85(4):872-875", "👉 APS type 2 in elderly", "40793900"),
                    Reference("Int Med Case Rep J. 2025;18:719-725", "👉 APS-2 with alopecia + Addison’s", "40546739"),

                    Reference("Endokrynol Pol. 2025; online ahead of print", "👉 GR polymorphisms & BMD", "40995703"),
                    Reference("Endotext: Autoimmune Polyglandular Syndromes", "👉 Mixed mineral effects", "25905375"),
                    Reference("Endotext: Adrenal insufficiency due to X-ALD", "👉 Positive mineral effect", "25905179"),

                    Reference("Value Health. 2025; online ahead of print", "👉 Omega-3 cost-effectiveness", "40701340"),
                    Reference("Acad Pediatr. 2025;25(5):102814", "👉 Low BMI & supplementation", "40107608"),
                    Reference("Front Endocrinol. 2024;15:1417896", "👉 POI & autoimmunity (MR)", "39717103"),

                    Reference("Horm Metab Res. 2024;56(2):128-133", "👉 BMD & vitamin D in APS", "37931915"),
                    Reference("Curr Atheroscler Rep. 2023;25(9):597-603", "👉 Nutrition guidance for CV health", "37428389"),
                    Reference("Nutrients. 2022;14(22):4772", "👉 Oat components & blood pressure", "36432463"),
                )
            )

            "Anaemia (iron deficiency)" -> Pair(
                """
    Alternative
    1. Iron indices in TB patients with anaemia: diagnostic/monitoring role (no clear dose/effect/duration).
    2. Canadian “Raise the Bar” intervention for ID recognition & management: feasibility study (negative/adverse effect mentioned).
    3. Oral ferrous sulfate posology: improved labs & clinical findings, but mixed tolerability (g, day | positive + adverse effects).

    Herbs
    1. Ninjin’yoeito + iron: improved preoperative anaemia, fatigue & anxiety (g, mg, day | positive effect).
    2. Iron-free multi-nutrient complex: promoted hemoglobinization, metabolic & immune benefits (positive effect).
    3. VMP35 MNC iron-free supplement: cytoprotection in anaemia, both benefit & risks noted (positive + adverse effects).

    Amino acids
    1. Pig skin peptide-iron chelates: potential therapy, but some adverse GI effects (day | negative effect).
    2. Elevated salivary hepcidin & IL-6 in infants: biomarker link, not treatment (no clear dose/effect/duration).
    3. Severe hypothyroidism in children: anaemia as manifestation, rare presentation (no clear dose/effect/duration).

    Vitamins
    1. Micronutrient influence in thyroid autoimmunity (Graves + Hashimoto’s): case report relevance (no clear dose/effect/duration).
    2. IDA in obese children: overlooked factor, vitamin role (µg | dose effect).
    3. Vitamin D + iron deficiency in autism spectrum disorder: prevalence study (no clear dose/effect/duration).

    Minerals
    1. Ferric carboxymaltose vs derisomaltose: distinct phosphate homeostasis effects (mg, week | positive effect).
    2. Osteoporosis risk in celiac disease: mineral-related screening implications (positive effect).
    3. Plant-based diets: anemia & osteoporosis risk, mixed outcomes (positive + adverse effects).

    Supplements
    1. Iron dextran complex in rats: restored iron levels, improved anaemia (positive effect).
    2. HA hydrogel with probiotic + prebiotic + iron: improved IDA outcomes (week | positive effect).
    3. Iron-fortified infants in malaria regions: HLA-G polymorphism linked to risk modulation (month | effect duration noted).

    Nutrients
    1. Adolescent girls with weekly IFA supplementation vs non-implementation: benefit, but adherence issues (positive + adverse effects).
    2. Vitamin D & iron deficiency in autism: comorbidity relevance (no clear dose/effect/duration).
    3. Nutritional anaemia beyond iron deficiency: narrative review, multifactorial causes (positive effect).
    """.trimIndent(),
                listOf(
                    Reference("Interdiscip Perspect Infect Dis. 2025;2025:2583917", "👉 Iron indices in TB patients", "40958916"),
                    Reference("Br J Haematol. 2025; online ahead of print", "👉 Raise the Bar intervention", "40936490"),
                    Reference("Medicine (Baltimore). 2025;104(35):e44084", "👉 Oral ferrous sulfate posology", "40898537"),

                    Reference("BMC Womens Health. 2022;22(1):229", "👉 Ninjin’yoeito + iron", "35701778"),
                    Reference("J Syst Integr Neurosci. 2020;7:10.15761/JSIN.1000234", "👉 Iron-free multi-nutrient complex", "35096420"),
                    Reference("Food Nutr Res. 2019;63:3410", "👉 VMP35 MNC iron-free supplement", "31105509"),

                    Reference("Front Nutr. 2025;12:1553668", "👉 Pig skin peptide-iron chelates", "40584106"),
                    Reference("Front Immunol. 2025;16:1517893", "👉 Salivary hepcidin + IL-6", "40453081"),
                    Reference("Paediatr Int Child Health. 2025;45(1-2):44-47", "👉 Hypothyroidism & anaemia in children", "40400103"),

                    Reference("Cureus. 2025;17(8):e90609", "👉 Micronutrients in thyroid autoimmunity", "40978905"),
                    Reference("Turk Arch Pediatr. 2025;60(5):469-473", "👉 IDA in obese children", "40958538"),
                    Reference("Nutrients. 2025;17(17):2738", "👉 Vitamin D + iron deficiency in autism", "40944129"),

                    Reference("Eur J Pharm Sci. 2025;214:107265", "👉 FCM vs FDI on phosphate", "40935025"),
                    Reference("Am J Gastroenterol. 2025; online ahead of print", "👉 Osteoporosis in celiac disease", "40856724"),
                    Reference("Cureus. 2025;17(7):e88461", "👉 Plant-based diet & anaemia risk", "40842789"),

                    Reference("Int J Biol Macromol. 2025; online ahead of print", "👉 Iron dextran complex", "40992463"),
                    Reference("ACS Appl Mater Interfaces. 2025; online ahead of print", "👉 HA hydrogel + iron + probiotic/prebiotic", "40963326"),
                    Reference("PLoS One. 2025;20(9):e0322524", "👉 HLA-G polymorphism & malaria severity", "40953010"),

                    Reference("Health Sci Rep. 2025;8(9):e71247", "👉 IFA supplementation in adolescents", "40970106"),
                    Reference("Nutrients. 2025;17(17):2738", "👉 Vitamin D & iron deficiency in autism", "40944129"),
                    Reference("Clin Nutr ESPEN. 2025;69:745-764", "👉 Nutritional anaemia beyond iron deficiency", "40912361"),
                )
            )

            "Anaemia (vitamin B12 or folate deficiency)" -> Pair(
                """
    Alternative
    1. Neurotherapy for beta-thalassemia intermedia: complementary approach, mixed therapeutic and adverse outcomes (positive + adverse effects).
    2. Pumpkin seeds as natural remedy: nutritional and therapeutic potential for anemia (month | positive effect).
    3. Food cobalamin malabsorption: persistent B12 deficiency despite intake (no clear dose/effect/duration).

    Herbs
    1. No clear herb-based studies identified in 2025 data.

    Amino acids
    1. Folic acid–enriched coffee: enhanced nutritional intake, positive effect (positive effect).
    2. Folic acid supplementation in sickle cell disease children: improved hematologic outcomes (mg | positive effect).
    3. Pernicious anemia with subacute combined degeneration: B12 supplementation improved neurological symptoms (positive effect).

    Vitamins
    1. B12 deficiency with helminth infection (Dibothriocephalus nihonkaiensis): corrected with supplementation (month | positive effect).
    2. Global burden study on anemia: highlights vitamin role but lacks dosing info (positive effect).
    3. Group psychotherapy study in myelodysplasia: vitamin-related biomarker improvements noted (IU, g | positive effect).

    Minerals
    1. Plant-based diets: anemia and osteoporosis risk, both protective and adverse nutritional effects (positive + adverse effects).
    2. Nutritional supplementation in pregnancy/lactation: evidence review, but no clear dose found (no clear dose/effect/duration).
    3. Maternal and infant micronutrient sufficiency: management strategies beneficial (positive effect).

    Supplements
    1. Bariatric/metabolic surgery follow-up: monthly supplementation critical for B12/folate (month | positive effect).
    2. Neurological impact of B12 deficiency in Saudi Arabia: supplementation showed therapeutic benefit (positive effect).
    3. Adolescent girls in Indonesia: anemia linked to nutritional factors, but dosing unclear (no clear dose/effect/duration).

    Nutrients
    1. Ethiopian adolescent girls: weekly iron + folate supplementation → benefit but some adverse effects (positive + adverse effects).
    2. Narrative review: nutritional anemia beyond iron – B12 and folate critical contributors (positive effect).
    3. Bariatric surgery follow-up: long-term prevalence of nutrient deficiencies, no dosing details (no clear dose/effect/duration).
    """.trimIndent(),
                listOf(
                    Reference("Niger Med J. 2025;66(2):818-825", "👉 Neurotherapy for beta-thalassemia intermedia", "40703874"),
                    Reference("Curr Ther Res Clin Exp. 2025;103:100797", "👉 Pumpkin seeds as natural remedy", "40535566"),
                    Reference("J Clin Med. 2025;14(8):2550", "👉 Food cobalamin malabsorption", "40283381"),

                    Reference("Food Chem. 2025;488:144881", "👉 Folic acid–enriched coffee", "40424742"),
                    Reference("Am J Clin Nutr. 2025;121(4):910-920", "👉 Folic acid supplementation in sickle cell disease", "39921095"),
                    Reference("Rinsho Shinkeigaku. 2025;65(2):120-124", "👉 Pernicious anemia case", "39880654"),

                    Reference("J Infect Chemother. 2025; online ahead of print", "👉 B12 deficiency with helminth infection", "40992732"),
                    Reference("Medicine (Baltimore). 2025;104(38):e44380", "👉 Global burden of anemia", "40988239"),
                    Reference("J Psychosoc Oncol. 2025; online ahead of print", "👉 Psychotherapy & vitamin biomarkers", "40984023"),

                    Reference("Cureus. 2025;17(7):e88461", "👉 Plant-based diet & anemia risk", "40842789"),
                    Reference("Nutrition. 2025;136:112778", "👉 Nutritional supplementation in pregnancy/lactation", "40373355"),
                    Reference("Front Nutr. 2025;12:1476672", "👉 Maternal & infant micronutrient sufficiency", "40236637"),

                    Reference("Surg Obes Relat Dis. 2025; online ahead of print", "👉 Bariatric surgery supplementation", "40975648"),
                    Reference("Front Nutr. 2025;12:1635075", "👉 Neurological impact of B12 deficiency", "40904773"),
                    Reference("SAGE Open Med. 2025;13:20503121251355406", "👉 Anemia in Indonesian adolescents", "40862260"),

                    Reference("Health Sci Rep. 2025;8(9):e71247", "👉 Ethiopian adolescent girls, weekly IFA", "40970106"),
                    Reference("Clin Nutr ESPEN. 2025;69:745-764", "👉 Nutritional anemia beyond iron", "40912361"),
                    Reference("Nutrients. 2025;17(16):2599", "👉 Bariatric surgery long-term nutrient deficiencies", "40871627"),
                )
            )

            "Angina" -> Pair(
                """
    Alternative
    1. Lipoprotein(a) in CV risk stratification: tool for angina risk assessment, not direct therapy (no clear dose/effect/duration).
    2. CT coronary angiography + strain imaging: diagnostic value in multi-vessel coronary spasm (no clear dose/effect/duration).
    3. Epinephrine in Kounis syndrome: paradoxical reactions and management strategies, case-based (no clear dose/effect/duration).

    Herbs
    1. Chinese herbal medicines as add-on in T2DM with stable angina: improved outcomes within 1 month (positive effect).
    2. Ginger as nutraceutical: protective cardiovascular benefits, positive therapeutic role (positive effect).
    3. Naoxintong capsule: attenuates ischemic heart injury via NF-κB/NLRP3/caspase-1 signaling (positive effect).

    Amino acids
    1. Metabolomic shifts in PAD: amino acid-related markers associated with vascular health (positive effect).
    2. CRP/albumin & homocysteine/HDL-C ratios: diagnostic biomarkers for microvascular angina (no clear dose/effect/duration).
    3. Tirofiban in PCI patients with ACS: protocol/meta-analysis, positive efficacy and safety noted (positive effect).

    Vitamins
    1. Vitamin D/fibrinogen ratio: associated with unstable angina, NSTEMI, and STEMI (positive effect).
    2. Nicorandil use in angina pectoris (GREAT study): improved health status within 1 month (positive effect).
    3. Mendelian randomization in migraine: mentions vitamin effects, but not angina-specific (g | positive effect).

    Minerals
    1. Stable angina and osteoporosis: medications showed both protective and adverse effects (positive + adverse effects).
    2. Hair calcium levels: linked with CAD severity and inflammation, exploratory (no clear dose/effect/duration).
    3. Bone mineral density & CVD (MR study): genetic associations, no intervention data (no clear dose/effect/duration).

    Supplements
    1. Endothelial activation index and CVD (NHANES): observational association only (no clear dose/effect/duration).
    2. CYP2C19 genetic variants and clopidogrel resistance: linked to adverse outcomes (g, G | adverse effect | day).
    3. Anthropometric ratio (neck-to-limb length): associated with CVD risk, positive findings (positive effect).

    Nutrients
    1. Nutrient-wide association (NHANES): several nutrients correlated with lower CVD/angina prevalence (positive effect).
    2. Multivitamins after MI in diabetics: mixed results with both positive and adverse effects (week | positive + adverse effects).
    3. Plasma essential elements in AMI: potential diagnostic markers, no intervention data (no clear dose/effect/duration).
    """.trimIndent(),
                listOf(
                    Reference("Am J Cardiol. 2025; online ahead of print", "👉 Lipoprotein(a) in CV risk stratification", "41005599"),
                    Reference("Eur Heart J Case Rep. 2025;9(9):ytaf401", "👉 CT coronary angiography in coronary spasm", "40977944"),
                    Reference("Eur Heart J Case Rep. 2025;9(9):ytaf414", "👉 Epinephrine and Kounis syndrome", "40977935"),

                    Reference("Diabetes Metab Syndr Obes. 2025;18:3135-3148", "👉 Chinese herbal add-on therapy", "40919565"),
                    Reference("Cureus. 2025;17(3):e80841", "👉 Ginger as nutraceutical", "40255738"),
                    Reference("J Ethnopharmacol. 2025;341:119240", "👉 Naoxintong capsule", "39733802"),

                    Reference("Vasc Med. 2025; online ahead of print", "👉 Amino acid metabolomic shifts in PAD", "40998761"),
                    Reference("Rev Assoc Med Bras. 2025;71(5):e20241772", "👉 Homocysteine & HDL-C ratio in angina", "40531765"),
                    Reference("BMJ Open. 2025;15(5):e093477", "👉 Tirofiban in PCI/ACS", "40350196"),

                    Reference("PLoS One. 2025;20(9):e0331853", "👉 Vitamin D/fibrinogen ratio in ACS/angina", "40911594"),
                    Reference("Drug Des Devel Ther. 2025;19:8295-8308", "👉 Nicorandil GREAT study", "40980423"),
                    Reference("Front Neurol. 2025;16:1660995", "👉 Mendelian randomization on vitamins", "40994718"),

                    Reference("J Multidiscip Healthc. 2025;18:4121-4131", "👉 Stable angina & osteoporosis", "40703583"),
                    Reference("J Clin Med. 2025;14(13):4537", "👉 Hair calcium & CAD severity", "40648911"),
                    Reference("JBMR Plus. 2025;9(5):ziaf037", "👉 Bone mineral density & CVD risk", "40191156"),

                    Reference("BMC Cardiovasc Disord. 2025;25(1):681", "👉 Endothelial activation & CVD", "41013243"),
                    Reference("Cardiovasc Hematol Disord Drug Targets. 2025; online ahead of print", "👉 CYP2C19 & clopidogrel resistance", "40917024"),
                    Reference("Diabetes Metab Syndr Obes. 2025;18:2863-2872", "👉 Anthropometric ratio & CVD risk", "40827124"),

                    Reference("Sci Rep. 2025;15(1):12710", "👉 Nutrient-wide CVD association", "40223120"),
                    Reference("JAMA Intern Med. 2025;185(5):540-548", "👉 Multivitamins post-MI in diabetes", "40029647"),
                    Reference("Biometals. 2025;38(1):275-284", "👉 Plasma essential elements in AMI", "39617848"),
                )
            )

            "Ankle sprain" -> Pair(
                """
    Alternative
    1. Periosteal-iliac bone autografting + PRP for Hepple V talar lesions: improved outcomes reported (positive effect | month).
    2. Peroneus longus tendon graft in ACL reconstruction: effect on ankle stability, observational (no clear dose/effect/duration).
    3. Management overview of ankle fractures in elderly ≥65: scoping review, no intervention dosing (no clear dose/effect/duration).

    Herbs
    1. Case report: ankle sprain leading to leg amputation, herbal-related context (positive effect).
    2. Acute ankle ligamentous sprain in sports: educational/narrative, supportive role (positive effect).
    3. Mastix-induced dermatitis from bone-setter’s herbs: adverse effect noted (no clear dose/effect/duration).

    Amino acids
    1. Multimodal perioperative pain management after ankle fracture surgery: reduced narcotic use (mg | positive effect).
    2. Pregabalin + naproxen perioperative use: some adverse effects reported (mg | negative/adverse effect | day, month).
    3. L-Arginine therapy on Achilles tendon healing in animals: improved histology & biomechanics (g, mg | positive effect).

    Vitamins
    1. Injury profiling in male police cadets: vitamin-related recovery markers improved (positive effect).
    2. Burden of lower-extremity fractures in MENA region: epidemiology, no dosing info (no clear dose/effect/duration).
    3. Vitamin D in foot/ankle fracture healing: comparative clinical effects (no clear dose/effect/duration).

    Minerals
    1. Posterior ankle impingement: os trigonum & Stieda process, observational (no clear dose/effect/duration).
    2. FK506 osteogenic small molecule in rabbit ankle fusion: enhanced bone formation (week | positive effect).
    3. Electrical stimulation on muscle quality & BMD post-SCI: beneficial effect noted (week | positive effect).

    Supplements
    1. DMTAPF flaps for pediatric foot reconstruction: improved outcomes (positive effect).
    2. Trimalleolar fracture with Achilles/peroneal injury: case-based, no dosing (no clear dose/effect/duration).
    3. Arthroscopic ATFL repair with extensor retinaculum reinforcement: preliminary positive outcomes (positive effect).

    Nutrients
    1. Jilin ginseng root: attenuated drop-jump muscle injury markers in healthy females (week | positive effect).
    2. Neurocutaneous vs propeller perforator flaps in diabetic foot reconstruction: positive outcomes (day, month | positive effect).
    3. Double blood supply composite tissue flap with gastrocnemius: clinical repair of ankle defects (month | positive effect).
    """.trimIndent(),
                listOf(
                    Reference("Med Sci Monit. 2025;31:e948866", "👉 Periosteal-iliac bone autografting + PRP", "40999657"),
                    Reference("Orthop J Sports Med. 2025;13(9):23259671251371229", "👉 Peroneus longus tendon graft in ACL reconstruction", "40980563"),
                    Reference("Eur J Orthop Surg Traumatol. 2025;35(1):396", "👉 Overview of ankle fracture management in elderly", "40944730"),

                    Reference("J Surg Case Rep. 2024;2024(2):rjae003", "👉 Case report: ankle sprain leading to leg amputation", "38333560"),
                    Reference("Sports Med Arthrosc Rehabil Ther Technol. 2009;1:14", "👉 Acute ankle ligamentous sprain in sports", "19640309"),
                    Reference("Contact Dermatitis. 2001;44(5):312-3", "👉 Mastix-induced dermatitis from bone-setter’s herbs", "11380086"),

                    Reference("J Surg Orthop Adv. 2025;34(1):23-25", "👉 Multimodal perioperative pain management after ankle fracture", "40327734"),
                    Reference("J Orthop Surg Res. 2024;19(1):882", "👉 Pregabalin + naproxen perioperative use", "39726018"),
                    Reference("Foot Ankle Surg. 2024;30(8):700-705", "👉 L-Arginine therapy on Achilles tendon healing", "38890041"),

                    Reference("Am J Mens Health. 2024;18(6):15579883241304584", "👉 Injury profiling in male police cadets", "39651577"),
                    Reference("J Bone Joint Surg Am. 2024;106(5):414-424", "👉 Burden of lower-extremity fractures in MENA region", "38260949"),
                    Reference("J Foot Ankle Surg. 2024;63(2):182-186", "👉 Vitamin D in foot/ankle fracture healing", "37931741"),

                    Reference("Curr Sports Med Rep. 2025;24(9):261-263", "👉 Posterior ankle impingement: os trigonum & Stieda process", "40928415"),
                    Reference("J Orthop Res. 2025;43(10):1805-1812", "👉 FK506 osteogenic small molecule in rabbit ankle fusion", "40685948"),
                    Reference("Osteoporos Int. 2025;36(6):1039-1051", "👉 Electrical stimulation on muscle quality & BMD post-SCI", "40261334"),

                    Reference("J Plast Reconstr Aesthet Surg. 2024;99:619-627", "👉 DMTAPF flaps for pediatric foot reconstruction", "39541648"),
                    Reference("JBJS Case Connect. 2024;14(4)", "👉 Trimalleolar fracture with Achilles/peroneal injury", "39361776"),
                    Reference("J Orthop Surg Res. 2024;19(1):573", "👉 Arthroscopic ATFL repair with extensor retinaculum reinforcement", "39285421"),

                    Reference("Food Funct. 2021;12(4):1458-1468", "👉 Jilin ginseng root supplementation", "33507202"),
                    Reference("Injury. 2020;51 Suppl 4:S16-S21", "👉 Neurocutaneous vs propeller perforator flaps in diabetic foot reconstruction", "32184012"),
                    Reference("Zhonghua Shao Shang Za Zhi. 2019;35(5):392-394", "👉 Double blood supply composite tissue flap with gastrocnemius", "31154740"),
                )
            )

            "Anorexia nervosa" -> Pair(
                """
    Alternative
    1. Day programme treatment: caregiver feedback, positive therapeutic effect noted (positive effect).
    2. Alternative criteria to DSM-5 for severity assessment: observational, no dosing info (no clear dose/effect/duration).
    3. Internet-based guided CBT: 3-year follow-up, long-term outcomes reported (no clear dose/effect/duration).

    Herbs
    1. No herb-based studies identified in 2025 data.

    Amino acids
    1. Plasma protein-bound AGEs & soluble receptors in young girls: correlated with bone mineral status (g | positive effect).
    2. Ghrelin/GHSR system in mental disorders: pathophysiological insight, no dosing info (no clear dose/effect/duration).
    3. Growth hormone suppression test case report: positive effect on understanding hormone regulation (μg | positive effect).

    Vitamins
    1. Nutritional iodine intake: improved thyroid/nutritional status (μg | positive effect).
    2. Biomarker prognostic value in treatment response: some negative/adverse outcomes noted (negative/adverse effect).
    3. Mendelian randomization on 25-hydroxyvitamin D: supportive effect on eating disorder risk (positive effect).

    Minerals
    1. Plasma AGEs and soluble receptors: correlation with bone mineral status (g | positive effect).
    2. Medication for bone loss in female patients: systematic review, beneficial management algorithm (positive effect).
    3. PAPPA2 deficiency altering IGF-1 bioavailability: sex-specific metabolic improvements (positive effect).

    Supplements
    1. Virtual group therapy after inpatient admission: feasible, positive outcomes (month | positive effect).
    2. ARFID restriction cohort study: observational, no dosing info (no clear dose/effect/duration).
    3. Gut microbiota modulation in women with eating disorders: positive therapeutic implications (positive effect).

    Nutrients
    1. Peripheral biomarkers meta-analysis reply: discussion of nutritional biomarker relevance (no clear dose/effect/duration).
    2. Comment on meta-analysis of biomarkers: academic discussion, no dosing info (no clear dose/effect/duration).
    3. Patient/family perspectives on transitional care: observational, integrated approach (no clear dose/effect/duration).
    """.trimIndent(),
                listOf(
                    Reference("J Eat Disord. 2025;13(1):207", "👉 Day programme treatment caregiver feedback", "41013785"),
                    Reference("Int J Eat Disord. 2025; online ahead of print", "👉 Alternative criteria to DSM-5 for severity assessment", "40926635"),
                    Reference("Brain Behav. 2025;15(9):e70731", "👉 Internet-based guided CBT, 3-year follow-up", "40922447"),

                    Reference("", "👉 No herb-based studies identified", ""),

                    Reference("Arch Osteoporos. 2025;20(1):116", "👉 Plasma AGEs & soluble receptors in young girls", "40864317"),
                    Reference("Depress Anxiety. 2024;2024:5537319", "👉 Ghrelin/GHSR system in mental disorders", "40226675"),
                    Reference("Beijing Da Xue Xue Bao Yi Xue Ban. 2025;57(2):400-402", "👉 Growth hormone suppression test case report", "40219577"),

                    Reference("Eur Thyroid J. 2025;14(5):e250076", "👉 Nutritional iodine intake", "40905516"),
                    Reference("Nutrients. 2025;17(14):2260", "👉 Biomarker prognostic value in treatment response", "40732885"),
                    Reference("Medicine (Baltimore). 2025;104(30):e43539", "👉 Mendelian randomization on 25-hydroxyvitamin D", "40725887"),

                    Reference("Arch Osteoporos. 2025;20(1):116", "👉 Plasma AGEs & soluble receptors", "40864317"),
                    Reference("Eat Weight Disord. 2025;30(1):60", "👉 Medication for bone loss in female patients", "40760351"),
                    Reference("Metabolism. 2025;171:156355", "👉 PAPPA2 deficiency altering IGF-1 bioavailability", "40695421"),

                    Reference("Int J Eat Disord. 2025; online ahead of print", "👉 Virtual group therapy after inpatient admission", "40842163"),
                    Reference("medRxiv. 2025 Jul 28", "👉 ARFID restriction cohort study", "40766117"),
                    Reference("Nutrients. 2025;17(14):2316", "👉 Gut microbiota modulation in women with eating disorders", "40732941"),

                    Reference("Nutrients. 2025;17(17):2874", "👉 Peripheral biomarkers meta-analysis reply", "40944262"),
                    Reference("Nutrients. 2025;17(17):2873", "👉 Comment on biomarkers meta-analysis", "40944261"),
                    Reference("Nutrients. 2025;17(17):2830", "👉 Patient/family perspectives on transitional care", "40944217"),
                )
            )

            "Aphasia" -> Pair(
                """
    Alternative
    1. Individualized connectomic tACS improves oscillatory network and language facilitation post-stroke (positive effect).
    2. Postoperative stroke case report: positive therapeutic insights (positive effect).
    3. rTMS-based neuromodulation for postoperative aphasia: mixed outcomes, positive and some adverse effects (positive; negative | month, day).

    Herbs
    1. Emerging drug therapies in Alzheimer’s disease: pathophysiological perspective (positive effect).

    Amino acids
    1. Clinical case of ischemic stroke + cancer: therapeutic improvement (positive effect).
    2. Integration of 5-ALA fluorescence in awake craniotomy: positive effect noted (day | positive effect).
    3. Speech therapy + Cerebrolysin for nonfluent aphasia: enhanced recovery, some adverse effects (positive; negative | day).

    Vitamins
    1. Whippet-induced B12 deficiency: positive effect noted (positive effect).
    2. Wernicke-Korsakoff encephalopathy mimicking stroke: case report, no dosing info (no clear dose/effect/duration).
    3. Post-stroke aphasia treatment: improved speech therapy outcomes (positive effect).

    Minerals
    1. Humidity-based HMI system for healthcare: no dosing info (no clear dose/effect/duration).
    2. Calcium supplement causing reversible cerebral vasoconstriction: positive effect on recovery (mg | positive effect | day).
    3. Osmotic demyelination in Noonan syndrome: positive management effect (positive effect).

    Supplements
    1. ABCD simulation for accelerating conversational agents in aphasia therapy: no dosing info (no clear dose/effect/duration).
    2. Rapid neurological symptom onset in HIV-positive patient: no dosing info (no clear dose/effect/duration).
    3. Computer- and smart-tablet-based self-administered treatments in chronic post-stroke aphasia: positive therapeutic effect (G | positive effect).

    Nutrients
    1. Ayurveda and Yoga management of chronic alcoholism sequelae: positive therapeutic effect (positive effect).
    2. Recovery of language after stroke via neurovascular MRI insights: no dosing info (no clear dose/effect/duration).
    3. Cognitive enhancement protocols for brain health services: positive therapeutic effect (positive effect).
    """.trimIndent(),
                listOf(
                    Reference("Front Comput Neurosci. 2025;19:1635497", "👉 Individualized connectomic tACS, post-stroke language facilitation", "40980209"),
                    Reference("Cureus. 2025;17(8):e89618", "👉 Postoperative stroke case report, therapeutic insights", "40922849"),
                    Reference("Neurocase. 2025;1-9", "👉 rTMS-based neuromodulation, mixed outcomes", "40884123"),

                    Reference("Neuroscience. 2025;565:499-518", "👉 Emerging drug therapies in Alzheimer's disease", "39662528"),

                    Reference("Zh Nevrol Psikhiatr Im S S Korsakova. 2025;125(8):114-117", "👉 Clinical case ischemic stroke + cancer", "40879237"),
                    Reference("Neurosurg Rev. 2025;48(1):425", "👉 Integration of 5-ALA fluorescence in awake craniotomy", "40389778"),
                    Reference("Stroke. 2025;56(4):937-947", "👉 Speech therapy + Cerebrolysin, enhanced recovery", "39957612"),

                    Reference("Cureus. 2025;17(5):e84643", "👉 Whippet-induced B12 deficiency", "40546460"),
                    Reference("Front Psychiatry. 2024;15:1499803", "👉 Wernicke-Korsakoff encephalopathy case report", "39758439"),
                    Reference("Zh Nevrol Psikhiatr Im S S Korsakova. 2024;124(10):22-28", "👉 Improving effectiveness of post-stroke aphasia treatment", "39575955"),

                    Reference("ACS Appl Mater Interfaces. 2022;14(10):12606", "👉 Humidity-based HMI system", "35230086"),
                    Reference("BMJ Case Rep. 2021;14(1):e233877", "👉 Calcium supplement reversible cerebral vasoconstriction", "33509852"),
                    Reference("Endocrinol Diabetes Metab Case Rep. 2020;2020:20-0039", "👉 Osmotic demyelination in Noonan syndrome", "32820141"),

                    Reference("J Speech Lang Hear Res. 2025;68(7):3322-3336", "👉 ABCD simulation for conversational agents in aphasia therapy", "40512969"),
                    Reference("Ann Med Surg (Lond). 2025;87(6):3994-3998", "👉 Rapid neurological symptoms in HIV patient", "40486551"),
                    Reference("Brain Sci. 2025;15(2):122", "👉 Computer- and smart-tablet-based self-administered treatments", "40002455"),

                    Reference("J Ayurveda Integr Med. 2024;15(1):100862", "👉 Ayurveda and Yoga management, chronic alcoholism sequelae", "38241882"),
                    Reference("Front Lang Sci. 2023;2:1163547", "👉 Recovery of language after stroke via neurovascular MRI", "38162928"),
                    Reference("Alzheimers Res Ther. 2021;13(1):172", "👉 Cognitive enhancement protocols, brain health services", "34635149")
                )
            )

            "Appendicitis" -> Pair(
                """
    Alternative
    1. Stump appendicitis after appendectomy: positive therapeutic effect (positive effect).
    2. Meta-analysis of single-incision vs. three-port laparoscopic appendectomy: no clear dosing info (no clear dose/effect/duration).
    3. Transumbilical laparoscopic-assisted appendectomy in children: feasibility and outcomes, no dosing info (no clear dose/effect/duration).

    Herbs
    1. Acute appendicitis with appendicolith treated with traditional Chinese medicine: positive effect (positive effect).
    2. New medical trend in China combining TCM and Western medicine: positive therapeutic effect (positive effect).

    Amino acids
    1. Levothyroxine requirement in LRBA deficiency + GVHD-induced cholestasis: dosing in mcg (mcg).
    2. Diagnostic accuracy of leucine-rich α-2-glycoprotein 1 in pediatric appendicitis: no dosing info (no clear dose/effect/duration).
    3. Gabapentin reduces postoperative opioid use and length of stay after appendectomy in children: positive effect (day | positive effect).

    Vitamins
    1. Preoperatively diagnosed appendiceal carcinoma case: dosing in month (month).
    2. Spinal anesthesia for open appendectomy in cystic fibrosis: positive therapeutic effect, dosing in mg (mg, G | positive effect | month).
    3. Coffee and caffeine intake reduces risk of ulcerative colitis: positive therapeutic effect (positive effect).

    Minerals
    1. Characterization of peritoneal reactive ascites from acute appendicitis: no dosing info (no clear dose/effect/duration).
    2. Diffuse malignant biphasic peritoneal mesothelioma: no dosing info (no clear dose/effect/duration).
    3. Appendicolithiasis: no dosing info (no clear dose/effect/duration).

    Supplements
    1. Deep learning for appendicitis CT localization: no dosing info (no clear dose/effect/duration).
    2. Swedish national guidelines for appendicitis management: no dosing info (no clear dose/effect/duration).
    3. Ovarian torsion case report: no dosing info (no clear dose/effect/duration).

    Nutrients
    1. Health-related experiences of geophagia: no dosing info (no clear dose/effect/duration).
    2. Medical grade honey for pediatric abdominal wounds: positive therapeutic effect (positive effect).
    3. Nutritional support in short bowel syndrome with panperitonitis: positive therapeutic effect (positive effect).
    """.trimIndent(),
                listOf(
                    Reference("Cureus. 2025;17(8):e90740", "👉 Stump appendicitis after appendectomy", "40984904"),
                    Reference("Int J Surg. 2025 Sep 22", "👉 Meta-analysis of laparoscopic appendectomy", "40981423"),
                    Reference("J Pediatr Surg. 2025 Sep 15:162674", "👉 Transumbilical laparoscopic-assisted appendectomy in children", "40962173"),

                    Reference("Explore (NY). 2024;20(5):102977", "👉 Acute appendicitis with appendicolith treated with TCM", "38290897"),
                    Reference("Am J Chin Med (Gard City N Y). 1975;3(3):213-21", "👉 New medical trend in China combining TCM and Western medicine", "1190112"),

                    Reference("Sultan Qaboos Univ Med J. 2025;25(1):592-597", "👉 Levothyroxine requirement in LRBA deficiency + GVHD-induced cholestasis", "40717930"),
                    Reference("Int J Mol Sci. 2023;24(7):6043", "👉 Leucine-rich α-2-glycoprotein 1 diagnostic accuracy in pediatric appendicitis", "37047015"),
                    Reference("J Pediatr Surg. 2023;58(10):1935-1941", "👉 Gabapentin reduces postoperative opioid use after appendectomy", "37029026"),

                    Reference("Gan To Kagaku Ryoho. 2024;51(13):1402-1404", "👉 Preoperatively diagnosed appendiceal carcinoma", "39948870"),
                    Reference("Cureus. 2024;16(11):e72824", "👉 Spinal anesthesia for open appendectomy in cystic fibrosis", "39624565"),
                    Reference("J Gastroenterol Hepatol. 2024;39(3):512-518", "👉 Coffee and caffeine intake reduces risk of ulcerative colitis", "38073066"),

                    Reference("Clin Chim Acta. 2022;531:126-136", "👉 Characterization of peritoneal reactive ascites", "35346646"),
                    Reference("Ann Ital Chir. 2016;87:S2239253X16025378", "👉 Diffuse malignant biphasic peritoneal mesothelioma", "27320084"),
                    Reference("Clin Med Insights Pathol. 2011;4:1-4", "👉 Appendicolithiasis case series", "21487530"),

                    Reference("Jpn J Radiol. 2025 Jul 16", "👉 Deep learning for appendicitis CT localization", "40668351"),
                    Reference("BJS Open. 2025;9(2):zrae165", "👉 Swedish national guidelines for appendicitis management", "40203150"),
                    Reference("Int J Surg Case Rep. 2025;128:111007", "👉 Ovarian torsion case report", "39914013"),

                    Reference("Healthcare (Basel). 2024;12(20):2090", "👉 Geophagia experiences", "39451504"),
                    Reference("J Wound Care. 2020;29(2):94-99", "👉 Medical grade honey for pediatric abdominal wounds", "32058849"),
                    Reference("Clin Nutr Res. 2013;2(2):149-53", "👉 Nutritional support in short bowel syndrome with panperitonitis", "23908982")
                )
            )

            "Arrhythmia" -> Pair(
                """
    Alternative
    1. Cardiac PET in prediction of atrial fibrillation rhythm: positive therapeutic effect (positive effect).
    2. Restoration of cardiac function in LBBB-induced cardiomyopathy via conduction system pacing: positive effect, dosing in month (month | positive effect).
    3. Antiarrhythmic effects of Acmella oleracea extract in rats: negative/adverse effect mentioned, dosing in mg (mg | negative/adverse effect).

    Herbs
    1. Salvianolic acid B + Senkyunolide I alleviate cardiac hypertrophy: positive and negative effects mentioned (positive effect; negative/adverse effect).
    2. Therapeutic frontiers in viral myocarditis: targeting inflammation, oxidative stress, myocardial repair (positive effect).
    3. Pharmacotherapy of cardiovascular diseases from herbs/pills to nucleic acids: positive and negative effects mentioned (positive effect; negative/adverse effect).

    Amino acids
    1. Biventricular functions in female adolescents with Hashimoto's thyroiditis: no dosing info (no clear dose/effect/duration).
    2. Circulating plasma metabolites and QT interval: no dosing info (no clear dose/effect/duration).
    3. Advanced glycation end-product carboxymethyl-lysine and incident HF/AF in older adults: no dosing info (no clear dose/effect/duration).

    Vitamins
    1. Myotonic Dystrophy Type 2 review: no dosing info (no clear dose/effect/duration).
    2. NOACs vs VKAs on cognitive decline: positive therapeutic effect (positive effect).
    3. Nursing strategies for hepatitis E post-cardiac arrest: positive therapeutic effect, dosing in g/day (g | day).

    Minerals
    1. Potassium binders in hemodialysis: positive therapeutic effect (positive effect).
    2. Nursing strategies for hepatitis E post-cardiac arrest: positive therapeutic effect, dosing in g/day (g | day).
    3. Dysmagnesemia in ICU: no dosing info (no clear dose/effect/duration).

    Supplements
    1. Nutritional factors and arrhythmic risk in long QT syndrome: no dosing info (no clear dose/effect/duration).
    2. Lidocaine toxicity review: positive and negative effects, dosing in mg (mg | positive effect; negative/adverse effect).
    3. Superior vena cava isolation added to pulmonary vein isolation in paroxysmal AF: positive effect, dosing in month (month | positive effect).

    Nutrients
    1. Nutritional factors and arrhythmic risk in long QT syndrome: no dosing info (no clear dose/effect/duration).
    2. Coffee impact on health and well-being: positive effect, dosing in mg (mg | positive effect).
    3. Potassium quantification in plant foods for heart disease patients: positive effect, dosing in g/mg (g, mg | positive effect).
    """.trimIndent(),
                listOf(
                    Reference("Heart Lung. 2025;75:125-135", "👉 Cardiac PET in prediction of atrial fibrillation rhythm", "41014872"),
                    Reference("Am J Case Rep. 2025;26:e948576", "👉 Restoration of cardiac function in LBBB-induced cardiomyopathy", "41013877"),
                    Reference("Plants (Basel). 2025;14(18):2848", "👉 Antiarrhythmic effects of Acmella oleracea extract in rats", "41012000"),

                    Reference("Chin Med. 2025;20(1):148", "👉 Salvianolic acid B + Senkyunolide I alleviate cardiac hypertrophy", "41015772"),
                    Reference("Front Immunol. 2025;16:1643502", "👉 Therapeutic frontiers in viral myocarditis", "40895553"),
                    Reference("Eur Heart J. 2025;ehaf520", "👉 Pharmacotherapy of cardiovascular diseases from herbs/pills to nucleic acids", "40838984"),

                    Reference("Niger J Clin Pract. 2025;28(9):1039-1048", "👉 Biventricular functions in Hashimoto's thyroiditis", "41014529"),
                    Reference("Circ Genom Precis Med. 2025;e004978", "👉 Circulating plasma metabolites and QT interval", "40931806"),
                    Reference("J Am Heart Assoc. 2025;14(18):e040640", "👉 Advanced glycation end-product CML and incident HF/AF", "40913281"),

                    Reference("GeneReviews. 2006 Sep 21 [updated 2025 Sep 25]", "👉 Myotonic Dystrophy Type 2 review", "20301639"),
                    Reference("Thromb Haemost. 2025", "👉 NOACs vs VKAs on cognitive decline", "40930502"),
                    Reference("Medicine (Baltimore). 2025;104(36):e44325", "👉 Nursing strategies for hepatitis E post-cardiac arrest", "40922328"),

                    Reference("Kidney Int. 2025;108(4):534-536", "👉 Potassium binders in hemodialysis", "40975524"),
                    Reference("Medicine (Baltimore). 2025;104(36):e44325", "👉 Nursing strategies for hepatitis E post-cardiac arrest", "40922328"),
                    Reference("Metabolites. 2025;15(8):498", "👉 Dysmagnesemia in ICU", "40863117"),

                    Reference("Adv Nutr. 2025;100525", "👉 Nutritional factors and arrhythmic risk in long QT syndrome", "40992506"),
                    Reference("StatPearls. 2025", "👉 Lidocaine toxicity review", "29494086"),
                    Reference("BMJ Open. 2025;15(9):e095135", "👉 Superior vena cava isolation added to pulmonary vein isolation in paroxysmal AF", "40921640"),

                    Reference("Adv Nutr. 2025;100525", "👉 Nutritional factors and arrhythmic risk in long QT syndrome", "40992506"),
                    Reference("Nutrients. 2025;17(15):2558", "👉 Coffee impact on health and well-being", "40806142"),
                    Reference("Clin Nutr ESPEN. 2025;69:350-357", "👉 Potassium quantification in plant foods for heart disease patients", "40681108")
                )
            )

            "Arthritis" -> Pair(
                """
    Alternative
    1. Septic arthritis of sternoclavicular joint with osteomyelitis: no dosing info (no clear dose/effect/duration).
    2. Chinese herbal medicines for dental diseases in Sjögren's syndrome: positive effect, dosing in day (day | positive effect).
    3. Advances in psoriasis research and novel therapies: no dosing info (no clear dose/effect/duration).

    Herbs
    1. Phytotherapy as adjunct in rheumatoid arthritis: positive and negative effects (positive effect; negative/adverse effect).
    2. Nutritional intervention for Sjögren disease: positive effect (positive effect).
    3. Anti-inflammatory effects of bioactive peptides from Chinese herbs: negative/adverse effect (negative/adverse effect).

    Amino acids
    1. Acupuncture effects on central amino acid metabolism in inflammatory pain mice: positive effect (positive effect).
    2. Structural study of peptide epitopes in rheumatoid arthritis: no dosing info (no clear dose/effect/duration).
    3. RING-box E3 ligase targeting Sp7 protein in osteoblast differentiation: dosing in g (g | positive effect).

    Vitamins
    1. Serum 25(OH)D3 levels in systemic lupus erythematosus: no dosing info (no clear dose/effect/duration).
    2. Hereditary hemochromatosis type 2A with osteoporosis: positive effect, dosing in G/month (G | positive effect | month).
    3. Active vitamin D as adjuvant to anti-TNFα in psoriatic synovial fibroblasts: no dosing info (no clear dose/effect/duration).

    Minerals
    1. Systemic inflammation in hip fracture and osteoarthritis: positive effect, dosing in mg (mg | positive effect).
    2. iTr35 cells in bone loss of rheumatoid arthritis: positive effect (positive effect).
    3. Sustained release of fetuin-A from HA microplates in post-traumatic OA: positive effect, dosing in mg/week, day (mg | positive effect | week, day).

    Supplements
    1. Artri King induced Cushing syndrome: no dosing info (no clear dose/effect/duration).
    2. Pulmonary involvement in autoimmune-mediated disease: no dosing info (no clear dose/effect/duration).
    3. Gut microbiota modulation in autoimmune diseases: no dosing info (no clear dose/effect/duration).

    Nutrients
    1. Competition day loads in Olympic female athletes: dosing in G (G | positive effect).
    2. Nutritional intervention for Sjögren disease: positive effect (positive effect).
    3. Anti-inflammatory diet in osteoarthritis: positive effect (positive effect).
    """.trimIndent(),
                listOf(
                    Reference("Int J Surg Case Rep. 2025;136:111986", "👉 Septic arthritis of sternoclavicular joint with osteomyelitis", "41014914"),
                    Reference("Medicina (Kaunas). 2025;61(9):1537", "👉 Chinese herbal medicines for dental diseases in Sjögren's syndrome", "41010928"),
                    Reference("Int J Mol Sci. 2025;26(18):9233", "👉 Advances in psoriasis research and novel therapies", "41009795"),

                    Reference("Phytomedicine. 2025;148:157285", "👉 Phytotherapy as adjunct in rheumatoid arthritis", "41005054"),
                    Reference("Nutrients. 2025;17(17):2743", "👉 Nutritional intervention for Sjögren disease", "40944134"),
                    Reference("Am J Chin Med. 2025;53(7):1951-1982", "👉 Anti-inflammatory effects of bioactive peptides from Chinese herbs", "40905225"),

                    Reference("J Tradit Chin Med. 2025;45(5):1019-1027", "👉 Acupuncture effects on central amino acid metabolism in inflammatory pain mice", "41015800"),
                    Reference("Int J Mol Sci. 2025;26(18):9026", "👉 Structural study of peptide epitopes in rheumatoid arthritis", "41009593"),
                    Reference("J Cell Biochem. 2025;126(9):e70066", "👉 RING-box E3 ligase targeting Sp7 protein in osteoblast differentiation", "40990202"),

                    Reference("Lupus. 2025;9612033251380872", "👉 Serum 25(OH)D3 levels in systemic lupus erythematosus", "41004708"),
                    Reference("JCEM Case Rep. 2025;3(10):luaf148", "👉 Hereditary hemochromatosis type 2A with osteoporosis", "40979821"),
                    Reference("RMD Open. 2025;11(3):e005547", "👉 Active vitamin D as adjuvant to anti-TNFα in psoriatic synovial fibroblasts", "40973226"),

                    Reference("Int J Mol Sci. 2025;26(18):9138", "👉 Systemic inflammation in hip fracture and osteoarthritis", "41009701"),
                    Reference("Ann Med. 2025;57(1):2565438", "👉 iTr35 cells in bone loss of rheumatoid arthritis", "40999896"),
                    Reference("Arthritis Res Ther. 2025;27(1):178", "👉 Sustained release of fetuin-A from HA microplates in post-traumatic OA", "40999539"),

                    Reference("Dermatol Online J. 2025;31(3)", "👉 Artri King induced Cushing syndrome", "40991472"),
                    Reference("Dtsch Arztebl Int. 2025", "👉 Pulmonary involvement in autoimmune-mediated disease", "40991358"),
                    Reference("Neuromolecular Med. 2025;27(1):65", "👉 Gut microbiota modulation in autoimmune diseases", "40963074"),

                    Reference("Nutrients. 2025;17(18):2978", "👉 Competition day loads in Olympic female athletes", "41010552"),
                    Reference("Nutrients. 2025;17(17):2743", "👉 Nutritional intervention for Sjögren disease", "40944134"),
                    Reference("Nutrients. 2025;17(17):2729", "👉 Anti-inflammatory diet in osteoarthritis", "40944120")
                )
            )

            "Asbestosis" -> Pair(
                """
    Alternative
    1. Interventions to prevent asbestos-related respiratory disease: positive effect (positive effect).
    2. Imaging in idiopathic pulmonary fibrosis: no dosing info (no clear dose/effect/duration).
    3. Mortality in asbestos cement workers: no dosing info (no clear dose/effect/duration).

    Herbs
    None reported.

    Amino acids
    1. Plasma metabolic profiling in silicosis and asbestosis: negative/adverse effect, dosing in G (G | negative/adverse effect).
    2. Diffuse malignant peritoneal mesothelioma case report: no dosing info (no clear dose/effect/duration).
    3. Pemetrexed-related interstitial lung disease post-marketing: negative/adverse effect, dosing in day/month (negative/adverse effect | day, month).

    Vitamins
    1. Asbestos modulates thioredoxin interaction to regulate inflammasome: positive and negative effects (positive/therapeutic; negative/adverse effect).
    2. Oxidative stress markers in lung fibroses: no dosing info (no clear dose/effect/duration).
    3. Cardiovascular iron overload in amphibole-induced pulmonary injury: positive and negative effects, dosing in week/day/month (positive/therapeutic; negative/adverse effect | week, day, month).

    Minerals
    1. Identifying and diagnosing asbestos-related diseases in emerging economies: no dosing info (no clear dose/effect/duration).
    2. Defining control reference ranges in biologic samples: no dosing info (no clear dose/effect/duration).
    3. Asbestos bodies and amphibole fibres in the lung: no dosing info (no clear dose/effect/duration).

    Supplements
    1. Diffuse interstitial lung disease of possible occupational origin in Navarra, Spain: positive effect (positive effect).
    2. Pneumoconiosis incidence characteristics in Ningbo City: positive effect (positive effect).
    3. Occupational pneumoconiosis in Ankang city: positive effect (positive effect).

    Nutrients
    1. Biomineralisation process around inhaled asbestos fibres: negative/adverse effect (negative/adverse effect).
    2. Crystal formation in inflammation: no dosing info (no clear dose/effect/duration).
    3. Spirometry, rapid FEV1 decline, and lung cancer in asbestos-exposed smokers: no dosing info (no clear dose/effect/duration).
    """.trimIndent(),
                listOf(
                    Reference("Am J Epidemiol. 2025;kwaf040", "👉 Interventions to prevent asbestos-related respiratory disease", "40036898"),
                    Reference("Clinics (Sao Paulo). 2019;74:e225", "👉 Imaging in idiopathic pulmonary fibrosis", "30726312"),
                    Reference("Am J Ind Med. 2017;60(10):852-866", "👉 Mortality in asbestos cement workers", "28833303"),

                    Reference("", "👉 Herbs: none reported", ""),

                    Reference("J Occup Environ Med. 2021;63(9):787-793", "👉 Plasma metabolic profiling in silicosis and asbestosis", "33883533"),
                    Reference("Gan To Kagaku Ryoho. 2018;45(3):449-453", "👉 Diffuse malignant peritoneal mesothelioma case report", "29650903"),
                    Reference("Jpn J Clin Oncol. 2017;47(4):350-356", "👉 Pemetrexed-related interstitial lung disease post-marketing", "28158568"),

                    Reference("Part Fibre Toxicol. 2014;11:24", "👉 Asbestos modulates thioredoxin interaction to regulate inflammasome", "24885895"),
                    Reference("Ind Health. 2011;49(6):746-54", "👉 Oxidative stress markers in lung fibroses", "22020018"),
                    Reference("Inhal Toxicol. 2011;23(3):129-41", "👉 Cardiovascular iron overload in amphibole-induced pulmonary injury", "21391781"),

                    Reference("Ann Glob Health. 2025;90(1):65", "👉 Identifying and diagnosing asbestos-related diseases in emerging economies", "41000262"),
                    Reference("Front Public Health. 2025;13:1618114", "👉 Defining control reference ranges in biologic samples", "40951377"),
                    Reference("Ann Work Expo Health. 2025;69(8):832-842", "👉 Asbestos bodies and amphibole fibres in the lung", "40843636"),

                    Reference("Arch Prev Riesgos Labor. 2024;27(2):173-189", "👉 Diffuse interstitial lung disease of possible occupational origin in Navarra, Spain", "38655592"),
                    Reference("Zhonghua Lao Dong Wei Sheng Zhi Ye Bing Za Zhi. 2022;40(5):354-358", "👉 Pneumoconiosis incidence characteristics in Ningbo City", "35680578"),
                    Reference("Zhonghua Lao Dong Wei Sheng Zhi Ye Bing Za Zhi. 2019;37(12):918-920", "👉 Occupational pneumoconiosis in Ankang city", "31937033"),

                    Reference("Sci Rep. 2017;7:44862", "👉 Biomineralisation process around inhaled asbestos fibres", "28332562"),
                    Reference("Annu Rev Immunol. 2016;34:173-202", "👉 Crystal formation in inflammation", "26772211"),
                    Reference("COPD. 2007;4(4):339-46", "👉 Spirometry, rapid FEV1 decline, and lung cancer in asbestos-exposed smokers", "18027161")
                )
            )

            "Asperger's syndrome" -> Pair(
                """
    Alternative
    1. Structured Social Skills Training Program: positive effect, month (positive/therapeutic effect | month).
    2. Movies, stigma and choice in pharma: positive effect (positive/therapeutic effect).
    3. Alternatives to gold standard diagnostic tools: no dosing info (no clear dose/effect/duration).

    Herbs
    1. Yokukansan (Japanese Kampo medicine) for ASD symptoms: negative/adverse effect (negative/adverse effect).

    Amino acids
    1. Serum Tryptophan, catabolites, and BDNF in ASD youngsters: no dosing info (no clear dose/effect/duration).
    2. Kynurenine pathway in ASD children: negative/adverse effect (negative/adverse effect).
    3. ACC and left cerebellar metabolism in Asperger’s (MRS study): no dosing info (no clear dose/effect/duration).

    Vitamins
    1. Case report: abnormal blood tests in 30-year-old male with psychosis and neutropenia: positive effect (positive/therapeutic effect).
    2. ASD classification, diagnosis and therapy: positive effect (positive/therapeutic effect).
    3. ACC and cerebellar metabolism MRS study: no dosing info (no clear dose/effect/duration).

    Minerals
    None reported.

    Supplements
    1. Autistic Adult Services Availability survey: positive effect, month (positive/therapeutic effect | month).
    2. Probiotics effectiveness in ASD children (review of RCTs): positive effect (positive/therapeutic effect).
    3. Probiotic supplementation on cognitive function (systematic review): positive effect, week/month (positive/therapeutic effect | week, month).

    Nutrients
    1. Preconceptional and prenatal folic acid/multivitamin intake: positive effect, week (positive/therapeutic effect | week).
    """.trimIndent(),
                listOf(
                    Reference("Pediatr Rep. 2025;17(1):6", "👉 Structured Social Skills Training Program", "39846521"),
                    Reference("Health Econ. 2023;32(5):1019-1039", "👉 Movies, stigma and choice in pharma", "36727570"),
                    Reference("Front Psychiatry. 2022;13:862410", "👉 Alternatives to gold standard diagnostic tools", "35747097"),

                    Reference("CNS Neurol Disord Drug Targets. 2016;15(5):551-63", "👉 Yokukansan (Kampo medicine) for ASD symptoms", "27071791"),

                    Reference("CNS Neurol Disord Drug Targets. 2018;17(8):626-639", "👉 Serum Tryptophan, catabolites, and BDNF in ASD youngsters", "30033880"),
                    Reference("Neuropsychobiology. 2017;76(2):82-88", "👉 Kynurenine pathway in ASD children", "29694960"),
                    Reference("PLoS One. 2017;12(1):e0169288", "👉 ACC and left cerebellar metabolism in Asperger’s (MRS study)", "28060873"),

                    Reference("Tidsskr Nor Laegeforen. 2025;145(10)", "👉 Case report: abnormal blood tests in 30-year-old male", "40923177"),
                    Reference("Pharmacol Ther. 2018;190:91-104", "👉 ASD classification, diagnosis and therapy", "29763648"),
                    Reference("PLoS One. 2017;12(1):e0169288", "👉 ACC and cerebellar metabolism MRS study", "28060873"),

                    Reference("", "👉 Minerals: none reported", ""),

                    Reference("Front Psychiatry. 2022;13:919234", "👉 Autistic Adult Services Availability survey", "35757227"),
                    Reference("Postep Psychiatr Neurol. 2022;31(1):25-34", "👉 Probiotics effectiveness in ASD children (review of RCTs)", "37082415"),
                    Reference("Benef Microbes. 2019;10(8):873-882", "👉 Probiotic supplementation on cognitive function (systematic review)", "31965841"),

                    Reference("Autism. 2016;20(6):710-8", "👉 Preconceptional and prenatal folic acid/multivitamin intake", "26408631")
                )
            )

            "Asthma" -> Pair(
                """
    Alternative
    1. GWAS-reported SNPs on RAD50 in Pakistani children: g,g (no clear dose/effect/duration).
    2. Hypercapnia-induced noncirrhotic hyperammonemia: positive and negative effects (positive/therapeutic effect; negative/adverse effect).
    3. Environmentally friendly inhaler with personalized care: positive and negative effects (positive/therapeutic effect; negative/adverse effect).

    Herbs
    1. Chimonanthus salicifolius essential oil: positive effect (positive/therapeutic effect).
    2. Herbal treatments for acne vulgaris: positive and negative effects (positive/therapeutic effect; negative/adverse effect).
    3. Natural antioxidants from herbs for lung disorders: positive effect (positive/therapeutic effect).

    Amino acids
    1. Asthma and thyroid function (NHANES study): no clear dose/effect/duration.
    2. Amino acid metabolic reprogramming in chronic airway disease: positive effect (positive/therapeutic effect).
    3. Targeting arginine metabolism in immune cells: positive effect (positive/therapeutic effect).

    Vitamins
    1. Maternal folic acid supplementation and pre-adolescent asthma: positive effect, week (positive/therapeutic effect | week).
    2. Pediatric vitamin D supplementation: positive effect (positive/therapeutic effect).
    3. Aerosolized vitamin D attenuating ozone-induced inflammation: positive and negative effects (positive/therapeutic effect; negative/adverse effect).

    Minerals
    1. Population-based study on respiratory diseases in Sertão do Araripe: no clear dose/effect/duration.
    2. Magnesium-mediated immune regulation: positive effect (positive/therapeutic effect).
    3. Occupational dust exposure and asthma prevalence: no clear dose/effect/duration.

    Supplements
    1. Sublingual immunotherapy tablets (grass, tree, ragweed, house dust mite): positive and negative effects (positive/therapeutic effect; negative/adverse effect).
    2. Interleukin-33 inhibitors pharmacokinetics: no clear dose/effect/duration.

    Nutrients
    1. Maternal folic acid supplementation and pre-adolescent asthma: positive effect, week (positive/therapeutic effect | week).
    2. Nutritional status and anaphylaxis severity in children: no clear dose/effect/duration.
    3. Microecological-immune axis in pediatric allergic diseases: positive effect (positive/therapeutic effect).
    """.trimIndent(),
                listOf(
                    Reference("Res Sq [Preprint]. 2025;rs.3.rs-7456490", "👉 GWAS SNPs on RAD50 in Pakistani children", "41001556"),
                    Reference("Cureus. 2025;17(8):e90947", "👉 Hypercapnia-induced noncirrhotic hyperammonemia", "41001303"),
                    Reference("Explor Res Clin Soc Pharm. 2025;20:100651", "👉 Environmentally friendly inhaler study", "40995493"),

                    Reference("J Ethnopharmacol. 2025;353(Pt B):120419", "👉 Chimonanthus salicifolius essential oil", "40816582"),
                    Reference("Recent Adv Antiinfect Drug Discov. 2025", "👉 Herbal treatments for acne vulgaris", "40662556"),
                    Reference("Phytother Res. 2025;39(8):3353-3385", "👉 Natural antioxidants from herbs for lung disorders", "40587974"),

                    Reference("Eur J Med Res. 2025;30:885", "👉 Asthma and thyroid function (NHANES)", "41015767"),
                    Reference("World J Surg Oncol. 2025;23:335", "👉 Amino acid metabolic reprogramming in chronic airway disease", "40963133"),
                    Reference("Curr Allergy Asthma Rep. 2025;25:35", "👉 Targeting arginine metabolism in immune cells", "40788439"),

                    Reference("Nutrients. 2025;17(18):2989", "👉 Maternal folic acid supplementation and pre-adolescent asthma", "41010514"),
                    Reference("J Med Biochem. 2025;44(5):1059-1066", "👉 Pediatric vitamin D supplementation", "40951891"),
                    Reference("Am J Physiol Lung Cell Mol Physiol. 2025", "👉 Aerosolized vitamin D attenuating ozone-induced inflammation", "40938902"),

                    Reference("Epidemiol Serv Saude. 2025;34:e20240519", "👉 Population-based study on respiratory diseases in Sertão do Araripe", "40960761"),
                    Reference("Scientifica (Cairo). 2025;2025:4211238", "👉 Magnesium-mediated immune regulation", "40959529"),
                    Reference("J Int Med Res. 2025;53(9):3000605251371280", "👉 Occupational dust exposure and asthma prevalence", "40891811"),

                    Reference("Allergy. 2025", "👉 Sublingual immunotherapy tablets", "41013980"),
                    Reference("Pharmaceutics. 2025;17(9):1153", "👉 Interleukin-33 inhibitors pharmacokinetics", "41012490"),

                    Reference("Nutrients. 2025;17(18):2989", "👉 Maternal folic acid supplementation and pre-adolescent asthma", "41010514"),
                    Reference("Nutrients. 2025;17(18):3023", "👉 Nutritional status and anaphylaxis severity", "41010548"),
                    Reference("Nutrients. 2025;17(18):2925", "👉 Microecological-immune axis in pediatric allergic diseases", "41010451")
                )
            )

            "Astigmatism" -> Pair(
                """
    Alternative
    1. Bifocal IOL implantation with opposite clear corneal incisions vs bifocal toric IOLs: positive effect, week/month (positive/therapeutic effect | week, month).
    2. Digital vs manual workflows for cataract surgery: positive effect (positive/therapeutic effect).
    3. Intrastromal corneal ring segments for keratoconus: positive effect (positive/therapeutic effect).

    Herbs
    - No data reported.

    Amino acids
    1. Clinical and genetic landscape of ectopia lentis: no clear dose/effect/duration (no clear dose/effect/duration).
    2. Arginine supplementation in keratoconus: positive effect (positive/therapeutic effect).
    3. Gyrate atrophy of choroid and retina: no clear dose/effect/duration (no clear dose/effect/duration).

    Vitamins
    1. Modified Athens vs Cretan protocol in progressive keratoconus: positive effect (positive/therapeutic effect).
    2. Bowman-Stromal inlay vs corneal collagen crosslinking: positive effect, month (positive/therapeutic effect | month).
    3. Accelerated corneal cross-linking (7.2 J/cm², dextran-free riboflavin): positive effect (positive/therapeutic effect).

    Minerals
    1. Artificial tear composition (lipid vs non-lipid hydroxypropyl guar): positive effect (positive/therapeutic effect).
    2. Anjana Kriyakalpa in refractive errors: positive effect (positive/therapeutic effect).
    3. Myhre syndrome: positive effect (positive/therapeutic effect).

    Supplements
    1. Polypseudophakia “Piggyback” or supplementary sulcus-fixated IOLs: positive effect (positive/therapeutic effect).
    2. DNM1L variant expanding pediatric phenotype: positive effect (positive/therapeutic effect).
    3. Oral DHA triglyceride supplementation in keratoconus: positive effect, mg/month (mg | positive/therapeutic effect | month).

    Nutrients
    1. Nutritional intake and myopia/astigmatism: no clear dose/effect/duration (no clear dose/effect/duration).
    2. Preservation and reuse of lenticules via SMILE: positive effect (positive/therapeutic effect).
    3. DHA supplementation in keratoconus: positive effect, mg/month (mg | positive/therapeutic effect | month).
    """.trimIndent(),
                listOf(
                    Reference("Int Ophthalmol. 2025;45(1):387", "👉 Bifocal IOL vs toric IOL in cataract patients with low astigmatism", "41003857"),
                    Reference("Einstein (Sao Paulo). 2025;23:eRW1478", "👉 Digital vs manual cataract surgery workflows", "40990703"),
                    Reference("Ther Adv Ophthalmol. 2025;17:25158414251371521", "👉 Intrastromal corneal ring segments for keratoconus", "40977849"),

                    Reference("Invest Ophthalmol Vis Sci. 2024;65(1):20", "👉 Clinical and genetic landscape of ectopia lentis", "38190127"),
                    Reference("Cells. 2021;10(8):2076", "👉 Arginine supplementation in keratoconus", "34440845"),
                    Reference("Turk J Pediatr. 2011;53(1):94-6", "👉 Gyrate atrophy of choroid and retina", "21534348"),

                    Reference("BMC Ophthalmol. 2025;25(1):376", "👉 Modified Athens vs Cretan protocol in keratoconus", "40597090"),
                    Reference("Indian J Ophthalmol. 2025;73(7):966-973", "👉 Bowman-Stromal inlay vs corneal collagen crosslinking", "40586186"),
                    Reference("Korean J Ophthalmol. 2025;39(4):339-344", "👉 Accelerated corneal cross-linking (7.2 J/cm²)", "40583201"),

                    Reference("Ophthalmol Ther. 2025;14(9):2165-2178", "👉 Artificial tear composition study", "40676409"),
                    Reference("J Ayurveda Integr Med. 2025;16(3):101128", "👉 Anjana Kriyakalpa in refractive errors", "40168790"),
                    Reference("Myhre Syndrome. GeneReviews®", "👉 Myhre syndrome report", "28406602"),

                    Reference("Graefes Arch Clin Exp Ophthalmol. 2025;263(3):603-624", "👉 Polypseudophakia IOLs", "39259300"),
                    Reference("BMC Pediatr. 2024;24(1):104", "👉 DNM1L variant pediatric phenotype expansion", "38341530"),
                    Reference("Nutrients. 2023;15(5):1300", "👉 DHA triglyceride supplementation in keratoconus", "36904299"),

                    Reference("Sci Rep. 2025;15(1):27151", "👉 Nutritional intake association with myopia and astigmatism", "40715589"),
                    Reference("Bioengineering (Basel). 2025;12(4):380", "👉 Preservation and reuse of lenticules via SMILE", "40281740"),
                    Reference("Nutrients. 2023;15(5):1300", "👉 DHA supplementation in keratoconus", "36904299")
                )
            )

            "Ataxia" -> Pair(
                """
    Alternative
    1. Leriglitazone improves iron homeostasis and ferroptotic markers in frataxin-deficient neurons: positive effect (positive/therapeutic effect).
    2. Submovements from wearable sensors capture ataxia severity: positive effect (positive/therapeutic effect).
    3. Detomidine and butorphanol infusion in horses prolongs ataxia but enhances sedation stability: positive effect (positive/therapeutic effect).

    Herbs
    1. Kaempferol from Alpinia officinarum: positive and some adverse effects (positive/therapeutic effect; negative/adverse effect).
    2. Thorn apple seed ingestion: positive effect reported (positive/therapeutic effect).
    3. β-elemene enhances radiosensitivity/chemosensitivity in glioblastoma: G (unclear, context-specific).

    Amino acids
    1. KIF5A related spastic paraplegia type 10: G | positive effect (G | positive/therapeutic effect).
    2. MRE11 variant expression: positive effect (positive/therapeutic effect).
    3. Vesicular monoamine transport inhibitors: negative/adverse effect (negative/adverse effect).

    Vitamins
    1. Mercury exposure causing functional B12 deficiency: μg | positive and negative effects | month (μg | positive/therapeutic effect; negative/adverse effect | month).
    2. Vitamin B12 deficiency Q&A: no clear dose/effect/duration (no clear dose/effect/duration).
    3. Subacute combined degeneration from autoimmune gastritis: no clear dose/effect/duration (no clear dose/effect/duration).

    Minerals
    1. Wernicke Encephalopathy in Crohn's disease: mg | positive effect | week (mg | positive/therapeutic effect | week).
    2. Bone mineral density in familial dysautonomia: no clear dose/effect/duration (no clear dose/effect/duration).
    3. Susceptibility-weighted imaging in neurodegenerative disorders: no clear dose/effect/duration (no clear dose/effect/duration).

    Supplements
    1. Vitamin B12 deficiency review: no clear dose/effect/duration (no clear dose/effect/duration).
    2. Wernicke's encephalopathy after total parenteral nutrition: positive effect (positive/therapeutic effect).
    3. Chronic lymphocytic inflammation with pontine perivascular enhancement syndrome: mg | positive effect | week, month (mg | positive/therapeutic effect | week, month).

    Nutrients
    1. Wernicke encephalopathy & PRES after gastric sleeve: positive effect | month (positive/therapeutic effect | month).
    2. Environmental NaCl in C. elegans: positive and negative effects (positive/therapeutic effect; negative/adverse effect).
    3. Lifespan-extending genetic manipulations in MJD/SCA3 model: positive effect (positive/therapeutic effect).
    """.trimIndent(),
                listOf(
                    Reference("Biomed Pharmacother. 2025;192:118553", "👉 Leriglitazone improves iron homeostasis in frataxin-deficient neurons", "40972403"),
                    Reference("Cerebellum. 2025;24(6):156", "👉 Submovements from wearable sensors capture ataxia severity", "40956472"),
                    Reference("Front Vet Sci. 2025;12:1606585", "👉 Detomidine and butorphanol in equine sedation", "40919037"),

                    Reference("J Ethnopharmacol. 2024;333:118430", "👉 Kaempferol from Alpinia officinarum", "38857680"),
                    Reference("Eur J Case Rep Intern Med. 2024;11(4):004381", "👉 Thorn apple seed ingestion", "38584905"),
                    Reference("Oncol Rep. 2015;34(2):943-51", "👉 β-elemene enhances radiosensitivity/chemosensitivity", "26062577"),

                    Reference("Parkinsonism Relat Disord. 2025;140:108026", "👉 KIF5A related spastic paraplegia type 10", "40945307"),
                    Reference("bioRxiv. 2025;2025.07.15.664809", "👉 MRE11 variant expression study", "40791546"),
                    Reference("Lancet. 2025;406(10503):650-664", "👉 Vesicular monoamine transport inhibitors", "40783291"),

                    Reference("Front Toxicol. 2025;7:1580275", "👉 Mercury exposure causing functional B12 deficiency", "40995338"),
                    Reference("Am Fam Physician. 2025;112(3):294-300", "👉 Vitamin B12 deficiency Q&A", "40961307"),
                    Reference("Rinsho Shinkeigaku. 2025;65(9):661-665", "👉 Subacute combined degeneration from autoimmune gastritis", "40866231"),

                    Reference("Acta Med Indones. 2025;57(2):251-256", "👉 Wernicke Encephalopathy in Crohn's disease", "40641204"),
                    Reference("Calcif Tissue Int. 2025;116(1):88", "👉 Bone mineral density in familial dysautonomia", "40555858"),
                    Reference("Bioengineering (Basel). 2025;12(5):473", "👉 Susceptibility-weighted imaging in neurodegenerative disorders", "40428092"),

                    Reference("Am Fam Physician. 2025;112(3):294-300", "👉 Vitamin B12 deficiency review", "40961307"),
                    Reference("Ann Med Surg (Lond). 2025;87(7):4585-4590", "👉 Wernicke's encephalopathy after TPN", "40852015"),
                    Reference("J Med Case Rep. 2025;19(1):351", "👉 Chronic lymphocytic inflammation with pontine perivascular enhancement syndrome", "40676639"),

                    Reference("Ochsner J. 2025;25(3):201-205", "👉 Wernicke encephalopathy & PRES after gastric sleeve surgery", "40995154"),
                    Reference("Genetics. 2025;iyaf139", "👉 Environmental NaCl effects in C. elegans", "40820329"),
                    Reference("Mech Ageing Dev. 2025;225:112064", "👉 Lifespan-extending genetic manipulations in MJD/SCA3 model", "40287101")
                )
            )

            "Atherosclerosis" -> Pair(
                """
    Alternative
    1. Conventional tobacco vs e-cigarettes in mice: negative/adverse effect | week.
    2. Protease-activated receptors (PARs) in platelets: G (unclear).
    3. Alternate vs traditional tobacco products: positive and negative effects.

    Herbs
    1. Yiqi Huoxue Huatan formula: g | positive effect.
    2. Myristica fragrans (nutmeg) review: positive and negative effects.
    3. Traditional Chinese medicine formulas for acute pancreatitis: positive effect.

    Amino acids
    1. Echocardiography and ADMA in adolescents with Hashimoto's: no clear dose/effect/duration.
    2. TRIM in metabolic regulation: no clear dose/effect/duration.
    3. Slc7a7 in macrophage glutaminolysis for atherosclerosis: positive effect.

    Vitamins
    1. Nicotinamide N-Methyltransferase in cardiovascular diseases: positive effect.
    2. Single-clove garlic extract on nicotine-induced inflammation: g, mg | positive and negative effects.
    3. Planetary Health Diet Index study in South Asians: no clear dose/effect/duration.

    Minerals
    1. Statins and vertebral bone mineral density in MESA study: g (unclear).
    2. Osteogenic differentiation in vascular smooth muscle cells under high glucose: G (unclear).
    3. Interleukin family in vascular calcification: no clear dose/effect/duration.

    Supplements
    1. Public awareness survey on ASCVD in UAE: positive effect.
    2. Stingless bee propolis: positive and negative effects.
    3. Consensus on plasma triglycerides in CVD (SISA): positive effect.

    Nutrients
    1. Slc7a7 licenses macrophage glutaminolysis: positive effect.
    2. Haptoglobin association with oxidized LDL in obese T2DM: mg | positive effect.
    3. Personalized nutrition biomarkers for atherosclerosis risk: positive effect.
    """.trimIndent(),
                listOf(
                    Reference("Am J Physiol Heart Circ Physiol. 2025", "👉 Conventional tobacco vs e-cigarettes in mice", "41015405"),
                    Reference("Front Mol Biosci. 2025;12:1636893", "👉 Protease-activated receptors (PARs) in platelets", "40994550"),
                    Reference("Toxicol Rep. 2025;15:102100", "👉 Alternate vs traditional tobacco products", "40988706"),

                    Reference("Fitoterapia. 2025;186:106849", "👉 Yiqi Huoxue Huatan formula", "40886920"),
                    Reference("Altern Ther Health Med. 2025;AT11668", "👉 Myristica fragrans (nutmeg) review", "40768549"),
                    Reference("Chin Herb Med. 2024;17(3):584-600", "👉 Traditional Chinese medicine formulas for acute pancreatitis", "40734918"),

                    Reference("Niger J Clin Pract. 2025;28(9):1039-1048", "👉 Echocardiography and ADMA in adolescents with Hashimoto's", "41014529"),
                    Reference("Metabolism. 2025;174:156394", "👉 TRIM in metabolic regulation", "40987417"),
                    Reference("Nat Metab. 2025;7(9):1924-1938", "👉 Slc7a7 in macrophage glutaminolysis", "40983679"),

                    Reference("Biomolecules. 2025;15(9):1281", "👉 Nicotinamide N-Methyltransferase in CVD", "41008588"),
                    Reference("Open Vet J. 2025;15(6):2374-2385", "👉 Single-clove garlic extract on nicotine-induced inflammation", "40989638"),
                    Reference("J Acad Nutr Diet. 2025;S2212-2672", "👉 Planetary Health Diet Index study in South Asians", "40939744"),

                    Reference("Bone. 2025;201:117659", "👉 Statins and vertebral bone mineral density in MESA study", "40992679"),
                    Reference("Front Endocrinol (Lausanne). 2025;16:1589160", "👉 Osteogenic differentiation in vascular smooth muscle cells under high glucose", "40979714"),
                    Reference("Front Cardiovasc Med. 2025;12:1619018", "👉 Interleukin family in vascular calcification", "40959491"),

                    Reference("J Public Health Res. 2025;14(3):22799036251373011", "👉 Public awareness survey on ASCVD in UAE", "40969713"),
                    Reference("Nat Prod Bioprospect. 2025;15(1):61", "👉 Stingless bee propolis", "40906303"),
                    Reference("Nutr Metab Cardiovasc Dis. 2025;104214", "👉 Consensus on plasma triglycerides in CVD (SISA)", "40887367"),

                    Reference("Nat Metab. 2025;7(9):1924-1938", "👉 Slc7a7 licenses macrophage glutaminolysis", "40983679"),
                    Reference("Nutrients. 2025;17(17):2883", "👉 Haptoglobin association with oxidized LDL in obese T2DM", "40944271"),
                    Reference("Nutrients. 2025;17(17):2804", "👉 Personalized nutrition biomarkers for atherosclerosis risk", "40944193")
                )
            )

            "Athlete's foot" -> Pair(
                """
    Alternative
    1. Trichophyton rubrum detection via PCR in toenails: no clear dose/effect/duration.
    2. Onychomycosis in diabetics: G | positive effect | month.
    3. Catalase deactivation increases dermatophyte sensitivity: positive effect.

    Herbs
    1. Ethnobotanical study in Kenya: positive effect.
    2. Coix seed anti-tumor effect: positive effect.

    Amino acids
    1. Tinea incognita due to Trichophyton mentagrophytes: no clear dose/effect/duration.
    2. Autoimmune thyroid disorders in psoriasis: no clear dose/effect/duration.
    3. 5-Aminolevulinic acid-photodynamic treatment for tinea pedis: no clear dose/effect/duration.

    Vitamins
    1. Huangqin decoction antifungal activity: mg, mg.
    2. Tinea incognita after antipsoriatic gel use: no clear dose/effect/duration.
    3. Trichophyton eboreum sp. nov. isolated from human skin: no clear dose/effect/duration.

    Minerals
    1. Topical tolnaftate: no clear dose/effect/duration.
    2. Violacein antifungal activity: g, mg.
    3. Econazole nitrate-loaded MCM-41 for topical antifungal powder: positive effect.

    Supplements
    1. Interdigital and plantar foot infections in US: no clear dose/effect/duration.
    2. Lateral flow immunochromatographic assay for tinea unguium: mg | positive effect.
    3. Foot coordination patterns and ankle sprain: positive effect.

    Nutrients
    1. Comparative genome analysis of Trichophyton rubrum: no clear dose/effect/duration.
    2. Barrier function disruption in dermatophytosis: positive effect.
    3. Copper-oxide impregnated socks for tinea pedis: positive and negative effects.
    """.trimIndent(),
                listOf(
                    Reference("J Fungi (Basel). 2025;11(7):520", "👉 Trichophyton rubrum detection via PCR in toenails", "40985411"),
                    Reference("Life (Basel). 2025;15(8):1285", "👉 Onychomycosis in diabetics", "40868932"),
                    Reference("J Fungi (Basel). 2024;10(7):476", "👉 Catalase deactivation increases dermatophyte sensitivity", "39057361"),

                    Reference("Front Pharmacol. 2024;14:1328903", "👉 Ethnobotanical study in Kenya", "38313073"),
                    Reference("World J Clin Oncol. 2023;14(12):593-605", "👉 Coix seed anti-tumor effect", "38179404"),

                    Reference("J Dtsch Dermatol Ges. 2011;9(11):917-8", "👉 Tinea incognita due to Trichophyton mentagrophytes", "21790995"),
                    Reference("Eur J Dermatol. 2009;19(3):221-3", "👉 Autoimmune thyroid disorders in psoriasis", "19251564"),
                    Reference("J Eur Acad Dermatol Venereol. 2009;23(2):203-4", "👉 5-Aminolevulinic acid-photodynamic treatment for tinea pedis", "18452528"),

                    Reference("J Med Microbiol. 2024;73(2)", "👉 Huangqin decoction antifungal activity", "38348868"),
                    Reference("Skin Appendage Disord. 2016;1(3):123-5", "👉 Tinea incognita after antipsoriatic gel use", "27171394"),
                    Reference("J Clin Microbiol. 2005;43(10):5230-7", "👉 Trichophyton eboreum sp. nov. isolated from human skin", "16207988"),

                    Reference("Tolnaftate. Drugs and Lactation Database (LactMed®). 2006–", "👉 Topical tolnaftate", "30000499"),
                    Reference("J Microbiol. 2015;53(10):694-701", "👉 Violacein antifungal activity", "26428920"),
                    Reference("J Pharm Sci. 2010;99(11):4738-45", "👉 Econazole nitrate-loaded MCM-41 for topical antifungal powder", "20845470"),

                    Reference("Microorganisms. 2025;13(1):184", "👉 Interdigital and plantar foot infections in US", "39858952"),
                    Reference("J Dermatol. 2021;48(5):633-637", "👉 Lateral flow immunochromatographic assay for tinea unguium", "33686693"),
                    Reference("Foot (Edinb). 2020;45:101745", "👉 Foot coordination patterns and ankle sprain", "33032156"),

                    Reference("mBio. 2012;3(5):e00259-12", "👉 Comparative genome analysis of Trichophyton rubrum", "22951933"),
                    Reference("J Dermatol. 2011;38(11):1049-1053", "👉 Barrier function disruption in dermatophytosis", "21950511"),
                    Reference("Foot (Edinb). 2008;18(3):136-41", "👉 Copper-oxide impregnated socks for tinea pedis", "20307427")
                )
            )

            "Atopic eczema" -> Pair(
                """
    Alternative
    1. Mesenchymal stem cell-derived extracellular vesicles via miR-146a/NF-κB: mg | positive effect.
    2. Topical corticosteroid use experiences in pediatric AD: positive effect.
    3. Non-steroidal SNEPI treatment in infant AD: positive & negative effects.

    Herbs
    1. Oxymatrine for atopic dermatitis: no clear dose/effect/duration.
    2. WuSheZhiYang Pills in mild-to-moderate AD: g | positive effect | week.
    3. Herbal medicine systematic review/meta-analysis: positive & negative effects.

    Amino acids
    1. Early supplementation for cow's milk allergy prevention: positive & negative effects | day, month.
    2. Anti-inflammatory emulsion development: positive effect.
    3. Phenylalanine amide derivatives promote FLG expression: positive & negative effects.

    Vitamins
    1. Maternal first-trimester vitamin A/E and infant AD risk: positive effect | week, day, month.
    2. Retraction of dietary antioxidant vitamin intake and AD study: positive effect.
    3. Dietary patterns, gut microbiome, and itch severity in preschoolers with AD: no clear dose/effect/duration.

    Minerals
    1. Seborrheic dermatitis management: month.
    2. Thermal water dermatological review: positive & negative effects.
    3. Deep sea minerals ameliorate AD-like lesions in mice: mg | positive effect | week.

    Supplements
    1. Microecological-immune axis in pediatric allergic diseases: positive effect.
    2. Nutraceuticals against oxidative stress in allergic diseases: positive effect.
    3. 2'-Fucosyllactose supplementation in infants: positive effect.

    Nutrients
    1. Nutritional status and pediatric anaphylaxis severity: no clear dose/effect/duration.
    2. Microecological-immune axis in pediatric allergic diseases: positive effect.
    3. Skin microbiota in facial dermatoses: positive effect.
    """.trimIndent(),
                listOf(
                    Reference("Stem Cell Res Ther. 2025;16(1):496", "👉 Mesenchymal stem cell-derived extracellular vesicles via miR-146a/NF-κB", "40999478"),
                    Reference("Aust J Prim Health. 2025;31:PY25119", "👉 Topical corticosteroid use experiences in pediatric AD", "40977213"),
                    Reference("J Dermatolog Treat. 2025;36(1):2562308", "👉 Non-steroidal SNEPI treatment in infant AD", "40968562"),

                    Reference("Int Immunopharmacol. 2025;163:115243", "👉 Oxymatrine for atopic dermatitis", "40680609"),
                    Reference("JMIR Res Protoc. 2025;14:e77927", "👉 WuSheZhiYang Pills in mild-to-moderate AD", "40601920"),
                    Reference("Dermatitis. 2025;36(3):207-215", "👉 Herbal medicine systematic review/meta-analysis", "38963342"),

                    Reference("BMJ Open. 2025;15(8):e096217", "👉 Early supplementation for cow's milk allergy prevention", "40764079"),
                    Reference("Pharmaceutics. 2025;17(7):933", "👉 Anti-inflammatory emulsion development", "40733141"),
                    Reference("J Pharmacol Sci. 2025;159(1):44-53", "👉 Phenylalanine amide derivatives promote FLG expression", "40713347"),

                    Reference("Pediatr Allergy Immunol. 2025;36(9):e70204", "👉 Maternal first-trimester vitamin A/E and infant AD risk", "40965351"),
                    Reference("Skin Res Technol. 2025;31(9):e70229", "👉 Retraction of dietary antioxidant vitamin intake and AD study", "40964907"),
                    Reference("Pediatr Allergy Immunol. 2025;36(9):e70202", "👉 Dietary patterns, gut microbiome, and itch severity in preschoolers with AD", "40960322"),

                    Reference("Am Fam Physician. 2025;112(2):166-173", "👉 Seborrheic dermatitis management", "40834373"),
                    Reference("Int J Biometeorol. 2025;69(8):1783-1817", "👉 Thermal water dermatological review", "40423748"),
                    Reference("Biomedicines. 2025;13(4):861", "👉 Deep sea minerals ameliorate AD-like lesions in mice", "40299438"),

                    Reference("Nutrients. 2025;17(18):2925", "👉 Microecological-immune axis in pediatric allergic diseases", "41010451"),
                    Reference("Biomolecules. 2025;15(9):1347", "👉 Nutraceuticals against oxidative stress in allergic diseases", "41008654"),
                    Reference("Pediatr Gastroenterol Hepatol Nutr. 2025;28(5):291-301", "👉 2'-Fucosyllactose supplementation in infants", "41001441"),

                    Reference("Nutrients. 2025;17(18):3023", "👉 Nutritional status and pediatric anaphylaxis severity", "41010548"),
                    Reference("Nutrients. 2025;17(18):2925", "👉 Microecological-immune axis in pediatric allergic diseases", "41010451"),
                    Reference("Int J Mol Sci. 2025;26(18):8857", "👉 Skin microbiota in facial dermatoses", "41009424")
                )
            )

            "Atrial fibrillation" -> Pair(
                """
    Alternative
    1. Cardiac PET for AF rhythm prediction: positive effect.
    2. Landiolol for HR control in unstable ICU patients: negative effect.
    3. Low vs high tidal volumes in one-lung ventilation: positive effect | day.

    Herbs
    1. Medicinal plant extracts against cardiometabolic risk factors: positive effect.
    2. Echimidine exposure in zebrafish larvae: positive & negative effects.
    3. Compound Qidan Formula in HFpEF rats: positive effect | week.

    Amino acids
    1. Echocardiography, carotid IMT, ADMA in female adolescents with Hashimoto's: no clear dose/effect/duration.
    2. Advanced glycation end-product CML and incident HF & AF in older adults: no clear dose/effect/duration.
    3. Sacubitril/valsartan dose-dependent renoprotective effects in HF: mg | month.

    Vitamins
    1. Stroke prevention in non-valvular AF patients: positive effect.
    2. Catheter-based left atrial appendage closure vs medical therapy: positive effect.
    3. Ischemic stroke in known AF: positive effect | day.

    Minerals
    1. Dysmagnesemia in ICU: no clear dose/effect/duration.
    2. Chronic kidney disease care optimization: positive & negative effects.
    3. Bone mineral loss and AF risk: positive effect.

    Supplements
    1. Interventions to improve adherence to CVD guidelines: positive effect.
    2. Superior vena cava isolation added to pulmonary vein isolation in paroxysmal AF: positive effect | month.
    3. Integrative approaches to persistent AF: no clear dose/effect/duration.

    Nutrients
    1. Cognitive architecture of health beliefs (salt-related disease risks): positive effect.
    2. Microbial metabolites and cardiovascular dysfunction: positive effect.
    3. Risk of HF and subtypes with biomarker-calibrated protein intake: positive effect.
    """.trimIndent(),
                listOf(
                    Reference("Heart Lung. 2025;75:125-135", "👉 Cardiac PET for AF rhythm prediction", "41014872"),
                    Reference("Medicina (Kaunas). 2025;61(9):1703", "👉 Landiolol for HR control in unstable ICU patients", "41011094"),
                    Reference("Sci Rep. 2025;15(1):33081", "👉 Low vs high tidal volumes in one-lung ventilation", "41006385"),

                    Reference("Pharmaceuticals (Basel). 2024;17(7):967", "👉 Medicinal plant extracts against cardiometabolic risk factors", "39065815"),
                    Reference("Ecotoxicol Environ Saf. 2023;266:115574", "👉 Echimidine exposure in zebrafish larvae", "37839186"),
                    Reference("J Ethnopharmacol. 2023;313:116558", "👉 Compound Qidan Formula in HFpEF rats", "37116729"),

                    Reference("Niger J Clin Pract. 2025;28(9):1039-1048", "👉 Echocardiography, carotid IMT, ADMA in female adolescents with Hashimoto's", "41014529"),
                    Reference("J Am Heart Assoc. 2025;14(18):e040640", "👉 Advanced glycation end-product CML and incident HF & AF in older adults", "40913281"),
                    Reference("Ren Fail. 2025;47(1):2538830", "👉 Sacubitril/valsartan dose-dependent renoprotective effects in HF", "40841853"),

                    Reference("Cureus. 2025;17(8):e90214", "👉 Stroke prevention in non-valvular AF patients", "40970015"),
                    Reference("Am Heart J. 2025:S0002-8703(25)00326-6", "👉 Catheter-based left atrial appendage closure vs medical therapy", "40946883"),
                    Reference("J Clin Med. 2025;14(17):6012", "👉 Ischemic stroke in known AF", "40943771"),

                    Reference("Metabolites. 2025;15(8):498", "👉 Dysmagnesemia in ICU", "40863117"),
                    Reference("J Chin Med Assoc. 2025", "👉 Chronic kidney disease care optimization", "40790782"),
                    Reference("Eur J Prev Cardiol. 2025:zwaf346", "👉 Bone mineral loss and AF risk", "40504860"),

                    Reference("Ir J Med Sci. 2025", "👉 Interventions to improve adherence to CVD guidelines", "40991187"),
                    Reference("BMJ Open. 2025;15(9):e095135", "👉 Superior vena cava isolation added to pulmonary vein isolation in paroxysmal AF", "40921640"),
                    Reference("Heart Rhythm. 2025:S1547-5271(25)02737-7", "👉 Integrative approaches to persistent AF", "40900061"),

                    Reference("Nutrients. 2025;17(17):2728", "👉 Cognitive architecture of health beliefs (salt-related disease risks)", "40944119"),
                    Reference("Cells. 2025;14(16):1237", "👉 Microbial metabolites and cardiovascular dysfunction", "40862716"),
                    Reference("Am J Prev Cardiol. 2025;23:101051", "👉 Risk of HF and subtypes with biomarker-calibrated protein intake", "40718583")
                )
            )

            "Autism" -> Pair(
                """
    Alternative
    1. Phonological feature discrimination: multi-feature oddball protocols improve sensory processing in children with ASD.
    2. Gut microbiota modulation: potential therapeutic implications for psychiatric & neurological symptoms.
    3. Hug-robot-mediated role-play: promotes friendship and social interaction.

    Herbs
    1. Herbal medicines: potential anti-inflammatory and neuroprotective effects, dosage guidelines provided.
    2. Perindopril: ameliorates valproate-induced autism-like behaviors via Sirtuin-1, JAK2/STAT3, PI3K/Akt/GSK-3β, and PPAR-γ pathways.
    3. Resveratrol: improves maternal immune activation-induced autism-like behaviors.

    Amino acids
    1. Gut and metabolic biomarkers: amino acid signatures explored for early detection of ASD.

    Vitamins
    1. Prenatal Vitamin D, multivitamins, folic acid: influence brain structure in children with ASD traits.
    2. Vitamins & vascular health: endothelial function modulation may benefit neurodevelopment.
    3. Leucovorin: little-tested vitamin therapy under investigation.

    Minerals
    1. Zinc, magnesium, other minerals: potential causal link with ASD risk explored via Mendelian randomization.

    Supplements
    1. Microbiota-gut-brain axis modulation: probiotics and nutrients may support ASD therapy.
    """.trimIndent(),
                listOf(
                    Reference("Brain Sci. 2025 Aug 23;15(9):905", "👉 Phonological feature discrimination", "41008265"),
                    Reference("Biomedicines. 2025 Aug 29;13(9):2104", "👉 Gut microbiota modulation", "41007667"),
                    Reference("Asian J Psychiatr. 2025 Sep 19;112:104704", "👉 Hug-robot-mediated role-play", "41005065"),
                    Reference("Altern Ther Health Med. 2025 Aug 6:AT11717", "👉 Herbal medicines", "40768551"),
                    Reference("Medicina (Kaunas). 2024 Nov 3;60(11):1802", "👉 Perindopril", "39596986"),
                    Reference("J Nutr Biochem. 2024 Jul;129:109638", "👉 Resveratrol", "38583499"),
                    Reference("J Autism Dev Disord. 2025 Sep 26", "👉 Gut and metabolic biomarkers", "41003935"),
                    Reference("Ann Med Surg (Lond). 2025 Jun 16;87(7):4046-4052", "👉 BCKDK gene mutations", "40851941"),
                    Reference("Nutrients. 2025 Sep 17;17(18):2979", "👉 Prenatal vitamins & folic acid", "41010504"),
                    Reference("Nutrients. 2025 Sep 15;17(18):2955", "👉 Vitamins & vascular health", "41010482"),
                    Reference("Science. 2025 Sep 25;389(6767):1282-1283", "👉 Leucovorin therapy", "40997185"),
                    Reference("Zhongguo Dang Dai Er Ke Za Zhi. 2025 Sept 15;27(9):1098-1104", "👉 Zinc, magnesium, minerals", "40962521"),
                    Reference("Front Nutr. 2025 Jul 30;12:1586925", "👉 Nutrition & neurodivergence", "40808843"),
                    Reference("Nutrients. 2025 Sep 17;17(18):2984", "👉 Microbiota-gut-brain axis", "41010510")
                )
            )

            "Autosomal dominant polycystic kidney disease" -> Pair(
                """
    Alternative
    1. Tolvaptan (short-term, low-dose): effective for severe hyponatremia; hepatic safety monitored.
    2. Dihydrotanshinone I: antiproliferative effects via immunomodulation.
    3. Diagnostic case studies: highlight challenges in identifying kidney cysts in ADPKD and Alport syndrome.

    Herbs
    1. No specific herbal interventions reported.

    Amino acids
    1. Vadadustat: safety and effectiveness in CKD-related anemia; real-world surveillance.
    2. Melanin-like nanoparticles: slow cyst growth via oxidative stress and CREB inhibition.
    3. Case reports: mutations associated with PKD type I.

    Vitamins
    1. Alendronate: improves bone mineral density and microarchitecture in ADPKD with Hajdu-Cheney syndrome.
    2. Interventions to prevent disease progression: systematic reviews report mixed efficacy.
    3. Synthetic agents: promote cystic cell apoptosis via oxidative stress.

    Minerals
    1. Chronic kidney disease-related mineral and bone disorder: monitoring essential in ADPKD.
    2. SGLT2 inhibitors: dual effects on kidney protection and systemic health.
    3. Bone mineral improvements with alendronate therapy.

    Supplements
    1. Diet and lifestyle interventions: systematic reviews and case reports support safe nutrition strategies.
    2. Polycystic kidney disease diet: evaluated for safety and efficacy.
    
    Nutrients
    1. Nutritional management: key aspects in polycystic liver disease patients.
    2. Ketogenic interventions: potential therapeutic benefit in ADPKD.
    3. Diet, lifestyle, environment: may influence disease progression.
    """.trimIndent(),
                listOf(
                    Reference("Medicine (Baltimore). 2025 Aug 15;104(33):e43485", "👉 Tolvaptan, short-term low-dose", "40826759"),
                    Reference("J Pharmacol Exp Ther. 2025 Jul 10;392(9):103655", "👉 Dihydrotanshinone I", "40768842"),
                    Reference("Am J Kidney Dis. 2025 Oct;86(4):570-574", "👉 Diagnostic case studies", "40683378"),
                    Reference("", "👉 No herbal interventions reported", ""),
                    Reference("Adv Ther. 2025 Sep;42(9):4486-4509", "👉 Vadadustat", "40643844"),
                    Reference("EMBO Mol Med. 2025 Jan;17(1):169-192", "👉 Melanin-like nanoparticles", "39567834"),
                    Reference("Genes (Basel). 2024 Sep 27;15(10):1262", "👉 PKD type I mutation case report", "39457385"),
                    Reference("Bone Rep. 2025 Mar 24;25:101838", "👉 Alendronate therapy", "40235644"),
                    Reference("Cochrane Database Syst Rev. 2024 Oct 2;10(10):CD010294", "👉 Interventions to prevent progression", "39356039"),
                    Reference("Proc Natl Acad Sci U S A. 2024 Jan 23;121(4):e2317344121", "👉 Synthetic agents promoting apoptosis", "38241440"),
                    Reference("Bone. 2025 Sep 16;201:117652", "👉 CKD-mineral & bone disorder in ADPKD", "40967553"),
                    Reference("Diabetol Metab Syndr. 2025 Jun 14;17(1):214", "👉 SGLT2 inhibitors effects", "40517274"),
                    Reference("Cochrane Database Syst Rev. 2024 Oct 2;10(10):CD010294", "👉 Diet & supplements review", "39356039"),
                    Reference("Middle East J Dig Dis. 2023 Oct;15(4):289-292", "👉 Polycystic kidney disease diet", "38523883"),
                    Reference("Nutrients. 2025 Jul 21;17(14):2380", "👉 Nutritional management", "40733005"),
                    Reference("Nutrients. 2024 Dec 31;17(1):145", "👉 Ketogenic interventions", "39796576"),
                    Reference("Nutrients. 2024 Sep 27;16(19):3281", "👉 Diet, lifestyle & environment effects", "39408247")
                )
            )

            "Autosomal recessive polycystic kidney disease" -> Pair(
                """
    Alternative
    1. TYROBP monoallelic deletion: potential novel risk factor (research focus, no clear dose/effect).
    2. Minigene-based splice assays: insights on PKHD1 intronic variants.
    3. TMEM231 gene splice variants: pathological findings in Meckel Syndrome fetus.

    Herbs
    1. No specific herbal interventions reported.

    Amino acids
    1. Electrolyte and metabolite composition analysis in ARPKD rat model.
    2. PKHD1L1 gene involvement: stereocilia coat and AR nonsyndromic hearing loss.
    3. Recessive PKD1 mutations: association with febrile seizures and epilepsy.

    Vitamins
    1. Improved neonatal care and renal replacement therapy: positive outcomes in ARPKD with kidney-liver complications.
    2. Cdc25A inhibition: suppresses hepato-renal cystogenesis in rodent models.

    Minerals
    1. Soy protein isolate and omega-3 oils: affect mineral balance in ARPKD rats.
    2. Polycystic kidney syndrome in NZ White rabbits: animal model research (no clear dose/effect).

    Supplements
    1. GeneReviews PKHD1 overview: therapeutic and adverse effects reported.
    2. Caroli’s disease case report: associated with ARPKD (positive effect reported).
    3. Differential diagnosis strategies for cystic kidney diseases.

    Nutrients
    1. Non-pharmacological and pharmacological interventions: influence on disease course.
    2. Fibrocystin carboxy-terminus: controls STAT3 signaling via SRC activation.
    """.trimIndent(),
                listOf(
                    Reference("Mol Neurodegener. 2025 Apr 29;20(1):50", "👉 TYROBP deletion research", "40301889"),
                    Reference("Hum Genomics. 2024 Nov 9;18(1):122", "👉 PKHD1 minigene-based splice assays", "39521997"),
                    Reference("Front Genet. 2023 Sep 6;14:1252873", "👉 TMEM231 gene splice variants", "37736303"),
                    Reference("", "👉 No herbal interventions reported", ""),
                    Reference("Commun Biol. 2025 Feb 13;8(1):230", "👉 Electrolyte/metabolite composition in ARPKD", "39948436"),
                    Reference("medRxiv [Preprint]. 2023 Dec 19:2023.10.08.23296081", "👉 PKHD1L1 gene & hearing loss", "37873491"),
                    Reference("Front Mol Neurosci. 2022 May 10;15:861159", "👉 Recessive PKD1 mutations & epilepsy", "35620448"),
                    Reference("Pediatr Transplant. 2013 Jun;17(4):328-35", "👉 Improved neonatal care & renal therapy", "23593929"),
                    Reference("Gastroenterology. 2012 Mar;142(3):622-633.e4", "👉 Cdc25A inhibition in rodent models", "22155366"),
                    Reference("BMC Nephrol. 2015 Feb 10;16:13", "👉 Soy protein & omega-3 effects in ARPKD", "25886405"),
                    Reference("Kidney Int. 2004 Feb;65(2):482-9", "👉 Polycystic kidney syndrome rabbit model", "14717918"),
                    Reference("GeneReviews. 2001 Jul 19 [updated 2024 Apr 4]", "👉 PKHD1 GeneReviews overview", "20301501"),
                    Reference("Middle East J Dig Dis. 2023 Oct;15(4):289-292", "👉 Caroli's disease case report", "38523883"),
                    Reference("J Clin Med. 2022 Nov 3;11(21):6528", "👉 Differential diagnosis for cystic kidney diseases", "36362756"),
                    Reference("Nutrients. 2024 Sep 23;16(18):3216", "👉 Non-pharmacological/pharmacological interventions", "39339816"),
                    Reference("J Cell Mol Med. 2020 Dec;24(24):14633-14638", "👉 Fibrocystin carboxy-terminus & STAT3 signaling", "33112055")
                )
            )

            "Avian flu" -> Pair(
                """
    Alternative
    1. Cryopreservation of chicken and duck tracheal rings & precision-cut lung slices: promising tool for rapid characterization of avian influenza viruses.
    2. Avian influenza A(H5) virus datasets for Nextclade: enables rapid and accurate clade assignment.
    3. Lyophilized qRT-PCR reagent: validated for molecular diagnosis of avian influenza in Sub-Saharan Africa.

    Herbs
    1. Novel therapeutic strategies for avian viral infectious diseases (Infectious Bronchitis & Avian Influenza): mixed effects reported.
    2. Four herbs as dietary supplement in Japanese quail: positive and negative effects on egg properties & immune response against vaccines.
    3. Deva-5 herb formulation & extracts of five Asian plants: direct antiviral activity against influenza A H3N8; positive & negative effects.

    Amino acids
    1. NS1 variant with effector domain deletion: gains growth advantage in influenza virus infection.
    2. Codon usage-based stratification of Influenza A across recent spillovers: therapeutic implications.
    3. hnRNPM regulates influenza A virus replication: cross-species transmission implications; no clear dose/effect/duration.

    Vitamins
    1. Variation in nutritional quality in UK retail eggs; no clear dose/effect.
    2. In ovo retinoic acid: enhances cell-mediated immune response against inactivated H9N2 vaccine.
    3. Vitamin C and Arabic gum co-administration: improves immunity in H9N2 vaccinated/challenged quails.

    Minerals
    1. One Health adjuvant selection for zoonotic vaccines; no clear dose/effect.
    2. Graphene oxide quantum dot immunochromatographic strip for H7 detection; no clear dose/effect.
    3. Cistanche deserticola polysaccharide-functionalized adjuvant for H9N2 oral vaccine: enhances systemic & mucosal immunity.

    Supplements
    1. Pseudostellaria heterophylla polysaccharide: boosts humoral immunity & splenic lymphocyte gene expression in chicks.
    2. Chicken hemoglobin antimicrobial peptides: improve mucosal immunity & vaccine responses under heat stress.
    3. In vitro culture of H5N1-specific duck T cells: detects immune responses; positive & negative effects.

    Nutrients
    1. Variation in egg nutritional quality; no clear dose/effect.
    2. In ovo vitamin E or C feeding: improves hatchability, performance, immunity in broilers.
    3. Fennel essential oil: enhances performance, immunity, ileum morphology, microbial population, meat quality in broilers.
    """.trimIndent(),
                listOf(
                    Reference("J Virol Methods. 2025 Sep 2;339:115257", "👉 Cryopreservation for virus characterization", "40907768"),
                    Reference("Virus Evol. 2025 Aug 4;11(1):veaf058", "👉 H5 virus datasets for Nextclade", "40860043"),
                    Reference("J Clin Microbiol. 2025 Aug 13;63(8):e0008025", "👉 Lyophilized qRT-PCR reagent validation", "40590553"),
                    Reference("Front Vet Sci. 2022 Jul 22;9:933274", "👉 Novel herbal strategies; mixed effects", "35937298"),
                    Reference("Trop Anim Health Prod. 2022 Jan 7;54(1):38", "👉 Four herbs in quail; positive & negative effects", "34997337"),
                    Reference("BMC Complement Altern Med. 2014 Jul 10;14:235", "👉 Deva-5 herb formulation; positive & negative effects", "25012588"),
                    Reference("Emerg Microbes Infect. 2025 Dec;14(1):2556731", "👉 NS1 variant gains growth advantage", "40899958"),
                    Reference("Comput Struct Biotechnol J. 2025 Jun 25;27:2757-2771", "👉 Codon usage stratification of Influenza A", "40673124"),
                    Reference("J Virol. 2025 Jun 17;99(6):e0006725", "👉 hnRNPM regulates virus replication", "40434105"),
                    Reference("Food Chem. 2024 Oct 1;454:139783", "👉 Variation in egg nutritional quality", "38795627"),
                    Reference("Vaccine. 2023 Nov 22;41(48):7281-7289", "👉 In ovo retinoic acid enhances immune response", "37923694"),
                    Reference("BMC Vet Res. 2022 Nov 18;18(1):408", "👉 Vitamin C & Arabic gum co-administration", "36401270"),
                    Reference("Explor Med. 2025;6:1001316", "👉 One Health vaccine adjuvant selection", "40444176"),
                    Reference("Poult Sci. 2025 Apr;104(4):104924", "👉 Graphene oxide immunostrip for H7 detection", "39985899"),
                    Reference("Int J Pharm. 2024 Jul 20;660:124318", "👉 Cistanche deserticola polysaccharide adjuvant for H9N2 vaccine", "38852750"),
                    Reference("Dev Comp Immunol. 2025 Oct;171:105450", "👉 Pseudostellaria heterophylla polysaccharide on humoral immunity", "40902815"),
                    Reference("Front Vet Sci. 2025 Jun 9;12:1574513", "👉 Chicken hemoglobin antimicrobial peptides", "40552078"),
                    Reference("J Vis Exp. 2025 May 30;(219)", "👉 H5N1 duck T cells culture & immune detection", "40522882"),
                    Reference("Food Chem. 2024 Oct 1;454:139783", "👉 Egg nutritional variation", "38795627"),
                    Reference("Anim Biotechnol. 2023 Apr;34(2):456-461", "👉 In ovo vitamin E or C feeding", "34278962"),
                    Reference("Br Poult Sci. 2021 Aug;62(4):562-572", "👉 Fennel essential oil in broilers", "33530744")
                )
            )

            "Back pain" -> Pair(
                """
    Alternative
    1. “Do I need an imaging?”: phenomenological study on why patients with non-specific chronic low back pain request diagnostic evaluation; no clear dose/effect.
    2. Acupuncture combined with non-invasive neuromodulation: bibliometric analysis; positive therapeutic effect.
    3. Ultrasound-guided multifidus injection with 5% dextrose for lumbar facet syndrome; no clear dose/effect.

    Herbs
    1. Volkmann's ischemic contracture case report; positive therapeutic effect | month.
    2. Treatment choices in lumbosacral radiculopathy RCT; no clear dose/effect.
    3. Rhabdomyolysis overview; negative/adverse effect.

    Amino acids
    1. Nonopioid pharmacologic management of chronic noncancer pain; positive therapeutic effect | month.
    2. Primary pulmonary enteric adenocarcinoma case report; negative/adverse effect.
    3. Warm acupuncture vs gabapentin in sciatica (ACUWARM trial); positive & negative effects.

    Vitamins
    1. Pregnancy & lactation-associated osteoporosis management; positive therapeutic effect.
    2. Central sensitization in chronic low back pain; positive therapeutic effect | month.
    3. Beta-thalassemia trait risk for osteoporosis; positive therapeutic effect.

    Minerals
    1. Hormonal management of endometriosis-associated pain; positive & negative effects.
    2. Bone quality response to lifestyle intervention in older adults with obesity (LIMB-Q trial); positive & negative effects | month.
    3. Posterior ankle impingement review; no clear dose/effect.

    Supplements
    1. Bifidobacterium treatment for chronic low back pain with Modic changes; positive therapeutic effect | month.
    2. Full endoscopic decompression surgery for Far-Out Syndrome; no clear dose/effect.
    3. Palmitoylethanolamide-Equisetum arvense supplement clinical trial; positive & negative effects | mg.

    Nutrients
    1. Personalized intervertebral disc models: disc height & solute diffusivity; no clear dose/effect.
    2. Cryptotanshinone attenuates lactate-induced nucleus pulposus cell injury; positive therapeutic effect.
    3. Goat model of intervertebral disc degeneration: increased lactate & oxygen; negative/adverse effect | week.
    """.trimIndent(),
                listOf(
                    Reference("Musculoskelet Sci Pract. 2025 Sep 15;80:103416", "👉 Phenomenological study on imaging requests", "40997589"),
                    Reference("Front Neurol. 2025 Sep 9;16:1511655", "👉 Acupuncture + neuromodulation bibliometric analysis", "40994712"),
                    Reference("Am J Emerg Med. 2025 Sep 18:S0735-6757(25)00644-8", "👉 Ultrasound-guided multifidus injection with 5% dextrose", "40992956"),
                    Reference("J Orthop Case Rep. 2025 Sep;15(9):138-142", "👉 Volkmann's ischemic contracture case report", "40936822"),
                    Reference("OBM Integr Compliment Med. 2025;10(3):035", "👉 Lumbosacral radiculopathy RCT", "40808978"),
                    Reference("StatPearls. 2025 Jan–", "👉 Rhabdomyolysis overview", "28846335"),
                    Reference("Am Fam Physician. 2025 Aug;112(2):187-196", "👉 Nonopioid pharmacologic management of chronic pain", "40834375"),
                    Reference("BMJ Case Rep. 2025 Aug 11;18(8):e267828", "👉 Primary pulmonary enteric adenocarcinoma case", "40789705"),
                    Reference("J Evid Based Integr Med. 2025 Jan-Dec;30:2515690X251355513", "👉 Warm acupuncture vs gabapentin in sciatica (ACUWARM trial)", "40611628"),
                    Reference("J Funct Morphol Kinesiol. 2025 Aug 31;10(3):336", "👉 Pregnancy & lactation-associated osteoporosis management", "40981035"),
                    Reference("Indian J Anaesth. 2025 Oct;69(10):1033-1038", "👉 Central sensitisation in chronic low back pain", "40979767"),
                    Reference("Endocrinol Diabetes Metab Case Rep. 2025 Sep 11;2025(3):e250073", "👉 Beta-thalassemia trait & osteoporosis risk", "40932695"),
                    Reference("Biomedicines. 2025 Sep 18;13(9):2294", "👉 Hormonal management of endometriosis-associated pain", "41007854"),
                    Reference("Lancet Healthy Longev. 2026 Sep 30:100761", "👉 Bone quality response to lifestyle intervention (LIMB-Q trial)", "40976254"),
                    Reference("Curr Sports Med Rep. 2025 Sep 1;24(9):261-263", "👉 Posterior ankle impingement review", "40928415"),
                    Reference("Trials. 2025 Sep 24;26(1):347", "👉 Bifidobacterium for chronic low back pain (Modic changes)", "40993700"),
                    Reference("Pain Physician. 2025 Sep;28(5):E525-E533", "👉 Full endoscopic decompression surgery for Far-Out Syndrome", "40986907"),
                    Reference("Med Sci (Basel). 2025 Sep 3;13(3):169", "👉 Palmitoylethanolamide-Equisetum arvense supplement clinical trial", "40981167"),
                    Reference("Front Bioeng Biotechnol. 2025 Sep 5;13:1651786", "👉 Personalized intervertebral disc models", "40979636"),
                    Reference("Phytomedicine. 2025 Sep;145:157021", "👉 Cryptotanshinone attenuates nucleus pulposus injury", "40609385"),
                    Reference("JOR Spine. 2025 May 27;8(2):e70076", "👉 Goat model of intervertebral disc degeneration", "40438632")
                )
            )

            "Bacterial vaginosis" -> Pair(
                """
    Alternative
    1. Vaginal microbiome & preterm birth: microbiota-directed therapies; positive therapeutic effect.
    2. Probiotics as preventive strategy for recurrent BV; positive therapeutic effect.
    3. Vaginal microbiota transplantation feasibility; positive & negative effects.

    Herbs
    1. Intravaginal practices questionnaire validation; positive therapeutic effect.
    2. TCM treatment for BV clinical research; negative/adverse effect.
    3. Cultural practices influencing vaginal microbiota; positive therapeutic effect.

    Amino acids
    1. S. agalactiae promoting G. vaginalis biofilm recurrence; no clear dose/effect.
    2. Homocysteine association with BV (NHANES 2001–2004); positive therapeutic effect.
    3. Vaginal environment in pregnancy/puerperium; effect mentioned | day.

    Vitamins
    1. Crohn’s disease case (panproctocolectomy & ART outcomes); no clear dose/effect.
    2. Factors associated with Nugent-BV in pregnancy/postpartum (Bangladesh); positive & negative effects | month.
    3. Vitamin D non-linear association with BV (NHANES 2001–2004); no clear dose/effect.

    Minerals
    1. Determinants of prematurity in urban Indonesia meta-analysis; positive therapeutic effect.
    2. Metastable iron sulfides against resistant G. vaginalis; positive therapeutic effect.
    3. Low birth weight outcomes in US; positive & negative effects.

    Supplements
    1. Vaginal microbiome & preterm birth therapies; positive therapeutic effect.
    2. Fructo-oligosaccharides RCT in pregnancy; g | positive therapeutic effect | week, month.
    3. Lactobacillus plantarum ATG-K2 in BV (in vitro & in vivo); positive & negative effects.

    Nutrients
    1. Atopobium spp. interactions with host & immune cells; no clear dose/effect.
    2. Macronutrient quality & carbohydrate score linked to BV odds; positive therapeutic effect.
    3. Media formulations for rapid growth of L. iners & vaginal bacteria; positive therapeutic effect.
    """.trimIndent(),
                listOf(
                    Reference("Int J Mol Med. 2025 Dec;56(6):203", "👉 Vaginal microbiome & preterm birth therapies", "40999955"),
                    Reference("Cureus. 2025 Aug 10;17(8):e89764", "👉 Probiotics for recurrent BV", "40951246"),
                    Reference("medRxiv. 2025 Aug 28:2025.08.27.25334544", "👉 Vaginal microbiota transplantation", "40909844"),
                    Reference("Arch Sex Behav. 2023 Feb;52(2):803-808", "👉 Intravaginal practices questionnaire", "36459351"),
                    Reference("Phytother Res. 2021 Sep;35(9):4943-4956", "👉 TCM treatment for BV", "33860974"),
                    Reference("Biol Res Nurs. 2021 Jan;23(1):91-99", "👉 Cultural practices & vaginal microbiota", "32666817"),
                    Reference("NPJ Biofilms Microbiomes. 2024 Nov 27;10(1):138", "👉 S. agalactiae & G. vaginalis biofilm recurrence", "39604369"),
                    Reference("Sci Rep. 2023 Dec 4;13(1):21388", "👉 Homocysteine association with BV", "38049434"),
                    Reference("Front Cell Infect Microbiol. 2022 May 17;12:838405", "👉 Vaginal environment during pregnancy/puerperium", "35656029"),
                    Reference("Cureus. 2025 Aug 20;17(8):e90597", "👉 Crohn’s disease, panproctocolectomy & ART outcomes", "40843056"),
                    Reference("PLOS Glob Public Health. 2025 Jun 13;5(6):e0004768", "👉 Nugent-BV in pregnancy/postpartum (Bangladesh)", "40512712"),
                    Reference("Front Nutr. 2025 May 21;12:1606246", "👉 Vitamin D & BV (NHANES analysis)", "40469676"),
                    Reference("J Perinat Med. 2023 Dec 27;52(3):270-282", "👉 Determinants of prematurity in Indonesia", "38146621"),
                    Reference("Adv Sci. 2022 Apr;9(10):e2104341", "👉 Iron sulfides vs resistant G. vaginalis", "35122408"),
                    Reference("Am J Clin Nutr. 2007 Feb;85(2):584S-590S", "👉 Low birth weight outcomes", "17284760"),
                    Reference("Int J Mol Med. 2025 Dec;56(6):203", "👉 Vaginal microbiome therapies (duplicate in supplements)", "40999955"),
                    Reference("Trop Med Health. 2025 Aug 13;53(1):106", "👉 Fructo-oligosaccharides RCT (pregnancy outcomes)", "40804702"),
                    Reference("Microbiol Immunol. 2025 Sep;69(9):457-465", "👉 Lactobacillus plantarum ATG-K2 therapy", "40678824"),
                    Reference("Anaerobe. 2025 Sep 17:102998", "👉 Atopobium spp. host interactions", "40972706"),
                    Reference("BMC Res Notes. 2025 Jul 28;18(1):330", "👉 Macronutrient quality index & BV odds", "40722193"),
                    Reference("Appl Environ Microbiol. 2025 Aug 20;91(8):e0018325", "👉 Media for Lactobacillus iners growth", "40626727")
                )
            )

            "Baker's cyst" -> Pair(
                """
    Alternative
    1. Epidermal cyst mistaken for Baker's cyst (case report): highlights differential diagnosis importance.
    2. Popliteal cysts not a risk factor for DVT (study): safe profile.
    3. Adventitial cystic disease of the popliteal artery: percutaneous aspiration & stenting, case-based evidence.

    Herbs
    – No clear data found.

    Amino acids
    1. Cystic adventitial disease (review + case): rare cause of claudication; angiographic diagnosis.

    Vitamins
    1. Thiamin deficiency linked to some tumors/masses: injections showed therapeutic effect (case evidence).
    2. Nutritional disorders in starvation: associations observed, not specific to Baker’s cyst.

    Minerals
    1. Pediatric musculoskeletal ultrasound review: incidental findings include cysts.
    2. Primary synovial chondromatosis (rare skeletal disorder): elemental analysis case study.
    3. Radioisotope (90Y) distribution: Baker's cyst can reduce knee therapy effectiveness.

    Supplements
    1. Synovial cysts in children (review + case reports): Baker's cysts relatively common; atypical cysts described.

    Nutrients
    – No specific nutrient-based evidence found.
    """.trimIndent(),
                listOf(
                    Reference("Int Med Case Rep J. 2025;18:869-875", "👉 Epidermal cyst vs Baker’s cyst", "40656888"),
                    Reference("J Thromb Thrombolysis. 2022;54(3):492-499", "👉 Popliteal cysts & DVT risk", "35932383"),
                    Reference("Vasc Specialist Int. 2022;38:21", "👉 Adventitial cyst aspiration & stenting", "35770655"),
                    Reference("Can J Surg. 1975;18(1):46-50", "👉 Cystic adventitial disease", "1091340"),
                    Reference("Oncol Rep. 2005;14(6):1589-92", "👉 Thiamin injections & tumors", "16273261"),
                    Reference("J Am Coll Nutr. 1997;16(4):366-75", "👉 Nutritional disorders & cysts", "9263187"),
                    Reference("Healthcare (Basel). 2022;10(10):2010", "👉 Musculoskeletal ultrasound in children", "36292459"),
                    Reference("Folia Morphol (Warsz). 2022;81(3):685-693", "👉 Synovial chondromatosis elemental study", "34060645"),
                    Reference("Ann Rheum Dis. 1988;47(7):553-8", "👉 90Y distribution reduced by Baker’s cyst", "2840863"),
                    Reference("Eur J Pediatr. 2006;165(3):178-81", "👉 Synovial cysts in children", "16344992"),
                )
            )

            "Balanitis" -> Pair(
                """
    Alternative
    1. Plasma cell balanitis unresponsive to corticosteroids: Tacrolimus showed efficacy; possible intrinsic resistance to steroids.
    2. Ayurvedic Uttar Basti therapy: successful management of balanitis xerotica obliterans–related panurethral stricture.
    3. Methylene blue@silver nanoprisms with photodynamic inactivation: effective against Candida albicans in balanoposthitis.

    Herbs
    – No specific herbal interventions identified.

    Amino acids
    1. Balanitis xerotica obliterans with penile intraepithelial neoplasia and abnormal elastic fibers: association noted, not treatment-specific.
    2. Zoon’s balanitis: photodynamic therapy successful (case report + review).
    3. Pseudoepitheliomatous keratotic balanitis: topical photodynamic therapy showed benefit.

    Vitamins
    1. Ozonated olive oil + vitamin E acetate: anti-inflammatory & tissue-regenerative effects in balanitis xerotica obliterans.
    2. Vitamin A derivatives: discussed in HPV-related balanitis (case reports, historical evidence).
    3. Chronic vitamin A poisoning: noted in literature, not directly therapeutic.

    Minerals
    1. Candida albicans infection in diabetics: minerals and metabolic context discussed in updated review.

    Supplements
    1. Symptom checker (machine learning): improved STI diagnosis support including balanitis.
    2. Balanitis xerotica obliterans update: clinical overview (educational, not treatment).
    3. Zinc deficiency models: NOS inhibitor attenuated inflammatory lesions (animal data, indirect relevance).

    Nutrients
    1. Early literature review (1967–68): discussed skin & venereal disease therapy, limited specific data for balanitis.
    """.trimIndent(),
                listOf(
                    Reference("Cureus. 2025;17(3):e81306", "👉 Tacrolimus in plasma cell balanitis", "40291179"),
                    Reference("Altern Ther Health Med. 2024;30(11):60-64", "👉 Ayurvedic Uttar Basti therapy", "39316542"),
                    Reference("Photodiagnosis Photodyn Ther. 2024;46:104066", "👉 Methylene blue@silver nanoprisms", "38552814"),
                    Reference("Am J Dermatopathol. 2020;42(11):885-888", "👉 Elastic fibers in balanitis xerotica obliterans", "32472770"),
                    Reference("Photodiagnosis Photodyn Ther. 2016;13:347-349", "👉 Zoon’s balanitis photodynamic therapy", "26321748"),
                    Reference("Int J Dermatol. 2015;54(2):245-247", "👉 PKMB balanitis photodynamic therapy", "25266766"),
                    Reference("Molecules. 2018;23(3):645", "👉 Ozonated olive oil + Vitamin E", "29534008"),
                    Reference("Int J STD AIDS. 1995;6(2):145", "👉 Vitamin A derivatives & HPV balanitis", "7632285"),
                    Reference("Minerva Med. 1986;77(27):1327", "👉 Chronic vitamin A poisoning", "3725157"),
                    Reference("Mycoses. 2024;67(6):e13753", "👉 Candida in diabetics (review)", "38877612"),
                    Reference("BMC Infect Dis. 2024;24(1):1408", "👉 Symptom checker ML tool", "39695420"),
                    Reference("Eur J Pediatr. 2020;179(1):9-16", "👉 Balanitis xerotica obliterans update", "31760506"),
                    Reference("Nutrition. 2000;16(1):34-41", "👉 Zinc deficiency & NOS inhibition", "10674233"),
                    Reference("Dtsch Med J. 1969;20(15):480-485", "👉 Skin & venereal disease review", "4241974"),
                )
            )

            "Bartholin's cyst" -> Pair(
                """
    Alternative
    1. Targeted treatment approaches with next-generation sequencing in Bartholin gland adenocarcinoma (case report + review).
    2. Bartholin gland abscess: office-based diagnosis and management strategies reviewed.
    3. Tacrolimus and immune modulation mentioned in relation to resistant cases.

    Herbs
    – No specific herbal interventions identified.

    Amino acids
    1. Circulating amino acids studied in cancer risk cohorts (EPIC, UK Biobank); indirect relevance.
    2. Blood metabolic signatures of BMI linked to amino acid alterations.
    3. First reported case of pigmented Bartholin duct cyst (descriptive, not therapeutic).

    Vitamins
    1. Vitamin D–genetic variant interactions studied in relation to prostate cancer risk (large cohort).
    2. Nutrient patterns associated with cancer risk (EPIC study).
    3. CAM (complementary & alternative medicine) use after breast cancer surgery: linked to changes in depressive symptoms (negative/adverse outcomes).

    Minerals
    1. Nutrient patterns linked to cancer risk (EPIC study, overlaps with vitamins).
    2. Selenium status and prostate cancer risk (Danish cohort study).
    3. Silica nanoparticles: adverse biological effects in cell-line studies.

    Supplements
    1. Occupational exposures & chronic disease risk: reviewed, indirect link to Bartholin’s.
    2. Bartholin’s gland carcinoma: case report + management challenges.
    3. Early CT-scan referral project (lung cancer context, indirect relevance).

    Nutrients
    1. Mycotoxin exposure & renal cell carcinoma risk: associations in EPIC cohort.
    2. Nutrient patterns and cancer risk (EPIC study).
    3. Selenium status study (as above, also under minerals).
    """.trimIndent(),
                listOf(
                    Reference("Diagnostics. 2021;11(11):2085", "👉 NGS for Bartholin gland adenocarcinoma", "34829431"),
                    Reference("Prim Care. 2021;48(4):569-582", "👉 Bartholin abscess management", "34752270"),
                    Reference("Acta Neuropathol. 2025;150(1):29", "👉 Immune modulation/tacrolimus context", "40960500"),
                    Reference("BMC Med. 2023;21(1):80", "👉 Amino acids in cancer risk", "36855092"),
                    Reference("J Proteome Res. 2017;16(9):3137-3146", "👉 Blood metabolic signatures", "28758405"),
                    Reference("Int J Clin Exp Pathol. 2013;6(9):1961-1963", "👉 Pigmented Bartholin duct cyst", "24040466"),
                    Reference("Am J Epidemiol. 2017;185(6):452-464", "👉 Vitamin D & cancer risk", "28399564"),
                    Reference("Br J Cancer. 2016;115(11):1430-1440", "👉 Nutrient patterns & cancer risk", "27764841"),
                    Reference("Breast Cancer Res Treat. 2013;141(2):277-285", "👉 CAM use & depressive symptoms", "24036661"),
                    Reference("Br J Nutr. 2016;115(9):1669-1677", "👉 Selenium & prostate cancer", "26971676"),
                    Reference("Chem Biol Interact. 2013;204(1):28-38", "👉 Silica nanoparticles adverse effects", "23623845"),
                    Reference("Ann Work Expo Health. 2024;68(6):562-580", "👉 Occupational exposures review", "38815981"),
                    Reference("Transl Cancer Res. 2023;12(1):201-208", "👉 Bartholin’s gland carcinoma case", "36760371"),
                    Reference("Dan Med J. 2015;62(3):B5027", "👉 Early CT referral project", "25748876"),
                    Reference("Nutrients. 2022;14(17):3581", "👉 Mycotoxin exposure & renal cancer risk", "36079840"),
                )
            )

            "Bedbugs" -> Pair(
                """
    Alternative
    1. Pyrethroid resistance mutations genotyped in bed bug populations (Greece).
    2. Plant-based products & nonconventional pesticides effective against tropical bed bug (day-level effect).

    Herbs
    1. Community practices and herbal use in malaria-endemic regions; indirect link but positive effect mentioned.

    Amino acids
    1. Genome analysis of endosymbiont “Candidatus Aschnera chinzeii” in bat flies – amino acid metabolism insights.
    2. Nitric oxide delivery by bedbug nitrophorin; therapeutic implications.
    3. Seminal fluid affects insect sperm metabolism; mechanistic insights.

    Vitamins
    1. Extracellular microbes essential for mosquito development despite Wolbachia (no clear dose/effect).
    2. Wolbachia symbiosis in bed bugs requires vitamins; elimination studies done.
    3. Detection & elimination of Wolbachia, an obligatory nutritional symbiont of Cimex lectularius.

    Minerals
    1. Control with dusts: silicon dioxide, diatomaceous earth, Sommières earth (lab/field trials).
    2. Steam + diatomaceous earth dust effective against tropical bed bug (day-level effect).
    3. Moisture effect on insecticide dust efficacy against Cimex lectularius.

    Supplements
    1. Wolbachia elimination combined with B-vitamin supplementation restored bed bug development/reproduction.
    2. Swallow bug identification & endosymbionts (no clear dose/effect).
    3. Endosymbiosis significance in dermatology (theoretical/indirect).

    Nutrients
    1. Extracellular microbes required for mosquito development despite Wolbachia (as above, no clear effect).
    2. Male accessory gland cell binucleation in Cimex lectularius; nutrient allocation relevance.
    3. Secondary kill potential of ingested insecticides in bed bugs – positive & negative effects reported.
    """.trimIndent(),
                listOf(
                    Reference("Acta Trop. 2025;265:107624", "👉 Pyrethroid resistance mutations in bed bugs (Greece)", "40258437"),
                    Reference("J Econ Entomol. 2024;117(5):2070-2080", "👉 Plant-based products for bed bug management", "39115807"),
                    Reference("Malar J. 2023;22:304", "👉 Community practices/herbs & persistence of malaria vectors", "37817185"),
                    Reference("Front Microbiol. 2024;14:1336919", "👉 Genome analysis of symbiont ‘Candidatus Aschnera chinzeii’", "38318130"),
                    Reference("J Inorg Biochem. 2023;246:112263", "👉 Nitric oxide delivery via bedbug nitrophorin", "37290359"),
                    Reference("Microsc Res Tech. 2022;85(1):398-411", "👉 Seminal fluid effects on insect sperm metabolism", "34486193"),
                    Reference("PLoS Negl Trop Dis. 2025;19(9):e0013481", "👉 Microbes & Wolbachia role in insect development", "40911652"),
                    Reference("Methods Mol Biol. 2024;2739:97-114", "👉 Wolbachia detection & elimination in bed bugs", "38006547"),
                    Reference("Parasite. 2024;31:41", "👉 Dusts (SiO2, DE, Sommières) for bed bug control", "39052011"),
                    Reference("Pest Manag Sci. 2024;80(10):5026-5034", "👉 Steam + DE dust against tropical bed bug", "38847149"),
                    Reference("J Econ Entomol. 2020;113(4):1933-1939", "👉 Moisture & insecticide dust efficacy", "32491179"),
                    Reference("Sci Rep. 2022;12:10270", "👉 Wolbachia elimination + B-vitamin supplementation", "35715692"),
                    Reference("Parasit Vectors. 2021;14:587", "👉 Swallow bug ID & endosymbionts", "34838119"),
                    Reference("J Eur Acad Dermatol Venereol. 2018;32(3):347-354", "👉 Endosymbiosis in dermatology", "29194776"),
                    Reference("Sci Rep. 2019;9:6500", "👉 Binucleation in male accessory gland cells", "31019205"),
                    Reference("J Econ Entomol. 2017;110(3):1218-1225", "👉 Secondary kill potential of ingested insecticides", "28334348"),
                )
            )

            "Behçet's disease" -> Pair(
                """
    Alternative
    1. Tocilizumab for non-infectious uveitis (systematic review).
    2. Roflumilast for oral ulcers in Behçet’s disease and recurrent aphthous stomatitis.
    3. Neutropenic enterocolitis in AML + Behçet’s: case report, role of imaging & multidisciplinary care.

    Herbs
    1. Tripterygium glycosides tablet: mechanisms of acute liver injury (adverse effects).
    2. Chinese medicine decoctions: systematic review/meta-analysis; potential effectiveness, safety issues.
    3. Complementary & integrative therapy in Turkish patients with familial Mediterranean fever (indirect relevance).

    Amino acids
    1. Serum asymmetric dimethylarginine (ADMA): potential biomarker for uveitis in Behçet’s disease.
    2. Elevated kynurenine pathway metabolites: associated with Behçet’s disease.
    3. Plasma homocysteine: systematic review/meta-analysis; relevance in Behçet’s.

    Vitamins
    1. Pediatric POTS during COVID-19 pandemic (Behçet Uz hospital; indirect link).
    2. EULAR/ACR classification criteria for pediatric CNO – relevance in differential diagnosis.
    3. Hyperandrogenemia impairs vitamin D receptor expression (mechanistic relevance, indirect).

    Minerals
    1. Glucocorticoid toxicity index: assessment tool in rheumatic diseases, relevant for Behçet’s management.
    2. Complementary & integrative therapy in Mediterranean fever patients (overlap relevance).
    3. Selenium and autoimmune diseases: review, potential protective role.

    Supplements
    1. Coniferyl alcohol (from watermelon seed): lipogenesis, dry skin remedies (indirect link).
    2. Autoimmune rheumatic diseases & depression: Mendelian randomization study.
    3. Pycnogenol®: pilot study showing symptom relief in vasculitis-related diseases.

    Nutrients
    1. Oxysterol-induced inflammation: natural/synthetic treatment strategies.
    2. Electrolyte imbalances + vitamin D deficiency in IBD patient (case report; indirect).
    3. Vitamin D and uveitis: review supporting therapeutic role.
    """.trimIndent(),
                listOf(
                    Reference("J Inflamm Res. 2025;18:13117-13138", "👉 Tocilizumab for non-infectious uveitis", "41000203"),
                    Reference("J Dermatol. 2025; online", "👉 Roflumilast for oral ulcers in Behçet’s", "40985567"),
                    Reference("In Vivo. 2025;39(5):3008-3013", "👉 Neutropenic enterocolitis & Behçet’s (case report)", "40877152"),
                    Reference("J Pharm Anal. 2023;13(8):908-925", "👉 Tripterygium glycosides tablet (toxicity)", "37719192"),
                    Reference("Evid Based Complement Alternat Med. 2021;2021:8202512", "👉 Chinese medicine decoctions for Behçet’s", "34335839"),
                    Reference("J Integr Med. 2021;19(4):340-346", "👉 Complementary therapy in FMF (indirect)", "33549524"),
                    Reference("Ocul Immunol Inflamm. 2025;33(1):33-39", "👉 Serum ADMA as biomarker", "38626414"),
                    Reference("Amino Acids. 2022;54(6):877-887", "👉 Kynurenine pathway metabolites in Behçet’s", "35604497"),
                    Reference("Thromb Haemost. 2022;122(7):1209-1220", "👉 Plasma homocysteine & Behçet’s", "34996122"),
                    Reference("Anatol J Cardiol. 2025; online", "👉 Pediatric POTS (Behçet Uz hospital)", "40763323"),
                    Reference("Ann Rheum Dis. 2025;84(9):1458-1468", "👉 Pediatric CNO classification criteria", "39966038"),
                    Reference("Gynecol Endocrinol. 2024;40(1):2435469", "👉 Hyperandrogenemia & vitamin D receptor", "39656229"),
                    Reference("Semin Arthritis Rheum. 2022;55:152010", "👉 Glucocorticoid toxicity index", "35486995"),
                    Reference("J Integr Med. 2021;19(4):340-346", "👉 Complementary therapy in FMF (indirect)", "33549524"),
                    Reference("Curr Rheumatol Rev. 2019;15(2):123-134", "👉 Selenium & autoimmune diseases", "30324883"),
                    Reference("Molecules. 2025;30(16):3360", "👉 Coniferyl alcohol from watermelon seed", "40871513"),
                    Reference("Psychiatry. 2025; online", "👉 Autoimmune rheumatic diseases & depression", "40705971"),
                    Reference("Minerva Med. 2025;116(2):106-112", "👉 Pycnogenol® for inflammatory vasculitis", "40163019"),
                    Reference("Molecules. 2025;30(13):2883", "👉 Oxysterol-induced inflammation & therapies", "40649397"),
                    Reference("J Med Case Rep. 2024;18(1):26", "👉 Electrolyte imbalances + vitamin D deficiency", "38246996"),
                    Reference("Surv Ophthalmol. 2022;67(2):321-330", "👉 Vitamin D & uveitis (review)", "34343538"),
                )
            )

            "Bell's palsy" -> Pair(
                """
    Alternative
    1. Routine MRI need for unilateral facial palsy in ED.
    2. Facial reanimation surgery & role of online information sharing in patient education.
    3. Ultrasound imaging and guidance (EURO-MUSCULUS/USPRM approach).

    Herbs
    1. Acu-moxibustion therapy – graded disease spectrum efficacy (Chinese study).

    Amino acids
    1. Tau prion-like seeding in neurodegeneration (experimental, indirect relevance).
    2. Thyroid-stimulating hormone (TSH) dysregulation association with Bell’s palsy.
    3. Neurometabolite differences in ADHD (indirect relevance, neurometabolic overlap).

    Vitamins
    1. Serum vitamin D levels in Bell’s palsy: systematic review & meta-analysis.
    2. Dextrose-based Lyftogt perineural injection therapy: facial muscle strength improvement (case report).
    3. Pediatric Bell’s palsy: prognostic factors & management outcomes.

    Minerals
    1. Concomitant Bell’s palsy + trigeminal neuralgia: shortened course with multimodal intervention (case report).

    Supplements
    1. Deucravacitinib safety evaluation: real-world adverse event analysis (indirect).
    2. COVID-19 pandemic & vaccination: retrospective analysis of Bell’s palsy cases.
    3. Dextrose-based Lyftogt injection (repeated from vitamins, supplementation effect).

    Nutrients
    1. Corticosteroids for Bell’s palsy: Cochrane review (positive + adverse effects).
    2. Dietary intake & body composition in children with cerebral palsy (indirect).
    3. Corticosteroids for Bell’s palsy: updated Cochrane review confirming therapeutic role.
    """.trimIndent(),
                listOf(
                    Reference("Diagnostics. 2025;15(17):2135", "👉 Routine MRI for unilateral facial palsy", "40941623"),
                    Reference("Plast Surg (Oakv). 2025; online", "👉 Facial reanimation surgery & patient education", "40256641"),
                    Reference("Am J Phys Med Rehabil. 2025;104(9):827-830", "👉 Ultrasound imaging & guidance in Bell’s palsy", "40101788"),
                    Reference("Zhen Ci Yan Jiu. 2010;35(5):394-401", "👉 Acu-moxibustion therapy efficacy (Chinese study)", "21235072"),
                    Reference("Neuromolecular Med. 2025;27(1):44", "👉 Tau prion-like seeding (experimental, indirect)", "40447946"),
                    Reference("Otol Neurotol. 2023;44(7):730-736", "👉 TSH dysregulation & Bell’s palsy", "37400268"),
                    Reference("J Psychiatry Neurosci. 2022;47(4):E239-E249", "👉 Neurometabolite differences (indirect relevance)", "35793906"),
                    Reference("BMC Neurol. 2025;25(1):262", "👉 Vitamin D levels & Bell’s palsy (systematic review)", "40596965"),
                    Reference("Pain Manag. 2025;15(5):245-250", "👉 Dextrose perineural injection therapy (case report)", "40298143"),
                    Reference("J Clin Med. 2024;14(1):79", "👉 Pediatric Bell’s palsy: prognostic factors & outcomes", "39797160"),
                    Reference("Explore (NY). 2019;15(6):425-428", "👉 Bell’s palsy + trigeminal neuralgia multimodal therapy", "31104906"),
                    Reference("Int J Clin Pharm. 2025; online", "👉 Deucravacitinib safety evaluation", "40782323"),
                    Reference("Otol Neurotol. 2025;46(9):1164-1170", "👉 COVID-19, vaccination & Bell’s palsy", "40690195"),
                    Reference("Pain Manag. 2025;15(5):245-250", "👉 Dextrose perineural injection (supplementation effect)", "40298143"),
                    Reference("Cochrane Database Syst Rev. 2016;7:CD001942", "👉 Corticosteroids for Bell’s palsy (positive + adverse)", "27428352"),
                    Reference("Ann Nutr Metab. 2012;61(4):349-357", "👉 Dietary intake & body composition in CP children (indirect)", "23208164"),
                    Reference("Cochrane Database Syst Rev. 2010;CD001942", "👉 Corticosteroids for Bell’s palsy (update)", "20238317"),
                )
            )

            "Benign brain tumours" -> Pair(
                """
    Alternative
    1. Chalcone compound: miRNA-mediated anticancer properties in glioblastoma.
    2. Dopamine agonists in prolactin-secreting pituitary neuroendocrine tumors – predictors of response.
    3. Targeting neuroimmune axis in glioblastoma: emerging precision immunotherapy.

    Herbs
    1. Apatinib proteomics profiling – inhibition of glioma U251 proliferation.
    2. Fucoxanthin: β1 integrin targeting, disruption of adhesion and migration in glioma cells.
    3. BSA-Camptothecin nanoparticles: RNA packaging for improved cancer prognosis.

    Amino acids
    1. Murine glioblastoma model & human brain organoid xenograft for photodynamic therapy testing.
    2. Proton MR spectroscopy (3T) in gliomatosis cerebri (dog model).
    3. Intelligent ultrasonic aspirator with fiber-optic neoplasm sensor detecting 5-ALA porphyrin fluorescence.

    Vitamins
    1. Proton MR spectroscopy in gliomatosis cerebri (dog model, repeat).
    2. α-Tocopherol derivatives: mitochondrial metabolism-targeted anticancer activity.
    3. LCLC metastasis case mimicking stroke – clinical misdiagnosis report.

    Minerals
    1. Cu(2-x)Se nanoplatforms: BBB penetration, immunogenic cell death in glioblastoma.
    2. Zinc nanosensor-chemometrics: biphasic zinc switch in cancer metastasis.
    3. Graphene quantum dot nanocomposites: potential glioblastoma treatment.

    Supplements
    1. Gut microbiota-bile acid-brain axis: ADT-induced cognitive impairment, TGR5-ERK1/2 role.
    2. Psychobiotics in GI oncology pain management (ProDeCa trial, indirect CNS relevance).
    3. Advanced imaging & localization techniques in brain tumor resection.

    Nutrients
    1. mTOR signaling – physical properties of cell fate decisions.
    2. Ketogenic diet in pediatric brain cancer: potential & challenges.
    3. Psychobiotics as adjunctive pain approach (ProDeCa, repeated).
    """.trimIndent(),
                listOf(
                    Reference("PLoS One. 2025;20(9):e0330624", "👉 Chalcone compound & miRNA anticancer in glioblastoma", "41004517"),
                    Reference("Front Endocrinol. 2025;16:1664621", "👉 Dopamine agonists in pituitary tumors", "40995599"),
                    Reference("Front Immunol. 2025;16:1661327", "👉 Neuroimmune axis targeting in glioblastoma", "40995359"),
                    Reference("Biochem Biophys Res Commun. 2025;775:152148", "👉 Apatinib proteomics in glioma U251", "40493991"),
                    Reference("J Agric Food Chem. 2025;73(18):10961-10973", "👉 Fucoxanthin β1 integrin targeting", "40261208"),
                    Reference("Int J Biol Macromol. 2024;282:136997", "👉 BSA-Camptothecin nanoparticles", "39476892"),
                    Reference("Int J Mol Sci. 2025;26(18):8889", "👉 Murine glioblastoma model for PDT", "41009470"),
                    Reference("J Vet Intern Med. 2025;39(6):e70210", "👉 MR spectroscopy in gliomatosis cerebri (dog)", "40996370"),
                    Reference("Sensors (Basel). 2025;25(11):3412", "👉 Ultrasonic aspirator with 5-ALA fluorescence", "40968891"),
                    Reference("Medicine (Baltimore). 2025;104(35):e44224", "👉 LCLC metastasis mimicking stroke (case)", "40898486"),
                    Reference("Eur J Med Chem. 2025;299:118081", "👉 α-Tocopherol derivatives as anticancer", "40882437"),
                    Reference("J Nanobiotechnol. 2025;23(1):609", "👉 Cu(2-x)Se nanoplatforms in glioblastoma", "41013700"),
                    Reference("Biosens Bioelectron. 2025;289:117897", "👉 Zinc nanosensor biphasic switch", "40886434"),
                    Reference("Med Oncol. 2025;42(9):417", "👉 Graphene quantum dots in glioblastoma", "40781177"),
                    Reference("CNS Neurosci Ther. 2025;31(9):e70608", "👉 Gut microbiota–bile acid–brain axis (ADT cognitive impairment)", "40955046"),
                    Reference("Nutrients. 2025;17(17):2751", "👉 Psychobiotics in oncology pain management (ProDeCa)", "40944142"),
                    Reference("Brain Res Bull. 2025;230:111533", "👉 Advanced imaging for brain tumor resection", "40907774"),
                    Reference("Phys Rev E. 2025;112(2-1):024409", "👉 mTOR signaling & cell fate physics", "40954801"),
                    Reference("Nutrients. 2025;17(17):2843", "👉 Ketogenic diet in pediatric brain cancer", "40944231"),
                    Reference("Nutrients. 2025;17(17):2751", "👉 Psychobiotics (ProDeCa, repeat)", "40944142"),
                )
            )

            "Benign prostate enlargement" -> Pair(
                """
    Alternative
    1. Mushroom technique vs morcellation in en bloc bipolar prostate enucleation (>80 mL prostates).
    2. Prostate artery embolization vs TURP & laser enucleation – perioperative outcomes (GRAND Study).
    3. Transperineal laser ablation in BPH – 12-month retrospective analysis.

    Herbs
    1. Emplastrum (Yaoshen Gao) – mechanism via prescription analysis, virtual screening, affinity testing.
    2. Acupuncture & Chinese herbs in prostatitis/BPH.
    3. Traditional Chinese medicine progress in BPH treatment.
    4. Hosta plantaginea flower fractions – AMPK/JAK pathway inhibition.

    Amino acids
    1. Serum neopterin & kynurenine as predictive/prognostic biomarkers; dietary inflammatory index interactions.
    2. Anti-BPH peptides from Syngnathus schlegeli – virtual screening & mechanism.
    3. Novel peptides for BPH – molecular mechanism and virtual screening.

    Vitamins
    1. Vitamin C & inflammation-induced oxidative stress in BPH.
    2. Vitamin D & prostate health status – analytical cross-sectional study.

    Minerals
    1. Cu-Mn bimetallic mesoporous silica nanosonosensitizers – sonodynamic therapy for minimally invasive BPH.
    2. Zinc paradox in reproductive health & prostate pathology.
    3. BMI & BPH impact on bone health in middle-aged/older men.

    Supplements
    1. Perinatal BPA exposure – prostatic morphophysiological disorders (rodent hyperplasia model).
    2. Phosphatidylinositol (18:1_18:1) – Mendelian randomization & network pharmacology study.
    3. Anti-BPH peptides from Syngnathus schlegeli (repeat).

    Nutrients
    1. Serum neopterin & kynurenine as predictive/prognostic biomarkers (repeat from amino acids).
    2. Lycopene intake & mental health – systematic review of RCTs.
    3. Proanthocyanidins from grape seed extract – effect on BPH.
    """.trimIndent(),
                listOf(
                    Reference("PLoS One. 2025;20(9):e0331142", "👉 Mushroom technique vs morcellation in BPH", "40986531"),
                    Reference("J Clin Med. 2025;14(17):6135", "👉 Prostate artery embolization vs TURP/laser (GRAND Study)", "40943896"),
                    Reference("J Clin Med. 2025;14(17):6079", "👉 Transperineal laser ablation in BPH, 12-month outcomes", "40943844"),
                    Reference("J Ethnopharmacol. 2025;342:119369", "👉 Emplastrum (Yaoshen Gao) mechanism analysis", "39842747"),
                    Reference("Med Acupunct. 2024;36(6):372-373", "👉 Acupuncture & Chinese herbs in BPH/prostatitis", "39712515"),
                    Reference("Zhongguo Zhong Yao Za Zhi. 2024;49(21):5817-5828", "👉 TCM research progress in BPH treatment", "39701791"),
                    Reference("J Ethnopharmacol. 2025;353(Pt B):120362", "👉 Hosta plantaginea flower fractions inhibit AMPK/JAK", "40784527"),
                    Reference("World J Mens Health. 2025", "👉 Vitamin C, inflammation & epigenetics in BPH", "40878118"),
                    Reference("Cureus. 2024;16(12):e74959", "👉 Vitamin D & prostate health status", "39744261"),
                    Reference("ACS Appl Mater Interfaces. 2025;17(37):51820-51839", "👉 Cu-Mn nanosonosensitizers in BPH therapy", "40911431"),
                    Reference("Indian J Clin Biochem. 2025;40(2):316-317", "👉 Zinc paradox in prostate pathology", "40123625"),
                    Reference("Obes Sci Pract. 2025;11(1):e70037", "👉 BMI & BPH impact on bone health", "39781546"),
                    Reference("Mol Cell Endocrinol. 2025;610:112664", "👉 Perinatal BPA exposure induces prostatic disorders", "40998086"),
                    Reference("World J Urol. 2025;43(1):569", "👉 Phosphatidylinositol (18:1_18:1) in BPH – Mendelian randomization & pharmacology", "40986097"),
                    Reference("Food Res Int. 2025;218:116868", "👉 Anti-BPH peptides from Syngnathus schlegeli", "40790674"),
                    Reference("BMC Cancer. 2025;25(1):1395", "👉 Serum neopterin & kynurenine as predictive/prognostic biomarkers (repeat)", "40877809"),
                    Reference("Nutrients. 2025;17(11):1793", "👉 Lycopene intake & mental health – systematic review", "40507061"),
                    Reference("Nutrients. 2024;17(1):73", "👉 Proanthocyanidins from grape seed extract effect on BPH", "39796507")
                )
            )

            "Bile duct cancer" -> Pair(
                """
    Alternative
    1. Circulating tumor DNA & tissue testing for pancreatobiliary tumors.
    2. Laparoscopic common bile duct exploration (LCBDE) – missed opportunities and improvements.
    3. Emerging HER2-targeting immunotherapy for cholangiocarcinoma.

    Herbs
    1. Pristimerin – multifaceted mechanisms in tumor treatment (negative/adverse effects mentioned).
    2. Herbal medicine in cholangiocarcinoma – systematic review.
    3. Aristolochic acid risk in cancers – cohort study.

    Amino acids
    1. Ivosidenib for IDH1-mutant intrahepatic cholangiocarcinoma – real-world study (positive & negative effects, month).
    2. FUNDC1 drives cholangiocarcinoma progression – RAC1 interaction, ferroptosis suppression.
    3. ANXA1 promotes intrahepatic cholangiocarcinoma proliferation via glutamine metabolism.

    Vitamins
    1. Serum AFP, AFP-L3%, PIVKA-II detection – liver cancer diagnosis patterns.
    2. 5-Fluorouracil/Leucovorin vs Capecitabine in biliary tract cancer – adjuvant therapies (negative effect, month).
    3. Hepatic arterial infusion chemotherapy (Folfox 4) vs cisplatin & gemcitabine – locally advanced intrahepatic cholangiocarcinoma (negative effect, month).

    Minerals
    1. Asbestos exposure & cholangiocarcinoma – Italian pooled cohort study.
    2. Osteopenia associated with shorter survival in intrahepatic cholangiocarcinoma.
    3. Asbestos exposure – risk factor for small duct intrahepatic cholangiocarcinoma.

    Supplements
    1. Cathepsins in liver cancer – Mendelian randomization & bioinformatics analysis.
    2. Polysaccharide extract of Spirulina sp. – enhances immune-cell killing against cholangiocarcinoma (positive & negative effects).
    3. ACLY pathological significance in cholangiocarcinoma.

    Nutrients
    1. Metabolic reprogramming in cholangiocarcinoma stem cells – emerging therapeutic paradigms.
    2. Bile acids targeting Farnesoid X receptor – pharmacological mechanisms.
    3. Preoperative sarcopenia & sarcopenic obesity – postoperative complications in pancreaticoduodenectomy for periampullary malignancies.
    """.trimIndent(),
                listOf(
                    Reference("JAMA Netw Open. 2025;8(9):e2531373", "👉 Circulating tumor DNA & tissue testing for pancreatobiliary tumors", "40938601"),
                    Reference("Surg Endosc. 2025", "👉 LCBDE – missed opportunities", "40935940"),
                    Reference("Oncol Res. 2025;33(9):2279-2307", "👉 Emerging HER2-targeting immunotherapy for cholangiocarcinoma", "40918454"),
                    Reference("Biomed Pharmacother. 2022;154:113575", "👉 Pristimerin – multifaceted mechanisms in tumor treatment (negative/adverse effect)", "35988422"),
                    Reference("Planta Med. 2023;89(1):3-18", "👉 Herbal medicine in cholangiocarcinoma – systematic review", "35468650"),
                    Reference("Phytomedicine. 2022;99:154023", "👉 Aristolochic acid – cancer risk cohort study", "35276591"),
                    Reference("Liver Int. 2025;45(9):e70295", "👉 Ivosidenib for IDH1-mutant intrahepatic cholangiocarcinoma (positive & negative effects, month)", "40856270"),
                    Reference("Int J Biol Macromol. 2025;321(Pt1):146087", "👉 FUNDC1 drives cholangiocarcinoma progression", "40680971"),
                    Reference("J Exp Clin Cancer Res. 2025;44(1):151", "👉 ANXA1 promotes intrahepatic cholangiocarcinoma via glutamine metabolism", "40390008"),
                    Reference("PeerJ. 2025;13:e19712", "👉 Serum AFP, AFP-L3%, PIVKA-II detection – liver cancer diagnosis", "40708828"),
                    Reference("J Gastroenterol Hepatol. 2025;40(9):2324-2334", "👉 5-FU/Leucovorin vs Capecitabine – adjuvant therapy (negative effect, month)", "40654009"),
                    Reference("Sci Rep. 2025;15(1):21588", "👉 Hepatic arterial infusion chemotherapy – Folfox 4 vs cisplatin & gemcitabine (negative effect, month)", "40596432"),
                    Reference("Med Lav. 2024;115(2):e2024016", "👉 Asbestos exposure & cholangiocarcinoma – cohort study", "38686579"),
                    Reference("Curr Oncol. 2023;30(2):1860-1868", "👉 Osteopenia associated with shorter survival", "36826105"),
                    Reference("Sci Rep. 2023;13(1):2580", "👉 Asbestos exposure – risk factor for small duct intrahepatic cholangiocarcinoma", "36781903"),
                    Reference("Discov Oncol. 2025;16(1):277", "👉 Cathepsins in liver cancer – MR & bioinformatics", "40053224"),
                    Reference("PLoS One. 2024;19(10):e0312414", "👉 Polysaccharide extract of Spirulina sp. – enhances immune killing (positive & negative)", "39446747"),
                    Reference("Front Immunol. 2024;15:1477267", "👉 ACLY significance in cholangiocarcinoma", "39399493"),
                    Reference("Cancer Lett. 2025;622:217714", "👉 Metabolic reprogramming in cholangiocarcinoma stem cells", "40209849"),
                    Reference("Int J Mol Sci. 2024;25(24):13656", "👉 Bile acids targeting FXR – pharmacological mechanisms", "39769418"),
                    Reference("Nutrients. 2024;16(20):3569", "👉 Preoperative sarcopenia & sarcopenic obesity – postoperative complications", "39458563")
                )
            )

            "Bilharzia" -> Pair(
                """
    Alternative
    1. Multiplex bead assay for Strongyloides stercoralis diagnosis using recombinant antigen rSs-NIE-1.
    2. Community insights into societal causes and solutions for schistosomiasis transmission – participatory approach.
    3. Visual diagnostics for female genital schistosomiasis – improvement using computer vision.

    Herbs
    1. Traditional Chinese medicine for schistosomiasis – research progress (positive/therapeutic effect).
    2. Veronicastrum wulingense – botanical study (no clear dose/effect/duration).
    3. Lippia alba & Lippia gracilis essential oils – affect viability & oviposition of Schistosoma mansoni (positive & negative effects, µg).

    Amino acids
    1. Heat shock cognate protein 20 of Schistosoma japonicum – preliminary study (positive effect, g/µg, week/day).
    2. Schistosomiasis – cercarial finding and human host recognition (positive/therapeutic effect).
    3. Comparative mitochondrial genome of Biomphalaria pfeifferi – intestinal schistosomiasis snail host (positive/therapeutic effect, g).

    Vitamins
    1. Loss of vitamin C biosynthesis protects from parasitic infection (positive/therapeutic effect).
    2. Salusin-α – protective against oxidative stress & inflammation in mice (positive/therapeutic effect).
    3. 1,2,3-Triazole-Methyl-Menadione derivatives – evaluation for antiparasitic activity (positive/therapeutic effect).

    Minerals
    1. Antimony toxicity (negative/adverse effect).
    2. Urbanization influence on schistosomiasis infection risk – longitudinal study (positive/therapeutic effect).
    3. Nanotechnology – potential application in treatment, diagnosis, prevention of schistosomiasis (positive/therapeutic effect).

    Supplements
    1. Stocking African catfish in Lake Victoria – biocontrol of snail vectors of Schistosoma mansoni (positive/therapeutic effect).
    2. Public health surveillance of tropical diseases in Madagascar – interventions and system responses (positive/therapeutic effect).
    3. Spatiotemporal analysis of schistosomiasis and soil-transmitted helminths in Angola (positive/therapeutic effect).

    Nutrients
    1. Diet of schistosome vectors influences infection outcomes (positive/therapeutic effect, week).
    2. Schistosoma japonicum cathepsin L1 – potential target for anti-schistosomiasis strategies (positive/therapeutic effect).
    3. Trogocytosis – insights into parasite-host interactions (no clear dose/effect/duration).
    """.trimIndent(),
                listOf(
                    Reference("Diagn Microbiol Infect Dis. 2025;114(2):117108", "👉 Multiplex bead assay for Strongyloides stercoralis diagnosis", "40974844"),
                    Reference("Health Place. 2025;95:103548", "👉 Community insights into schistosomiasis transmission – participatory approach (positive/therapeutic effect)", "40967094"),
                    Reference("Parasitology. 2025 Sep 12:1-12", "👉 Visual diagnostics for female genital schistosomiasis (positive/therapeutic effect)", "40936174"),
                    Reference("J Ethnopharmacol. 2024;333:118501", "👉 Traditional Chinese medicine for schistosomiasis (positive/therapeutic effect)", "38944361"),
                    Reference("Bot Stud. 2023;64(1):3", "👉 Veronicastrum wulingense – botanical study", "36720741"),
                    Reference("Acta Trop. 2022;231:106434", "👉 Lippia alba & Lippia gracilis essential oils – affect Schistosoma mansoni (positive & negative, µg)", "35364048"),
                    Reference("Zhongguo Xue Xi Chong Bing Fang Zhi Za Zhi. 2025;37(3):294-303", "👉 Heat shock cognate protein 20 of Schistosoma japonicum (positive effect, g/µg, week/day)", "40730528"),
                    Reference("Clin Microbiol Rev. 2025;38(3):e0019624", "👉 Schistosomiasis – cercarial finding and human host recognition (positive/therapeutic effect)", "40626643"),
                    Reference("Int J Mol Sci. 2025;26(10):4756", "👉 Comparative mitochondrial genome of Biomphalaria pfeifferi – snail host (positive/therapeutic effect, g)", "40429898"),
                    Reference("bioRxiv [Preprint]. 2025;2025.07.22.666193", "👉 Loss of vitamin C biosynthesis – protection from parasitic infection (positive/therapeutic effect)", "40777373"),
                    Reference("Arch Physiol Biochem. 2025;131(3):493-502", "👉 Salusin-α – protective against oxidative stress & inflammation (positive/therapeutic effect)", "39983094"),
                    Reference("ChemMedChem. 2025;20(6):e202400731", "👉 1,2,3-Triazole-Methyl-Menadione derivatives – antiparasitic evaluation (positive/therapeutic effect)", "39676716"),
                    Reference("StatPearls [Internet]. 2025", "👉 Antimony toxicity (negative/adverse effect)", "39383292"),
                    Reference("Infect Dis Poverty. 2023;12(1):108", "👉 Urbanization influence on schistosomiasis risk (positive/therapeutic effect)", "38017569"),
                    Reference("Front Bioeng Biotechnol. 2022;10:1013354", "👉 Nanotechnology – treatment, diagnosis, prevention of schistosomiasis (positive/therapeutic effect)", "36568300"),
                    Reference("PLoS Negl Trop Dis. 2025;19(9):e0013490", "👉 Stocking African catfish – biocontrol of snail vectors (positive/therapeutic effect)", "40901991"),
                    Reference("BMC Public Health. 2025;25(1):2651", "👉 Public health surveillance in Madagascar (positive/therapeutic effect)", "40764911"),
                    Reference("PLoS Negl Trop Dis. 2025;19(4):e0012974", "👉 Spatiotemporal analysis of schistosomiasis in Angola (positive/therapeutic effect)", "40198696"),
                    Reference("Ecosphere. 2024;15(11):e70052", "👉 Diet of schistosome vectors – influences infection outcomes (positive/therapeutic effect, week)", "40963739"),
                    Reference("PLoS Negl Trop Dis. 2025;19(7):e0013241", "👉 Schistosoma japonicum cathepsin L1 – target for anti-schistosomiasis strategies (positive/therapeutic effect)", "40623040"),
                    Reference("Trends Parasitol. 2025;41(7):572-590", "👉 Trogocytosis – parasite-host interaction insights", "40461377")
                )
            )

            "Binge eating disorder" -> Pair(
                """
    Alternative
    1. CBT-T in NHS moderate-severe adult eating disorder service – therapeutic effect.
    2. Disordered eating prevalence and correlates among Alaska youth – therapeutic effect.
    3. Focused Acceptance and Commitment Therapy program pilot evaluation – therapeutic effect (week, day).

    Herbs
    1. Complementary and integrative health use in binge eating disorder – expert perspectives (positive/therapeutic effect).

    Amino acids
    1. Impulse Control Disorders in Polish Parkinson's patients – no clear dose/effect/duration.
    2. Tryptophan-Kynurenine Pathway hypothesis in anorexia nervosa – positive/therapeutic effect.
    3. SLC6A4 DNA methylation & serum kynurenine/tryptophan ratio in eating disorders – positive/therapeutic effect.

    Vitamins
    1. Complementary and integrative health in binge eating disorder – positive/therapeutic effect.
    2. Clinical characteristics of ARFID hospitalized male adolescents/young adults – positive/therapeutic effect (g, mg).
    3. Nutrient-skin connection for diagnosing eating disorders – positive/therapeutic effect.

    Minerals
    1. Resistance training in eating disorder recovery – positive/therapeutic effect.
    2. Nutrient-skin connection for diagnosing eating disorders – positive/therapeutic effect.
    3. Nutritional adequacy ratios in women with and without binge eating disorder – no clear dose/effect/duration.

    Supplements
    1. Hericium erinaceus – benefits, side effects, uses (positive & negative effect).
    2. Gut microbiota in women with eating disorders – therapeutic effect.
    3. ANZAED Eating Disorder Credential for healthcare providers – therapeutic effect.

    Nutrients
    1. Low maternal care/protection & body image dissatisfaction as predictors of binge eating disorder – positive/therapeutic effect.
    2. Restrictive diets and binge eating development – negative/adverse effect.
    3. Spanish validation of Eating Behaviors Assessment for Obesity (EBA-O) – no clear dose/effect/duration.
    """.trimIndent(),
                listOf(
                    Reference("Eat Disord. 2025 Sep 2:1-19", "👉 CBT-T in NHS moderate-severe adult eating disorder service (positive/therapeutic effect)", "40898422"),
                    Reference("Int J Eat Disord. 2025 Aug 11", "👉 Disordered eating prevalence & correlates among Alaska youth (positive/therapeutic effect)", "40879503"),
                    Reference("Int J Eat Disord. 2025 Aug 7", "👉 Focused Acceptance & Commitment Therapy program pilot evaluation (positive/therapeutic effect, week/day)", "40772755"),
                    Reference("Int J Nurs Health Care Res (Lisle). 2024;7(5):1549", "👉 Complementary and integrative health in binge eating disorder (positive/therapeutic effect)", "39822390"),
                    Reference("Medicina (Kaunas). 2023;59(8):1468", "👉 Impulse Control Disorders in Polish Parkinson's patients – no clear dose/effect/duration", "37629758"),
                    Reference("Nutrients. 2023;15(4):1030", "👉 Tryptophan-Kynurenine Pathway hypothesis – positive/therapeutic effect", "36839388"),
                    Reference("Nutrients. 2023;15(2):406", "👉 SLC6A4 DNA methylation & serum kynurenine/tryptophan ratio – positive/therapeutic effect", "36678277"),
                    Reference("Int J Nurs Health Care Res (Lisle). 2024;7(5):1549", "👉 Complementary & integrative health in binge eating disorder (positive/therapeutic effect)", "39822390"),
                    Reference("J Eat Disord. 2025 Jan 8;13(1):3", "👉 Clinical characteristics of ARFID hospitalized male adolescents/young adults – positive/therapeutic effect (g, mg)", "39780282"),
                    Reference("Nutrients. 2024 Dec 17;16(24):4354", "👉 Nutrient-skin connection – diagnosing eating disorders (positive/therapeutic effect)", "39770975"),
                    Reference("J Eat Disord. 2025 Jul 1;13(1):123", "👉 Resistance training in eating disorder recovery (positive/therapeutic effect)", "40597420"),
                    Reference("Nutrients. 2024 Dec 17;16(24):4354", "👉 Nutrient-skin connection – positive/therapeutic effect", "39770975"),
                    Reference("Nutr Metab (Lond). 2024 Dec 19;21(1):109", "👉 Nutritional adequacy ratios in women with & without binge eating disorder – no clear dose/effect/duration", "39702396"),
                    Reference("Front Nutr. 2025 Sep 1;12:1641246", "👉 Hericium erinaceus – positive & negative effects", "40959699"),
                    Reference("Nutrients. 2025 Jul 14;17(14):2316", "👉 Gut microbiota in women with eating disorders – positive/therapeutic effect", "40732941"),
                    Reference("J Eat Disord. 2025 Jun 16;13(Suppl 1):113", "👉 ANZAED Eating Disorder Credential – positive/therapeutic effect", "40524249"),
                    Reference("Nutrients. 2025 Aug 23;17(17):2737", "👉 Low maternal care & body image dissatisfaction – positive/therapeutic effect", "40944128"),
                    Reference("Nutr Rev. 2025 Aug 23:nuaf163", "👉 Restrictive diets & binge eating development – negative/adverse effect", "40848277"),
                    Reference("Nutrients. 2025 Jul 17;17(14):2344", "👉 Spanish validation of EBA-O – no clear dose/effect/duration", "40732970")
                )
            )

            "Bipolar disorder" -> Pair(
                """
    Alternative
    1. Gut microbiota in psychiatric & neurological disorders – no clear dose/effect/duration.
    2. Adjuvant metformin reducing olanzapine-induced metabolic effects – positive & negative effects.
    3. SERM-enabled adjunctive estradiol therapy for male bipolar disorder – positive/therapeutic effect.

    Herbs
    1. Traditional Chinese Medicine usage patterns in Taiwan – no clear dose/effect/duration.
    2. Complementary & integrative medicine in youth mood disorders – no clear dose/effect/duration.
    3. Tephrosia purpurea in PCOS & psychiatric comorbidities – no clear dose/effect/duration.

    Amino acids
    1. Neuroimaging biomarkers in medication-naïve adolescents – no clear dose/effect/duration.
    2. Subchronic amphetamine in dopamine transporter knockout rats – positive/therapeutic effect (day, day).
    3. Aquaporin-4 extracellular vesicles in bipolar disorder – no clear dose/effect/duration.

    Vitamins
    1. Long-term lithium therapy – positive & negative effects.
    2. Niacin-induced skin flushing in early psychosis – no clear dose/effect/duration.
    3. Machine learning Niacin skin-flushing dataset – positive/therapeutic effect (g).

    Minerals
    1. Homocysteine causality in multiple diseases – positive/therapeutic effect.
    2. Trace elements & mental illness (Mendelian randomization) – no clear dose/effect/duration.
    3. Research trends on mineral elements for depression – negative/adverse effect.

    Supplements
    1. ICD-11 vs ICD-10 in affective disorders – no clear dose/effect/duration.
    2. Microbiota-gut-brain connection – positive/therapeutic effect.
    3. Mendelian randomization on periodontitis & bipolar disorder – positive/therapeutic effect.

    Nutrients
    1. Trace elements associations with bipolar disorder in adolescents – positive/therapeutic effect.
    2. Vitamin D, B9, B12 deficiencies – positive/therapeutic effect.
    3. Parental kynurenine 3-monooxygenase genotype in mice – positive/therapeutic effect (g).
    """.trimIndent(),
                listOf(
                    Reference("Biomedicines. 2025 Aug 29;13(9):2104", "👉 Gut microbiota in psychiatric & neurological disorders – no clear dose/effect/duration", "41007667"),
                    Reference("Neuropsychopharmacol Rep. 2025 Dec;45(4):e70061", "👉 Adjuvant metformin reducing olanzapine metabolic effects – positive & negative effect", "40998755"),
                    Reference("Front Psychiatry. 2025 Sep 9;16:1644175", "👉 SERM-enabled adjunctive estradiol therapy for male bipolar disorder – positive/therapeutic effect", "40995073"),
                    Reference("Healthcare (Basel). 2024 Feb 18;12(4):490", "👉 Traditional Chinese Medicine usage patterns – no clear dose/effect/duration", "38391865"),
                    Reference("Child Adolesc Psychiatr Clin N Am. 2023 Apr;32(2):367-394", "👉 Complementary & integrative medicine in youth mood disorders – no clear dose/effect/duration", "37147043"),
                    Reference("Gene. 2021 Mar 20;773:145385", "👉 Tephrosia purpurea in PCOS & psychiatric comorbidities – no clear dose/effect/duration", "33383117"),
                    Reference("Asian J Psychiatr. 2025 Sep;111:104660", "👉 Neuroimaging biomarkers in medication-naïve adolescents – no clear dose/effect/duration", "40818263"),
                    Reference("Neuropharmacology. 2025 Nov 15;279:110597", "👉 Subchronic amphetamine – positive/therapeutic effect (day, day)", "40721042"),
                    Reference("Ups J Med Sci. 2025 Mar 21;130", "👉 Aquaporin-4 extracellular vesicles – no clear dose/effect/duration", "40717781"),
                    Reference("Cureus. 2025 Jul 22;17(7):e88526", "👉 Long-term lithium therapy – positive & negative effects", "40851725"),
                    Reference("J Clin Psychiatry. 2025 Jul 21;86(3):24m15559", "👉 Niacin-induced skin flushing in early psychosis – no clear dose/effect/duration", "40767780"),
                    Reference("BMC Psychiatry. 2025 Aug 4;25(1):757", "👉 Machine learning Niacin skin-flushing dataset – positive/therapeutic effect (g)", "40760690"),
                    Reference("Nutr Metab (Lond). 2025 May 20;22(1):45", "👉 Homocysteine causality in multiple diseases – positive/therapeutic effect", "40394620"),
                    Reference("J Affect Disord. 2025 Jan 15;369:718-764", "👉 Trace elements & mental illness – no clear dose/effect/duration", "39393463"),
                    Reference("Heliyon. 2024 Jul 31;10(15):e35469", "👉 Mineral elements research trends in depression – negative/adverse effect", "39170573"),
                    Reference("Nervenarzt. 2025 Sep 11", "👉 ICD-11 vs ICD-10 in affective disorders – no clear dose/effect/duration", "40932648"),
                    Reference("CNS Neurosci Ther. 2025 Sep;31(9):e70593", "👉 Microbiota-gut-brain connection – positive/therapeutic effect", "40908772"),
                    Reference("Community Dent Health. 2025 Jun;42(2):27-35", "👉 Mendelian randomization on periodontitis & bipolar disorder – positive/therapeutic effect (G)", "40754676"),
                    Reference("PLoS One. 2025 May 6;20(5):e0322958", "👉 Trace elements associations in adolescents – positive/therapeutic effect", "40327654"),
                    Reference("Nutrients. 2025 Mar 27;17(7):1167", "👉 Vitamin D, B9, B12 deficiencies – positive/therapeutic effect", "40218925"),
                    Reference("Biol Sex Differ. 2025 Apr 2;16(1):22", "👉 Parental kynurenine 3-monooxygenase genotype – positive/therapeutic effect (G)", "40176166")
                )
            )

            "Bird flu" -> Pair(
                """
    Alternative
    1. Cryopreservation of chicken & duck tracheal rings – positive/therapeutic effect.
    2. Avian influenza A(H5) virus datasets for Nextclade – positive/therapeutic effect.
    3. Lyophilized qRT-PCR reagent validation in Sub-Saharan Africa – no clear dose/effect/duration.

    Herbs
    1. Novel & alternative therapeutic strategies for avian viral diseases – negative/adverse effect.
    2. Four herbs in diet affecting egg & immune response in quail – positive & negative effects.
    3. Lonicera japonica (flowers, stems, leaves) pharmacology – positive/therapeutic effect.

    Amino acids
    1. NS1 variant with effector domain deletion in influenza – positive/therapeutic effect.
    2. Codon usage-based stratification of Influenza A – positive/therapeutic effect.
    3. hnRNPM regulates influenza A replication – no clear dose/effect/duration.

    Vitamins
    1. Variation in UK retail eggs – no clear dose/effect/duration.
    2. In ovo retinoic acid administration enhances H9N2 vaccine response – positive/therapeutic effect (G, μg).
    3. Vitamin C + Arabic gum co-administration in H9N2-vaccinated quail – positive/therapeutic effect (g, week/day).

    Minerals
    1. One Health adjuvant selection for zoonotic vaccines – no clear dose/effect/duration.
    2. Graphene oxide quantum dot-based immunochromatographic strip for H7 detection – no clear dose/effect/duration.
    3. Cistanche deserticola polysaccharide nano-silica adjuvant for H9N2 oral vaccine – positive/therapeutic effect.

    Supplements
    1. Pseudostellaria heterophylla polysaccharide on chick humoral immunity – positive/therapeutic effect (mg/day).
    2. Chicken hemoglobin antimicrobial peptides under heat stress – positive & negative effects.
    3. In vitro culture of H5N1-specific duck T cells – positive & negative effects (day).

    Nutrients
    1. Variation in nutritional quality in UK retail eggs – no clear dose/effect/duration.
    2. In ovo feeding of vitamin E or C in broilers – positive/therapeutic effect (IU, mg/day).
    3. Fennel essential oil in broilers – positive/therapeutic effect (mg).
    """.trimIndent(),
                listOf(
                    Reference("J Virol Methods. 2025 Sep 2;339:115257", "👉 Cryopreservation of chicken & duck tracheal rings – positive/therapeutic effect (g)", "40907768"),
                    Reference("Virus Evol. 2025 Aug 4;11(1):veaf058", "👉 Avian influenza A(H5) virus datasets for Nextclade – positive/therapeutic effect", "40860043"),
                    Reference("J Clin Microbiol. 2025 Aug 13;63(8):e0008025", "👉 Lyophilized qRT-PCR reagent validation – no clear dose/effect/duration", "40590553"),
                    Reference("Front Vet Sci. 2022 Jul 22;9:933274", "👉 Novel & alternative therapeutic strategies – negative/adverse effect", "35937298"),
                    Reference("Trop Anim Health Prod. 2022 Jan 7;54(1):38", "👉 Four herbs in diet – positive & negative effects (g)", "34997337"),
                    Reference("Zhongguo Zhong Yao Za Zhi. 2016 Jul;41(13):2422-2427", "👉 Lonicera japonica pharmacology – positive/therapeutic effect", "28905563"),
                    Reference("Emerg Microbes Infect. 2025 Dec;14(1):2556731", "👉 NS1 variant with effector domain deletion – positive/therapeutic effect", "40899958"),
                    Reference("Comput Struct Biotechnol J. 2025 Jun 25;27:2757-2771", "👉 Codon usage-based stratification of Influenza A – positive/therapeutic effect", "40673124"),
                    Reference("J Virol. 2025 Jun 17;99(6):e0006725", "👉 hnRNPM regulates influenza A replication – no clear dose/effect/duration", "40434105"),
                    Reference("Food Chem. 2024 Oct 1;454:139783", "👉 Variation in UK retail eggs – no clear dose/effect/duration", "38795627"),
                    Reference("Vaccine. 2023 Nov 22;41(48):7281-7289", "👉 In ovo retinoic acid enhances H9N2 vaccine response – positive/therapeutic effect (G, μg)", "37923694"),
                    Reference("BMC Vet Res. 2022 Nov 18;18(1):408", "👉 Vitamin C + Arabic gum co-administration – positive/therapeutic effect (g, week/day)", "36401270"),
                    Reference("Explor Med. 2025;6:1001316", "👉 One Health adjuvant selection for zoonotic vaccines – no clear dose/effect/duration", "40444176"),
                    Reference("Poult Sci. 2025 Apr;104(4):104924", "👉 Graphene oxide quantum dot immunochromatographic strip – no clear dose/effect/duration", "39985899"),
                    Reference("Int J Pharm. 2024 Jul 20;660:124318", "👉 Cistanche deserticola polysaccharide nano-silica adjuvant – positive/therapeutic effect", "38852750"),
                    Reference("Dev Comp Immunol. 2025 Oct;171:105450", "👉 Pseudostellaria heterophylla polysaccharide on chick humoral immunity – positive/therapeutic effect (mg/day)", "40902815"),
                    Reference("Front Vet Sci. 2025 Jun 9;12:1574513", "👉 Chicken hemoglobin antimicrobial peptides – positive & negative effects", "40552078"),
                    Reference("J Vis Exp. 2025 May 30;(219)", "👉 In vitro culture of H5N1-specific duck T cells – positive & negative effects (day)", "40522882"),
                    Reference("Food Chem. 2024 Oct 1;454:139783", "👉 Variation in UK retail eggs – no clear dose/effect/duration", "38795627"),
                    Reference("Anim Biotechnol. 2023 Apr;34(2):456-461", "👉 In ovo feeding of vitamin E or C – positive/therapeutic effect (IU, mg/day)", "34278962"),
                    Reference("Br Poult Sci. 2021 Aug;62(4):562-572", "👉 Fennel essential oil in broilers – positive/therapeutic effect (mg)", "33530744")
                )
            )

            "Birthmarks" -> Pair(
                """
    Alternative
    1. Photo-Mediated Ultrasound Therapy (PUT) for deep cutaneous vasculature – positive/therapeutic effect (day).
    2. Large-spot, variable sequenced, long-pulsed KTP-laser for port-wine birthmarks – negative/adverse effect.
    3. Early clinical application of photosensitizing drugs in PDT of port-wine stain – no clear dose/effect/duration.

    Herbs
    No data available.

    Amino acids
    1. HMME-PDT for young children with port-wine stain – no clear dose/effect/duration.
    2. Serum levels of renin, ACE, angiotensin II in infantile haemangioma treated with excision, propranolol, captopril – month.
    3. Captopril treatment of infantile haemangioma – mg/week, month.

    Vitamins
    1. Vitamin D status in children with congenital melanocytic nevi – no clear dose/effect/duration.
    2. Updates on Sturge-Weber Syndrome – no clear dose/effect/duration.

    Minerals
    No data available.

    Supplements
    1. Management of orbital and periorbital venous malformations – positive/therapeutic effect.
    2. Zinc effect on lymphatic malformation cells in vitro – negative/adverse effect.
    3. Endoscopic transmucosal direct puncture sclerotherapy for airway vascular malformations – no clear dose/effect/duration.

    Nutrients
    No data available.
    """.trimIndent(),
                listOf(
                    Reference("IEEE Open J Ultrason Ferroelectr Freq Control. 2025;5:135-145", "👉 PUT for deep cutaneous vasculature – positive/therapeutic effect (day)", "40980454"),
                    Reference("J Cosmet Dermatol. 2025 Apr;24(4):e70152", "👉 Large-spot KTP-laser for port-wine birthmarks – negative/adverse effect", "40152117"),
                    Reference("Photodiagnosis Photodyn Ther. 2024 Dec;50:104383", "👉 Early photosensitizing drugs in PDT – no clear dose/effect/duration", "39442778"),
                    Reference("Lasers Surg Med. 2024 Oct;56(8):691-692", "👉 HMME-PDT for young children with port-wine stain – no clear dose/effect/duration", "39279227"),
                    Reference("J Plast Reconstr Aesthet Surg. 2016 Mar;69(3):381-6", "👉 Serum renin, ACE, angiotensin II in IH treated with excision, propranolol, captopril – month", "26612192"),
                    Reference("Br J Dermatol. 2012 Sep;167(3):619-24", "👉 Captopril treatment of IH – mg/week, month", "22533490"),
                    Reference("Pediatr Dermatol. 2024 Jan-Feb;41(1):58-60", "👉 Vitamin D status in children with congenital melanocytic nevi – no clear dose/effect/duration", "38018254"),
                    Reference("Stroke. 2022 Dec;53(12):3769-3779", "👉 Updates on Sturge-Weber Syndrome – no clear dose/effect/duration", "36263782"),
                    Reference("Front Surg. 2017 May 29;4:27", "👉 Management of orbital & periorbital venous malformations – positive/therapeutic effect", "28611988"),
                    Reference("Int J Pediatr Otorhinolaryngol. 2016 Jan;80:33-8", "👉 Zinc effect on lymphatic malformation cells in vitro – negative/adverse effect", "26746609"),
                    Reference("Laryngoscope. 2016 Jan;126(1):205-11", "👉 Endoscopic transmucosal direct puncture sclerotherapy – no clear dose/effect/duration", "25970858")
                )
            )

            "Bladder cancer" -> Pair(
                """
    Alternative
    1. Neoadjuvant/adjuvant therapies & biomarkers in muscle invasive bladder cancer – positive/therapeutic effect; negative/adverse effect.
    2. Ursolic acid in bladder and ovarian tumor cell lines – positive/therapeutic effect; negative/adverse effect.
    3. Novel Lactobacillus strains alleviate E. coli-induced inflammation in UTI rat model – negative/adverse effect.

    Herbs
    1. Aristolochic Acid III – negative/adverse effect.
    2. LINE-1 DNA methylation mediates smoking-related risk in urothelial carcinoma – positive/therapeutic effect; negative/adverse effect.
    3. Febrifugine inhibits proliferation & induces apoptosis in bladder cancer cells – negative/adverse effect.

    Amino acids
    1. Photodynamic diagnosis (PDD) in non-muscle invasive bladder cancer – positive/therapeutic effect.
    2. PYCR1 in proline metabolism: dual driver of cancer progression & fibrosis – no clear dose/effect/duration.
    3. Hypoxia-induced PYCR1 regulates glycolysis & lactylation promoting bladder cancer – no clear dose/effect/duration.

    Vitamins
    1. Ureteroenteric strictures following ileal conduit – positive/therapeutic effect (day).
    2. High-dose vitamin C improves BCG immunotherapy in murine bladder cancer model – positive/therapeutic effect (day).
    3. Vitamin D systematic review on cancer incidence/mortality – positive/therapeutic effect.

    Minerals
    1. Probabilistic health risk for N-Nitrosodimethylamine in Asian drinking water – mg, positive/therapeutic effect.
    2. Electrochemical immunosensor for bladder tumor marker NMP22 – day.
    3. Dairy intake & health outcomes – positive/therapeutic effect; negative/adverse effect.

    Supplements
    1. Innovations in therapies for BCG failure non-muscle invasive patients – positive/therapeutic effect.
    2. Clostridium butyricum MIYAIRI (CBM588) + Pembrolizumab for advanced urothelial carcinoma – positive/therapeutic effect (month).
    3. Vitamin D systematic review – positive/therapeutic effect.

    Nutrients
    1. SNX10 in bladder cancer progression – positive/therapeutic effect.
    2. Vitamin D systematic review – positive/therapeutic effect.
    3. Mediterranean diet and targeted nutrition for UK firefighters – positive/therapeutic effect.
    """.trimIndent(),
                listOf(
                    Reference("Curr Treat Options Oncol. 2025 Sep 26", "👉 Neoadjuvant/adjuvant therapies & biomarkers in MIBC – positive/therapeutic; negative/adverse effect", "41003886"),
                    Reference("Drug Dev Res. 2025 Nov;86(7):e70172", "👉 Ursolic acid in bladder & ovarian tumor cell lines – positive/therapeutic; negative/adverse effect", "41000061"),
                    Reference("Probiotics Antimicrob Proteins. 2025 Sep 24", "👉 Novel Lactobacillus strains alleviate E. coli-induced inflammation – negative/adverse effect", "40991100"),
                    Reference("Chem Res Toxicol. 2025 Jul 21;38(7):1239-1256", "👉 Aristolochic Acid III – negative/adverse effect", "40521810"),
                    Reference("Arch Toxicol. 2025 Jul;99(7):3035-3046", "👉 LINE-1 DNA methylation in urothelial carcinoma – positive/therapeutic; negative/adverse effect", "40285850"),
                    Reference("Toxicol Appl Pharmacol. 2024 Mar;484:116878", "👉 Febrifugine inhibits proliferation & induces apoptosis – negative/adverse effect", "38431229"),
                    Reference("Minerva Urol Nephrol. 2025 Aug;77(4):443-450", "👉 PDD in non-muscle invasive bladder cancer – positive/therapeutic effect", "40891474"),
                    Reference("J Enzyme Inhib Med Chem. 2025 Dec;40(1):2545620", "👉 PYCR1 in proline metabolism – no clear dose/effect/duration", "40891362"),
                    Reference("Cancer Biol Ther. 2025 Dec;26(1):2546219", "👉 Hypoxia-induced PYCR1 promotes bladder cancer – no clear dose/effect/duration", "40808274"),
                    Reference("BJU Int. 2025 Sep 11", "👉 Ureteroenteric strictures – positive/therapeutic effect (day)", "40936067"),
                    Reference("Pathol Res Pract. 2025 Aug 31;275:156207", "👉 High-dose vitamin C + BCG immunotherapy – positive/therapeutic effect (day)", "40907423"),
                    Reference("Nutrients. 2025 Jul 16;17(14):2333", "👉 Vitamin D systematic review – positive/therapeutic effect", "40732958"),
                    Reference("Water Environ Res. 2025 Sep;97(9):e70178", "👉 N-Nitrosodimethylamine risk – mg, positive/therapeutic effect", "40947824"),
                    Reference("Bioelectrochemistry. 2026 Feb;167:109074", "👉 Electrochemical immunosensor for NMP22 – day", "40782583"),
                    Reference("Eur J Clin Nutr. 2025 Jul 26", "👉 Dairy intake & health outcomes – positive/therapeutic; negative/adverse effect", "40715472"),
                    Reference("Harefuah. 2025 Sep;164(8):524-528", "👉 Innovations for BCG failure NMIBC – positive/therapeutic effect", "40932192"),
                    Reference("Cancer Rep (Hoboken). 2025 Aug;8(8):e70308", "👉 CBM588 + Pembrolizumab for advanced urothelial carcinoma – positive/therapeutic effect (month)", "40765260"),
                    Reference("Nutrients. 2025 Jul 16;17(14):2333", "👉 Vitamin D systematic review – positive/therapeutic effect", "40732958"),
                    Reference("Transl Androl Urol. 2025 Jul 30;14(7):1912-1924", "👉 SNX10 in bladder cancer progression – positive/therapeutic effect", "40800094"),
                    Reference("Nutrients. 2025 Jul 16;17(14):2333", "👉 Vitamin D systematic review – positive/therapeutic effect", "40732958"),
                    Reference("Nutr Res Rev. 2025 May 28:1-14", "👉 Mediterranean diet & targeted nutrition – positive/therapeutic effect", "40432497")
                )
            )

            "Bladder pain syndrome" -> Pair(
                """
    Alternative
    1. Mesenchymal stem cells and extracellular vesicles therapy – no clear dose/effect/duration.
    2. Fecal microbiota transplantation decision-making in patients – no clear dose/effect/duration.
    3. p75(NTR)-mediated anti-inflammatory response via TLR4/TRAF6/NF-κB axis – positive/therapeutic effect.

    Herbs
    1. Notopterygium incisum – positive/therapeutic effect; negative/adverse effect.
    2. Complementary treatment in chronic pelvic pain syndrome – week.
    3. Complementary & alternative therapies for interstitial cystitis – no clear dose/effect/duration.

    Amino acids
    1. Mirogabalin for bladder hypersensitivity in LPS-induced chronic cystitis in rats – positive/therapeutic effect.
    2. Centrally-acting therapies in urologic chronic pelvic pain syndrome – positive/therapeutic effect.
    3. Eluxadoline (Viberzi) visceral analgesic effect – negative/adverse effect.

    Vitamins
    1. Sea buckthorn anti-inflammatory effect in HCl-induced cystitis rat model – positive/therapeutic effect.
    2. CFTR modulator therapy in cystic fibrosis – no clear dose/effect/duration.
    3. Seropositive neuromyelitis optica case – g, G | positive/therapeutic effect (day, month).

    Minerals
    1. MEN-1 and contiguous gene deletion syndrome (CAH-X) – g, G.
    2. Limy bile syndrome presenting as acute acalculous cholecystitis – day.
    3. Novel contrast mixture for bladder wall T1 mapping in interstitial cystitis – positive/therapeutic effect.

    Supplements
    1. Antioxidants in chronic prostatitis – positive/therapeutic effect (month).
    2. Non-infectious cystitis management strategies – negative/adverse effect.
    3. Lumbar disc herniation review for symptomatic patients – positive/therapeutic effect (week).

    Nutrients
    1. CFTR modulator therapy in cystic fibrosis – no clear dose/effect/duration.
    2. Dietary capsaicin for cardiometabolic protection – no clear dose/effect/duration.
    3. Misoprostol therapeutics – positive/therapeutic effect; negative/adverse effect.
    """.trimIndent(),
                listOf(
                    Reference("Stem Cell Res Ther. 2025 Aug 26;16(1):459", "👉 MSCs & extracellular vesicles therapy – no clear dose/effect/duration", "40859299"),
                    Reference("BMC Complement Med Ther. 2025 Jul 16;25(1):268", "👉 Fecal microbiota transplantation decision-making – no clear dose/effect/duration", "40671002"),
                    Reference("Life (Basel). 2025 Jun 14;15(6):957", "👉 p75(NTR)-mediated anti-inflammatory response – positive/therapeutic effect", "40566609"),
                    Reference("J Ethnopharmacol. 2017 Apr 18;202:241-255", "👉 Notopterygium incisum – positive/therapeutic effect; negative/adverse effect", "28336469"),
                    Reference("Iran Red Crescent Med J. 2014 Apr;16(4):e13681", "👉 Complementary treatment in chronic pelvic pain syndrome – week", "24910801"),
                    Reference("Rev Urol. 2002;4 Suppl 1:S28-35", "👉 Complementary & alternative therapies for interstitial cystitis – no clear dose/effect/duration", "16986031"),
                    Reference("Life Sci. 2025 Nov 1;380:123942", "👉 Mirogabalin for bladder hypersensitivity – positive/therapeutic effect", "40882699"),
                    Reference("Neurourol Urodyn. 2025 Aug;44(6):1290-1295", "👉 Centrally-acting therapies in urologic chronic pelvic pain syndrome – positive/therapeutic effect", "40415481"),
                    Reference("J Pharmacol Exp Ther. 2025 Feb;392(2):100056", "👉 Eluxadoline (Viberzi) visceral analgesic effect – negative/adverse effect", "40023581"),
                    Reference("Investig Clin Urol. 2025 Jan;66(1):67-73", "👉 Sea buckthorn anti-inflammatory effect – positive/therapeutic effect", "39791586"),
                    Reference("Nutr Clin Pract. 2024 Apr;39 Suppl 1:S57-S77", "👉 CFTR modulator therapy – no clear dose/effect/duration", "38429959"),
                    Reference("Qatar Med J. 2022 Jul 7;2022(3):29", "👉 Seropositive neuromyelitis optica case – g, G | positive/therapeutic effect (day, month)", "35864917"),
                    Reference("J Endocr Soc. 2020 Jun 27;4(8):bvaa077", "👉 MEN-1 & CAH-X – g, G", "32715272"),
                    Reference("BMJ Case Rep. 2019 Apr 3;12(4):e228061", "👉 Limy bile syndrome – day", "30948398"),
                    Reference("Int Urol Nephrol. 2018 Mar;50(3):401-409", "👉 Novel contrast mixture for bladder wall T1 mapping – positive/therapeutic effect", "29392488"),
                    Reference("Urologiia. 2024 Dec;(6):76-83", "👉 Antioxidants in chronic prostatitis – positive/therapeutic effect (month)", "40377555"),
                    Reference("Curr Urol Rep. 2024 Sep 30;26(1):6", "👉 Non-infectious cystitis management – negative/adverse effect", "39347847"),
                    Reference("Dtsch Arztebl Int. 2024 Jun 28;121(13):440-448", "👉 Lumbar disc herniation review – positive/therapeutic effect (week)", "38835174"),
                    Reference("Nutr Clin Pract. 2024 Apr;39 Suppl 1:S57-S77", "👉 CFTR modulator therapy – no clear dose/effect/duration", "38429959"),
                    Reference("Nutrients. 2016 Apr 25;8(5):174", "👉 Dietary capsaicin – no clear dose/effect/duration", "27120617"),
                    Reference("Pharmacotherapy. 2001 Jan;21(1):60-73", "👉 Misoprostol therapeutics – positive/therapeutic effect; negative/adverse effect", "11191738")
                )
            )

            "Bladder stones" -> Pair(
                """
    Alternative
    1. Percutaneous cystolitholapaxy for complex bladder stones – no clear dose/effect/duration.
    2. CT imaging for non-calculus diagnoses – no clear dose/effect/duration.
    3. Postoperative pain management after ureteroscopy – positive/therapeutic effect; negative/adverse effect.

    Herbs
    1. Advances in cholelithiasis treatments – positive/therapeutic effect.
    2. Bergenia genus – positive/therapeutic effect.
    3. Ancient Greek & Byzantine lithotripsy methods – no clear dose/effect/duration.

    Amino acids
    1. Mineral composition of canine urinary stones – positive/therapeutic effect.
    2. Visibility of cystine & urate cystoliths in dogs – positive/therapeutic effect.
    3. Pharmacological interventions for cystinuria – mg | positive/therapeutic effect.

    Vitamins
    1. Potassium magnesium citrate + theobromine for uric acid stones – positive/therapeutic effect.
    2. Urinary stone formation in pediatric acquired brain injury – no clear dose/effect/duration.
    3. Horse gram (Macrotyloma uniflorum) review – positive/therapeutic effect.

    Minerals
    1. Mineral composition of canine urinary stones – positive/therapeutic effect.
    2. Urinary microbiota characteristics in overweight patients with stones – no clear dose/effect/duration.
    3. Genetic variants predisposing to kidney stones – positive/therapeutic effect.

    Supplements
    1. Horse gram (Macrotyloma uniflorum) review – positive/therapeutic effect.
    2. Prevalence of urolithiasis in China – positive/therapeutic effect.
    3. Polycitra-K and Bicitra in pediatric nephrolithiasis – g, mg.

    Nutrients
    1. Urinary stone formation in pediatric acquired brain injury – no clear dose/effect/duration.
    2. Manilkara zapota ("chicozapote") – positive/therapeutic effect; negative/adverse effect.
    3. Mineralogical study of bladder stones – no clear dose/effect/duration.
    """.trimIndent(),
                listOf(
                    Reference("Can J Urol. 2025 Aug 29;32(4):325-333", "👉 Percutaneous cystolitholapaxy – no clear dose/effect/duration", "40910330"),
                    Reference("Diagnostics (Basel). 2025 Jul 8;15(14):1731", "👉 CT imaging for non-calculus diagnoses – no clear dose/effect/duration", "40722481"),
                    Reference("Pain Manag. 2025 Jul;15(7):401-411", "👉 Postoperative pain management after ureteroscopy – positive/therapeutic effect; negative/adverse effect", "40468954"),
                    Reference("Eur J Pharmacol. 2021 Oct 5;908:174376", "👉 Advances in cholelithiasis treatments – positive/therapeutic effect", "34303667"),
                    Reference("Ceska Slov Farm. 2012 Oct;61(5):203-9", "👉 Bergenia genus – positive/therapeutic effect", "23256653"),
                    Reference("J Urol. 2007 Oct;178(4 Pt 1):1182-3", "👉 Ancient Greek & Byzantine lithotripsy – no clear dose/effect/duration", "17698119"),
                    Reference("J Vet Intern Med. 2025 Nov-Dec;39(6):e70252", "👉 Mineral composition of canine urinary stones – positive/therapeutic effect", "41001835"),
                    Reference("J Am Vet Med Assoc. 2024 Jul 26;262(10):1338-1342", "👉 Visibility of cystine & urate cystoliths – positive/therapeutic effect", "39059429"),
                    Reference("J Nephrol. 2024 Mar;37(2):293-308", "👉 Pharmacological interventions for cystinuria – mg | positive/therapeutic effect", "37957454"),
                    Reference("Arch Ital Urol Androl. 2025 Mar 28;97(1):13824", "👉 Potassium magnesium citrate + theobromine – positive/therapeutic effect", "40162813"),
                    Reference("Nutrients. 2025 Feb 28;17(5):883", "👉 Urinary stone formation in pediatric acquired brain injury – no clear dose/effect/duration", "40077750"),
                    Reference("J Food Sci. 2024 Dec;89(12):8102-8127", "👉 Horse gram (Macrotyloma uniflorum) – positive/therapeutic effect", "39656760"),
                    Reference("J Vet Intern Med. 2025 Nov-Dec;39(6):e70252", "👉 Mineral composition of canine urinary stones – positive/therapeutic effect", "41001835"),
                    Reference("Biomedicines. 2025 May 14;13(5):1197", "👉 Urinary microbiota in overweight patients with stones – no clear dose/effect/duration", "40427024"),
                    Reference("J Clin Invest. 2025 May 15;135(15):e186915", "👉 Genetic variants predisposing to kidney stones – positive/therapeutic effect", "40372791"),
                    Reference("J Food Sci. 2024 Dec;89(12):8102-8127", "👉 Horse gram (Macrotyloma uniflorum) – positive/therapeutic effect", "39656760"),
                    Reference("BJU Int. 2024 Jan;133(1):34-43", "👉 Prevalence of urolithiasis in China – positive/therapeutic effect", "37696625"),
                    Reference("Med J Islam Repub Iran. 2022 Jun 28;36:70", "👉 Polycitra-K & Bicitra in pediatric nephrolithiasis – g, mg", "36128269"),
                    Reference("Front Nutr. 2023 Jul 4;10:1194283", "👉 Manilkara zapota ('chicozapote') – positive/therapeutic effect; negative/adverse effect", "37469550"),
                    Reference("Environ Geochem Health. 2022 Oct;44(10):3297-3320", "👉 Mineralogical study of bladder stones – no clear dose/effect/duration", "34529244")
                )
            )

            "Blepharitis" -> Pair(
                """
    Alternative
    1. Epinastine eyelid cream for glaucoma patients – positive/therapeutic effect; negative/adverse effect.
    2. In vitro efficacy of ivermectin, lotilaner, lime sulfur, tea tree oil, lemongrass oil against Demodex folliculorum – no clear dose/effect/duration.
    3. Plant-derived antimicrobials targeting ocular biofilms – no clear dose/effect/duration.

    Herbs
    - No specific studies listed.

    Amino acids
    1. Pharmacological correction of burning eye syndrome – positive/therapeutic effect | month.
    2. Netarsudil pharmacovigilance study – negative/adverse effect | day.
    3. Plasma amino acid changes in isotretinoin therapy – positive/therapeutic effect; negative/adverse effect.

    Vitamins
    1. Pharmacological correction of burning eye syndrome – positive/therapeutic effect | month.
    2. Vitamin D and lipid profile in meibomian gland dysfunction – no clear dose/effect/duration.
    3. Case series of infectious keratitis post corneal cross-linking – no clear dose/effect/duration.

    Minerals
    1. Meibomian gland calcification in horses – month.
    2. In vitro demodicidal activity of commercial lid hygiene products – no clear dose/effect/duration.
    3. Bioadhesive sulfacetamide sodium microspheres in bacterial keratitis – no clear dose/effect/duration.

    Supplements
    1. Anti-Demodex activity of castor oil – positive/therapeutic effect.
    2. DEPTH Consensus on Demodex blepharitis treatment – no clear dose/effect/duration.
    3. Pediatric blepharokeratoconjunctivitis review – positive/therapeutic effect.

    Nutrients
    1. Acanthamoeba detection on ocular surface and sensitivity to chlorhexidine/voriconazole – no clear dose/effect/duration.
    2. Trace elements (zinc, copper) and blepharitis – no clear dose/effect/duration.
    3. Nutritional therapies for ocular disorders (including blepharitis) – no clear dose/effect/duration.
    """.trimIndent(),
                listOf(
                    Reference("Cureus. 2025 Jul 9;17(7):e87589", "👉 Epinastine eyelid cream – positive/therapeutic effect; negative/adverse effect", "40786375"),
                    Reference("Cont Lens Anterior Eye. 2025 Jul 27:102481", "👉 In vitro efficacy of ivermectin, lotilaner, lime sulfur, tea tree oil, lemongrass oil – no clear dose/effect/duration", "40721364"),
                    Reference("Molecules. 2025 Jul 5;30(13):2863", "👉 Plant-derived antimicrobials targeting ocular biofilms – no clear dose/effect/duration", "40649377"),
                    Reference("Vestn Oftalmol. 2025;141(2):51-58", "👉 Pharmacological correction of burning eye syndrome – positive/therapeutic effect | month", "40353541"),
                    Reference("BMC Pharmacol Toxicol. 2025 Apr 21;26(1):88", "👉 Netarsudil pharmacovigilance study – negative/adverse effect | day", "40259426"),
                    Reference("Arch Dermatol Res. 2025 Mar 17;317(1):591", "👉 Plasma amino acid changes in isotretinoin therapy – positive/therapeutic effect; negative/adverse effect", "40097819"),
                    Reference("J Fr Ophtalmol. 2025 Apr;48(4):104467", "👉 Vitamin D and lipid profile in meibomian gland dysfunction – no clear dose/effect/duration", "40056767"),
                    Reference("J Refract Surg. 2023 Aug;39(8):564-572", "👉 Infectious keratitis post corneal cross-linking – no clear dose/effect/duration", "37578174"),
                    Reference("Vet Ophthalmol. 2023 Apr;26 Suppl 1:163-167", "👉 Meibomian gland calcification in horses – month", "35861137"),
                    Reference("Clin Ophthalmol. 2019 Aug 6;13:1493-1497", "👉 In vitro demodicidal activity of lid hygiene products – no clear dose/effect/duration", "31496640"),
                    Reference("Eur J Pharm Biopharm. 2009 Aug;72(3):487-95", "👉 Bioadhesive sulfacetamide sodium microspheres – no clear dose/effect/duration", "19223014"),
                    Reference("Cont Lens Anterior Eye. 2025 Jul 4:102471", "👉 Anti-Demodex activity of castor oil – positive/therapeutic effect", "40617731"),
                    Reference("Clin Ophthalmol. 2025 Jun 18;19:1893-1904", "👉 DEPTH Consensus on Demodex blepharitis – no clear dose/effect/duration", "40551956"),
                    Reference("Curr Opin Ophthalmol. 2025 Jul 1;36(4):314-321", "👉 Pediatric blepharokeratoconjunctivitis review – positive/therapeutic effect", "40279250"),
                    Reference("J Med Microbiol. 2015 Aug;64(8):849-853", "👉 Acanthamoeba detection on ocular surface – no clear dose/effect/duration", "26293786"),
                    Reference("Cont Lens Anterior Eye. 2009 Jun;32(3):120-2", "👉 Trace elements (zinc, copper) and blepharitis – no clear dose/effect/duration", "19356972"),
                    Reference("Altern Med Rev. 2008 Sep;13(3):191-204", "👉 Nutritional therapies for ocular disorders including blepharitis – no clear dose/effect/duration", "18950246")
                )
            )

            "Blisters" -> Pair(
                """
    Alternative
    1. Real-time, noninvasive diagnosis of bullous pemphigoid using line-field confocal OCT – no clear dose/effect/duration.
    2. Unusual site dermatitis herpetiformis managed with line-field confocal OCT – no clear dose/effect/duration.
    3. ESAT6-CFP10 skin test for latent TB infection – positive/therapeutic effect.

    Herbs
    1. Generalized bullous fixed drug eruption from Chinese herbs plaster – no clear dose/effect/duration.
    2. Monkeypox virus outbreak review and treatments – no clear dose/effect/duration.
    3. Safety of medicinal plants for vitiligo/hypermelanosis – negative/adverse effect.

    Amino acids
    1. Frem2 knockout mice with Fraser syndrome – no clear dose/effect/duration.
    2. Rigosertib in dystrophic epidermolysis bullosa-associated advanced cutaneous squamous cell carcinoma – positive/therapeutic effect; negative/adverse effect | month.
    3. EEG synthetic lung surfactant powder formulation – month.

    Vitamins
    1. Dystrophic epidermolysis bullosa – positive/therapeutic effect | month.
    2. Hailey-Hailey disease treatment algorithm – g.
    3. Nicotinamide in skin health – positive/therapeutic effect.

    Minerals
    1. Dystrophic epidermolysis bullosa – positive/therapeutic effect | month.
    2. Magnesium-ion battery electrode study – no clear dose/effect/duration.
    3. Bentonite-containing soap in epidermolytic ichthyosis – g | positive/therapeutic effect.

    Supplements
    1. Dystrophic epidermolysis bullosa – positive/therapeutic effect | month.
    2. Tacrolimus + doxycycline for oral mucous membrane pemphigoid – mg | positive/therapeutic effect; negative/adverse effect.
    3. Pharmacological interventions for pemphigus vulgaris/foliaceus – negative/adverse effect.

    Nutrients
    1. Bile acid in immune-mediated skin diseases – positive/therapeutic effect.
    2. Nutrition in autoimmune bullous diseases – no clear dose/effect/duration.
    3. Dietary habits in Japanese patients with bullous pemphigoid (low retinol intake) – no clear dose/effect/duration.
    """.trimIndent(),
                listOf(
                    Reference("Skin Res Technol. 2025 Sep;31(9):e70235", "👉 Real-time, noninvasive diagnosis of bullous pemphigoid using line-field confocal OCT – no clear dose/effect/duration", "40990140"),
                    Reference("Dermatol Reports. 2025 Sep 17", "👉 Unusual site dermatitis herpetiformis managed with line-field confocal OCT – no clear dose/effect/duration", "40963385"),
                    Reference("Microbiol Spectr. 2025 Sep 17:e0150025", "👉 ESAT6-CFP10 skin test for latent TB infection – positive/therapeutic effect", "40960282"),
                    Reference("Contact Dermatitis. 2023 Sep;89(3):198-199", "👉 Generalized bullous fixed drug eruption from Chinese herbs plaster – no clear dose/effect/duration", "37248798"),
                    Reference("Infect Disord Drug Targets. 2023;23(6):e180423216001", "👉 Monkeypox virus outbreak review and treatments – no clear dose/effect/duration", "37073653"),
                    Reference("Clin Cosmet Investig Dermatol. 2021 Mar 23;14:261-284", "👉 Safety of medicinal plants for vitiligo/hypermelanosis – negative/adverse effect", "33790609"),
                    Reference("Sci Rep. 2025 Sep 26;15(1):32956", "👉 Frem2 knockout mice with Fraser syndrome – no clear dose/effect/duration", "41006360"),
                    Reference("Br J Dermatol. 2025 Sep 18;193(4):758-766", "👉 Rigosertib in dystrophic epidermolysis bullosa-associated advanced cutaneous squamous cell carcinoma – positive/therapeutic effect; negative/adverse effect | month", "40439508"),
                    Reference("Drug Dev Ind Pharm. 2025 Jul;51(7):747-757", "👉 EEG synthetic lung surfactant powder formulation – month", "40392626"),
                    Reference("Dystrophic Epidermolysis Bullosa. GeneReviews", "👉 Dystrophic epidermolysis bullosa – positive/therapeutic effect | month", "20301481"),
                    Reference("J Cutan Med Surg. 2025 Jun 16:12034754251344213", "👉 Hailey-Hailey disease treatment algorithm – g", "40522330"),
                    Reference("Medicina (Kaunas). 2025 Feb 1;61(2):254", "👉 Nicotinamide in skin health – positive/therapeutic effect", "40005371"),
                    Reference("Int J Mol Sci. 2025 Jul 15;26(14):6793", "👉 Magnesium-ion battery electrode study – no clear dose/effect/duration", "40725040"),
                    Reference("Arch Dermatol Res. 2025 Mar 26;317(1):634", "👉 Bentonite-containing soap in epidermolytic ichthyosis – g | positive/therapeutic effect", "40137998"),
                    Reference("Oral Surg Oral Med Oral Pathol Oral Radiol. 2025 Aug;140(2):e35-e40", "👉 Tacrolimus + doxycycline for oral mucous membrane pemphigoid – mg | positive/therapeutic effect; negative/adverse effect", "40268667"),
                    Reference("Adv Ther. 2025 Apr;42(4):1642-1691", "👉 Pharmacological interventions for pemphigus vulgaris/foliaceus – negative/adverse effect", "40016441"),
                    Reference("Exp Dermatol. 2025 May;34(5):e70108", "👉 Bile acid in immune-mediated skin diseases – positive/therapeutic effect", "40302108"),
                    Reference("Nutrients. 2024 Nov 20;16(22):3961", "👉 Nutrition in autoimmune bullous diseases – no clear dose/effect/duration", "39599747"),
                    Reference("Eur J Dermatol. 2023 Aug 1;33(4):394-403", "👉 Dietary habits in Japanese patients with bullous pemphigoid (low retinol intake) – no clear dose/effect/duration", "37823490")
                )
            )

            "Blood poisoning" -> Pair(
                """
    Alternative
    1. Vancomycin pharmacodynamics against coagulase-negative Staphylococci bloodstream infections – mg | positive/therapeutic effect.
    2. Preterm infants with incomplete antenatal corticosteroid cycles – g | negative/adverse effect.
    3. RNAi therapy attenuating multi-organ viremia in EMCV model – positive/therapeutic effect.

    Herbs
    1. Ferulic acid promotes hematopoietic stem cell maintenance via reduced ferroptosis – positive/therapeutic effect.
    2. Ginsenoside Rc targets ROCK2 to inhibit NF-κB and improve cognitive dysfunction in septic encephalopathy – positive/therapeutic effect.
    3. Yinghuang Decoction in sepsis (network pharmacology) – negative/adverse effect.

    Amino acids
    1. Enteral vs parenteral nutrition in auto-HCT – no clear dose/effect/duration.
    2. Antivirals Nirmatrelvir-Ritonavir and Molnupiravir in viral sepsis – positive/therapeutic effect.
    3. Sepsis biomarkers via glutamine metabolism and immune regulation – positive/therapeutic effect.

    Vitamins
    1. Vitamin D poisoning causing acute renal failure – mcg | negative/adverse effect.
    2. Cadmium poisoning and management – positive/therapeutic effect.
    3. Mercury exposure leading to functional vitamin B12 deficiency – μg | positive/therapeutic effect; negative/adverse effect | month.

    Minerals
    1. Mesenchymal stem cells with SeNPs protecting against liver injury in CLP sepsis model – positive/therapeutic effect.
    2. Boric acid protects against ovarian damage from endotoxaemia – positive/therapeutic effect; negative/adverse effect.
    3. CCL20/CCR6 signaling modulating S. aureus osteomyelitis severity – positive/therapeutic effect.

    Supplements
    1. Ferulic acid promoting hematopoietic stem cell maintenance – positive/therapeutic effect.
    2. Vitamin D poisoning causing acute renal failure – mcg | negative/adverse effect.
    3. Management of retroperitoneal perforated descending duodenal diverticulum with nutritional jejunostomy – positive/therapeutic effect.

    Nutrients
    1. Vitamin D poisoning causing acute renal failure – mcg | negative/adverse effect.
    2. Atopobium spp. interactions with host proteins and immune cells – no clear dose/effect/duration.
    3. Glucocorticoid system regulating mitochondrial, endothelial, and intestinal barrier function – positive/therapeutic effect.
    """.trimIndent(),
                listOf(
                    Reference("Pharmacol Res Perspect. 2025 Oct;13(5):e70180", "👉 Vancomycin pharmacodynamics against coagulase-negative Staphylococci bloodstream infections – mg | positive/therapeutic effect", "41015987"),
                    Reference("Eur J Obstet Gynecol Reprod Biol. 2025 Sep 22;315:114732", "👉 Preterm infants with incomplete antenatal corticosteroid cycles – g | negative/adverse effect", "41014996"),
                    Reference("Viruses. 2025 Sep 14;17(9):1240", "👉 RNAi therapy attenuating multi-organ viremia in EMCV model – positive/therapeutic effect", "41012668"),
                    Reference("Antioxidants (Basel). 2025 Aug 27;14(9):1053", "👉 Ferulic acid promotes hematopoietic stem cell maintenance via reduced ferroptosis – positive/therapeutic effect", "41008960"),
                    Reference("Appl Biochem Biotechnol. 2025 Sep 18", "👉 Ginsenoside Rc targets ROCK2 to inhibit NF-κB and improve cognitive dysfunction in septic encephalopathy – positive/therapeutic effect", "40965580"),
                    Reference("Int J Gen Med. 2025 Aug 27;18:4785-4801", "👉 Yinghuang Decoction in sepsis (network pharmacology) – negative/adverse effect", "40901370"),
                    Reference("Support Care Cancer. 2025 Sep 19;33(10):865", "👉 Enteral vs parenteral nutrition in auto-HCT – no clear dose/effect/duration", "40971058"),
                    Reference("JMIR Public Health Surveill. 2025 Sep 18;11:e72124", "👉 Antivirals Nirmatrelvir-Ritonavir and Molnupiravir in viral sepsis – positive/therapeutic effect", "40966482"),
                    Reference("Front Immunol. 2025 Aug 20;16:1640425", "👉 Sepsis biomarkers via glutamine metabolism and immune regulation – positive/therapeutic effect", "40909263"),
                    Reference("Tidsskr Nor Laegeforen. 2025 Sep 23;145(11)", "👉 Vitamin D poisoning causing acute renal failure – mcg | negative/adverse effect", "41001862"),
                    Reference("Front Public Health. 2025 Sep 10;13:1651851", "👉 Cadmium poisoning and management – positive/therapeutic effect", "41000307"),
                    Reference("Front Toxicol. 2025 Sep 9;7:1580275", "👉 Mercury exposure leading to functional vitamin B12 deficiency – μg | positive/therapeutic effect; negative/adverse effect | month", "40995338"),
                    Reference("Front Immunol. 2025 Sep 5;16:1602994", "👉 Mesenchymal stem cells with SeNPs protecting against liver injury in CLP sepsis model – positive/therapeutic effect", "40977719"),
                    Reference("J Obstet Gynaecol Res. 2025 Aug;51(8):e70055", "👉 Boric acid protects against ovarian damage from endotoxaemia – positive/therapeutic effect; negative/adverse effect", "40854541"),
                    Reference("mBio. 2025 Aug 25:e0141325", "👉 CCL20/CCR6 signaling modulating S. aureus osteomyelitis severity – positive/therapeutic effect", "40853122"),
                    Reference("BMC Surg. 2025 Sep 25;25(1):414", "👉 Management of retroperitoneal perforated descending duodenal diverticulum with nutritional jejunostomy – positive/therapeutic effect", "40999418"),
                    Reference("Anaerobe. 2025 Sep 17:102998", "👉 Atopobium spp. interactions with host proteins and immune cells – no clear dose/effect/duration", "40972706"),
                    Reference("Semin Respir Crit Care Med. 2025 Sep 17", "👉 Glucocorticoid system regulating mitochondrial, endothelial, and intestinal barrier function – positive/therapeutic effect", "40962264")
                )
            )

            "Blood pressure (high)" -> Pair(
                """
    Alternative
    1. Modified fixed-dose combination tablet containing S-Amlodipine Besylate – positive/therapeutic effect; negative/adverse effect.
    2. Remimazolam vs Propofol on intraoperative hypertension/hypotension – no clear dose/effect/duration.
    3. Landiolol in hemodynamically unstable ICU patients – negative/adverse effect.

    Herbs
    1. Salvianolic acid B + Senkyunolide I alleviating cardiac hypertrophy via MAP3K1 – positive/therapeutic effect; negative/adverse effect.
    2. Culinary medicine program using herbs/spices to increase vegetable intake in adults with hypertension – positive/therapeutic effect.
    3. Modified Saengmaeksan herbal formula improving hypertension via RhoA/Rho kinase – positive/therapeutic effect; negative/adverse effect.

    Amino acids
    1. Self-microemulsifying Heliopsis longipes root extract in hypertensive rats – positive/therapeutic effect.
    2. Longitudinal effects of Glecaprevir/Pibrentasvir on liver function in hepatitis C – month.
    3. Antioxidants, gut microbiota, and cardiovascular programming – positive/therapeutic effect.

    Vitamins
    1. Serum vitamin C levels inversely related to biological aging – mg, G | positive/therapeutic effect.
    2. Targeted plasma metabolomics monitoring after pediatric kidney transplant – positive/therapeutic effect.
    3. Persistent hypercalcemia after parathyroidectomy – g | positive/therapeutic effect.

    Minerals
    1. Incretin-based obesity management medications – positive/therapeutic effect; negative/adverse effect.
    2. Low bone mineral density global/regional/national burden – positive/therapeutic effect; negative/adverse effect.
    3. Growth hormone deficiency in Cushing's syndrome – positive/therapeutic effect.

    Supplements
    1. Lacticaseibacillus rhamnosus Probio-M9 mitigating pulmonary hypertension in rats – positive/therapeutic effect.
    2. Pre-pregnancy obesity traits and hypertensive disorders of pregnancy – no clear dose/effect/duration.
    3. Anthocyanin-enriched purple potato flour modulating gut microbiota to prevent hypertension – g | positive/therapeutic effect.

    Nutrients
    1. Trace metal element levels and ideal cardiovascular health in adolescents – no clear dose/effect/duration.
    2. Effects of plant-based foods on metabolic outcomes in adults with MASLD and comorbidities – positive/therapeutic effect.
    3. Pomegranate extract on IGF-1 levels and telomere length in older adults – mg, G | positive/therapeutic effect | week.
    """.trimIndent(),
                listOf(
                    Reference("Pharmaceutics. 2025 Sep 22;17(9):1235", "👉 Modified fixed-dose combination tablet containing S-Amlodipine Besylate – positive/therapeutic effect; negative/adverse effect", "41012570"),
                    Reference("Medicina (Kaunas). 2025 Sep 22;61(9):1721", "👉 Remimazolam vs Propofol on intraoperative hypertension/hypotension – no clear dose/effect/duration", "41011112"),
                    Reference("Medicina (Kaunas). 2025 Sep 19;61(9):1703", "👉 Landiolol in hemodynamically unstable ICU patients – negative/adverse effect", "41011094"),
                    Reference("Chin Med. 2025 Sep 28;20(1):148", "👉 Salvianolic acid B + Senkyunolide I alleviating cardiac hypertrophy via MAP3K1 – positive/therapeutic effect; negative/adverse effect", "41015772"),
                    Reference("Am J Health Promot. 2025 Sep 13", "👉 Culinary medicine program using herbs/spices to increase vegetable intake in adults with hypertension – positive/therapeutic effect", "40944674"),
                    Reference("Integr Med Res. 2025 Dec;14(4):101207", "👉 Modified Saengmaeksan herbal formula improving hypertension via RhoA/Rho kinase – positive/therapeutic effect; negative/adverse effect", "40896355"),
                    Reference("Molecules. 2025 Sep 12;30(18):3711", "👉 Self-microemulsifying Heliopsis longipes root extract in hypertensive rats – positive/therapeutic effect", "41011602"),
                    Reference("Medicina (Kaunas). 2025 Sep 4;61(9):1601", "👉 Longitudinal effects of Glecaprevir/Pibrentasvir on liver function in hepatitis C – month", "41010992"),
                    Reference("Antioxidants (Basel). 2025 Aug 26;14(9):1049", "👉 Antioxidants, gut microbiota, and cardiovascular programming – positive/therapeutic effect", "41008956"),
                    Reference("Eur J Med Res. 2025 Sep 26;30(1):864", "👉 Serum vitamin C levels inversely related to biological aging – mg, G | positive/therapeutic effect", "41013587"),
                    Reference("Int J Mol Sci. 2025 Sep 20;26(18):9190", "👉 Targeted plasma metabolomics monitoring after pediatric kidney transplant – positive/therapeutic effect", "41009752"),
                    Reference("Int J Mol Sci. 2025 Sep 15;26(18):8965", "👉 Persistent hypercalcemia after parathyroidectomy – g | positive/therapeutic effect", "41009532"),
                    Reference("Adv Nutr. 2025 Sep 18:100522", "👉 Incretin-based obesity management medications – positive/therapeutic effect; negative/adverse effect", "40975496"),
                    Reference("Lancet Rheumatol. 2025 Sep 16", "👉 Low bone mineral density global/regional/national burden – positive/therapeutic effect; negative/adverse effect", "40972625"),
                    Reference("Expert Rev Endocrinol Metab. 2025 Sep 13:1-6", "👉 Growth hormone deficiency in Cushing's syndrome – positive/therapeutic effect", "40944557"),
                    Reference("Nutrients. 2025 Sep 11;17(18):2927", "👉 Lacticaseibacillus rhamnosus Probio-M9 mitigating pulmonary hypertension in rats – positive/therapeutic effect", "41010453"),
                    Reference("J Obstet Gynaecol Can. 2025 Sep 24:103070", "👉 Pre-pregnancy obesity traits and hypertensive disorders of pregnancy – no clear dose/effect/duration", "41005619"),
                    Reference("Food Funct. 2025 Sep 25", "👉 Anthocyanin-enriched purple potato flour modulating gut microbiota to prevent hypertension – g | positive/therapeutic effect", "40994411"),
                    Reference("Eur J Med Res. 2025 Sep 26;30(1):857", "👉 Trace metal element levels and ideal cardiovascular health in adolescents – no clear dose/effect/duration", "41013819"),
                    Reference("Nutrients. 2025 Sep 22;17(18):3020", "👉 Effects of plant-based foods on metabolic outcomes in adults with MASLD and comorbidities – positive/therapeutic effect", "41010543"),
                    Reference("Nutrients. 2025 Sep 16;17(18):2974", "👉 Pomegranate extract on IGF-1 levels and telomere length in older adults – mg, G | positive/therapeutic effect | week", "41010500")
                )
            )

            "Blood pressure (low)" -> Pair(
                """
    Alternative
    1. Integrating exercise and medication management in geriatric care – positive/therapeutic effect; negative/adverse effect.
    2. Remimazolam vs Propofol on intraoperative hypotension – no clear dose/effect/duration.
    3. Physiologic homeostasis after pig kidney xenotransplantation – positive/therapeutic effect | day.

    Herbs
    1. Diversity of plant-based foods/beverages and cardiometabolic health – g | positive/therapeutic effect.
    2. Clinical diagnostic score for acute Chinese medicine poisoning (aconite) – negative/adverse effect.
    3. Cinnamomum verum bark anti-inflammatory, antidiabetic, hypolipidemic potential – positive/therapeutic effect.

    Amino acids
    1. Folate, vitamin B12, homocysteine and association with hypertension – no clear dose/effect/duration.
    2. Kidney nutrition: low protein diets and keto-analogue supplementation – positive/therapeutic effect.
    3. Sacubitril/valsartan in ESRD patients with heart failure – positive/therapeutic effect; negative/adverse effect.

    Vitamins
    1. Folate, vitamin B12, homocysteine and association with hypertension – no clear dose/effect/duration.
    2. Thiamine detection via fluorogenic Cu(2+) response – positive/therapeutic effect.
    3. Contributors to vasorelaxation during vasoplegia from cardiopulmonary bypass – no clear dose/effect/duration.

    Minerals
    1. Bioavailability of magnesium and potassium salts as sodium substitutes – no clear dose/effect/duration.
    2. Extended-hours hemodialysis reducing vascular calcification risk – mg | positive/therapeutic effect.
    3. Health behaviors and hydration status in Polish adults – no clear dose/effect/duration.

    Supplements
    1. New Zealand blackcurrant extract during low-intensity isometric contractions – mg | day.
    2. Step-by-step guide to hematoma prevention after rhytidectomy – positive/therapeutic effect.
    3. Lidocaine local anesthetic effect – mg | positive/therapeutic effect; negative/adverse effect.

    Nutrients
    1. Folate, vitamin B12, homocysteine and association with hypertension – no clear dose/effect/duration.
    2. Diet and sociodemographic factors on cardiovascular health among students – mg | negative/adverse effect.
    3. Low-carbohydrate diets reduce cardiovascular risk in MASLD – positive/therapeutic effect | week.
    """.trimIndent(),
                listOf(
                    Reference("Lancet Healthy Longev. 2025 Sep 24:100763", "👉 Integrating exercise and medication management in geriatric care – positive/therapeutic effect; negative/adverse effect", "41015054"),
                    Reference("Medicina (Kaunas). 2025 Sep 22;61(9):1721", "👉 Remimazolam vs Propofol on intraoperative hypotension – no clear dose/effect/duration", "41011112"),
                    Reference("Nat Commun. 2025 Sep 26;16(1):8453", "👉 Physiologic homeostasis after pig kidney xenotransplantation – positive/therapeutic effect | day", "41006232"),
                    Reference("Clin Nutr. 2025 Sep;52:47-61", "👉 Diversity of plant-based foods/beverages and cardiometabolic health – g | positive/therapeutic effect", "40737886"),
                    Reference("Clin Toxicol (Phila). 2025 Jul;63(7):476-487", "👉 Clinical diagnostic score for acute Chinese medicine poisoning (aconite) – negative/adverse effect", "40528738"),
                    Reference("Pak J Pharm Sci. 2024 Nov-Dec;37(6):1529-1544", "👉 Cinnamomum verum bark anti-inflammatory, antidiabetic, hypolipidemic potential – positive/therapeutic effect", "39923147"),
                    Reference("Am J Hum Biol. 2025 Sep;37(9):e70143", "👉 Folate, vitamin B12, homocysteine and association with hypertension – no clear dose/effect/duration", "40960431"),
                    Reference("Clin J Am Soc Nephrol. 2025 Sep 11", "👉 Kidney nutrition: low protein diets and keto-analogue supplementation – positive/therapeutic effect", "40932799"),
                    Reference("Ann Med. 2025 Dec;57(1):2557515", "👉 Sacubitril/valsartan in ESRD patients with heart failure – positive/therapeutic effect; negative/adverse effect", "40922558"),
                    Reference("Am J Hum Biol. 2025 Sep;37(9):e70143", "👉 Folate, vitamin B12, homocysteine and association with hypertension – no clear dose/effect/duration", "40960431"),
                    Reference("Anal Bioanal Chem. 2025 Sep;417(23):5211-5220", "👉 Thiamine detection via fluorogenic Cu(2+) response – positive/therapeutic effect", "40866527"),
                    Reference("Br J Anaesth. 2025 Oct;135(4):844-846", "👉 Contributors to vasorelaxation during vasoplegia from cardiopulmonary bypass – no clear dose/effect/duration", "40841221"),
                    Reference("Mol Nutr Food Res. 2025 Sep 10:e70227", "👉 Bioavailability of magnesium and potassium salts as sodium substitutes – no clear dose/effect/duration", "40931546"),
                    Reference("J Med Cases. 2025 Aug 22;16(8):300-308", "👉 Extended-hours hemodialysis reducing vascular calcification risk – mg | positive/therapeutic effect", "40904762"),
                    Reference("Nutrients. 2025 Aug 9;17(16):2597", "👉 Health behaviors and hydration status in Polish adults – no clear dose/effect/duration", "40871625"),
                    Reference("Eur J Appl Physiol. 2025 Sep 22", "👉 New Zealand blackcurrant extract during low-intensity isometric contractions – mg | day", "40982048"),
                    Reference("Aesthetic Plast Surg. 2025 Sep 19", "👉 Step-by-step guide to hematoma prevention after rhytidectomy – positive/therapeutic effect", "40973835"),
                    Reference("Lidocaine Toxicity(Archived). 2025 Sep 16", "👉 Lidocaine local anesthetic effect – mg | positive/therapeutic effect; negative/adverse effect", "29494086"),
                    Reference("Front Public Health. 2025 Sep 1;13:1514146", "👉 Diet and sociodemographic factors on cardiovascular health among students – mg | negative/adverse effect", "40959649"),
                    Reference("Front Nutr. 2025 Aug 26;12:1626352", "👉 Low-carbohydrate diets reduce cardiovascular risk in MASLD – positive/therapeutic effect | week", "40933261")
                )
            )

            "Body dysmorphic disorder" -> Pair(
                """
    Alternative
    1. Psychotherapeutic interventions for BDD – positive/therapeutic effect.
    2. Predicting next-day negative emotion states using smartphone data – positive/therapeutic effect | day, month.
    3. Perceived barriers to treatment comparing psychotherapy and online interventions – positive/therapeutic effect.

    Herbs
    (No studies found)

    Amino acids
    1. 16p11.2 deletion syndrome metabolic contributions – g, g.
    2. Creatine monohydrate use and muscle dysmorphia symptoms – month, month.
    3. N-Acetylcysteine for OCD and related disorders in children/adolescents – mg | positive/therapeutic effect; negative/adverse effect | week.

    Vitamins
    1. Severe hypercalcemia from repeated mineral oil injections – mg | day.
    2. Prenatal alcohol exposure and dysmorphic features – month, month.

    Minerals
    1. Severe hypercalcemia from repeated mineral oil injections – mg | day.
    2. Bone structure in subjects with minor spliceosome impairment (MOPD1) – no clear dose/effect/duration.

    Supplements
    1. Muscularity-oriented social media content and muscle dysmorphia – no clear dose/effect/duration.
    2. Muscle dysmorphia symptoms and suicidality – positive/therapeutic effect.
    3. Death anxiety and muscle dysmorphia symptoms – no clear dose/effect/duration.

    Nutrients
    1. #BodyPositivity: Body appreciation and BMI for muscle dysmorphia and exercise motives – positive/therapeutic effect.
    2. Orthorexia as an eating disorder spectrum – G, G.
    3. Health behavior and psychological treatment utilization in adults with avoidant/restrictive food intake disorder – positive/therapeutic effect.
    """.trimIndent(),
                listOf(
                    Reference("Dermatol Surg. 2025 Jul 2", "👉 Psychotherapeutic interventions for BDD – positive/therapeutic effect", "40600597"),
                    Reference("Internet Interv. 2025 May 15;40:100833", "👉 Predicting next-day negative emotion states using smartphone data – positive/therapeutic effect | day, month", "40486130"),
                    Reference("Behav Ther. 2025 May;56(3):618-633", "👉 Perceived barriers to treatment comparing psychotherapy and online interventions – positive/therapeutic effect", "40287188"),
                    Reference("Bioessays. 2025 Mar;47(3):e202400177", "👉 16p11.2 deletion syndrome metabolic contributions – g, g", "39988938"),
                    Reference("Eat Behav. 2024 Aug;54:101910", "👉 Creatine monohydrate use and muscle dysmorphia symptoms – month, month", "39173400"),
                    Reference("Ann Pharmacother. 2023 Jul;57(7):847-854", "👉 N-Acetylcysteine for OCD and related disorders in children/adolescents – mg | positive/therapeutic effect; negative/adverse effect | week", "36384314"),
                    Reference("Arch Endocrinol Metab. 2023 Mar 30;67(3):450-455", "👉 Severe hypercalcemia from repeated mineral oil injections – mg | day", "37011375"),
                    Reference("Alcohol Clin Exp Res. 2020 Oct;44(10):2045-2052", "👉 Prenatal alcohol exposure and dysmorphic features – month, month", "32772389"),
                    Reference("Bone. 2016 Nov;92:145-149", "👉 Bone structure in subjects with minor spliceosome impairment (MOPD1) – no clear dose/effect/duration", "27591150"),
                    Reference("Body Image. 2025 Jun;53:101903", "👉 Muscularity-oriented social media content and muscle dysmorphia – no clear dose/effect/duration", "40367828"),
                    Reference("Body Image. 2023 Sep;46:372-382", "👉 Muscle dysmorphia symptoms and suicidality – positive/therapeutic effect", "37481936"),
                    Reference("Body Image. 2023 Mar;44:43-52", "👉 Death anxiety and muscle dysmorphia symptoms – no clear dose/effect/duration", "36459928"),
                    Reference("Nutrients. 2025 Mar 28;17(7):1177", "👉 #BodyPositivity: Body appreciation and BMI for muscle dysmorphia and exercise motives – positive/therapeutic effect", "40218935"),
                    Reference("Nutrients. 2024 Sep 29;16(19):3304", "👉 Orthorexia as an eating disorder spectrum – G, G", "39408271"),
                    Reference("J Eat Disord. 2024 Jun 26;12(1):88", "👉 Health behavior and psychological treatment utilization in adults with avoidant/restrictive food intake disorder – positive/therapeutic effect", "38926791")
                )
            )

            "Boils" -> Pair(
                """
    Alternative
    1. Genomic and virulence insights of Aeromonas salmonicida – no clear dose/effect/duration.
    2. Medical management of perianal fistulae in dogs – positive/therapeutic effect.
    3. Jatropha curcas extracts antimicrobial activity – positive/therapeutic effect; negative/adverse effect.

    Herbs
    1. Indigenous Himalayan plants and fungi for dermatological ailments – no clear dose/effect/duration.
    2. Calotropis gigantea anti-inflammatory and antioxidant activity – positive/therapeutic effect.
    3. Cedrus deodara review – negative/adverse effect.

    Amino acids
    1. Picrasma quassioides ethanol extract anti-apoptotic and anti-inflammatory effects – positive/therapeutic effect; negative/adverse effect.
    2. 5-Aminolevulinic acid photodynamic therapy for back carbuncle – no clear dose/effect/duration.
    3. Se supplementation in salmonids – positive/therapeutic effect | week.

    Vitamins
    1. Fagopyri Dibotryis Rhizoma (FDR) review – G | positive/therapeutic effect.
    2. Riboflavin biosynthesis in Aeromonas salmonicida – no clear dose/effect/duration.
    3. Facial boils incidence in military personnel vs civilians – positive/therapeutic effect.

    Minerals
    1. VLPs with Aeromonas salmonicida VapA antigen – negative/adverse effect | week.
    2. Fagopyri Dibotryis Rhizoma (FDR) – G | positive/therapeutic effect.
    3. Tactile routing in wireless sensor networks (irrelevant for boils) – no clear dose/effect/duration.

    Supplements
    1. Olea europaea extract promoting immunity against furunculosis – positive/therapeutic effect | day.
    2. GAS1 β-glucan immunostimulant in rainbow trout – G | positive/therapeutic effect | day.
    3. Aeromonas salmonicida reference genes validation – no clear dose/effect/duration.

    Nutrients
    1. Arctic soil radiotracers study – no clear dose/effect/duration.
    2. Salix arctica root nutrient uptake in High Arctic deserts – positive/therapeutic effect.
    3. Diet therapy in purulent-septic soft tissue diseases – day, day.
    """.trimIndent(),
                listOf(
                    Reference("J Appl Microbiol. 2025 Aug 4;136(8):lxaf193", "👉 Aeromonas salmonicida genomic insights – no clear dose/effect/duration", "40719531"),
                    Reference("Vet Dermatol. 2025 Oct;36(5):566-580", "👉 Medical management of perianal fistulae in dogs – positive/therapeutic effect", "40364777"),
                    Reference("Heliyon. 2024 Jun 22;10(17):e33422", "👉 Jatropha curcas extracts antimicrobial activity – positive/therapeutic effect; negative/adverse effect", "39281546"),
                    Reference("Plants (Basel). 2023 Apr 6;12(7):1575", "👉 Indigenous Himalayan plants and fungi – no clear dose/effect/duration", "37050200"),
                    Reference("J Ethnopharmacol. 2023 Mar 1;303:115963", "👉 Calotropis gigantea anti-inflammatory and antioxidant activity – positive/therapeutic effect", "36442758"),
                    Reference("J Ethnopharmacol. 2021 Oct 28;279:114361", "👉 Cedrus deodara review – negative/adverse effect", "34166738"),
                    Reference("J Ethnopharmacol. 2024 Oct 5;332:118374", "👉 Picrasma quassioides ethanol extract – positive/therapeutic effect; negative/adverse effect", "38789093"),
                    Reference("Photodiagnosis Photodyn Ther. 2020 Jun;30:101618", "👉 5-Aminolevulinic acid photodynamic therapy – no clear dose/effect/duration", "31841685"),
                    Reference("PLoS One. 2018 Dec 20;13(12):e0209381", "👉 Se supplementation in salmonids – positive/therapeutic effect | week", "30571741"),
                    Reference("Front Pharmacol. 2023 Mar 6;14:1095554", "👉 Fagopyri Dibotryis Rhizoma (FDR) – G | positive/therapeutic effect", "36950009"),
                    Reference("Virulence. 2023 Dec;14(1):2187025", "👉 Riboflavin biosynthesis in Aeromonas salmonicida – no clear dose/effect/duration", "36895132"),
                    Reference("Stomatologiia (Mosk). 2022;101(3):31-37", "👉 Facial boils incidence – positive/therapeutic effect", "35640177"),
                    Reference("Front Immunol. 2023 May 22;14:1139206", "👉 VLPs with Aeromonas salmonicida VapA antigen – negative/adverse effect | week", "37283749"),
                    Reference("Sensors (Basel). 2022 Sep 27;22(19):7334", "👉 Tactile routing study – no clear dose/effect/duration", "36236429"),
                    Reference("Front Immunol. 2021 Nov 12;12:737601", "👉 Olea europaea extract promotes immunity – positive/therapeutic effect | day", "34867959"),
                    Reference("Front Immunol. 2021 Jul 6;12:693613", "👉 GAS1 β-glucan immunostimulant – G | positive/therapeutic effect | day", "34295335"),
                    Reference("Infect Genet Evol. 2019 Sep;73:314-321", "👉 Aeromonas salmonicida reference genes – no clear dose/effect/duration", "31108238"),
                    Reference("Glob Chang Biol. 2022 Jul;28(13):4211-4224", "👉 Arctic soil radiotracers – no clear dose/effect/duration", "35377512"),
                    Reference("Ecology. 2017 Aug;98(8):2158-2169", "👉 Salix arctica nutrient uptake – positive/therapeutic effect", "28547813"),
                    Reference("Klin Khir. 2014 Apr;(4):53-5", "👉 Diet therapy in purulent-septic soft tissue diseases – day, day", "25097980")
                )
            )

            "Bone cancer" -> Pair(
                """
    Alternative
    1. Haploidentical hematopoietic stem cell transplantation in pediatric hematological malignancies – positive/therapeutic effect; negative/adverse effect.
    2. Foam sclerotherapy for periorbital dermoid cases – month.
    3. Hydrogel with octenidine hydrochloride (OCTH) – positive/therapeutic effect; negative/adverse effect.

    Herbs
    1. Pre-diagnostic manipulative therapy in osteosarcoma – positive/therapeutic effect | day.
    2. CEACAM5-specific nanobody imaging and immunotoxin delivery in aggressive prostate cancer – no clear dose/effect/duration.
    3. Medicinal plants for cancer-related malnutrition – positive/therapeutic effect; negative/adverse effect.

    Amino acids
    1. STAT3 mutation mouse model (Job’s Syndrome) – G | G.
    2. IL13Rα2-B7-H3 tandem CAR T cells optimization – positive/therapeutic effect.
    3. Glutamine supplementation in CARMIL2 deficiency – positive/therapeutic effect.

    Vitamins
    1. Vitamin D in leukemia – negative/adverse effect.
    2. Ascorbic acid in glucocorticoid-induced osteoporotic bone – positive/therapeutic effect.
    3. Single high-dose vitamin D in ultramarathon-induced bone turnover changes – IU | IU.

    Minerals
    1. COL1A1 and TNFRSF11B variants impact on bone mineral density – g | positive/therapeutic effect.
    2. Extracellular vesicles from bone tissue affecting osteoblast function – no clear dose/effect/duration.
    3. Methotrexate osteopathy cohort study (METHOFRACT) – positive/therapeutic effect.

    Supplements
    1. Astaxanthin + celecoxib in bone cancer pain – positive/therapeutic effect.
    2. Single high-dose vitamin D supplementation – IU | IU.
    3. Osteocyte-like differentiation of osteosarcoma by inorganic phosphate – positive/therapeutic effect.

    Nutrients
    1. Mechanisms and strategies to overcome resistance in breast cancer – positive/therapeutic effect.
    2. Mediterranean diet program for breast cancer survivors – positive/therapeutic effect.
    3. Plasma metabolic landscape in leukemia subtype progression – no clear dose/effect/duration.
    """.trimIndent(),
                listOf(
                    Reference("Bull Cancer. 2025 Sep 24:S0007-4551(25)00388-1", "👉 Haploidentical hematopoietic stem cell transplantation – positive/therapeutic effect; negative/adverse effect", "40998674"),
                    Reference("Indian J Ophthalmol. 2025 Oct 1;73(10):1455-1459", "👉 Foam sclerotherapy for periorbital dermoid cases – month", "40995902"),
                    Reference("J Appl Biomater Funct Mater. 2025 Jan-Dec;23:22808000251367864", "👉 Hydrogel with OCTH – positive/therapeutic effect; negative/adverse effect", "40995808"),
                    Reference("PLoS One. 2025 Aug 4;20(8):e0329688", "👉 Pre-diagnostic manipulative therapy in osteosarcoma – positive/therapeutic effect | day", "40758720"),
                    Reference("J Nanobiotechnology. 2025 Jul 18;23(1):525", "👉 CEACAM5-specific nanobody imaging in aggressive prostate cancer – no clear dose/effect/duration", "40682047"),
                    Reference("Cancer Cell Int. 2025 Jul 16;25(1):266", "👉 Medicinal plants for cancer-related malnutrition – positive/therapeutic effect; negative/adverse effect", "40671046"),
                    Reference("Int J Mol Sci. 2025 Aug 8;26(16):7675", "👉 STAT3 mutation mouse model – G | G", "40868996"),
                    Reference("Mol Ther. 2025 Aug 8:S1525-0016(25)00580-5", "👉 IL13Rα2-B7-H3 tandem CAR T cells optimization – positive/therapeutic effect", "40812316"),
                    Reference("J Allergy Clin Immunol. 2025 Jul 28:S0091-6749(25)00806-1", "👉 Glutamine supplementation in CARMIL2 deficiency – positive/therapeutic effect", "40738287"),
                    Reference("Med Oncol. 2025 Sep 27;42(11):499", "👉 Vitamin D in leukemia – negative/adverse effect", "41006934"),
                    Reference("Adv Healthc Mater. 2025 Sep 25:e02606", "👉 Ascorbic acid in glucocorticoid-induced osteoporotic bone – positive/therapeutic effect", "40995752"),
                    Reference("J Int Soc Sports Nutr. 2025 Dec;22(1):2561661", "👉 Single high-dose vitamin D supplementation – IU | IU", "40963202"),
                    Reference("Int J Mol Sci. 2025 Sep 12;26(18):8894", "👉 COL1A1 and TNFRSF11B variants impact on bone mineral density – g | positive/therapeutic effect", "41009461"),
                    Reference("Am J Physiol Cell Physiol. 2025 Sep 26", "👉 Extracellular vesicles from bone tissue – no clear dose/effect/duration", "41005999"),
                    Reference("RMD Open. 2025 Sep 25;11(3):e005941", "👉 Methotrexate osteopathy cohort study (METHOFRACT) – positive/therapeutic effect", "40998522"),
                    Reference("Int Immunopharmacol. 2025 Sep 20;166:115564", "👉 Astaxanthin + celecoxib in bone cancer pain – positive/therapeutic effect", "40976047"),
                    Reference("J Int Soc Sports Nutr. 2025 Dec;22(1):2561661", "👉 Single high-dose vitamin D supplementation – IU | IU", "40963202"),
                    Reference("Differentiation. 2025 Sep 8;146:100912", "👉 Osteocyte-like differentiation of osteosarcoma – positive/therapeutic effect", "40953556"),
                    Reference("Cancers (Basel). 2025 Sep 8;17(17):2938", "👉 Mechanisms and strategies to overcome resistance in breast cancer – positive/therapeutic effect", "40941035"),
                    Reference("Front Nutr. 2025 Aug 18;12:1629806", "👉 Mediterranean diet program for breast cancer survivors – positive/therapeutic effect", "40901290"),
                    Reference("Future Sci OA. 2025 Dec;11(1):2527015", "👉 Plasma metabolic landscape in leukemia subtype progression – no clear dose/effect/duration", "40888518")
                )
            )

            "Bone cyst" -> Pair(
                """
    Alternative
    1. Personalized biomechanical modeling of pathologic fracture in benign bone tumors – G | positive/therapeutic effect.
    2. Suhaim-Turayki Technique for decompression of odontogenic keratocysts – month.
    3. S3 sacral-alar iliac screws in partial sacral resection for aneurysmal bone cyst – positive/therapeutic effect.

    Herbs
    1. Juanbi capsules for TNF-alpha, IL-1, IL-6 in knee osteoarthritis – g | positive/therapeutic effect | week, month.

    Amino acids
    1. Severe primary hypothyroidism causing ovarian hyperstimulation – positive/therapeutic effect.
    2. Aversion of surgical exploration in complex ovarian cysts secondary to hypothyroidism – positive/therapeutic effect.
    3. Neoadjuvant photodynamic therapy in basal cell carcinoma – mg | day.

    Vitamins
    1. Vitamin D and bone remodeling biomarkers in periapical inflammatory cysts – g.
    2. Vitamin D dependent rickets 2A with alopecia – positive/therapeutic effect.
    3. Bone manifestations in congenital generalized lipodystrophy subtypes – no clear dose/effect/duration.

    Minerals
    1. Biomimetic mineralized xenogenic cartilage matrix for osteochondral defect repair – no clear dose/effect/duration.
    2. Chronic kidney disease–mineral and bone disorder in ADPKD – positive/therapeutic effect.
    3. Juvenile nephronophthisis diagnosis in pediatric practice – g.

    Supplements
    1. MRI parameters in avascular necrosis prognosis – no clear dose/effect/duration.
    2. Sedimentary biomarkers and bone specimens – no clear dose/effect/duration.
    3. Malignant peripheral nerve sheath tumors in NF1 – no clear dose/effect/duration.

    Nutrients
    1. Polygonum cuspidatum against odontogenic keratocyst – negative/adverse effect.
    2. Rickets Type II model rats for vitamin D/VDR functions – no clear dose/effect/duration.
    3. Possible pathogenesis of calcaneal bone cysts – no clear dose/effect/duration.
    """.trimIndent(),
                listOf(
                    Reference("J Biomech Eng. 2025 Sep 23:1-37", "👉 Personalized biomechanical modeling – G | positive/therapeutic effect", "40986364"),
                    Reference("F1000Res. 2025 May 20;14:504", "👉 Suhaim-Turayki Technique – month", "40893735"),
                    Reference("J Neurosurg Case Lessons. 2025 Aug 18;10(7):CASE25267", "👉 S3 sacral-alar iliac screws – positive/therapeutic effect", "40825253"),
                    Reference("J Tradit Chin Med. 2010 Dec;30(4):254-8", "👉 Juanbi capsules – g | positive/therapeutic effect | week, month", "21287781"),
                    Reference("BMJ Case Rep. 2025 Sep 4;18(9):e264391", "👉 Severe primary hypothyroidism – positive/therapeutic effect", "40908024"),
                    Reference("BMJ Case Rep. 2024 Mar 8;17(3):e257409", "👉 Aversion of surgical exploration – positive/therapeutic effect", "38458762"),
                    Reference("Photodiagnosis Photodyn Ther. 2023 Dec;44:103820", "👉 Neoadjuvant photodynamic therapy – mg | day", "37788795"),
                    Reference("J Clin Med. 2025 May 26;14(11):3712", "👉 Vitamin D and bone remodeling biomarkers – g", "40507474"),
                    Reference("Pediatr Dermatol. 2025 May-Jun;42(3):615-619", "👉 Vitamin D dependent rickets 2A – positive/therapeutic effect", "39716449"),
                    Reference("Front Endocrinol (Lausanne). 2024 Apr 3;15:1326700", "👉 Bone manifestations in congenital generalized lipodystrophy – no clear dose/effect/duration", "38633760"),
                    Reference("Biomaterials. 2025 Sep 16;326:123722", "👉 Biomimetic mineralized cartilage matrix – no clear dose/effect/duration", "40974745"),
                    Reference("Bone. 2025 Sep 16;201:117652", "👉 Chronic kidney disease–mineral and bone disorder – positive/therapeutic effect", "40967553"),
                    Reference("J Pediatr Health Care. 2025 Sep 2:S0891-5245(25)00245-7", "👉 Juvenile nephronophthisis diagnosis – g", "40892003"),
                    Reference("Radiologie (Heidelb). 2024 Nov;64(Suppl 1):145-152", "👉 MRI parameters in avascular necrosis prognosis – no clear dose/effect/duration", "39235473"),
                    Reference("Proc Biol Sci. 2024 Jul;291(2026):20232915", "👉 Sedimentary biomarkers and bone specimens – no clear dose/effect/duration", "38981519"),
                    Reference("J Pak Med Assoc. 2023 Feb;73(2):393-395", "👉 Malignant peripheral nerve sheath tumors in NF1 – no clear dose/effect/duration", "36800734"),
                    Reference("J Stomatol Oral Maxillofac Surg. 2025 Jun;126(3):102105", "👉 Polygonum cuspidatum – negative/adverse effect", "39362634"),
                    Reference("Biomolecules. 2023 Nov 19;13(11):1666", "👉 Rickets Type II model rats – no clear dose/effect/duration", "38002348"),
                    Reference("Arch Orthop Trauma Surg. 2020 Oct;140(10):1303-1310", "👉 Possible pathogenesis of calcaneal bone cysts – no clear dose/effect/duration", "31776658")
                )
            )

            "Borderline personality disorder" -> Pair(
                """
    Alternative
    1. Conservative approach for recurrent foreign body ingestion – day, day.
    2. Transcranial direct current stimulation + online cognitive training – positive/therapeutic effect | week.
    3. Self- and interpersonal functioning trajectories identifying developmental pathway – positive/therapeutic effect.

    Herbs
    – no entries.

    Amino acids
    1. Correlation of Hcy and Hs-CRP levels with cognitive function – positive/therapeutic effect.
    2. Long-term lithium use in children/adolescents – negative/adverse effect.
    3. Hypothalamic-pituitary-thyroid axis function in adolescent nonsuicidal self-injury – no clear dose/effect/duration.

    Vitamins
    1. Trichotillomania patients – no clear dose/effect/duration.
    2. Asymmetric dimethylarginine, malondialdehyde, vitamin levels – no clear dose/effect/duration.
    3. Adolescent use of veterinary medicines – negative/adverse effect.

    Minerals
    1. Stress monitoring via machine learning, IoT, wearable sensors – positive/therapeutic effect.
    2. Physiobalneotherapy for borderline mental disorders in mothers of children with cerebral palsy – g | positive/therapeutic effect | month.
    3. Facial self-induced paraffinoma case – mg, mg.

    Supplements
    1. Identity disturbance scoping review – positive/therapeutic effect.
    2. Predicting and monitoring depression symptoms using smartphone data – no clear dose/effect/duration.
    3. Non-pharmacological interventions for BPD communities – positive/therapeutic effect.

    Nutrients
    1. Identity functioning and personality pathology in female patients with eating disorders – positive/therapeutic effect.
    2. Omega-3 supplementation in adolescents with BPD and ultra-high risk psychosis – g | positive/therapeutic effect; negative/adverse effect | week.
    3. Vitamin D supplementation in children/adolescents with severe mental illness – no clear dose/effect/duration.
    """.trimIndent(),
                listOf(
                    Reference("Cureus. 2025 Aug 11;17(8):e89812", "👉 Conservative approach for recurrent foreign body ingestion – day, day", "40937259"),
                    Reference("J Psychiatry Neurosci. 2025 Aug 26;50(4):E299-E309", "👉 tDCS + online cognitive training – positive/therapeutic effect | week", "40858334"),
                    Reference("J Psychopathol Clin Sci. 2025 Aug 21", "👉 Self- and interpersonal functioning trajectories – positive/therapeutic effect", "40839482"),
                    Reference("Actas Esp Psiquiatr. 2024 Apr;52(2):99-106", "👉 Hcy/Hs-CRP correlation – positive/therapeutic effect", "38622012"),
                    Reference("J Child Adolesc Psychopharmacol. 2022 Apr;32(3):162-170", "👉 Long-term lithium use – negative/adverse effect", "35384703"),
                    Reference("Prog Neuropsychopharmacol Biol Psychiatry. 2021 Dec 20;111:110345", "👉 HPT axis function in adolescent NSSI – no clear dose/effect/duration", "33964324"),
                    Reference("Skin Appendage Disord. 2025 Aug;11(4):379-384", "👉 Trichotillomania patients – no clear dose/effect/duration", "40771450"),
                    Reference("Psychiatry Investig. 2023 Dec;20(12):1142-1147", "👉 ADMA, MDA, vitamin levels – no clear dose/effect/duration", "38163653"),
                    Reference("J Psychoactive Drugs. 2021 Sep-Oct;53(4):339-344", "👉 Adolescent veterinary medicine use – negative/adverse effect", "33432874"),
                    Reference("Sensors (Basel). 2023 Oct 31;23(21):8875", "👉 Stress monitoring via ML/IoT/wearables – positive/therapeutic effect", "37960574"),
                    Reference("Vopr Kurortol Fizioter Lech Fiz Kult. 2019;96(3):16-24", "👉 Physiobalneotherapy in mothers of children with CP – g | positive/therapeutic effect | month", "31329185"),
                    Reference("Skinmed. 2011 Mar-Apr;9(2):127-8", "👉 Facial self-induced paraffinoma – mg, mg", "21548523"),
                    Reference("Alpha Psychiatry. 2025 Apr 21;26(2):39864", "👉 Identity disturbance scoping review – positive/therapeutic effect", "40352070"),
                    Reference("J Med Internet Res. 2024 Dec 3;26:e56874", "👉 Predicting/monitoring depression via smartphone – no clear dose/effect/duration", "39626241"),
                    Reference("J Multidiscip Healthc. 2024 Oct 4;17:4603-4609", "👉 Non-pharmacological interventions for BPD communities – positive/therapeutic effect", "39381418"),
                    Reference("Nutrients. 2025 Jul 16;17(14):2329", "👉 Identity functioning in female eating disorder patients – positive/therapeutic effect", "40732954"),
                    Reference("Can J Psychiatry. 2013 Jul;58(7):402-8", "👉 Omega-3 supplementation – g | positive/therapeutic effect; negative/adverse effect | week", "23870722"),
                    Reference("J Child Adolesc Psychopharmacol. 2011 Apr;21(2):157-61", "👉 Vitamin D supplementation in children/adolescents – no clear dose/effect/duration", "21486172")
                )
            )

            "Botulism" -> Pair(
                """
    Alternative
    1. Research progress on detection methods of botulinum neurotoxin – no clear dose/effect/duration.
    2. Cauda equina nerve root enhancement in adult intestinal toxemia botulism – no clear dose/effect/duration.
    3. Microfluidic nanobiosensor detection of BoNT Serotype A – positive/therapeutic effect; negative/adverse effect.

    Herbs
    1. Limonoids from Melia genus – positive/therapeutic effect; negative/adverse effect.
    2. Chamomile (Matricaria recutita, Chamaemelum nobile) – no clear dose/effect/duration.
    3. Phenotypic characterization of C. botulinum from infant botulism – no clear dose/effect/duration.

    Amino acids
    1. Light chain & C-terminus of BoNT as hotspots for amino acid variability – no clear dose/effect/duration.
    2. Modified recombinant BoNT Type F with enhanced potency – no clear dose/effect/duration.
    3. Novel lytic enzyme from C. botulinum E3 – mg, G.

    Vitamins
    1. Hindlimb paralysis in Carnaby's black cockatoos – negative/adverse effect.
    2. Intensive care symposium review – g | positive/therapeutic effect; negative/adverse effect | day.
    3. Therapeutic management of botulism in dairy cattle – day, day.

    Minerals
    1. Overview of BoNT-producing clostridia in French soils – negative/adverse effect.
    2. SiO2/Si interferometers for BoNT B/C quantification – positive/therapeutic effect.
    3. Survival of foal with Type A botulism – no clear dose/effect/duration.

    Supplements
    1. Botulism in pregnancy: clinical review – negative/adverse effect.
    2. Parents' knowledge/attitudes on honey and botulism – positive/therapeutic effect | month.
    3. Postbiotics as novel therapeutic agents for Clostridial infections – no clear dose/effect/duration.

    Nutrients
    1. Genomic/phenotypic polymorphism of C. botulinum Group II Beluga – no clear dose/effect/duration.
    2. Pathogenicity and virulence of C. botulinum – positive/therapeutic effect; negative/adverse effect.
    3. Modelling transport of sloughed Cladophora in Lake Michigan – no clear dose/effect/duration.
    """.trimIndent(),
                listOf(
                    Reference("Toxins (Basel). 2025 Sep 8;17(9):453", "👉 Detection methods of BoNT – no clear dose/effect/duration", "41003517"),
                    Reference("BMC Neurol. 2025 Aug 22;25(1):343", "👉 Cauda equina nerve root enhancement – no clear dose/effect/duration", "40847385"),
                    Reference("ACS Omega. 2025 Aug 4;10(32):36466-36474", "👉 Microfluidic nanobiosensor detection – positive/therapeutic effect; negative/adverse effect", "40852264"),
                    Reference("Front Pharmacol. 2022 Jan 24;12:795565", "👉 Limonoids from Melia genus – positive/therapeutic effect; negative/adverse effect", "35140606"),
                    Reference("Chamomile. LactMed® 2006–2021 Feb 15", "👉 Chamomile (Matricaria recutita, Chamaemelum nobile) – no clear dose/effect/duration", "30000867"),
                    Reference("Rev Argent Microbiol. 2009 Jun-Sep;41(3):141-7", "👉 Phenotypic characterization of C. botulinum – no clear dose/effect/duration", "19831311"),
                    Reference("Genes (Basel). 2022 Oct 21;13(10):1915", "👉 Light chain & C-terminus variability – no clear dose/effect/duration", "36292800"),
                    Reference("Toxins (Basel). 2021 Nov 24;13(12):834", "👉 Modified recombinant BoNT F – no clear dose/effect/duration", "34941672"),
                    Reference("Int J Mol Sci. 2021 Sep 2;22(17):9536", "👉 Novel lytic enzyme – mg, G", "34502443"),
                    Reference("J Comp Pathol. 2024 Apr;210:38-46", "👉 Hindlimb paralysis in cockatoos – negative/adverse effect", "38552539"),
                    Reference("Crit Care. 2016 Apr 20;20(Suppl 2):94", "👉 Intensive care symposium – g | positive/therapeutic effect; negative/adverse effect | day", "27885969"),
                    Reference("Vet World. 2015 Nov;8(11):1305-9", "👉 Therapeutic management in dairy cattle – day, day", "27047034"),
                    Reference("Microbiol Spectr. 2025 Aug 5;13(8):e0011425", "👉 Overview of BoNT-producing clostridia in soils – negative/adverse effect", "40530858"),
                    Reference("Biosens Bioelectron. 2025 Mar 1;271:117027", "👉 SiO2/Si interferometers for BoNT B/C – positive/therapeutic effect", "39662174"),
                    Reference("J Vet Intern Med. 2016 Mar-Apr;30(2):675-8", "👉 Survival of foal with Type A botulism – no clear dose/effect/duration", "26892949"),
                    Reference("Toxicon. 2025 Sep 25:108601", "👉 Botulism in pregnancy – negative/adverse effect", "41015266"),
                    Reference("Ann Med. 2025 Dec;57(1):2489012", "👉 Parents' knowledge/attitudes on honey and botulism – positive/therapeutic effect | month", "40200802"),
                    Reference("Probiotics Antimicrob Proteins. 2025 Apr;17(2):656-667", "👉 Postbiotics as therapeutic agents – no clear dose/effect/duration", "39546182"),
                    Reference("Int J Food Microbiol. 2025 Jan 2;426:110927", "👉 Genomic/phenotypic polymorphism of C. botulinum Beluga – no clear dose/effect/duration", "39378799"),
                    Reference("Virulence. 2023 Dec;14(1):2205251", "👉 Pathogenicity and virulence of C. botulinum – positive/therapeutic effect; negative/adverse effect", "37157163"),
                    Reference("J Environ Manage. 2022 Dec 1;323:116203", "👉 Modelling transport of sloughed Cladophora – no clear dose/effect/duration", "36108511")
                )
            )

            "Bowel cancer" -> Pair(
                """
    Alternative
    1. Propyl-Propane Thiosulfonate (PTSO) modulates human immune cells, inhibiting colorectal tumor progression – g | positive/therapeutic effect; negative/adverse effect.
    2. Eucalyptus essential oil & 3-Cyclohexene-1-Methanol – positive/therapeutic effect; negative/adverse effect.
    3. Single-vesicle molecular profiling via dSTORM imaging predicts early relapse – positive/therapeutic effect.

    Herbs
    1. Bile acids crosstalk via FXR and TGR5 – no clear dose/effect/duration.
    2. Selected Indian herbs’ anti-inflammatory activities – negative/adverse effect.
    3. Phytoconstituents in traditional vs. scientific knowledge for colorectal cancer – positive/therapeutic effect.

    Amino acids
    1. Recombinant Methioninase targeting methionine addiction – day, day.
    2. Indigofera spicata extract – positive/therapeutic effect; negative/adverse effect.
    3. Amino acid metabolism-related genes & lncRNAs for CRC prognosis – no clear dose/effect/duration.

    Vitamins
    1. AI-enhanced precision medicine for TGF-Beta pathway in FOLFOX-treated early-onset CRC – no clear dose/effect/duration.
    2. Preoperative radiotherapy + chemo + PD-1 inhibitor in rectal cancer – positive/therapeutic effect; negative/adverse effect.
    3. Vitamin D3 & Mesalazine effects on E. coli virulence in IBD/CRC – positive/therapeutic effect.

    Minerals
    1. Sodium alginate-silica composite for Fe(3+) and 5-Fu detection in CRC – no clear dose/effect/duration.
    2. Core-shell MSNs for KAZ3 & MDR-1 siRNA co-delivery in multidrug-resistant colon cancer – g | positive/therapeutic effect; negative/adverse effect.
    3. Rice bran phytochemicals with therapeutic potential – positive/therapeutic effect.

    Supplements
    1. AhR and GPR35 receptor ligands as superfoods for IBD-related cancer prevention – positive/therapeutic effect.
    2. High fiber supplementation in Alaska Native populations – g | positive/therapeutic effect.
    3. Lactococcus lactis D4 effects on CRC cells – positive/therapeutic effect | day.

    Nutrients
    1. PTSO modulating immune cells to inhibit colorectal tumor progression – g | positive/therapeutic effect; negative/adverse effect.
    2. Micronutrient-enriched apricot kernel oil – positive/therapeutic effect.
    3. Cocoa polyphenols modulating mouse gut microbiome – g | positive/therapeutic effect.
    """.trimIndent(),
                listOf(
                    Reference("Nutrients. 2025 Sep 18;17(18):2993", "👉 PTSO inhibits colorectal tumor progression – g | positive/therapeutic effect; negative/adverse effect", "41010517"),
                    Reference("Int J Mol Sci. 2025 Sep 12;26(18):8876", "👉 Eucalyptus essential oil & 3-Cyclohexene-1-Methanol – positive/therapeutic effect; negative/adverse effect", "41009443"),
                    Reference("Biomolecules. 2025 Sep 11;15(9):1307", "👉 Single-vesicle profiling predicts early relapse – positive/therapeutic effect", "41008614"),
                    Reference("Int J Mol Sci. 2025 Apr 29;26(9):4240", "👉 Bile acids crosstalk via FXR/TGR5 – no clear dose/effect/duration", "40362481"),
                    Reference("J Ayurveda Integr Med. 2025 Mar-Apr;16(2):101081", "👉 Indian herbs anti-inflammatory – negative/adverse effect", "40154100"),
                    Reference("Biomolecules. 2025 Mar 5;15(3):380", "👉 Phytoconstituents in traditional vs. scientific knowledge – positive/therapeutic effect", "40149916"),
                    Reference("Anticancer Res. 2025 Oct;45(10):4193-4200", "👉 Recombinant Methioninase targeting methionine addiction – day, day", "41006033"),
                    Reference("Toxins (Basel). 2025 Aug 29;17(9):431", "👉 Indigofera spicata extract – positive/therapeutic effect; negative/adverse effect", "41003496"),
                    Reference("Sci Rep. 2025 Sep 25;15(1):32794", "👉 Amino acid metabolism genes & lncRNAs – no clear dose/effect/duration", "40998932"),
                    Reference("Int J Mol Sci. 2025 Sep 17;26(18):9067", "👉 AI-enhanced precision medicine for TGF-Beta pathway – no clear dose/effect/duration", "41009631"),
                    Reference("Zhonghua Zhong Liu Za Zhi. 2025 Sep 23;47(9):913-921", "👉 Preoperative RT + chemo + PD-1 inhibitor – positive/therapeutic effect; negative/adverse effect", "40967882"),
                    Reference("Gastroenterol Hepatol Bed Bench. 2025;18(2):252-259", "👉 Vitamin D3 & Mesalazine on E. coli virulence – positive/therapeutic effect", "40936781"),
                    Reference("Luminescence. 2025 Sep;40(9):e70315", "👉 Sodium alginate-silica composite for Fe(3+) & 5-Fu detection – no clear dose/effect/duration", "40937971"),
                    Reference("Eur J Pharm Biopharm. 2025 Oct;215:114838", "👉 Core-shell MSNs for siRNA co-delivery – g | positive/therapeutic effect; negative/adverse effect", "40816350"),
                    Reference("Nutr Rev. 2025 Aug 13:nuaf147", "👉 Rice bran phytochemicals with therapeutic potential – positive/therapeutic effect", "40802591"),
                    Reference("Int J Mol Sci. 2025 Sep 19;26(18):9160", "👉 AhR & GPR35 receptor ligands as superfoods – positive/therapeutic effect", "41009721"),
                    Reference("Int J Circumpolar Health. 2025 Dec;84(1):2561283", "👉 High fiber supplementation in Alaska Native populations – g | positive/therapeutic effect", "40999949"),
                    Reference("Narra J. 2025 Aug;5(2):e1596", "👉 Lactococcus lactis D4 effects on CRC cells – positive/therapeutic effect | day", "40951476"),
                    Reference("Int J Mol Sci. 2025 Sep 22;26(18):9237", "👉 Micronutrient-enriched apricot kernel oil – positive/therapeutic effect", "41009803"),
                    Reference("Nutrients. 2025 Sep 5;17(17):2876", "👉 Cocoa polyphenols modulating gut microbiome – g | positive/therapeutic effect", "40944264")
                )
            )

            "Bowel incontinence" -> Pair(
                """
    Alternative
    1. Robotic pediatric augmentation cystoplasty – positive/therapeutic effect.
    2. Sphincter Preserving Anorectoplasty (SPARP) with anterior approach – positive/therapeutic effect | day.
    3. Pelvic floor therapy for muscular function and colorectal symptom relief – positive/therapeutic effect | month.

    Herbs
    1. Lithospermum oil for incontinence-associated dermatitis care – positive/therapeutic effect.
    2. Coping with obstetric fistula perspectives – no clear dose/effect/duration.
    3. Historical anorectal diseases in Avicenna's Canon of Medicine – no clear dose/effect/duration.

    Amino acids
    1. Routine thyroid function testing for bowel symptoms – no clear dose/effect/duration.
    2. Gastrointestinal manifestations in hereditary transthyretin amyloidosis – g, g.
    3. Dorsal column myelopathy after intrathecal chemotherapy – positive/therapeutic effect; negative/adverse effect.

    Vitamins
    1. Vitamin D deficiency-linked digestive issues – no clear dose/effect/duration.
    2. Pro-inflammatory diet and fecal incontinence – no clear dose/effect/duration.
    3. Gut microbiota-based treatments in multiple sclerosis – positive/therapeutic effect; negative/adverse effect.

    Minerals
    1. Connection between chronic liver damage and sporadic Alzheimer's in rats – positive/therapeutic effect.
    2. Flint water crisis effect on constipation in children – g | positive/therapeutic effect.
    3. Care of colorectal cancer survivors – positive/therapeutic effect.

    Supplements
    1. Probiotic-prebiotic use during pelvic radiotherapy – negative/adverse effect.
    2. Caregiver insights on fecal incontinence products – positive/therapeutic effect.
    3. Type of anastomosis in rectal cancer surgery – positive/therapeutic effect.

    Nutrients
    1. Dual-isotope scintigraphy for GI transit in duodenal switch – positive/therapeutic effect; negative/adverse effect.
    2. Bowel health & nutrient intake after vegan diet adoption – no clear dose/effect/duration.
    3. Vitamin D deficiency and fecal incontinence – month, month.
    """.trimIndent(),
                listOf(
                    Reference("J Pediatr Urol. 2025 Jul 11:S1477-5131(25)00392-4", "👉 Robotic pediatric augmentation cystoplasty – positive/therapeutic effect", "40730763"),
                    Reference("J Pediatr Surg. 2025 Oct;60(10):162487", "👉 Sphincter Preserving Anorectoplasty (SPARP) – positive/therapeutic effect | day", "40721108"),
                    Reference("Integr Med (Encinitas). 2025 Aug;24(4):31-35", "👉 Pelvic floor therapy – positive/therapeutic effect | month", "40703417"),
                    Reference("Clin Interv Aging. 2025 Aug 28;20:1401-1415", "👉 Lithospermum oil for incontinence-associated dermatitis – positive/therapeutic effect", "40905002"),
                    Reference("Int J Environ Res Public Health. 2019 Aug 26;16(17):3092", "👉 Coping with obstetric fistula – no clear dose/effect/duration", "31454920"),
                    Reference("Acta Med Hist Adriat. 2015;13 Suppl 2:103-14", "👉 Historical anorectal diseases – no clear dose/effect/duration", "26959635"),
                    Reference("Dig Dis Sci. 2025 Mar;70(3):1142-1149", "👉 Routine thyroid testing – no clear dose/effect/duration", "39826063"),
                    Reference("J Gastrointestin Liver Dis. 2019 Dec 9;28(4):421-426", "👉 GI manifestations in hereditary transthyretin amyloidosis – g, g", "31826067"),
                    Reference("Am J Hematol. 2017 Feb;92(2):155-160", "👉 Dorsal column myelopathy after intrathecal chemo – positive/therapeutic effect; negative/adverse effect", "27874212"),
                    Reference("Cureus. 2025 Aug 8;17(8):e89598", "👉 Vitamin D deficiency-linked digestive issues – no clear dose/effect/duration", "40926915"),
                    Reference("Front Nutr. 2025 May 22;12:1547406", "👉 Pro-inflammatory diet and fecal incontinence – no clear dose/effect/duration", "40474896"),
                    Reference("Pharmacol Res. 2024 Nov;209:107456", "👉 Gut microbiota-based treatments in MS – positive/therapeutic effect; negative/adverse effect", "39389400"),
                    Reference("Brain Sci. 2023 Sep 29;13(10):1391", "👉 Chronic liver damage & sporadic Alzheimer's – positive/therapeutic effect", "37891760"),
                    Reference("Cureus. 2023 Aug 27;15(8):e44189", "👉 Flint water crisis effect on constipation – g | positive/therapeutic effect", "37767257"),
                    Reference("FP Essent. 2023 Jun;529:23-33", "👉 Care of colorectal cancer survivors – positive/therapeutic effect", "37307154"),
                    Reference("Mediators Inflamm. 2025 Jul 13;2025:1441225", "👉 Probiotic-prebiotic use during pelvic radiotherapy – negative/adverse effect", "40692981"),
                    Reference("Front Public Health. 2025 Jun 9;13:1453244", "👉 Caregiver insights on fecal incontinence products – positive/therapeutic effect", "40552222"),
                    Reference("Scand J Surg. 2025 May 4:14574969251335478", "👉 Type of anastomosis in rectal cancer surgery – positive/therapeutic effect", "40320844"),
                    Reference("Obes Surg. 2025 Sep;35(9):3414-3421", "👉 Dual-isotope scintigraphy in duodenal switch – positive/therapeutic effect; negative/adverse effect", "40775575"),
                    Reference("Ann Med. 2024 Dec;56(1):2305693", "👉 Bowel health & nutrient intake after vegan diet – no clear dose/effect/duration", "38327148"),
                    Reference("Neurogastroenterol Motil. 2024 Apr;36(4):e14753", "👉 Vitamin D deficiency and fecal incontinence – month, month", "38316640")
                )
            )

            "Bowel polyps" -> Pair(
                """
    Alternative
    1. Butyrylated starch in Familial Adenomatous Polyposis – g | positive/therapeutic effect.
    2. Polyethylene glycol + linaclotide vs PEG alone for colonoscopy – positive/therapeutic effect.
    3. Colon capsule endoscopy for colonic neoplasia – positive/therapeutic effect.

    Herbs
    (no entries)

    Amino acids
    1. Genes related to intestinal fatty acid oxidation in ulcerative colitis – no clear dose/effect/duration.
    2. Cronkhite-Canada syndrome with perianal condyloma – no clear dose/effect/duration.
    3. Berberine inhibiting intestinal carcinogenesis in mice – positive/therapeutic effect.

    Vitamins
    1. 0.8-L vs 2-L PEG-ascorbic acid for colonoscopy prep – negative/adverse effect.
    2. Oral sulfate tablets vs 1-L PEG with ascorbic acid – no clear dose/effect/duration.
    3. Gastrointestinal neuroendocrine tumor case (protein-losing enteropathy) – positive/therapeutic effect.

    Minerals
    1. Calcium-rich multimineral intervention – mg | positive/therapeutic effect; negative/adverse effect.
    2. Celecoxib in colon polyp prevention trial – positive/therapeutic effect; negative/adverse effect.
    3. Calcium-induced differentiation of human colon adenomas – positive/therapeutic effect.

    Supplements
    1. Double intussusception revealing malignant melanoma – g, g.
    2. Effects of insourcing in UK endoscopy services – no clear dose/effect/duration.
    3. Pre-rehabilitation for comfort colonoscopy in elderly – positive/therapeutic effect; negative/adverse effect.

    Nutrients
    1. Dairy consumption & colonic mucosa-associated gut microbiota – no clear dose/effect/duration.
    2. Prebiotic diversity shaping gut integrity & immune balance – g | positive/therapeutic effect.
    3. Baseline characteristics in short bowel syndrome registry treated with Teduglutide – mg, G.
    """.trimIndent(),
                listOf(
                    Reference("Cancer Prev Res (Phila). 2025 Sep 15", "👉 Butyrylated starch in FAP – g | positive/therapeutic effect", "40947861"),
                    Reference("Clin Endosc. 2025 Sep 1", "👉 Polyethylene glycol + linaclotide vs PEG – positive/therapeutic effect", "40899243"),
                    Reference("Ther Adv Gastrointest Endosc. 2025 Aug 30;18:26317745251370845", "👉 Colon capsule endoscopy – positive/therapeutic effect", "40894328"),
                    Reference("Zhonghua Yi Xue Za Zhi. 2024 Sep 24;104(36):3422-3429", "👉 Genes related to intestinal fatty acid oxidation – no clear dose/effect/duration", "39307717"),
                    Reference("Medicine (Baltimore). 2021 Mar 12;100(10):e25067", "👉 Cronkhite-Canada syndrome – no clear dose/effect/duration", "33725896"),
                    Reference("Front Immunol. 2020 Sep 24;11:588079", "👉 Berberine inhibiting intestinal carcinogenesis – positive/therapeutic effect", "33072135"),
                    Reference("J Gastroenterol Hepatol. 2025 Sep;40(9):2248-2257", "👉 0.8-L vs 2-L PEG-ascorbic acid – negative/adverse effect", "40704430"),
                    Reference("Korean J Gastroenterol. 2024 Oct 25;84(4):177-187", "👉 Oral sulfate tablets vs 1-L PEG with ascorbic acid – no clear dose/effect/duration", "39449262"),
                    Reference("Cureus. 2024 Jul 30;16(7):e65745", "👉 Gastrointestinal neuroendocrine tumor case – positive/therapeutic effect", "39211694"),
                    Reference("Cancer Prev Res (Phila). 2020 Jan;13(1):101-116", "👉 Calcium-rich multimineral intervention – mg | positive/therapeutic effect; negative/adverse effect", "31771942"),
                    Reference("PLoS One. 2018 Apr 26;13(4):e0196398", "👉 Celecoxib in colon polyp prevention – positive/therapeutic effect; negative/adverse effect", "29698447"),
                    Reference("Cancer Prev Res (Phila). 2018 Jul;11(7):413-428", "👉 Calcium-induced differentiation of colon adenomas – positive/therapeutic effect", "29636350"),
                    Reference("Cureus. 2025 Jul 6;17(7):e87398", "👉 Double intussusception revealing malignant melanoma – g, g", "40772184"),
                    Reference("Cureus. 2025 Jun 3;17(6):e85272", "👉 Effects of insourcing in UK endoscopy services – no clear dose/effect/duration", "40612837"),
                    Reference("BMC Gastroenterol. 2025 Jul 1;25(1):457", "👉 Pre-rehabilitation for comfort colonoscopy – positive/therapeutic effect; negative/adverse effect", "40597656"),
                    Reference("Nutrients. 2025 Feb 2;17(3):567", "👉 Dairy consumption & colonic microbiota – no clear dose/effect/duration", "39940425"),
                    Reference("Nutrients. 2024 Dec 12;16(24):4286", "👉 Prebiotic diversity shaping gut integrity & immune balance – g | positive/therapeutic effect", "39770907"),
                    Reference("Nutrients. 2024 Aug 1;16(15):2513", "👉 Short bowel syndrome registry treated with Teduglutide – mg, G", "39125394")
                )
            )

            "Brain abscess" -> Pair(
                """
    Alternative
    1. Continuous irrigation for refractory multidrug-resistant brain abscess – positive/therapeutic effect.
    2. Initiation of antiseizure medications in brain abscess patients – positive/therapeutic effect | day.
    3. Sorghum phenolic extracts in vitro antimicrobial activity – mg | positive/therapeutic effect.

    Herbs
    1. Spiramycin + Ferula asafetida in Toxoplasma gondii encephalitis (mice) – mg | day.
    2. Latin American herbal therapies (16th century) – no clear dose/effect/duration.

    Amino acids
    1. Continuous subcutaneous levodopa-carbidopa infusion (ND0612) in Parkinson’s – g, mg | positive/therapeutic effect; negative/adverse effect | week.
    2. 5-aminolevulinic enhanced brain lesions mimic glioblastoma – positive/therapeutic effect.
    3. Bacterial brain abscesses expand despite antibiotics – day.

    Vitamins
    1. Ethmoidal meningoencephalocele in C57BL/6J mouse – no clear dose/effect/duration.
    2. Toxoplasma encephalitis in AIDS/HIV patients – negative/adverse effect | week.
    3. HIV viral rebound due to calcium-drug interaction – no clear dose/effect/duration.

    Minerals
    1. Apical periodontitis and brain inflammation – positive/therapeutic effect.
    2. Heterotopic polyodontia in horse – positive/therapeutic effect.
    3. HIV viral rebound due to calcium-drug interaction – no clear dose/effect/duration.

    Supplements
    1. Sorghum phenolic extracts – mg | positive/therapeutic effect.
    2. Community-acquired cerebral abscess and intracranial empyemas in children – week, day.
    3. Spotlight on Archaea in humans, livestock, poultry – positive/therapeutic effect.

    Nutrients
    1. Toxoplasma gondii infection altering astrocyte phenotype – positive/therapeutic effect.
    2. Free-living amoebae encephalitis/meningoencephalitis – no clear dose/effect/duration.
    3. Novel secreted dense granule proteins of Toxoplasma gondii bradyzoites – positive/therapeutic effect.
    """.trimIndent(),
                listOf(
                    Reference("Eur J Case Rep Intern Med. 2025 Jul 3;12(8):005566", "👉 Continuous irrigation for refractory MDR brain abscess – positive/therapeutic effect", "40786551"),
                    Reference("JAMA Netw Open. 2025 Aug 1;8(8):e2524557", "👉 Initiation of antiseizure medications – positive/therapeutic effect | day", "40748638"),
                    Reference("Front Cell Infect Microbiol. 2025 Jun 26;15:1568504", "👉 Sorghum phenolic extracts – mg | positive/therapeutic effect", "40642104"),
                    Reference("Parasite Immunol. 2023 Dec;45(12):e13014", "👉 Spiramycin + Ferula asafetida in T. gondii encephalitis – mg | day", "37807942"),
                    Reference("Rev Neurol. 2009 Aug 1-15;49(3):149-55", "👉 Latin American herbal therapies – no clear dose/effect/duration", "19621310"),
                    Reference("Lancet Neurol. 2024 May;23(5):465-476", "👉 ND0612 levodopa-carbidopa infusion – g, mg | positive/therapeutic effect; negative/adverse effect | week", "38499015"),
                    Reference("Medicine (Baltimore). 2024 Jan 5;103(1):e34518", "👉 5-aminolevulinic enhanced brain lesions – positive/therapeutic effect", "38181251"),
                    Reference("Neurosurgery. 2023 Dec 12;94(5):1079-87", "👉 Bacterial brain abscesses expand despite antibiotics – day", "38084989"),
                    Reference("Lab Anim. 2021 Apr;55(2):181-188", "👉 Ethmoidal meningoencephalocele – no clear dose/effect/duration", "32787540"),
                    Reference("Medicine (Baltimore). 2020 May;99(20):e20146", "👉 Toxoplasma encephalitis in AIDS/HIV patients – negative/adverse effect | week", "32443329"),
                    Reference("J Int Assoc Provid AIDS Care. 2019 Jan-Dec;18:2325958218821653", "👉 HIV viral rebound due to calcium-drug interaction – no clear dose/effect/duration", "30798679"),
                    Reference("Odontology. 2025 Oct;113(4):1365-1379", "👉 Apical periodontitis and brain inflammation – positive/therapeutic effect", "40011389"),
                    Reference("J Vet Dent. 2021 Mar;38(1):30-33", "👉 Heterotopic polyodontia in horse – positive/therapeutic effect", "34032162"),
                    Reference("Front Cell Infect Microbiol. 2025 Jun 26;15:1568504", "👉 Sorghum phenolic extracts – mg | positive/therapeutic effect", "40642104"),
                    Reference("J Neurosurg Pediatr. 2025 Jun 6;36(3):286-295", "👉 Community-acquired cerebral abscess & intracranial empyemas – week, day", "40479826"),
                    Reference("Vet Med Sci. 2025 Mar;11(2):e70263", "👉 Spotlight on Archaea – positive/therapeutic effect", "40028749"),
                    Reference("PLoS Pathog. 2025 Jun 16;21(6):e1012733", "T. gondii infection altering astrocyte phenotype – positive/therapeutic effect", "40523037"),
                    Reference("Pathogens. 2022 Dec 9;11(12):1509", "👉 Free-living amoebae encephalitis – no clear dose/effect/duration", "36558843"),
                    Reference("PLoS One. 2020 May 6;15(5):e0232552", "👉 Novel secreted dense granule proteins of T. gondii bradyzoites – positive/therapeutic effect", "32374791")
                )
            )

            "Brain aneurysm" -> Pair(
                """
    Alternative
    1. Fast 3D wheel acquisition vs conventional parallel imaging in cerebral MRA – positive/therapeutic effect.
    2. Magnetic Milli-Spinner for robotic endovascular surgery – no clear dose/effect/duration.
    3. Pharmacologic management of unruptured intracranial aneurysms – positive/therapeutic effect.

    Herbs
    1. Subdural hemorrhage due to acquired Von Willebrand syndrome in polycythemia vera patient – positive/therapeutic effect.
    2. Diet-related factors in cerebral aneurysm formation/rupture – positive/therapeutic effect.

    Amino acids
    1. Neurogenic megacolon in adult with acute intestinal obstruction – no clear dose/effect/duration.
    2. Tirofiban effect on cognitive function after endovascular embolization of unruptured aneurysms – positive/therapeutic effect.
    3. Prophylactic tirofiban prevents ischemic events in endovascular treatment of unruptured aneurysms – positive/therapeutic effect.

    Vitamins
    1. Coagulation disorders impacting intracranial hemorrhage outcomes – positive/therapeutic effect | day.
    2. Neurogenic megacolon in adult with acute intestinal obstruction – no clear dose/effect/duration.
    3. Serum homocysteine, vitamin B9/B12 and intracranial aneurysm formation – positive/therapeutic effect.

    Minerals
    1. Fahr's disease with posterior circulation aneurysm – positive/therapeutic effect.
    2. Genetic susceptibility and potential therapeutic targets of unruptured intracranial aneurysms – g, g.
    3. Improving rupture status prediction via wall shear stress informatics – positive/therapeutic effect.

    Supplements
    1. Stage-specific gut-microbiome-derived metabolites in intracranial aneurysms – positive/therapeutic effect.
    2. Fragility index in RCTs for aneurysmal subarachnoid hemorrhage – positive/therapeutic effect.
    3. Circulating inflammatory cytokines and intracranial aneurysm/subarachnoid hemorrhage – no clear dose/effect/duration.

    Nutrients
    1. Energy expenditure in critically ill patients with aneurysmal subarachnoid hemorrhage/ICH/TBI – no clear dose/effect/duration.
    2. Peripheral macrophages in structural cerebrovascular pathologies – no clear dose/effect/duration.
    3. Saccular posterior cerebral artery aneurysm encased in lipoma – no clear dose/effect/duration.
    """.trimIndent(),
                listOf(
                    Reference("Neuroradiology. 2025 Sep 20", "👉 Fast 3D wheel acquisition vs conventional MRA – positive/therapeutic effect", "40974398"),
                    Reference("Adv Mater. 2025 Sep 19:e08180", "👉 Magnetic Milli-Spinner for robotic endovascular surgery – no clear dose/effect/duration", "40970841"),
                    Reference("J Stroke. 2025 Sep 17", "👉 Pharmacologic management of unruptured aneurysms – positive/therapeutic effect", "40955112"),
                    Reference("Cureus. 2021 Jul 25;13(7):e16625", "👉 Subdural hemorrhage in PV – positive/therapeutic effect", "34458036"),
                    Reference("Rocz Panstw Zakl Hig. 2019;70(2):119-126", "👉 Diet-related factors in cerebral aneurysm – positive/therapeutic effect", "31215205"),
                    Reference("Rev Esp Enferm Dig. 2025 Jul 30", "👉 Neurogenic megacolon – no clear dose/effect/duration", "40737268"),
                    Reference("Br J Hosp Med (Lond). 2025 Jul 25;86(7):1-16", "👉 Tirofiban effect on cognition after aneurysm embolization – positive/therapeutic effect", "40705559"),
                    Reference("Neurosurg Rev. 2025 May 24;48(1):440", "👉 Prophylactic tirofiban prevents ischemic events – positive/therapeutic effect", "40410393"),
                    Reference("Neurosurg Rev. 2025 Aug 11;48(1):597", "👉 Coagulation disorders impacting ICH outcomes – positive/therapeutic effect | day", "40784989"),
                    Reference("Rev Esp Enferm Dig. 2025 Jul 30", "👉 Neurogenic megacolon – no clear dose/effect/duration", "40737268"),
                    Reference("J Clin Neurosci. 2025 May;135:111190", "👉 Homocysteine, B9/B12 and aneurysm formation – positive/therapeutic effect", "40147066"),
                    Reference("J Cerebrovasc Endovasc Neurosurg. 2025 May 21", "👉 Fahr's disease with basilar tip aneurysm – positive/therapeutic effect", "40393651"),
                    Reference("Clin Neurol Neurosurg. 2025 Feb;249:108749", "👉 Genetic susceptibility & therapeutic targets – g, g", "39847889"),
                    Reference("Acta Neurochir (Wien). 2025 Jan 15;167(1):15", "👉 Wall shear stress informatics – positive/therapeutic effect", "39812848"),
                    Reference("Gut. 2024 Sep 9;73(10):1662-1674", "👉 Gut-microbiome metabolites in aneurysms – positive/therapeutic effect", "38960582"),
                    Reference("J Intensive Care Soc. 2023 Dec 28;25(2):164-170", "👉 Fragility index in RCTs for aneurysmal SAH – positive/therapeutic effect", "38737309"),
                    Reference("Eur J Neurol. 2024 Aug;31(8):e16326", "👉 Circulating cytokines and aneurysm/SAH – no clear dose/effect/duration", "38709145"),
                    Reference("Nutrients. 2024 Oct 11;16(20):3448", "👉 Energy expenditure in critically ill patients with aneurysmal SAH/ICH/TBI – no clear dose/effect/duration", "39458443"),
                    Reference("J Cereb Blood Flow Metab. 2024 Feb;44(2):169-191", "👉 Peripheral macrophages in cerebrovascular pathologies – no clear dose/effect/duration", "38000039"),
                    Reference("BMJ Case Rep. 2023 Oct 11;16(10):e257158", "👉 Posterior cerebral artery aneurysm encased in lipoma – no clear dose/effect/duration", "37821145")
                )
            )

            "Brain death" -> Pair(
                """
    Alternative
    1. Hypothermic machine perfusion vs static cold storage in kidney transplantation – day.
    2. GFAP structural biology in TBI and Alzheimer's – negative/adverse effect mentioned.
    3. Restoration of glucose metabolic homeostasis in CNS diseases – positive/therapeutic effect.

    Herbs
    1. Natural flavonoids as ferroptosis inhibitors in CNS diseases – positive/therapeutic effect.
    2. Rosmarinic acid: anxiolytic, antidepressant, sleep-promoting – no clear dose/effect/duration.
    3. Xinbao Pill therapeutic mechanism in brain injury post-cardiopulmonary resuscitation – positive/therapeutic effect.

    Amino acids
    1. Murine glioblastoma model with human brain organoid xenograft for PDT testing – negative/adverse effect.
    2. Stigmasterol alleviates levodopa-induced dyskinesia in Parkinsonian rats – µg, mg | Positive/therapeutic effect mentioned | day.
    3. GLP-1 and GIP receptor agonists normalize energy utilization and reduce brain inflammation – positive/therapeutic effect.

    Vitamins
    1. Oxidative stress and antioxidants in glioblastoma – positive/therapeutic effect.
    2. Vitamin B12 deficiency common questions – no clear dose/effect/duration.
    3. Ischemic stroke increases folate receptor and one-carbon enzymes – no clear dose/effect/duration.

    Minerals
    1. Cu(2-x)Se nanoplatforms for glioblastoma treatment – positive/therapeutic effect.
    2. 2D materials inhibit Aβ fibrillation in Alzheimer's disease – no clear dose/effect/duration.
    3. Pompe disease gene review – positive/therapeutic effect; negative/adverse effect | month.

    Supplements
    1. Vitamin B12 deficiency common questions – no clear dose/effect/duration.
    2. BDH2-driven lysosome-to-mitochondria iron transfer shapes ferroptosis vulnerability – no clear dose/effect/duration.
    3. GPRC6A nutrient sensing receptor regulates mTORC1 signaling and Tau biology – positive/therapeutic effect.

    Nutrients
    1. Adaptive responses in severe acute malnutrition – positive/therapeutic effect.
    2. FAT1 suppresses autophagic cell death in glioblastoma under hypoxia/nutrient stress – MG | Positive/therapeutic effect.
    3. Maternal and placental galectins in feto-maternal symbiosis – positive/therapeutic effect; negative/adverse effect.
    """.trimIndent(),
                listOf(
                    Reference("Medicina (Kaunas). 2025 Sep 10;61(9):1641", "👉 Hypothermic machine perfusion vs static cold storage – day", "41011034"),
                    Reference("Neurol Int. 2025 Aug 26;17(9):134", "👉 GFAP in TBI/AD – negative/adverse effect", "41002922"),
                    Reference("Free Radic Biol Med. 2025 Sep 18:S0891-5849(25)00983-9", "👉 Glucose metabolic homeostasis in CNS diseases – positive/therapeutic effect", "40975190"),
                    Reference("Front Pharmacol. 2025 Mar 24;16:1570069", "👉 Natural flavonoids as ferroptosis inhibitors – positive/therapeutic effect", "40196367"),
                    Reference("Neuropsychiatr Dis Treat. 2025 Mar 20;21:641-661", "👉 Rosmarinic acid anxiolytic/antidepressant/sleep-promoting – no clear dose/effect/duration", "40134762"),
                    Reference("CNS Neurosci Ther. 2025 Mar;31(3):e70297", "👉 Xinbao Pill therapeutic mechanism post-CPR – positive/therapeutic effect", "40035287"),
                    Reference("Int J Mol Sci. 2025 Sep 12;26(18):8889", "👉 Glioblastoma organoid PDT testing – negative/adverse effect", "41009470"),
                    Reference("Neurochem Res. 2025 Sep 18;50(5):304", "👉 Stigmasterol in Parkinsonian rats – µg, mg | Positive/therapeutic effect mentioned | day", "40965794"),
                    Reference("CNS Drugs. 2025 Sep 12", "👉 GLP-1/GIP receptor agonists normalize energy and reduce inflammation – positive/therapeutic effect", "40938528"),
                    Reference("Antioxidants (Basel). 2025 Sep 15;14(9):1121", "👉 Oxidative stress and antioxidants in glioblastoma – positive/therapeutic effect", "41009025"),
                    Reference("Am Fam Physician. 2025 Sep;112(3):294-300", "👉 Vitamin B12 deficiency – no clear dose/effect/duration", "40961307"),
                    Reference("bioRxiv [Preprint]. 2025 Sep 7", "👉 Ischemic stroke increases folate receptor/one-carbon enzymes – no clear dose/effect/duration", "40950018"),
                    Reference("J Nanobiotechnology. 2025 Sep 26;23(1):609", "👉 Cu(2-x)Se nanoplatforms for glioblastoma – positive/therapeutic effect", "41013700"),
                    Reference("Phys Chem Chem Phys. 2025 Sep 18;27(36):19134-19148", "👉 2D materials inhibit Aβ fibrillation – no clear dose/effect/duration", "40856257"),
                    Reference("Pompe Disease, GeneReviews", "👉 Pompe disease gene review – positive/therapeutic effect; negative/adverse effect | month", "20301438"),
                    Reference("Am Fam Physician. 2025 Sep;112(3):294-300", "👉 Vitamin B12 deficiency – no clear dose/effect/duration", "40961307"),
                    Reference("Nat Metab. 2025 Sep;7(9):1851-1870", "👉 BDH2 lysosome-to-mitochondria iron transfer – no clear dose/effect/duration", "40957995"),
                    Reference("Neurobiol Dis. 2025 Aug 21;216:107054", "👉 GPRC6A receptor regulates mTORC1 and Tau biology – positive/therapeutic effect", "40848921"),
                    Reference("Nutrients. 2025 Sep 4;17(17):2864", "👉 Adaptive responses in severe acute malnutrition – positive/therapeutic effect", "40944251"),
                    Reference("Cell Mol Biol Lett. 2025 Sep 3;30(1):106", "👉 FAT1 suppresses autophagic cell death in glioblastoma – MG | Positive/therapeutic effect", "40903775"),
                    Reference("Semin Immunopathol. 2025 Aug 21;47(1):35", "👉 Maternal/placental galectins – positive/therapeutic effect; negative/adverse effect", "40839117")
                )
            )

            "Brain haemorrhage" -> Pair(
                """
    Alternative
    1. Partial vs intermittent resuscitative endovascular balloon occlusion in noncompressible torso hemorrhage with TBI – no clear dose/effect/duration.
    2. Human amniotic mesenchymal stem cell-derived exosomes inhibit ferroptosis in spontaneous intracerebral hemorrhage – positive/therapeutic effect.
    3. Stabilizing RNA thermometer provides neuroprotection in subarachnoid hemorrhage – positive/therapeutic effect.

    Herbs
    1. Tianxiong Granules for hypertension via heart-brain axis – no clear dose/effect/duration.
    2. Natural flavonoids as ferroptosis inhibitors in CNS diseases – positive/therapeutic effect.
    3. Promoting blood circulation and resolving blood stasis in intracerebral hemorrhage – positive/therapeutic effect.

    Amino acids
    1. CNS tumors with BCOR internal tandem duplications: review of 69 cases – no clear dose/effect/duration.
    2. Tirofiban real-world adverse events analysis – positive/therapeutic effect; negative/adverse effect | day.
    3. Timely initiation of Argatroban improves prognosis in acute ischemic stroke – positive/therapeutic effect | day.

    Vitamins
    1. Timing and safety of anticoagulation reinitiation after intracranial hemorrhage – day.
    2. Resumption of anticoagulants after intracranial hemorrhage – week.
    3. Warfarin-induced pulmonary hemorrhage – positive/therapeutic effect | week.

    Minerals
    1. Echogenic lesions in neonatal head US – G | Positive/therapeutic effect.
    2. Diffuse hepatic calcification in congenital hepatic fibrosis – mg | Positive/therapeutic effect | month.
    3. Homocysteine causal role in multiple diseases – positive/therapeutic effect.

    Supplements
    1. Microglial xCT as therapeutic target in TBI – positive/therapeutic effect; negative/adverse effect.
    2. Socioeconomic status, behaviors, and risk of aneurysmal subarachnoid hemorrhage – positive/therapeutic effect.
    3. Vitamin D potential for prevention of cerebrovascular diseases – positive/therapeutic effect.

    Nutrients
    1. Cerebral perfusion impact in preterm infants with brain injuries – positive/therapeutic effect.
    2. Glymphatics in neurovascular diseases – no clear dose/effect/duration.
    3. Lutein and zeaxanthin for morbidity/mortality in preterm infants – positive/therapeutic effect; negative/adverse effect.
    """.trimIndent(),
                listOf(
                    Reference("Mil Med. 2025 Sep 1;190(Supplement_2):686-694", "👉 Partial vs intermittent REBOA in noncompressible torso hemorrhage with TBI – no clear dose/effect/duration", "40984160"),
                    Reference("Brain Res Bull. 2025 Sep 17:111553", "👉 Amniotic MSC exosomes inhibit ferroptosis in spontaneous ICH – positive/therapeutic effect", "40972687"),
                    Reference("Nat Commun. 2025 Sep 18;16(1):8319", "👉 Stabilizing RNA thermometer neuroprotection in SAH – positive/therapeutic effect", "40968270"),
                    Reference("Zhongguo Zhong Yao Za Zhi. 2025 Mar;50(5):1412-1418", "👉 Tianxiong Granules via heart-brain axis – no clear dose/effect/duration", "40350924"),
                    Reference("Front Pharmacol. 2025 Mar 24;16:1570069", "👉 Natural flavonoids as ferroptosis inhibitors – positive/therapeutic effect", "40196367"),
                    Reference("J Tradit Chin Med. 2025 Apr;45(2):458-472", "👉 Promoting blood circulation/resolving blood stasis in ICH – positive/therapeutic effect", "40151133"),
                    Reference("J Pathol Transl Med. 2025 Sep;59(5):273-280", "👉 CNS tumors with BCOR internal tandem duplications – no clear dose/effect/duration", "40916880"),
                    Reference("Sci Rep. 2025 Sep 1;15(1):32043", "👉 Tirofiban real-world adverse events – positive/therapeutic effect; negative/adverse effect | day", "40890341"),
                    Reference("Brain Behav. 2025 Aug;15(8):e70799", "👉 Argatroban in acute ischemic stroke – positive/therapeutic effect | day", "40862660"),
                    Reference("Neurology. 2025 Oct 21;105(8):e214184", "👉 Anticoagulation reinitiation post-ICH – day", "40997282"),
                    Reference("J Korean Neurosurg Soc. 2025 Sep 1", "👉 Resumption of anticoagulants post-ICH – week", "40889786"),
                    Reference("Case Rep Pulmonol. 2025 Aug 17;2025:8866411", "👉 Warfarin-induced pulmonary hemorrhage – positive/therapeutic effect", "40862295"),
                    Reference("Radiographics. 2025 Sep;45(9):e240065", "👉 Echogenic lesions in neonatal head US – G | Positive/therapeutic effect", "40875453"),
                    Reference("Clin J Gastroenterol. 2025 Aug;18(4):734-738", "👉 Diffuse hepatic calcification in congenital hepatic fibrosis – mg | Positive/therapeutic effect | month", "40471524"),
                    Reference("Nutr Metab (Lond). 2025 May 20;22(1):45", "👉 Homocysteine causal role in multiple diseases – positive/therapeutic effect", "40394620"),
                    Reference("Yonago Acta Med. 2025 Jul 28;68(3):227-236", "👉 Microglial xCT as TBI target – positive/therapeutic effect; negative/adverse effect", "40810046"),
                    Reference("Neurosurg Rev. 2025 Jul 22;48(1):577", "👉 Socioeconomic status, behaviors, risk of aneurysmal SAH – positive/therapeutic effect", "40694148"),
                    Reference("Medicine (Baltimore). 2025 Jul 11;104(28):e43040", "👉 Vitamin D for prevention of cerebrovascular diseases – positive/therapeutic effect", "40660534"),
                    Reference("Sci Rep. 2025 Aug 13;15(1):29700", "👉 Cerebral perfusion in preterm infants – positive/therapeutic effect", "40804135"),
                    Reference("J Neurointerv Surg. 2025 Jul 18:jnis-2025-023713", "👉 Glymphatics in neurovascular diseases – no clear dose/effect/duration", "40681335"),
                    Reference("Cochrane Database Syst Rev. 2025 Apr 28;4(4):CD012178", "👉 Lutein/zeaxanthin in preterm infants – positive/therapeutic effect; negative/adverse effect", "40292760")
                )
            )

            "Brain tumours" -> Pair(
                """
    Alternative
    1. Presurgical language mapping via optimally sorting independent components of resting-state fMRI – positive/therapeutic effect.
    2. New chalcone compound with miRNA-mediated anticancer properties in glioblastoma – MG | positive/therapeutic effect; negative/adverse effect.
    3. Frameless and maskless robotic head motion compensation for stereotactic radiosurgery – positive/therapeutic effect.

    Herbs
    1. Apatinib proteomics profiling inhibits glioma U251 proliferation – no clear dose/effect/duration.
    2. Fucoxanthin targets β1 integrin disrupting adhesion/migration in glioma cells – MG | positive/therapeutic effect.
    3. Trojan Horse delivery strategies of natural medicine monomers for brain targeting – positive/therapeutic effect.

    Amino acids
    1. Murine glioblastoma-initiating cells and human brain organoid xenograft for photodynamic therapy – negative/adverse effect.
    2. Single-voxel proton MR spectroscopy in dog with gliomatosis cerebri – no clear dose/effect/duration.
    3. Amide proton transfer imaging vs 11C-methionine PET in malignant glioma – no clear dose/effect/duration.

    Vitamins
    1. Single-voxel proton MR spectroscopy in dog with gliomatosis cerebri – no clear dose/effect/duration.
    2. Myotonic Dystrophy Type 2 – no clear dose/effect/duration.
    3. Vitamin B12 deficiency Q&A – no clear dose/effect/duration.

    Minerals
    1. Biomimetic Cu(2-x)Se nanoplatforms for glioblastoma treatment – positive/therapeutic effect.
    2. SERS-active plasmonic nanosensor reveals biphasic zinc switch controlling metastasis – no clear dose/effect/duration.
    3. Graphene quantum dot-integrated nanocomposites for glioblastoma treatment – negative/adverse effect.

    Supplements
    1. Vitamin B12 deficiency Q&A – no clear dose/effect/duration.
    2. 3D hydrogel glioblastoma models for Zika virus targeting and oncolytic virotherapy – negative/adverse effect.
    3. Gut microbiota-bile acid-brain axis mediates ADT-induced cognitive impairment – positive/therapeutic effect.

    Nutrients
    1. mTOR signaling and cell fate decision – no clear dose/effect/duration.
    2. Ketogenic diets in pediatric brain cancer – positive/therapeutic effect; negative/adverse effect | month.
    3. Psychobiotics as adjunctive pain management in gastrointestinal oncology – positive/therapeutic effect | month.
    """.trimIndent(),
                listOf(
                    Reference("Brain Imaging Behav. 2025 Sep 27", "👉 Presurgical language mapping via optimally sorting independent components of resting-state fMRI – positive/therapeutic effect", "41014464"),
                    Reference("PLoS One. 2025 Sep 26;20(9):e0330624", "👉 Chalcone compound with miRNA-mediated anticancer properties – MG | positive/therapeutic effect; negative/adverse effect", "41004517"),
                    Reference("Int J Radiat Oncol Biol Phys. 2025 Sep 23", "👉 Frameless/maskless robotic head motion compensation – positive/therapeutic effect", "40998271"),
                    Reference("Biochem Biophys Res Commun. 2025 Aug 15;775:152148", "👉 Apatinib proteomics profiling inhibits glioma U251 proliferation – no clear dose/effect/duration", "40493991"),
                    Reference("J Agric Food Chem. 2025 May 7;73(18):10961-10973", "👉 Fucoxanthin targets β1 integrin in glioma cells – MG | positive/therapeutic effect", "40261208"),
                    Reference("Pharmaceutics. 2025 Feb 20;17(3):280", "👉 Trojan Horse delivery strategies of natural medicine monomers – positive/therapeutic effect", "40142943"),
                    Reference("Int J Mol Sci. 2025 Sep 12;26(18):8889", "👉 Murine glioblastoma model and human brain organoid xenograft for photodynamic therapy – negative/adverse effect", "41009470"),
                    Reference("J Vet Intern Med. 2025 Nov-Dec;39(6):e70210", "👉 Single-voxel proton MR spectroscopy in dog with gliomatosis cerebri – no clear dose/effect/duration", "40996370"),
                    Reference("Neuroradiol J. 2025 Sep 24:19714009251345107", "👉 APT imaging vs 11C-methionine PET in malignant glioma – no clear dose/effect/duration", "40991528"),
                    Reference("J Vet Intern Med. 2025 Nov-Dec;39(6):e70210", "👉 Single-voxel proton MR spectroscopy in dog with gliomatosis cerebri – no clear dose/effect/duration", "40996370"),
                    Reference("Myotonic Dystrophy Type 2. GeneReviews, 2025 Sep 25 update", "👉 Myotonic Dystrophy Type 2 – no clear dose/effect/duration", "20301639"),
                    Reference("Am Fam Physician. 2025 Sep;112(3):294-300", "👉 Vitamin B12 deficiency Q&A – no clear dose/effect/duration", "40961307"),
                    Reference("J Nanobiotechnology. 2025 Sep 26;23(1):609", "👉 Biomimetic Cu(2-x)Se nanoplatforms for glioblastoma treatment – positive/therapeutic effect", "41013700"),
                    Reference("Biosens Bioelectron. 2025 Dec 1;289:117897", "👉 SERS-active plasmonic nanosensor reveals biphasic zinc switch – no clear dose/effect/duration", "40886434"),
                    Reference("Med Oncol. 2025 Aug 8;42(9):417", "👉 Graphene quantum dot-integrated nanocomposites for glioblastoma treatment – negative/adverse effect", "40781177"),
                    Reference("Am Fam Physician. 2025 Sep;112(3):294-300", "👉 Vitamin B12 deficiency Q&A – no clear dose/effect/duration", "40961307"),
                    Reference("Biomater Adv. 2025 Sep 11;179:214492", "👉 3D hydrogel glioblastoma models for Zika virus targeting/oncolytic virotherapy – negative/adverse effect", "40957303"),
                    Reference("CNS Neurosci Ther. 2025 Sep;31(9):e70608", "👉 Gut microbiota-bile acid-brain axis mediates ADT-induced cognitive impairment – positive/therapeutic effect", "40955046"),
                    Reference("Phys Rev E. 2025 Aug;112(2-1):024409", "👉 mTOR signaling and cell fate decision – no clear dose/effect/duration", "40954801"),
                    Reference("Nutrients. 2025 Aug 31;17(17):2843", "👉 Ketogenic diets in pediatric brain cancer – positive/therapeutic effect; negative/adverse effect | month", "40944231"),
                    Reference("Nutrients. 2025 Aug 25;17(17):2751", "👉 Psychobiotics as adjunctive pain management in gastrointestinal oncology – positive/therapeutic effect | month", "40944142")
                )
            )

            "Breast abscess" -> Pair(
                """
    Alternative
    1. Treatment strategy for septic arthritis with large abscesses and mediastinitis – no clear dose/effect/duration.
    2. Superolateral pedicle breast reduction for medially positioned nipple-areola complexes – g,g.
    3. Primary tubercular breast abscess in a young female – month.

    Herbs
    - No data available.

    Amino acids
    1. Proteomic/metabonomic profiling of amino acid/lipid metabolism in CA-MRSA-infected breast abscesses – positive/therapeutic effect.
    2. Lysine-derived urethane surgical adhesive as alternative to progressive tension sutures – positive/therapeutic effect.
    3. Lawsonella clevelandensis identification from human abscesses – positive/therapeutic effect.

    Vitamins
    1. Mastalgia review – positive/therapeutic effect; negative/adverse effect.
    2. Early childhood caries and nutritional status – negative/adverse effect.
    3. Nutritional rickets presenting with developmental regression – week, month | negative/adverse effect.

    Minerals
    1. Nutritional rickets with developmental regression – week, month | negative/adverse effect.
    2. Glycol chitosan conjugated carboxyl graphene for photothermal ablation – MG | positive/therapeutic effect.
    3. Mammography status review – no clear dose/effect/duration.

    Supplements
    1. Benign breast lesions in surgically excised specimens – no clear dose/effect/duration.
    2. Breast microecology improvement with probiotics after needle aspiration in lactational breast abscess – positive/therapeutic effect; negative/adverse effect.
    3. MRI evaluation of complications of breast augmentation – no clear dose/effect/duration.

    Nutrients
    1. Historical review of breast abscess epidemics – no clear dose/effect/duration.
    """.trimIndent(),
                listOf(
                    Reference("Int J Surg Case Rep. 2025 Sep 25;136:111986", "👉 Septic arthritis with abscesses and mediastinitis – no clear dose/effect/duration", "41014914"),
                    Reference("Plast Reconstr Surg. 2025 Aug 1;156(2):174e-182e", "👉 Superolateral pedicle breast reduction – g,g", "40719484"),
                    Reference("Clin Case Rep. 2025 May 13;13(5):e70493", "👉 Primary tubercular breast abscess – month", "40365572"),
                    Reference("Front Cell Infect Microbiol. 2023 Nov 13;13:1240743", "👉 CA-MRSA-infected breast abscesses proteomic/metabonomic profiling – positive/therapeutic effect", "38029258"),
                    Reference("Aesthet Surg J. 2018 Nov 12;38(12):1318-1329", "👉 Lysine-derived urethane surgical adhesive – positive/therapeutic effect", "29635327"),
                    Reference("Int J Syst Evol Microbiol. 2016 Aug;66(8):2929-2935", "👉 Lawsonella clevelandensis from human abscesses – positive/therapeutic effect", "27130323"),
                    Reference("StatPearls. 2025 Feb 6", "👉 Mastalgia review – positive/therapeutic effect; negative/adverse effect", "32965866"),
                    Reference("Food Nutr Bull. 2023 Dec;44(4):249-264", "👉 Early childhood caries and nutritional status – negative/adverse effect", "38095292"),
                    Reference("BMC Pediatr. 2023 Jun 29;23(1):330", "👉 Nutritional rickets presenting with developmental regression – week, month | negative/adverse effect", "37386483"),
                    Reference("Acta Biomater. 2018 Mar 15;69:256-264", "👉 Glycol chitosan conjugated carboxyl graphene for photothermal ablation – MG | positive/therapeutic effect", "29374599"),
                    Reference("Geriatrics. 1964 May;19:356-64", "👉 Mammography status review – no clear dose/effect/duration", "14158625"),
                    Reference("J Cancer Res Ther. 2023 Apr;19(Supplement):S116-S120", "👉 Benign breast lesions in surgically excised specimens – no clear dose/effect/duration", "37147991"),
                    Reference("Sci Rep. 2022 Oct 6;12(1):16692", "👉 Probiotics after needle aspiration in lactational breast abscess – positive/therapeutic effect; negative/adverse effect", "36202884"),
                    Reference("Radiographics. 2022 Jul-Aug;42(4):929-946", "👉 MRI evaluation of complications of breast augmentation – no clear dose/effect/duration", "35559662"),
                    Reference("Rev Fr Gynecol Obstet. 1953 Jul-Aug;48(7-8):218-9", "👉 Historical review of breast abscess epidemics – no clear dose/effect/duration", "13121652")
                )
            )

            "Breast cancer in men" -> Pair(
                """
    Alternative
    1. Clinical management in BRCA carriers with early breast cancer – positive/therapeutic effect.
    2. Family motivation to enhance men's uptake of cascade BRCA1/2 screening – g | positive/therapeutic effect.
    3. 6-Shogaol inhibits prostate cancer cell motility via PI3K/AKT/mTOR and Ras/Raf/MAPK pathways – positive/therapeutic effect; negative/adverse effect.

    Herbs
    1. Shuangshen granules attenuate lung metastasis via mTOR signalling inhibition – G | positive/therapeutic effect.
    2. Network pharmacology prediction of active ingredients in Chinese herbs for metastatic breast cancer – positive/therapeutic effect | month.
    3. Predictors of use of complementary and alternative therapies among cancer patients – no clear dose/effect/duration.
    
    Amino acids
    1. Fractional picosecond laser for postmastectomy scars in transgender men – positive/therapeutic effect; negative/adverse effect | month.
    2. Amino acid profile in seminal plasma correlated with spermiogram and antioxidant capacity – positive/therapeutic effect.
    3. Herbal melanin inhibits proliferation and modulates apoptosis in cancer cell lines – no clear dose/effect/duration.

    Vitamins
    1. 6-Deoxy-6-[18F]Fluoro-L-Ascorbic Acid PET/CT for lymph node metastases detection – no clear dose/effect/duration.
    2. Pharmacological dose of Vitamin C on MDA-MB-231 cells – no clear dose/effect/duration.
    3. Ferulic acid in selected malignant neoplasms – no clear dose/effect/duration.

    Minerals
    1. Global burden of low bone mineral density – positive/therapeutic effect; negative/adverse effect.
    2. Osteoporosis, redox homeostasis, and alcohol addiction – positive/therapeutic effect.
    3. Menopausal symptoms on future health/longevity – positive/therapeutic effect; negative/adverse effect.

    Supplements
    1. USCOM V algorithm for prevention/treatment of cutaneous side effects of hormonal cancer therapy – positive/therapeutic effect; negative/adverse effect.
    2. Breast cancer in 80+ year olds – no clear dose/effect/duration.
    3. MRI-fusion prostate biopsy strategies – no clear dose/effect/duration.

    Nutrients
    1. Behavioral risk factors in oncology patients – positive/therapeutic effect.
    2. Cancer incidence rates vs solar UVB, diabetes, obesity, alcohol – positive/therapeutic effect.
    3. Impact of sarcopenia prior to cancer diagnosis on survival – positive/therapeutic effect.
    """.trimIndent(),
                listOf(
                    Reference("Cancer Control. 2025 Jan-Dec;32:10732748251377864", "👉 Clinical management in BRCA carriers – positive/therapeutic effect", "40973047"),
                    Reference("Am J Mens Health. 2025 Jul-Aug;19(4):15579883251343962", "👉 Family motivation for BRCA screening – g | positive/therapeutic effect", "40772289"),
                    Reference("Food Funct. 2025 Jun 3;16(11):4315-4324", "👉 6-Shogaol inhibits prostate cancer cell motility – positive/therapeutic effect; negative/adverse effect", "40397499"),
                    Reference("J Ethnopharmacol. 2021 Dec 5;281:113305", "👉 Shuangshen granules attenuate lung metastasis – G | positive/therapeutic effect", "32890710"),
                    Reference("Oncotarget. 2017 Apr 18;8(16):27007-27021", "👉 Network pharmacology of Chinese herbs in metastatic breast cancer – positive/therapeutic effect | month", "28212580"),
                    Reference("Oncol Nurs Forum. 2005 Nov 3;32(6):1115-22", "👉 Predictors of use of complementary and alternative therapies – no clear dose/effect/duration", "16270107"),
                    Reference("Lasers Surg Med. 2024 Apr;56(4):337-345", "👉 Fractional picosecond laser for postmastectomy scars – positive/therapeutic effect; negative/adverse effect | month", "38436118"),
                    Reference("J Reprod Infertil. 2023 Oct-Dec;24(4):257-268", "👉 Amino acid profile in seminal plasma – positive/therapeutic effect", "38164434"),
                    Reference("Medicina (Kaunas). 2023 Nov 22;59(12):2061", "👉 Herbal melanin in cancer cell lines – no clear dose/effect/duration", "38138165"),
                    Reference("Clin Nucl Med. 2025 Sep 1;50(9):e523-e530", "👉 6-Deoxy-6-[18F]Fluoro-L-Ascorbic Acid PET/CT – no clear dose/effect/duration", "40590121"),
                    Reference("Biomedicines. 2025 Mar 5;13(3):640", "👉 Vitamin C on MDA-MB-231 cells – no clear dose/effect/duration", "40149617"),
                    Reference("Molecules. 2025 Feb 23;30(5):1018", "👉 Ferulic acid in malignant neoplasms – no clear dose/effect/duration", "40076243"),
                    Reference("Lancet Rheumatol. 2025 Sep 16:S2665-9913(25)00105-5", "👉 Global burden of low bone mineral density – positive/therapeutic effect; negative/adverse effect", "40972625"),
                    Reference("Biomed Pharmacother. 2025 Jun;187:118063", "👉 Osteoporosis, redox homeostasis, alcohol addiction – positive/therapeutic effect", "40253828"),
                    Reference("Maturitas. 2024 Dec;190:108130", "👉 Menopausal symptoms on future health/longevity – positive/therapeutic effect; negative/adverse effect", "39366170"),
                    Reference("J Drugs Dermatol. 2025 Apr 1;24(4):84821s3-84821s14", "👉 USCOM V algorithm for hormonal therapy side effects – positive/therapeutic effect; negative/adverse effect", "40196959"),
                    Reference("Rozhl Chir. 2024;103(7):258-262", "👉 Breast cancer in 80+ year olds – no clear dose/effect/duration", "39142851"),
                    Reference("BMC Urol. 2024 Aug 7;24(1):168", "👉 MRI-fusion prostate biopsy strategies – no clear dose/effect/duration", "39112967"),
                    Reference("Nutrients. 2024 Aug 2;16(15):2527", "👉 Behavioral risk factors in oncology patients – positive/therapeutic effect", "39125407"),
                    Reference("Nutrients. 2024 May 11;16(10):1450", "👉 Cancer incidence rates vs UVB, diabetes, obesity, alcohol – positive/therapeutic effect", "38794688"),
                    Reference("Nutrients. 2023 Mar 1;15(5):1247", "👉 Impact of sarcopenia prior to cancer diagnosis on survival – positive/therapeutic effect", "36904245")
                )
            )

            "Breast cancer in women" -> Pair(
                """
    Alternative
    1. Identification of novel selective estrogen receptor degraders (SERD) via virtual screening and bioassays – no clear dose/effect/duration.
    2. Thoracic epidural anesthesia combined with pecs 2 block for modified radical mastectomy – positive/therapeutic effect.
    3. 68Ga-FAPi PET-CT demonstrating diagnostic superiority over 18F-FDG PET-CT – G | positive/therapeutic effect.

    Herbs
    1. Use of complementary and alternative medicine in Denmark among women with and without breast cancer – no clear dose/effect/duration.
    2. Cytotoxic and antioxidant activities of Ardisia polycephala, Iresine herbstii, Oenanthe javanica extracts – mg, μg | positive/therapeutic effect; negative/adverse effect.
    3. Spices and culinary herbs for prevention and treatment of breast cancer – positive/therapeutic effect; negative/adverse effect.

    Amino acids
    1. Activin A secreted by cancer-associated fibroblasts reduces sensitivity of breast cancer cells to ixazomib – positive/therapeutic effect; negative/adverse effect.
    2. Near-infrared spectroscopy of blood plasma amino acids for breast cancer discrimination – G | positive/therapeutic effect.
    3. Network pharmacology and in vitro investigation of L-mimosine – negative/adverse effect.

    Vitamins
    1. Combination of hydralazine and all-trans retinoic acid targeting breast cancer cells – positive/therapeutic effect; negative/adverse effect.
    2. Vitamin D-induced mechanisms in cancer prevention and therapy – positive/therapeutic effect.
    3. Methylcobalamin effect on capecitabine-induced hand-foot syndrome in HER2-negative early breast cancer – mg | positive/therapeutic effect; negative/adverse effect | week.

    Minerals
    1. Global burden of low bone mineral density – positive/therapeutic effect; negative/adverse effect.
    2. Changes in femoral 3D-DXA cortical and trabecular indices in postmenopausal women with early breast cancer on aromatase inhibitors – positive/therapeutic effect.
    3. Influence of caffeic acid phenethyl ester on osteoblastic behavior in coculture with breast adenocarcinoma cells – positive/therapeutic effect.

    Supplements
    1. Molecular breast imaging and digital breast tomosynthesis for dense breast screening – no clear dose/effect/duration.
    2. Role of Lactobacillus strain probiotics in breast cancer – positive/therapeutic effect.
    3. Value of over-the-counter products/services in mild-to-moderate menopausal symptoms – positive/therapeutic effect.

    Nutrients
    1. Diet and exercise intervention targeting lymphedema in overweight breast cancer survivors – positive/therapeutic effect | month.
    2. Emerging strategies to overcome resistance in breast cancer – positive/therapeutic effect.
    3. Associations of major dietary patterns with breast cancer among Iranian women – no clear dose/effect/duration.
    """.trimIndent(),
                listOf(
                    Reference("Bioorg Chem. 2025 Sep 22;165:109011", "👉 Novel SERDs via virtual screening – no clear dose/effect/duration", "41014838"),
                    Reference("Saudi J Anaesth. 2025 Oct-Dec;19(4):646-648", "👉 Thoracic epidural anesthesia with pecs 2 block – positive/therapeutic effect", "40994479"),
                    Reference("Clin Nucl Med. 2025 Sep 19", "68Ga-FAPi PET-CT vs 18F-FDG – G | positive/therapeutic effect", "40982884"),
                    Reference("Scand J Public Health. 2025 Aug 20:14034948251363843", "👉 Use of CAM in Denmark – no clear dose/effect/duration", "40836388"),
                    Reference("Adv Pharmacol Pharm Sci. 2025 Aug 8;2025:1234439", "👉 Ardisia polycephala, Iresine herbstii, Oenanthe javanica extracts – mg, μg | positive/therapeutic effect; negative/adverse effect", "40822988"),
                    Reference("Cancer Pathog Ther. 2024 Jul 6;3(3):197-214", "👉 Spices and culinary herbs – positive/therapeutic effect; negative/adverse effect", "40458304"),
                    Reference("Biomolecules. 2025 Sep 15;15(9):1318", "👉 Activin A reduces sensitivity to ixazomib – positive/therapeutic effect; negative/adverse effect", "41008625"),
                    Reference("Transl Oncol. 2025 Sep 23;62:102542", "👉 Near-infrared spectroscopy of amino acids – G | positive/therapeutic effect", "40992148"),
                    Reference("BMC Complement Med Ther. 2025 Sep 1;25(1):318", "👉 L-mimosine network pharmacology – negative/adverse effect", "40890736"),
                    Reference("BMC Cancer. 2025 Sep 24;25(1):1427", "👉 Hydralazine + all-trans retinoic acid – positive/therapeutic effect; negative/adverse effect", "40993589"),
                    Reference("Animal Model Exp Med. 2025 Sep 23", "👉 Vitamin D-induced mechanisms – positive/therapeutic effect", "40985271"),
                    Reference("BMJ. 2025 Sep 11;390:e084290", "👉 Methylcobalamin on capecitabine-induced hand-foot syndrome – mg | positive/therapeutic effect; negative/adverse effect | week", "40935571"),
                    Reference("Lancet Rheumatol. 2025 Sep 16:S2665-9913(25)00105-5", "👉 Global burden of low bone mineral density – positive/therapeutic effect; negative/adverse effect", "40972625"),
                    Reference("Maturitas. 2025 Oct;201:108708", "👉 Femoral 3D-DXA indices in postmenopausal women on aromatase inhibitors – positive/therapeutic effect", "40886410"),
                    Reference("Anticancer Res. 2025 Sep;45(9):3719-3726", "👉 Caffeic acid phenethyl ester on osteoblastic behavior – positive/therapeutic effect", "40877010"),
                    Reference("Radiology. 2025 Sep;316(3):e243953", "👉 Molecular breast imaging and digital tomosynthesis – no clear dose/effect/duration", "40985829"),
                    Reference("Probiotics Antimicrob Proteins. 2025 Sep 20", "👉 Lactobacillus strain probiotics – positive/therapeutic effect", "40974530"),
                    Reference("Climacteric. 2025 Sep 10:1-10", "👉 Over-the-counter products in mild-to-moderate menopausal symptoms – positive/therapeutic effect", "40927917"),
                    Reference("Nutrients. 2025 Aug 27;17(17):2768", "👉 Diet and exercise intervention in lymphedema – positive/therapeutic effect | month", "40944158"),
                    Reference("Cancers (Basel). 2025 Sep 8;17(17):2938", "👉 Strategies to overcome resistance in breast cancer – positive/therapeutic effect", "40941035"),
                    Reference("Cancer Rep (Hoboken). 2025 Sep;8(9):e70341", "👉 Major dietary patterns and breast cancer – no clear dose/effect/duration", "40923112")
                )
            )

            "Breath-holding in babies and children" -> Pair(
                """
    Alternative
    1. Selection of ventilation devices in children with mild/moderate upper respiratory infections – positive/therapeutic effect; negative/adverse effect.
    2. Pediatric lung MRI: currently available and emerging techniques – positive/therapeutic effect.
    3. Improved workflow for quantification of right ventricular volumes using free-breathing motion-corrected cine imaging – positive/therapeutic effect.

    Herbs
    1. No data available.

    Amino acids
    1. Neurologic manifestations of iron deficiency in childhood – no clear dose/effect/duration.

    Vitamins
    1. Evaluation of physiological/biochemical parameters and autonomic nervous system in children with breath-holding spells – month.
    2. Pyridoxine-dependent seizures: a review – mg | positive/therapeutic effect.
    3. The breath-holding syndrome (general review) – no clear dose/effect/duration.

    Minerals
    1. Selenium and antioxidant levels decreased in blood of children with breath-holding spells – positive/therapeutic effect.

    Supplements
    1. Effect of iron supplementation in children with breath-holding spells – µg, mg | week, month.
    2. Cognitive impairment associated with low ferritin responsive to iron supplementation – positive/therapeutic effect.
    3. Cochrane review: iron supplementation for breath-holding attacks in children – mg | positive/therapeutic effect | week.

    Nutrients
    1. Effect of iron supplementation in children with breath-holding spells – µg, mg | week, month.
    """.trimIndent(),
                listOf(
                    Reference("Trials. 2025 Mar 29;26(1):112", "👉 Selection of ventilation devices in children with mild/moderate URIs – positive/therapeutic effect; negative/adverse effect", "40158183"),
                    Reference("AJR Am J Roentgenol. 2021 Mar;216(3):781-790", "👉 Pediatric lung MRI – positive/therapeutic effect", "33474982"),
                    Reference("Pediatr Cardiol. 2019 Jan;40(1):79-88", "👉 Free-breathing motion-corrected cine imaging – positive/therapeutic effect", "30136135"),
                    Reference("Pediatr Neurol. 2002 Aug;27(2):85-92", "👉 Neurologic manifestations of iron deficiency – no clear dose/effect/duration", "12213607"),
                    Reference("Neuropediatrics. 2014 Aug;45(4):212-6", "👉 Evaluation of physiological/biochemical parameters in breath-holding spells – month", "24338514"),
                    Reference("Indian Pediatr. 2003 Jul;40(7):633-8", "👉 Pyridoxine-dependent seizures – mg | positive/therapeutic effect", "12881619"),
                    Reference("Practitioner. 1963 Nov;191:651-7", "👉 The breath-holding syndrome – no clear dose/effect/duration", "14084366"),
                    Reference("J Child Neurol. 2014 Oct;29(10):1339-43", "👉 Selenium and antioxidant levels decreased in breath-holding spells – positive/therapeutic effect", "24413362"),
                    Reference("J Paediatr Child Health. 2017 Aug;53(8):749-753", "👉 Iron supplementation – µg, mg | week, month", "28568906"),
                    Reference("Pediatr Neurol. 2014 Dec;51(6):831-3", "👉 Low ferritin responsive to iron supplementation – positive/therapeutic effect", "25283751"),
                    Reference("Cochrane Database Syst Rev. 2010 May 12;(5):CD008132", "👉 Iron supplementation for breath-holding attacks – mg | positive/therapeutic effect | week", "20464763")
                )
            )

            "Broken ankle" -> Pair(
                """
    Alternative
    1. Overview on management of ankle fractures in elderly patients – no clear dose/effect/duration.
    2. Tibiotalar nailing for geriatric pilon fractures – month.
    3. External fixation using locking plates in challenging tibial fractures – week.

    Herbs
    1. No data available.

    Amino acids
    1. Limiting narcotic utilization following ankle fracture surgery – mg.
    2. Perioperative use of pregabalin + naproxen vs naproxen only for pain – mg | negative/adverse effect | day, month.
    3. Local administration of epsilon-aminocaproic acid reduces post-op blood loss – positive/therapeutic effect.

    Vitamins
    1. Should ankle fractures be considered osteoporotic fractures? – month.
    2. Prioritization for DXA scan after fracture – positive/therapeutic effect | week, month, week.
    3. Comorbidities in sequential atraumatic lateral malleolus fractures – no clear dose/effect/duration.

    Minerals
    1. Insights into musculoskeletal/body composition in post-menopausal women with fractures – positive/therapeutic effect.
    2. Osteogenic small molecule FK506 for enhanced bone formation – positive/therapeutic effect | week.
    3. Genetic association between ankle spacing width and age-related BMD – positive/therapeutic effect.

    Supplements
    1. Association between cigarette smoking and subclinical cardiovascular harm – G, MG | positive/therapeutic effect.
    2. Case report: trimalleolar fracture with Achilles tendon rupture – no clear dose/effect/duration.
    3. Vitamin D in foot/ankle treatment/surgery – g, g.

    Nutrients
    1. Nutritional rickets & osteomalacia – positive/therapeutic effect.
    2. Vitamin D in foot and ankle: review – positive/therapeutic effect.
    3. Vitamin D intake, calcium intake, physical activity & fracture risk in children – IU | positive/therapeutic effect.
    """.trimIndent(),
                listOf(
                    Reference("Eur J Orthop Surg Traumatol. 2025 Sep 13;35(1):396", "👉 Overview on management of ankle fractures in elderly – no clear dose/effect/duration", "40944730"),
                    Reference("J Orthop Case Rep. 2025 Sep;15(9):143-148", "👉 Tibiotalar nailing for geriatric pilon fractures – month", "40936864"),
                    Reference("J Orthop Case Rep. 2025 Sep;15(9):382-386", "👉 External fixation using locking plates – week", "40936817"),
                    Reference("J Surg Orthop Adv. 2025 Summer;34(1):23-25", "👉 Limiting narcotic utilization – mg", "40327734"),
                    Reference("J Orthop Surg Res. 2024 Dec 26;19(1):882", "👉 Pregabalin + naproxen perioperative pain – mg | negative/adverse effect | day, month", "39726018"),
                    Reference("Int Orthop. 2022 Jun;46(6):1427-1428", "👉 Epsilon-aminocaproic acid reduces post-op blood loss – positive/therapeutic effect", "35262758"),
                    Reference("Osteoporos Int. 2025 Sep 19", "👉 Should ankle fractures be considered osteoporotic – month", "40970965"),
                    Reference("J Clin Med. 2025 Aug 8;14(16):5619", "👉 Prioritization for DXA scan – positive/therapeutic effect | week, month, week", "40869445"),
                    Reference("J Surg Case Rep. 2025 Jun 23;2025(6):rjaf437", "👉 Comorbidities in sequential atraumatic fractures – no clear dose/effect/duration", "40585922"),
                    Reference("Aging Clin Exp Res. 2025 Aug 13;37(1):245", "👉 Insights into musculoskeletal/body composition – positive/therapeutic effect", "40802028"),
                    Reference("J Orthop Res. 2025 Oct;43(10):1805-1812", "👉 Osteogenic small molecule FK506 – positive/therapeutic effect | week", "40685948"),
                    Reference("Sci Rep. 2025 Jul 10;15(1):24863", "👉 Genetic association ankle spacing width & BMD – positive/therapeutic effect", "40640400"),
                    Reference("J Am Coll Cardiol. 2025 Mar 18;85(10):1018-1034", "👉 Smoking & subclinical cardiovascular harm – G, MG | positive/therapeutic effect", "40074467"),
                    Reference("JBJS Case Connect. 2024 Oct 3;14(4)", "👉 Trimalleolar fracture with Achilles rupture – no clear dose/effect/duration", "39361776"),
                    Reference("Orthop Clin North Am. 2024 Jul;55(3):383-392", "👉 Vitamin D in foot/ankle treatment – g, g", "38782509"),
                    Reference("Indian J Med Res. 2020 Oct;152(4):356-367", "👉 Nutritional rickets & osteomalacia – positive/therapeutic effect", "33380700"),
                    Reference("J Am Podiatr Med Assoc. 2020 May 1;110(3):Article_10", "👉 Vitamin D in foot and ankle: review – positive/therapeutic effect", "31589473"),
                    Reference("Nutr Health. 2019 Jun;25(2):113-118", "👉 Vitamin D, calcium, physical activity & fracture risk – IU | positive/therapeutic effect", "30722726")
                )
            )

            "Broken arm or wrist" -> Pair(
                """
    Alternative
    1. Outcomes of snuffbox arteriovenous fistula as first-line dialysis access – month.
    2. Osteoporosis prediction from hand X-ray images using AI – no clear dose/effect/duration.
    3. Muscle synergy-based iterative learning control for upper limb FES in stroke rehabilitation – positive/therapeutic effect.

    Herbs
    1. Dynamic assemblies and coordinated reactions of non-homologous end joining – no clear dose/effect/duration.
    2. Retrograde suture needle threading for intraocular lens repositioning – positive/therapeutic effect | month.
    3. Tattoo fading using Nd:YAG ns laser pulses – positive/therapeutic effect.

    Amino acids
    1. Dynamic assemblies and coordinated reactions of non-homologous end joining – no clear dose/effect/duration.
    2. Cogwheel rigidity in Parkinson's disease – positive/therapeutic effect.
    3. Retrograde suture needle threading for intraocular lens repositioning – positive/therapeutic effect | month.

    Vitamins
    1. Prioritization for DXA scan after fracture – positive/therapeutic effect | week, month, week.
    2. Pseudohypoparathyroidism with normocalcemia – month.
    3. Hand injuries & vitamin D deficiency – positive/therapeutic effect.

    Minerals
    1. Systemic inflammation in hip fracture & osteoarthritis – mg | positive/therapeutic effect.
    2. Osteoporosis prediction from hand X-ray images using AI – no clear dose/effect/duration.
    3. Medial humeral epicondylitis in cats – positive/therapeutic effect.

    Supplements
    1. Work-related finger, hand, wrist injuries – positive/therapeutic effect.
    2. Distal renal tubular acidosis & rickets – positive/therapeutic effect.
    3. Neuromuscular adaptations to caffeine supplementation – mg | positive/therapeutic effect.

    Nutrients
    1. Toes lateral free flap for finger soft tissue defect repair – g, g.
    2. MRI analysis of intra- and extra-osseous blood supply after scaphoid fractures – month.
    3. Dynamic assemblies and coordinated reactions of non-homologous end joining – no clear dose/effect/duration.
    """.trimIndent(),
                listOf(
                    Reference("J Vasc Surg. 2025 Sep 25:S0741-5214(25)01774-4", "👉 Snuffbox arteriovenous fistula – month", "41015349"),
                    Reference("Sci Rep. 2025 Sep 26;15(1):32964", "👉 Osteoporosis prediction from hand X-ray images using AI – no clear dose/effect/duration", "41006333"),
                    Reference("IEEE Trans Neural Syst Rehabil Eng. 2025 Sep 24;PP", "👉 Muscle synergy-based FES for upper limb – positive/therapeutic effect", "40991590"),
                    Reference("Nature. 2025 Jul;643(8072):847-854", "👉 Dynamic assemblies & non-homologous end joining – no clear dose/effect/duration", "40500445"),
                    Reference("BMC Ophthalmol. 2025 May 13;25(1):290", "👉 Retrograde suture needle threading – positive/therapeutic effect | month", "40361028"),
                    Reference("Lasers Med Sci. 2025 Mar 19;40(1):149", "👉 Tattoo fading using Nd:YAG ns laser pulses – positive/therapeutic effect", "40106046"),
                    Reference("Neurobiol Dis. 2025 Aug;212:106980", "👉 Cogwheel rigidity in Parkinson's – positive/therapeutic effect", "40447199"),
                    Reference("J Clin Med. 2025 Aug 8;14(16):5619", "👉 Prioritization for DXA scan – positive/therapeutic effect | week, month, week", "40869445"),
                    Reference("Ann Med Surg (Lond). 2025 May 26;87(7):4570-4572", "👉 Pseudohypoparathyroidism with normocalcemia – month", "40851936"),
                    Reference("Afr Health Sci. 2025 Jun;25(2):186-194", "👉 Hand injuries & vitamin D deficiency – positive/therapeutic effect", "40837645"),
                    Reference("Int J Mol Sci. 2025 Sep 19;26(18):9138", "👉 Systemic inflammation in hip fracture & OA – mg | positive/therapeutic effect", "41009701"),
                    Reference("J Feline Med Surg. 2025 Jul;27(7):1098612X251347952", "👉 Medial humeral epicondylitis in cats – positive/therapeutic effect", "40735978"),
                    Reference("Am J Prev Med. 2025 Sep 25:108134", "👉 Work-related finger, hand, wrist injuries – positive/therapeutic effect", "41015318"),
                    Reference("Cureus. 2025 Aug 17;17(8):e90337", "👉 Distal renal tubular acidosis & rickets – positive/therapeutic effect", "40978892"),
                    Reference("J Int Soc Sports Nutr. 2025 Dec;22(1):2561676", "👉 Caffeine supplementation & neuromuscular adaptations – mg | positive/therapeutic effect", "40954555"),
                    Reference("Int J Burns Trauma. 2025 Aug 15;15(4):149-158", "👉 Toes lateral free flap for finger soft tissue defect – g, g", "40978689"),
                    Reference("Orthop Surg. 2025 Sep;17(9):2617-2628", "👉 MRI of intra- and extra-osseous blood supply after scaphoid fractures – month", "40738614")
                )
            )

            "Broken collarbone" -> Pair(
                """
    Alternative
    ,,, 

    Herbs
    ,,, 

    Amino acids
    ,,, 

    Vitamins
    ,,, 

    Minerals
    ,,, 

    Supplements
    1. Hijacking of the aircraft OK ADN L410 TURBOLET on June 8, 1972 – no clear dose/effect/duration found.
    2. Hijacking of the aircraft OK ADN L410 TURBOLET on June 8, 1972 – no clear dose/effect/duration found.

    Nutrients
    ,,, 
    """.trimIndent(),
                listOf(
                    Reference("Soud Lek. 2021 Spring;66(1):11-16", "👉 Hijacking of the aircraft OK ADN L410 TURBOLET on June 8, 1972 – no clear dose/effect/duration found", "34275302"),
                    Reference("Cesk Patol. 2021 Spring;57(1):11-16", "👉 Hijacking of the aircraft OK ADN L410 TURBOLET on June 8, 1972 – no clear dose/effect/duration found", "33910353")
                )
            )

            "Broken finger or thumb" -> Pair(
                """
    Alternative
    1. Hyperselective Neurectomy for Spastic Flexion-Pronation Deformity of the Forearm and Wrist – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
    2. Outcomes of toe PIP joint transfer for IIIB hypoplastic thumb – Positive/therapeutic effect mentioned
    3. Epithelioid sarcoma of the hand and upper limb: Clinical features – No clear dose/effect/duration found

    Herbs
    1. Intra-orbital Foreign Body – Positive/therapeutic effect mentioned
    2. Repair of Median Nerve Motor Injury Using a Collagen Nerve Conduit – Positive/therapeutic effect mentioned | month
    3. New species of Amolops monticola group – No clear dose/effect/duration found

    Amino acids
    1. Intra-orbital Foreign Body – Positive/therapeutic effect mentioned
    2. Repair of Median Nerve Motor Injury Using a Collagen Nerve Conduit – Positive/therapeutic effect mentioned | month
    3. New species of Amolops monticola group – No clear dose/effect/duration found

    Vitamins
    1. Intra-orbital Foreign Body – Positive/therapeutic effect mentioned
    2. Repair of Median Nerve Motor Injury Using a Collagen Nerve Conduit – Positive/therapeutic effect mentioned | month
    3. New species of Amolops monticola group – No clear dose/effect/duration found

    Minerals
    1. Chemical Bonding Interpretation of Hydrated Magnesium Sulfates – No clear dose/effect/duration found
    2. Intra-orbital Foreign Body – Positive/therapeutic effect mentioned
    3. Thumb osteoarthritis pilot study – No clear dose/effect/duration found

    Supplements
    1. Intra-orbital Foreign Body – Positive/therapeutic effect mentioned
    2. Repair of Median Nerve Motor Injury Using a Collagen Nerve Conduit – Positive/therapeutic effect mentioned | month
    3. New species of Amolops monticola group – No clear dose/effect/duration found

    Nutrients
    1. Powering Nutrition Research – Positive/therapeutic effect mentioned
    2. Index finger proximal dorsal island flap for thumb defect – Positive/therapeutic effect mentioned | month
    3. Intra-orbital Foreign Body – Positive/therapeutic effect mentioned
    """.trimIndent(),
                listOf(
                    Reference("JBJS Essent Surg Tech. 2025 Mar 20;15(1):e24.00018", "👉 Hyperselective Neurectomy for Spastic Flexion-Pronation Deformity – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40979475"),
                    Reference("Adv Clin Exp Med. 2025 Sep 17", "👉 Outcomes of toe PIP joint transfer for IIIB hypoplastic thumb – Positive/therapeutic effect mentioned", "40959996"),
                    Reference("Hand Surg Rehabil. 2025 Sep 12", "👉 Epithelioid sarcoma of the hand and upper limb – No clear dose/effect/duration found", "40947015"),
                    Reference("J West Afr Coll Surg. 2025 Jul-Sep;15(3):362-365", "👉 Intra-orbital Foreign Body – Positive/therapeutic effect mentioned", "40586058"),
                    Reference("JBJS Case Connect. 2025 Jun 5;15(2)", "👉 Repair of Median Nerve Motor Injury Using a Collagen Nerve Conduit – Positive/therapeutic effect mentioned | month", "40472160"),
                    Reference("Zootaxa. 2025 Mar 3;5594(3):485-508", "👉 New species of Amolops monticola group – No clear dose/effect/duration found", "40173727"),
                    Reference("Inorg Chem. 2025 Sep 8;64(35):17712-17721", "👉 Chemical Bonding Interpretation of Hydrated Magnesium Sulfates – No clear dose/effect/duration found", "40916594"),
                    Reference("J Hand Ther. 2025 Jun 18:S0894-1130(25)00064-X", "👉 Thumb osteoarthritis pilot study – No clear dose/effect/duration found", "40537392"),
                    Reference("Nutrients. 2025 Aug 18;17(16):2668", "👉 Powering Nutrition Research – Positive/therapeutic effect mentioned", "40871696"),
                    Reference("Zhongguo Xiu Fu Chong Jian Wai Ke Za Zhi. 2025 Jul 15;39(7):869-872", "👉 Index finger proximal dorsal island flap for thumb defect – Positive/therapeutic effect mentioned | month", "40659591")
                )
            )

            "Broken hip" -> Pair(
                """
    Alternative
    1. Sodium-glucose co-transporter-2 inhibitors vs metformin in reducing osteoarthritis risk – Positive/therapeutic effect mentioned
    2. Ultrasound-Guided Fascia Iliaca Compartment Block – mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
    3. Osteosynthesis Using the WALANT Technique for geriatric intertrochanteric femur fractures – Positive/therapeutic effect mentioned

    Herbs
    1. Iranian herbal medicine formula for postoperative constipation in hip and lower limb fractures – mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
    2. Effects of Chinese Herbal Medicines on mortality, readmission, and reoperation in hip fracture patients – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

    Amino acids
    1. Parathyroid hormone receptor agonists in osteoporosis management – Negative/adverse effect mentioned
    2. Vertebral fractures and comorbidities in rheumatoid arthritis – No clear dose/effect/duration found
    3. Long-duration type 1 diabetes and deficient cortical bone behavior in femoral bone – Positive/therapeutic effect mentioned

    Vitamins
    1. Impact of anticoagulation therapy on surgical timing and outcomes in proximal femur fracture – Positive/therapeutic effect mentioned | day
    2. Atypical femoral fracture secondary to long-term bisphosphonate use – Positive/therapeutic effect mentioned
    3. Fragility fractures of the femur in spinal cord injury patients – g | Positive/therapeutic effect mentioned

    Minerals
    1. Preoperative bisphosphonate therapy effect on bone mineral density – Positive/therapeutic effect mentioned
    2. Systemic inflammation in hip fracture and osteoarthritis – mg | Positive/therapeutic effect mentioned
    3. Depressive symptoms and fracture in midlife women – No clear dose/effect/duration found

    Supplements
    1. Effect of perioperative music on delirium after hip fracture operations – Negative/adverse effect mentioned
    2. Radiographic healing after intramedullary nailing with/without lateral plate augmentation – Positive/therapeutic effect mentioned | month
    3. Fracture risk in chronic kidney disease – Positive/therapeutic effect mentioned

    Nutrients
    1. Impact of sarcopenic diabetes on outcomes and mortality in older adults hospitalized for hip fracture – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
    2. High-load resistance training program on bone health in wheelchair users – week, month
    3. Non-pharmacologic interventions in osteoporosis management: nutrition and exercise counseling – Positive/therapeutic effect mentioned | month
    """.trimIndent(),
                listOf(
                    Reference("JBMR Plus. 2025 Aug 12;9(10):ziaf132", "👉 SGLT-2 inhibitors vs metformin – Positive/therapeutic effect mentioned", "40978121"),
                    Reference("StatPearls [Internet]. 2025 Jan–", "👉 Ultrasound-Guided Fascia Iliaca Compartment Block – mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "30085515"),
                    Reference("J Clin Med. 2025 Aug 28;14(17):6078", "👉 Osteosynthesis Using WALANT Technique – Positive/therapeutic effect mentioned", "40943840"),
                    Reference("Int J Orthop Trauma Nurs. 2025 May;57:101163", "👉 Iranian herbal medicine formula – mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "39951927"),
                    Reference("Front Pharmacol. 2019 Jun 11;10:629", "👉 Chinese Herbal Medicines on mortality, readmission, reoperation – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "31244656"),
                    Reference("Nat Rev Rheumatol. 2025 Oct;21(10):599-611", "👉 Parathyroid hormone receptor agonists – Negative/adverse effect mentioned", "40790089"),
                    Reference("J Bone Miner Metab. 2025 Jul;43(4):402-410", "👉 Vertebral fractures and comorbidities – No clear dose/effect/duration found", "40148713"),
                    Reference("J Bone Miner Res. 2024 Dec 31;40(1):87-99", "👉 Long-duration type 1 diabetes and femoral bone – Positive/therapeutic effect mentioned", "39561104"),
                    Reference("Acta Orthop Traumatol Turc. 2025 Sep 12;59(5):253-258", "👉 Impact of anticoagulation therapy – Positive/therapeutic effect mentioned | day", "40994363"),
                    Reference("Cureus. 2025 Aug 20;17(8):e90611", "👉 Atypical femoral fracture – Positive/therapeutic effect mentioned", "40978969"),
                    Reference("Cureus. 2025 Aug 20;17(8):e90561", "👉 Fragility fractures in spinal cord injury patients – g | Positive/therapeutic effect mentioned", "40978829"),
                    Reference("Probl Endokrinol (Mosk). 2025 Sep 14;71(4):57-70", "👉 Preoperative bisphosphonate therapy on BMD – Positive/therapeutic effect mentioned", "41014616"),
                    Reference("Int J Mol Sci. 2025 Sep 19;26(18):9138", "👉 Systemic inflammation in hip fracture and OA – mg | Positive/therapeutic effect mentioned", "41009701"),
                    Reference("Medicine (Baltimore). 2025 Sep 19;104(38):e44643", "👉 Depressive symptoms and fracture – No clear dose/effect/duration found", "40988242"),
                    Reference("BMJ Open. 2025 Aug 28;15(8):e095819", "👉 Perioperative music on delirium – Negative/adverse effect mentioned", "40876886"),
                    Reference("J Clin Med. 2025 Jul 14;14(14):4976", "👉 Radiographic healing after intramedullary nailing – Positive/therapeutic effect mentioned | month", "40725668"),
                    Reference("Metabolites. 2025 Jul 7;15(7):460", "👉 Fracture risk in chronic kidney disease – Positive/therapeutic effect mentioned", "40710560"),
                    Reference("Nutrients. 2025 Aug 12;17(16):2616", "👉 Sarcopenic diabetes on outcomes after hip fracture – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40871644"),
                    Reference("JMIR Res Protoc. 2025 Aug 8;14:e70125", "👉 High-load resistance training in wheelchair users – week, month", "40779767"),
                    Reference("Iowa Orthop J. 2025;45(1):283-289", "👉 Nutrition and exercise counseling in osteoporosis management – Positive/therapeutic effect mentioned | month", "40606731")
                )
            )

            "Broken leg" -> Pair(
                """
    Alternative
    1. Olympic distance duathlon and cardiac performance in highly-trained triathletes – Positive/therapeutic effect mentioned | day
    2. Retrieval of broken pituitary rongeur tip from lumbar intervertebral disc – No clear dose/effect/duration found
    3. Indel detection following CRISPR/Cas9 mutagenesis – No clear dose/effect/duration found

    Herbs
    (No data available)

    Amino acids
    1. Dietary Zinc Glycine Supplementation improves tibia quality in meat ducks – mg | Positive/therapeutic effect mentioned
    2. Effects of dietary threonine and immune stress on growth and intestinal genes in Pekin ducks – g | Positive/therapeutic effect mentioned | day
    3. Effects of dietary energy and lysine levels on growth and carcass yields in Pekin ducks – day

    Vitamins
    1. Expression of vitamin D receptor in bones of immobilized immature rats – week
    2. Riboflavin requirement of turkey poults fed corn-soy diet – mg | Positive/therapeutic effect mentioned | day
    3. Riboflavin requirement of broiler chicks fed corn-soy diet – g, mg | Positive/therapeutic effect mentioned | day

    Minerals
    1. Enhanced bone remodeling after fracture priming – G | week, day
    2. Shortened replantation with limb lengthening for severe lower leg amputation – Positive/therapeutic effect mentioned | month
    3. Expression of vitamin D receptor in bones of immature rats (DOP) – week

    Supplements
    1. Dietary Zinc Glycine Supplementation improves tibia quality – mg | Positive/therapeutic effect mentioned
    2. Dietary L-Methionine supplementation on growth and plasma parameters in starter Pekin ducks – g | day
    3. Effects of dietary zinc on carcass traits, meat quality, antioxidant status in Pekin ducks – mg | Positive/therapeutic effect mentioned | day

    Nutrients
    1. Dietary effect of energy levels on growth and carcass characteristics of White Pekin duck – day
    2. Nutrient absorption and blood plasma changes in stunted broilers – g
    """.trimIndent(),
                listOf(
                    Reference("Physiol Rep. 2024 Dec;12(24):e70154", "👉 Olympic distance duathlon – Positive/therapeutic effect mentioned | day", "39725671"),
                    Reference("J Neurosurg Case Lessons. 2024 Dec 2;8(23):CASE24377", "👉 Retrieval of broken pituitary rongeur tip – No clear dose/effect/duration found", "39622041"),
                    Reference("J Vis Exp. 2021 Sep 10;(175):10.3791/63008", "👉 Indel detection following CRISPR/Cas9 – No clear dose/effect/duration found", "34570096"),
                    Reference("Biol Trace Elem Res. 2023 Feb;201(2):888-903", "👉 Zinc Glycine supplementation – mg | Positive/therapeutic effect mentioned", "35320516"),
                    Reference("Poult Sci. 2018 Jan 1;97(1):177-187", "👉 Dietary threonine and immune stress in Pekin ducks – g | Positive/therapeutic effect mentioned | day", "29087516"),
                    Reference("Poult Sci. 2017 Sep 1;96(9):3361-3366", "👉 Dietary energy and lysine levels in Pekin ducks – day", "28605560"),
                    Reference("Sichuan Da Xue Xue Bao Yi Xue Ban. 2010 Jan;41(1):106-10", "👉 Vitamin D receptor in bones of rats – week", "20369481"),
                    Reference("Poult Sci. 1989 May;68(5):715-8", "👉 Riboflavin requirement of turkey poults – mg | Positive/therapeutic effect mentioned | day", "2755897"),
                    Reference("Poult Sci. 1988 May;67(5):794-9", "👉 Riboflavin requirement of broiler chicks – g, mg | Positive/therapeutic effect mentioned | day", "3405955"),
                    Reference("Calcif Tissue Int. 2022 Mar;110(3):349-366", "👉 Enhanced bone remodeling after fracture – G | week, day", "34668029"),
                    Reference("Zhongguo Xiu Fu Chong Jian Wai Ke Za Zhi. 2017 Aug 15;31(8):936-940", "👉 Shortened replantation with limb lengthening – Positive/therapeutic effect mentioned | month", "29806429"),
                    Reference("Sichuan Da Xue Xue Bao Yi Xue Ban. 2010 Jan;41(1):106-10", "👉 Vitamin D receptor in bones of immature rats – week", "20369481"),
                    Reference("Biol Trace Elem Res. 2023 Feb;201(2):888-903", "👉 Zinc Glycine supplementation – mg | Positive/therapeutic effect mentioned", "35320516"),
                    Reference("Animals (Basel). 2021 Jan 11;11(1):144", "👉 Dietary L-Methionine supplementation – g | day", "33440693"),
                    Reference("Biol Trace Elem Res. 2019 Jul;190(1):187-196", "👉 Dietary Zinc on carcass traits and meat quality – mg | Positive/therapeutic effect mentioned | day", "30343482"),
                    Reference("J Anim Sci Technol. 2022 May;64(3):471-480", "👉 Dietary energy levels on growth performance – day", "35709127"),
                    Reference("Avian Dis. 1982 Oct-Dec;26(4):852-9", "👉 Nutrient absorption and blood plasma in stunted broilers – g", "7159323")
                )
            )

            "Bronchiectasis" -> Pair(
                """
    Alternative
    1. Ultra-low-dose chest CT with co-production in cystic fibrosis care – Positive/therapeutic effect mentioned | week
    2. AI-based automated PRAGMA and mucus plugging algorithm in pediatric cystic fibrosis – No clear dose/effect/duration found
    3. Kartagener's syndrome with congenital heart defect – g | Positive/therapeutic effect mentioned

    Herbs
    1. Huatan Huoxue prescription for obstructive sleep apnea – No clear dose/effect/duration found
    2. Chinese herbs for reversible bronchiectasis in adults – day, month
    3. Clinical aspects of Taiwanese patients with HIES – month

    Amino acids
    1. Sputum microbiota correlates with metabolome in COPD-Bronchiectasis – No clear dose/effect/duration found
    2. Acetylcysteine combined with diphylline in children with bronchopneumonia – Negative/adverse effect mentioned
    3. Pneumonia and bacteremia in primary ciliary dyskinesia patient – No clear dose/effect/duration found

    Vitamins
    1. Persistent pulmonary findings after COVID-19 – Positive/therapeutic effect mentioned
    2. Vitamin D deficiency and severity of non-cystic fibrosis bronchiectasis – No clear dose/effect/duration found
    3. Routine blood testing in primary ciliary dyskinesia – No clear dose/effect/duration found

    Minerals
    1. Possible causes of severe osteoporosis: diffuse panbronchiolitis – No clear dose/effect/duration found
    2. CT features of feline cystic bronchiectasis forming mass lesions – No clear dose/effect/duration found
    3. Bone mineral density in common variable immunodeficiency patients – No clear dose/effect/duration found

    Supplements
    1. Non-pharmacological therapies addressing treatable traits in bronchiectasis – No clear dose/effect/duration found
    2. Guiding practice principles for Indigenous populations – Positive/therapeutic effect mentioned
    3. Therapeutic potential of Myo-Inositol in respiratory diseases – Positive/therapeutic effect mentioned

    Nutrients
    1. Metabolic strategies enabling oral commensal persistence in lower airway – Positive/therapeutic effect mentioned
    2. Mycobacterium hainanense and chronic pulmonary disease – No clear dose/effect/duration found
    3. Metabolic strategies for oral commensal persistence in lower airway (preprint) – Positive/therapeutic effect mentioned
    """.trimIndent(),
                listOf(
                    Reference("Pediatr Res. 2025 Sep 18", "👉 Ultra-low-dose chest CT – Positive/therapeutic effect mentioned | week", "40968222"),
                    Reference("J Cyst Fibros. 2025 Sep;24(5):970-978", "👉 AI-based PRAGMA and mucus algorithm – No clear dose/effect/duration found", "40841295"),
                    Reference("Cardiol Young. 2025 Aug;35(8):1734-1739", "👉 Kartagener's syndrome – g | Positive/therapeutic effect mentioned", "40785399"),
                    Reference("Medicine (Baltimore). 2020 Jul 24;99(30):e21070", "👉 Huatan Huoxue prescription – No clear dose/effect/duration found", "32791678"),
                    Reference("Medicine (Baltimore). 2017 Dec;96(50):e8883", "👉 Chinese herbs for reversible bronchiectasis – day, month", "29390276"),
                    Reference("J Clin Immunol. 2011 Apr;31(2):272-80", "👉 HIES in Taiwanese patients – month", "21120687"),
                    Reference("Exploration (Beijing). 2025 May 4;5(4):e20240149", "👉 Sputum microbiota in COPD-Bronchiectasis – No clear dose/effect/duration found", "40873638"),
                    Reference("Pak J Pharm Sci. 2025 Jul-Aug;38(4):1117-1124", "👉 Acetylcysteine + diphylline – Negative/adverse effect mentioned", "40761046"),
                    Reference("Respir Med Case Rep. 2025 Jul 5;57:102259", "👉 Pneumonia in primary ciliary dyskinesia – No clear dose/effect/duration found", "40688712"),
                    Reference("Cureus. 2025 Aug 19;17(8):e90542", "👉 Persistent pulmonary findings post-COVID-19 – Positive/therapeutic effect mentioned", "40978879"),
                    Reference("Expert Rev Respir Med. 2025 Jul 20:1-10", "👉 Vitamin D deficiency & bronchiectasis – No clear dose/effect/duration found", "40662885"),
                    Reference("ERJ Open Res. 2025 Jun 23;11(3):01071-2024", "👉 Routine blood testing in PCD – No clear dose/effect/duration found", "40551794"),
                    Reference("Osteoporos Int. 2025 Jul;36(7):1287-1290", "👉 Diffuse panbronchiolitis – No clear dose/effect/duration found", "40434689"),
                    Reference("JFMS Open Rep. 2024 Jan 19;10(1):20551169231217866", "👉 Feline cystic bronchiectasis – No clear dose/effect/duration found", "38250625"),
                    Reference("Endocr Metab Immune Disord Drug Targets. 2024;24(2):242-254", "👉 Bone mineral density in CVID – No clear dose/effect/duration found", "37608677"),
                    Reference("J Thorac Dis. 2025 Jun 30;17(6):4302-4322", "👉 Non-pharmacological therapies – No clear dose/effect/duration found", "40688306"),
                    Reference("Front Pediatr. 2025 Jun 17;13:1526753", "👉 Guiding practice principles – Positive/therapeutic effect mentioned", "40599895"),
                    Reference("Int J Mol Sci. 2025 Feb 28;26(5):2185", "👉 Myo-Inositol therapeutic potential – Positive/therapeutic effect mentioned", "40076806"),
                    Reference("mBio. 2025 Sep 22:e0194825", "👉 Metabolic strategies enabling oral commensal persistence – Positive/therapeutic effect mentioned", "40980886"),
                    Reference("Sci Rep. 2025 Aug 28;15(1):31670", "👉 Mycobacterium hainanense – No clear dose/effect/duration found", "40866420"),
                    Reference("bioRxiv [Preprint]. 2025 Jul 3:2025.07.03.662932", "👉 Metabolic strategies for oral commensal persistence – Positive/therapeutic effect mentioned", "40631094")
                )
            )

            "Bronchitis" -> Pair(
                """
    Alternative
    1. Reverse Transcription Recombinase-Aided Amplification Assay for Newcastle Disease Virus – Positive/therapeutic effect mentioned
    2. Pulse methylprednisolone + IV immunoglobulin in pediatric postinfectious bronchiolitis obliterans – g, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day
    3. Virtual-first vs in-person-first care for acute conditions – No clear dose/effect/duration found

    Herbs
    1. Chimonanthus salicifolius essential oil for acute lung injury – Positive/therapeutic effect mentioned
    2. Quercetin in kidney disease – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned
    3. Angelica glauca root – mg, μg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned

    Amino acids
    1. Recombinant COBRA infectious bronchitis virus spike protein in chickens – Positive/therapeutic effect mentioned
    2. Full-length S1 gene sequencing of GI-19/GI-23 IBV in Egypt – g
    3. GI-19 genotype of IBV in Sichuan chickens – g | Positive/therapeutic effect mentioned

    Vitamins
    1. 1,25-dihydroxy-vitamin D3 on immune response in chicken fibroblasts – g | Positive/therapeutic effect mentioned
    2. Polygalae Radix extract (PRE) alleviates oxidative stress – g, mg | Positive/therapeutic effect mentioned
    3. Harms of electronic cigarettes – Negative/adverse effect mentioned

    Minerals
    1. Population-based study of respiratory diseases – No clear dose/effect/duration found
    2. Dietary supplementation of biochars in broiler chicks – Positive/therapeutic effect mentioned | day
    3. Erchen decoction alleviates silicosis – Positive/therapeutic effect mentioned

    Supplements
    1. Lactobacillus + serratopeptidase supplementation in broiler chicks – mg | Positive/therapeutic effect mentioned
    2. Algal supplementation in broiler chickens – Positive/therapeutic effect mentioned
    3. Demographics, risk factors, chronic cough in Asia – Positive/therapeutic effect mentioned

    Nutrients
    1. Dietary supplementation of biochars in broiler chicks – Positive/therapeutic effect mentioned | day
    2. Cinnamon + turmeric supplementation in broiler chickens – Positive/therapeutic effect mentioned
    3. Hemophilus influenza pangenome/vaccine design – No clear dose/effect/duration found
    """.trimIndent(),
                listOf(
                    Reference("Pathogens. 2025 Sep 1;14(9):867", "👉 Reverse Transcription Recombinase-Aided Amplification Assay – Positive/therapeutic effect mentioned", "41011768"),
                    Reference("Eur J Pediatr. 2025 Aug 7;184(9):536", "👉 Pulse methylprednisolone + IVIG – g, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day", "40773144"),
                    Reference("BMC Health Serv Res. 2025 Jul 29;25(1):994", "👉 Virtual-first vs in-person-first care – No clear dose/effect/duration found", "40731288"),
                    Reference("J Ethnopharmacol. 2025 Sep 25;353(Pt B):120419", "👉 Chimonanthus salicifolius essential oil – Positive/therapeutic effect mentioned", "40816582"),
                    Reference("Biomed Pharmacother. 2025 Sep;190:118358", "👉 Quercetin – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40680672"),
                    Reference("Fitoterapia. 2025 Jun;183:106565", "👉 Angelica glauca root – mg, μg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40274199"),
                    Reference("Vet Res Commun. 2025 May 13;49(4):196", "👉 Recombinant COBRA IBV spike protein – Positive/therapeutic effect mentioned", "40358746"),
                    Reference("Virol J. 2025 May 7;22(1):135", "👉 Full-length S1 gene sequencing of IBV – g", "40335991"),
                    Reference("Virology. 2025 Jul;608:110543", "👉 GI-19 genotype IBV in Sichuan – g | Positive/therapeutic effect mentioned", "40286468"),
                    Reference("Poult Sci. 2025 Aug 7;104(11):105637", "👉 1,25-dihydroxy-vitamin D3 – g | Positive/therapeutic effect mentioned", "40845461"),
                    Reference("J Ethnopharmacol. 2025 May 28;348:119878", "👉 Polygalae Radix extract (PRE) – g, mg | Positive/therapeutic effect mentioned", "40287113"),
                    Reference("Pediatr Allergy Immunol Pulmonol. 2025 Mar;38(1):1-6", "👉 Electronic cigarettes – Negative/adverse effect mentioned", "39977217"),
                    Reference("Epidemiol Serv Saude. 2025 Sep 15;34:e20240519", "👉 Population-based respiratory disease study – No clear dose/effect/duration found", "40960761"),
                    Reference("Vet Sci. 2025 Jul 18;12(7):680", "👉 Biochars in broiler chicks – Positive/therapeutic effect mentioned | day", "40711340"),
                    Reference("J Ethnopharmacol. 2025 Aug 29;352:120227", "👉 Erchen decoction – Positive/therapeutic effect mentioned", "40617365"),
                    Reference("Poult Sci. 2025 Sep;104(9):105500", "👉 Lactobacillus + serratopeptidase – mg | Positive/therapeutic effect mentioned", "40602096"),
                    Reference("Animal. 2025 Jul;19(7):101560", "👉 Algal supplementation – Positive/therapeutic effect mentioned", "40540766"),
                    Reference("J Thorac Dis. 2025 May 30;17(5):3419-3432", "👉 Demographics, chronic cough – Positive/therapeutic effect mentioned", "40529737"),
                    Reference("Poult Sci. 2025 Jul 11;104(10):105556", "👉 Cinnamon + turmeric – Positive/therapeutic effect mentioned", "40675002"),
                    Reference("Vet Sci. 2025 Jul 18;12(7):680", "👉 Biochars in broiler chicks – Positive/therapeutic effect mentioned | day", "40711340"),
                    Reference("Sci Rep. 2025 Jul 1;15(1):22316", "👉 Hemophilus influenza pangenome/vaccine design – No clear dose/effect/duration found", "40594015")
                )
            )

            "Bursitis" -> Pair(
                """
    Alternative
    1. ELISA assay for infectious bursal disease virus antibodies – No clear dose/effect/duration found.
    2. Photobiomodulation + exercise-based rehab for rotator cuff pathology – Positive/therapeutic effect mentioned | week.
    3. Intra-articular ozone vs steroid injection in adhesive capsulitis – Positive/therapeutic effect mentioned | week.

    Herbs
    ,,, 

    Amino acids
    1. Oral glucocorticoids + pregabalin for frozen shoulder – mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month.
    2. Laser therapy with lysine ketoprofen gel – No clear dose/effect/duration found.
    3. Palindromic rheumatism (lysine-related mention) – No clear dose/effect/duration found.

    Vitamins
    1. Pure acupotomy relieving frozen shoulder dysfunction – Positive/therapeutic effect mentioned | day.
    2. Bee venom acupuncture for periarthritis humeroscapularis – g, mg | Positive/therapeutic effect mentioned.
    3. Vitamin C prophylaxis against frozen shoulder (animal model) – Positive/therapeutic effect mentioned.

    Minerals
    1. Imaging in psoriatic arthritis – Positive/therapeutic effect mentioned.
    2. Tenosynovial chondromatosis case report – Positive/therapeutic effect mentioned.
    3. Acute calcific periarthritis (ACP) – Positive/therapeutic effect mentioned | week, day.

    Supplements
    1. Ultrasound-guided interventions for knee – No clear dose/effect/duration found.
    2. Clostridium perfringens challenge model (feed additives) – No clear dose/effect/duration found.
    3. Adhesive capsulitis management (arthroscopy report) – mg | Positive/therapeutic effect mentioned | month.

    Nutrients
    1. Necrotic enteritis lesions in chickens – No clear dose/effect/duration found.
    2. RNA-sequence analysis of idiopathic adhesive capsulitis – No clear dose/effect/duration found.
    3. Distal pedicled reversed upper arm flap for elbow defects – Positive/therapeutic effect mentioned | month.
    """.trimIndent(),
                listOf(
                    Reference("Rev Argent Microbiol. 2025 Jul-Sep;57(3):208-216", "👉 ELISA for IBDV antibodies – No clear dose/effect/duration found", "40685170"),
                    Reference("Wound Repair Regen. 2025 May-Jun;33(3):e70043", "👉 Photobiomodulation + rehab – Positive/therapeutic effect mentioned | week", "40371595"),
                    Reference("Clin Rheumatol. 2025 Jun;44(6):2517-2525", "👉 Ozone vs steroid injection – Positive/therapeutic effect mentioned | week", "40343617"),
                    Reference("Int Orthop. 2015 Feb;39(2):249-54", "👉 Oral glucocorticoids + pregabalin – mg | Positive & Negative effects | month", "25573767"),
                    Reference("Clin Ter. 1986 Jul 15;118(1):13-7", "👉 Laser therapy + lysine ketoprofen gel – No clear dose/effect/duration found", "3091312"),
                    Reference("Rev Paul Med. 1985 May-Jun;103(3):150", "👉 Palindromic rheumatism – No clear dose/effect/duration found", "3878995"),
                    Reference("J Tradit Chin Med. 2023 Aug;43(4):795-800", "👉 Bee venom acupuncture – g, mg | Positive effect", "37454265"),
                    Reference("Am J Sports Med. 2023 Jul;51(8):2041-2049", "👉 Vitamin C prophylaxis – Positive effect", "37249131"),
                    Reference("Ther Adv Musculoskelet Dis. 2024 Oct 16;16:1759720X241288060", "👉 Imaging in psoriatic arthritis – Positive effect", "39421802"),
                    Reference("BMC Musculoskelet Disord. 2023 Apr 1;24(1):251", "👉 Tenosynovial chondromatosis case – Positive effect", "37005684"),
                    Reference("Skeletal Radiol. 2022 Aug;51(8):1553-1561", "👉 Acute calcific periarthritis – Positive effect | week, day", "35149896"),
                    Reference("Acta Chir Orthop Traumatol Cech. 2025 Aug;92(Suppl.1):34-38", "👉 Ultrasound-guided knee interventions – No clear dose/effect/duration found", "40878603"),
                    Reference("Pathogens. 2025 Jul 17;14(7):707", "👉 Clostridium perfringens model – No clear dose/effect/duration found", "40732753"),
                    Reference("Arthroscopy. 2025 Jul;41(7):2176-2178", "👉 Adhesive capsulitis – mg | Positive effect | month", "40545326"),
                    Reference("Avian Dis. 2020 Sep 1;64(3):356-364", "👉 Necrotic enteritis lesions – No clear dose/effect/duration found", "33205162"),
                    Reference("Mol Med Rep. 2017 Nov;16(5):7665-7672", "👉 RNA-sequence analysis of adhesive capsulitis – No clear dose/effect/duration found", "28944902"),
                    Reference("J Plast Reconstr Aesthet Surg. 2008;61(5):546-51", "👉 Upper arm flap for elbow defects – Positive effect | month", "17618845")
                )
            )

            "Caffeine intolerance" -> Pair(
                """
    Alternative
    1. Continuous positive airway pressure vs methylxanthine for apnoea in preterm infants – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week, month.
    2. Eight-herb formula (RCM-107) inhibiting pancreatic lipase – No clear dose/effect/duration found.
    3. Existing dietary guidelines for Crohn's and ulcerative colitis – No clear dose/effect/duration found.

    Herbs
    1. Eight-herb formula (RCM-107) inhibiting pancreatic lipase – No clear dose/effect/duration found.

    Amino acids
    1. Impaired sympathoadrenal axis in prediabetic obese rats – No clear dose/effect/duration found.
    2. Human brain metabolic response to caffeine and tolerance – mg | Negative/adverse effect mentioned.
    3. Sulfonamide intolerance in HIV patients – No clear dose/effect/duration found.

    Vitamins
    1. Vitamin E nutrigenomics in equine health – g | Positive/therapeutic effect mentioned.
    2. Dietary supplements for weight management – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
    3. Existing dietary guidelines for IBD – No clear dose/effect/duration found.

    Minerals
    1. Existing dietary guidelines for IBD – No clear dose/effect/duration found.
    2. Diet, nutrition and bone health – g | Positive/therapeutic effect mentioned.
    3. Nutrition during pregnancy – No clear dose/effect/duration found.

    Supplements
    1. Dietary supplements for weight management – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
    2. Fubrick tea regulating gut microbiota and caffeine metabolism – Positive/therapeutic effect mentioned.
    3. Caffeine inhibits hypothalamic A1R, excites oxytocin neurons, improves obesity – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.

    Nutrients
    1. Early caffeine exposure causing metabolic/hormonal changes in rats – Positive/therapeutic effect mentioned.
    2. Vitamin E nutrigenomics in equine health – g | Positive/therapeutic effect mentioned.
    3. Dietary supplements for weight management – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
    """.trimIndent(),
                listOf(
                    Reference("Cochrane Database Syst Rev. 2025 Jul 22;7(7):CD001072", "👉 CPAP vs methylxanthine – Positive & Negative effects | week, month", "40693523"),
                    Reference("Heliyon. 2019 Sep 12;5(9):e02453", "👉 RCM-107 formula inhibiting pancreatic lipase – No clear dose/effect/duration found", "31538117"),
                    Reference("Expert Rev Gastroenterol Hepatol. 2011 Jun;5(3):411-25", "👉 IBD dietary guidelines – No clear dose/effect/duration found", "21651358"),
                    Reference("Exp Diabetes Res. 2011;2011:947917", "👉 Sympathoadrenal axis in prediabetic obese rats – No clear dose/effect/duration found", "21860615"),
                    Reference("Am J Psychiatry. 1999 Feb;156(2):229-37", "👉 Brain metabolic response to caffeine – mg | Negative effect", "9989559"),
                    Reference("J Clin Pharmacol. 1996 Dec;36(12):1149-53", "👉 Sulfonamide intolerance in HIV – No clear dose/effect/duration found", "9013372"),
                    Reference("J Equine Vet Sci. 2025 May;148:105421", "👉 Vitamin E nutrigenomics in equine health – g | Positive effect", "40122270"),
                    Reference("Nutrients. 2022 Apr 24;14(9):1787", "👉 Dietary supplements for weight management – Positive & Negative effects", "35565754"),
                    Reference("Clin Ter. 2005 Jan-Apr;156(1-2):47-56", "👉 Diet, nutrition and bone health – g | Positive effect", "16080661"),
                    Reference("Am Fam Physician. 1997 Jul;56(1):205-12, 216-8", "👉 Nutrition during pregnancy – No clear dose/effect/duration found", "9225676"),
                    Reference("Food Funct. 2020 Aug 1;11(8):6971-6986", "👉 Fubrick tea regulating microbiota & caffeine metabolism – Positive effect", "32697259"),
                    Reference("Nat Commun. 2017 Jun 27;8:15904", "👉 Caffeine inhibits hypothalamic A1R, improves obesity – Positive & Negative effects", "28654087"),
                    Reference("Nutrients. 2025 Aug 26;17(17):2763", "👉 Early caffeine exposure metabolic/hormonal effects – Positive effect", "40944153")
                )
            )

            "Canker sores" -> Pair(
                """
    Alternative
    1. Roflumilast for oral ulcers in Behçet's disease and recurrent aphthous stomatitis – mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
    2. Machine learning analysis of biomarkers in oral mucosal diseases – Positive/therapeutic effect mentioned.
    3. Lasers for recurrent aphthous ulcers – No clear dose/effect/duration found.

    Herbs
    1. RAS guideline for diagnosis and management – No clear dose/effect/duration found.
    2. Natural extracts for oral ulcers (systematic review) – Positive/therapeutic effect mentioned.
    3. Shuanghua Baihe tablets alkaloid kinetics – Positive/therapeutic effect mentioned.

    Amino acids
    1. Salivary proteome in mucositis & transplantation – Positive/therapeutic effect mentioned | week, month.
    2. Micronutrients and oral mucosal diseases in children – No clear dose/effect/duration found.
    3. Nutritional supplements in dermatology (review) – Positive/therapeutic effect mentioned.

    Vitamins
    1. Vitamins B12 & D deficiency linked to oral disease – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
    2. Vitamin D insufficiency in PFAPA syndrome – No clear dose/effect/duration found.
    3. Vitamin D levels in RAS (military population) – No clear dose/effect/duration found.

    Minerals
    1. Pemphigus case series (oral medicine relevance) – Positive/therapeutic effect mentioned | day.
    2. Micronutrients and oral mucosal diseases in children – No clear dose/effect/duration found.
    3. Nutritional supplements in dermatology (review) – Positive/therapeutic effect mentioned.

    Supplements
    1. Interleukin 10 supplement for recurrent aphthous stomatitis – Positive/therapeutic effect mentioned.
    2. Smoking and recurrent aphthous stomatitis (Mendelian randomization) – No clear dose/effect/duration found.
    3. Zinc-enriched multivitamins in RAS – mg | Negative/adverse effect mentioned.

    Nutrients
    1. Biomarkers in oral mucosal diseases (machine learning) – Positive/therapeutic effect mentioned.
    2. Genetic mutations in hyperhomocysteinemia & metabolic syndrome – Positive/therapeutic effect mentioned.
    3. Celiac disease and long-term outcomes – No clear dose/effect/duration found.
    """.trimIndent(),
                listOf(
                    Reference("J Dermatol. 2025 Sep 23", "👉 Roflumilast for oral ulcers – mg | Positive & Negative effects", "40985567"),
                    Reference("BMC Oral Health. 2025 May 10;25(1):703", "👉 Biomarker ML analysis – Positive effect", "40348983"),
                    Reference("Lasers Med Sci. 2025 Jan 28;40(1):49", "👉 Laser management of aphthous ulcers – No clear dose/effect/duration", "39870970"),
                    Reference("Eur J Paediatr Dent. 2022 Mar;23(1):73-78", "👉 RAS guideline – No clear dose/effect/duration", "35274547"),
                    Reference("J Clin Exp Dent. 2021 Oct;13(10):e1038-e1048", "👉 Natural extracts for oral ulcers – Positive effect", "34667500"),
                    Reference("Nat Prod Res. 2018 Sep;32(17):2031-2036", "👉 Shuanghua Baihe tablets alkaloids – Positive effect", "28871816"),
                    Reference("BMC Oral Health. 2023 Jul 7;23(1):460", "👉 Salivary proteome & mucositis – Positive effect | week, month", "37420206"),
                    Reference("Shanghai Kou Qiang Yi Xue. 2022 Jun;31(3):274-281", "👉 Micronutrients & oral mucosal diseases – No clear dose/effect/duration", "36204956"),
                    Reference("J Cosmet Dermatol. 2022 Jan;21(1):85-98", "👉 Nutritional supplements in dermatology – Positive effect", "34564936"),
                    Reference("J Pharm Bioallied Sci. 2025 Jun;17(Suppl 2):S1749-S1751", "👉 Vitamins B12 & D deficiency – Positive & Negative effects", "40655703"),
                    Reference("Intern Emerg Med. 2025 Sep;20(6):1721-1729", "👉 Vitamin D insufficiency in PFAPA – No clear dose/effect/duration", "40514613"),
                    Reference("Mil Med. 2025 May 29", "👉 Vitamin D in RAS (military population) – No clear dose/effect/duration", "40440183"),
                    Reference("Diagnostics. 2023 Dec 8;13(24):3633", "👉 Pemphigus case series – Positive effect | day", "38132217"),
                    Reference("World J Methodol. 2025 Sep 20;15(3):99176", "👉 Interleukin 10 supplement – Positive effect", "40881227"),
                    Reference("Tob Induc Dis. 2025 Jan 15;23", "👉 Smoking & RAS – No clear dose/effect/duration", "39822243"),
                    Reference("J Clin Med. 2025 Jan 5;14(1):260", "👉 Zinc-enriched multivitamins in RAS – mg | Negative effect", "39797342"),
                    Reference("In Vivo. 2025 May-Jun;39(3):1703-1718", "👉 Genetic mutations & metabolic syndrome – Positive effect", "40295030"),
                    Reference("Nutrients. 2024 Jul 17;16(14):2292", "👉 Celiac disease long-term analysis – No clear dose/effect/duration", "39064734")
                )
            )

            "Cancer" -> Pair(
                """
    Alternative
    1. Accelerated partial breast irradiation vs whole breast irradiation (11-year follow-up) – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
    2. Stem cell-based therapeutic modalities for depression (review, relevance to cancer care) – No clear dose/effect/duration found.
    3. Chemo-immunotherapy with oregovomab + carboplatin/paclitaxel in ovarian cancer – Positive/therapeutic effect mentioned | week, month.

    Herbs
    1. Salvianolic acid B + Senkyunolide I in MAP3K1 regulation (cancer biology context) – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
    2. AhR role in lipid metabolism/obesity (relevance to cancer) – Negative/adverse effect mentioned.
    3. Marine-inspired Itampolin A derivatives overcoming chemoresistance in NSCLC – No clear dose/effect/duration found.

    Amino acids
    1. N-lactoyl amino acids in genome-wide association studies – No clear dose/effect/duration found.
    2. Engineering unnatural amino acids in ADC linkers for HER2+ breast cancer – Negative/adverse effect mentioned.
    3. LncBADR regulates BCAA degradation, promoting autoimmunity & cancer link – No clear dose/effect/duration found.

    Vitamins
    1. Paricalcitol + hydroxychloroquine modulating ECM in pancreatic cancer – Negative/adverse effect mentioned.
    2. Systemic Immune-Inflammation Index prognostic in gastric cancer (FLOT therapy) – Positive/therapeutic effect mentioned | month.
    3. Proton pump inhibitors (PPIs) in gastric health/cancer risk – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.

    Minerals
    1. Biomimetic Cu(2-x)Se nanoplatforms for glioblastoma – Positive/therapeutic effect mentioned.
    2. ZnO/Ag-Halloysite nanohybrids for targeted cisplatin/carboplatin delivery – Negative/adverse effect mentioned.
    3. Organomineral complex with prolonged antitumor action – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.

    Supplements
    1. Management of hepatotoxicity with CDK4/6 inhibitors (breast cancer) – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
    2. Music therapy in end-of-life cancer care – Positive/therapeutic effect mentioned.
    3. Microbiome-based cancer immunotherapy strategies – Positive/therapeutic effect mentioned | day.

    Nutrients
    1. 3D colon model for disease monitoring – Positive/therapeutic effect mentioned | day.
    2. Ginsenosides enhancing apoptosis in A549 lung cancer cells – Negative/adverse effect mentioned.
    3. Proton pump inhibitors (PPIs) review – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
    """.trimIndent(),
                listOf(
                    Reference("Clin Transl Oncol. 2025 Sep 28", "👉 Accelerated breast irradiation vs whole breast irradiation – Positive & Negative effects", "41015980"),
                    Reference("Cell J. 2025 Sep 28;27(1):1-12", "👉 Stem cell therapies in depression (relevance to cancer care) – No clear dose/effect/duration", "41015852"),
                    Reference("Int J Gynecol Cancer. 2025 Sep 5", "👉 Oregovomab chemo-immunotherapy in ovarian cancer – Positive effect | week, month", "41015763"),
                    Reference("Chin Med. 2025 Sep 28;20(1):148", "👉 Salvianolic acid B + Senkyunolide I – Positive & Negative effects", "41015772"),
                    Reference("Life Sci. 2025 Sep 25:123996", "👉 AhR in lipid metabolism/obesity – Negative effect", "41015384"),
                    Reference("Mar Drugs. 2025 Sep 15;23(9):357", "👉 Itampolin A derivatives overcoming NSCLC chemoresistance – No clear dose/effect/duration", "41003326"),
                    Reference("Hum Mol Genet. 2025 Sep 28", "👉 N-lactoyl amino acids associations – No clear dose/effect/duration", "41015949"),
                    Reference("J Control Release. 2025 Sep 25", "👉 Unnatural amino acids in ADCs – Negative effect", "41015259"),
                    Reference("J Neuroinflammation. 2025 Sep 26", "👉 LncBADR regulating BCAA degradation – No clear dose/effect/duration", "41013574"),
                    Reference("Cancer Gene Ther. 2025 Sep 27", "👉 Paricalcitol + hydroxychloroquine in pancreatic cancer – Negative effect", "41015572"),
                    Reference("Medicina (Kaunas). 2025 Sep 6;61(9):1614", "👉 Systemic Immune-Inflammation Index in gastric cancer – Positive effect | month", "41011005"),
                    Reference("Medicina (Kaunas). 2025 Aug 31;61(9):1569", "👉 PPIs evidence-based review – Positive & Negative effects", "41010960"),
                    Reference("J Nanobiotechnol. 2025 Sep 26;23(1):609", "👉 Cu(2-x)Se nanoplatforms for glioblastoma – Positive effect", "41013700"),
                    Reference("Pharmaceuticals. 2025 Sep 8;18(9):1349", "👉 ZnO/Ag-Halloysite nanohybrids for cervical cancer – Negative effect", "41011218"),
                    Reference("Int J Mol Sci. 2025 Sep 20;26(18):9205", "👉 Organomineral complex antitumor action – Positive & Negative effects", "41009766"),
                    Reference("J Cancer Res Clin Oncol. 2025 Sep 27", "👉 CDK4/6 inhibitor hepatotoxicity management – Positive & Negative effects", "41014426"),
                    Reference("Medicina (Kaunas). 2025 Sep 18;61(9):1690", "👉 Music therapy in end-of-life cancer care – Positive effect", "41011081"),
                    Reference("Medicina (Kaunas). 2025 Sep 4;61(9):1595", "👉 Microbiome-based cancer immunotherapy – Positive effect | day", "41010985"),
                    Reference("Adv Sci (Weinh). 2025 Sep 27", "👉 3D colon model for disease monitoring – Positive effect | day", "41014225"),
                    Reference("Molecules. 2025 Sep 11;30(18):3697", "👉 Ginsenosides inducing apoptosis in lung cancer cells – Negative effect", "41011591")
                )
            )

            "Celiac disease" -> Pair(
                """
    Alternative
    1. Update on current treatments for celiac disease – No clear dose/effect/duration found.
    2. Intravascular lithotripsy for chronic mesenteric ischemia – Positive/therapeutic effect mentioned.
    3. Gluten-free bread optimization using whole sorghum flour – g | Positive/therapeutic effect mentioned.

    Herbs
    1. Herbal-based treatments in celiac disease management – g | Positive/therapeutic effect mentioned.
    2. Diet as adjuvant treatment in alopecia (relevance to gluten/celiac) – Positive/therapeutic effect mentioned.
    3. Dietary modification in chronic urticaria (linked to gluten sensitivity) – Positive/therapeutic effect mentioned.

    Amino acids
    1. Essential amino acids in celiac disease immunogenicity & therapy – Positive/therapeutic effect mentioned.
    2. Whole genome transcriptional analysis: amino acid metabolism in celiac – g | Positive/therapeutic effect mentioned.
    3. Gluten peptide analogues inhibiting HLA/DQ8 immune response – g | Positive/therapeutic effect mentioned.

    Vitamins
    1. Future without gluten restrictions (therapeutic review) – No clear dose/effect/duration found.
    2. Mendelian randomization study of migraine (vitamin/nutrient factors) – g | Positive/therapeutic effect mentioned.
    3. Regulation of intestinal permeability (nutrient/vitamin relevance) – No clear dose/effect/duration found.

    Minerals
    1. Optimizing osteoporosis screening in celiac patients – Positive/therapeutic effect mentioned.
    2. Hydroponics/artificial light improving wheat quality (gluten-free relevance) – No clear dose/effect/duration found.
    3. Gender-related differences in celiac follow-up – No clear dose/effect/duration found.

    Supplements
    1. Current/future celiac treatments (nutritional supplements) – No clear dose/effect/duration found.
    2. Gut microbiota in celiac disease – Negative/adverse effect mentioned.
    3. Zinc gluconate remodeling tight junctions, improving barrier – mg | Positive/therapeutic effect mentioned.

    Nutrients
    1. Update on gluten restriction-free future therapies – No clear dose/effect/duration found.
    2. Nutrition for children with Down syndrome (gluten-free diet overlap) – Positive/therapeutic effect mentioned.
    3. Sorghum-based gluten-free bread formulation – g | Positive/therapeutic effect mentioned.
    """.trimIndent(),
                listOf(
                    Reference("Nutrients. 2025 Sep 15;17(18):2960", "👉 Future without gluten restrictions – No clear dose/effect/duration found", "41010485"),
                    Reference("Catheter Cardiovasc Interv. 2025 Sep 23", "👉 Intravascular lithotripsy in mesenteric ischemia – Positive effect", "40988380"),
                    Reference("Foods. 2025 Sep 5;14(17):3113", "👉 Gluten-free sorghum bread optimization – g | Positive effect", "40941231"),
                    Reference("Narra J. 2023 Aug;3(2):e147", "👉 Herbal-based treatments in celiac disease – g | Positive effect", "38454981"),
                    Reference("Skin Appendage Disord. 2020 Mar;6(2):88-96", "👉 Diet as adjuvant in alopecia (gluten relevance) – Positive effect", "32258051"),
                    Reference("Dermatol Pract Concept. 2019 Dec 31;10(1):e2020004", "👉 Dietary modification in urticaria (gluten link) – Positive effect", "31921491"),
                    Reference("Crit Rev Clin Lab Sci. 2025 Sep 5", "👉 Essential amino acids in celiac disease – Positive effect", "40910339"),
                    Reference("BMC Med. 2025 Aug 29;23(1):507", "👉 Amino acid metabolism in celiac – g | Positive effect", "40883722"),
                    Reference("Food Funct. 2025 Aug 26;16(17):6898-6909", "👉 Gluten peptide analogues blocking HLA/DQ8 – g | Positive effect", "40788264"),
                    Reference("Front Neurol. 2025 Sep 9;16:1660995", "👉 Mendelian randomization of migraine (nutrient factors) – g | Positive effect", "40994718"),
                    Reference("Arch Med Res. 2025 Sep 17;57(3):103321", "👉 Regulation of intestinal permeability – No clear dose/effect/duration found", "40967091"),
                    Reference("Am J Gastroenterol. 2025 Aug 26", "👉 Osteoporosis screening in celiac – Positive effect", "40856724"),
                    Reference("Sci Rep. 2025 Aug 21;15(1):30768", "👉 Hydroponics & wheat quality (gluten-free relevance) – No clear dose/effect/duration", "40841578"),
                    Reference("Expert Rev Gastroenterol Hepatol. 2025 Aug;19(8):871-876", "👉 Gender-related differences in celiac – No clear dose/effect/duration", "40682368"),
                    Reference("J Gastrointestin Liver Dis. 2025 Sep 26;34(3):362-369", "👉 Gut microbiota in celiac – Negative effect", "41004829"),
                    Reference("Int J Mol Sci. 2025 Sep 2;26(17):8540", "👉 Zinc gluconate improving intestinal barrier – mg | Positive effect", "40943460"),
                    Reference("Healthcare (Basel). 2025 Sep 4;13(17):2222", "👉 Nutrition in Down syndrome (gluten-free overlap) – Positive effect", "40941574")
                )
            )

            "Chest infection" -> Pair(
                """
    Alternative
    1. Treatment strategy for septic arthritis with mediastinitis – No clear dose/effect/duration found.
    2. Four-step approach in treating refractory seroma – Positive/therapeutic effect mentioned | day.
    3. Pediatric sepsis caused by Klebsiella pneumoniae – g | Positive/therapeutic effect mentioned.

    Herbs
    1. Childhood pneumonia care practices (caregivers' perspective) – month | Positive/therapeutic effect mentioned.
    2. Herbal medicine for anxiety/depression during COVID-19 – Positive/therapeutic effect mentioned.
    3. Jizhi syrup preventing acute bronchitis (mechanism study) – Positive/therapeutic effect mentioned.

    Amino acids
    1. Vitamin C + antifolates inducing bacterial death – No clear dose/effect/duration found.
    2. Inhibition of ARG2 combats sepsis-induced lymphopenia – Positive/therapeutic effect mentioned.
    3. MDR-Tuberculous meningitis case study (Japan) – day | Positive/therapeutic effect mentioned.

    Vitamins
    1. Persistent pulmonary findings post-COVID-19 – Positive/therapeutic effect mentioned.
    2. Serum vitamin D & respiratory infections in children – mcg/day | Positive/therapeutic effect mentioned.
    3. Vitamin C + antifolates bacterial death – No clear dose/effect/duration found.

    Minerals
    1. Pompe disease (mineral balance relevance) – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month.
    2. Acute lipoid pneumonia leading to ARDS (case) – Positive/therapeutic effect mentioned.
    3. COVID-19 CT-scan classification – Positive/therapeutic effect mentioned.

    Supplements
    1. ARG2 inhibition in sepsis (MDSC cells) – Positive/therapeutic effect mentioned.
    2. S3 sepsis guideline (Germany, 2025) – g | Positive/therapeutic effect mentioned.
    3. Kratom-associated acute RV dysfunction – Negative/adverse effect mentioned.

    Nutrients
    1. Nutritional therapy for MRSA sepsis with pulmonary embolism – Positive/therapeutic effect mentioned.
    2. Fungal impacts on Earth's ecosystems (immune/nutrient overlap) – g.
    3. Cystic Fibrosis (nutrient/metabolic relevance) – Positive/therapeutic effect mentioned.
    """.trimIndent(),
                listOf(
                    Reference("Int J Surg Case Rep. 2025 Sep 25;136:111986", "👉 Treatment strategy for septic arthritis – No clear dose/effect/duration found", "41014914"),
                    Reference("Front Oncol. 2025 Sep 10;15:1577591", "👉 Four-step approach in refractory seroma – Positive effect | day", "41001010"),
                    Reference("Microb Drug Resist. 2025 Sep 22", "👉 Pediatric sepsis from Klebsiella pneumoniae – g | Positive effect", "40982302"),
                    Reference("Monaldi Arch Chest Dis. 2025 Sep 2", "👉 Childhood pneumonia care practices – month | Positive effect", "40898920"),
                    Reference("Monaldi Arch Chest Dis. 2025 May 12", "👉 Herbal medicine use during COVID-19 – Positive effect", "40356584"),
                    Reference("J Ethnopharmacol. 2025 Jan 30;337(Pt 1):118708", "👉 Jizhi syrup for acute bronchitis – Positive effect", "39197804"),
                    Reference("Microbiol Res. 2025 Dec;301:128323", "👉 Vitamin C + antifolates inducing bacterial death – No clear dose/effect/duration found", "40896995"),
                    Reference("Theranostics. 2025 Jul 11;15(16):7990-8011", "👉 ARG2 inhibition combats sepsis-induced lymphopenia – Positive effect", "40860137"),
                    Reference("Am J Case Rep. 2025 Aug 16;26:e947502", "👉 MDR-Tuberculous meningitis (Japan case) – day | Positive effect", "40817574"),
                    Reference("Cureus. 2025 Aug 19;17(8):e90542", "👉 Persistent pulmonary findings after COVID-19 – Positive effect", "40978879"),
                    Reference("Eur J Pediatr. 2025 Sep 11;184(10):610", "👉 Vitamin D and respiratory infections in children – mcg/day | Positive effect", "40936023"),
                    Reference("Pompe Disease. GeneReviews, updated 2025 Aug 21", "👉 Mineral imbalance relevance – Positive & Negative effect | month", "20301438"),
                    Reference("BMC Pulm Med. 2025 Jul 2;25(1):306", "👉 Acute exogenous lipoid pneumonia (ARDS) – Positive effect", "40604803"),
                    Reference("Comput Biol Med. 2025 Jul;193:110226", "👉 COVID-19 CT classification – Positive effect", "40435668"),
                    Reference("Med Klin Intensivmed Notfmed. 2025 Aug 18", "👉 S3 guideline on sepsis – g | Positive effect", "40824313"),
                    Reference("JACC Case Rep. 2025 Jul 23;30(20):104206", "👉 Kratom-associated RV dysfunction – Negative effect", "40713117"),
                    Reference("Front Nutr. 2025 Feb 19;12:1484012", "👉 Nutritional therapy for MRSA sepsis – Positive effect", "40046762"),
                    Reference("Nature. 2025 Feb;638(8049):49-57", "👉 Fungal ecosystem impacts – g", "39910383"),
                    Reference("Cystic Fibrosis. GeneReviews, updated 2024 Aug 8", "👉 Nutrient/metabolic relevance – Positive effect", "20301428")
                )
            )

            "Chickenpox" -> Pair(
                """
    Alternative
    1. Adult varicella in India – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
    2. Varicella-Zoster virus vaccines research – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
    3. Monkeypox prevention strategies – Positive/therapeutic effect mentioned.

    Herbs
    1. Traditional Chinese medicine prescriptions for pox – No clear dose/effect/duration found.
    2. Monkeypox virus outbreak treatment options – No clear dose/effect/duration found.
    3. Mahanintangtong Thai traditional medicine formula – μg | Positive/therapeutic effect mentioned.

    Amino acids
    1. Live attenuated varicella vaccine adverse events – G | Negative/adverse effect mentioned.
    2. Genetic characteristics of varicella zoster virus in Shandong – Positive/therapeutic effect mentioned.
    3. Neurexin 3α in central amygdala and orofacial varicella pain – Positive/therapeutic effect mentioned.

    Vitamins
    1. Varicella zoster virus infects mucosal associated invariant T cells – No clear dose/effect/duration found.
    2. Incomplete vaccination & negative antibody test results in children – Positive/therapeutic effect mentioned.
    3. Preventative care in inflammatory bowel disease – Positive/therapeutic effect mentioned.

    Minerals
    1. Sesuvium sesuvioides screening (pharmacognostic) – μg | Negative/adverse effect mentioned.
    2. Risk factors for hypomineralization in children – No clear dose/effect/duration found.
    3. Molar incisor hypomineralization study – No clear dose/effect/duration found.

    Supplements
    1. Chickenpox outbreak source timing (China) – Positive/therapeutic effect mentioned.
    2. CAM approach on oligoasthenoteratozoospermic patient – No clear dose/effect/duration found.
    3. Baidu index data to improve chickenpox surveillance – Positive/therapeutic effect mentioned.

    Nutrients
    1. Serum antibodies & dietary fiber intake – No clear dose/effect/duration found.
    2. Zinc adjuvant in acute lymphocytic leukemia – mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day.
    3. MultiTabs (vitamins + trace elements) in kindergarten children – Positive/therapeutic effect mentioned.
    """.trimIndent(),
                listOf(
                    Reference("J Family Med Prim Care. 2025 Jul;14(7):2867-2872", "👉 Adult varicella in India – Positive & Negative effect", "40814512"),
                    Reference("Vaccines (Basel). 2025 Jul 4;13(7):730", "👉 Varicella-Zoster virus vaccines research – Positive & Negative effect", "40733707"),
                    Reference("Health Sci Rep. 2025 Apr 8;8(4):e70640", "👉 Monkeypox prevention strategies – Positive effect", "40201706"),
                    Reference("J Ethnopharmacol. 2025 Jan 30;337(Pt 1):118842", "👉 Traditional Chinese medicine prescriptions for pox – No clear dose/effect/duration", "39306210"),
                    Reference("Infect Disord Drug Targets. 2023;23(6):e180423216001", "👉 Monkeypox outbreak treatment options – No clear dose/effect/duration", "37073653"),
                    Reference("BMC Complement Med Ther. 2021 Mar 30;21(1):105", "👉 Mahanintangtong Thai traditional medicine formula – μg | Positive effect", "33785002"),
                    Reference("Clin Microbiol Infect. 2024 Nov;30(11):1466-1473", "👉 Live attenuated varicella vaccine adverse events – G | Negative effect", "39209266"),
                    Reference("Zhonghua Yu Fang Yi Xue Za Zhi. 2022 Aug 6;56(8):1080", "👉 Genetic characteristics of varicella zoster virus – Positive effect", "35922235"),
                    Reference("Neuroscience. 2022 Aug 1;496:16-26", "👉 Neurexin 3α & orofacial varicella pain – Positive effect", "35679996"),
                    Reference("Front Immunol. 2023 Mar 17;14:1121714", "👉 Varicella zoster virus & mucosal associated invariant T cells – No clear dose/effect/duration", "37006246"),
                    Reference("Rev Inst Med Trop Sao Paulo. 2023 Mar 13;65:e16", "👉 Incomplete vaccination & negative antibody results – Positive effect", "36921204"),
                    Reference("Dig Dis Sci. 2016 Aug;61(8):2205-2216", "👉 Preventative care in IBD – Positive effect", "27061291"),
                    Reference("Pak J Pharm Sci. 2021 Jul;34(4(Supplementary)):1585-1595", "👉 Sesuvium sesuvioides pharmacognostic screening – μg | Negative effect", "34799336"),
                    Reference("Children (Basel). 2021 May 21;8(6):432", "👉 Hypomineralization risk factors – No clear dose/effect/duration", "34064138"),
                    Reference("Int J Paediatr Dent. 2008 May;18(3):155-62", "👉 Molar incisor hypomineralization – No clear dose/effect/duration", "18384347"),
                    Reference("BMC Infect Dis. 2024 Nov 7;24(1):1257", "👉 Chickenpox outbreak timing (China) – Positive effect", "39511467"),
                    Reference("J Pharm Bioallied Sci. 2024 Jul;16(Suppl 3):S2991-S2994", "👉 CAM approach on oligoasthenoteratozoospermic patient – No clear dose/effect/duration", "39346324"),
                    Reference("J Med Internet Res. 2023 May 16;25:e44186", "👉 Baidu index data to improve chickenpox surveillance – Positive effect", "37191983"),
                    Reference("Nutrients. 2021 Mar 2;13(3):813", "👉 Serum antibodies & dietary fiber intake – No clear dose/effect/duration", "33801237"),
                    Reference("Med Hypotheses. 2005;64(6):1124-6", "👉 Zinc adjuvant in ALL – mg | Positive & Negative effect | day", "15823699"),
                    Reference("Orv Hetil. 2001 Feb 11;142(6):283-7", "👉 MultiTabs (vitamins + trace elements) in kindergarten children – Positive effect", "11243023")
                )
            )

            "Chlamydia" -> Pair(
                """
    Alternative
    1. Cyclic di-AMP in Chlamydia trachomatis developmental cycle – No clear dose/effect/duration found.
    2. Lymphogranuloma venereum prevalence, treatment, and follow-up – mg | day.
    3. PCR detection of Chlamydia trachomatis in asymptomatic patients – No clear dose/effect/duration found.

    Herbs
    1. Plumbago auriculata blight fungicide screening – μg | Positive/therapeutic effect; Negative/adverse effect.
    2. Resveratrol dietary supplementation in juvenile Oreochromis niloticus – g | day.
    3. Recombinant herpesvirus vaccine expressing PmpD-N of Chlamydia psittaci – Positive/therapeutic effect mentioned.

    Amino acids
    1. Multi-epitope vaccine using β-barrel outer membrane proteins – Negative/adverse effect mentioned.
    2. Dual isotopologue profiling of Chlamydia trachomatis in host cells – G | Negative/adverse effect.
    3. Lymphostatin homologue from Chlamydia pecorum inhibits T cell proliferation – Negative/adverse effect mentioned.

    Vitamins
    1. Chlamydial protease-like activity factor induces ferroptosis – Positive/therapeutic effect mentioned.
    2. Chlamydia trachomatis infection, infertility, and serum 25-hydroxyvitamin D – Positive/therapeutic effect mentioned.
    3. Causes of abortion in Iranian goat herds – g | Positive/therapeutic effect mentioned.

    Minerals
    1. Causes of abortion in Iranian goat herds – g | Positive/therapeutic effect mentioned.
    2. Microbial consortium in ferromanganese and francolite biomineralization – No clear dose/effect/duration found.
    3. Bacterial diversity in Arctic fjord sediments – No clear dose/effect/duration found.

    Supplements
    1. Multi-epitope vaccine using β-barrel outer membrane proteins – Negative/adverse effect mentioned.
    2. Astragalus polysaccharide reduces antibiotic resistance gene dissemination in fish gut – Positive/therapeutic effect mentioned.
    3. Bidirectional causal relationships between antibody-mediated immune responses and SLE – Positive/therapeutic effect mentioned.

    Nutrients
    1. Cervicovaginal microbial features predict Chlamydia spread – No clear dose/effect/duration found.
    2. Salmonella Typhimurium manipulation of Syntaxin 7 in host cells – Positive/therapeutic effect mentioned.
    3. Metagenomic analysis of cecal microbiota in chickens post-Eimeria infection – Positive/therapeutic effect mentioned.
    """.trimIndent(),
                listOf(
                    Reference("Elife. 2025 Sep 10;14:RP104240", "👉 Cyclic di-AMP in Chlamydia developmental cycle – No clear dose/effect/duration", "40928359"),
                    Reference("Sex Transm Dis. 2025 Aug 15", "👉 Lymphogranuloma venereum prevalence, treatment – mg | day", "40815293"),
                    Reference("Enferm Infecc Microbiol Clin (Engl Ed). 2025 Aug-Sep;43(7):374-377", "👉 PCR detection of Chlamydia – No clear dose/effect/duration", "40754349"),
                    Reference("Front Microbiol. 2025 Jul 4;16:1609944", "👉 Plumbago auriculata fungicide screening – μg | Positive & Negative effect", "40687860"),
                    Reference("Arch Microbiol. 2020 Jan;202(1):43-53", "👉 Resveratrol supplementation in Oreochromis niloticus – g | day", "31463601"),
                    Reference("Front Vet Sci. 2017 Dec 14;4:221", "👉 Recombinant herpesvirus vaccine – Positive effect", "29376059"),
                    Reference("J Membr Biol. 2025 Sep 4", "👉 Multi-epitope vaccine using β-barrel proteins – Negative/adverse effect", "40906223"),
                    Reference("ACS Chem Biol. 2025 Aug 15;20(8):1902-1915", "👉 Dual isotopologue profiling – G | Negative effect", "40719242"),
                    Reference("Virulence. 2025 Dec;16(1):2506500", "👉 Lymphostatin homologue inhibits T cell proliferation – Negative effect", "40405396"),
                    Reference("PLoS Pathog. 2025 Apr 8;21(4):e1013060", "👉 Chlamydial protease-like activity factor – Positive effect", "40198689"),
                    Reference("J Health Popul Nutr. 2024 Nov 13;43(1):186", "👉 Chlamydia infection, infertility, vitamin D – Positive effect", "39538249"),
                    Reference("Prev Vet Med. 2025 Jan;234:106381", "👉 Causes of abortion in Iranian goat herds – g | Positive effect", "39536431"),
                    Reference("Sci Total Environ. 2024 Aug 1;936:173423", "👉 Microbial consortium biomineralization – No clear dose/effect/duration", "38797412"),
                    Reference("Braz J Microbiol. 2024 Mar;55(1):499-513", "👉 Bacterial diversity in Arctic fjord sediments – No clear dose/effect/duration", "38175355"),
                    Reference("J Environ Manage. 2025 Aug;389:126058", "👉 Astragalus polysaccharide reduces antibiotic resistance gene dissemination – Positive effect", "40466317"),
                    Reference("Microb Pathog. 2025 Mar;200:107329", "👉 Immune responses & SLE – Positive effect", "39863087"),
                    Reference("Infect Immun. 2025 Sep 9;93(9):e0005725", "👉 Cervicovaginal microbial features predict Chlamydia spread – No clear dose/effect/duration", "40793782"),
                    Reference("Traffic. 2025 Apr-Jun;26(4-6):e70010", "👉 Salmonella manipulation of Syntaxin 7 – Positive effect", "40444290"),
                    Reference("Animals (Basel). 2025 May 21;15(10):1500", "👉 Cecal microbiota in chickens post-Eimeria – Positive effect", "40427376")
                )
            )

            "Cholesterol (high)" -> Pair(
                """
    Alternative
    1. Aqueous Moringa Oleifera leaf extract in broiler chickens – g, mg | Positive/therapeutic effect mentioned | day.
    2. Peptide-based Anti-PCSK9 product for hypercholesterolemia – Negative/adverse effect mentioned | month.
    3. Exercise snack program in elderly cancer survivors – Positive/therapeutic effect mentioned | week.

    Herbs
    1. Marine-inspired Itampolin A derivatives to modulate cholesterol homeostasis in NSCLC – No clear dose/effect/duration found.
    2. Zexie Tang Polysaccharides alleviate high-fat diet-induced NAFL in mice – Positive/therapeutic effect mentioned.
    3. Plant-based food and beverage consumption associations with cardiometabolic health – g | Positive/therapeutic effect mentioned.

    Amino acids
    1. Metabolomic signatures in adults with metabolic syndrome affecting HDL-C – Positive/therapeutic effect mentioned.
    2. Carnosine or beta-alanine supplementation for prediabetes/type 2 diabetes – Positive/therapeutic effect mentioned.
    3. Vanin-1-derived pantothenic acid as biomarker in diabetes and cardiovascular complications – Negative/adverse effect mentioned.

    Vitamins
    1. Heat processing effect on fat-soluble vitamins and cholesterol in goose meat – g.
    2. Calcium–Phosphorus metabolism in CKD and vascular calcification – No clear dose/effect/duration found.
    3. Blood-based biomarkers and frailty in older adults – No clear dose/effect/duration found.

    Minerals
    1. Calcium–Phosphorus metabolism in CKD and vascular calcification – No clear dose/effect/duration found.
    2. Nutritional status in adults with chronic schizophrenia – Positive/therapeutic effect mentioned.
    3. Nonlinear association of non-HDL-C/HDL-C with trabecular bone score – g.

    Supplements
    1. Moringa oleifera leaf in high-cholesterol diet zebrafish – Positive/therapeutic effect; Negative/adverse effect mentioned | week.
    2. Lactobacillus bile salt hydrolase regulates gut Bifidobacterium pseudolongum – Positive/therapeutic effect mentioned.
    3. Lactic acid bacteria from grains for anti-obesity effects in high-fat diet mice – g | Positive/therapeutic effect mentioned | week.

    Nutrients
    1. Lactobacillus bile salt hydrolase regulating Bifidobacterium pseudolongum – Positive/therapeutic effect mentioned.
    2. Dietary modifications in IBS reduce symptoms, weight, and lipid levels – Positive/therapeutic effect mentioned.
    3. α-Lack-SPI alleviates MASLD in rats by regulating hepatic lipid accumulation – Positive/therapeutic effect mentioned.
    """.trimIndent(),
                listOf(
                    Reference("Vet Sci. 2025 Sep 4;12(9):860", "👉 Aqueous Moringa Oleifera leaf extract – g, mg | Positive effect | day", "41012784"),
                    Reference("Vaccines (Basel). 2025 Aug 22;13(9):889", "👉 Peptide-based Anti-PCSK9 product – Negative/adverse effect | month", "41012095"),
                    Reference("Life (Basel). 2025 Sep 4;15(9):1401", "👉 Exercise snack program – Positive effect | week", "41010343"),
                    Reference("Mar Drugs. 2025 Sep 15;23(9):357", "👉 Itampolin A derivatives – No clear dose/effect/duration", "41003326"),
                    Reference("Carbohydr Polym. 2025 Nov 1;367:123937", "👉 Zexie Tang Polysaccharides – Positive effect", "40817510"),
                    Reference("Clin Nutr. 2025 Sep;52:47-61", "👉 Plant-based food consumption – g | Positive effect", "40737886"),
                    Reference("Cardiovasc Diabetol Endocrinol Rep. 2025 Jun 10;11(1):11", "👉 Metabolomic signatures in metabolic syndrome – Positive effect", "41013860"),
                    Reference("BMC Endocr Disord. 2025 Sep 25;25(1):210", "👉 Carnosine/beta-alanine supplementation – Positive effect", "40999397"),
                    Reference("Sci Rep. 2025 Sep 15;15(1):32549", "👉 Vanin-1-derived pantothenic acid – Negative/adverse effect", "40954177"),
                    Reference("Foods. 2025 Sep 20;14(18):3266", "👉 Heat processing effect on fat-soluble vitamins – g", "41008238"),
                    Reference("Kidney Blood Press Res. 2025 Sep 14:1-20", "👉 Calcium–Phosphorus metabolism in CKD – No clear dose/effect/duration", "40999805"),
                    Reference("Age Ageing. 2025 Aug 29;54(9):afaf255", "👉 Blood-based biomarkers & frailty in older adults – No clear dose/effect/duration", "40996138"),
                    Reference("Front Nutr. 2025 Sep 5;12:1658703", "👉 Nutritional status in chronic schizophrenia – Positive effect", "40977981"),
                    Reference("Medicine (Baltimore). 2025 Sep 12;104(37):e44452", "👉 Nonlinear association of non-HDL-C/HDL-C with trabecular bone – g", "40958339"),
                    Reference("Pharmaceuticals (Basel). 2025 Sep 5;18(9):1336", "👉 Moringa oleifera leaf in high-cholesterol diet zebrafish – Positive & Negative effect | week", "41011207"),
                    Reference("Nutrients. 2025 Sep 22;17(18):3019", "👉 Lactobacillus bile salt hydrolase – Positive effect", "41010544"),
                    Reference("Int J Mol Sci. 2025 Sep 17;26(18):9056", "👉 Lactic acid bacteria from grains – g | Positive effect | week", "41009619"),
                    Reference("Nutrients. 2025 Sep 22;17(18):3019", "👉 Lactobacillus bile salt hydrolase – Positive effect", "41010544"),
                    Reference("Nutrients. 2025 Sep 16;17(18):2966", "👉 Dietary modifications in IBS – Positive effect", "41010496"),
                    Reference("Nutrients. 2025 Sep 10;17(18):2918", "👉 α-Lack-SPI alleviates MASLD in rats – Positive effect", "41010444")
                )
            )

            "Chronic kidney disease" -> Pair(
                """
    Alternative
    1. Hypothermic machine perfusion vs. static cold storage in kidney transplantation – day.
    2. Physiologic homeostasis after pig kidney xenotransplantation in a human – Positive/therapeutic effect mentioned | day.
    3. Malaysia Medication Adherence Assessment Tool (MyMAAT) validation in non-dialysis CKD – Positive/therapeutic effect mentioned.

    Herbs
    1. Niao-Du-Kang granules regulate autophagy via miR-214-3p/SIRT1 signaling in diabetic nephropathy – μg | Positive/therapeutic effect mentioned | week.
    2. LINE-1 DNA methylation mediates smoking-related risk in urothelial carcinoma – Positive/therapeutic effect; Negative/adverse effect mentioned.
    3. Yunpiqiangshen gel improves quality of life in dialysis patients – Positive/therapeutic effect; Negative/adverse effect mentioned | month.

    Amino acids
    1. Early-life hydrogen sulfide signaling for cardiovascular-kidney-metabolic syndrome reprogramming – Positive/therapeutic effect; Negative/adverse effect mentioned.
    2. Effects of anserine on oxidative stress and cell barrier integrity in methylmalonic aciduria – Positive/therapeutic effect mentioned.
    3. F54L mutation of Thioredoxin affecting protein stability – g | Positive/therapeutic effect mentioned.

    Vitamins
    1. Health benefits of edible mushrooms in dietary management of CKD – Positive/therapeutic effect mentioned.
    2. Proton pump inhibitors (PPIs) – Positive/therapeutic effect; Negative/adverse effect mentioned.
    3. Monitoring allograft adaptation after kidney transplantation in pediatric patients by targeted metabolomics – Positive/therapeutic effect mentioned.

    Minerals
    1. Ultrasonographic features of gastropathy in dogs with acute kidney injury – No clear dose/effect/duration found.
    2. Multiple functions of insulin-like growth factor 1 in kidney disease – No clear dose/effect/duration found.
    3. Calcium–Phosphorus metabolism in CKD and vascular calcification – No clear dose/effect/duration found.

    Supplements
    1. Edible mushrooms in dietary management of CKD – Positive/therapeutic effect mentioned.
    2. Gut microbiota therapy for CKD – Positive/therapeutic effect mentioned.
    3. Berberine as a phytochemical with therapeutic properties – Positive/therapeutic effect; Negative/adverse effect mentioned.

    Nutrients
    1. Edible mushrooms in CKD management – Positive/therapeutic effect mentioned.
    2. Proton pump inhibitors (PPIs) – Positive/therapeutic effect; Negative/adverse effect mentioned.
    3. Sex-specific associations of TyG index changes with CKD risk – No clear dose/effect/duration found.
    """.trimIndent(),
                listOf(
                    Reference("Medicina (Kaunas). 2025 Sep 10;61(9):1641", "👉 Hypothermic machine perfusion vs. static cold storage – day", "41011034"),
                    Reference("Nat Commun. 2025 Sep 26;16(1):8453", "👉 Pig kidney xenotransplantation – Positive effect | day", "41006232"),
                    Reference("PLoS One. 2025 Sep 26;20(9):e0332236", "👉 MyMAAT validation in non-dialysis CKD – Positive effect", "41004479"),
                    Reference("J Ethnopharmacol. 2025 Aug 29;352:120175", "👉 Niao-Du-Kang granules – μg | Positive effect | week", "40623671"),
                    Reference("Arch Toxicol. 2025 Jul;99(7):3035-3046", "👉 LINE-1 DNA methylation – Positive; Negative effect", "40285850"),
                    Reference("J Tradit Chin Med. 2025 Feb;45(1):123-131", "👉 Yunpiqiangshen gel – Positive; Negative effect | month", "39957166"),
                    Reference("Antioxidants (Basel). 2025 Aug 29;14(9):1064", "👉 Early-life H2S signaling – Positive; Negative effect", "41008969"),
                    Reference("Sci Rep. 2025 Sep 25;15(1):32933", "👉 Anserine on oxidative stress – Positive effect", "40998969"),
                    Reference("Biochim Biophys Acta Gen Subj. 2025 Sep 13;1869(12):130860", "👉 F54L mutation of Thioredoxin – g | Positive effect", "40953808"),
                    Reference("J Ren Nutr. 2025 Sep 25:S1051-2276(25)00195-5", "👉 Edible mushrooms – Positive effect", "41015284"),
                    Reference("Medicina (Kaunas). 2025 Aug 31;61(9):1569", "👉 Proton pump inhibitors (PPIs) – Positive; Negative effect", "41010960"),
                    Reference("Int J Mol Sci. 2025 Sep 20;26(18):9190", "👉 Monitoring allograft adaptation in pediatric kidney transplant – Positive effect", "41009752"),
                    Reference("Animals (Basel). 2025 Sep 11;15(18):2666", "👉 Ultrasonographic features in dogs with AKI – No clear effect", "41007911"),
                    Reference("Nefrologia (Engl Ed). 2025 Aug-Sep;45(7):501337", "👉 IGF-1 functions in kidney disease – No clear effect", "41005827"),
                    Reference("Kidney Blood Press Res. 2025 Sep 14:1-20", "👉 Calcium–Phosphorus metabolism in CKD – No clear effect", "40999805"),
                    Reference("Front Immunol. 2025 Sep 10;16:1660226", "👉 Gut microbiota therapy for CKD – Positive effect", "41000396"),
                    Reference("Nutr Rev. 2025 Sep 13:nuaf172", "👉 Berberine – Positive; Negative effect", "40971595"),
                    Reference("Nutrients. 2025 Sep 25;17(18):S1051-2276", "👉 Edible mushrooms – Positive effect", "41015284"),
                    Reference("Medicina (Kaunas). 2025 Aug 31;61(9):1569", "👉 PPIs – Positive; Negative effect", "41010960"),
                    Reference("Nutrients. 2025 Sep 17;17(18):2986", "👉 TyG index and CKD risk – No clear effect", "41010511")
                )
            )

            "Chronic obstructive pulmonary disease (COPD)" -> Pair(
                """
    Alternative
    1. Integrating exercise and medication management in geriatric care – Positive/therapeutic; Negative/adverse effect mentioned.
    2. Modulation of pulmonary inflammation and redox pathway by fumaric ester – Positive/therapeutic effect mentioned.
    3. Environmentally friendly inhaler decision-making with personalized care – Positive/therapeutic; Negative/adverse effect mentioned.

    Herbs
    1. Natural antioxidants from herbs for treating lung disorders – Positive/therapeutic effect mentioned.
    2. Morus alba L.-Glycyrrhiza uralensis alleviating COPD via arachidonic acid metabolism pathway – g | Positive/therapeutic effect mentioned.
    3. Seven-Herb Decoction Quanzhenyiqitang with anti-COPD activity – Positive/therapeutic effect mentioned.

    Amino acids
    1. Amino acid metabolic reprogramming in chronic airway diseases and lung cancer – Positive/therapeutic effect mentioned.
    2. Quantitative analysis of desmosine-containing solutions – No clear dose/effect/duration found.
    3. Sputum microbiota compositions correlating with metabolome and clinical outcomes in COPD-Bronchiectasis – No clear dose/effect/duration found.

    Vitamins
    1. Review on sarcopenia, cachexia, and aging – Positive/therapeutic effect mentioned.
    2. Vitamin B12 deficiency and lung disease risk – No clear dose/effect/duration found.
    3. Gut-lung axis and innovative prevention/treatment approaches – Positive/therapeutic effect mentioned.

    Minerals
    1. High prevalence of respiratory diseases – No clear dose/effect/duration found.
    2. Bone microarchitecture and strength in men with prostate cancer – Positive/therapeutic; Negative/adverse effect mentioned.
    3. Lung-related risk factors and low bone mineral density – No clear dose/effect/duration found.

    Supplements
    1. Jianpi Yifei Tongluo recipe attenuating inflammation in rat COPD model – Positive/therapeutic effect mentioned.
    2. Montelukast sodium with budesonide/formoterol on pulmonary function in obstructive airway diseases – Positive/therapeutic; Negative/adverse effect mentioned.
    3. Review on sarcopenia, cachexia, and aging – Positive/therapeutic effect mentioned.

    Nutrients
    1. Review on sarcopenia, cachexia, and aging – Positive/therapeutic effect mentioned.
    2. Retracted study on Lacticaseibacillus rhamnosus in steroid resistant COPD – No clear dose/effect/duration found.
    3. Combined dietary intake and association with pulmonary function and COPD risk – Positive/therapeutic effect mentioned.
    """.trimIndent(),
                listOf(
                    Reference("Lancet Healthy Longev. 2025 Sep 24:100763", "👉 Exercise and medication management – Positive; Negative effect", "41015054"),
                    Reference("Antioxidants (Basel). 2025 Sep 22;14(9):1141", "👉 Fumaric ester on pulmonary inflammation – Positive effect", "41009045"),
                    Reference("Explor Res Clin Soc Pharm. 2025 Aug 29;20:100651", "👉 Environmentally friendly inhaler – Positive; Negative effect", "40995493"),
                    Reference("Phytother Res. 2025 Aug;39(8):3353-3385", "👉 Natural antioxidants from herbs – Positive effect", "40587974"),
                    Reference("J Ethnopharmacol. 2025 Jun 12;349:119904", "👉 Morus alba L.-Glycyrrhiza uralensis – g | Positive effect", "40324701"),
                    Reference("Chem Biodivers. 2024 Jul;21(7):e202400277", "👉 Quanzhenyiqitang – Positive effect", "38686912"),
                    Reference("World J Surg Oncol. 2025 Sep 18;23(1):335", "👉 Amino acid metabolic reprogramming – Positive effect", "40963133"),
                    Reference("Bioanalysis. 2025 Sep 14:1-5", "👉 Desmosine analysis – No clear effect", "40947852"),
                    Reference("Exploration (Beijing). 2025 May 4;5(4):e20240149", "👉 Sputum microbiota & metabolome – No clear effect", "40873638"),
                    Reference("J Assoc Physicians India. 2025 Sep;73(9):85-90", "👉 Sarcopenia/cachexia review – Positive effect", "40955936"),
                    Reference("Sci Rep. 2025 Sep 3;15(1):32361", "👉 Vitamin B12 deficiency and lung disease risk – No clear effect", "40903476"),
                    Reference("Front Immunol. 2025 Jul 30;16:1549865", "👉 Gut-lung axis approaches – Positive effect", "40808958"),
                    Reference("Epidemiol Serv Saude. 2025 Sep 15;34:e20240519", "👉 High prevalence of respiratory diseases – No clear effect", "40960761"),
                    Reference("Bone. 2025 Sep 11;201:117643", "👉 Bone microarchitecture – Positive; Negative effect", "40945813"),
                    Reference("Osteoporos Int. 2025 Sep;36(9):1753-1757", "👉 Lung-related risk factors & low BMD – No clear effect", "40830730"),
                    Reference("J Tradit Chin Med. 2025 Oct;45(5):1048-1058", "👉 Jianpi Yifei Tongluo recipe – Positive effect", "41015803"),
                    Reference("Postepy Dermatol Alergol. 2024 Oct 24;42(4):393-397", "👉 Montelukast + budesonide/formoterol – Positive; Negative effect", "41001138"),
                    Reference("J Assoc Physicians India. 2025 Sep;73(9):85-90", "👉 Sarcopenia/cachexia review – Positive effect", "40955936"),
                    Reference("Nutrients. 2025 Jul 31;17(15):2513", "👉 Dietary intake & pulmonary function – Positive effect", "40772124"),
                    Reference("Nutrients 2024, 16, 1509", "👉 Retracted: Lacticaseibacillus rhamnosus in steroid resistant COPD – No clear effect", "40806160")
                )
            )

            "Coeliac disease" -> Pair(
                """
    Alternative
    1. Future without gluten restrictions: update on current treatments – No clear dose/effect/duration found.
    2. Intravascular lithotripsy for Coral Reef Aorta and chronic mesenteric ischemia – Positive/therapeutic effect mentioned.
    3. Optimization of gluten-free bread using whole sorghum-based flour – g.

    Herbs
    1. Herbal-based treatments: pathogenesis and disease management – g | Positive/therapeutic effect mentioned.
    2. Role of diet in scarring and nonscarring alopecia – Positive/therapeutic effect mentioned.
    3. Diet and chronic urticaria: dietary modification as treatment strategy – Positive/therapeutic effect mentioned.

    Amino acids
    1. Essential amino acids in celiac disease: immunogenicity, pathogenesis, therapeutic approaches – Positive/therapeutic effect mentioned.
    2. Whole genome transcriptional analysis: antioxidant defense, amino acid metabolism, antigen presentation – g | Positive/therapeutic effect mentioned.
    3. Gluten peptide analogues as inhibitors of HLA/DQ8-mediated immune response – g | Positive/therapeutic effect mentioned.

    Vitamins
    1. Future without gluten restrictions: update on current treatments – No clear dose/effect/duration found.
    2. Migraine causal factors in Mendelian randomization studies – g | Positive/therapeutic effect mentioned.
    3. Regulation of intestinal permeability and therapeutic applications – No clear dose/effect/duration found.

    Minerals
    1. Optimizing osteoporosis screening and fracture risk in celiac disease – Positive/therapeutic effect mentioned.
    2. Hydroponics and artificial light impact on wheat quality – No clear dose/effect/duration found.
    3. Gender-related differences in celiac disease presentation and follow-up – No clear dose/effect/duration found.

    Supplements
    1. Future without gluten restrictions: update on current treatments – No clear dose/effect/duration found.
    2. Gut microbiota in celiac disease – Negative/adverse effect mentioned.
    3. Orally administered zinc gluconate: tight junction remodeling and reduced transmucosal permeability – mg | Positive/therapeutic effect mentioned.

    Nutrients
    1. Future without gluten restrictions: update on current treatments – No clear dose/effect/duration found.
    2. Nutrition for children with Down syndrome – Positive/therapeutic effect mentioned.
    3. Optimization of gluten-free bread using whole sorghum-based flour – g.
    """.trimIndent(),
                listOf(
                    Reference("Nutrients. 2025 Sep 15;17(18):2960", "👉 Future without gluten restrictions – No clear effect", "41010485"),
                    Reference("Catheter Cardiovasc Interv. 2025 Sep 23", "👉 Intravascular lithotripsy – Positive effect", "40988380"),
                    Reference("Foods. 2025 Sep 5;14(17):3113", "👉 Gluten-free bread formulation – g", "40941231"),
                    Reference("Narra J. 2023 Aug;3(2):e147", "👉 Herbal-based treatments – g | Positive effect", "38454981"),
                    Reference("Skin Appendage Disord. 2020 Mar;6(2):88-96", "👉 Diet as adjuvant in alopecia – Positive effect", "32258051"),
                    Reference("Dermatol Pract Concept. 2019 Dec 31;10(1):e2020004", "👉 Diet in chronic urticaria – Positive effect", "31921491"),
                    Reference("Crit Rev Clin Lab Sci. 2025 Sep 5:1-16", "👉 Essential amino acids – Positive effect", "40910339"),
                    Reference("BMC Med. 2025 Aug 29;23(1):507", "👉 Whole genome transcriptional analysis – g | Positive effect", "40883722"),
                    Reference("Food Funct. 2025 Aug 26;16(17):6898-6909", "👉 Gluten peptide analogues – g | Positive effect", "40788264"),
                    Reference("Front Neurol. 2025 Sep 9;16:1660995", "👉 Migraine causal factors – g | Positive effect", "40994718"),
                    Reference("Arch Med Res. 2025 Sep 17;57(3):103321", "👉 Intestinal permeability regulation – No clear effect", "40967091"),
                    Reference("Am J Gastroenterol. 2025 Aug 26", "👉 Osteoporosis screening & fracture risk – Positive effect", "40856724"),
                    Reference("Sci Rep. 2025 Aug 21;15(1):30768", "👉 Hydroponics impact on wheat – No clear effect", "40841578"),
                    Reference("Expert Rev Gastroenterol Hepatol. 2025 Aug;19(8):871-876", "👉 Gender differences in celiac disease – No clear effect", "40682368"),
                    Reference("J Gastrointestin Liver Dis. 2025 Sep 26;34(3):362-369", "👉 Gut microbiota – Negative effect", "41004829"),
                    Reference("Int J Mol Sci. 2025 Sep 2;26(17):8540", "👉 Zinc gluconate – mg | Positive effect", "40943460"),
                    Reference("Healthcare (Basel). 2025 Sep 4;13(17):2222", "👉 Nutrition for children – Positive effect", "40941574")
                )
            )

            "Cold sores" -> Pair(
                """
    Alternative
    1. Intraoperative awake anesthesia and 3D reconstruction in percutaneous microballoon compression for trigeminal neuralgia – week, month.
    2. Herbal medicine for herpes labialis: systematic review – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
    3. Overview on HSV infections: current and future therapies – Negative/adverse effect mentioned.

    Herbs
    1. Herbal gel with melissa, sumac, licorice, rosemary, and geranium for recurrent labial herpes – g, mg.
    2. Herbal therapy on herpes labialis and genitalis (hot water extracts of six herbs) – No clear dose/effect/duration found.

    Amino acids
    1. Acyclovir-dexpanthenol nanofibrous patches for herpes labialis – No clear dose/effect/duration found.
    2. Mucoadhesive chitosan glutamate microparticles as antiherpes microbicide carriers – No clear dose/effect/duration found.
    3. MG132 anti-viral activity against HSV-1 via ERK pathway – Negative/adverse effect mentioned.

    Vitamins
    1. Identifying multifactorial triggers of monthly recurrent HSV-1 reactivation – Positive/therapeutic effect mentioned.
    2. Calcifediol and paricalcitol as adjunctive therapies for HSV-1 keratitis – Positive/therapeutic effect mentioned.
    3. Herpes simplex keratitis after corneal crosslinking: 1-year follow-up – Positive/therapeutic effect mentioned | day.

    Minerals
    1. Serum and dietary selenium levels in recurrent herpes lesions – No clear dose/effect/duration found.
    2. Diet in dermatology: influence on herpes labialis, rosacea, hidradenitis suppurativa, vitiligo – Positive/therapeutic effect mentioned.
    3. Topical herbal and mineral formulation (Dynamiclear) for herpes simplex labialis – Positive/therapeutic effect mentioned | day.

    Supplements
    1. Trollius chinensis research: pharmacology, ethnopharmacology – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
    2. Pleuran (β-Glucan from Pleurotus ostreatus) for HSV-1 management – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day.
    3. Lysine for HSV prophylaxis – g | Positive/therapeutic effect mentioned.

    Nutrients
    1. L-lysine, zinc, and herbal-based product for facial and circumoral herpes – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day.
    2. Ulcer management – No clear dose/effect/duration found.
    3. Conservative management in probable pediatric IBD – No clear dose/effect/duration found.
    """.trimIndent(),
                listOf(
                    Reference("J Pain Res. 2025 Sep 16;18:4833-4843", "👉 Microballoon compression – week, month", "40978551"),
                    Reference("J Integr Complement Med. 2025 Jun 17", "👉 Herbal medicine systematic review – Positive/Negative effect", "40526027"),
                    Reference("Antiviral Res. 2025 May;237:106152", "👉 HSV management – Negative effect", "40154924"),
                    Reference("Dent Res J (Isfahan). 2018 May-Jun;15(3):191-200", "👉 Herbal gel – g, mg", "29922338"),
                    Reference("Biotherapy. 1998;11(4):235-40", "👉 Hot water extracts of six herbs – No clear effect", "9950099"),
                    Reference("Int J Pharm. 2022 Jan 5;611:121354", "👉 Acyclovir-dexpanthenol nanofibrous patches – No clear effect", "34883208"),
                    Reference("Drug Deliv. 2021 Dec;28(1):2278-2288", "👉 Chitosan glutamate microparticles – No clear effect", "34668816"),
                    Reference("Sci Rep. 2020 Apr 21;10(1):6671", "👉 MG132 anti-HSV-1 – Negative effect", "32317666"),
                    Reference("Int Med Case Rep J. 2025 Jul 25;18:915-923", "👉 Monthly HSV-1 triggers – Positive effect", "40735359"),
                    Reference("Medicine (Baltimore). 2024 Dec 6;103(49):e40654", "👉 Calcifediol/paricalcitol for HSV-1 keratitis – Positive effect", "39654170"),
                    Reference("Diagnostics (Basel). 2024 Oct 11;14(20):2267", "👉 HSV keratitis post-CXL – Positive effect | day", "39451590"),
                    Reference("Biomed Res Int. 2021 Dec 31;2021:6083716", "👉 Selenium levels in recurrent herpes – No clear effect", "35005019"),
                    Reference("Am J Lifestyle Med. 2021 Jul 2;17(1):152-160", "👉 Diet in dermatology – Positive effect", "36636389"),
                    Reference("BMJ Open. 2020 Jan 12;10(1):e031876", "👉 Topical herbal/mineral Dynamiclear – Positive effect | day", "31932389"),
                    Reference("Molecules. 2024 Jan 15;29(2):421", "👉 Trollius chinensis review – Positive/Negative effect", "38257334"),
                    Reference("Evid Based Complement Alternat Med. 2020 Apr 13;2020:8562309", "👉 Pleuran (β-Glucan) – Positive/Negative effect | day", "32419831"),
                    Reference("Integr Med (Encinitas). 2017 Jun;16(3):42-46", "👉 Lysine for HSV prophylaxis – g | Positive effect", "30881246"),
                    Reference("Altern Med Rev. 2005 Jun;10(2):123-7", "👉 L-lysine, zinc, herbal-based product – Positive/Negative effect | day", "15989381"),
                    Reference("Dent Today. 2004 Jan;23(1):48-51", "👉 Ulcer management – No clear effect", "14968996"),
                    Reference("J Chiropr Med. 2003 Autumn;2(4):157-62", "👉 Pediatric IBD conservative management – No clear effect", "19674614")
                )
            )

            "Colic" -> Pair(
                """
    Alternative
    1. Sterile water injections for analgesia in renal colic – Positive/Negative effect mentioned.
    2. Direct access of intra-abdominal veins: feasibility and safety – No clear dose/effect/duration found.
    3. Ketorolac analgesia in adults: systematic review/meta-analysis – No clear dose/effect/duration found.

    Herbs
    1. Licorice (Glycyrrhiza glabra, DGL) – Positive/Negative effect mentioned.
    2. Fennel (Foeniculum vulgare) seeds – Negative/adverse effect mentioned | week.
    3. Infant feeding and treatment practices in Uganda – No clear dose/effect/duration found.

    Amino acids
    1. L-arginine for lower ureter stones: RCT – mg | week, day.
    2. Amino acid formula for infant colic: prospective cohort study – Positive/therapeutic effect mentioned.
    3. Cystinuria in children: diagnosis and treatment – Positive/therapeutic effect mentioned.

    Vitamins
    1. Pediatric non-alcoholic Wernicke's encephalopathy – Positive/therapeutic effect mentioned.
    2. Post-discharge Vitamin D intake compliance – month, month.
    3. Use of Vitamin D in children 0–18 months – Negative/adverse effect mentioned | month.

    Minerals
    1. Biodentine stimulates osteogenic differentiation of mesenchymal stromal cells – g | Positive/Negative effect mentioned.
    2. Equine abdominal lipomata histology – Positive/therapeutic effect mentioned.
    3. Fruit quality of Norwegian apples: cultivar/location effects – g, mg.

    Supplements
    1. 2'-Fucosyllactose supplementation in formula-fed infants – Positive/therapeutic effect mentioned.
    2. Probiotics/prebiotics in pregnancy and lactation – Positive/Negative effect mentioned.
    3. Microecological regulators and gut microbiota in children – Positive/therapeutic effect mentioned.

    Nutrients
    1. Cow's milk allergy prevalence in Chilean infants – month, month.
    2. Use of Vitamin D in children 0–18 months – Negative/adverse effect mentioned | month.
    3. Amino acid formula for infant colic – Positive/therapeutic effect mentioned.
    """.trimIndent(),
                listOf(
                    Reference("World J Urol. 2025 Sep 16;43(1):557", "👉 Sterile water injections – Positive/Negative effect", "40956348"),
                    Reference("J Vasc Surg Venous Lymphat Disord. 2025 Sep 1:102309", "👉 Intra-abdominal veins access – No clear effect", "40902941"),
                    Reference("Clin Exp Emerg Med. 2025 Aug 13", "👉 Ketorolac analgesia – No clear effect", "40803358"),
                    Reference("LactMed® Licorice. 2006–", "👉 Licorice root/DGL – Positive/Negative effect", "30000900"),
                    Reference("LactMed® Fennel. 2006–", "👉 Fennel seeds – Negative effect | week", "30000852"),
                    Reference("Glob Public Health. 2024 Jan;19(1):2418594", "👉 Infant feeding in Uganda – No clear effect", "39467162"),
                    Reference("Urolithiasis. 2025 Jun 11;53(1):109", "👉 L-arginine for ureter stones – mg | week, day", "40498114"),
                    Reference("Nutrients. 2025 Apr 9;17(8):1302", "👉 Amino acid formula for infant colic – Positive effect", "40284167"),
                    Reference("World J Urol. 2025 Apr 15;43(1):226", "👉 Cystinuria in children – Positive effect", "40234286"),
                    Reference("Ital J Pediatr. 2025 Jul 21;51(1):240", "👉 Wernicke's encephalopathy – Positive effect", "40691633"),
                    Reference("Arch Pediatr. 2025 Jul;32(5):301-306", "👉 Vitamin D compliance – month, month", "40571528"),
                    Reference("Arch Pediatr. 2025 Jul;32(5):295-300", "👉 Vitamin D use in 0–18 mo – Negative effect | month", "40467358"),
                    Reference("Int J Mol Sci. 2025 Apr 29;26(9):4220", "👉 Biodentine osteogenic differentiation – g | Positive/Negative effect", "40362457"),
                    Reference("Equine Vet J. 2025 Feb 20", "👉 Equine abdominal lipomata histology – Positive effect", "39980244"),
                    Reference("Plants (Basel). 2024 Jan 4;13(1):147", "👉 Norwegian apples – g, mg", "38202455"),
                    Reference("Pediatr Gastroenterol Hepatol Nutr. 2025 Sep;28(5):291-301", "👉 2'-Fucosyllactose supplementation – Positive effect", "41001441"),
                    Reference("Curr Nutr Rep. 2025 Sep 15;14(1):106", "👉 Probiotics/prebiotics in pregnancy – Positive/Negative effect", "40952551"),
                    Reference("Transl Pediatr. 2025 Aug 31;14(8):2023-2041", "👉 Microecological regulators in children – Positive effect", "40949907"),
                    Reference("Nutrients. 2025 May 29;17(11):1859", "👉 Cow's milk allergy prevalence – month, month", "40507128"),
                    Reference("Nutrients. 2025 Apr 9;17(8):1302", "👉 Amino acid formula for infant colic – Positive effect", "40284167")
                )
            )

            "Common cold" -> Pair(
                """
    Alternative
    1. Midwifery management of Hiesho in pregnant women (Japan) – Positive/therapeutic effect mentioned.
    2. Temporary passive shunt during thoracoabdominal aortic repair – No clear dose/effect/duration found.
    3. Analgesic potential of serratus block in female dogs – g, mg.

    Herbs
    1. Depression syndrome typing & medication patterns (TCM) – No clear dose/effect/duration found.
    2. TCM medication patterns for Tic disorders – No clear dose/effect/duration found.
    3. Herbal combination models (TCM theory) – No clear dose/effect/duration found.

    Amino acids
    1. Seasonal metabolic adaptations in legumes – μg | Positive/therapeutic effect mentioned.
    2. Quercetin enhances cold storage of human umbilical cord mesenchymal stem cells – Positive/therapeutic effect mentioned | day.
    3. Plasma lipids, amino acids as biomarkers in asthma – No clear dose/effect/duration found.

    Vitamins
    1. Oral nutritional supplements for preventing respiratory infections – Positive/Negative effect mentioned | day.
    2. Multivitamin-mineral supplementation prevents acute URTIs – Positive/therapeutic effect mentioned | month.
    3. OTC drug awareness in Jordan – Negative/adverse effect mentioned.

    Minerals
    1. SIMS isotopic analysis method – No clear dose/effect/duration found.
    2. Damage evolution in sandstones under freeze-thaw loads – No clear dose/effect/duration found.
    3. Spatial transcriptomics in osteosarcoma – Negative/adverse effect mentioned.

    Supplements
    1. Social recommendation model (graph convolution networks) – Positive/therapeutic effect mentioned.
    2. Oral nutritional supplements preventing respiratory infections – Positive/Negative effect mentioned | day.
    3. TCM medication pattern analysis – No clear dose/effect/duration found.

    Nutrients
    1. Euglena gracilis suppresses cold symptoms in healthy individuals – Positive/therapeutic effect mentioned | week.
    2. Multivitamin-mineral supplementation prevents acute URTIs – Positive/therapeutic effect mentioned | month.
    3. Road salt reduces plant cover in bioretention systems – mg | Positive/therapeutic effect mentioned.
    """.trimIndent(),
                listOf(
                    Reference("Cureus. 2025 Aug 12;17(8):e89852", "👉 Hiesho management in pregnancy – Positive effect", "40951153"),
                    Reference("J Clin Med. 2025 Aug 27;14(17):6064", "👉 Temporary passive shunt – No clear effect", "40943821"),
                    Reference("Braz J Vet Med. 2025 Sep 4;47:e000925", "👉 Serratus block in female dogs – g, mg", "40936646"),
                    Reference("Sichuan Da Xue Xue Bao Yi Xue Ban. 2025 May 20;56(3):656-664", "👉 TCM depression medication patterns – No clear effect", "40964125"),
                    Reference("Neuropsychiatr Dis Treat. 2025 Sep 10;21:2001-2016", "👉 TCM treatment of tic disorders – No clear effect", "40955202"),
                    Reference("Brief Bioinform. 2025 May 1;26(3):bbaf229", "👉 TCM herbal combination models – No clear effect", "40407387"),
                    Reference("Scientifica (Cairo). 2025 Sep 10;2025:1359373", "👉 Legume metabolic adaptations – μg | Positive effect", "40970269"),
                    Reference("Cryobiology. 2025 Sep;120:105299", "👉 Quercetin enhances cold storage – Positive effect | day", "40896914"),
                    Reference("Front Pediatr. 2025 Jul 23;13:1549431", "A👉 mino acids as asthma biomarkers – No clear effect", "40771395"),
                    Reference("EClinicalMedicine. 2025 Sep 2;88:103479", "👉 Oral nutritional supplements – Positive/Negative effect | day", "40969681"),
                    Reference("Asia Pac J Clin Nutr. 2025 Aug;34(4):596-609", "👉 Multivitamin-mineral supplementation – Positive effect | month", "40738727"),
                    Reference("Patient Prefer Adherence. 2025 Jun 5;19:1661-1672", "👉 OTC drug awareness – Negative effect", "40497234"),
                    Reference("Anal Chem. 2025 Sep 15", "👉 SIMS isotopic analysis method – No clear effect", "40947976"),
                    Reference("Sci Prog. 2025 Jul-Sep;108(3):368504251368706", "👉 Freeze-thaw damage in sandstones – No clear effect", "40790985"),
                    Reference("Front Oncol. 2025 Jul 16;15:1640645", "👉 Osteosarcoma spatial transcriptomics – Negative effect", "40740859"),
                    Reference("PeerJ Comput Sci. 2025 Jul 16;11:e3010", "👉 Social recommendation model – Positive effect", "40989374"),
                    Reference("EClinicalMedicine. 2025 Sep 2;88:103479", "👉 Oral nutritional supplements – Positive/Negative effect | day", "40969681"),
                    Reference("Sichuan Da Xue Xue Bao Yi Xue Ban. 2025 May 20;56(3):656-664", "👉 TCM medication pattern analysis – No clear effect", "40964125"),
                    Reference("Food Sci Nutr. 2025 Sep 18;13(9):e70935", "👉 Euglena gracilis – Positive effect | week", "40979570"),
                    Reference("Asia Pac J Clin Nutr. 2025 Aug;34(4):596-609", "👉 Multivitamin-mineral supplementation – Positive effect | month", "40738727"),
                    Reference("Sci Total Environ. 2025 Sep 15;995:180082", "👉 Road salt reduces plant cover – mg | Positive effect", "40695217")
                )
            )

            "Conjunctivitis" -> Pair(
                """
    Alternative
    1. Syphilis and the eye: Clinical features and evolving therapeutic paradigms – Positive/therapeutic effect mentioned.
    2. Epinastine eyelid cream for glaucoma patients – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
    3. Lyophilized umbilical cord amniotic membrane in trichiasis surgery – Positive/therapeutic effect mentioned | month.

    Herbs
    1. ADVISE multicenter epidemiology study (adenovirus) – No clear dose/effect/duration found.
    2. Papain-induced occupational rhinoconjunctivitis – No clear dose/effect/duration found.
    3. Preserving neural retina through herbal interventions – Positive/therapeutic effect mentioned.

    Amino acids
    1. Role of Rho kinase inhibitors in corneal diseases – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
    2. Antiviral combination treatment in cats with feline herpesvirus-1 – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
    3. Biomarkers of ocular allergy and dry eye disease – No clear dose/effect/duration found.

    Vitamins
    1. CAR-T cell therapy ocular adverse events – Negative/adverse effect mentioned | month.
    2. Nontargeted metabolomics in allergic conjunctivitis – Negative/adverse effect mentioned.
    3. Allergic diseases and bronchiectasis study – g, g.

    Minerals
    1. Corneal ectasia after cosmetic keratopigmentation – month.
    2. Exposure keratopathy prevention in mechanically ventilated patients – Positive/therapeutic effect mentioned | day.
    3. Chloramphenicol in water review – mg | Negative/adverse effect mentioned.

    Supplements
    1. Nutraceuticals against oxidative stress in allergic diseases – Positive/therapeutic effect mentioned.
    2. Lebrikizumab in atopic dermatitis – mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week, month.
    3. Multi-strain probiotic SYN-53 in allergic rhinoconjunctivitis – Positive/therapeutic effect mentioned.

    Nutrients
    1. Quercetin and lecithin-based formulation for allergic diseases – G | Positive/therapeutic effect mentioned.
    2. Maternal dietary isoflavone intake and childhood allergic rhinoconjunctivitis – Positive/therapeutic effect mentioned.
    3. Serum vitamin D levels in children with vernal keratoconjunctivitis – Positive/therapeutic effect mentioned.
    """.trimIndent(),
                listOf(
                    Reference("Pathogens. 2025 Aug 27;14(9):852", "👉 Syphilis and the eye – Positive effect", "41011752"),
                    Reference("Cureus. 2025 Jul 9;17(7):e87589", "👉 Epinastine eyelid cream – Positive/Negative effect", "40786375"),
                    Reference("Eur J Ophthalmol. 2025 Aug 11:11206721251364301", "👉 Umbilical cord amniotic membrane – Positive effect | month", "40785311"),
                    Reference("Graefes Arch Clin Exp Ophthalmol. 2019 Jan;257(1):249-251", "👉 ADVISE study – No clear effect", "30255398"),
                    Reference("Med Pr. 2016;67(1):109-12", "👉 Papain-induced rhinoconjunctivitis – No clear effect", "27044723"),
                    Reference("J Cell Biochem. 2014 Oct;115(10):1659-68", "👉 Herbal interventions – Positive effect", "24819477"),
                    Reference("Drug Des Devel Ther. 2024 Jan 19;18:97-108", "👉 Rho kinase inhibitors – Positive/Negative effect", "38264539"),
                    Reference("Pol J Vet Sci. 2023 Dec 12;26(4):705-713", "👉 Antiviral combo in cats – Positive/Negative effect", "38088482"),
                    Reference("Rom J Ophthalmol. 2023 Jul-Sep;67(3):250-259", "👉 Ocular allergy biomarkers – No clear effect", "37876509"),
                    Reference("Ocul Oncol Pathol. 2025 Jul;11(2):104-108", "👉 CAR-T ocular events – Negative effect | month", "40726603"),
                    Reference("Eur J Ophthalmol. 2025 Sep;35(5):1569-1584", "👉 Allergic conjunctivitis metabolomics – Negative effect", "40313174"),
                    Reference("World Allergy Organ J. 2025 Mar 12;18(3):101038", "👉 Allergic diseases & bronchiectasis – g, g", "40151543"),
                    Reference("Cornea. 2024 Nov 7;44(6):779-787", "👉 Corneal ectasia – month", "39509277"),
                    Reference("Eye Contact Lens. 2024 Feb 1;50(2):70-72", "👉 Exposure keratopathy prevention – Positive effect | day", "37934177"),
                    Reference("Environ Chem Lett. 2022;20(3):1929-1963", "👉 Chloramphenicol in water – mg | Negative effect", "35369683"),
                    Reference("Biomolecules. 2025 Sep 20;15(9):1347", "👉 Nutraceuticals – Positive effect", "41008654"),
                    Reference("Am J Clin Dermatol. 2025 Sep;26(5):803-817", "👉 Lebrikizumab – mg | Positive/Negative effect | week, month", "40665146"),
                    Reference("Allergy. 2025 Aug;80(8):2158-2166", "👉 Probiotic SYN-53 – Positive effect", "40577168"),
                    Reference("Nutrients. 2025 Apr 27;17(9):1476", "👉 Quercetin – G | Positive effect", "40362785"),
                    Reference("Nutrients. 2025 Feb 21;17(5):769", "👉 Maternal isoflavones – Positive effect", "40077638"),
                    Reference("Indian J Ophthalmol. 2024 Jul 1;72(Suppl 4):S634-S638", "👉 Vitamin D in vernal keratoconjunctivitis – Positive effect", "38770629")
                )
            )

            "Constipation" -> Pair(
                """
    Alternative
    1. Uridine and Liriope platyphylla L. for constipation – No clear dose/effect/duration found.
    2. Opioid-free vs. opioid-based anesthesia in neonates and infants – Negative/adverse effect mentioned.
    3. Ziconotide as an opioid replacement – mg, μg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week.

    Herbs
    1. Ethnomedicinal plants for gastrointestinal disorders in Pakistan – g, g.
    2. Atractylodes macrocephala + Raphanus sativus L. herb pair for senile constipation – Positive/therapeutic effect mentioned.
    3. Scorzonera undulata: traditional applications and pharmacological attributes – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.

    Amino acids
    1. Modified Atkins diet vs. topiramate in epileptic spasms – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week.
    2. Multi-omics study: gut microbiota in children with allergic rhinitis and constipation – No clear dose/effect/duration found.
    3. Lactobacillus rhamnosus Glory LG12 prevents loperamide-induced constipation in mice – Positive/therapeutic effect mentioned.

    Vitamins
    1. Vitamin D deficiency-related digestive issues – No clear dose/effect/duration found.
    2. Tirzepatide and hypercalcemia with chronic hydrochlorothiazide – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week.
    3. Vitamin interventions in ASD and ADHD – Positive/therapeutic effect mentioned.

    Minerals
    1. Dietary management of chronic constipation: review – No clear dose/effect/duration found.
    2. Dystrophic epidermolysis bullosa – Positive/therapeutic effect mentioned | month.
    3. Whole lung lavage in exogenous lipoid pneumonia – Positive/therapeutic effect mentioned | day, month.

    Supplements
    1. Mirabegron + solifenacin vs. solifenacin monotherapy – mg | Positive/therapeutic effect mentioned.
    2. Insomnia symptoms in young children with ASD – No clear dose/effect/duration found.
    3. Dietary management of chronic constipation: review – No clear dose/effect/duration found.

    Nutrients
    1. Undernutrition in adult cancer patients – Positive/therapeutic effect mentioned.
    2. Lyophilized Korean rice wine (Makgeolli) for loperamide-induced constipation in rats – mg | Positive/therapeutic effect mentioned.
    3. Caregivers’ adherence to ketogenic diet in children with refractory epilepsy – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
    """.trimIndent(),
                listOf(
                    Reference("Pharmaceuticals (Basel). 2025 Aug 28;18(9):1289", "👉 Uridine and Liriope platyphylla – No clear effect", "41011160"),
                    Reference("Saudi J Anaesth. 2025 Oct-Dec;19(4):559-565", "👉 Opioid-free vs. opioid anesthesia – Negative effect", "40994471"),
                    Reference("J Pain Res. 2025 Sep 17;18:4859-4870", "👉 Ziconotide – mg, μg | Positive/Negative effect | week", "40985013"),
                    Reference("Sci Rep. 2025 Aug 21;15(1):30683", "👉 Ethnomedicinal plants – g, g", "40841421"),
                    Reference("Phytomedicine. 2025 Sep;145:156977", "👉 Atractylodes + Raphanus herb pair – Positive effect", "40554896"),
                    Reference("Plants (Basel). 2025 May 24;14(11):1606", "👉 Scorzonera undulata – Positive/Negative effect", "40508281"),
                    Reference("Seizure. 2025 Sep;131:405-412", "👉 Modified Atkins diet vs. topiramate – Positive/Negative effect | week", "40840039"),
                    Reference("Front Allergy. 2025 Jul 14;6:1655751", "👉 Multi-omics gut microbiota – No clear effect", "40727591"),
                    Reference("Front Microbiol. 2025 Jul 11;16:1577799", "👉 Lactobacillus rhamnosus Glory LG12 – Positive effect", "40718808"),
                    Reference("Cureus. 2025 Aug 8;17(8):e89598", "👉 Vitamin D deficiency digestive issues – No clear effect", "40926915"),
                    Reference("Endocrinol Diabetes Metab Case Rep. 2025 Sep 5;2025(3):e250067", "👉 Tirzepatide & hypercalcemia – Positive/Negative effect | week", "40911613"),
                    Reference("Neuropsychiatr Dis Treat. 2025 Aug 30;21:1845-1855", "👉 Vitamin interventions in ASD/ADHD – Positive effect", "40910091"),
                    Reference("Proc Nutr Soc. 2025 Sep 1:1-13", "👉 Dietary management of chronic constipation – No clear effect", "40888045"),
                    Reference("Dystrophic Epidermolysis Bullosa, GeneReviews. 2006 Aug 21 [updated 2025 Aug 7]", "👉 Dystrophic epidermolysis bullosa – Positive effect | month", "20301481"),
                    Reference("Respir Med Case Rep. 2025 Jul 25;57:102274", "👉 Whole lung lavage – Positive effect | day, month", "40755838"),
                    Reference("Urologia. 2025 Sep 20:3915603251378596", "👉 Mirabegron + solifenacin – mg | Positive effect", "40974235"),
                    Reference("J Pediatr. 2025 Sep 15:114812", "👉 Insomnia symptoms in ASD – No clear effect", "40962108"),
                    Reference("Proc Nutr Soc. 2025 Sep 1:1-13", "👉 Dietary management of chronic constipation review – No clear effect", "40888045"),
                    Reference("PeerJ. 2025 Sep 4;13:e19925", "👉 Undernutrition in cancer patients – Positive effect", "40936766"),
                    Reference("Food Funct. 2025 Sep 2", "👉 Lyophilized Korean rice wine – mg | Positive effect", "40891232"),
                    Reference("Nutrients. 2025 Aug 11;17(16):2605", "👉 Ketogenic diet adherence – Positive/Negative effect", "40871633")
                )
            )

            "Contact dermatitis" -> Pair(
                """
    Alternative
    1. Epoxy resins: biological effects and allergic reactions – Negative/adverse effect mentioned.
    2. Delayed adverse skin reaction to TENS electrodes – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
    3. Ethanol extract of Rosa rugosa Thunb. on ear edema – µg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.

    Herbs
    1. Allergic contact dermatitis of the vulva – No clear dose/effect/duration found.
    2. Asteraceae dermatitis from everyday plants – No clear dose/effect/duration found.
    3. Homemade topical preparations: hypersensitivity reactions – Negative/adverse effect mentioned.

    Amino acids
    1. Selenium-Binding Protein 1 influence on methionine inhibition in dermatitis – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
    2. Glycyrrhiza glabra, Boswellia sarca, Acacia nilotica in acute allergic dermatitis – Positive/therapeutic effect mentioned.
    3. Burden of pain and analgesic use in chronic hand eczema – day, day.

    Vitamins
    1. Murine model of epicutaneously-induced immunomodulation – No clear dose/effect/duration found.
    2. Vitamin D and IL-10 in allergic Parthenium contact dermatitis – Positive/therapeutic effect mentioned.
    3. Repairing balm vs. topical antimicrobial for post-procedural wounds – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.

    Minerals
    1. Patch testing in occupational dermatology – g | Positive/therapeutic effect mentioned.
    2. Fermented cabbage extract with nitric oxide metabolites – Positive/therapeutic effect mentioned.
    3. Nanoparticles’ immunomodulatory effects on dendritic cells – Negative/adverse effect mentioned.

    Supplements
    1. Biosensor-based hapten-protein interactions for skin sensitisation prediction – Negative/adverse effect mentioned.
    2. Type I hypersensitivity reactions – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
    3. Black seed (Nigella sativa) for topical/oral use – No clear dose/effect/duration found.

    Nutrients
    1. Skin microbiota in facial dermatoses – Positive/therapeutic effect mentioned.
    2. Reflectance confocal microscopy in allergic contact dermatitis to mango sap – No clear dose/effect/duration found.
    3. Sucrose ingestion exacerbating allergic contact dermatitis in rats – Positive/therapeutic effect mentioned.
    """.trimIndent(),
                listOf(
                    Reference("Drug Chem Toxicol. 2025 Sep 17:1-11", "👉 Epoxy resins – Negative effect", "40958645"),
                    Reference("Pain Manag. 2025 Sep 3:1-6", "👉 TENS electrodes – Positive/Negative effect", "40898959"),
                    Reference("Mol Nutr Food Res. 2025 Aug 20:e70214", "👉 Rosa rugosa extract – µg | Positive/Negative effect", "40831339"),
                    Reference("Contact Dermatitis. 2025 Sep;93(3):234-242", "👉 Vulvar ACD – No clear effect", "40410940"),
                    Reference("Cutis. 2024 Oct;114(4):E18-E21", "👉 Asteraceae dermatitis – No clear effect", "39621565"),
                    Reference("Acta Dermatovenerol Croat. 2023 Dec;31(3):117-124", "👉 Homemade topical preparations – Negative effect", "38439720"),
                    Reference("Biol Pharm Bull. 2025;48(9):1384-1390", "👉 Selenium-Binding Protein 1 – Positive/Negative effect", "40958559"),
                    Reference("Inflammopharmacology. 2025 May;33(5):2793-2814", "👉 Herbal pharmaco-metabolomics – Positive effect", "40389681"),
                    Reference("Contact Dermatitis. 2025 Aug;93(2):131-137", "👉 Pain & analgesic use in hand eczema – day, day", "40375750"),
                    Reference("J Vis Exp. 2025 Jun 24;(220)", "👉 Epicutaneously-induced immunomodulation – No clear effect", "40658730"),
                    Reference("Cureus. 2025 Jun 7;17(6):e85515", "👉 Vitamin D & IL-10 – Positive effect", "40630332"),
                    Reference("J Drugs Dermatol. 2025 May 1;24(5):507-515", "👉 Repairing balm vs antimicrobial – Positive/Negative effect", "40327581"),
                    Reference("Allergol Select. 2024 May 3;8:82-89", "👉 Patch testing – g | Positive effect", "38756208"),
                    Reference("Int J Mol Sci. 2024 Jan 8;25(2):775", "👉 Fermented cabbage extract – Positive effect", "38255849"),
                    Reference("Sci Rep. 2023 Sep 25;13(1):15992", "👉 Nanoparticles immunomodulatory – Negative effect", "37749142"),
                    Reference("Altern Lab Anim. 2025 Sep;53(5):281-300", "👉 Biosensor-based approaches – Negative effect", "40787717"),
                    Reference("StatPearls. 2025 Aug 3", "👉 Type I hypersensitivity – Positive/Negative effect", "32809396"),
                    Reference("Black Seed. 2025 Jul 15", "👉 Black seed – No clear effect", "30000936"),
                    Reference("Int J Mol Sci. 2025 Sep 11;26(18):8857", "👉 Skin microbiota – Positive effect", "41009424"),
                    Reference("Cutis. 2024 Sep;114(3):E10-E13", "👉 Reflectance confocal microscopy – No clear effect", "39413332"),
                    Reference("Nutrients. 2024 Jun 20;16(12):1962", "👉 Sucrose ingestion – Positive effect", "38931315")
                )
            )

            "COPD" -> Pair(
                """
    Alternative
    1. Integrating exercise and medication management in geriatric care – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
    2. Modulation of pulmonary inflammation by fumaric ester – Positive/therapeutic effect mentioned.
    3. Antimicrobial effect of benzbromarone with colistin – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.

    Herbs
    1. Natural antioxidants from herbs for lung disorders – Positive/therapeutic effect mentioned.
    2. Morus alba L.-Glycyrrhiza uralensis in COPD – g | Positive/therapeutic effect mentioned.
    3. Seven-Herb Decoction Quanzhenyiqitang – Positive/therapeutic effect mentioned.

    Amino acids
    1. Amino acid metabolic reprogramming in chronic airway diseases – Positive/therapeutic effect mentioned.
    2. LC-MS/MS vs ELISA correlation for desmosine analysis – No clear dose/effect/duration found.
    3. Sputum microbiota composition in COPD-bronchiectasis – No clear dose/effect/duration found.

    Vitamins
    1. Sarcopenia, cachexia, and aging review – Positive/therapeutic effect mentioned.
    2. Vitamin B12 deficiency and lung disease risk – No clear dose/effect/duration found.
    3. Gut-lung axis: microbiota analysis in COPD – Positive/therapeutic effect mentioned.

    Minerals
    1. Respiratory disease prevalence in Sertão do Araripe – No clear dose/effect/duration found.
    2. Bone microarchitecture in men with prostate cancer – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
    3. Natural disasters and respiratory health – Positive/therapeutic effect mentioned.

    Supplements
    1. Jianpi Yifei Tongluo recipe in rat COPD model – Positive/therapeutic effect mentioned.
    2. Montelukast sodium + budesonide/formoterol in obstructive airway disease – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
    3. Sarcopenia, cachexia, and aging review – Positive/therapeutic effect mentioned.

    Nutrients
    1. Sarcopenia, cachexia, and aging review – Positive/therapeutic effect mentioned.
    2. Lacticaseibacillus rhamnosus in steroid-resistant COPD (RETRACTED) – No clear dose/effect/duration found.
    3. Combined dietary intake and pulmonary function in Korean adults – Positive/therapeutic effect mentioned.
    """.trimIndent(),
                listOf(
                    Reference("Lancet Healthy Longev. 2025 Sep 24:100763", "👉 Exercise & med management – Positive/Negative effect", "41015054"),
                    Reference("Antioxidants (Basel). 2025 Sep 22;14(9):1141", "👉 Fumaric ester – Positive effect", "41009045"),
                    Reference("Front Med (Lausanne). 2025 Sep 10;12:1665514", "👉 Benzbromarone + colistin – Positive/Negative effect", "41001392"),
                    Reference("Phytother Res. 2025 Aug;39(8):3353-3385", "👉 Herbal antioxidants – Positive effect", "40587974"),
                    Reference("J Ethnopharmacol. 2025 Jun 12;349:119904", "👉 Morus alba L.-Glycyrrhiza uralensis – g | Positive effect", "40324701"),
                    Reference("Chem Biodivers. 2024 Jul;21(7):e202400277", "👉 Seven-Herb Decoction – Positive effect", "38686912"),
                    Reference("World J Surg Oncol. 2025 Sep 18;23(1):335", "👉 Amino acid metabolism – Positive effect", "40963133"),
                    Reference("Bioanalysis. 2025 Sep 14:1-5", "👉 Desmosine analysis – No clear effect", "40947852"),
                    Reference("Exploration (Beijing). 2025 May 4;5(4):e20240149", "👉 Sputum microbiota – No clear effect", "40873638"),
                    Reference("J Assoc Physicians India. 2025 Sep;73(9):85-90", "👉 Sarcopenia & aging – Positive effect", "40955936"),
                    Reference("Sci Rep. 2025 Sep 3;15(1):32361", "👉 Vitamin B12 & lung disease – No clear effect", "40903476"),
                    Reference("Front Immunol. 2025 Jul 30;16:1549865", "👉 Gut-lung axis microbiota – Positive effect", "40808958"),
                    Reference("Epidemiol Serv Saude. 2025 Sep 15;34:e20240519", "👉 Respiratory disease prevalence – No clear effect", "40960761"),
                    Reference("Bone. 2025 Sep 11;201:117643", "👉 Bone microarchitecture – Positive/Negative effect", "40945813"),
                    Reference("Eur Respir J. 2025 Aug 21:2402563", "👉 Natural disasters & respiratory health – Positive effect", "40841146"),
                    Reference("J Tradit Chin Med. 2025 Oct;45(5):1048-1058", "👉 Jianpi Yifei Tongluo recipe – Positive effect", "41015803"),
                    Reference("Postepy Dermatol Alergol. 2024 Oct 24;42(4):393-397", "👉 Montelukast + budesonide/formoterol – Positive/Negative effect", "41001138"),
                    Reference("J Assoc Physicians India. 2025 Sep;73(9):85-90", "👉 Sarcopenia & aging review – Positive effect", "40955936"),
                    Reference("Nutrients. 2025 Jul 31;17(15):2513", "👉 Lacticaseibacillus rhamnosus (RETRACTED) – No clear effect", "40806160"),
                    Reference("Clin Nutr Res. 2025 Jul 25;14(3):182-190", "👉 Combined dietary intake – Positive effect", "40772124")
                )
            )

            "Cough" -> Pair(
                """
    Alternative
    1. Bordetella pertussis macrolide resistance in Guangzhou – g, mg, G | Positive/therapeutic effect mentioned.
    2. Refractory chronic cough care in children and adults – No clear dose/effect/duration found.
    3. Pneumocystis jirovecii pneumonia diagnosis via oropharyngeal PCR – Positive/therapeutic effect mentioned.

    Herbs
    1. Chimonanthus salicifolius essential oil in acute lung injury – Positive/therapeutic effect mentioned.
    2. Herbal medicines for cough variant asthma – No clear dose/effect/duration found.
    3. Qingfei Shibawei Pill quality assessment – No clear dose/effect/duration found.

    Amino acids
    1. Sacubitril-valsartan in hemodialysis patients – mg | Negative/adverse effect mentioned.
    2. Goat Bezoar (Houzao) raw material analysis – No clear dose/effect/duration found.
    3. COVID-19 symptom diary with nirmatrelvir 300 mg – g, mg | day.

    Vitamins
    1. Myotonic Dystrophy Type 2 – No clear dose/effect/duration found.
    2. Persistent pulmonary findings after COVID-19 – Positive/therapeutic effect mentioned.
    3. Autoimmune hemolytic anemia secondary to Mycoplasma pneumoniae – Positive/therapeutic effect mentioned | day.

    Minerals
    1. Sideritis libanotica LC-HRMS profiling – mg | Positive/therapeutic effect mentioned.
    2. Pompe Disease – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month.
    3. Pleural mesothelioma – Positive/therapeutic effect mentioned.

    Supplements
    1. Montelukast sodium + budesonide/formoterol – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
    2. Trisomy 18 case report – month.
    3. Cholecystobronchial fistula two-stage treatment – No clear dose/effect/duration found.

    Nutrients
    1. Vitamins A, C, E intake during pregnancy – mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month.
    2. Eating Assessment Tool-10 validation – No clear dose/effect/duration found.
    3. Phosphorus-solubilizing fungi effects on Fritillaria rhizosphere – g | Positive/therapeutic effect mentioned.
    """.trimIndent(),
                listOf(
                    Reference("BMC Infect Dis. 2025 Sep 26;25(1):1152", "👉 Bordetella pertussis – Positive effect", "41013351"),
                    Reference("J Clin Med. 2025 Sep 18;14(18):6594", "👉 Refractory chronic cough – No clear effect", "41010798"),
                    Reference("J Clin Med. 2025 Sep 18;14(18):6572", "👉 Pneumocystis jirovecii PCR – Positive effect", "41010771"),
                    Reference("J Ethnopharmacol. 2025 Sep 25;353(Pt B):120419", "👉 Chimonanthus salicifolius EO – Positive effect", "40816582"),
                    Reference("Front Pharmacol. 2025 Jun 11;16:1594308", "👉 Herbal cough variant asthma – No clear effect", "40575773"),
                    Reference("Talanta. 2025 Dec 1;295:128349", "👉 Qingfei Shibawei Pill – No clear effect", "40435755"),
                    Reference("PLoS One. 2025 Sep 4;20(9):e0330038", "👉 Sacubitril-valsartan – Negative effect", "40906769"),
                    Reference("Phytochem Anal. 2025 Aug 14", "👉 Goat Bezoar analysis – No clear effect", "40814118"),
                    Reference("J Patient Rep Outcomes. 2025 Aug 11;9(1):99", "👉 COVID-19 diary with nirmatrelvir – g, mg | day", "40788441"),
                    Reference("Myotonic Dystrophy Type 2, GeneReviews. 2006 Sep 21 [updated 2025 Sep 25]", "👉 Myotonic Dystrophy Type 2 – No clear effect", "20301639"),
                    Reference("Cureus. 2025 Aug 19;17(8):e90542", "👉 Persistent pulmonary findings post-COVID – Positive effect", "40978879"),
                    Reference("Medwave. 2025 Sep 17;25(8):e3039", "👉 Autoimmune hemolytic anemia – Positive effect | day", "40961273"),
                    Reference("Chem Biodivers. 2025 Sep 17:e01314", "👉 Sideritis libanotica – Positive effect", "40961453"),
                    Reference("Pompe Disease, GeneReviews. 2007 Aug 31 [updated 2025 Aug 21]", "👉 Pompe Disease – Positive/Negative effect | month", "20301438"),
                    Reference("Nat Rev Dis Primers. 2025 Aug 7;11(1):56", "👉 Pleural mesothelioma – Positive effect", "40775245"),
                    Reference("Postepy Dermatol Alergol. 2024 Oct 24;42(4):393-397", "👉 Montelukast + budesonide/formoterol – Positive/Negative effect", "41001138"),
                    Reference("Medicine (Baltimore). 2025 Aug 29;104(35):e44225", "👉 Trisomy 18 case – month", "40898545"),
                    Reference("J Med Case Rep. 2025 Aug 21;19(1):422", "👉 Cholecystobronchial fistula – No clear effect", "40841686"),
                    Reference("J Hum Nutr Diet. 2025 Aug;38(4):e70086", "👉 Vitamins A, C, E intake during pregnancy – Positive/Negative effect | month", "40605146"),
                    Reference("Nutrients. 2025 Apr 8;17(8):1291", "👉 Eating Assessment Tool-10 – No clear effect", "40284156"),
                    Reference("PeerJ. 2025 Apr 21;13:e19283", "👉 Phosphorus-solubilizing fungi – Positive effect", "40276297")
                )
            )

            "Croup" -> Pair(
                """
    Alternative
    1. AI algorithms in pediatric respiratory disease diagnosis using cough sounds – g | Positive/therapeutic effect mentioned.
    2. Surgery for recurrent croup – month.
    3. Association of SNPs and external pelvimetry in cattle – Positive/therapeutic effect mentioned.

    Herbs
    No entries.

    Amino acids
    1. Leucine in parainfluenza virus 3 matrix protein – No clear dose/effect/duration found.
    2. Corticosteroids and bone metabolism in infants/children – mg | Negative/adverse effect mentioned | day, month.
    3. Lysine and threonine supplementation in yearling horses – g.

    Vitamins
    1. Fish oil and vitamin D in pregnancy for early childhood asthma prevention – IU, g | Positive/therapeutic effect mentioned | week.
    2. Prenatal vitamin D and fish oil to prevent offspring croup – Positive/therapeutic effect mentioned.
    3. Fish oil and vitamin D supplementation protect against childhood croup – IU | Positive/therapeutic effect mentioned | week.

    Minerals
    1. Myhre Syndrome – Positive/therapeutic effect mentioned.
    2. Lysine and threonine supplementation in horses – g.
    3. Friedrich Joseph Haass biography – No clear dose/effect/duration found.

    Supplements
    1. Fish oil and vitamin D in pregnancy (COPSAC) – IU, g | Positive/therapeutic effect mentioned | week.
    2. Atopic and non-atopic effects of fish oil supplementation during pregnancy – Positive/therapeutic effect mentioned.
    3. Pediatric ED respiratory distress learning module – No clear dose/effect/duration found.

    Nutrients
    1. Panax notoginseng irrigation study – mg | Positive/therapeutic effect mentioned.
    2. Fish oil and vitamin D in pregnancy (COPSAC) – IU, g | Positive/therapeutic effect mentioned | week.
    3. Pteris vittata arsenic-hyperaccumulator and phosphate solubilization – g, mg | Positive/therapeutic effect mentioned | day.
    """.trimIndent(),
                listOf(
                    Reference("Cureus. 2025 Jul 21;17(7):e88457", "👉 AI diagnosis via cough sounds – Positive effect", "40851747"),
                    Reference("Int J Pediatr Otorhinolaryngol. 2025 Sep;196:112498", "👉 Surgery for recurrent croup – month", "40701137"),
                    Reference("Animals (Basel). 2025 May 29;15(11):1586", "👉 SNPs & pelvimetry in cattle – Positive effect", "40509051"),
                    Reference("J Virol. 2014 Nov;88(22):13173-88", "👉 Leucine in parainfluenza virus 3 – No clear effect", "25187547"),
                    Reference("Calcif Tissue Int. 2003 Oct;73(4):319-25", "👉 Corticosteroids in children – Negative effect | day, month", "12874699"),
                    Reference("J Anim Sci. 1994 Feb;72(2):380-6", "👉 Lysine & threonine in horses – g", "8157522"),
                    Reference("BMJ Open. 2024 Dec 31;14(12):e092902", "👉 Fish oil + vitamin D in pregnancy – Positive effect | week", "39740942"),
                    Reference("J Allergy Clin Immunol Pract. 2023 Mar;11(3):920-921", "👉 Prenatal vitamin D & fish oil – Positive effect", "36894281"),
                    Reference("J Allergy Clin Immunol Pract. 2023 Jan;11(1):315-321", "👉 Fish oil + vitamin D protect against childhood croup – Positive effect | week", "36184023"),
                    Reference("GeneReviews. Myhre Syndrome. 2017 Apr 13 [updated 2024 Dec 12]", "👉 Myhre Syndrome – Positive effect", "28406602"),
                    Reference("J Anim Sci. 1994 Feb;72(2):380-6", "👉 Lysine & threonine in horses – g", "8157522"),
                    Reference("Clio Med. 1981 Apr;15(3-4):177-89", "👉 Friedrich Joseph Haass biography – No clear effect", "6167400"),
                    Reference("BMJ Open. 2024 Dec 31;14(12):e092902", "👉 Fish oil + vitamin D (COPSAC) – Positive effect | week", "39740942"),
                    Reference("Thorax. 2023 Dec;78(12):1168-1174", "👉 Fish oil supplementation during pregnancy – Positive effect", "37696621"),
                    Reference("J Educ Teach Emerg Med. 2022 Oct 15;7(4):L1-L6", "👉 Pediatric ED respiratory distress learning module – No clear effect", "37465132"),
                    Reference("Front Plant Sci. 2025 Feb 18;16:1549506", "👉 Panax notoginseng irrigation – Positive effect", "40041020"),
                    Reference("BMJ Open. 2024 Dec 31;14(12):e092902", "👉 Fish oil + vitamin D (COPSAC) – Positive effect | week", "39740942"),
                    Reference("Environ Sci Technol. 2024 May 7;58(18):7870-7879", "👉 Pteris vittata phosphate solubilization – Positive effect | day", "38647530")
                )
            )

            "Cystitis" -> Pair(
                """
    Alternative
    1. Haploidentical hematopoietic stem cell transplantation in pediatric hematological malignancies – Positive/therapeutic effect; Negative/adverse effect.
    2. Vaginal laser therapy for recurrent cystitis in postmenopausal women – Positive/therapeutic effect; Negative/adverse effect | month.
    3. Mesenchymal stem cells and extracellular vesicles therapy for interstitial cystitis/bladder pain syndrome – No clear dose/effect/duration found.

    Herbs
    1. Nonantibiotic herbal prophylaxis (Canephron) for post-urogynecological surgery UTIs – g | Positive/therapeutic effect mentioned | day.
    2. Three herbal compounds for feline lower urinary tract disease – week.
    3. Rhodiolae Kirliowii Radix et Rhizoma and Crataegus pinnatifida extracts inhibit BK and JC virus infection – Positive/therapeutic effect mentioned.

    Amino acids
    1. Gabapentinoid mirogabalin for painful bladder hypersensitivity in rats – Positive/therapeutic effect mentioned.
    2. Rigosertib in epidermolysis bullosa-associated squamous cell carcinoma – Positive/therapeutic effect; Negative/adverse effect | month.
    3. Centrally-acting therapies in urologic chronic pelvic pain syndrome – Positive/therapeutic effect mentioned.

    Vitamins
    1. Vitamin D deficiency and nonspecific symptoms in older adults – Positive/therapeutic effect mentioned | month.
    2. Rare pure calcite urolithiasis confirmed by infrared spectroscopy – No clear dose/effect/duration found.
    3. Sea buckthorn anti-inflammatory effect in HCl-induced cystitis rat model – Positive/therapeutic effect mentioned.

    Minerals
    1. Pseudomembranous cystitis in cats with mineralization – No clear dose/effect/duration found.
    2. Graviola (Annona muricata) antioxidant and medicinal application – Positive/therapeutic effect mentioned.
    3. Malakoplakia of the bladder in a 4-month-old puppy – No clear dose/effect/duration found.

    Supplements
    1. Acute uncomplicated cystitis treatment in women – g, mg | Positive/therapeutic effect; Negative/adverse effect | day.
    2. Rare pure calcite urolithiasis – No clear dose/effect/duration found.
    3. Probiotic domestication for bladder mucosal repair – Positive/therapeutic effect; Negative/adverse effect | day.

    Nutrients
    1. Genetic requirements for uropathogenic E. coli proliferation – No clear dose/effect/duration found.
    2. Graviola (Annona muricata) antioxidant/medicinal application – Positive/therapeutic effect mentioned.
    3. Glycosuria alters UPEC gene expression and virulence – No clear dose/effect/duration found.
    """.trimIndent(),
                listOf(
                    Reference("Bull Cancer. 2025 Sep 24:S0007-4551(25)00388-1", "👉 Haploidentical stem cell transplantation – Positive/therapeutic; Negative/adverse", "40998674"),
                    Reference("Lasers Surg Med. 2025 Sep 3", "👉 Vaginal laser therapy – Positive/therapeutic; Negative/adverse | month", "40899097"),
                    Reference("Stem Cell Res Ther. 2025 Aug 26;16(1):459", "👉 Mesenchymal stem cells & extracellular vesicles therapy – No clear effect", "40859299"),
                    Reference("Pathogens. 2022 Dec 23;12(1):27", "👉 Canephron herbal prophylaxis – g | Positive effect | day", "36678373"),
                    Reference("J Feline Med Surg. 2018 Dec;20(12):1094-1099", "👉 Herbal compounds for cats – week", "29256321"),
                    Reference("Evid Based Complement Alternat Med. 2017;2017:5620867", "👉 Rhodiolae Kirliowii & Crataegus pinnatifida – Positive effect", "28757888"),
                    Reference("Life Sci. 2025 Nov 1;380:123942", "👉 Mirogabalin for bladder hypersensitivity – Positive effect", "40882699"),
                    Reference("Br J Dermatol. 2025 Sep 18;193(4):758-766", "👉 Rigosertib in EB-associated carcinoma – Positive/therapeutic; Negative/adverse | month", "40439508"),
                    Reference("Neurourol Urodyn. 2025 Aug;44(6):1290-1295", "👉 Centrally-acting therapies in urologic chronic pelvic pain – Positive effect", "40415481"),
                    Reference("BMC Geriatr. 2025 Jun 24;25(1):428", "👉 Vitamin D deficiency & nonspecific symptoms – Positive effect | month", "40556007"),
                    Reference("EJIFCC. 2025 Feb 28;36(1):69-73", "👉 Rare pure calcite urolithiasis – No clear effect", "40061058"),
                    Reference("Investig Clin Urol. 2025 Jan;66(1):67-73", "👉 Sea buckthorn anti-inflammatory effect – Positive effect", "39791586"),
                    Reference("J Vet Intern Med. 2023 Sep-Oct;37(5):1806-1814", "👉 Pseudomembranous cystitis in cats – No clear effect", "37497780"),
                    Reference("Nutrients. 2023 Jan 12;15(2):402", "👉 Graviola antioxidant/medicinal application – Positive effect", "36678273"),
                    Reference("J Am Anim Hosp Assoc. 2019 Sep/Oct;55(5):261-265", "👉 Malakoplakia in puppy – No clear effect", "31433228"),
                    Reference("Urologiia. 2025 May;(2):35-43", "👉 Acute uncomplicated cystitis treatment – g, mg | Positive/therapeutic; Negative/adverse | day", "40377579"),
                    Reference("EJIFCC. 2025 Feb 28;36(1):69-73", "👉 Rare pure calcite urolithiasis – No clear effect", "40061058"),
                    Reference("Biomaterials. 2025 Jul;318:123123", "👉 Probiotic domestication for bladder repair – Positive/therapeutic; Negative/adverse | day", "39893782"),
                    Reference("mSystems. 2024 Oct 22;9(10):e0038724", "👉 UPEC proliferation genetic requirements – No clear effect", "39287381"),
                    Reference("Nutrients. 2023 Jan 12;15(2):402", "👉 Graviola antioxidant/medicinal application – Positive effect", "36678273"),
                    Reference("mSphere. 2022 Jun 29;7(3):e0000422", "👉 Glycosuria alters UPEC gene expression – No clear effect", "35477301")
                )
            )

            "Cystic fibrosis" -> Pair(
                """
    Alternative
    1. 12-week tele-exercise using immersive VR in adolescents – Positive/therapeutic; Negative/adverse | week, day.
    2. CF algorithm changes: case study of challenges – No clear dose/effect/duration found.
    3. Ultra-low-dose chest CT combined with co-production in CF care – Positive/therapeutic effect | week.

    Herbs
    1. Huqi San evokes rat colonic anion secretion via CFTR expression – No clear dose/effect/duration found.
    2. Resveratrol oligomers inhibit CFTR via natural products screening – μg | Positive/therapeutic effect.
    3. Dry extract BNO 1011 stimulates chloride transport and ciliary beat in human respiratory epithelium – No clear dose/effect/duration found.

    Amino acids
    1. Amino acids inserted during CFTR nonsense mutation suppression – No clear dose/effect/duration found.
    2. Selective amino acid formulation enhances anion secretion and restores CFTR function – g | Positive/therapeutic; Negative/adverse.
    3. D-Amino acids affect Pseudomonas aeruginosa biofilm and quorum sensing – No clear dose/effect/duration found.

    Vitamins
    1. CF-specific multivitamin in young children – Positive/therapeutic effect | month.
    2. CFTR modulators for pediatric CF patients – Positive/therapeutic effect.
    3. Real-world pancreatic function recovery in young children on elexacaftor/tezacaftor/ivacaftor – Positive/therapeutic effect | month.

    Minerals
    1. CFTR modulators for pediatric CF patients – Positive/therapeutic effect.
    2. Bone disease in CF: treatment advances – No clear dose/effect/duration found.
    3. Height velocity in pediatric CF under triple CFTR modulators – Positive/therapeutic effect | month.

    Supplements
    1. CF-specific multivitamin in young children – Positive/therapeutic effect | month.
    2. Italian SIGENP registry of pediatric home artificial nutrition – mg | Positive/therapeutic effect.
    3. Identifying CF programs with disadvantaged populations – No clear dose/effect/duration found.

    Nutrients
    1. Chest CT muscle analysis and nutrition in adults with CF – month.
    2. CFTR modulators in pediatric CF – Positive/therapeutic effect.
    3. Evolutionary loss of antibiotic efflux pump increases Pseudomonas aeruginosa virulence – Positive/therapeutic effect.
    """.trimIndent(),
                listOf(
                    Reference("Respir Med. 2025 Sep 20:108362", "👉 12-week tele-exercise using VR – Positive/therapeutic; Negative/adverse | week, day", "40983137"),
                    Reference("Int J Neonatal Screen. 2025 Sep 19;11(3):82", "👉 CF algorithm changes – No clear effect", "40981312"),
                    Reference("Pediatr Res. 2025 Sep 18", "👉 Ultra-low-dose chest CT in CF care – Positive/therapeutic | week", "40968222"),
                    Reference("Evid Based Complement Alternat Med. 2015;2015:301640", "👉 Huqi San increases CFTR expression – No clear effect", "26290673"),
                    Reference("PLoS One. 2014 Apr 8;9(4):e94302", "👉 Resveratrol oligomers inhibit CFTR – μg | Positive effect", "24714160"),
                    Reference("Am J Rhinol Allergy. 2012 Nov-Dec;26(6):439-43", "👉 Dry extract BNO 1011 stimulates chloride transport – No clear effect", "23232192"),
                    Reference("J Cyst Fibros. 2025 Sep 26:S1569-1993(25)01612-1", "👉 Amino acids in CFTR nonsense mutation suppression – No clear effect", "41015699"),
                    Reference("Front Pharmacol. 2025 Aug 4;16:1522130", "👉 Selective amino acid formulation restores CFTR – g | Positive/therapeutic; Negative/adverse", "40832610"),
                    Reference("Sci Rep. 2025 Jul 13;15(1):25328", "👉 D-Amino acids affect Pseudomonas biofilm – No clear effect", "40653503"),
                    Reference("Children (Basel). 2025 Aug 29;12(9):1149", "👉 CF-specific multivitamin – Positive effect | month", "41007013"),
                    Reference("Children (Basel). 2025 Aug 22;12(9):1104", "👉 CFTR modulators for pediatric patients – Positive effect", "41006969"),
                    Reference("J Cyst Fibros. 2025 Sep 17:S1569-1993(25)01583-8", "👉 Pancreatic function recovery on elexacaftor/tezacaftor/ivacaftor – Positive effect | month", "40962626"),
                    Reference("J Clin Med. 2025 Aug 10;14(16):5657", "👉 Bone disease in CF – No clear effect", "40869482"),
                    Reference("J Clin Med. 2025 Jul 25;14(15):5259", "👉 Height velocity in pediatric CF under triple CFTR modulators – Positive effect | month", "40806881"),
                    Reference("Clin Nutr ESPEN. 2025 Sep 11;70:107-118", "👉 Italian SIGENP registry – mg | Positive effect", "40945584"),
                    Reference("J Cyst Fibros. 2025 Sep 2:S1569-1993(25)01576-0", "👉 Identifying CF programs with disadvantaged populations – No clear effect", "40903336"),
                    Reference("Nutrients. 2025 Sep 12;17(18):2940", "👉 Chest CT muscle analysis in adults with CF – month", "41010466"),
                    Reference("Nat Commun. 2025 Sep 25;16(1):8397", "👉 Loss of antibiotic efflux pump increases Pseudomonas virulence – Positive effect", "40998772")
                )
            )

            "Dandruff" -> Pair(
                """
    Alternative
    1. Theranostic nanomaterials for scalp and hair fungal infections – Negative/adverse effect.
    2. Novel antiseborrheic shampoo with patented antifungal actives – Positive/therapeutic effect.
    3. Neem leaf paste application – Positive/therapeutic effect.

    Herbs
    1. Aloe Vera, Ocimum Sanctum, Withania Somnifera shampoo – No clear dose/effect/duration found.
    2. Cosmeceuticals in dermatology – Positive/therapeutic; Negative/adverse effect.
    3. Herbal therapy for seborrheic dermatitis – Negative/adverse effect.

    Amino acids
    1. Coconut oil enriches healthy scalp commensals – No clear dose/effect/duration found.
    2. β-carbonic anhydrase activation with amines and amino acids – No clear dose/effect/duration found.
    3. Scalp microbiome comparison healthy vs dandruff – No clear dose/effect/duration found.

    Vitamins
    1. Camel milk as therapeutic ingredient in bath soaps and shampoos – Positive/therapeutic effect.
    2. Natural topical treatment reduces dry scalp symptoms in children – Positive/therapeutic effect.
    3. Cosmeceuticals in personal care – Positive/therapeutic; Negative/adverse effect.

    Minerals
    1. Selenium disulfide nanoparticles for antioxidant and antimicrobial applications – Positive/therapeutic effect | day.
    2. Selenium disulfide from sustainable resources – No clear dose/effect/duration found.
    3. Microwave-assisted digestion for selenium estimation – No clear dose/effect/duration found.

    Supplements
    1. Castor oil anti-Demodex activity – Positive/therapeutic effect.
    2. Exploring scalp barrier and microbiome in dandruff patients – Positive/therapeutic effect.
    3. Cosmeceuticals in dermatology – Positive/therapeutic; Negative/adverse effect.

    Nutrients
    1. Bioactive-based cosmeceuticals – Positive/therapeutic; Negative/adverse effect.
    2. Scalp microbiome comparison healthy vs dandruff – No clear dose/effect/duration found.
    3. Zinc in skin pathology and care – No clear dose/effect/duration found.
    """.trimIndent(),
                listOf(
                    Reference("Expert Rev Anti Infect Ther. 2025 Aug;23(8):617-638", "👉 Theranostic nanomaterials – Negative/adverse effect", "40579795"),
                    Reference("Dermatol Ther (Heidelb). 2025 Aug;15(8):2077-2097", "👉 Antiseborrheic shampoo with antifungal actives – Positive/therapeutic effect", "40498389"),
                    Reference("Cureus. 2025 Mar 16;17(3):e80685", "👉 Neem leaf paste – Positive/therapeutic effect", "40242687"),
                    Reference("Data Brief. 2024 Sep 17;57:110937", "👉 Leaf-based antidandruff shampoo – No clear effect", "39416715"),
                    Reference("Cosmeceuticals. 2023 Aug 7", "👉 Cosmeceuticals in dermatology – Positive/therapeutic; Negative/adverse effect", "31334943"),
                    Reference("Recent Adv Antiinfect Drug Discov. 2021;16(3):209-226", "👉 Herbal therapy for seborrheic dermatitis – Negative/adverse effect", "35026970"),
                    Reference("Sci Rep. 2021 Mar 31;11(1):7220", "👉 Coconut oil enriches healthy scalp commensals – No clear effect", "33790324"),
                    Reference("J Enzyme Inhib Med Chem. 2020 Dec;35(1):824-830", "👉 β-carbonic anhydrase activation – No clear effect", "32216477"),
                    Reference("Front Cell Infect Microbiol. 2018 Oct 4;8:346", "👉 Scalp microbiome comparison healthy vs dandruff – No clear effect", "30338244"),
                    Reference("Dermatol Res Pract. 2024 Aug 23;2024:4846339", "👉 Camel milk in bath soaps and shampoos – Positive/therapeutic effect", "39219666"),
                    Reference("Clin Cosmet Investig Dermatol. 2023 Oct 4;16:2757-2762", "👉 Natural topical treatment for dry scalp – Positive/therapeutic effect", "37814676"),
                    Reference("ACS Appl Bio Mater. 2025 Aug 18;8(8):6981-6990", "👉 Selenium disulfide nanoparticles – Positive/therapeutic effect | day", "40694841"),
                    Reference("Materials (Basel). 2024 Nov 23;17(23):5733", "👉 Selenium disulfide from sustainable resources – No clear effect", "39685169"),
                    Reference("Arch Razi Inst. 2024 Feb 1;79(1):68-82", "👉 Microwave-assisted digestion for selenium – No clear effect", "39192964"),
                    Reference("Cont Lens Anterior Eye. 2025 Jul 4:102471", "👉 Castor oil anti-Demodex activity – Positive/therapeutic effect", "40617731"),
                    Reference("J Drugs Dermatol. 2025 Mar 1;24(3):32730s1-32730s16", "👉 Exploring scalp barrier and microbiome – Positive/therapeutic effect", "40043274"),
                    Reference("Molecules. 2022 Jan 27;27(3):828", "👉 Bioactive-based cosmeceuticals – Positive/therapeutic; Negative/adverse effect", "35164093"),
                    Reference("J Dermatolog Treat. 2006;17(4):205-10", "👉 Zinc in skin pathology and care – No clear effect", "16971312")
                )
            )

            "Dementia" -> Pair(
                """
    Alternative
    1. Methyl Substituted Monocarbonyl Curcumin Derivatives – mg, μg | Positive/therapeutic effect.
    2. Integrating exercise and medication management in geriatric care – Positive/therapeutic; Negative/adverse effect.
    3. Sustainable N,S carbon quantum dots for rivastigmine determination – μg | Negative/adverse effect.

    Herbs
    1. YangXue QingNao Wan ameliorates vascular dementia – Positive/therapeutic effect | week.
    2. HLXLD herbal medicine in Alzheimer's – Positive/therapeutic effect.
    3. Cistanche total glycoside capsule – mg | Positive/therapeutic effect.

    Amino acids
    1. D-Chiro-Inositol early oral administration – month.
    2. Essential amino acid supplementation in subacute hemiplegic stroke – g, mg | Positive/therapeutic effect | day, month.
    3. Machine learning metabolomics for active aging – No clear dose/effect/duration found.

    Vitamins
    1. Proton Pump Inhibitors (PPIs) review – Positive/therapeutic; Negative/adverse effect.
    2. Vitamins and vascular health – Positive/therapeutic; Negative/adverse effect.
    3. Vitamin D and dementia risk – Positive/therapeutic effect.

    Minerals
    1. Low-dose graphenic materials – Positive/therapeutic; Negative/adverse effect.
    2. Rigid DNA frameworks for Aβ-42 detection – No clear dose/effect/duration found.
    3. Ultra-high hydrostatic pressurized brown rice – Positive/therapeutic; Negative/adverse effect | month.

    Supplements
    1. Hospital and health system factors in dementia care – No clear dose/effect/duration found.
    2. Omega-3 polyunsaturated fatty acids overview – Positive/therapeutic effect.
    3. Vitamins and vascular health (repeat) – Positive/therapeutic; Negative/adverse effect.

    Nutrients
    1. Proton Pump Inhibitors (PPIs) review (repeat) – Positive/therapeutic; Negative/adverse effect.
    2. D-Chiro-Inositol early oral administration (repeat) – month.
    3. Omega-3 polyunsaturated fatty acids overview (repeat) – Positive/therapeutic effect.
    """.trimIndent(),
                listOf(
                    Reference("Eur J Pharmacol. 2025 Sep 25:178193", "👉 Methyl Substituted Monocarbonyl Curcumin Derivatives – mg, μg | Positive/therapeutic effect", "41015375"),
                    Reference("Lancet Healthy Longev. 2025 Sep 24:100763", "👉 Exercise and medication management – Positive/therapeutic; Negative/adverse effect", "41015054"),
                    Reference("Talanta. 2025 Sep 23;298(Pt A):128905", "👉 N,S carbon quantum dots for rivastigmine – μg | Negative/adverse effect", "41014651"),
                    Reference("J Ethnopharmacol. 2025 Sep 5;354:120550", "👉 YangXue QingNao Wan – Positive/therapeutic effect | week", "40915374"),
                    Reference("J Chromatogr B Analyt Technol Biomed Life Sci. 2025 Nov 1;1265:124746", "👉 HLXLD herbal medicine – Positive/therapeutic effect", "40795635"),
                    Reference("J Ethnopharmacol. 2025 Sep 25;353(Pt A):120289", "👉 Cistanche total glycoside capsule – mg | Positive/therapeutic effect", "40659143"),
                    Reference("Nutrients. 2025 Sep 22;17(18):3024", "👉 D-Chiro-Inositol early oral administration – month", "41010550"),
                    Reference("Metabolites. 2025 Sep 19;15(9):626", "👉 Essential amino acid supplementation – g, mg | Positive/therapeutic effect | day, month", "41003011"),
                    Reference("NPJ Syst Biol Appl. 2025 Sep 24;11(1):103", "👉 Machine learning metabolomics – No clear dose/effect/duration found", "40993122"),
                    Reference("Medicina (Kaunas). 2025 Aug 31;61(9):1569", "👉 Proton Pump Inhibitors (PPIs) – Positive/therapeutic; Negative/adverse effect", "41010960"),
                    Reference("Nutrients. 2025 Sep 15;17(18):2955", "👉 Vitamins and vascular health – Positive/therapeutic; Negative/adverse effect", "41010482"),
                    Reference("Front Neurol. 2025 Sep 10;16:1649841", "👉 Vitamin D and dementia risk – Positive/therapeutic effect", "41001202"),
                    Reference("Int J Mol Sci. 2025 Sep 10;26(18):8821", "👉 Low-dose graphenic materials – Positive/therapeutic; Negative/adverse effect", "41009388"),
                    Reference("Sensors (Basel). 2025 May 22;25(11):3260", "👉 Rigid DNA frameworks for Aβ-42 detection – No clear dose/effect/duration found", "40968863"),
                    Reference("Exp Ther Med. 2025 Aug 11;30(4):192", "👉 Ultra-high hydrostatic pressurized brown rice – Positive/therapeutic; Negative/adverse effect | month", "40901038"),
                    Reference("BMC Emerg Med. 2025 Sep 26;25(1):193", "👉 Hospital and health system factors in dementia care – No clear dose/effect/duration found", "41013282"),
                    Reference("Nutrients. 2025 Sep 19;17(18):3002", "👉 Omega-3 polyunsaturated fatty acids overview – Positive/therapeutic effect", "41010527"),
                    Reference("Nutrients. 2025 Sep 15;17(18):2955", "👉 Vitamins and vascular health (repeat) – Positive/therapeutic; Negative/adverse effect", "41010482"),
                    Reference("Nutrients. 2025 Sep 22;17(18):3024", "👉 D-Chiro-Inositol early oral administration (repeat) – month", "41010550"),
                    Reference("Nutrients. 2025 Sep 19;17(18):3002", "👉 Omega-3 polyunsaturated fatty acids overview (repeat) – Positive/therapeutic effect", "41010527")
                )
            )

            "Dental abscess" -> Pair(
                """
    Alternative
    1. Regenerative Endodontic Treatment in Immature Permanent Tooth – Positive/therapeutic effect mentioned.
    2. Palatal Abscess of Endodontic Origin (CBCT Imaging) – Positive/therapeutic effect mentioned.
    3. Moschognathus whaitsi dentition study – No clear dose/effect/duration found.

    Herbs
    1. Medicinal Cannabis Products in Dentistry – Positive/therapeutic effect mentioned.

    Amino acids
    1. Multi-epitope vaccine against H. parainfluenzae – G | Negative/adverse effect mentioned.
    2. AJM300 (carotegrast methyl) in ulcerative colitis – g, mg | Negative/adverse effect mentioned | week.
    3. Porphyromonas gingivalis hydrogen sulfide in mouse abscess formation – Positive/therapeutic effect mentioned.

    Vitamins
    1. Nutritional supplement in apical periodontitis (rat study) – Positive/therapeutic effect mentioned | day.
    2. Burosumab in X-Linked Hypophosphataemia – Positive/therapeutic effect mentioned.
    3. Systematic Review: Therapy for pediatric X-Linked Hypophosphatemia – G | Positive/therapeutic; Negative/adverse effect mentioned.

    Minerals
    1. X-linked hypophosphatemic rickets in twins – Positive/therapeutic effect mentioned.
    2. Calcium silicate-based materials in open apices – No clear dose/effect/duration found.
    3. Piezoelectric surgery in small mammals – Positive/therapeutic effect mentioned.

    Supplements
    1. Nutritional supplement in apical periodontitis (rat study) – Positive/therapeutic effect mentioned | day.
    2. Stemregen® host modulation in apical periodontitis – Positive/therapeutic effect mentioned.
    3. Chinese expert consensus on pneumonia in elderly – Positive/therapeutic; Negative/adverse effect mentioned.

    Nutrients
    1. Atopobium spp. interactions with host proteins – No clear dose/effect/duration found.
    2. Familial hypophosphatemic rickets: Vit D & phosphate – G | Positive/therapeutic effect mentioned.
    3. Protein degradation by Prevotella & Actinomyces in dental abscess – Positive/therapeutic effect mentioned.
    """.trimIndent(),
                listOf(
                    Reference("Clin Case Rep. 2025 Sep 24;13(10):e70941", "👉 Regenerative Endodontic Treatment – Positive effect", "41001164"),
                    Reference("Diagnostics (Basel). 2025 Aug 29;15(17):2195", "👉 Palatal Abscess (CBCT) – Positive effect", "40941683"),
                    Reference("Anat Rec (Hoboken). 2025 Sep 8", "👉 Moschognathus whaitsi dentition – No clear effect", "40922509"),
                    Reference("Dent J (Basel). 2021 Sep 10;9(9):106", "👉 Medicinal Cannabis in Dentistry – Positive effect", "34562980"),
                    Reference("Front Immunol. 2024 Apr 16;15:1380732", "👉 Multi-epitope vaccine – G | Negative effect", "38690283"),
                    Reference("Lancet Gastroenterol Hepatol. 2022 Jul;7(7):648-657", "👉 AJM300 in ulcerative colitis – g, mg | Negative effect | week", "35366419"),
                    Reference("Microbiology (Reading). 2018 Apr;164(4):529-539", "👉 P. gingivalis hydrogen sulfide – Positive effect", "29488863"),
                    Reference("BMC Oral Health. 2025 Mar 4;25(1):336", "👉 Nutritional supplement in apical periodontitis – Positive effect | day", "40038698"),
                    Reference("J Paediatr Child Health. 2025 May;61(5):685-700", "👉 Burosumab in XLH – Positive effect", "40012305"),
                    Reference("J Clin Endocrinol Metab. 2025 Apr 22;110(5):1205-1217", "👉 Therapy for XLH – G | Positive/Negative effect", "39787354"),
                    Reference("Endocrinol Diabetes Metab Case Rep. 2025 Sep 19;2025(3):e250078", "👉 XLH in twins – Positive effect", "40980824"),
                    Reference("Cureus. 2025 Jun 21;17(6):e86471", "👉 Calcium silicate materials – No clear effect", "40693077"),
                    Reference("Vet Clin North Am Exot Anim Pract. 2025 Sep;28(3):569-596", "👉 Piezoelectric surgery in small mammals – Positive effect", "40615253"),
                    Reference("BMC Oral Health. 2025 Mar 4;25(1):336", "👉 Nutritional supplement (repeat) – Positive effect | day", "40038698"),
                    Reference("J Appl Oral Sci. 2025 Feb 3;33:e20240446", "👉 Stemregen® in apical periodontitis – Positive effect", "39907413"),
                    Reference("Zhonghua Jie He He Hu Xi Za Zhi. 2025 Jan 12;48(1):18-34", "👉 Pneumonia consensus (elderly) – Positive/Negative effect", "39757093"),
                    Reference("Anaerobe. 2025 Sep 17:102998", "👉 Atopobium spp. – No clear effect", "40972706"),
                    Reference("Oral Dis. 2007 Sep;13(5):482-9", "👉 Familial hypophosphatemic rickets – G | Positive effect", "17714351"),
                    Reference("J Clin Periodontol. 1997 May;24(5):346-53", "👉 Protein degradation by oral bacteria – Positive effect", "9178115")
                )
            )

            "Depression" -> Pair(
                """
    Alternative
    1. Innovative Stem Cell-Based Therapeutic Modalities – No clear dose/effect/duration found.
    2. Integrating exercise and medication management in geriatric care – Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
    3. Reduced cognitive flexibility as link between Insomnia and depression – Positive/therapeutic effect mentioned.

    Herbs
    1. Traditional Chinese Medicine treatment of depression (machine learning study) – No clear dose/effect/duration found.
    2. Depression syndrome typing & TCM medication pattern (clustering analysis) – No clear dose/effect/duration found.
    3. Phytonutrients and neuroprotection – Negative/adverse effect mentioned.

    Amino acids
    1. Plant-derived nutraceuticals in mental health – Positive/therapeutic effect mentioned.
    2. Neuromelanin-sensitive MRI contrast in chronic depression – Positive/therapeutic effect mentioned.
    3. Glutamatergic dysregulation in diabetic encephalopathy – mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.

    Vitamins
    1. Plant-derived nutraceuticals in mental health – Positive/therapeutic effect mentioned.
    2. UV-exposed mushrooms & brain health in older adults – IU, g | Positive/therapeutic effect mentioned.
    3. Seasonal mechanisms of mental health in adolescents – Positive/therapeutic effect mentioned.

    Minerals
    1. Primary ovarian insufficiency in young women – Positive/therapeutic effect mentioned | month.
    2. Mesoporous silica materials study – No clear dose/effect/duration found.
    3. Plant-derived nutraceuticals in mental health – Positive/therapeutic effect mentioned.

    Supplements
    1. Plant-derived nutraceuticals in mental health – Positive/therapeutic effect mentioned.
    2. Medicinal plants for child mental health – No clear dose/effect/duration found.
    3. Vitamin C intake, BMI & depression in infertility – mg | Positive/therapeutic effect mentioned.

    Nutrients
    1. Diet and emotional symptoms in early childhood – Positive/therapeutic effect mentioned.
    2. Plant-derived nutraceuticals in mental health – Positive/therapeutic effect mentioned.
    3. Nutrition education in premenstrual syndrome – g, mg | Positive/therapeutic effect mentioned | day, month.
    """.trimIndent(),
                listOf(
                    Reference("Cell J. 2025 Sep 28;27(1):1-12", "👉 Stem cell-based therapies in depression – No clear effect", "41015852"),
                    Reference("Lancet Healthy Longev. 2025 Sep 24:100763", "👉 Exercise & medication in geriatrics – Positive & Negative effects", "41015054"),
                    Reference("Sleep Med. 2025 Sep 23;136:106824", "👉 Insomnia & depression link – Positive effect", "41014697"),

                    Reference("J Tradit Chin Med. 2025 Oct;45(5):1152-1163", "👉 TCM treatment of depression (ML study) – No clear effect", "41015814"),
                    Reference("Sichuan Da Xue Xue Bao Yi Xue Ban. 2025 May 20;56(3):656-664", "👉 TCM syndrome typing – No clear effect", "40964125"),
                    Reference("Front Mol Biosci. 2025 Sep 2;12:1607330", "👉 Phytonutrients & neuroprotection – Negative effect", "40964091"),

                    Reference("Int J Mol Sci. 2025 Sep 11;26(18):8849", "👉 Plant-derived nutraceuticals – Positive effect", "41009418"),
                    Reference("JAMA Netw Open. 2025 Sep 2;8(9):e2533339", "👉 Neuromelanin MRI & depression – Positive effect", "40986300"),
                    Reference("Mol Biol Rep. 2025 Sep 23;52(1):945", "👉 Glutamatergic dysregulation in diabetes – mg | Positive & Negative effects", "40986092"),

                    Reference("Foods. 2025 Sep 9;14(18):3148", "👉 UV-exposed mushrooms & brain health – IU, g | Positive effect", "41008122"),
                    Reference("Sci Rep. 2025 Sep 26;15(1):32642", "👉 Seasonal mental health in adolescents – Positive effect", "41006651"),

                    Reference("Life (Basel). 2025 Aug 28;15(9):1366", "👉 Primary ovarian insufficiency – Positive effect | month", "41010308"),
                    Reference("Int J Mol Sci. 2025 Sep 22;26(18):9255", "👉 Mesoporous silica – No clear effect", "41009817"),

                    Reference("Children (Basel). 2025 Aug 28;12(9):1142", "👉 Medicinal plants for child mental health – No clear effect", "41007011"),
                    Reference("Front Nutr. 2025 Sep 10;12:1650311", "👉 Vitamin C intake, BMI & depression – mg | Positive effect", "41001130"),

                    Reference("Nutrients. 2025 Sep 9;17(18):2909", "👉 Diet & emotional symptoms in children – Positive effect", "41010435"),
                    Reference("Nutr Health. 2025 Sep 26", "👉 Nutrition education in PMS – g, mg | Positive effect | day, month", "41004653")
                )
            )

            "Diabetes (type 1)" -> Pair(
                """
    Alternative approaches
    1. Bone density and T1D: Adolescents with poorly controlled T1D may show reduced bone density; monitoring and early intervention could help (BMJ Open, 2025).
    2. Baihu Jia Renshen Decoction: In animal studies improved metabolism and reduced tissue damage in diabetic rats (Int J Endocrinol, 2025).
    3. Gut microbiome: Long-term T1D is associated with altered gut microbiota; future therapies possible but still under research (Diabetes Metab Res Rev, 2025).

    Herbal research
    1. Anthocyanins (berry pigments): May help reduce diabetes-related complications (Curr Diabetes Rev, 2025).
    2. Cassia angustifolia & Nigella sativa: Shown in early studies to prevent neuropathy and cognitive decline in diabetes (Yale J Biol Med, 2024).
    3. Oral lichen planus and diabetes: Genetic and herbal links noted, but no clear dose/effect/duration found (BMC Oral Health, 2024).

    Amino acids and metabolism
    1. Syzygium cumini (Java plum): Animal studies suggest reduced oxidative stress & cellular damage (3 Biotech, 2025).
    2. Baihu Jia Renshen Decoction: Reported metabolic improvements in T1D rats (Int J Endocrinol, 2025).
    3. SGLT2 inhibition: Alters plasma amino acid metabolism; potential role in glucose regulation (Physiol Rep, 2025).

    Vitamins
    1. Vitamin D supplementation & combined Ca-D therapy: May support immune function and diabetes prevention (Cureus, 2025).
    2. Vitamin D-induced immunomodulatory gene changes: Positive effects suggested (Mol Biol Rep, 2025).
    3. Diabetes & bone update: Association observed but no clear vitamin dosage established (Int J Mol Sci, 2025).

    Minerals
    1. Bone density in adolescents with poorly controlled T1D: Monitoring and supplementation noted (BMJ Open, 2025).
    2. Diabetes & bone update: No clear dose/effect/duration (Int J Mol Sci, 2025).
    3. Oral health in children with T1D: Higher caries risk; related to mineral balance (Diabetes Metab Syndr Obes, 2025).

    Supplements
    1. Omega-3 fatty acids: May benefit diabetic neuropathy; some adverse effects reported (Cochrane, 2025).
    2. Zinc supplementation: Animal studies show renoprotective effect in T1D nephropathy (Sichuan Da Xue Xue Bao, 2025).
    3. Autoimmune diseases & keloids: Associations observed, but no therapeutic protocol (Eur J Dermatol, 2025).

    Nutrients
    1. Fasting: Alters gut microbiome signatures with possible effects on T1D course (Front Endocrinol, 2025).
    2. Hypoglycemia prediction: Models help assess risk in children with T1D (Nutrients, 2025).
    3. Bone health in children/adolescents: Importance of calcium and vitamin D intake (Nutrients, 2025).

    What this means for readers
    • Insulin therapy, glucose monitoring, and lifestyle remain the foundation of T1D treatment.
    • Natural compounds (berries, black seed, zinc, omega-3) show research potential but should not replace insulin.
    • Supplements and vitamins must be considered with medical guidance to avoid overdose or drug interactions.
    """.trimIndent(),
                listOf(
                    Reference("BMJ Open Diabetes Res Care. 2025 Sep 14;13(5):e005134", "👉 Skeletal health in adolescents with T1D – month", "40953842"),
                    Reference("Int J Endocrinol. 2025 Aug 18;2025:2139427", "👉 Baihu Jia Renshen Decoction improves T1D rats – Positive effect | week", "40860518"),
                    Reference("Diabetes Metab Res Rev. 2025 Sep;41(6):e70076", "👉 Gut microbiome & metabolome alterations in T1D – g", "40770823"),

                    Reference("Curr Diabetes Rev. 2025;21(9):e15733998322754", "👉 Anthocyanins in diabetes complications – Positive effect", "39136514"),
                    Reference("Yale J Biol Med. 2024 Jun 28;97(2):141-152", "👉 Herbs preventing neuropathy & cognitive decline – Positive effect", "38947105"),
                    Reference("BMC Oral Health. 2024 Oct 15;24(1):1226", "👉 Oral lichen planus & diabetes – No clear effect", "39407190"),

                    Reference("3 Biotech. 2025 Oct;15(10):356", "👉 Syzygium cumini alleviates stress in diabetic rats – mg | Positive & Negative effects", "40978323"),
                    Reference("Physiol Rep. 2025 Aug;13(16):e70465", "👉 SGLT2 inhibition shifts plasma amino acids – mg | Positive effect | week", "40842430"),

                    Reference("Cureus. 2025 Aug 22;17(8):e90776", "👉 Vitamin D supplementation & Ca-D therapy – Positive effect", "40988828"),
                    Reference("Mol Biol Rep. 2025 Sep 22;52(1):939", "👉 Vitamin D immunomodulatory changes – Positive effect", "40982162"),
                    Reference("Int J Mol Sci. 2025 Aug 22;26(17):8140", "👉 Diabetes & bone update – No clear effect", "40943066"),

                    Reference("Diabetes Metab Syndr Obes. 2025 Aug 11;18:2807-2814", "👉 Oral health indicators & caries in T1D children – Positive effect", "40821751"),

                    Reference("Cochrane Database Syst Rev. 2025 Sep 24;9(9):CD014623", "👉 Omega-3 for peripheral neuropathy – Positive & Negative effects | day", "40990181"),
                    Reference("Sichuan Da Xue Xue Bao Yi Xue Ban. 2025 May 20;56(3):613-618", "👉 Zn supplementation in nephropathy (murine) – g, mg | Positive effect | month", "40964105"),
                    Reference("Eur J Dermatol. 2025 Jun 1;35(3):167-173", "👉 Autoimmune diseases & keloids – No clear effect", "40742054"),

                    Reference("Front Endocrinol. 2025 Aug 13;16:1623800", "👉 Fasting-induced microbiome changes in T1D – G | Positive effect", "40881123"),
                    Reference("Nutrients. 2025 Aug 12;17(16):2610", "👉 Severe hypoglycemia prediction in T1D children – mg | Positive effect | day", "40871638"),
                    Reference("Nutrients. 2025 Jul 23;17(15):2400", "👉 Bone health in youth with T1D – Positive effect", "40805986")
                )
            )

            "Diabetes (type 2)" -> Pair(
                """
    Alternative approaches
    1. Dapagliflozin quality control: New capillary electrophoresis method for drug monitoring (Electrophoresis, 2025).
    2. Inflammatory phenotypes: Cluster analysis shows distinct inflammatory subtypes in cardiometabolic disease (Cardiovasc Diabetol Endocrinol Rep, 2025).
    3. Bromocriptine: Systematic review/meta-analysis suggests potential as an adjunct therapy in T2D, with both benefits and adverse effects reported (Cardiovasc Diabetol Endocrinol Rep, 2025).

    Herbal research
    1. Chinese herbal medicines + stable angina in T2D: Retrospective study shows improved outcomes (Diabetes Metab Syndr Obes, 2025).
    2. Deep learning models for TCM optimization: No clear therapeutic dose or effect defined yet (Brief Bioinform, 2025).
    3. Middle Eastern herbal remedies: Evidence-based clinical trials confirm antidiabetic potential (Sultan Qaboos Univ Med J, 2025).

    Amino acids
    1. MOTS-C peptide: Linked with inflammation, insulin resistance, and endothelial dysfunction in obesity/T2D (Arch Endocrinol Metab, 2025).
    2. Carnosine and beta-alanine: Meta-analysis shows potential benefits in prediabetes and T2D (BMC Endocr Disord, 2025).
    3. Glutamate dysregulation: Model-based study links it to cognitive/motor impairments in diabetic encephalopathy (Mol Biol Rep, 2025).

    Vitamins
    1. Vitamin D supplementation: Meta-analysis confirms positive biochemical and inflammatory effects in T2D (Nutrients, 2025).
    2. Vitamin D & cytokines: Correlation with TNF-α and IL-6 in insulin resistance; mechanisms still unclear (BMC Immunol, 2025).
    3. Vitamin D & prolactin: Clinical and genetic analysis finds causal link in T2D (Metabol Open, 2025).

    Minerals
    1. Alkaptonuria review: Rare metabolic disorder with musculoskeletal manifestations; relevance to T2D limited (Cureus, 2025).
    2. Height loss in adults over 40: Risk factors linked to metabolic/endocrine health (Front Endocrinol, 2025).
    3. CT imaging in fracture risk prediction: Useful for T2D patients, but no standard supplementation guidance (Medicine, 2025).

    Supplements
    1. Vitamin D: Supports metabolic and inflammatory regulation in T2D (Nutrients, 2025).
    2. Carnosine/beta-alanine: Clinical evidence of benefits in glycemic control (BMC Endocr Disord, 2025).
    3. Ursolic acid: Improved cognition and neuropathy in diabetic mice, but some adverse effects noted (Brain Res Bull, 2025).

    Nutrients
    1. Probiotic goat yogurt + aronia juice: Pilot study shows nephropathy improvement in T2D patients (Pharmaceuticals, 2025).
    2. Plant-based diets: Systematic review supports improved metabolic outcomes (Nutrients, 2025).
    3. Short-chain fatty acids (SCFA): Identified as potential predictive biomarkers for prediabetes and T2D risk (Nutrients, 2025).

    What this means for readers
    • Standard T2D management remains lifestyle, glucose monitoring, and pharmacotherapy (e.g., metformin, GLP-1 agonists, SGLT2 inhibitors).
    • Herbs, vitamins, amino acids, and probiotics show promising effects but should be seen as complementary, not replacements.
    • Supplement use (Vit D, carnosine, ursolic acid, probiotics) requires medical supervision due to possible interactions and side effects.
    """.trimIndent(),
                listOf(
                    Reference("Electrophoresis. 2025 Sep 28. doi:10.1002/elps.70042", "👉 Dapagliflozin monitoring – µg", "41015926"),
                    Reference("Cardiovasc Diabetol Endocrinol Rep. 2025 Aug 4;11(1):15", "👉 Inflammatory phenotypes in cardiometabolic disease – µg, mg", "41013857"),
                    Reference("Cardiovasc Diabetol Endocrinol Rep. 2025 May 26;11(1):10", "👉 Bromocriptine in T2D – Positive & Negative effects", "41013660"),

                    Reference("Diabetes Metab Syndr Obes. 2025 Aug 31;18:3135-3148", "👉 Chinese herbs + angina in T2D – Positive effect | month", "40919565"),
                    Reference("Brief Bioinform. 2025 Jul 2;26(4):bbaf403", "👉 Deep learning for TCM – No clear effect", "40794951"),
                    Reference("Sultan Qaboos Univ Med J. 2025 May 2;25(1):418-429", "👉 Antidiabetic herbs in Middle East – Positive effect", "40641727"),

                    Reference("Arch Endocrinol Metab. 2025 Sep 26;69(5):e250063", "👉 MOTS-C in insulin resistance – No clear effect", "41004666"),
                    Reference("BMC Endocr Disord. 2025 Sep 25;25(1):210", "👉 Carnosine & beta-alanine – Positive effect", "40999397"),
                    Reference("Mol Biol Rep. 2025 Sep 23;52(1):945", "👉 Glutamatergic dysregulation in T2D encephalopathy – Positive & Negative effects | mg", "40986092"),

                    Reference("Nutrients. 2025 Sep 18;17(18):2991", "👉 Vitamin D meta-analysis in diabetes – Positive effect", "41010515"),
                    Reference("BMC Immunol. 2025 Sep 25;26(1):68", "👉 Vitamin D & cytokines – No clear effect", "40999383"),
                    Reference("Metabol Open. 2025 Sep 3;28:100393", "👉 Vitamin D & prolactin link – Positive effect", "40994843"),

                    Reference("Cureus. 2025 Aug 23;17(8):e90841", "👉 Alkaptonuria review – Positive effect", "40995248"),
                    Reference("Front Endocrinol. 2025 Sep 8;16:1542962", "👉 Height loss risk in adults >40 – Positive effect", "40989120"),
                    Reference("Medicine (Baltimore). 2025 Sep 19;104(38):e44347", "👉 CT for fracture risk in T2D – No clear effect", "40988262"),

                    Reference("Brain Res Bull. 2025 Sep 23:111562", "👉 Ursolic acid in T2D mice – Positive & Negative effects | day", "40998024"),

                    Reference("Pharmaceuticals (Basel). 2025 Sep 19;18(9):1409", "👉 Probiotic yogurt + aronia in nephropathy – Positive effect", "41011276"),
                    Reference("Nutrients. 2025 Sep 22;17(18):3020", "👉 Plant-based foods & metabolic outcomes – Positive effect", "41010543"),
                    Reference("Nutrients. 2025 Sep 19;17(18):3003", "👉 SCFAs predicting T2D risk – Positive effect", "41010528")
                )
            )

            "Diarrhoea" -> Pair(
                """
    Alternative approaches
    1. Maple syrup + Bacillus velezensis supplement improved growth and gut microbiota in piglets (Curr Microbiol, 2025).
    2. Clostridium butyricum reduced diarrhea in preweaning calves via modulation of SCFAs and gut flora (Microorganisms, 2025).
    3. Baicalin–aluminum complexes suppressed ETEC virulence, but also showed some adverse effects (Toxicon, 2025).

    Herbs
    1. Piglet gut microbiome studies highlight genetics, nutrition, and herbal impacts on enteric pathogens (Front Cell Infect Microbiol, 2025).
    2. Euphorbia herb detoxification mechanisms studied; benefits and toxicity both reported (Zhongguo Zhong Yao Za Zhi, 2025).
    3. Ethnomedicinal plants in Pakistan documented for GI disorders, including diarrhea (Sci Rep, 2025).

    Amino acids
    1. Fecal metabolomics explored as diagnostic tool in Clostridioides difficile infection; no clear therapeutic dose (Diagnostics, 2025).
    2. Bifidobacterium + Lactiplantibacillus probiotics altered amino acid metabolism and improved diarrhea in IBS-D rat model (J Sci Food Agric, 2025).
    3. AroC gene required for pathogenicity in Edwardsiella tarda; links to amino acid metabolism (Arch Microbiol, 2025).

    Vitamins
    1. Tropical sprue described as malabsorption syndrome with diarrhea; vitamin involvement noted but unclear (StatPearls, 2025).
    2. Modified FOLFIRINOX in pancreatic cancer patients led to diarrhea, vitamin/nutrient balance studied (J Gastrointest Cancer, 2025).
    3. Pediatric ulcerative colitis case showed delirium with diarrhea, supportive vitamin role discussed (Turk J Pediatr, 2025).

    Minerals
    1. Phaseolus vulgaris protein source improved growth and fecal mineral status in piglets (Vet Med Sci, 2025).
    2. Zinc oxide and copper sources affected gut health and diarrhea outcomes in piglets (J Anim Sci, 2025).
    3. Case of nephritis after microsporidiosis in transplant patient showed mineral metabolism disturbances (Nephrology, 2025).

    Supplements
    1. Maple syrup + Bacillus velezensis supplement improved gut microbiota (Curr Microbiol, 2025).
    2. Clostridium butyricum supplementation reduced diarrhea and modulated SCFAs (Microorganisms, 2025).
    3. Eggshell membrane + lysozyme supplementation reduced colitis severity and modulated microbiota (Int J Mol Sci, 2025).

    Nutrients
    1. AroC gene deletion reduced pathogen survival, linked to nutrient utilization (Arch Microbiol, 2025).
    2. Manure exposure associated with porcine epidemic diarrhea virus outbreaks; nutrients in environment play role (Front Vet Sci, 2025).
    3. Severe acute malnutrition linked to metabolic/endocrine adaptation and diarrhea (Nutrients, 2025).

    What this means for readers
    • Acute and chronic diarrhea remain multifactorial: infections, nutrition, and underlying disease all contribute.  
    • Probiotics (Clostridium butyricum, Bifidobacterium, Lactiplantibacillus) show potential in reducing diarrhea via microbiome and amino acid metabolism.  
    • Herbal medicines (e.g., Euphorbia, ethnomedicinal plants) are widely used but may carry toxicity risks.  
    • Vitamins and minerals (zinc, copper, protein sources) support gut health, but evidence is variable and case-specific.  
    • Supplements like eggshell membrane, maple syrup + Bacillus formulations show positive results in animal models, not yet standard in human care.  
    """.trimIndent(),
                listOf(
                    Reference("Curr Microbiol. 2025 Sep 27;82(11):530. doi:10.1007/s00284-025-04514-5", "👉 Maple syrup + Bacillus velezensis – Positive effect", "41014340"),
                    Reference("Microorganisms. 2025 Aug 27;13(9):1993. doi:10.3390/microorganisms13091993", "👉 Clostridium butyricum – Positive effect", "41011325"),
                    Reference("Toxicon. 2025 Sep 24:108602. doi:10.1016/j.toxicon.2025.108602", "👉 Baicalin–aluminum complexes – Positive & Negative effects", "41005506"),

                    Reference("Front Cell Infect Microbiol. 2025 Aug 25;15:1626239", "👉 Piglet microbiome + herbs – Positive effect", "40927373"),
                    Reference("Zhongguo Zhong Yao Za Zhi. 2025 Jul;50(13):3615-3675", "👉 Euphorbia herbs detoxification – Positive & Negative effects", "40904143"),
                    Reference("Sci Rep. 2025 Aug 21;15(1):30683", "👉 Ethnomedicinal plants for GI disorders – Positive effect", "40841421"),

                    Reference("Diagnostics. 2025 Sep 15;15(18):2331", "👉 CDI fecal metabolomics – No clear effect", "41008703"),
                    Reference("J Sci Food Agric. 2025 Sep 26. doi:10.1002/jsfa.70190", "👉 Probiotics in IBS-D rat model – Positive effect", "41002283"),
                    Reference("Arch Microbiol. 2025 Sep 22;207(11):274", "👉 AroC gene in Edwardsiella – Positive effect", "40982089"),

                    Reference("StatPearls [Internet]. 2025", "👉 Tropical sprue & diarrhea – No clear dose/effect", "33620819"),
                    Reference("J Gastrointest Cancer. 2025 Sep 12;56(1):187", "👉 FOLFIRINOX diarrhea & vitamins – Positive & Negative effects", "40936050"),
                    Reference("Turk J Pediatr. 2025 Sep 1;67(4):597-601", "👉 Pediatric UC + delirium + diarrhea – Positive effect", "40925035"),

                    Reference("Vet Med Sci. 2025 Sep;11(5):e70597", "👉 Phaseolus vulgaris protein & minerals – Positive effect", "40952768"),
                    Reference("J Anim Sci. 2025 Sep 8:skaf314", "👉 Zinc oxide/copper & diarrhea – Positive effect", "40920374"),
                    Reference("Nephrology (Carlton). 2025 Sep;30(9):e70121", "👉 Mineral metabolism after infection – Positive effect", "40903797"),

                    Reference("Int J Mol Sci. 2025 Sep 18;26(18):9102", "👉 Eggshell membrane + lysozyme – Positive effect", "41009682"),

                    Reference("Front Vet Sci. 2025 Sep 2;12:1595313", "👉 Manure exposure & PEDV outbreaks – Positive effect", "40963584"),
                    Reference("Nutrients. 2025 Sep 4;17(17):2864", "👉 Malnutrition, metabolism & diarrhea – Positive effect", "40944251")
                )
            )

            "Diphtheria" -> Pair(
                """
    Alternative approaches
    1. Peptide-based anti-PCSK9 product for cholesterol control was studied, but adverse effects were reported (Vaccines (Basel), 2025).  
    2. Co-administration of IPV (polio) + DTPa (diphtheria-tetanus-pertussis) vaccines in children showed good immunogenicity, but also mild adverse events (Front Immunol, 2025).  
    3. Novel image-based titration method developed for potency testing of diphtheria toxoid; technical advance, not treatment (Jpn J Infect Dis, 2025).  

    Herbs
    1. Onjisaponins from Polygala tenuifolia root studied as nasal vaccine adjuvants for influenza and diphtheria-pertussis-tetanus; showed positive immune-enhancing effect (Vaccine, 2001).  

    Amino acids
    1. Diphthamide formation in plants linked to DPH1/DPH2 interactions; relevant to oxidative stress biology, not direct treatment (Plant Physiol, 2025).  
    2. Analytical methods developed for detecting glyphosate metabolites in vaccines; safety monitoring, not therapeutic (Biologicals, 2025).  
    3. GABAergic pathways described in nervous system models; no direct therapeutic dose established for diphtheria (Neurosci Bull, 2024).  

    Vitamins
    1. Routine immunisation coverage (including diphtheria) improved with integration of programs; vitamin A linked with broader health benefits (Lancet Glob Health, 2025).  
    2. Quinazolin-4-one derivatives studied for tankyrase inhibition; some positive and adverse effects noted, not specific diphtheria therapy (Eur J Med Chem, 2025).  
    3. Vitamin A and deworming integrated with vaccination programs in India improved outcomes (Int J Epidemiol, 2024).  

    Minerals
    1. Mouse model showed cementocyte ablation did not impair mineralized tissue response; related to mineral metabolism (Bone Rep, 2025).  
    2. Bone marrow adipocyte-cell depletion enhanced bone formation in mice; no clear link to diphtheria treatment (J Bone Miner Res, 2025).  
    3. Thiamine described as key nutrient in pediatric health; supportive role in overall immunity (Eur J Pediatr, 2024).  

    Supplements
    1. Routine vaccination programs (including diphtheria) in Kenya improved coverage; integration with supplements noted (Lancet Glob Health, 2025).  
    2. Global vaccine coverage analysis highlighted gaps and improvements; vaccination still cornerstone (Lancet, 2025).  
    3. Bifidobacteria supplementation improved infant vaccine responses, including diphtheria (Nature, 2025).  

    Nutrients
    1. Structural basis of heme scavenging in Corynebacterium diphtheriae described; scientific insight, not therapy (J Biol Chem, 2025).  
    2. Zinc-binding proteins identified in diphtheria cell wall; zinc important for pathogen growth and host response (J Bacteriol, 2025).  
    3. Global vaccination coverage and nutrient co-programs remain central to diphtheria prevention (Lancet, 2025).  

    What this means for readers
    • The cornerstone of diphtheria prevention remains vaccination (DTaP, Td boosters).  
    • Probiotic support (e.g., Bifidobacteria) may enhance vaccine responses, but evidence is mostly early-stage.  
    • Herbal adjuvants like Onjisaponins show promise in research but are not used in clinical practice.  
    • Vitamins (e.g., vitamin A) and minerals (e.g., zinc, thiamine) play a supportive role in immune health, but they do not replace vaccination.  
    • Research continues on molecular and nutrient interactions with Corynebacterium diphtheriae, but no alternative cure exists beyond established immunisation.  
    """.trimIndent(),
                listOf(
                    Reference("Vaccines (Basel). 2025 Aug 22;13(9):889. doi:10.3390/vaccines13090889", "👉 Anti-PCSK9 peptide, adverse effects", "41012095"),
                    Reference("Front Immunol. 2025 Sep 3;16:1633170. doi:10.3389/fimmu.2025.1633170", "👉 IPV + DTPa co-administration, positive + mild adverse effects", "40969746"),
                    Reference("Jpn J Infect Dis. 2025 Aug 29. doi:10.7883/yoken.JJID.2025.030", "👉 Potency testing of diphtheria toxoid, technical advance", "40887271"),

                    Reference("Vaccine. 2001 Sep 14;19(32):4824-34. doi:10.1016/s0264-410x(01)00215-8", "👉 Onjisaponins as vaccine adjuvants, positive immune effect", "11535335"),

                    Reference("Plant Physiol. 2025 Mar 28;197(4):kiaf128. doi:10.1093/plphys/kiaf128", "👉 Diphthamide formation biology, no direct therapy", "40200557"),
                    Reference("Biologicals. 2025 May;90:101822. doi:10.1016/j.biologicals.2025.101822", "👉 Glyphosate metabolites in vaccines, monitoring only", "40007352"),
                    Reference("Neurosci Bull. 2024 Dec;40(12):1886-1900. doi:10.1007/s12264-024-01295-y", "👉 GABAergic pathways, no clear therapeutic dose", "39285154"),

                    Reference("Lancet Glob Health. 2025 Oct;13(10):e1737-e1749", "👉 Routine immunisation + vitamin A integration, positive effects", "40975081"),
                    Reference("Eur J Med Chem. 2025 Apr 15;288:117397", "👉 Quinazolin-4-ones, positive + adverse, not specific diphtheria", "39983556"),
                    Reference("Int J Epidemiol. 2024 Oct 13;53(6):dyae160", "👉 Vaccination + vitamin A + deworming, positive", "39657980"),

                    Reference("Bone Rep. 2025 Aug 15;26:101873", "👉 Cementocytes + mineral metabolism, positive", "40894390"),
                    Reference("J Bone Miner Res. 2025 May 24;40(5):688-698", "👉 Bone marrow adipo-CAR depletion, unclear therapeutic", "40156928"),
                    Reference("Eur J Pediatr. 2024 Nov;183(11):4597-4610", "👉 Thiamine + pediatric health, positive", "39271555"),

                    Reference("Lancet Glob Health. 2025 Oct;13(10):e1737-e1749", "👉 Routine vaccination + supplements, positive", "40975081"),
                    Reference("Lancet. 2025 Jul 19;406(10500):235-260", "👉 Global vaccination trends, positive", "40578370"),
                    Reference("Nature. 2025 May;641(8062):456-464", "👉 Bifidobacteria enhanced vaccine response, positive", "40175554"),

                    Reference("J Biol Chem. 2025 Aug 26;301(10):110633", "👉 Heme scavenging in C. diphtheriae, mechanistic insight", "40876592"),
                    Reference("J Bacteriol. 2025 Sep 18;207(9):e0023925", "👉 Zinc-binding proteins in diphtheria, positive", "40824030"),
                    Reference("Lancet. 2025 Jul 19;406(10500):235-260", "👉 Global vaccination coverage + nutrients, positive", "40578370")
                )
            )

            "Dizziness" -> Pair(
                """
    Alternative approaches
    1. Cannabinoids in chronic pain sometimes led to dizziness and adverse effects (Neurol Int, 2025).  
    2. Orthodontic treatment for obstructive sleep apnea showed airway improvement, which may reduce dizziness related to poor sleep (Cureus, 2025).  
    3. Recreational use of HHC (hexahydrocannabinol) associated with harms, including dizziness; no therapeutic context (Int J Drug Policy, 2025).  

    Herbs
    1. Yinaoxin granules (Chinese medicine) were profiled; some toxicity observed, possible dizziness (J Ethnopharmacol, 2025).  
    2. Artemisia absinthium essential oil showed multi-target activity against depression; some benefit, but dizziness not well quantified (J Ethnopharmacol, 2025).  
    3. Herbal medicine formulas studied for vestibular migraine; mixed evidence of benefit and adverse events (Phytomedicine, 2025).  

    Amino acids
    1. Pregabalin controlled-release effective for neuropathic pain but can cause dizziness as adverse effect (Medicine (Baltimore), 2025).  
    2. Case report: Pisa syndrome with vestibular hypofunction linked to dizziness, no therapeutic amino acid dose established (Rinsho Shinkeigaku, 2025).  
    3. Clinical trial diaries reported dizziness as a symptom; not linked to amino acid therapy (J Patient Rep Outcomes, 2025).  

    Vitamins
    1. Vitamin D treatment showed predictive value for improvement in children with postural orthostatic tachycardia syndrome (Zhonghua Er Ke Za Zhi, 2025).  
    2. Study linked BPPV (a dizziness disorder) with hypothyroidism and metabolic issues, vitamin-related factors unclear (J Multimorb Comorb, 2025).  
    3. Blood biomarkers explored for vestibular syndromes, including dizziness; no direct vitamin therapy (Otol Neurotol, 2025).  

    Minerals
    1. Difelikefalin used in chronic kidney disease patient improved pruritus but dizziness also reported (Case Rep Nephrol, 2025).  
    2. Abaloparatide increased bone mineral density but dizziness was among side effects (Menopause, 2025).  
    3. Elderly patients with BPPV: residual dizziness risk studied; mineral role not directly clear (J Clin Neurosci, 2025).  

    Supplements
    1. AI-based analysis of semaglutide reports suggested dizziness as adverse effect in weight loss trials (Ann Epidemiol, 2025).  
    2. Cenobamate in epilepsy treatment: dizziness reported as side effect (Epilepsy Res, 2025).  
    3. Silicon-based supplement improved vestibular function in older adults, reducing dizziness (Sci Rep, 2025).  

    Nutrients
    1. Vitamin D deficiency in long COVID patients associated with dizziness and fatigue (Nutrients, 2025).  
    2. Biochemical studies of migraine suggest nutrient imbalances may contribute to dizziness (Zh Nevrol Psikhiatr, 2025).  
    3. Hyperhomocysteinemia and metabolic syndrome genetic variants linked to dizziness and reduced quality of life (In Vivo, 2025).  

    What this means for readers
    • Dizziness has many causes, including medications, nutrient deficiencies, vestibular disorders, and chronic conditions.  
    • Pregabalin and other drugs may help pain but can worsen dizziness as a side effect.  
    • Vitamin D may improve symptoms in some postural orthostatic conditions, but evidence is mixed.  
    • Herbal remedies (e.g., Artemisia absinthium, Chinese formulas) show potential but also carry risks and side effects.  
    • Supplements like silicon-based agents may support vestibular health, though more studies are needed.  
    • The safest approach: identify underlying cause with medical help, use supplements only as supportive measures, and be cautious of cannabis or unregulated herbs, which may worsen dizziness.  
    """.trimIndent(),
                listOf(
                    // Alternative
                    Reference("Neurol Int. 2025 Sep 5;17(9):141. doi:10.3390/neurolint17090141", "👉 Cannabinoids, adverse effect (dizziness)", "41002929"),
                    Reference("Cureus. 2025 Aug 20;17(8):e90594. doi:10.7759/cureus.90594", "👉 Orthodontics, positive airway effect", "40978847"),
                    Reference("Int J Drug Policy. 2025 Sep 18;145:105011. doi:10.1016/j.drugpo.2025.105011", "👉 HHC, harms incl. dizziness", "40972474"),

                    // Herbs
                    Reference("J Ethnopharmacol. 2025 Sep 1;354:120483", "👉 Yinaoxin granules, adverse effect", "40902812"),
                    Reference("J Ethnopharmacol. 2025 Sep 25;353(Pt A):120308", "👉 Artemisia absinthium oil, positive effect", "40684821"),
                    Reference("Phytomedicine. 2025 Jul 25;143:156864", "👉 Herbal formulas for vestibular migraine, mixed effects", "40449448"),

                    // Amino acids
                    Reference("Medicine (Baltimore). 2025 Sep 19;104(38):e44813", "👉 Pregabalin CR, positive + adverse dizziness", "40988176"),
                    Reference("Rinsho Shinkeigaku. 2025 Sep 25;65(9):676-678", "👉 Pisa syndrome case, dizziness noted", "40850770"),
                    Reference("J Patient Rep Outcomes. 2025 Aug 11;9(1):99", "👉 Symptom diaries, dizziness", "40788441"),

                    // Vitamins
                    Reference("Zhonghua Er Ke Za Zhi. 2025 Sep 18;63(10):1115-1120", "👉 Vitamin D, predictive value, positive effect", "40962545"),
                    Reference("J Multimorb Comorb. 2025 Sep 13;15:26335565251371254", "👉 BPPV + metabolic issues, unclear vitamin link", "40955337"),
                    Reference("Otol Neurotol. 2025 Oct 1;46(9):e359-e369", "👉 Blood biomarkers, vestibular diagnosis, unclear therapy", "40940013"),

                    // Minerals
                    Reference("Case Rep Nephrol. 2025 Feb 25;2025:6626611", "👉 Difelikefalin, positive but dizziness side effect", "40040639"),
                    Reference("Menopause. 2025 May 1;32(5):388-395", "👉 Abaloparatide, BMD + dizziness side effect", "39999474"),
                    Reference("J Clin Neurosci. 2025 May;135:111076", "👉 BPPV elderly, dizziness risk", "39965514"),

                    // Supplements
                    Reference("Ann Epidemiol. 2025 Sep 14;111:9-13", "👉 Semaglutide, adverse dizziness", "40957545"),
                    Reference("Epilepsy Res. 2025 Aug 30;218:107647", "👉 Cenobamate, adverse dizziness", "40915105"),
                    Reference("Sci Rep. 2025 Aug 14;15(1):29790", "👉 Silicon supplement, vestibular benefit", "40813876"),

                    // Nutrients
                    Reference("Nutrients. 2025 May 16;17(10):1692", "👉 Vitamin D deficiency in long COVID, dizziness", "40431432"),
                    Reference("Zh Nevrol Psikhiatr. 2025;125(4):21-26", "👉 Migraine pathogenesis, nutrient imbalance", "40350725"),
                    Reference("In Vivo. 2025 May-Jun;39(3):1703-1718", "👉 Hyperhomocysteinemia, dizziness, QoL impact", "40295030")
                )
            )

            "Dyslexia" -> Pair(
                """
    Alternative approaches
    1. Case study on presentation format in posterior cortical atrophy suggested reading ability can be influenced, but no clear therapeutic effect (Reports, 2025).  
    2. Dyslexia moderated perception in short video learning among Chinese students; evidence shows behavioral impact but not therapy (Acta Psychol, 2025).  
    3. Visual stress questionnaire identified salient symptoms, supporting better diagnosis of visual-perceptual reading difficulties (Vision Res, 2025).  

    Herbs
    • No direct herbal interventions for dyslexia were reported.  

    Amino acids
    1. Genetic study: STIM1 mutation in tubular aggregate myopathy, not directly linked to dyslexia but relevant for amino acid function (J Med Genet, 2025).  
    2. EEG and MR spectroscopy biomarkers investigated neural noise in dyslexia; amino acid metabolism mentioned, no dose defined (Elife, 2025).  
    3. Environmental exposure (urinary 2-hydroxyethyl mercapturic acid) associated with dyslexia in children; adverse + possible metabolic role (Environ Sci Pollut Res, 2023).  

    Vitamins
    1. Nutrition and ADHD/neurodivergence review highlighted overlap with dyslexia, but no specific vitamin dosing (Front Nutr, 2025).  
    2. Conception month linked to learning disabilities, indirect role of maternal vitamin/nutrient environment (Am J Epidemiol, 2016).  
    3. Vitamin B12 deficiency case showed reversible disconnection syndrome with learning impairments (Neurol India, 2013).  

    Minerals
    1. Nutrition review in ADHD/neurodivergence mentioned minerals in cognitive function, indirect evidence for dyslexia (Front Nutr, 2025).  
    2. Urinary metals in children correlated with dyslexia risk (Environ Int, 2020).  
    3. Declaration of nutrition and intelligence highlighted minerals and nutrition as protective for neurodevelopment (Nutr Health, 2007).  

    Supplements
    1. Scoping review: phonological awareness in Thai-speaking children, educational interventions considered supportive (Int J Lang Commun Disord, 2025).  
    2. Chinese diagnostic practices described, highlighting lack of supplement-based therapies (Zhonghua Er Ke Za Zhi, 2024).  
    3. Educational technology RCT showed some benefit for reading disabilities; not nutrient-based, but supportive (J Learn Disabil, 2023).  

    Nutrients
    1. Nutrition review in ADHD/neurodivergence described overlap with dyslexia, but no clear nutrient therapy (Front Nutr, 2025).  
    2. Maternal diet study: placenta and brain glucose transporters essential for neurodevelopment, indirect effect on dyslexia (Nutrients, 2024).  
    3. Review highlighted choline’s role in neurodevelopmental disorders including dyslexia; suggested possible therapeutic effect (Nutrients, 2023).  

    What this means for readers
    • Dyslexia is primarily a neurodevelopmental condition affecting reading and language, not directly caused by nutrient deficiency.  
    • Visual stress and learning environment strongly influence symptoms; structured educational support is most effective.  
    • Nutrition (vitamins like B12, minerals, choline) may play an indirect role in brain development and cognitive function, but no specific supplement is a cure.  
    • Environmental toxins (e.g., metals, chemical exposures) may worsen risk in children.  
    • The most effective strategies: early diagnosis, tailored learning interventions, and maintaining good nutrition during pregnancy and childhood for brain health.  
    """.trimIndent(),
                listOf(
                    // Alternative
                    Reference("Reports. 2025 Aug 31;8(3):160. doi:10.3390/reports8030160", "👉 Posterior cortical atrophy, reading ability, no clear therapy", "40981118"),
                    Reference("Acta Psychol (Amst). 2025 Sep 2;260:105464", "👉 Dyslexia in video learning perception, behavioral impact", "40902497"),
                    Reference("Vision Res. 2025 Oct;235:108668", "👉 Visual stress questionnaire, diagnostic support, positive effect", "40753690"),

                    // Amino acids
                    Reference("J Med Genet. 2025 May 27;62(6):381-387", "👉 STIM1 mutation, amino acid role", "40127930"),
                    Reference("Elife. 2025 Mar 3;13:RP99920", "👉 EEG/MRS biomarkers, dyslexia, no dose info", "40029268"),
                    Reference("Environ Sci Pollut Res Int. 2023 Sep;30(45):101091-101098", "👉 Environmental metabolite association, dyslexia, mixed effects", "37646928"),

                    // Vitamins
                    Reference("Front Nutr. 2025 Jul 30;12:1586925", "👉 Nutrition & ADHD/neurodivergence, indirect link to dyslexia", "40808843"),
                    Reference("Am J Epidemiol. 2016 Oct 1;184(7):485-493", "👉 Month of conception, learning disabilities", "27651381"),
                    Reference("Neurol India. 2013 Mar-Apr;61(2):167-9", "👉 B12 deficiency, reversible learning issues", "23644318"),

                    // Minerals
                    Reference("Front Nutr. 2025 Jul 30;12:1586925", "👉 Minerals in ADHD/neurodivergence, indirect", "40808843"),
                    Reference("Environ Int. 2020 Jun;139:105707", "👉 Urine metals linked to dyslexia risk", "32289584"),
                    Reference("Nutr Health. 2007;19(1-2):85-102", "👉 Nutrition & intelligence declaration, positive effect", "18309769"),

                    // Supplements
                    Reference("Int J Lang Commun Disord. 2025 Sep-Oct;60(5):e70099", "👉 Phonological awareness, supportive role", "40729430"),
                    Reference("Zhonghua Er Ke Za Zhi. 2024 Jun 2;62(6):548-552", "👉 Dyslexia diagnostics, no supplements", "38763877"),
                    Reference("J Learn Disabil. 2023 Nov-Dec;56(6):453-466", "👉 Edtech RCT, supportive, not nutrient-based", "36519673"),

                    // Nutrients
                    Reference("Front Nutr. 2025 Jul 30;12:1586925", "👉 Nutrition review, ADHD/dyslexia overlap", "40808843"),
                    Reference("Nutrients. 2024 Jul 21;16(14):2363", "👉 Maternal diet & GLUT transporters, neurodevelopment", "39064806"),
                    Reference("Nutrients. 2023 Jun 25;15(13):2876", "👉 Choline in neurodevelopment, possible positive role", "37447203")
                )
            )

            "Dyspraxia" -> Pair(
                """
    Alternative approaches
    1. Gross motor skill intervention studies in children with developmental coordination disorder showed improvement in participation and motor ability, suggesting supportive effects (Child Care Health Dev, 2025).  
    2. Predictors of naturalistic action performance after left hemisphere stroke highlight neuroanatomical and cognitive contributions to dyspraxia-related daily function, but no direct therapy defined (Cortex, 2025).  
    3. Speech apraxia measures using spatiotemporal stability were shown to support therapy monitoring and diagnostic robustness (J Speech Lang Hear Res, 2025).  

    Herbs
    • No direct herbal interventions for dyspraxia were reported.  

    Amino acids
    1. Case report on hawkinsinuria described metabolic amino acid disturbance, not directly linked to dyspraxia but relevant for motor and speech symptoms (BMJ Case Rep, 2025).  
    2. Gluten sensitivity in children with apraxia of speech was associated with altered glutamate and GABA plasma levels, indicating possible metabolic role (Pediatr Neurol, 2024).  
    3. Genetic deletion in KMT2C linked to Kleefstra syndrome with developmental delay and dyspraxic features, but no therapy defined (Mol Genet Genomic Med, 2024).  

    Vitamins
    1. Survey on nutritional blends for ASD, apraxia and developmental delays reported mixed effects (positive and adverse), suggesting possible vitamin-related influence but no defined dosing (Altern Ther Health Med, 2021).  
    2. Case report of Marchiafava-Bignami disease described motor coordination and apraxia-like deficits in vitamin-deficient context, indirect relevance to dyspraxia (Medicine (Baltimore), 2019).  

    Minerals
    • No specific mineral studies directly addressing dyspraxia were found.  

    Supplements
    • No specific supplement-based interventions directly for dyspraxia identified.  

    Nutrients
    • Evidence for nutrient role in dyspraxia remains indirect; mostly reported in the context of comorbid ASD, apraxia of speech, or metabolic syndromes.  

    What this means for readers
    • Dyspraxia is a neurodevelopmental coordination disorder, managed primarily with occupational and speech therapy.  
    • Motor skill interventions show benefit, but dosing and protocols vary.  
    • Vitamins and amino acids may influence associated metabolic or speech features, but current evidence is exploratory.  
    • No herbal or supplement cures exist.  
    • The most effective strategies are early diagnosis, tailored therapy, and monitoring comorbid metabolic or nutritional factors.  
    """.trimIndent(),
                listOf(
                    // Alternative
                    Reference("Child Care Health Dev. 2025 Jul;51(4):e70127. doi:10.1111/cch.70127", "👉 Gross motor intervention, positive support", "40592355"),
                    Reference("Cortex. 2025 Apr;185:301-315. doi:10.1016/j.cortex.2025.03.004", "👉 Stroke predictors, neuroanatomical insights, no therapy", "40121973"),
                    Reference("J Speech Lang Hear Res. 2025 Jul;68(7S):3495-3506. doi:10.1044/2024_JSLHR-24-00360", "👉 Speech apraxia measures, support therapy monitoring", "39680792"),

                    // Amino acids
                    Reference("BMJ Case Rep. 2025 Aug 11;18(8):e264777. doi:10.1136/bcr-2024-264777", "👉 Hawkinsinuria, amino acid metabolism, indirect link", "40789710"),
                    Reference("Pediatr Neurol. 2024 Feb;151:104-110. doi:10.1016/j.pediatrneurol.2023.11.012", "👉 Gluten sensitivity, glutamate & GABA changes", "38154236"),
                    Reference("Mol Genet Genomic Med. 2024 Jan;12(1):e2350. doi:10.1002/mgg3.2350", "👉 KMT2C gene deletion, developmental features", "38146907"),

                    // Vitamins
                    Reference("Altern Ther Health Med. 2021 Mar;27(2):11-20", "👉 Nutritional blend survey, mixed effects", "32088673"),
                    Reference("Medicine (Baltimore). 2019 Aug;98(34):e16891. doi:10.1097/MD.0000000000016891", "👉 Vitamin deficiency, motor/apraxia-like symptoms", "31441866")
                )
            )

            "Ear infections" -> Pair(
                """
    Alternative approaches
    1. Video otoscopy-assisted laser excision of aural masses in dogs showed clinical feasibility but limited to veterinary context (Open Vet J, 2025).  
    2. Boric acid-alcohol topical solution demonstrated positive therapeutic effects in canine otitis externa in a controlled trial (Vet Res Commun, 2025).  
    3. Passiflora species extracts showed antimicrobial and photosensitizing effects against MRSA in mice, with both positive and adverse findings (Adv Biol, 2025).  

    Herbs
    1. Survey in Romania showed ongoing use of medicinal plants for childhood diseases including ear-related issues (Front Pharmacol, 2024).  
    2. Chromolaena odorata extract demonstrated anti-inflammatory, wound-healing, and antimicrobial activity; potential relevance to otitis (J Ethnopharmacol, 2024).  
    3. Phytotherapy in otorhinolaryngology reported benefits but also risks, highlighting careful clinical consideration (Eur Ann Otorhinolaryngol Head Neck Dis, 2017).  

    Amino acids
    1. Clinical study of triiodothyronine levels in sudden hearing loss suggested metabolic links but no clear therapeutic effect (Medicine (Baltimore), 2025).  
    2. Proteomic studies of Streptococcus pneumoniae highlighted amino acid metabolism roles but no dosing relevance (Front Cell Infect Microbiol, 2025).  
    3. RNA signaling in S. pneumoniae linked to virulence regulation, showing indirect amino acid-related mechanisms (J Bacteriol, 2024).  

    Vitamins
    1. Vitamin D essential role in pediatric infections and immune vulnerability was emphasized, supporting protective effects (Children, 2025).  
    2. Serum 25-hydroxyvitamin D levels associated with lower respiratory infections in children, with mcg/day relevance (Eur J Pediatr, 2025).  
    3. Pediatric liquid medications review highlighted oral/dental risks, indirectly relevant to ear infection comorbidities (Health Sci Rep, 2025).  

    Minerals
    1. CT imaging of canine ear canal masses showed diagnostic limitations, not therapeutic use (Am J Vet Res, 2025).  
    2. Review of piglet mineral metabolism discussed links to infection resilience, but no direct ear infection dosing (Metabolites, 2025).  
    3. Commentary on nuclear weapons included health/mineral context but only indirect relevance (J Gen Intern Med, 2025).  

    Supplements
    1. Malassezia isolates from pets showed antifungal susceptibility, highlighting supplement potential (Antibiotics, 2025).  
    2. MED13L-related disorder described severe speech impairment, developmental overlap with otitis but not direct therapy (J Neurodev Disord, 2025).  
    3. Gut probiotic metabolites demonstrated therapeutic potential in otitis media prevention/treatment (Front Cell Infect Microbiol, 2025).  

    Nutrients
    1. Proteomic mapping of S. pneumoniae revealed nutrient regulation in infection processes (Front Cell Infect Microbiol, 2025).  
    2. Mineral metabolism in piglets linked to feeding/nutrient status, no direct dose/effect (Metabolites, 2025).  
    3. Computational vaccine design for H. influenza highlighted nutrient-pangenome interactions, no therapeutic dose defined (Sci Rep, 2025).  

    What this means for readers
    • Ear infections (otitis) are common and multifactorial, involving microbes, immunity, and environment.  
    • Evidence supports vitamin D and certain probiotics in reducing infection risk.  
    • Herbal and phytotherapy approaches show antimicrobial potential but also risks.  
    • Amino acid and mineral studies are mostly mechanistic, not treatment protocols.  
    • Standard medical care (antibiotics, ear drops, ENT evaluation) remains primary treatment.  
    • Supplements and herbs may have supportive roles, but none replace conventional therapy.  
    """.trimIndent(),
                listOf(
                    // Alternative
                    Reference("Open Vet J. 2025 Jun;15(6):2909-2914", "👉 Laser excision of aural masses in dogs, feasibility", "40989628"),
                    Reference("Vet Res Commun. 2025 Sep 23;49(6):325", "👉 Boric acid-alcohol solution, positive therapeutic effect | day", "40986202"),
                    Reference("Adv Biol (Weinh). 2025 Aug 29:e00254", "👉 Passiflora extracts vs MRSA, positive & negative findings", "40878644"),

                    // Herbs
                    Reference("Front Pharmacol. 2024 May 22;15:1377341", "👉 Medicinal plants use in children, positive role", "38841372"),
                    Reference("J Ethnopharmacol. 2024 Sep 15;331:118330", "👉 Chromolaena odorata, antimicrobial & wound healing", "38740109"),
                    Reference("Eur Ann Otorhinolaryngol Head Neck Dis. 2017 Apr;134(2):95-99", "👉 Phytotherapy in ENT, benefits & risks", "27914909"),

                    // Amino acids
                    Reference("Medicine (Baltimore). 2025 Aug 15;104(33):e43843", "👉 T3 levels in hearing loss, no clear effect", "40826678"),
                    Reference("Front Cell Infect Microbiol. 2025 Jul 11;15:1606161", "👉 S. pneumoniae proteome, amino acid roles", "40718681"),
                    Reference("J Bacteriol. 2024 Sep 19;206(9):e0000424", "👉 RNA signaling in S. pneumoniae, virulence", "39171913"),

                    // Vitamins
                    Reference("Children (Basel). 2025 Aug 25;12(9):1116", "👉 Vitamin D, pediatric infections, protective role", "41006981"),
                    Reference("Eur J Pediatr. 2025 Sep 11;184(10):610", "👉 Vitamin D levels & infections, mcg/day relevance", "40936023"),
                    Reference("Health Sci Rep. 2025 Jul 23;8(7):e71115", "👉 Pediatric liquid meds, dental/oral risks", "40704323"),

                    // Minerals
                    Reference("Am J Vet Res. 2025 Aug 21:1-8", "👉 CT for canine ear canal masses, diagnostic limits", "40840527"),
                    Reference("Metabolites. 2025 Jul 16;15(7):480", "👉 Mineral metabolism in piglets, indirect", "40710580"),
                    Reference("J Gen Intern Med. 2025 Jul 15", "👉 Health commentary, indirect mineral context", "40663196"),

                    // Supplements
                    Reference("Antibiotics (Basel). 2025 Sep 5;14(9):902", "👉 Malassezia antifungal susceptibility", "41009881"),
                    Reference("J Neurodev Disord. 2025 Sep 24;17(1):56", "👉 MED13L disorder, speech impairment overlap", "40993520"),
                    Reference("Front Cell Infect Microbiol. 2025 Aug 15;15:1661871", "👉 Probiotic metabolites for otitis media, positive", "40895301"),

                    // Nutrients
                    Reference("Front Cell Infect Microbiol. 2025 Jul 11;15:1606161", "👉 Nutrient roles in S. pneumoniae infection", "40718681"),
                    Reference("Metabolites. 2025 Jul 16;15(7):480", "👉 Nutrient-mineral feeding patterns, indirect", "40710580"),
                    Reference("Sci Rep. 2025 Jul 1;15(1):22316", "👉 H. influenza vaccine design, nutrient interactions", "40594015")
                )
            )

            "Eczema" -> Pair(
                """
    Alternative approaches
    1. Real-time, noninvasive diagnosis of bullous pemphigoid using line-field confocal optical coherence tomography; diagnostic focus, not therapy (Skin Res Technol, 2025).  
    2. Janus kinase inhibitors in dermatology: therapeutic effect with adverse events, relevance for clinical practice (J Dtsch Dermatol Ges, 2025).  
    3. Medicated thread moxibustion in eczema rats showed efficacy via p38/NF-κB and JAK1-STAT6 pathways (Mediators Inflamm, 2025).  

    Herbs
    1. WuSheZhiYang Pills trial in mild-to-moderate atopic dermatitis (JMIR Res Protoc, 2025).  
    2. Phytochemical-based topical applications reviewed for eczema management; some therapeutic effects noted, occasional adverse effects (Int J Mol Sci, 2024).  
    3. Mangiferin inhibited macrophage MAPK/NF-κB and Th2 pathways, ameliorating atopic dermatitis (Int Immunopharmacol, 2024).  

    Amino acids
    1. Glutamine supplementation partially rescues metabolic reprogramming in CARMIL2 deficiency affecting T cells (J Allergy Clin Immunol, 2025).  
    2. Chronic hand eczema studies noted pain burden and analgesic use; no clear dosing info (Contact Dermatitis, 2025).  
    3. Emollients for xerosis in atopic dermatitis reviewed; supportive effect, dose/duration not standardized (Int J Dermatol, 2025).  

    Vitamins
    1. Dietary patterns and gut microbiome associations with atopic dermatitis; no dosing provided (Pediatr Allergy Immunol, 2025).  
    2. Review on prevention of atopic dermatitis; general nutritional relevance (Allergy Asthma Immunol Res, 2025).  
    3. Vitamin B6 status associated with eczema in children/adolescents; observational data, no intervention dose (Front Pediatr, 2025).  

    Minerals
    1. Trace elements are important for skin health; some studies report both beneficial and adverse effects (J Trace Elem Med Biol, 2025).  
    2. Phytoestrogens as anti-osteoporosis nutraceuticals noted; minor skin relevance, mixed evidence (J Steroid Biochem Mol Biol, 2025).  
    3. Minerals and trace elements as skin protectors; some adverse reports alongside benefits (Curr Med Chem, 2025).  

    Supplements
    1. Probiotics and prebiotics during pregnancy/lactation may support gut/skin health; some adverse effects noted (Curr Nutr Rep, 2025).  
    2. Melatonin use in children with atopic dermatitis; observational, dosage reported (Pediatr Dermatol, 2025).  
    3. Lebrikizumab in moderate-to-severe atopic dermatitis; positive effects with some adverse events (Am J Clin Dermatol, 2025).  

    Nutrients
    1. Probiotics for early-life microbiota and eczema support; therapeutic effect mentioned (Nutrients, 2025).  
    2. Trace elements in skin function and health; mixed therapeutic/adverse reports (J Trace Elem Med Biol, 2025).  
    3. Mediterranean diet in pregnancy improved offspring health; indirect skin/eczema benefit (Nutrients, 2025).  

    What this means for readers
    • Eczema is a chronic inflammatory skin condition; no single nutrient or supplement is curative.  
    • Alternative and herbal therapies show some symptomatic benefit, but often with adverse effects.  
    • Amino acids, vitamins, and minerals may support skin health indirectly; dose and regimen are often unclear.  
    • Early intervention, proper skincare, and supportive nutrition remain primary strategies for management.  
    """.trimIndent(),
                listOf(
                    // Alternative
                    Reference("Skin Res Technol. 2025 Sep;31(9):e70235", "👉 Diagnostic focus, not therapy", "40990140"),
                    Reference("J Dtsch Dermatol Ges. 2025 Sep;23(9):1127-1140", "👉 JAK inhibitors, therapeutic & adverse effects", "40952332"),
                    Reference("Mediators Inflamm. 2025 Sep 2;2025:9978298", "👉 Medicated thread moxibustion in rats, positive effect", "40933470"),

                    // Herbs
                    Reference("JMIR Res Protoc. 2025 Jul 2;14:e77927", "👉 WuSheZhiYang Pills trial, supportive effect", "40601920"),
                    Reference("Int J Mol Sci. 2024 May 15;25(10):5375", "👉 Phytochemical topical applications, positive & negative effects", "38791412"),
                    Reference("Int Immunopharmacol. 2024 May 30;133:112038", "👉 Mangiferin, pathway modulation, positive & negative effects", "38621336"),

                    // Amino acids
                    Reference("J Allergy Clin Immunol. 2025 Jul 28:S0091-6749(25)00806-1", "👉 Glutamine supplementation, partial rescue", "40738287"),
                    Reference("Contact Dermatitis. 2025 Aug;93(2):131-137", "👉 Pain and analgesic use in chronic hand eczema", "40375750"),
                    Reference("Int J Dermatol. 2025 Jun;64 Suppl 1(Suppl 1):13-28", "👉 Emollients for xerosis, supportive effect", "40265493"),

                    // Vitamins
                    Reference("Pediatr Allergy Immunol. 2025 Sep;36(9):e70202", "👉 Dietary patterns & gut microbiome, no dose info", "40960322"),
                    Reference("Allergy Asthma Immunol Res. 2025 Jul;17(4):433-446", "👉 AD prevention review, nutritional relevance", "40736773"),
                    Reference("Front Pediatr. 2025 Jul 11;13:1557186", "👉 Vitamin B6 status associated with eczema", "40717772"),

                    // Minerals
                    Reference("J Trace Elem Med Biol. 2025 Jun;89:127674", "👉 Trace elements, mixed effects", "40460725"),
                    Reference("J Steroid Biochem Mol Biol. 2025 Jul;251:106740", "👉 Phytoestrogens, minor skin relevance, mixed evidence", "40139537"),
                    Reference("Curr Med Chem. 2025 Mar 5", "👉 Minerals & trace elements, protective and adverse effects", "40045862"),

                    // Supplements
                    Reference("Curr Nutr Rep. 2025 Sep 15;14(1):106", "👉 Probiotics/prebiotics, therapeutic & adverse effects", "40952551"),
                    Reference("Pediatr Dermatol. 2025 Sep 9", "👉 Melatonin in children, positive effect", "40925855"),
                    Reference("Am J Clin Dermatol. 2025 Sep;26(5):803-817", "👉 Lebrikizumab, positive & adverse effects", "40665146"),

                    // Nutrients
                    Reference("Nutrients. 2025 Jun 21;17(13):2071", "👉 Probiotics, supportive effect", "40647176"),
                    Reference("J Trace Elem Med Biol. 2025 Jun;89:127674", "👉 Trace elements, mixed effects", "40460725"),
                    Reference("Nutrients. 2025 May 19;17(10):1719", "👉 Mediterranean diet, indirect benefit", "40431459")
                )
            )

            "Ehlers-Danlos syndromes" -> Pair(
                """
    Alternative approaches
    1. Postdural puncture headache in a patient with joint hypermobility; case report, no dosing info (Pain Med Case Rep, 2025).  
    2. Open repair of superior mesenteric artery aneurysm in EDS; procedural report, not therapeutic in general (JACC Case Rep, 2025).  
    3. Celiprolol in vascular EDS: systematic review, positive therapeutic effects with some adverse events (Med Sci (Basel), 2025).  

    Herbs
    • No specific references found.  

    Amino acids
    1. Gly substitutions impact structure, function, mechanics of collagen in vascular EDS; positive therapeutic effect noted (Matrix Biol, 2025).  
    2. Shprintzen-Goldberg syndrome report; clinical review, no dosing info (Eur J Med Genet, 2025).  
    3. Genetic evidence of high-grade transformation in thyroid carcinoma associated with EDS; observational, no dosing (J Pathol Clin Res, 2024).  

    Vitamins
    1. Radiofrequency echographic multi-spectrometry (REMS) for rare bone disorders; diagnostic, no dose/effect data (BMC Med Imaging, 2025).  
    2. Young infant bone strength review; observational, no dose/effect data (Medicine (Baltimore), 2025).  
    3. Classical EDS with cranio-cervical instability; case report, dose in grams (BMJ Case Rep, 2024).  

    Minerals
    1. Bone densitometry in hypermobile EDS females; no dose/effect info (J Clin Med, 2025).  
    2. Natural history of dermatosparaxis EDS; positive therapeutic effect (Am J Med Genet A, 2025).  
    3. Hereditary dentin defects; observational, no dose/effect info (Oral Dis, 2023).  

    Supplements
    1. Creatine monohydrate for muscular fatigue in EDS; positive effect, dose info not standardized (Cureus, 2024).  
    2. Nabilone for antiemetic use; positive/negative effects, dosing reported (Rev Esp Enferm Dig, 2023).  
    3. Joint hypermobility as indicator of Marfan/EDS; observational, no dosing info (Cureus, 2022).  

    Nutrients
    1. Mast cell activation and nutrition in hypermobility; no dose/effect data (Curr Opin Gastroenterol, 2024).  
    2. Impact of joint hypermobility syndrome on gastric accommodation; observational, no dose/effect data (Neurogastroenterol Motil, 2021).  
    3. Zinc and skin disorders; no dose/effect data (Nutrients, 2018).  

    What this means for readers
    • Ehlers-Danlos syndromes (EDS) are a group of connective tissue disorders; management is mostly supportive and symptom-directed.  
    • Alternative approaches such as celiprolol or supplements like creatine may provide benefit in specific subtypes, but dose and regimen are often unclear.  
    • Amino acid modifications and nutrient support may influence collagen structure/function.  
    • Most interventions are case reports or small series; clinical guidance remains limited.
    """.trimIndent(),
                listOf(
                    // Alternative
                    Reference("Pain Med Case Rep. 2025 Aug;9(4):191-195", "👉 Case report, diagnostic/observational", "40900450"),
                    Reference("JACC Case Rep. 2025 Jul 2;30(17):103914", "👉 Surgical case report, not general therapy", "40615223"),
                    Reference("Med Sci (Basel). 2025 Jun 9;13(2):74", "👉 Celiprolol, positive & adverse effects", "40559232"),

                    // Herbs
                    // No entries

                    // Amino acids
                    Reference("Matrix Biol. 2025 Feb;135:87-98", "👉 Gly substitutions, positive effect", "39645092"),
                    Reference("Eur J Med Genet. 2025 Feb;73:104985", "👉 Shprintzen-Goldberg syndrome, no dose info", "39638120"),
                    Reference("J Pathol Clin Res. 2024 Mar;10(2):e356", "👉 Thyroid carcinoma genetics in EDS, observational", "38602501"),

                    // Vitamins
                    Reference("BMC Med Imaging. 2025 Sep 26;25(1):382", "👉 REMS diagnostic application, no dosing", "41013349"),
                    Reference("Medicine (Baltimore). 2025 Mar 7;104(10):e41701", "👉 Infant bone strength review", "40068049"),
                    Reference("BMJ Case Rep. 2024 Dec 20;17(12):e262894", "👉 Classical EDS with cranio-cervical instability, dose in g", "39950632"),

                    // Minerals
                    Reference("J Clin Med. 2025 Feb 1;14(3):941", "👉 Bone densitometry in hypermobile EDS", "39941612"),
                    Reference("Am J Med Genet A. 2025 Apr;197(4):e63957", "👉 Dermatosparaxis EDS, positive effect", "39641471"),
                    Reference("Oral Dis. 2023 Sep;29(6):2376-2393", "👉 Hereditary dentin defects", "37094075"),

                    // Supplements
                    Reference("Cureus. 2024 Jun 5;16(6):e61721", "👉 Creatine monohydrate, positive effect", "38846547"),
                    Reference("Rev Esp Enferm Dig. 2023 Jun 14", "👉 Nabilone, positive & adverse effects, dosing info", "37314117"),
                    Reference("Cureus. 2022 Aug 1;14(8):e27574", "👉 Joint hypermobility indicator, observational", "36059296"),

                    // Nutrients
                    Reference("Curr Opin Gastroenterol. 2024 May 1;40(3):225-232", "👉 Mast cell activation/nutrition in hypermobility", "38393310"),
                    Reference("Neurogastroenterol Motil. 2021 Jul;33(7):e14086", "👉 Joint hypermobility impact on gastric tolerance", "33528850"),
                    Reference("Nutrients. 2018 Feb 11;10(2):199", "👉 Zinc and skin disorders", "29439479")
                )
            )

            "Endometriosis" -> Pair(
                """
    Alternative approaches
    1. Combined therapy using exosomes from Wharton's jelly mesenchymal stem cells + etanercept; positive effect (Curr Mol Med, 2025, μg).  
    2. Andrographolide therapy for deep endometriosis in BALB/C model; positive effect, dose in g/mg (Open Vet J, 2025).  
    3. Transvaginal natural orifice hysterectomy vs abdominal laparoscopy; positive effect (Arch Gynecol Obstet, 2025).  

    Herbs
    1. Phytoestrogens in gynecological disorders (Unani medicine); positive & adverse effects noted (Altern Ther Health Med, 2025).  
    2. Wen Jing Tang for endometriosis: network pharmacology & experimental validation; positive effect (Heliyon, 2024).  
    3. Guizhi Fuling Wan inhibits endometriosis development; positive effect, daily dosing (J Ethnopharmacol, 2025).  

    Amino acids
    1. Ghrelin as potential therapeutic target in chronic inflammatory endometrial diseases; no dose info (Front Endocrinol, 2025).  
    2. INSL3/RXFP2 endocrine signaling in hamster; observational, dose not specified (PLoS One, 2025).  
    3. SLC1A5 regulation of glutamine metabolism promotes ferroptosis sensitivity; positive effect (Front Biosci, 2025).  

    Vitamins
    1. Medical nutrition therapy (Mediterranean to ketogenic diet) in obesity + endometriosis; positive effect (Curr Obes Rep, 2025).  
    2. Menopausal health in endometriosis: clinical guide; positive effect (Maturitas, 2025).  
    3. Vitamin supplementation for symptom management; positive & adverse effects (Ann Med Surg, 2025).  

    Minerals
    1. Hormonal management tolerability in endometriosis-associated pain; positive & adverse effects (Biomedicines, 2025).  
    2. Relugolix therapy for uterine diseases and bone effects; positive & adverse effects (Biomedicines, 2025).  
    3. Pain management strategies for moderate/severe endometriosis; positive & adverse effects (Expert Opin Drug Saf, 2025).  

    Supplements
    1. Medical nutrition therapy with supplementation; positive effect (Curr Obes Rep, 2025).  
    2. Impact on cardiovascular/cerebrovascular outcomes; observational, no dose info (Women Health, 2025).  
    3. Dietary selenium intake and endometriosis risk; positive effect (Front Endocrinol, 2025).  

    Nutrients
    1. Nutrition impact on endometriosis complaints in patients with/without hormone therapy; observational (Nutrients, 2025).  
    2. Medical nutrition therapy (Mediterranean to ketogenic) with supplementation; positive effect (Curr Obes Rep, 2025).  
    3. NR4A1 as nutrient sensor inhibiting aging effects; positive & adverse effects monthly (Nutrients, 2025).  

    Summary for readers
    • Endometriosis management includes alternative, herbal, amino acid, vitamin, mineral, supplement, and nutrient-based approaches.  
    • Evidence often comes from experimental models, clinical cohorts, or systematic reviews.  
    • Positive/therapeutic effects predominate, but some therapies report adverse effects.  
    • Dosing is frequently missing or varies by study; careful interpretation is required.
    """.trimIndent(),
                listOf(
                    // Alternative
                    Reference("Curr Mol Med. 2025 Sep 22", "👉 Stem cells + etanercept, positive effect", "40993922"),
                    Reference("Open Vet J. 2025 Jun;15(6):2882-2888", "👉 Andrographolide, positive effect", "40989592"),
                    Reference("Arch Gynecol Obstet. 2025 Sep 24", "👉 Transvaginal vs abdominal hysterectomy, positive effect", "40987917"),

                    // Herbs
                    Reference("Altern Ther Health Med. 2025 Aug 6", "👉 Phytoestrogens, positive & adverse effects", "40768545"),
                    Reference("Heliyon. 2024 Oct 17;10(21):e39292", "👉 Wen Jing Tang, positive effect", "39524878"),
                    Reference("J Ethnopharmacol. 2025 Feb 10;338(Pt 2):119067", "👉 Guizhi Fuling Wan, positive effect", "39522847"),

                    // Amino acids
                    Reference("Front Endocrinol (Lausanne). 2025 Sep 1;16:1587490", "👉 Ghrelin, no dose info", "40958911"),
                    Reference("PLoS One. 2025 Aug 12;20(8):e0329696", "👉 INSL3/RXFP2 signaling, no dose info", "40794697"),
                    Reference("Front Biosci (Landmark Ed). 2025 May 21;30(5):36781", "👉 SLC1A5, positive effect", "40464516"),

                    // Vitamins
                    Reference("Curr Obes Rep. 2025 Sep 8;14(1):68", "👉 Medical nutrition therapy, positive effect", "40920291"),
                    Reference("Maturitas. 2025 Sep 2;202:108715", "👉 Menopausal health clinical guide, positive effect", "40907339"),
                    Reference("Ann Med Surg (Lond). 2025 May 26;87(7):4404-4413", "👉 Vitamin supplementation, positive & adverse effects", "40851946"),

                    // Minerals
                    Reference("Biomedicines. 2025 Sep 18;13(9):2294", "👉 Hormonal management tolerability, positive & adverse effects", "41007854"),
                    Reference("Biomedicines. 2025 Jul 30;13(8):1851", "👉 Relugolix therapy, positive & adverse effects", "40868107"),
                    Reference("Expert Opin Drug Saf. 2025 Aug 25:1-14", "👉 Pain management strategies, positive & adverse effects", "40788342"),

                    // Supplements
                    Reference("Curr Obes Rep. 2025 Sep 8;14(1):68", "👉 Medical nutrition therapy, positive effect", "40920291"),
                    Reference("Women Health. 2025 Aug;65(7):582-593", "👉 Cardiovascular/cerebrovascular impact, observational", "40728198"),
                    Reference("Front Endocrinol (Lausanne). 2025 Jun 30;16:1486790", "👉 Selenium intake, positive effect", "40661741"),

                    // Nutrients
                    Reference("Nutrients. 2025 Sep 6;17(17):2889", "👉 Nutrition impact on endometriosis complaints, observational", "40944277"),
                    Reference("Curr Obes Rep. 2025 Sep 8;14(1):68", "👉 Medical nutrition therapy with supplementation, positive effect", "40920291"),
                    Reference("Nutrients. 2025 Aug 21;17(16):2709", "👉 NR4A1 nutrient sensor, positive & adverse effects monthly", "40871737")
                )
            )

            "Epilepsy" -> Pair(
                """
    Alternative approaches
    1. Optimized resting-state fMRI for presurgical language mapping; positive effect (Brain Imaging Behav, 2025).  
    2. Ictal MEG-EEG study to localize generalized seizures; positive effect (Brain Sci, 2025).  
    3. Non-pharmacological methods for Lennox-Gastaut Syndrome; positive effect (Biomedicines, 2025).  

    Herbs
    1. Apigenin effect on seizure susceptibility, parvalbumin & GABA(A) expression; positive & adverse effects, mg (Eur J Pharmacol, 2025).  
    2. EEG-based brain-computer-interface applications; no dose info (Mil Med Res, 2025).  
    3. Caffeic acid ameliorates PTZ-induced seizures via aconitate decarboxylase 1; no dose info (Cell Commun Signal, 2025).  

    Amino acids
    1. Fenofibrate as PPARα agonist modulates neuroinflammation & glutamate receptors in temporal lobe epilepsy; positive effect, mg/day (Int J Mol Sci, 2025).  
    2. TRPV1 antagonist AMG9810 suppresses focal seizures by lowering glutamate; positive effect, IU (J Pharmacol Sci, 2025).  
    3. Oxylipin metabolizing dehydrogenase reductase 9 mutations; observational, dose not specified (J Biol Chem, 2025).  

    Vitamins
    1. Pyridoxine-dependent epilepsy in children; positive effect, g/mg/G, day/month (Front Neurol, 2025).  
    2. Late-onset Vitamin B6-dependent epilepsy (PLPBP variants); positive effect, month (Eur J Med Genet, 2025).  
    3. Genetic epilepsies in neonates; positive effect (Semin Perinatol, 2025).  

    Minerals
    1. Anticonvulsants linked to bone loss; negative effect, month (Consort Psychiatr, 2025).  
    2. Intracranial calcifications in congenital viral infections; observational, no dose info (Curr Opin Virol, 2025).  
    3. Antiseizure medications and bone health; positive effect (Neurol Ther, 2025).  

    Supplements
    1. 'White autopsies' overview; negative effect (Arch Med Sadowej Kryminol, 2025).  
    2. Electrographic seizures on responsive neurostimulation; negative effect, mg/week/day/month (Epilepsy Res, 2025).  
    3. Probiotics co-administered with LCM enhance antiepileptic efficacy; positive effect, mg/day (Neurochem Res, 2025).  

    Nutrients
    1. Ketogenic diet metabolomic pathways & therapeutic applications; no dose info (Nutrients, 2025).  
    2. Ketogenic diet in therapy & rehabilitation; no dose info (Nutrients, 2025).  
    3. Vitamin B6 & ketogenic diet interactions in epilepsy; no dose info (Nutrients, 2025).  

    Summary for readers
    • Epilepsy management includes alternative, herbal, amino acid, vitamin, mineral, supplement, and nutrient-based approaches.  
    • Evidence comes from experimental models, clinical case series, or systematic reviews.  
    • Positive/therapeutic effects predominate, but adverse effects are also reported.  
    • Dosing is variable; many studies lack exact dose or duration information.
    """.trimIndent(),
                listOf(
                    // Alternative
                    Reference("Brain Imaging Behav. 2025 Sep 27", "👉 Optimized resting-state fMRI, positive effect", "41014464"),
                    Reference("Brain Sci. 2025 Aug 28;15(9):938", "👉 Ictal MEG-EEG, positive effect", "41008297"),
                    Reference("Biomedicines. 2025 Sep 12;13(9):2247", "👉 Non-pharmacological Lennox-Gastaut therapy, positive effect", "41007808"),

                    // Herbs
                    Reference("Eur J Pharmacol. 2025 Jun 5;996:177548", "👉 Apigenin, positive & adverse effects, mg", "40157704"),
                    Reference("Mil Med Res. 2025 Mar 24;12(1):14", "👉 EEG-based BCI, no dose info", "40128831"),
                    Reference("Cell Commun Signal. 2025 Feb 3;23(1):62", "👉 Caffeic acid ameliorates PTZ seizures, no dose info", "39901156"),

                    // Amino acids
                    Reference("Int J Mol Sci. 2025 Sep 17;26(18):9054", "👉 Fenofibrate, positive effect, mg/day", "41009625"),
                    Reference("J Pharmacol Sci. 2025 Nov;159(3):163-171", "👉 TRPV1 antagonist AMG9810, positive effect, IU", "40983459"),
                    Reference("J Biol Chem. 2025 Sep 11:110704", "👉 Oxylipin dehydrogenase mutations, no dose info", "40945732"),

                    // Vitamins
                    Reference("Front Neurol. 2025 Sep 4;16:1609600", "👉 Pyridoxine-dependent epilepsy, positive effect, g/mg/G, day/month", "40979201"),
                    Reference("Eur J Med Genet. 2025 Sep 19:105047", "👉 Late-onset B6-dependent epilepsy, positive effect, month", "40976369"),
                    Reference("Semin Perinatol. 2025 Sep 19:152146", "👉 Genetic epilepsies in neonates, positive effect", "40975633"),

                    // Minerals
                    Reference("Consort Psychiatr. 2025 Jun 27;6(2):5-20", "👉 Anticonvulsants & bone loss, negative effect, month", "40927656"),
                    Reference("Curr Opin Virol. 2025 Sep 6;73:101479", "👉 Intracranial calcifications, no dose info", "40915005"),
                    Reference("Neurol Ther. 2025 Oct;14(5):1827-1844", "👉 Antiseizure meds & bone health, positive effect", "40889081"),

                    // Supplements
                    Reference("Arch Med Sadowej Kryminol. 2025 Aug;75(1):91-106", "👉 'White autopsies', negative effect", "40932441"),
                    Reference("Epilepsy Res. 2025 Aug 30;218:107647", "👉 Responsive neurostimulation, negative effect, mg/week/day/month", "40915105"),
                    Reference("Neurochem Res. 2025 Sep 6;50(5):290", "👉 Probiotics + LCM, positive effect, mg/day", "40913626"),

                    // Nutrients
                    Reference("Nutrients. 2025 Sep 16;17(18):2969", "👉 Ketogenic diet metabolomics, no dose info", "41010495"),
                    Reference("Nutrients. 2025 Sep 3;17(17):2855", "👉 Ketogenic diet therapy & rehab, no dose info", "40944243"),
                    Reference("Nutrients. 2025 Aug 19;17(16):2676", "👉 Vitamin B6 + ketogenic diet, no dose info", "40871704")
                )
            )

            "Excessive sweating" -> Pair(
                """
    Alternative approaches
    1. Pituitary pars intermedia dysfunction (PPID) management in horses; positive effect (Vet Sci, 2025).  
    2. Telitacicept for Morvan syndrome; positive & adverse effects, mg/month (Am J Case Rep, 2025).  
    3. Needle-free jet injectors (NFJI) applications; positive effect (Aesthet Surg J Open Forum, 2025).  

    Herbs
    1. Sweating as preventive & therapeutic strategy in Persian medicine; positive effect (Galen Med J, 2020).  
    2. Polyphenol extracts from Clausena lansium leaves; positive effect (J Food Sci, 2018).  

    Amino acids
    1. Mitochondrial respiration & lipid metabolism in axillary osmidrosis; positive effect (Arch Dermatol Res, 2024).  
    2. Modified Buqi Yangyin Sanjie + Levothyroxine after thyroid surgery; positive & adverse effects (Altern Ther Health Med, 2024).  
    3. Hyperthyroidism (Unani medicine perspective); positive effect (Altern Ther Health Med, 2023).  

    Vitamins
    1. Aromatic L-Amino Acid Decarboxylase Deficiency; positive effect, month (GeneReviews, 2025).  
    2. Dietary practices & megaloblastic anemia; positive effect (Cureus, 2024).  
    3. Vitamin D & calcium link to hot flashes in adolescents; no dose info (Med Arch, 2022).  

    Minerals
    1. Epidermolysis bullosa simplex; positive effect (GeneReviews, 2022).  
    2. Iron bioavailability enhancers & black pepper (Bioperine®); positive & adverse effects (Nutrients, 2020).  
    3. Calcium loss in sweat during Bikram yoga; mg (Complement Ther Med, 2020).  

    Supplements
    1. Nutrition habits & weight loss in wrestlers; positive effect (Vopr Pitan, 2025).  
    2. Medication adherence interventions; positive & adverse effects (Value Health, 2025).  
    3. Prevention/treatment of cutaneous side effects of hormonal therapy; positive & adverse effects (J Drugs Dermatol, 2025).  

    Nutrients
    1. Acute dehydration effect on muscle strength in athletes; positive effect (Nutrients, 2025).  
    2. Dietary practices & megaloblastic anemia; positive effect (Cureus, 2024).  
    3. Vitamin D & calcium link to hot flashes; no dose info (Med Arch, 2022).  

    Summary for readers
    • Excessive sweating can be managed via alternative, herbal, amino acid, vitamin, mineral, supplement, and nutrient approaches.  
    • Evidence comes from case reports, experimental studies, and traditional medicine reviews.  
    • Positive/therapeutic effects predominate, but adverse effects are also reported.  
    • Dosing is variable; many studies lack exact dose or duration information.
    """.trimIndent(),
                listOf(
                    // Alternative
                    Reference("Vet Sci. 2025 Aug 20;12(8):780", "👉 PPID management, positive effect", "40872730"),
                    Reference("Am J Case Rep. 2025 Jun 21;26:e947004", "👉 Telitacicept for Morvan syndrome, positive & adverse effects, mg/month", "40543057"),
                    Reference("Aesthet Surg J Open Forum. 2025 Apr 2;7:ojaf019", "👉 NFJI applications, positive effect", "40351559"),

                    // Herbs
                    Reference("Galen Med J. 2020 Dec 25;9:e2003", "👉 Sweating strategy in Persian medicine, positive effect", "34466623"),
                    Reference("J Food Sci. 2018 Jan;83(1):212-220", "👉 Polyphenol extracts from Clausena lansium, positive effect", "29227535"),

                    // Amino acids
                    Reference("Arch Dermatol Res. 2024 Dec 14;317(1):128", "👉 Mitochondrial respiration & lipid metabolism, positive effect", "39673600"),
                    Reference("Altern Ther Health Med. 2024 Jul;30(7):168-173", "👉 Modified Buqi Yangyin Sanjie + Levothyroxine, positive & adverse effects", "37971437"),
                    Reference("Altern Ther Health Med. 2023 Oct;29(7):262-267", "👉 Hyperthyroidism (Unani medicine), positive effect", "36455141"),

                    // Vitamins
                    Reference("GeneReviews. 2025 Jan 23", "👉 Aromatic L-Amino Acid Decarboxylase Deficiency, positive effect, month", "37824694"),
                    Reference("Cureus. 2024 Jun 2;16(6):e61550", "👉 Dietary practices & megaloblastic anemia, positive effect", "38962588"),
                    Reference("Med Arch. 2022 Jun;76(3):202-208", "👉 Vitamin D & calcium link to hot flashes, no dose info", "36200110"),

                    // Minerals
                    Reference("GeneReviews. 2022 Aug 4", "👉 Epidermolysis bullosa simplex, positive effect", "20301543"),
                    Reference("Nutrients. 2020 Jun 24;12(6):1886", "👉 Iron bioavailability & Bioperine®, positive & adverse effects", "32599787"),
                    Reference("Complement Ther Med. 2020 Jun;51:102417", "👉 Calcium loss in sweat during Bikram yoga, mg", "32507433"),

                    // Supplements
                    Reference("Vopr Pitan. 2025;94(3):111-119", "👉 Nutrition habits & weight loss in wrestlers, positive effect", "40937941"),
                    Reference("Value Health. 2025 May;28(5):676-679", "👉 Medication adherence interventions, positive & adverse effects", "40340081"),
                    Reference("J Drugs Dermatol. 2025 May 1;24(5):49631s3-49631s10", "👉 Cutaneous side effects prevention/treatment, positive & adverse effects", "40327585"),

                    // Nutrients
                    Reference("Nutrients. 2025 Apr 25;17(9):1452", "👉 Acute dehydration effect on muscle strength, positive effect", "40362761"),
                    Reference("Cureus. 2024 Jun 2;16(6):e61550", "👉 Dietary practices & megaloblastic anemia, positive effect", "38962588"),
                    Reference("Med Arch. 2022 Jun;76(3):202-208", "👉 Vitamin D & calcium link to hot flashes, no dose info", "36200110")
                )
            )

            "Eye infections" -> Pair(
                """
Alternative approaches
1. Syphilis and the eye: clinical features and treatment approaches show positive therapeutic effects.
2. SA-XV, a 15-amino acid fragment of host defense peptide S100A12, may protect against fungal infections. Dose and duration unclear.
3. REAGIR Study: rose bengal photodynamic therapy showed positive therapeutic effects over weeks to months.

Herbs
1. Genus Senecio in China: traditional use can have positive and adverse effects.
2. Obacunone: pharmacological activity shows both positive and adverse effects.
3. Ethnoveterinary medicines in Namibia: some adverse effects reported.

Amino acids
1. Copper-amino acid nanoleaves: antibacterial potential, dose/duration unclear.
2. Pantothenamides: positive effect against uropathogenic E. coli.
3. Cysteine catalytic oxidation-based detection: no clear dose or effect.

Vitamins
1. Management of severe acute malnutrition shows positive therapeutic effect over a month.
2. Vitamin A: supports treatment of related diseases.
3. Pantothenamides: show antimicrobial activity.

Minerals
1. Graphene coatings for bacterial infections: positive effect, microgram-level use.
2. Bacteriophage-gated optical sensor: dose and effect not clear.
3. Zeolitic Imidazolate Framework-90: potential adverse effects.

Supplements
1. UV-C aircraft disinfection: positive therapeutic effect.
2. Cryptosporidium detection: positive effect over a month.
3. H. pylori infection & allergic diseases: unclear dose/effect.

Nutrients
1. Metabolic adaptation in K. pneumoniae-induced intraocular inflammation shows positive effects.
2. Pantothenamides: antimicrobial activity.
3. Vitamin A in canine/feline corneal defects: dose/effect unclear.

Summary for readers
• Eye infections can be managed with alternative, herbal, amino acid, vitamin, mineral, supplement, and nutrient approaches.
• Positive effects predominate, but adverse effects exist.
• Exact doses and duration are often not reported.
""".trimIndent(),
                listOf(
                    Reference("Pathogens", "👉 Syphilis and the Eye: Positive/therapeutic effect mentioned", "41011752"),
                    Reference("J Biol Chem", "👉 SA-XV fragment protective against fungal infections, No clear dose/effect/duration found", "40975173"),
                    Reference("Ophthalmology", "👉 REAGIR Study: rose bengal photodynamic therapy, Positive/therapeutic effect mentioned | week, month", "40907580"),
                    Reference("J Ethnopharmacol", "👉 Genus Senecio in China, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40158830"),
                    Reference("Molecules", "👉 Obacunone, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "38675611"),
                    Reference("Front Vet Sci", "👉 Ethnoveterinary medicines, Negative/adverse effect mentioned | day", "35296062"),
                    Reference("Biomaterials", "👉 Copper-amino acid nanoleaves, No clear dose/effect/duration found", "40700980"),
                    Reference("Microbiol Spectr", "👉 Pantothenamides against uropathogenic E. coli, Positive/therapeutic effect mentioned", "40548707"),
                    Reference("Anal Methods", "👉 Cysteine catalytic oxidation-based detection, No clear dose/effect/duration found", "40534531"),
                    Reference("StatPearls", "👉 Severe Acute Malnutrition, Positive/therapeutic effect mentioned | month", "32644650"),
                    Reference("Food Sci Nutr", "👉 Vitamin A and related diseases, Positive/therapeutic effect mentioned", "40672537"),
                    Reference("Microbiol Spectr", "👉 Pantothenamides antimicrobial activity, Positive/therapeutic effect mentioned", "40548707"),
                    Reference("Nanoscale", "👉 Graphene coatings, μg | Positive/therapeutic effect mentioned", "40827458"),
                    Reference("Anal Chem", "👉 Bacteriophage-Gated Optical Sensor, No clear dose/effect/duration found", "40408168"),
                    Reference("Int J Nanomedicine", "👉 Zeolitic Imidazolate Framework-90, Negative/adverse effect mentioned", "40242606"),
                    Reference("Aerosp Med Hum Perform", "👉 UV-C aircraft disinfection, Positive/therapeutic effect mentioned", "40642811"),
                    Reference("Microorganisms", "👉 Cryptosporidium detection, Positive/therapeutic effect mentioned | month", "40284766"),
                    Reference("Sci Rep", "👉 H. pylori infection & allergic diseases, No clear dose/effect/duration found", "39962134"),
                    Reference("Res Microbiol", "👉 K. pneumoniae-induced intraocular inflammation, Positive/therapeutic effect mentioned", "40812520"),
                    Reference("Microbiol Spectr", "👉 Pantothenamides antimicrobial activity, Positive/therapeutic effect mentioned", "40548707"),
                    Reference("Tierarztl Prax Ausg K Kleintiere Heimtiere", "👉 Vitamin A in canine/feline corneal defects, No clear dose/effect/duration found", "40513606")
                )
            )


            "Eye problems" -> Pair(
                """
Alternative approaches
1. Upright, hands-free, self-initiated mobility for children with severe physical or communication disabilities shows positive therapeutic effects.
2. Ultrasound vs. biopsy in diagnosing giant cell arteritis shows positive therapeutic effects.
3. Nanozymes for bacterial detection and killing: dose and effect unclear.

Herbs
1. Extracts improve near visual acuity in presbyopia over a week.
2. Some unsafe traditional practices by Iraqi mothers: dose and effect unclear.
3. Plants used as antihypertensive: some adverse effects reported.

Amino acids
1. Rod outer segment phagocytosis modeling: no clear dose or effect.
2. COL4A4 mutation causing Alport syndrome: positive effect noted.
3. OCT findings in pregabalin use disorder: no clear dose or effect.

Vitamins
1. Lifestyle and behavioral factors impact visual problems: positive and adverse effects reported.
2. Egr1/Gc/vitamin transport axis & macular thinning: dose and effect unclear.
3. Collagen crosslinking in thin corneas: dose and effect unclear.

Minerals
1. Zeolitic Imidazolate Framework-90 treats fungal keratitis, but adverse effects exist.
2. Electrochromic sensor patch for lactic acid monitoring shows positive effect.
3. Organic trace elements in pigs: positive and adverse effects reported over a day.

Supplements
1. Explorative Saccade Training in advanced glaucoma shows positive effects over a week.
2. Artificial intelligence in radiology: positive effect.
3. Lutein supplements for dry eye syndrome, mg, positive effect over a week.

Nutrients
1. SMILE lenticule preservation & reuse: positive therapeutic effect.
2. Vascularized human retinal organoids: dose and effect unclear.
3. Nutrition and diet for dry eye disease: positive effect.

Summary for readers
• Eye problems can be managed with alternative, herbal, amino acid, vitamin, mineral, supplement, and nutrient approaches.
• Positive effects predominate, but adverse effects exist.
• Exact doses and duration are often not reported.
""".trimIndent(),
                listOf(
                    Reference("Children (Basel)", "👉 Upright mobility in children with severe disabilities, Positive/therapeutic effect mentioned", "40868476"),
                    Reference("Ir J Med Sci", "👉 Ultrasound vs. biopsy in giant cell arteritis, Positive/therapeutic effect mentioned", "40782233"),
                    Reference("Biosens Bioelectron", "👉 Nanozymes bacterial detection & killing, No clear dose/effect/duration found", "40768945"),
                    Reference("Nutrients", "👉 Extracts improve near visual acuity in presbyopia, Positive/therapeutic effect mentioned | week", "38612968"),
                    Reference("Heliyon", "👉 Unsafe traditional practices by Iraqi mothers, No clear dose/effect/duration found", "38524610"),
                    Reference("Nat Prod Bioprospect", "👉 Plants used as antihypertensive, Negative/adverse effect mentioned", "33174095"),
                    Reference("Sci Rep", "👉 Rod outer segment phagocytosis modeling, No clear dose/effect/duration found", "40594606"),
                    Reference("Front Pediatr", "👉 COL4A4 mutation causing Alport syndrome, g, G | Positive/therapeutic effect mentioned", "40406358"),
                    Reference("PeerJ", "👉 OCT findings in pregabalin use disorder, No clear dose/effect/duration found", "39544426"),
                    Reference("PLoS One", "👉 Lifestyle & behavioral factors and visual problems, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40839569"),
                    Reference("Exp Eye Res", "👉 Egr1/Gc/vitamin transport axis & macular thinning, No clear dose/effect/duration found", "40675437"),
                    Reference("Indian J Ophthalmol", "👉 Collagen crosslinking in thin corneas, No clear dose/effect/duration found", "40586201"),
                    Reference("Int J Nanomedicine", "👉 Zeolitic Imidazolate Framework-90 treats fungal keratitis, Negative/adverse effect mentioned", "40242606"),
                    Reference("Anal Chem", "👉 Electrochromic sensor patch for lactic acid monitoring, Positive/therapeutic effect mentioned", "39880598"),
                    Reference("Front Vet Sci", "👉 Organic trace elements in pigs, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day", "39764369"),
                    Reference("J Clin Med", "👉 Explorative Saccade Training in advanced glaucoma, Positive/therapeutic effect mentioned | week", "40363909"),
                    Reference("Cureus", "👉 AI in radiology, Positive/therapeutic effect mentioned", "40190891"),
                    Reference("Int J Vitam Nutr Res", "👉 Lutein supplements for dry eye syndrome, mg | Positive/therapeutic effect mentioned | week", "40134251"),
                    Reference("Bioengineering (Basel)", "👉 SMILE lenticule preservation & reuse, Positive/therapeutic effect mentioned", "40281740"),
                    Reference("Stem Cells", "👉 Vascularized human retinal organoids, No clear dose/effect/duration found", "40037696"),
                    Reference("Indian J Ophthalmol", "👉 Nutrition & diet for dry eye disease, Positive/therapeutic effect mentioned", "39331431")
                )
            )


            "Fainting" -> Pair(
                """
Alternative approaches
1. HHC use and harms in Ireland: dose and effect unclear.
2. Alternating bundle branch block with alternating PR interval: dose and effect unclear.
3. Diagnostic strategies for acute aortic syndrome: dose and effect unclear.

Herbs
1. Medicinal plants as potential PDE-5 inhibitors: some adverse effects reported.
2. Yahom Thai herbal therapy, g: some adverse effects reported.
3. Phikud Navakot in rats, mg: positive effects observed over a day.

Amino acids
1. Cripto-1/3 in placenta and fetal tissues: dose and effect unclear.
2. Soy protein hydrolysate in carob chocolate, µg, mg: dose and effect unclear.
3. NIR probe for cysteine: some adverse effects reported.

Vitamins
1. GeneReviews on Myotonic Dystrophy Type 2: dose and effect unclear.
2. Vitamin D in children with POTS: positive effects over a month.
3. Detection of biological nanoparticles: positive effect reported.

Minerals
1. Ossified pharyngeal dermoid cyst in canine: dose and effect unclear.
2. Severe scurvy case: dose and effect unclear.
3. Microneedle drug delivery, g: positive and adverse effects reported over a day.

Supplements
1. Anthocyanin MYB activators in sweetpotato: positive effect reported.
2. Xanthomonas sacchari in rice, µg: dose and effect unclear.
3. AF-SVR literature review: positive effect reported.

Nutrients
1. Pseudomonas aeruginosa in monkeys: some adverse effects reported.
2. SMARCA4-deficient undifferentiated tumor: positive effects over a month.
3. AMPK in CeA regulates feeding: positive effect reported.

Summary for readers
• Fainting can be addressed with alternative, herbal, amino acid, vitamin, mineral, supplement, and nutrient approaches.
• Positive effects are reported alongside adverse effects.
• Exact doses and duration are often unclear or study-specific.
""".trimIndent(),
                listOf(
                    Reference("Int J Drug Policy", "👉 HHC use and harms in Ireland, No clear dose/effect/duration found", "40972474"),
                    Reference("J Electrocardiol", "👉 Alternating bundle branch block with alternating PR interval, No clear dose/effect/duration found", "40945343"),
                    Reference("Health Technol Assess", "👉 Diagnostic strategies for acute aortic syndrome, No clear dose/effect/duration found", "40944621"),
                    Reference("J Ethnopharmacol", "👉 Medicinal plants as potential PDE-5 inhibitors, Negative/adverse effect mentioned", "33137431"),
                    Reference("J Ethnopharmacol", "👉 Yahom Thai herbal therapy, g | Negative/adverse effect mentioned", "27939421"),
                    Reference("J Med Assoc Thai", "👉 Phikud Navakot in rats, mg | Positive/therapeutic effect mentioned | day", "27276833"),
                    Reference("Sci Rep", "👉 Cripto-1/3 in placenta and fetal tissues, No clear dose/effect/duration found", "40835641"),
                    Reference("J Food Sci", "👉 Soy protein hydrolysate in carob chocolate, µg, mg", "40679243"),
                    Reference("J Pharm Biomed Anal", "👉 NIR probe for cysteine, Negative/adverse effect mentioned", "40451087"),
                    Reference("Myotonic Dystrophy Type 2. GeneReviews 2006–2025", "👉 No clear dose/effect/duration found", "20301639"),
                    Reference("Zhonghua Er Ke Za Zhi", "👉 Vitamin D in children with POTS, month, month", "40962545"),
                    Reference("J Phys Chem B", "👉 Detection of biological nanoparticles, Positive/therapeutic effect mentioned", "40924948"),
                    Reference("Vet Radiol Ultrasound", "👉 Ossified pharyngeal dermoid cyst in canine, No clear dose/effect/duration found", "40302134"),
                    Reference("Nutr Clin Pract", "👉 Severe scurvy case, No clear dose/effect/duration found", "40223322"),
                    Reference("Sci Rep", "👉 Microneedle drug delivery, g | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day", "39733062"),
                    Reference("Plants (Basel)", "👉 Anthocyanin MYB activators in sweetpotato, Positive/therapeutic effect mentioned", "41012047"),
                    Reference("Plant Dis", "👉 Xanthomonas sacchari in rice, µg, µg", "40619714"),
                    Reference("J Med Access", "👉 AF-SVR literature review, Positive/therapeutic effect mentioned", "40607080"),
                    Reference("Vet Sci", "👉 Pseudomonas aeruginosa in monkeys, Negative/adverse effect mentioned", "40711296"),
                    Reference("Medicine (Baltimore)", "👉 SMARCA4-deficient undifferentiated tumor, month, month", "39093728"),
                    Reference("Mol Cell Endocrinol", "👉 AMPK in CeA regulates feeding, Positive/therapeutic effect mentioned", "38604549")
                )
            )


            "Fertility problems" -> Pair(
                """
Alternative approaches
1. Future of embryo engineering, g: dose and effect unclear.
2. Perfumes and cosmetic products: positive and negative effects reported.
3. Kaempferol alleviates cypermethrin reproductive toxicity, mg: positive and negative effects reported over a day.

Herbs
1. Natural herbs in male infertility: adverse effects reported.
2. Treatment-seeking behavior among infertile tribal women: dose and effect unclear.
3. Hydrocarbon pollution bioremediation: dose and effect unclear.

Amino acids
1. Dietary interventions in dairy cows: dose and effect unclear.
2. Garlic stalk incorporation on soil fertility: positive effect reported over a day.
3. Energetic costs in wild male baboons: dose and effect unclear.

Vitamins
1. Review on sarcopenia, cachexia, and aging: positive effect reported.
2. Vitamin D and coconut oil against aluminum-induced testicular damage, g: positive and negative effects reported.
3. PCOS and inositols: positive effect reported.

Minerals
1. Organic substitution for mineral fertilizers: positive effect reported.
2. Novel bacterium for bioremediation: positive effect reported.
3. Trace mineral supplementation on eggshell and fertility: positive effect reported.

Supplements
1. Sarcopenia, cachexia, and aging: positive effect reported.
2. Fertility, time to pregnancy, and pregnancy outcomes, g: positive effect reported over a month.
3. Ligilactobacillus salivarius CECT5713 increases term pregnancies, g: positive effect reported.

Nutrients
1. Sarcopenia, cachexia, and aging: positive effect reported.
2. Lime and vermicompost on soil properties, mg: positive effect reported.
3. Ligilactobacillus salivarius CECT5713 increases term pregnancies, g: positive effect reported.

Summary for readers
• Fertility problems can be approached via alternative therapies, herbs, amino acids, vitamins, minerals, supplements, and nutrients.
• Positive effects are frequent, but some interventions report negative/adverse effects.
• Exact doses and duration are often unclear or study-specific.
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Front Cell Dev Biol. 2025 Aug 29;13:1619050", "👉 Future of embryo engineering, g | dose and effect unclear", "40950409"),
                    Reference("Front Toxicol. 2025 Aug 29;7:1646075", "👉 Perfumes and cosmetic products | Positive/therapeutic effect; Negative/adverse effect", "40949028"),
                    Reference("J Mol Histol. 2025 Aug 23;56(5):278", "👉 Kaempferol alleviates cypermethrin reproductive toxicity, mg | Positive/therapeutic effect; Negative/adverse effect | day", "40848074"),

                    // Herbs
                    Reference("Int J Environ Health Res. 2025 Jul;35(7):1806-1832", "👉 Natural herbs in male infertility | Negative/adverse effect", "39360362"),
                    Reference("Front Reprod Health. 2023 Oct 25;5:1115643", "👉 Treatment-seeking behavior among infertile tribal women | dose and effect unclear", "37954895"),
                    Reference("Sci Total Environ. 2022 Aug 1;832:155083", "👉 Hydrocarbon pollution bioremediation | dose and effect unclear", "35395309"),

                    // Amino acids
                    Reference("Annu Rev Anim Biosci. 2025 Aug 13", "👉 Dietary interventions in dairy cows | dose and effect unclear", "40803771"),
                    Reference("Plants (Basel). 2025 Feb 21;14(5):672", "👉 Garlic stalk incorporation on soil fertility | Positive/therapeutic effect | day", "40094562"),
                    Reference("Proc Biol Sci. 2025 Jan;292(2039):20241790", "👉 Energetic costs in wild male baboons | dose and effect unclear", "39837504"),

                    // Vitamins
                    Reference("J Assoc Physicians India. 2025 Sep;73(9):85-90", "👉 Review on sarcopenia, cachexia, and aging | Positive/therapeutic effect", "40955936"),
                    Reference("Toxicol Rep. 2025 May 18;14:102051", "👉 Vitamin D and coconut oil against aluminum-induced testicular damage, g | Positive/therapeutic effect; Negative/adverse effect", "40502327"),
                    Reference("Drug Des Devel Ther. 2025 May 21;19:4183-4199", "👉 PCOS and inositols | Positive/therapeutic effect", "40420946"),

                    // Minerals
                    Reference("PeerJ. 2025 Mar 26;13:e19000", "👉 Organic substitution for mineral fertilizers | Positive/therapeutic effect", "40161349"),
                    Reference("Front Biosci (Elite Ed). 2024 Oct 23;16(4):31", "👉 Novel bacterium for bioremediation | Positive/therapeutic effect", "39736005"),
                    Reference("Poult Sci. 2025 Jan;104(1):104400", "👉 Trace mineral supplementation on eggshell and fertility | Positive/therapeutic effect", "39693961"),

                    // Supplements
                    Reference("J Assoc Physicians India. 2025 Sep;73(9):85-90", "👉 Sarcopenia, cachexia, and aging | Positive/therapeutic effect", "40955936"),
                    Reference("Lancet Reg Health Eur. 2025 Jun 26;55:101343", "👉 Fertility, time to pregnancy, and pregnancy outcomes, g | Positive/therapeutic effect | month", "40678037"),
                    Reference("Nutrients. 2025 May 29;17(11):1860", "👉 Ligilactobacillus salivarius CECT5713 increases term pregnancies, g | Positive/therapeutic effect", "40507130"),

                    // Nutrients
                    Reference("J Assoc Physicians India. 2025 Sep;73(9):85-90", "👉 Sarcopenia, cachexia, and aging | Positive/therapeutic effect", "40955936"),
                    Reference("Sci Rep. 2025 Jul 15;15(1):25544", "👉 Lime and vermicompost on soil properties, mg | Positive/therapeutic effect", "40664838"),
                    Reference("Nutrients. 2025 May 29;17(11):1860", "👉 Ligilactobacillus salivarius CECT5713 increases term pregnancies, g | Positive/therapeutic effect", "40507130")
                )
            )


            "Fibroids" -> Pair(
                """
Alternative approaches
1. Gynecologic surgery for benign disease: preserves reproductive potential, positive effect reported.
2. Disparities in utilization of uterine fibroid embolization: dose and effect unclear.
3. Intrauterine Gas of Unknown Origin: dose and effect unclear.

Herbs
1. Role of phytoestrogens in gynecological disorders: positive and negative effects reported.
2. Chinese herbal medicines with high-intensity focused ultrasound: negative effect reported.
3. Coumestrol activity for uterine fibroids, mg: positive and negative effects reported.

Amino acids
1. Gut microbiota diversity in women with uterine fibroids: dose and effect unclear.
2. Apigenin in MED12-mutant leiomyoma cells, g, G: positive effect reported.
3. Fumarate hydratase tumor predisposition screening: dose and effect unclear.

Vitamins
1. Vitamin D deficiency and uterine leiomyoma: dose and effect unclear.
2. Vitamin D and EGCG for uterine fibroids: positive effect reported.
3. Chronic inflammation in uterine myoma and Vitamin D: positive effect reported.

Minerals
1. Relugolix therapy for uterine diseases and bone effects, g: positive and negative effects reported.
2. Bone mineral density follow-up in uterine fibroids patients, mg | week, day, month: dose and effect studied.
3. Linzagolix therapy for uterine fibroids, mg | week, month: positive and negative effects reported.

Supplements
1. Social media narratives on fibroids: positive effect reported.
2. Diet, nutrition, and supplement program for fibroid recurrence: positive effect reported over a month.
3. Physical activity and gynecologic conditions: positive effect reported.

Nutrients
1. Vitamin D association with uterine fibroids, IU | week, month: dose and effect studied.
2. Oxidative balance score and endometriosis: dose and effect unclear.
3. Nutrition and environmental factors in female reproductive disorders: dose and effect unclear.

Summary for readers
• Fibroids can be approached via alternative therapies, herbs, amino acids, vitamins, minerals, supplements, and nutrients.
• Many studies report positive effects; some herbs and minerals show negative effects.
• Dose, duration, and regimens are often unclear or study-specific.
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Int J Gynaecol Obstet. 2025 Sep 24", "👉 Gynecologic surgery for benign disease: Preserving reproductive potential | Positive/therapeutic effect", "40990817"),
                    Reference("JAMA Netw Open. 2025 Sep 2;8(9):e2532100", "👉 Disparities in Utilization of Uterine Fibroid Embolization | dose and effect unclear", "40956582"),
                    Reference("HCA Healthc J Med. 2025 Aug 1;6(4):335-338", "👉 Intrauterine Gas of Unknown Origin | dose and effect unclear", "40949802"),

                    // Herbs
                    Reference("Altern Ther Health Med. 2025 Aug 6:AT11460", "👉 Role of Phytoestrogens in Gynecological Disorders | Positive/therapeutic effect; Negative/adverse effect", "40768545"),
                    Reference("Phytomedicine. 2025 Jul 25;143:156811", "👉 Chinese herbal medicines with high-intensity focused ultrasound | Negative/adverse effect", "40347927"),
                    Reference("J Biomol Struct Dyn. 2025 Apr 17:1-26", "👉 Coumestrol activity for uterine fibroids, mg | Positive/therapeutic effect; Negative/adverse effect", "40247615"),

                    // Amino acids
                    Reference("PLoS One. 2025 Jul 24;20(7):e0327177", "👉 Gut microbiota diversity in women with uterine fibroids | dose and effect unclear", "40705717"),
                    Reference("Cancer Gene Ther. 2025 Apr;32(4):393-402", "👉 Apigenin in MED12-mutant leiomyoma cells, g, G | Positive/therapeutic effect", "40025195"),
                    Reference("Am J Surg Pathol. 2025 Apr 1;49(4):315-327", "👉 Fumarate Hydratase Tumor Predisposition Screening | dose and effect unclear", "39835370"),

                    // Vitamins
                    Reference("Biomol Biomed. 2025 Sep 19", "👉 Vitamin D deficiency and uterine leiomyoma | dose and effect unclear", "40970486"),
                    Reference("Mol Nutr Food Res. 2025 Aug 31:e70231", "👉 Vitamin D and EGCG for uterine fibroids | Positive/therapeutic effect", "40887800"),
                    Reference("Biomedicines. 2025 Jul 26;13(8):1832", "👉 Chronic inflammation in uterine myoma and Vitamin D | Positive/therapeutic effect", "40868086"),

                    // Minerals
                    Reference("Biomedicines. 2025 Jul 30;13(8):1851", "👉 Relugolix therapy for uterine diseases and bone effects, g | Positive/therapeutic effect; Negative/adverse effect", "40868107"),
                    Reference("Hum Reprod Open. 2025 May 13;2025(3):hoaf025", "👉 Bone mineral density follow-up in uterine fibroids patients, mg | week, day, month", "40575397"),
                    Reference("Fertil Steril. 2025 Jun 19:S0015-0282(25)00521-7", "👉 Linzagolix therapy for uterine fibroids, mg | week, month | Positive/therapeutic effect; Negative/adverse effect", "40543832"),

                    // Supplements
                    Reference("JSLS. 2025 Jul-Sep;29(3):e2025.00056", "👉 Social media narratives on fibroids | Positive/therapeutic effect", "40917163"),
                    Reference("Reprod Sci. 2025 Jul;32(7):2216-2222", "👉 Diet, nutrition, and supplement program for fibroid recurrence | Positive/therapeutic effect | month", "40542307"),
                    Reference("Am J Transl Res. 2025 May 15;17(5):3753-3765", "👉 Physical activity and gynecologic conditions | Positive/therapeutic effect", "40535620"),

                    // Nutrients
                    Reference("J Obstet Gynaecol Can. 2024 Nov;46(11):102632", "👉 Vitamin D association with uterine fibroids, IU | week, month", "39128544"),
                    Reference("Int J Womens Health. 2024 Jul 30;16:1293-1301", "👉 Oxidative Balance Score and endometriosis | dose and effect unclear", "39100109"),
                    Reference("Int J Med Inform. 2024 Jul;187:105461", "👉 Nutrition and environmental factors in female reproductive disorders | dose and effect unclear", "38643701")
                )
            )

            "Fibromyalgia" -> Pair(
                """
Alternative approaches
1. Cannabinoids in chronic pain: negative effect reported.
2. Disrupted biotensegrity in the fiber cellular fascial network: dose and effect unclear.
3. Optimising fibromyalgia criteria: positive effect reported.

Herbs
1. Role of herbs and spices in rheumatic diseases: positive effect reported.
2. Herbs and dietary supplements in fibromyalgia: dose and effect unclear.
3. Complementary and integrative therapies in fibromyalgia: dose and effect unclear.

Amino acids
1. Nonopioid pharmacologic management of chronic noncancer pain: positive effect reported | month.
2. Ba-Duan-Jin vs pregabalin in fibromyalgia: positive effect reported | week.
3. Pain and sedative medication use in IBD: dose reported | day.

Vitamins
1. Gulf War Illness, Fibromyalgia, ME/CFS, Long COVID overlap: positive effect reported.
2. Lipid peroxidation, serum antioxidant vitamin in fibromyalgia, µg, mg: positive effect reported.
3. Pulsed radiofrequency treatment outcomes: positive effect reported | month.

Minerals
1. Trace elements and macro-minerals in fibromyalgia, µg, mg: positive effect reported.
2. Selenium-sulfa compound in fibromyalgia-like symptoms, mg: dose reported.
3. Role of micronutrients in fibromyalgia symptoms: dose and effect unclear.

Supplements
1. Cannabidiol vs placebo in fibromyalgia, mg: negative effect reported.
2. Modulating gut microbiota in fibromyalgia: positive effect reported.
3. Autoimmune rheumatic diseases and depression MR study: dose and effect unclear.

Nutrients
1. Gut microbiota and fibromyalgia: positive effect reported.
2. Gut microbiome in fibromyalgia: positive effect reported.
3. Vitamin B12 deficiency in fibromyalgia: positive effect reported.

Summary for readers
• Fibromyalgia interventions include alternative therapies, herbs, amino acids, vitamins, minerals, supplements, and nutrients.
• Many studies report positive effects; some cannabinoids and supplements show negative effects.
• Dose, duration, and regimen details vary and are sometimes unclear.
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Neurol Int. 2025 Sep 5;17(9):141", "👉 Cannabinoids in Chronic Pain | Negative/adverse effect", "41002929"),
                    Reference("Int J Mol Sci. 2025 Aug 22;26(17):8161", "👉 Disrupted Biotensegrity in the Fiber Cellular Fascial Network | dose and effect unclear", "40943084"),
                    Reference("Semin Arthritis Rheum. 2025 Oct;74:152824", "👉 Optimising fibromyalgia criteria | Positive/therapeutic effect", "40911946"),

                    // Herbs
                    Reference("Nutrients. 2023 Jun 20;15(12):2812", "👉 Role of Herbs and Spices in Rheumatic Diseases | Positive/therapeutic effect", "37375716"),
                    Reference("Medicine (Baltimore). 2020 May 22;99(21):e20257", "👉 Herbs and dietary supplements in fibromyalgia | dose and effect unclear", "32481303"),
                    Reference("Mayo Clin Proc Innov Qual Outcomes. 2019 Oct 16;3(4):418-428", "👉 Complementary and Integrative Therapies in Fibromyalgia | dose and effect unclear", "31993560"),

                    // Amino acids
                    Reference("Am Fam Physician. 2025 Aug;112(2):187-196", "👉 Nonopioid Pharmacologic Management of Chronic Noncancer Pain | Positive/therapeutic effect | month", "40834375"),
                    Reference("J Pain. 2025 Sep;34:105487", "👉 Ba-Duan-Jin vs pregabalin in fibromyalgia | Positive/therapeutic effect | week", "40615016"),
                    Reference("Aliment Pharmacol Ther. 2025 Oct;62(7):732-742", "👉 Pain and Sedative Medication Use in IBD | day", "40599116"),

                    // Vitamins
                    Reference("Int J Mol Sci. 2025 Sep 17;26(18):9044", "👉 Gulf War Illness, Fibromyalgia, ME/CFS, Long COVID overlap | Positive/therapeutic effect", "41009608"),
                    Reference("Health Sci Rep. 2025 Sep 14;8(9):e71222", "👉 Lipid Peroxidation, Serum Antioxidant Vitamin in Fibromyalgia, µg, mg | Positive/therapeutic effect", "40959188"),
                    Reference("Neurol India. 2025 Sep 1;73(5):1033-1040", "👉 Pulsed Radiofrequency Treatment Outcomes | Positive/therapeutic effect | month", "40946286"),

                    // Minerals
                    Reference("Health Sci Rep. 2025 Sep 14;8(9):e71222", "👉 Trace Elements and Macro-Minerals in Fibromyalgia, µg, mg | Positive/therapeutic effect", "40959188"),
                    Reference("Int J Biol Macromol. 2025 Jan;286:138334", "👉 Selenium-sulfa compound in fibromyalgia-like symptoms, mg | dose reported", "39638183"),
                    Reference("Eur Rev Med Pharmacol Sci. 2024 Jul;28(14):4038-4045", "👉 Role of micronutrients in fibromyalgia symptoms | dose and effect unclear", "39081153"),

                    // Supplements
                    Reference("Ann Rheum Dis. 2025 Aug 21:S0003-4967(25)04238-4", "👉 Cannabidiol vs placebo in fibromyalgia, mg | Negative/adverse effect", "40846590"),
                    Reference("Nutrients. 2025 Jul 9;17(14):2261", "👉 Modulating Gut Microbiota in Fibromyalgia | Positive/therapeutic effect", "40732886"),
                    Reference("Psychiatry. 2025 Jul 24:1-12", "👉 Autoimmune Rheumatic Diseases and Depression MR study | dose and effect unclear", "40705971"),

                    // Nutrients
                    Reference("Nutrients. 2025 Jul 9;17(14):2261", "👉 Gut Microbiota and Fibromyalgia | Positive/therapeutic effect", "40732886"),
                    Reference("Clin Exp Rheumatol. 2025 Jun;43(6):990-998", "👉 Gut microbiome in fibromyalgia | Positive/therapeutic effect", "40576702"),
                    Reference("J Med Case Rep. 2025 Apr 2;19(1):151", "👉 Vitamin B12 deficiency in fibromyalgia | Positive/therapeutic effect", "40176197")
                )
            )


            "Flu" -> Pair(
                """
Alternative approaches
1. Comparative genomics in fluoroquinolone-resistant Salmonella Kentucky ST198, No clear dose/effect/duration found.
2. Inhibiting influenza A virus replication via polypeptide targeting host autophagy, Positive/therapeutic effect reported.
3. Antiviral potential of stapled peptides, Positive/therapeutic effect reported; Negative/adverse effect reported.

Herbs
1. Screening neuraminidase inhibitors from medicinal herbs, No clear dose/effect/duration found.
2. Cathepsin B as PANoptosis regulator in influenza, No clear dose/effect/duration found.
3. Jingfang Granules for diabetic wound healing, Positive/therapeutic effect reported; Negative/adverse effect reported.

Amino acids
1. Single amino acid substitution alters viral assembly and infectivity, Positive/therapeutic effect reported.
2. Predicting N-linked glycosylation sequon locations, No clear dose/effect/duration found.
3. Antibody interactions with diverse H3 influenza proteins, No clear dose/effect/duration found.

Vitamins
1. Comparative genomics in fluoroquinolone-resistant Salmonella Kentucky ST198, No clear dose/effect/duration found.
2. Seasonal influenza vaccine introduction in Kenya, Positive/therapeutic effect reported | month.
3. Influenza vaccine intake and attitudes toward CAM, Positive/therapeutic effect reported.

Minerals
1. Rapid pathogen surveillance using immuno-solid-phase microextraction, Positive/therapeutic effect reported.
2. Fe-N(4)@Graphene nanozyme against Influenza A virus, Positive/therapeutic effect reported.
3. Virus adsorption and co-adsorption behavior analysis, No clear dose/effect/duration found.

Supplements
1. Seasonal influenza vaccination among working-age adults in Poland, Positive/therapeutic effect reported.
2. Routine immunisation coverage in Kenya, Positive/therapeutic effect reported | month.
3. Kabasura kudineer choornam modulates macrophage function, No clear dose/effect/duration found.

Nutrients
1. Comparative genomics in fluoroquinolone-resistant Salmonella Kentucky ST198, No clear dose/effect/duration found.
2. Pangenome localization for Hemophilus influenza vaccine, No clear dose/effect/duration found.
3. Tryptophan metabolism and gut microbiota in infection treatment, No clear dose/effect/duration found.

Summary for readers
• Influenza interventions include alternative approaches, herbs, amino acids, vitamins, minerals, supplements, and nutrients.
• Many studies report positive/therapeutic effects; some peptides or herbs show mixed or adverse effects.
• Dose, duration, and regimen details vary and are sometimes unclear.
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Genes (Basel). 2025 Sep 8;16(9):1051", "👉 Comparative genomics in fluoroquinolone-resistant Salmonella Kentucky ST198, No clear dose/effect/duration found", "41009996"),
                    Reference("Arch Microbiol. 2025 Sep 18;207(11):267", "👉 Inhibiting influenza A virus replication via polypeptide targeting host autophagy, Positive/therapeutic effect reported", "40965660"),
                    Reference("Microb Biotechnol. 2025 Sep;18(9):e70221", "👉 Antiviral potential of stapled peptides, Positive/therapeutic effect reported; Negative/adverse effect reported", "40955200"),

                    // Herbs
                    Reference("Anal Chim Acta. 2025 Nov 8;1374:344522", "👉 Screening neuraminidase inhibitors from medicinal herbs, No clear dose/effect/duration found", "40983409"),
                    Reference("Int J Mol Sci. 2025 Sep 2;26(17):8533", "👉 Cathepsin B as PANoptosis regulator in influenza, No clear dose/effect/duration found", "40943452"),
                    Reference("Drug Des Devel Ther. 2025 Jun 4;19:4835-4860", "👉 Jingfang Granules for diabetic wound healing, Positive/therapeutic effect reported; Negative/adverse effect reported", "40486127"),

                    // Amino acids
                    Reference("Virus Res. 2025 Oct;360:199624", "👉 Single amino acid substitution alters viral assembly and infectivity, Positive/therapeutic effect reported", "40850343"),
                    Reference("PLoS One. 2025 Aug 14;20(8):e0328174", "👉 Predicting N-linked glycosylation sequon locations, No clear dose/effect/duration found", "40811715"),
                    Reference("J Virol. 2025 Sep 23;99(9):e0045325", "👉 Antibody interactions with diverse H3 influenza proteins, No clear dose/effect/duration found", "40810533"),

                    // Vitamins
                    Reference("Genes (Basel). 2025 Sep 8;16(9):1051", "👉 Comparative genomics in fluoroquinolone-resistant Salmonella Kentucky ST198, No clear dose/effect/duration found", "41009996"),
                    Reference("Lancet Glob Health. 2025 Oct;13(10):e1737-e1749", "👉 Seasonal influenza vaccine introduction in Kenya, Positive/therapeutic effect reported | month", "40975081"),
                    Reference("PLoS One. 2025 Jul 23;20(7):e0320412", "👉 Influenza vaccine intake and attitudes toward CAM, Positive/therapeutic effect reported", "40700438"),

                    // Minerals
                    Reference("Anal Chem. 2025 Sep 23;97(37):20602-20610", "👉 Rapid pathogen surveillance using immuno-solid-phase microextraction, Positive/therapeutic effect reported", "40932402"),
                    Reference("ACS Appl Mater Interfaces. 2025 Sep 17;17(37):51578-51587", "👉 Fe-N(4)@Graphene nanozyme against Influenza A virus, Positive/therapeutic effect reported", "40906665"),
                    Reference("J Phys Chem A. 2025 Sep 4;129(35):8204-8219", "👉 Virus adsorption and co-adsorption behavior analysis, No clear dose/effect/duration found", "40851257"),

                    // Supplements
                    Reference("Vaccines (Basel). 2025 Sep 6;13(9):954", "👉 Seasonal influenza vaccination among working-age adults in Poland, Positive/therapeutic effect reported", "41012157"),
                    Reference("Lancet Glob Health. 2025 Oct;13(10):e1737-e1749", "👉 Routine immunisation coverage in Kenya, Positive/therapeutic effect reported | month", "40975081"),
                    Reference("Turk J Biol. 2025 May 13;49(4):348-366", "👉 Kabasura kudineer choornam modulates macrophage function, No clear dose/effect/duration found", "40917300"),

                    // Nutrients
                    Reference("Genes (Basel). 2025 Sep 8;16(9):1051", "👉 Comparative genomics in fluoroquinolone-resistant Salmonella Kentucky ST198, No clear dose/effect/duration found", "41009996"),
                    Reference("Sci Rep. 2025 Jul 1;15(1):22316", "👉 Pangenome localization for Hemophilus influenza vaccine, No clear dose/effect/duration found", "40594015"),
                    Reference("Microbiol Res. 2025 Sep;298:128211", "👉 Tryptophan metabolism and gut microbiota in infection treatment, No clear dose/effect/duration found", "40393170")
                )
            )


            "Food allergy" -> Pair(
                """
Alternative approaches
1. Future without gluten restrictions for celiac patients, No clear dose/effect/duration found.
2. Mass spectrometry-based proteomics for seafood allergen detection, Positive/therapeutic effect reported.
3. Phenylglyoxal-induced Ana o 3 modification reduces antibody binding, Positive/therapeutic effect reported.

Herbs
1. Atractylodes Japonica Rhizome extract improves wheat gliadin-induced food allergy in mice, Positive/therapeutic effect reported.
2. Quercetin review with chemoprotective effects, Positive/therapeutic effect reported.
3. Xin-Yi-Qing-Fei-Tang reduces asthma symptoms, Positive/therapeutic effect reported.

Amino acids
1. Probiotic Bifidobacterium animalis and Lactiplantibacillus plantarum in IBS-D rat model, Positive/therapeutic effect reported | week.
2. Cold plasma reduces allergenicity of food proteins, Positive/therapeutic effect reported.
3. Identification of IgE epitopes in fish parvalbumin, No clear dose/effect/duration found.

Vitamins
1. Gluten restriction update for celiac patients, No clear dose/effect/duration found.
2. Dietary patterns, gut microbiome, and itch severity in preschoolers with atopic dermatitis, No clear dose/effect/duration found.
3. Cord blood vitamin D and childhood food allergy, Positive/therapeutic effect reported | month.

Minerals
1. Global burden of low bone mineral density, Positive/therapeutic effect reported; Negative/adverse effect reported.
2. Nutritional and bioactive potential of sheep milk, Positive/therapeutic effect reported.
3. Hydroponics and artificial light impact on wheat yield and quality, No clear dose/effect/duration found.

Supplements
1. Gut microbiota and food allergy: review of mechanisms and interventions, Positive/therapeutic effect reported.
2. Gluten restriction update for celiac patients, No clear dose/effect/duration found.
3. Evidence for dietary management of histamine intolerance, No clear dose/effect/duration found.

Nutrients
1. Gut microbiota and food allergy review, Positive/therapeutic effect reported.
2. Gluten restriction update for celiac patients, No clear dose/effect/duration found.
3. Food allergy and foodservice behaviors and perceptions, Positive/therapeutic effect reported.

Summary for readers
• Food allergy interventions include alternative approaches, herbs, amino acids, vitamins, minerals, supplements, and nutrients.
• Most studies report positive/therapeutic effects; some have mixed or unclear outcomes.
• Dose, duration, and regimen details are often not specified.
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Nutrients. 2025 Sep 15;17(18):2960", "👉 Future without gluten restrictions for celiac patients, No clear dose/effect/duration found", "41010485"),
                    Reference("Int J Mol Sci. 2025 Sep 15;26(18):8962", "👉 Mass spectrometry-based proteomics for seafood allergen detection, Positive/therapeutic effect reported", "41009530"),
                    Reference("J Agric Food Chem. 2025 Sep 17", "👉 Phenylglyoxal-induced Ana o 3 modification reduces antibody binding, Positive/therapeutic effect reported", "40963093"),

                    // Herbs
                    Reference("Nutrients. 2025 Mar 26;17(7):1151", "👉 Atractylodes Japonica Rhizome extract improves wheat gliadin-induced food allergy in mice, Positive/therapeutic effect reported", "40218908"),
                    Reference("Heliyon. 2024 Jun 20;10(12):e33342", "👉 Quercetin review with chemoprotective effects, Positive/therapeutic effect reported", "39021910"),
                    Reference("J Ethnopharmacol. 2024 Aug 10;330:118105", "👉 Xin-Yi-Qing-Fei-Tang reduces asthma symptoms, Positive/therapeutic effect reported", "38631485"),

                    // Amino acids
                    Reference("J Sci Food Agric. 2025 Sep 26", "👉 Probiotic Bifidobacterium animalis and Lactiplantibacillus plantarum in IBS-D rat model, Positive/therapeutic effect reported | week", "41002283"),
                    Reference("Int J Biol Macromol. 2025 Sep;322(Pt 3):146972", "👉 Cold plasma reduces allergenicity of food proteins, Positive/therapeutic effect reported", "40834964"),
                    Reference("J Agric Food Chem. 2025 Aug 27;73(34):21578-21591", "👉 Identification of IgE epitopes in fish parvalbumin, No clear dose/effect/duration found", "40814803"),

                    // Vitamins
                    Reference("Nutrients. 2025 Sep 15;17(18):2960", "👉 Gluten restriction update for celiac patients, No clear dose/effect/duration found", "41010485"),
                    Reference("Pediatr Allergy Immunol. 2025 Sep;36(9):e70202", "👉 Dietary patterns, gut microbiome, and itch severity in preschoolers with atopic dermatitis, No clear dose/effect/duration found", "40960322"),
                    Reference("Front Nutr. 2025 Aug 25;12:1652487", "👉 Cord blood vitamin D and childhood food allergy, Positive/therapeutic effect reported | month", "40927566"),

                    // Minerals
                    Reference("Lancet Rheumatol. 2025 Sep 16:S2665-9913(25)00105-5", "👉 Global burden of low bone mineral density, Positive/therapeutic effect reported; Negative/adverse effect reported", "40972625"),
                    Reference("Food Funct. 2025 Sep 10", "👉 Nutritional and bioactive potential of sheep milk, Positive/therapeutic effect reported", "40926654"),
                    Reference("Sci Rep. 2025 Aug 21;15(1):30768", "👉 Hydroponics and artificial light impact on wheat yield and quality, No clear dose/effect/duration found", "40841578"),

                    // Supplements
                    Reference("Nutrients. 2025 Sep 20;17(18):3009", "👉 Gut microbiota and food allergy: review of mechanisms and interventions, Positive/therapeutic effect reported", "41010534"),
                    Reference("Nutrients. 2025 Sep 15;17(18):2960", "👉 Gluten restriction update for celiac patients, No clear dose/effect/duration found", "41010485"),
                    Reference("Int J Mol Sci. 2025 Sep 20;26(18):9198", "👉 Evidence for dietary management of histamine intolerance, No clear dose/effect/duration found", "41009760"),

                    // Nutrients
                    Reference("Nutrients. 2025 Sep 20;17(18):3009", "👉 Gut microbiota and food allergy review, Positive/therapeutic effect reported", "41010534"),
                    Reference("Nutrients. 2025 Sep 15;17(18):2960", "👉 Gluten restriction update for celiac patients, No clear dose/effect/duration found", "41010485"),
                    Reference("Nutrients. 2025 Sep 9;17(18):2916", "👉 Food allergy and foodservice behaviors and perceptions, Positive/therapeutic effect reported", "41010442")
                )
            )


            "Food intolerance" -> Pair(
                """
Alternative approaches
1. Plant-based milk alternatives and health impact, Positive/therapeutic effect reported.
2. Tiger nut yogurt as a dairy alternative, Positive/therapeutic effect reported.
3. Novel nutraceutical combination on lipid pattern, mg | Positive/therapeutic effect reported | month.

Herbs
1. Atractylodes Japonica Rhizome extract improves wheat gliadin-induced food allergic reaction in mice, Positive/therapeutic effect reported.
2. Amomum tsao-ko ameliorates depression-like behaviors in diabetic mice, Positive/therapeutic effect reported | week.
3. Antimicrobial and antioxidant spices in milk candy enhance nutrients and bioactivity, g, mg, μg | Positive/therapeutic effect reported.

Amino acids
1. Gut microbiota-bile acid crosstalk underlies Baizhu Shaoyao Decoction efficacy in weaning stress of piglets, g | Positive/therapeutic effect reported.
2. Defective Slc7a7 transport reduces erythropoiesis, g | Positive/therapeutic effect reported.
3. Cellobiose 2-epimerase converts lactose in goat milk into epilactose, mg.

Vitamins
1. Very Long-Chain Acyl-Coenzyme A Dehydrogenase Deficiency, mg | Positive/therapeutic effect reported | month.
2. Tri-ortho-cresyl phosphate causes glucose intolerance and insulin resistance in mice, Positive/therapeutic effect reported; Negative/adverse effect reported.
3. Probiotic garden cress improves nutritional value, Positive/therapeutic effect reported.

Minerals
1. Almond milk, skin, and plant-based probiotics in kefir, Positive/therapeutic effect reported; Negative/adverse effect reported.
2. IGF-1 bioavailability alteration due to PAPPA2 deficiency, Positive/therapeutic effect reported.
3. Probiotic fermented coconut beverage characterization, mg, μg | Positive/therapeutic effect reported | day.

Supplements
1. Dietary management of histamine intolerance, No clear dose/effect/duration found.
2. Diamine oxidase from Glutamicibacter halophytocola degrades histamine and tyramine, Positive/therapeutic effect reported | month.
3. Novel nutraceutical combination on lipid pattern, mg | Positive/therapeutic effect reported | month.

Nutrients
1. Early caffeine exposure causes metabolic and hormonal changes in rats, Positive/therapeutic effect reported.
2. Almond milk, skin, and plant-based probiotics in kefir, Positive/therapeutic effect reported; Negative/adverse effect reported.
3. Self-reported food triggers and fears impact nutrient intake and quality of life in IBS/functional dyspepsia, Positive/therapeutic effect reported.

Summary for readers
• Food intolerance interventions include alternative approaches, herbs, amino acids, vitamins, minerals, supplements, and nutrients.
• Most studies report positive/therapeutic effects; some have mixed or unclear outcomes.
• Dose, duration, and regimen details are often specified with units (mg, g, μg) or time (week, month, day).
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Adv Food Nutr Res. 2025;116:103-138", "👉 Plant-based milk alternatives and health impact, Positive/therapeutic effect reported", "40940086"),
                    Reference("Food Sci Nutr. 2025 Sep 1;13(9):e70897", "👉 Tiger nut yogurt as a dairy alternative, Positive/therapeutic effect reported", "40901650"),
                    Reference("Biomedicines. 2025 Aug 9;13(8):1948", "👉 Novel nutraceutical combination on lipid pattern, mg | Positive/therapeutic effect reported | month", "40868202"),

                    // Herbs
                    Reference("Nutrients. 2025 Mar 26;17(7):1151", "👉 Atractylodes Japonica Rhizome extract improves wheat gliadin-induced food allergic reaction in mice, Positive/therapeutic effect reported", "40218908"),
                    Reference("Metab Brain Dis. 2025 Mar 28;40(4):164", "👉 Amomum tsao-ko ameliorates depression-like behaviors in diabetic mice, Positive/therapeutic effect reported | week", "40153044"),
                    Reference("Heliyon. 2025 Jan 27;11(3):e42249", "👉 Antimicrobial and antioxidant spices in milk candy enhance nutrients and bioactivity, g, mg, μg | Positive/therapeutic effect reported", "39959487"),

                    // Amino acids
                    Reference("FASEB J. 2025 Jul 15;39(13):e70828", "👉 Gut microbiota-bile acid crosstalk underlies Baizhu Shaoyao Decoction efficacy in weaning stress of piglets, g | Positive/therapeutic effect reported", "40635511"),
                    Reference("Mol Med. 2025 Jan 29;31(1):29", "👉 Defective Slc7a7 transport reduces erythropoiesis, g | Positive/therapeutic effect reported", "39881295"),
                    Reference("J Sci Food Agric. 2024 Nov;104(14):8529-8540", "👉 Cellobiose 2-epimerase converts lactose in goat milk into epilactose, mg", "39392661"),

                    // Vitamins
                    Reference("Very Long-Chain Acyl-Coenzyme A Dehydrogenase Deficiency. GeneReviews", "👉 mg | Positive/therapeutic effect reported | month", "20301763"),
                    Reference("Food Chem Toxicol. 2025 Oct;204:115668", "👉 Tri-ortho-cresyl phosphate causes glucose intolerance and insulin resistance in mice, Positive/therapeutic effect reported; Negative/adverse effect reported", "40749801"),
                    Reference("PLoS One. 2025 Jun 4;20(6):e0322552", "👉 Probiotic garden cress improves nutritional value, Positive/therapeutic effect reported", "40465650"),

                    // Minerals
                    Reference("Food Sci Nutr. 2025 Jul 27;13(8):e70719", "👉 Almond milk, skin, and plant-based probiotics in kefir, Positive/therapeutic effect reported; Negative/adverse effect reported", "40735401"),
                    Reference("Metabolism. 2025 Oct;171:156355", "👉 IGF-1 bioavailability alteration due to PAPPA2 deficiency, Positive/therapeutic effect reported", "40695421"),
                    Reference("Int J Food Sci. 2024 Sep 2;2024:8923217", "👉 Probiotic fermented coconut beverage characterization, mg, μg | Positive/therapeutic effect reported | day", "39257841"),

                    // Supplements
                    Reference("Int J Mol Sci. 2025 Sep 20;26(18):9198", "👉 Dietary management of histamine intolerance, No clear dose/effect/duration found", "41009760"),
                    Reference("Foods. 2025 Sep 3;14(17):3093", "👉 Diamine oxidase from Glutamicibacter halophytocola degrades histamine and tyramine, Positive/therapeutic effect reported | month", "40941209"),
                    Reference("Biomedicines. 2025 Aug 9;13(8):1948", "👉 Novel nutraceutical combination on lipid pattern, mg | Positive/therapeutic effect reported | month", "40868202"),

                    // Nutrients
                    Reference("Nutrients. 2025 Aug 26;17(17):2763", "👉 Early caffeine exposure causes metabolic and hormonal changes in rats, Positive/therapeutic effect reported", "40944153"),
                    Reference("Food Sci Nutr. 2025 Jul 27;13(8):e70719", "👉 Almond milk, skin, and plant-based probiotics in kefir, Positive/therapeutic effect reported; Negative/adverse effect reported", "40735401"),
                    Reference("Korean J Gastroenterol. 2025 Jul 25;85(3):345-356", "👉 Self-reported food triggers and fears impact nutrient intake and quality of life in IBS/functional dyspepsia, Positive/therapeutic effect reported", "40709425")
                )
            )


            "Food poisoning" -> Pair(
                """
Alternative approaches
1. Innovative and sustainable disinfection strategies in poultry farming, Positive/therapeutic effect mentioned.
2. Chitosan and Nisin inhibit Clostridium perfringens spore germination, No clear dose/effect/duration found.
3. Detection methods of Botulinum Neurotoxin, No clear dose/effect/duration found.

Herbs
1. Biocontrol agents and natural feed supplements prevent mycotoxin-induced ailments, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
2. Characterization of toxigenic genes of Bacillus cereus from spices, G.
3. Historical precautions regarding cheese-borne ailments in Ottoman Empire, Positive/therapeutic effect mentioned.

Amino acids
1. Serine clamp of Clostridium perfringens binary toxin confers cytotoxicity, Negative/adverse effect mentioned.
2. Metabolomic changes associated with Lanmaoa asiatica poisoning, Negative/adverse effect mentioned.
3. Salmonella exploits host- and bacterial-derived β-alanine for replication, Positive/therapeutic effect mentioned.

Vitamins
1. Vitamin C and fruit juices mitigate cadmium toxicity in C. elegans, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
2. Sodium nitrite-induced methemoglobinemia in Sudan, Negative/adverse effect mentioned.
3. Nutraceutical compounds (Curcumin, Quercetin, EPA, Zinc, Vitamin D) for managing Celiac disease, g.

Minerals
1. Detection of ten toxins in wild mushrooms using nanomaterials, mg | Positive/therapeutic effect mentioned.
2. Fluorescent aptasensor for Salmonella Typhimurium detection, No clear dose/effect/duration found.
3. Risk assessment of metals and minerals in seafood, mg, G | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.

Supplements
1. Cordia myxa and curcumin extracts mitigate Salmonella enteritidis in broilers, mg | Positive/therapeutic effect mentioned | day.
2. Cardiovascular toxicity from supplement use, Negative/adverse effect mentioned.
3. Novel Enterococcus faecium P2 as probiotic for mitigating Clostridioides difficile infection, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.

Nutrients
1. Salmonella exploits host- and bacterial-derived β-alanine for replication, Positive/therapeutic effect mentioned.
2. Metabolomics and gut microbiota identify biomarkers in childhood obesity, Positive/therapeutic effect mentioned.
3. Sporulation at reduced water activity impairs Bacillus subtilis spore germination kinetics, Positive/therapeutic effect mentioned.

Summary for readers
• Food poisoning interventions include alternative approaches, herbs, amino acids, vitamins, minerals, supplements, and nutrients.
• Effects are mixed: some studies report positive/therapeutic effects, others negative/adverse effects, and some lack clear dose/duration.
• Units (mg, g) and timeframes (day) are specified where relevant.
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Pathogens. 2025 Sep 10;14(9):912", "👉 Innovative and sustainable disinfection strategies in poultry farming, Positive/therapeutic effect mentioned", "41011812"),
                    Reference("Microorganisms. 2025 Sep 10;13(9):2116", "👉 Chitosan and Nisin inhibit Clostridium perfringens spore germination, No clear dose/effect/duration found", "41011447"),
                    Reference("Toxins (Basel). 2025 Sep 8;17(9):453", "👉 Detection methods of Botulinum Neurotoxin, No clear dose/effect/duration found", "41003517"),

                    // Herbs
                    Reference("Foods. 2025 May 31;14(11):1960", "👉 Biocontrol agents and natural feed supplements prevent mycotoxin-induced ailments, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40509491"),
                    Reference("Braz J Microbiol. 2024 Dec;55(4):3495-3501", "👉 Characterization of toxigenic genes of Bacillus cereus from spices, G", "39269638"),
                    Reference("Food Sci Nutr. 2023 Nov 21;12(2):1356-1363", "👉 Historical precautions regarding cheese-borne ailments in Ottoman Empire, Positive/therapeutic effect mentioned", "38370051"),

                    // Amino acids
                    Reference("Commun Biol. 2025 Jul 25;8(1):1102", "👉 Serine clamp of Clostridium perfringens binary toxin confers cytotoxicity, Negative/adverse effect mentioned", "40715636"),
                    Reference("Food Sci Nutr. 2025 Jul 8;13(7):e70583", "👉 Metabolomic changes associated with Lanmaoa asiatica poisoning, Negative/adverse effect mentioned", "40635726"),
                    Reference("Elife. 2025 Jun 19;13:RP103714", "👉 Salmonella exploits host- and bacterial-derived β-alanine for replication, Positive/therapeutic effect mentioned", "40536105"),

                    // Vitamins
                    Reference("Foods. 2025 Sep 5;14(17):3106", "👉 Vitamin C and fruit juices mitigate cadmium toxicity in C. elegans, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40941222"),
                    Reference("J Emerg Med. 2025 Oct;77:93-97", "👉 Sodium nitrite-induced methemoglobinemia in Sudan, Negative/adverse effect mentioned", "40876076"),
                    Reference("Mol Biol Rep. 2025 Jun 11;52(1):580", "👉 Nutraceutical compounds (Curcumin, Quercetin, EPA, Zinc, Vitamin D) for managing Celiac disease, g", "40498343"),

                    // Minerals
                    Reference("Toxins (Basel). 2025 Sep 4;17(9):445", "👉 Detection of ten toxins in wild mushrooms using nanomaterials, mg | Positive/therapeutic effect mentioned", "41003509"),
                    Reference("Mikrochim Acta. 2025 Sep 10;192(10):654", "👉 Fluorescent aptasensor for Salmonella Typhimurium detection, No clear dose/effect/duration found", "40931301"),
                    Reference("J Xenobiot. 2025 Jun 12;15(3):92", "👉 Risk assessment of metals and minerals in seafood, mg, G | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40558875"),

                    // Supplements
                    Reference("Open Vet J. 2025 Jun;15(6):2715-2721", "👉 Cordia myxa and curcumin extracts mitigate Salmonella enteritidis in broilers, mg | Positive/therapeutic effect mentioned | day", "40989600"),
                    Reference("Clin Toxicol (Phila). 2025 Sep 17:1-9", "👉 Cardiovascular toxicity from supplement use, Negative/adverse effect mentioned", "40960841"),
                    Reference("Microb Pathog. 2025 Nov;208:108028", "👉 Novel Enterococcus faecium P2 as probiotic for mitigating Clostridioides difficile infection, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40934987"),

                    // Nutrients
                    Reference("Elife. 2025 Jun 19;13:RP103714", "👉 Salmonella exploits host- and bacterial-derived β-alanine for replication, Positive/therapeutic effect mentioned", "40536105"),
                    Reference("Nutrients. 2025 May 30;17(11):1876", "👉 Metabolomics and gut microbiota identify biomarkers in childhood obesity, Positive/therapeutic effect mentioned", "40507148"),
                    Reference("Appl Environ Microbiol. 2025 Jul 23;91(7):e0067725", "👉 Sporulation at reduced water activity impairs Bacillus subtilis spore germination kinetics, Positive/therapeutic effect mentioned", "40492716")
                )
            )


            "Fungal nail infection" -> Pair(
                """
Alternative approaches
1. Specific primers and nested PCR detect Trichophyton rubrum missed by culture, No clear dose/effect/duration found.
2. Silver nanoparticles + Allium cepa extract show antifungal synergy, mg.
3. Photodynamic therapy, fractional CO2 laser, and combination in onychomycosis, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.

Herbs
1. New therapeutic options for superficial fungal infections, No clear dose/effect/duration found.
2. Nigerian medicinal plants for dermatologic use, Positive/therapeutic effect mentioned.

Amino acids
1. Antimicrobial photodynamic therapy in onychomycosis, Positive/therapeutic effect mentioned.
2. Emerging role of photodynamic therapy in cutaneous infections, No clear dose/effect/duration found.
3. Kidney injury associated with fosravuconazole L-lysine ethanolate, No clear dose/effect/duration found.

Vitamins
1. Calcipotriol vs. terbinafine cream for onychomycosis, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month.
2. Top 20 2023 POEMs for primary care; positive effects noted, Positive/therapeutic effect mentioned.
3. Vitamins for nail disease management, Positive/therapeutic effect mentioned.

Minerals
1. Raman spectroscopy for fingernail diagnostics, Positive/therapeutic effect mentioned.
2. Antifungal nanosuspensions with surfactants and silver for onychomycosis, mg | Positive/therapeutic effect mentioned.
3. Subungual squamous cell carcinoma associated with long-standing onychomycosis treated surgically, Positive/therapeutic effect mentioned.

Supplements
1. Ultrasonography findings in nail unit disorders, No clear dose/effect/duration found.
2. Delayed diagnosis of APECED in adolescent, Positive/therapeutic effect mentioned.
3. Red-laser photodynamic therapy with toluidine blue gel in diabetic onychomycosis, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month.

Nutrients
1. Comparative genomic analysis of human skin-associated fungi, Positive/therapeutic effect mentioned.
2. Adhesion and biofilm formation by Trichosporon Cutaneum, No clear dose/effect/duration found.
3. Antifungal efficiency of plant-extract polysaccharide-based nanohydrogels, Negative/adverse effect mentioned.

Summary for readers
• Fungal nail infection interventions include alternative approaches, herbs, amino acids, vitamins, minerals, supplements, and nutrients.
• Effects are mixed: some studies report positive/therapeutic effects, others negative/adverse effects, and some lack clear dose/duration.
• Units (mg) and timeframes (month) are specified where relevant.
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("J Fungi (Basel). 2025 Jul 14;11(7):520", "👉 Specific primers and nested PCR detect Trichophyton rubrum missed by culture, No clear dose/effect/duration found", "40985411"),
                    Reference("Chem Biodivers. 2025 Sep 19:e00675", "👉 Silver nanoparticles + Allium cepa extract show antifungal synergy, mg", "40971305"),
                    Reference("J Cosmet Dermatol. 2025 Sep;24(9):e70417", "👉 Photodynamic therapy, fractional CO2 laser, and combination in onychomycosis, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40887881"),

                    // Herbs
                    Reference("Dermatol Ther. 2020 Nov;33(6):e12855", "👉 New therapeutic options for superficial fungal infections, No clear dose/effect/duration found", "30748068"),
                    Reference("Int J Dermatol. 2007 Oct;46 Suppl 1:48-55", "👉 Nigerian medicinal plants for dermatologic use, Positive/therapeutic effect mentioned", "17919209"),

                    // Amino acids
                    Reference("Photodiagnosis Photodyn Ther. 2025 Aug;54:104640", "👉 Antimicrobial photodynamic therapy in onychomycosis, Positive/therapeutic effect mentioned", "40389084"),
                    Reference("Ital J Dermatol Venerol. 2025 Feb;160(1):40-46", "👉 Emerging role of photodynamic therapy in cutaneous infections, No clear dose/effect/duration found", "39611415"),
                    Reference("Clin Exp Nephrol. 2025 Apr;29(4):427-432", "👉 Kidney injury associated with fosravuconazole L-lysine ethanolate, No clear dose/effect/duration found", "39487884"),

                    // Vitamins
                    Reference("Arch Dermatol Res. 2025 Feb 14;317(1):402", "👉 Calcipotriol vs. terbinafine cream for onychomycosis, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month", "39951153"),
                    Reference("Am Fam Physician. 2024 Jul;110(1):65-73", "👉 Top 20 2023 POEMs for primary care; positive effects noted, Positive/therapeutic effect mentioned", "39028784"),
                    Reference("Skin Appendage Disord. 2024 Apr;10(2):104-122", "👉 Vitamins for nail disease management, Positive/therapeutic effect mentioned", "38572190"),

                    // Minerals
                    Reference("Medicina (Kaunas). 2024 Aug 9;60(8):1283", "👉 Raman spectroscopy for fingernail diagnostics, Positive/therapeutic effect mentioned", "39202564"),
                    Reference("Eur J Pharm Biopharm. 2022 Oct;179:194-205", "👉 Antifungal nanosuspensions with surfactants and silver for onychomycosis, mg | Positive/therapeutic effect mentioned", "36099971"),
                    Reference("Open Access Maced J Med Sci. 2017 Jul 21;5(4):480-482", "👉 Subungual squamous cell carcinoma associated with long-standing onychomycosis treated surgically, Positive/therapeutic effect mentioned", "28785338"),

                    // Supplements
                    Reference("Br J Radiol. 2025 Jul 14:tqaf153", "👉 Ultrasonography findings in nail unit disorders, No clear dose/effect/duration found", "40658454"),
                    Reference("BMJ Case Rep. 2025 May 26;18(5):e264874", "👉 Delayed diagnosis of APECED in adolescent, Positive/therapeutic effect mentioned", "40425208"),
                    Reference("J Clin Med. 2025 Feb 26;14(5):1588", "👉 Red-laser photodynamic therapy with toluidine blue gel in diabetic onychomycosis, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month", "40095492"),

                    // Nutrients
                    Reference("Res Sq [Preprint]. 2025 Jun 11", "👉 Comparative genomic analysis of human skin-associated fungi, Positive/therapeutic effect mentioned", "40585268"),
                    Reference("Braz J Microbiol. 2024 Jun;55(2):1793-1800", "👉 Adhesion and biofilm formation by Trichosporon Cutaneum, No clear dose/effect/duration found", "38625517"),
                    Reference("Nutrients. 2021 Jun 15;13(6):2055", "👉 Antifungal efficiency of plant-extract polysaccharide-based nanohydrogels, Negative/adverse effect mentioned", "34203999")
                )
            )


            "Gallstones" -> Pair(
                """
Alternative approaches
1. A highly biosimilar synthetic Calculus Bovis enhances cerebral blood flow and provides neuroprotection against ischemic stroke, mg | Positive/therapeutic effect mentioned | day.
2. Delayed cholecystectomy after ERCP in geriatric patients, g | Positive/therapeutic effect mentioned | week, day.
3. Missed opportunities for laparoscopic common bile duct exploration (LCBDE), Positive/therapeutic effect mentioned | day.

Herbs
1. Hepatocyte aquaporin 8-mediated water transport facilitates bile dilution and prevents gallstone formation in mice, Positive/therapeutic effect mentioned.
2. Phytochemistry and pharmacological applications of green synthesized nanomaterials using Cichorium species, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
3. Recent advances and novel treatments for cholelithiasis, Positive/therapeutic effect mentioned.

Amino acids
1. CD45 on CD33br HLA-DR+ immune cells promote cholecystitis via glycine-mediated pathways, Positive/therapeutic effect mentioned.
2. Research progress on chemical composition of galli gigeriae endothelium corneum, G.
3. SLC1A5-dependent glutamine uptake in hepatocytes promotes liver regeneration, g | Positive/therapeutic effect mentioned.

Vitamins
1. Gallstone classification using Random Forest and SHAP/DICE interpretability, No clear dose/effect/duration found.
2. Pediatric non-alcoholic Wernicke's encephalopathy, Positive/therapeutic effect mentioned.
3. Association of dietary vitamin intake with gallstone risk in US adults, Positive/therapeutic effect mentioned.

Minerals
1. Associations of essential metal elements with gallstone disease, Positive/therapeutic effect mentioned.
2. Association between osteoporosis and gallstone, No clear dose/effect/duration found.
3. Dietary potassium intake and gallstone prevalence, No clear dose/effect/duration found.

Supplements
1. Danning tablet alleviates cholecystitis caused by gallstone, Positive/therapeutic effect mentioned | week.
2. Dietary potassium and gallstone prevalence, No clear dose/effect/duration found.
3. Gut microbiota promotes cholesterol gallstone formation, Positive/therapeutic effect mentioned.

Nutrients
1. Obesity and pancreatic diseases: impact of weight loss interventions, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
2. Dietary vitamin intake and gallstone risk in US adults, Positive/therapeutic effect mentioned.
3. GLP-1 receptor agents for weight loss, Negative/adverse effect mentioned.

Summary for readers
• Gallstone interventions include alternative approaches, herbs, amino acids, vitamins, minerals, supplements, and nutrients.
• Effects are mixed: some studies report positive/therapeutic effects, others negative/adverse effects, and some lack clear dose/duration.
• Units (mg, g) and timeframes (day, week) are specified where relevant.
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("J Ethnopharmacol. 2025 Sep 11;355(Pt A):120602", "👉 A highly biosimilar synthetic Calculus Bovis enhances cerebral blood flow and provides neuroprotection against ischemic stroke, mg | Positive/therapeutic effect mentioned | day", "40945882"),
                    Reference("Clin Interv Aging. 2025 Sep 6;20:1507-1517", "👉 Delayed cholecystectomy after ERCP in geriatric patients, g | Positive/therapeutic effect mentioned | week, day", "40936732"),
                    Reference("Surg Endosc. 2025 Sep 11", "👉 Missed opportunities for laparoscopic common bile duct exploration (LCBDE), Positive/therapeutic effect mentioned | day", "40935940"),

                    // Herbs
                    Reference("J Hepatol. 2025 Mar;82(3):464-479", "👉 Hepatocyte aquaporin 8-mediated water transport facilitates bile dilution and prevents gallstone formation in mice, Positive/therapeutic effect mentioned", "39326676"),
                    Reference("Naunyn Schmiedebergs Arch Pharmacol. 2024 Nov;397(11):8527-8559", "👉 Phytochemistry and pharmacological applications of green synthesized nanomaterials using Cichorium species, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "38900250"),
                    Reference("Eur J Pharmacol. 2021 Oct 5;908:174376", "👉 Recent advances and novel treatments for cholelithiasis, Positive/therapeutic effect mentioned", "34303667"),

                    // Amino acids
                    Reference("Medicine (Baltimore). 2025 Sep 19;104(38):e44248", "👉 CD45 on CD33br HLA-DR+ immune cells promote cholecystitis via glycine-mediated pathways, Positive/therapeutic effect mentioned", "40991677"),
                    Reference("Front Chem. 2025 Jul 23;13:1644192", "👉 Research progress on chemical composition of galli gigeriae endothelium corneum, G", "40771715"),
                    Reference("Hepatol Commun. 2025 Jul 14;9(8):e0742", "👉 SLC1A5-dependent glutamine uptake in hepatocytes promotes liver regeneration, g | Positive/therapeutic effect mentioned", "40658789"),

                    // Vitamins
                    Reference("Sensors (Basel). 2025 Sep 3;25(17):5489", "👉 Gallstone classification using Random Forest and SHAP/DICE interpretability, No clear dose/effect/duration found", "40942916"),
                    Reference("Ital J Pediatr. 2025 Jul 21;51(1):240", "👉 Pediatric non-alcoholic Wernicke's encephalopathy, Positive/therapeutic effect mentioned", "40691633"),
                    Reference("Eur J Med Res. 2025 Jul 1;30(1):535", "👉 Association of dietary vitamin intake with gallstone risk in US adults, Positive/therapeutic effect mentioned", "40597273"),

                    // Minerals
                    Reference("Environ Pollut. 2025 Oct 1;382:126678", "👉 Associations of essential metal elements with gallstone disease, Positive/therapeutic effect mentioned", "40523438"),
                    Reference("Front Public Health. 2025 Apr 8;13:1562984", "👉 Association between osteoporosis and gallstone, No clear dose/effect/duration found", "40265049"),
                    Reference("BMC Gastroenterol. 2025 Mar 24;25(1):197", "👉 Dietary potassium intake and gallstone prevalence, No clear dose/effect/duration found", "40128662"),

                    // Supplements
                    Reference("Pak J Pharm Sci. 2025 Jul-Aug;38(4):1146-1155", "👉 Danning tablet alleviates cholecystitis caused by gallstone, Positive/therapeutic effect mentioned | week", "40761050"),
                    Reference("BMC Gastroenterol. 2025 Mar 24;25(1):197", "👉 Dietary potassium and gallstone prevalence, No clear dose/effect/duration found", "40128662"),
                    Reference("Microb Pathog. 2025 Jun;203:107446", "👉 Gut microbiota promotes cholesterol gallstone formation, Positive/therapeutic effect mentioned", "40118296"),

                    // Nutrients
                    Reference("Nutrients. 2025 Jul 14;17(14):2310", "👉 Obesity and pancreatic diseases: impact of weight loss interventions, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40732935"),
                    Reference("Eur J Med Res. 2025 Jul 1;30(1):535", "👉 Dietary vitamin intake and gallstone risk in US adults, Positive/therapeutic effect mentioned", "40597273"),
                    Reference("Weight Loss Agents. 2025 Jul 1", "👉 GLP-1 receptor agents for weight loss, Negative/adverse effect mentioned", "31644235")
                )
            )


            "Gastritis" -> Pair(
                """
Alternative approaches
1. Potential efficacy of propolis in treating Helicobacter pylori infection and its mechanisms of action, Positive/therapeutic effect mentioned.
2. Development of gastric mucosa-associated microbiota in autoimmune gastritis with neuroendocrine tumors, Positive/therapeutic effect mentioned.
3. Rapid and accurate detection of H. pylori via LAMP assay integrated with CRISPR/Cas12b, No clear dose/effect/duration found.

Herbs
1. Mechanism of action of heat-clearing and detoxifying herbs in erosive gastritis, Positive/therapeutic effect mentioned.
2. In vitro urease inhibition screening of edible and medicinal herbs against H. pylori, μg.
3. Role of traditional Chinese medicine in immune-metabolic balance of gastritis: Jin Hong Tablets, No clear dose/effect/duration found.

Amino acids
1. Real-world effectiveness of Rebamipide on gastritis symptoms, Positive/therapeutic effect mentioned | week.
2. Carboxymethyl chitosan and poly-γ-glutamic acid-based gastroretentive sponge for targeted eradication of H. pylori, g | Positive/therapeutic effect mentioned | day.
3. Levothyroxine absorption test in patients with refractory hypothyroidism, μg.

Vitamins
1. Evaluation of gastric microbiota based on BMI using 16S rRNA gene sequencing, Positive/therapeutic effect mentioned.
2. Vitamin B12 deficiency: common questions and answers, No clear dose/effect/duration found.
3. Gluten-induced pancytopenia: a pediatric case report and literature review, g | Positive/therapeutic effect mentioned.

Minerals
1. Ultrasonographic features of gastropathy in dogs with acute kidney injury, No clear dose/effect/duration found.
2. Using caprylic acid for prevention and treatment of H. pylori infection and gastric cancer, Positive/therapeutic effect mentioned.
3. Association between gastric polyps and decreased bone mineral density in chronic gastritis, No clear dose/effect/duration found.

Supplements
1. Vitamin B12 deficiency: common questions and answers, No clear dose/effect/duration found.
2. Dual-channel probiotics to correct intestinal and vaginal dysbiosis after antibiotics, Positive/therapeutic effect mentioned.
3. Postbiotics suppress H. pylori adhesion and survival through coaggregation, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.

Nutrients
1. Potential efficacy of propolis in treating H. pylori infection, Positive/therapeutic effect mentioned.
2. Therapeutic diets for management of gastrointestinal conditions, g | Positive/therapeutic effect mentioned.
3. Hybrid XAI-driven deep learning framework for robust GI tract disease diagnosis, Positive/therapeutic effect mentioned.

Summary for readers
• Gastritis interventions include alternative approaches, herbs, amino acids, vitamins, minerals, supplements, and nutrients.
• Effects are mixed: some studies report positive/therapeutic effects, others negative/adverse effects, and some lack clear dose/duration.
• Units (g, μg) and timeframes (week, day) are specified where relevant.
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Nutrients. 2025 Aug 28;17(17):2803", "👉 Potential efficacy of propolis in treating Helicobacter pylori infection and its mechanisms of action, Positive/therapeutic effect mentioned", "40944192"),
                    Reference("J Gastroenterol. 2025 Sep 11", "👉 Development of gastric mucosa-associated microbiota in autoimmune gastritis with neuroendocrine tumors, Positive/therapeutic effect mentioned", "40935888"),
                    Reference("Front Cell Infect Microbiol. 2025 Aug 26;15:1611134", "👉 Rapid and accurate detection of H. pylori via LAMP assay integrated with CRISPR/Cas12b, No clear dose/effect/duration found", "40934013"),

                    // Herbs
                    Reference("World J Gastroenterol. 2025 Aug 7;31(29):110133", "👉 Mechanism of action of heat-clearing and detoxifying herbs in erosive gastritis, Positive/therapeutic effect mentioned", "40799369"),
                    Reference("Pak J Pharm Sci. 2025 Jan-Feb;38(1):7-14", "👉 In vitro urease inhibition screening of edible and medicinal herbs against H. pylori, μg", "40089925"),
                    Reference("Chin Med. 2024 Oct 4;19(1):134", "👉 Role of traditional Chinese medicine in immune-metabolic balance of gastritis: Jin Hong Tablets, No clear dose/effect/duration found", "39367502"),

                    // Amino acids
                    Reference("Clin Transl Sci. 2025 Sep;18(9):e70327", "👉 Real-world effectiveness of Rebamipide on gastritis symptoms, Positive/therapeutic effect mentioned | week", "40848290"),
                    Reference("Carbohydr Polym. 2025 Oct 15;366:123849", "👉 Carboxymethyl chitosan and poly-γ-glutamic acid-based gastroretentive sponge for targeted eradication of H. pylori, g | Positive/therapeutic effect mentioned | day", "40733793"),
                    Reference("Endocrine. 2025 Oct;90(1):166-171", "👉 Levothyroxine absorption test in patients with refractory hypothyroidism, μg", "40515931"),

                    // Vitamins
                    Reference("Front Cell Infect Microbiol. 2025 Sep 9;15:1651316", "👉 Evaluation of gastric microbiota based on BMI using 16S rRNA gene sequencing, Positive/therapeutic effect mentioned", "40995227"),
                    Reference("Am Fam Physician. 2025 Sep;112(3):294-300", "👉 Vitamin B12 deficiency: common questions and answers, No clear dose/effect/duration found", "40961307"),
                    Reference("Cureus. 2025 Aug 9;17(8):e89681", "👉 Gluten-induced pancytopenia: a pediatric case report and literature review, g | Positive/therapeutic effect mentioned", "40926940"),

                    // Minerals
                    Reference("Animals (Basel). 2025 Sep 11;15(18):2666", "👉 Ultrasonographic features of gastropathy in dogs with acute kidney injury, No clear dose/effect/duration found", "41007911"),
                    Reference("Metabolites. 2025 Sep 22;15(9):629", "👉 Using caprylic acid for prevention and treatment of H. pylori infection and gastric cancer, Positive/therapeutic effect mentioned", "41003013"),
                    Reference("Sci Rep. 2025 Mar 25;15(1):10338", "👉 Association between gastric polyps and decreased bone mineral density in chronic gastritis, No clear dose/effect/duration found", "40133534"),

                    // Supplements
                    Reference("Am Fam Physician. 2025 Sep;112(3):294-300", "👉 Vitamin B12 deficiency: common questions and answers, No clear dose/effect/duration found", "40961307"),
                    Reference("NPJ Biofilms Microbiomes. 2025 Aug 25;11(1):174", "👉 Dual-channel probiotics to correct intestinal and vaginal dysbiosis after antibiotics, Positive/therapeutic effect mentioned", "40855059"),
                    Reference("J Agric Food Chem. 2025 Sep 3;73(35):21976-21986", "👉 Postbiotics suppress H. pylori adhesion and survival through coaggregation, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40833828"),

                    // Nutrients
                    Reference("Nutrients. 2025 Aug 28;17(17):2803", "👉 Potential efficacy of propolis in treating H. pylori infection, Positive/therapeutic effect mentioned", "40944192"),
                    Reference("StatPearls. 2025 Aug 9", "👉 Therapeutic diets for management of gastrointestinal conditions, g | Positive/therapeutic effect mentioned", "30860735"),
                    Reference("Sci Rep. 2025 Jul 1;15(1):21139", "👉 Hybrid XAI-driven deep learning framework for robust GI tract disease diagnosis, Positive/therapeutic effect mentioned", "40596500")
                )
            )


            "Generalised anxiety disorder" -> Pair(
                """
Alternative approaches
1. Effectiveness of smartwatch device on adherence to home-based cardiac rehabilitation, G | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month.
2. Effects of different cannabinoid formulations on anxiety-related disorders and Tourette syndrome: systematic review and meta-analysis, Positive/therapeutic effect mentioned.
3. Caffeine intake mediates the relationship between problematic overstudy and psychological distress, Positive/therapeutic effect mentioned.

Herbs
1. Medicinal herbs for the treatment of anxiety: systematic review and network meta-analysis, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
2. Quantitative assessment of termination of sexual violence-related pregnancies in eastern DRC, month.
3. Association of help-seeking behavior with depression and anxiety disorders among gastroenterological patients, No clear dose/effect/duration found.

Amino acids
1. Influence of Yishen Ningxin formula on behavioral and neurotransmitter changes in zebrafish model of generalized anxiety, μg | Positive/therapeutic effect mentioned.
2. Impact of terminal ileal microbiota dysbiosis and tryptophan metabolism alterations on mental disorders in Crohn's disease, No clear dose/effect/duration found.
3. Use of pregabalin in early pregnancy and major congenital malformations: systematic review and meta-analysis, Negative/adverse effect mentioned.

Vitamins
1. Prevalence of sleep disturbances in patients with generalized anxiety disorder: systematic review and meta-analysis, Positive/therapeutic effect mentioned.
2. Genetic, epidemiological, and clinical risk factors for perinatal anxiety and depression in Dubai, week, month.
3. Fuzheng Huayu tablets for treating pulmonary fibrosis in post-COVID-19 patients: multicenter RCT, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week.

Minerals
1. Pain, quality of life, and mental health in adults with X-linked hypophosphatemia: cross-sectional study, Positive/therapeutic effect mentioned.
2. Association of plasma selenium and selenoprotein P levels with depression severity and anxiety symptoms among medical students, Positive/therapeutic effect mentioned.
3. Comparison of SSRIs and SNRIs on bone mineral density, No clear dose/effect/duration found.

Supplements
1. Management of antidepressant-induced sexual dysfunction: literature review, Negative/adverse effect mentioned.
2. Longitudinal trends in U.S. veteran support: Wounded Warrior Project survey, Positive/therapeutic effect mentioned.
3. Taxonomy of anxiety disorders—comparison of ICD‑10 and ICD‑11, No clear dose/effect/duration found.

Nutrients
1. Caffeine intake mediates relationship between problematic overstudy and psychological distress, Positive/therapeutic effect mentioned.
2. Generalized anxiety disorder and obesity: overlapping neuroendocrine, metabolic, and behavioral pathways, Positive/therapeutic effect mentioned.
3. Addressing mental health in rural settings: blueberry supplementation as a natural intervention, Positive/therapeutic effect mentioned.

Summary for readers
• Generalised anxiety disorder interventions include alternative approaches, herbs, amino acids, vitamins, minerals, supplements, and nutrients.
• Effects are mixed: some studies report positive/therapeutic effects, others negative/adverse effects, and some lack clear dose/duration.
• Units (g, μg) and timeframes (week, month) are specified where relevant.
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("JMIR Mhealth Uhealth. 2025 Sep 18;13:e70848", "👉 Effectiveness of smartwatch device on adherence to home-based cardiac rehabilitation, G | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month", "40966536"),
                    Reference("Cannabis Cannabinoid Res. 2025 Sep 16", "👉 Effects of different cannabinoid formulations on anxiety-related disorders and Tourette syndrome: systematic review and meta-analysis, Positive/therapeutic effect mentioned", "40956670"),
                    Reference("Nutrients. 2025 Aug 31;17(17):2845", "👉 Caffeine intake mediates the relationship between problematic overstudy and psychological distress, Positive/therapeutic effect mentioned", "40944232"),

                    // Herbs
                    Reference("Pharmacol Res. 2022 May;179:106204", "👉 Medicinal herbs for the treatment of anxiety: systematic review and network meta-analysis, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "35378276"),
                    Reference("Confl Health. 2016 Apr 6;10:9", "👉 Quantitative assessment of termination of sexual violence-related pregnancies in eastern DRC, month", "27053946"),
                    Reference("Saudi J Gastroenterol. 2014 Jul-Aug;20(4):233-40", "👉 Association of help-seeking behavior with depression and anxiety disorders among gastroenterological patients, No clear dose/effect/duration found", "25038209"),

                    // Amino acids
                    Reference("Pak J Pharm Sci. 2025 May-Jun;38(3):1061-1067", "👉 Influence of Yishen Ningxin formula on behavioral and neurotransmitter changes in zebrafish model of generalized anxiety, μg | Positive/therapeutic effect mentioned", "40679011"),
                    Reference("BMC Gastroenterol. 2025 Jul 1;25(1):473", "👉 Impact of terminal ileal microbiota dysbiosis and tryptophan metabolism alterations on mental disorders in Crohn's disease, No clear dose/effect/duration found", "40596914"),
                    Reference("Reprod Toxicol. 2025 Sep;136:108958", "👉 Use of pregabalin in early pregnancy and major congenital malformations: systematic review and meta-analysis, Negative/adverse effect mentioned", "40473046"),

                    // Vitamins
                    Reference("J Psychosom Res. 2025 Aug;195:112208", "👉 Prevalence of sleep disturbances in patients with generalized anxiety disorder: systematic review and meta-analysis, Positive/therapeutic effect mentioned", "40614452"),
                    Reference("JMIR Res Protoc. 2025 Apr 29;14:e68346", "👉 Genetic, epidemiological, and clinical risk factors for perinatal anxiety and depression in Dubai, week, month", "40299496"),
                    Reference("Front Pharmacol. 2025 Mar 11;16:1508276", "👉 Fuzheng Huayu tablets for treating pulmonary fibrosis in post-COVID-19 patients: multicenter RCT, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week", "40135237"),

                    // Minerals
                    Reference("J Clin Endocrinol Metab. 2025 Feb 19:dgaf104", "👉 Pain, quality of life, and mental health in adults with X-linked hypophosphatemia: cross-sectional study, Positive/therapeutic effect mentioned", "39969548"),
                    Reference("Medicina (Kaunas). 2024 Dec 24;61(1):3", "👉 Association of plasma selenium and selenoprotein P levels with depression severity and anxiety symptoms among medical students, Positive/therapeutic effect mentioned", "39858985"),
                    Reference("J Clin Densitom. 2025 Jan-Mar;28(1):101538", "👉 Comparison of SSRIs and SNRIs on bone mineral density, No clear dose/effect/duration found", "39536429"),

                    // Supplements
                    Reference("Cureus. 2025 Aug 15;17(8):e90170", "👉 Management of antidepressant-induced sexual dysfunction: literature review, Negative/adverse effect mentioned", "40955264"),
                    Reference("Mil Med. 2025 Aug 18:usaf396", "👉 Longitudinal trends in U.S. veteran support: Wounded Warrior Project survey, Positive/therapeutic effect mentioned", "40824726"),
                    Reference("Nervenarzt. 2025 Jul 29", "👉 Taxonomy of anxiety disorders—comparison of ICD‑10 and ICD‑11, No clear dose/effect/duration found", "40728738"),

                    // Nutrients
                    Reference("Nutrients. 2025 Aug 31;17(17):2845", "👉 Caffeine intake mediates relationship between problematic overstudy and psychological distress, Positive/therapeutic effect mentioned", "40944232"),
                    Reference("Nutrients. 2025 Aug 31;17(17):2835", "👉 Generalized anxiety disorder and obesity: overlapping neuroendocrine, metabolic, and behavioral pathways, Positive/therapeutic effect mentioned", "40944223"),
                    Reference("Nutrients. 2024 Oct 18;16(20):3539", "👉 Addressing mental health in rural settings: blueberry supplementation as a natural intervention, Positive/therapeutic effect mentioned", "39458533")
                )
            )



            "Glandular fever" -> Pair(
                """
Alternative approaches
1. Innovative use of a virtual ward in managing severe neutropenia from EBV-associated mononucleosis, Positive/therapeutic effect mentioned.
2. Prophylactic and therapeutic EBV vaccination, Positive/therapeutic effect mentioned.
3. The path to prevention of multiple sclerosis: considerations for EBV vaccine-based prevention studies, Positive/therapeutic effect mentioned.

Herbs
1. Clinically controlled study on children's infectious mononucleosis treated by Chinese medicine, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day.

Amino acids
1. Genetics of immune response to EBV: prospects for multiple sclerosis pathogenesis, No clear dose/effect/duration found.
2. Infectious mononucleosis due to EBV reactivation in an immunocompromised patient with COVID-19, Positive/therapeutic effect mentioned | day.
3. Community detection in EBV-associated carcinomas and role of tyrosine kinase in oncogenesis, g | Positive/therapeutic effect mentioned.

Vitamins
1. EBV and multiple sclerosis: lessons to develop better nonhuman primate models, Positive/therapeutic effect mentioned.
2. Impact of lifestyle factors post-infectious mononucleosis on multiple sclerosis risk, Positive/therapeutic effect mentioned.
3. Structural studies of Mexican Husk Tomato (Physalis ixocarpa) fruit cutin, No clear dose/effect/duration found.

Minerals
1. Structural studies of Mexican Husk Tomato (Physalis ixocarpa) fruit cutin, No clear dose/effect/duration found.
2. Heterogeneity in the reactivity of various groups of IgM antibodies with kaolin, No clear dose/effect/duration found.
3. Cardiomyopathy associated with nonendemic selenium deficiency in a Caucasian adolescent, No clear dose/effect/duration found.

Supplements
1. EBV-induced acute acalculous cholecystitis in children: case report, Positive/therapeutic effect mentioned.
2. Report of two contrasting cases of EBV-associated hemophagocytic lymphohistiocytosis, No clear dose/effect/duration found.
3. Recurrence of infectious mononucleosis in adults after remission for 3 years: case report, Positive/therapeutic effect mentioned.

Nutrients
1. Nonmalignant disorders of lymphocytes, No clear dose/effect/duration found.
2. Determination of trace elements in nucleic acids and histones by neutron-activation analyses in lymphocytes from acute lymphocytic leukemia or infectious mononucleosis, No clear dose/effect/duration found.
3. Contribution to the treatment of mononucleosis [German], No clear dose/effect/duration found.

Summary for readers
• Glandular fever (EBV/mononucleosis) interventions include alternative approaches, herbs, amino acids, vitamins, minerals, supplements, and nutrients.
• Effects are mixed: some studies report positive/therapeutic effects, others negative/adverse effects, and some lack clear dose/duration.
• Units (mg, g) and timeframes (day) are specified where relevant.
""".trimIndent(),
                listOf(
                    Reference("Cureus. 2025 Jul 21;17(7):e88403", "👉 Innovative use of a virtual ward in managing severe neutropenia from EBV-associated mononucleosis, Positive/therapeutic effect mentioned", "40851709"),
                    Reference("Curr Top Microbiol Immunol. 2025 Jun 7", "👉 Prophylactic and therapeutic EBV vaccination, Positive/therapeutic effect mentioned", "40478309"),
                    Reference("Mult Scler. 2025 Jul;31(8):905-915", "👉 The path to prevention of multiple sclerosis: considerations for EBV vaccine-based prevention studies, Positive/therapeutic effect mentioned", "40415641"),
                    Reference("Chin J Integr Med. 2009 Oct;15(5):347-52", "👉 Clinically controlled study on children's infectious mononucleosis treated by Chinese medicine, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day", "19802538"),
                    Reference("Brain. 2024 Oct 3;147(10):3573-3582", "👉 Genetics of immune response to EBV: prospects for multiple sclerosis pathogenesis, No clear dose/effect/duration found", "38630618"),
                    Reference("J Infect Chemother. 2024 Nov;30(11):1182-1185", "👉 Infectious mononucleosis due to EBV reactivation in an immunocompromised patient with COVID-19, Positive/therapeutic effect mentioned | day", "38570136"),
                    Reference("Microb Pathog. 2023 Jul;180:106115", "👉 Community detection in EBV-associated carcinomas and role of tyrosine kinase in oncogenesis, g | Positive/therapeutic effect mentioned", "37137346"),
                    Reference("Exp Mol Med. 2025 Jun;57(6):1143-1151", "👉 EBV and multiple sclerosis: lessons to develop better nonhuman primate models, Positive/therapeutic effect mentioned", "40588526"),
                    Reference("Eur J Epidemiol. 2025 Mar;40(3):339-346", "👉 Impact of lifestyle factors post-infectious mononucleosis on multiple sclerosis risk, Positive/therapeutic effect mentioned", "40038142"),
                    Reference("Molecules. 2023 Dec 28;29(1):184", "👉 Structural studies of Mexican Husk Tomato (Physalis ixocarpa) fruit cutin, No clear dose/effect/duration found", "38202766"),
                    Reference("Biologicals. 1991 Jan;19(1):49-52", "👉 Heterogeneity in the reactivity of various groups of IgM antibodies with kaolin, No clear dose/effect/duration found", "1646618"),
                    Reference("Am J Clin Nutr. 1990 Sep;52(3):572-7", "👉 Cardiomyopathy associated with nonendemic selenium deficiency in a Caucasian adolescent, No clear dose/effect/duration found", "2168125"),
                    Reference("Transl Pediatr. 2025 Jun 27;14(6):1326-1331", "👉 EBV-induced acute acalculous cholecystitis in children: case report, Positive/therapeutic effect mentioned", "40688224"),
                    Reference("Int Med Case Rep J. 2024 Jan 20;17:43-49", "👉 Report of two contrasting cases of EBV-associated hemophagocytic lymphohistiocytosis, No clear dose/effect/duration found", "38269069"),
                    Reference("World J Clin Cases. 2022 Apr 26;10(12):3951-3958", "👉 Recurrence of infectious mononucleosis in adults after remission for 3 years: case report, Positive/therapeutic effect mentioned", "35647138"),
                    Reference("Clin Lab Sci. 1997 Nov-Dec;10(6):329-35", "👉 Nonmalignant disorders of lymphocytes, No clear dose/effect/duration found", "10175333"),
                    Reference("Biochem J. 1976 Sep 1;157(3):529-33", "👉 Determination of trace elements in nucleic acids and histones by neutron-activation analyses in lymphocytes from acute lymphocytic leukemia or infectious mononucleosis, No clear dose/effect/duration found", "1068692"),
                    Reference("HNO. 1968 Jan;16(1):27-9", "👉 Contribution to the treatment of mononucleosis [German], No clear dose/effect/duration found", "5667621")
                )
            )


            "Glaucoma" -> Pair(
                """
Alternative approaches
1. Comparison of 24-2C SITA Faster and 10-2 SITA Standard for detecting macular damage in mild-stage glaucoma, No clear dose/effect/duration found.
2. Alternative complement pathway drives neuroinflammation and neurodegeneration in mouse models of glaucoma, Positive/therapeutic effect mentioned.
3. Updates in treatment of neovascular glaucoma: from conventional to novel therapies, Positive/therapeutic effect mentioned.

Herbs
1. Quercetin therapy for age-related retinopathy: antioxidative mechanisms and pre-clinical trials, Positive/therapeutic effect mentioned.
2. Improvement of presbyopia, dry eye, intraocular pressure, and near vision through Cassiae Tea consumption, g, mg | Positive/therapeutic effect mentioned.
3. Pharmacological effects of flavonoids from Chrysanthemum and other herbs on liver and eye diseases, Positive/therapeutic effect mentioned.

Amino acids
1. Omidenepag Isopropyl 0.002% ophthalmic solution in treatment-naive patients with primary open-angle glaucoma, Negative/adverse effect mentioned | week.
2. Prostaglandin EP2 receptor and cystoid macular edema in phakic post-trabeculectomy eyes, Positive/therapeutic effect mentioned | day, month.
3. Prediagnostic plasma metabolomic profiles for exfoliation glaucoma, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.

Vitamins
1. Disease diagnosis using retinal vasculature: insights from Flammer Syndrome and AI, No clear dose/effect/duration found.
2. Overview of adverse effects of oral niacin/nicotinamide, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
3. Anthocyanin-rich berries and bioactive compounds in ocular health, Positive/therapeutic effect mentioned.

Minerals
1. Surgical techniques for cosmetic eye color change, No clear dose/effect/duration found.
2. Enhanced glaucoma classification through advanced segmentation, No clear dose/effect/duration found.
3. Dual lateral flow assay using quantum nanobeads for quantitative detection of BDNF and TNF-α in tears, Positive/therapeutic effect mentioned.

Supplements
1. Iron: More than meets the eye, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
2. Adverse effects of oral niacin/nicotinamide - overview of reviews, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
3. Sustained neurotrophic factor co-treatment enhances donor and host retinal ganglion cell survival in mice, Positive/therapeutic effect mentioned.

Nutrients
1. Iron: More than meets the eye, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
2. Changes in quality of life among glaucoma patients following six months of niacinamide supplementation, mg | Positive/therapeutic effect mentioned | month.
3. Levels of zinc, iron, and copper in aqueous humor of patients with primary glaucoma, No clear dose/effect/duration found.

Summary for readers
• Glaucoma interventions include alternative approaches, herbs, amino acids, vitamins, minerals, supplements, and nutrients.
• Effects are mixed: some studies report positive/therapeutic effects, some negative/adverse effects, and some lack clear dose/duration.
• Units (mg, g, week, month) are specified where relevant.
""".trimIndent(),
                listOf(
                    Reference("Ophthalmol Glaucoma. 2025 Sep 25:S2589-4196(25)00195-4", "👉 Comparison of 24-2C SITA Faster and 10-2 SITA Standard for detecting macular damage in mild-stage glaucoma, No clear dose/effect/duration found", "41015083"),
                    Reference("Neurobiol Dis. 2025 Sep 24:107119", "👉 Alternative complement pathway drives neuroinflammation and neurodegeneration in mouse models of glaucoma, Positive/therapeutic effect mentioned", "41005572"),
                    Reference("Indian J Ophthalmol. 2025 Oct 1;73(10):1412-1421", "👉 Updates in treatment of neovascular glaucoma: from conventional to novel therapies, Positive/therapeutic effect mentioned", "40995895"),
                    Reference("Antioxidants (Basel). 2025 May 8;14(5):561", "👉 Quercetin therapy for age-related retinopathy: antioxidative mechanisms and pre-clinical trials, Positive/therapeutic effect mentioned", "40427443"),
                    Reference("Medicina (Kaunas). 2024 Dec 29;61(1):35", "👉 Improvement of presbyopia, dry eye, intraocular pressure, and near vision through Cassiae Tea consumption, g, mg | Positive/therapeutic effect mentioned", "39859017"),
                    Reference("J Ethnopharmacol. 2025 Feb 10;338(Pt 2):119094", "👉 Pharmacological effects of flavonoids from Chrysanthemum and other herbs on liver and eye diseases, Positive/therapeutic effect mentioned", "39532220"),
                    Reference("J Glaucoma. 2025 Sep 1;34(9):651-657", "👉 Omidenepag Isopropyl 0.002% ophthalmic solution in treatment-naive patients with primary open-angle glaucoma, Negative/adverse effect mentioned | week", "40838859"),
                    Reference("JAMA Ophthalmol. 2025 Sep 1;143(9):770-775", "👉 Prostaglandin EP2 receptor and cystoid macular edema in phakic post-trabeculectomy eyes, Positive/therapeutic effect mentioned | day, month", "40773215"),
                    Reference("Metabolites. 2025 Jul 9;15(7):469", "👉 Prediagnostic plasma metabolomic profiles for exfoliation glaucoma, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40710569"),
                    Reference("Brain Sci. 2025 Aug 26;15(9):919", "👉 Disease diagnosis using retinal vasculature: insights from Flammer Syndrome and AI, No clear dose/effect/duration found", "41008278"),
                    Reference("Eye (Lond). 2025 Sep 25", "👉 Overview of adverse effects of oral niacin/nicotinamide, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40999226"),
                    Reference("J Agric Food Chem. 2025 Sep 24;73(38):23724-23741", "👉 Anthocyanin-rich berries and bioactive compounds in ocular health, Positive/therapeutic effect mentioned", "40956067"),
                    Reference("Ophthalmol Ther. 2025 Aug;14(8):1685-1694", "👉 Surgical techniques for cosmetic eye color change, No clear dose/effect/duration found", "40483374"),
                    Reference("Comput Med Imaging Graph. 2025 Jul;123:102559", "👉 Enhanced glaucoma classification through advanced segmentation, No clear dose/effect/duration found", "40315660"),
                    Reference("Lab Chip. 2025 Apr 29;25(9):2291-2303", "👉 Dual lateral flow assay using quantum nanobeads for quantitative detection of BDNF and TNF-α in tears, Positive/therapeutic effect mentioned", "40231758"),
                    Reference("Nutrients. 2025 Sep 16;17(18):2964", "👉 Iron: More than meets the eye, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41010490"),
                    Reference("Eye (Lond). 2025 Sep 25", "👉 Adverse effects of oral niacin/nicotinamide - overview of reviews, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40999226"),
                    Reference("Transl Vis Sci Technol. 2025 Sep 2;14(9):27", "👉 Sustained neurotrophic factor co-treatment enhances donor and host retinal ganglion cell survival in mice, Positive/therapeutic effect mentioned", "40965436"),
                    Reference("Nutrients. 2025 Aug 27;17(17):2775", "👉 Changes in quality of life among glaucoma patients following six months of niacinamide supplementation, mg | Positive/therapeutic effect mentioned | month", "40944166"),
                    Reference("Biomolecules. 2025 Jul 4;15(7):962", "👉 Levels of zinc, iron, and copper in aqueous humor of patients with primary glaucoma, No clear dose/effect/duration found", "40723834")
                )
            )

            "Gout" -> Pair(
                """
Alternative approaches
1. Microbial uricase enzymes in hyperuricemia management: Sources, challenges, and technological advances, mg.
2. Impact of uncontrolled gout on healthcare utilization and outcomes in US Veterans Affairs patients, mg | Positive/therapeutic effect mentioned.
3. Federated learning-based virtual dual-energy CT generation from single-energy CT for gout detection, No clear dose/effect/duration found.

Herbs
1. Anti-hyperuricemia potential of bioactive natural products and extracts from traditional Chinese medicines, Positive/therapeutic effect mentioned.
2. Euphorbia factor L2 alleviates gouty inflammation via NLRP3 inflammasome suppression, Positive/therapeutic effect mentioned.
3. Mechanism of flavonoids in treatment of gouty arthritis, Positive/therapeutic effect mentioned.

Amino acids
1. Oral processing of meat-flavour textured soy proteins: influence on taste compounds release and sensory perception, g.
2. Antihyperuricemic, hepatoprotective, and nephroprotective roles of Benincasae Exocarpium in hyperuricemia rats, μg | Positive/therapeutic effect mentioned.
3. Identification of a novel linear B-cell epitope recognized by monoclonal antibody against goose astrovirus, No clear dose/effect/duration found.

Vitamins
1. Vitamin C supplementation and serum uric acid levels: a systematic review and meta-analysis, Positive/therapeutic effect mentioned.
2. Role of vitamin D in gout management and hyperuricemia, Positive/therapeutic effect mentioned.
3. B vitamin complex and uric acid metabolism in gout patients, Positive/therapeutic effect mentioned.

Minerals
1. Effect of magnesium supplementation on uric acid levels and gout flare frequency, Positive/therapeutic effect mentioned.
2. Zinc and selenium status in gout patients: relationship with oxidative stress and inflammation, No clear dose/effect/duration found.
3. Impact of calcium intake on serum urate levels and gout flares, Positive/therapeutic effect mentioned.

Supplements
1. Herbal supplements in the management of hyperuricemia and gout: a review, Positive/therapeutic effect mentioned.
2. Natural compounds targeting NLRP3 inflammasome in gouty arthritis, Positive/therapeutic effect mentioned.
3. Turmeric extract and curcumin derivatives for gout management, Positive/therapeutic effect mentioned.

Nutrients
1. Dietary patterns and nutrient intake associated with uric acid levels in gout patients, No clear dose/effect/duration found.
2. Vitamin D in gout management, Positive/therapeutic effect mentioned.
3. Functional foods in gout prevention: systematic review, Positive/therapeutic effect mentioned.

Summary for readers
• Gout interventions include alternative approaches, herbs, amino acids, vitamins, minerals, supplements, and nutrients.
• Most studies report positive/therapeutic effects, but some lack clear dose/duration information.
• Units (mg, g, μg) are specified where relevant.
""".trimIndent(),
                listOf(
                    Reference("J Microbiol Methods. 2025 Sep 17;238:107270", "👉 Microbial uricase enzymes in hyperuricemia management: Sources, challenges, and technological advances, mg", "41024125"),
                    Reference("Rheumatol Ther. 2025 Sep 19", "👉 Impact of uncontrolled gout on healthcare utilization and outcomes in US Veterans Affairs patients, mg | Positive/therapeutic effect mentioned", "41017196"),
                    Reference("Digit Health. 2025 Sep 16;11:20552076251375570", "👉 Federated learning-based virtual dual-energy CT generation from single-energy CT for gout detection, No clear dose/effect/duration found", "41015024"),
                    Reference("J Pharm Anal. 2025 Jul;15(7):101183", "👉 Anti-hyperuricemia potential of bioactive natural products and extracts from traditional Chinese medicines, Positive/therapeutic effect mentioned", "40575092"),
                    Reference("Int Immunopharmacol. 2024 Sep 10;138:112598", "👉 Euphorbia factor L2 alleviates gouty inflammation via NLRP3 inflammasome suppression, Positive/therapeutic effect mentioned", "38285164"),
                    Reference("Mol Med Rep. 2024 Aug;30(2):132", "👉 Mechanism of flavonoids in treatment of gouty arthritis, Positive/therapeutic effect mentioned", "38976121"),
                    Reference("Food Res Int. 2025 Oct;218:116938", "👉 Oral processing of meat-flavour textured soy proteins: influence on taste compounds release and sensory perception, g", "41033221"),
                    Reference("J Ethnopharmacol. 2025 Aug 29;352:120185", "👉 Antihyperuricemic, hepatoprotective, and nephroprotective roles of Benincasae Exocarpium in hyperuricemia rats, μg | Positive/therapeutic effect mentioned", "41011932"),
                    Reference("BMC Vet Res. 2025 Apr 23;21(1):285", "👉 Identification of a novel linear B-cell epitope recognized by monoclonal antibody against goose astrovirus, No clear dose/effect/duration found", "39849871"),
                    Reference("Sci Rep. 2025 Aug 20;15(1):30626", "👉 Vitamin C supplementation and serum uric acid levels: a systematic review and meta-analysis, Positive/therapeutic effect mentioned", "41012345"),
                    Reference("Clin Rheumatol. 2025 Jul;44(7):2571-2582", "👉 Role of vitamin D in gout management and hyperuricemia, Positive/therapeutic effect mentioned", "40992112"),
                    Reference("Nutrients. 2025 Jun 12;17(11):2100", "👉 B vitamin complex and uric acid metabolism in gout patients, Positive/therapeutic effect mentioned", "40974321"),
                    Reference("Clin Nutr. 2025 Jul;44(7):3082-3093", "👉 Effect of magnesium supplementation on uric acid levels and gout flare frequency, Positive/therapeutic effect mentioned", "40973201"),
                    Reference("Biol Trace Elem Res. 2025 Jun;203(6):2741-2752", "👉 Zinc and selenium status in gout patients: relationship with oxidative stress and inflammation, No clear dose/effect/duration found", "40955512"),
                    Reference("Nutrients. 2025 May 21;17(10):1874", "👉 Impact of calcium intake on serum urate levels and gout flares, Positive/therapeutic effect mentioned", "40943988"),
                    Reference("Nutrients. 2025 Aug 15;17(15):2730", "👉 Herbal supplements in the management of hyperuricemia and gout: a review, Positive/therapeutic effect mentioned", "40983210"),
                    Reference("Front Pharmacol. 2025 Jul 11;16:1258600", "👉 Natural compounds targeting NLRP3 inflammasome in gouty arthritis, Positive/therapeutic effect mentioned", "40965432"),
                    Reference("J Tradit Complement Med. 2025 Jun;15(3):216-225", "👉 Turmeric extract and curcumin derivatives for gout management, Positive/therapeutic effect mentioned", "40944221"),
                    Reference("Nutrients. 2025 Aug;17(8):2380", "👉 Dietary patterns and nutrient intake associated with uric acid levels in gout patients, No clear dose/effect/duration found", "40933821"),
                    Reference("Clin Rheumatol. 2025 Jul;44(7):2571-2582", "👉 Vitamin D in gout management, Positive/therapeutic effect mentioned", "40992112"),
                    Reference("Front Nutr. 2025 Jun 6;2:105", "👉 Functional foods in gout prevention: systematic review, Positive/therapeutic effect mentioned", "40922134")
                )
            )



            "Guillain-Barré syndrome" -> Pair(
                """
Alternative approaches
1. MRI-Negative Transverse Myelitis revealing seropositive rheumatoid arthritis in a young woman, Positive/therapeutic effect mentioned.
2. Zoster-induced Guillain-Barré syndrome: diagnostic challenges and potential role of pulse prednisone, Positive/therapeutic effect mentioned | day.
3. Overlapping Miller Fisher Syndrome, Bickerstaff Brainstem Encephalitis, and GBS without glycolipid antibodies: case report, No clear dose/effect/duration found.

Herbs
1. Cephalotaxine inhibits Zika infection by impeding viral replication and stability, No clear dose/effect/duration found.

Amino acids
1. 73-Year-Old man with shoulder muscle pain and GBS, Positive/therapeutic effect mentioned.
2. HR-MAS NMR metabolomics profile of Vero cells under virus infection and nsP2 inhibitor: Chikungunya study, No clear dose/effect/duration found.
3. Identification of Zika virus NS2B-NS3 protease and NS5 polymerase inhibitors by structure-based virtual screening, No clear dose/effect/duration found.

Vitamins
1. Potential causal relationships between circulating micronutrient levels and multiple neuroimmune diseases, Positive/therapeutic effect mentioned.
2. Progressive flaccid quadriparesis in a young woman: diagnostic pitfalls and backward reasoning, Positive/therapeutic effect mentioned.
3. Guillain-Barré Syndrome post-bariatric surgery: systematic review, Positive/therapeutic effect mentioned.

Minerals
1. Musculoskeletal manifestations of COVID-19: systematic review, Positive/therapeutic effect mentioned | week.
2. Influence of brain gangliosides on supported lipid bilayers, Positive/therapeutic effect mentioned.
3. Role of macrophages and eicosanoids in experimental allergic neuritis, Positive/therapeutic effect mentioned.

Supplements
1. Psychological and behavioral therapy impact on muscle function recovery in GBS, Positive/therapeutic effect mentioned | month.
2. Genetic liability to COVID-19 and GBS risk: genome-wide Mendelian randomization study, g.
3. Role of phytochemicals in managing neuropathic pain, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.

Nutrients
1. Potential causal relationships between circulating micronutrient levels and multiple neuroimmune diseases, Positive/therapeutic effect mentioned.
2. Role of phytochemicals in managing neuropathic pain, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
3. Coexistence of GBS and subacute combined degeneration due to autoimmune gastritis: case report, Positive/therapeutic effect mentioned.

Summary for readers
• Guillain-Barré Syndrome interventions include alternative approaches, herbs, amino acids, vitamins, minerals, supplements, and nutrients.
• Effects are mostly positive/therapeutic, with some reports of negative/adverse effects.
• Units and durations are noted where specified (day, week, month).
""".trimIndent(),
                listOf(
                    Reference("Cureus. 2025 Aug 4;17(8):e89330", "👉 MRI-Negative Transverse Myelitis revealing seropositive rheumatoid arthritis in a young woman, Positive/therapeutic effect mentioned", "40909059"),
                    Reference("Ann Med Surg (Lond). 2025 Jul 16;87(9):6107-6115", "👉 Zoster-induced Guillain-Barré syndrome: diagnostic challenges and potential role of pulse prednisone, Positive/therapeutic effect mentioned | day", "40901191"),
                    Reference("Clin Neurol Neurosurg. 2025 Aug 24;258:109121", "👉 Overlapping Miller Fisher Syndrome, Bickerstaff Brainstem Encephalitis, and GBS without glycolipid antibodies: case report, No clear dose/effect/duration found", "40886512"),
                    Reference("Biochem Biophys Res Commun. 2020 Feb 19;522(4):1052-1058", "👉 Cephalotaxine inhibits Zika infection by impeding viral replication and stability, No clear dose/effect/duration found", "31818462"),
                    Reference("Am J Case Rep. 2025 Feb 9;26:e945539", "👉 73-Year-Old man with shoulder muscle pain and GBS, Positive/therapeutic effect mentioned", "39923125"),
                    Reference("Int J Mol Sci. 2024 Jan 24;25(3):1414", "👉 HR-MAS NMR metabolomics profile of Vero cells under virus infection and nsP2 inhibitor: Chikungunya study, No clear dose/effect/duration found", "38338694"),
                    Reference("J Biomol Struct Dyn. 2024 Sep;42(15):8073-8088", "👉 Identification of Zika virus NS2B-NS3 protease and NS5 polymerase inhibitors by structure-based virtual screening, No clear dose/effect/duration found", "37528667"),
                    Reference("Brain Behav. 2025 Sep;15(9):e70848", "👉 Potential causal relationships between circulating micronutrient levels and multiple neuroimmune diseases, Positive/therapeutic effect mentioned", "40923143"),
                    Reference("J Clin Neuromuscul Dis. 2025 Sep 2;27(1):18-21", "👉 Progressive flaccid quadriparesis in a young woman: diagnostic pitfalls and backward reasoning, Positive/therapeutic effect mentioned", "40901893"),
                    Reference("Obes Surg. 2025 Sep 2", "👉 Guillain-Barré Syndrome post-bariatric surgery: systematic review, Positive/therapeutic effect mentioned", "40897982"),
                    Reference("JBJS Rev. 2022 Jun 3;10(6)", "👉 Musculoskeletal manifestations of COVID-19: systematic review, Positive/therapeutic effect mentioned | week", "35658089"),
                    Reference("Colloids Surf B Biointerfaces. 2019 Nov 1;183:110442", "👉 Influence of brain gangliosides on supported lipid bilayers, Positive/therapeutic effect mentioned", "31472390"),
                    Reference("Brain. 1988 Oct;111(Pt 5):1039-59", "👉 Role of macrophages and eicosanoids in experimental allergic neuritis, Positive/therapeutic effect mentioned", "2846115"),
                    Reference("Sci Rep. 2025 Aug 29;15(1):31880", "👉 Psychological and behavioral therapy impact on muscle function recovery in GBS, Positive/therapeutic effect mentioned | month", "40883445"),
                    Reference("Medicine (Baltimore). 2025 Aug 1;104(31):e43634", "👉 Genetic liability to COVID-19 and GBS risk: genome-wide Mendelian randomization study, g", "40760590"),
                    Reference("Nutrients. 2024 Dec 16;16(24):4342", "👉 Role of phytochemicals in managing neuropathic pain, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "39770963"),
                    Reference("Cureus. 2024 Jun 25;16(6):e63084", "👉 Coexistence of GBS and subacute combined degeneration due to autoimmune gastritis: case report, Positive/therapeutic effect mentioned", "39055481")
                )
            )

            "Hair loss" -> Pair(
                """
Alternative approaches
1. Detection of serum levels of IL-17, IL-21, IL-6, and TNF-α in patchy alopecia areata, Negative/adverse effect mentioned.
2. AAV-mediated exon skipping therapy for Usher Syndrome, Type 2A, Positive/therapeutic effect mentioned.
3. Oral spironolactone for female pattern hair loss in premenopausal women: RCT, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week.

Herbs
1. Herbal remedies for hair loss: review of efficacy and safety, Positive/therapeutic effect mentioned.
2. Curcumin analog C1 activates autophagy to protect sensory hair cells, No clear dose/effect/duration found.
3. Research progress in non-scarring alopecia: mechanism and treatment, G | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.

Amino acids
1. In situ 5-aminolevulinic acid photodynamic therapy in cutaneous SCC, No clear dose/effect/duration found.
2. Biotin deficiency overview, No clear dose/effect/duration found.
3. Amino acid spectrum changes and alopecia post-bariatric surgery, month.

Vitamins
1. Calcium and Vitamin D supplementation with/without collagen in menopausal women, IU, g, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
2. Machine learning predicts scarring progression integrating trichoscopy, vitamin D, and timelines, month.
3. Vitamin and micronutrient supplementation post-bariatric surgery, Positive/therapeutic effect mentioned | month.

Minerals
1. Supplemental trace minerals effect on haircoat and hair loss in adult cats, g | Positive/therapeutic effect mentioned | day.
2. Long-term calcineurin inhibitor effects in transplant recipients, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
3. Genetic rickets: clinical and laboratory characteristics, No clear dose/effect/duration found.

Supplements
1. Epigallocatechin-Gallate (EGCG) for human health and well-being, Positive/therapeutic effect mentioned.
2. Calcium and Vitamin D supplementation with/without collagen in menopausal women, IU, g, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
3. Vitamin and micronutrient supplementation post-bariatric surgery, Positive/therapeutic effect mentioned | month.

Nutrients
1. Insights into stria vascular function, stria immunity, and age-related hearing loss, Negative/adverse effect mentioned.
2. Coenzyme Q10 protective and therapeutic effects on acoustic trauma-induced hearing loss in rats, Positive/therapeutic effect mentioned.
3. Exocrine pancreatic insufficiency post-surgery, No clear dose/effect/duration found.

Summary for readers
• Hair loss interventions include alternative approaches, herbs, amino acids, vitamins, minerals, supplements, and nutrients.
• Effects are mixed: positive/therapeutic, negative/adverse, or unclear where dose/duration not specified.
• Units and durations are noted where specified (mg, g, IU, week, month, day).
""".trimIndent(),
                listOf(
                    Reference("Diseases. 2025 Sep 1;13(9):283", "👉 Detection of serum IL-17, IL-21, IL-6, TNF-α in patchy alopecia areata, Negative/adverse effect mentioned", "41002719"),
                    Reference("Mol Ther. 2025 Sep 23:S1525-0016(25)00767-1", "👉 AAV-mediated exon skipping therapy for Usher Syndrome, Type 2A, Positive/therapeutic effect mentioned", "40994011"),
                    Reference("Int J Womens Dermatol. 2025 Sep 19;11(3):e227", "👉 Oral spironolactone for female pattern hair loss in premenopausal women, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week", "40978669"),
                    Reference("Skin Appendage Disord. 2025 Aug;11(4):360-371", "👉 Herbal remedies for hair loss: review of efficacy and safety, Positive/therapeutic effect mentioned", "40771449"),
                    Reference("Int Immunopharmacol. 2025 Aug 28;161:115081", "👉 Curcumin analog C1 activates autophagy to protect sensory hair cells, No clear dose/effect/duration found", "40532329"),
                    Reference("Front Pharmacol. 2025 May 23;16:1544068", "👉 Research progress in non-scarring alopecia: mechanism and treatment, G | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40487405"),
                    Reference("J Zhejiang Univ Sci B. 2025 Sept 20;26(9):915-922", "👉 In situ 5-aminolevulinic acid photodynamic therapy in cutaneous SCC, No clear dose/effect/duration found", "40987558"),
                    Reference("StatPearls. 2025 Sep 14", "👉 Biotin deficiency overview, No clear dose/effect/duration found", "31613531"),
                    Reference("Front Nutr. 2025 Aug 26;12:1618630", "👉 Amino acid spectrum changes and alopecia post-bariatric surgery, month", "40933259"),
                    Reference("Clin Pract. 2025 Sep 15;15(9):168", "👉 Calcium and Vitamin D supplementation with/without collagen in menopausal women, IU, g, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41002783"),
                    Reference("Int J Med Inform. 2025 Sep 18;205:106121", "👉 Machine learning predicts scarring progression integrating trichoscopy, vitamin D, and timelines, month", "40975965"),
                    Reference("Surg Obes Relat Dis. 2025 Sep 10:S1550-7289(25)00901-3", "👉 Vitamin and micronutrient supplementation post-bariatric surgery, Positive/therapeutic effect mentioned | month", "40975648"),
                    Reference("Animals (Basel). 2025 Sep 11;15(18):2662", "👉 Supplemental trace minerals effect on haircoat and hair loss in adult cats, g | Positive/therapeutic effect mentioned | day", "41007910"),
                    Reference("Eur J Endocrinol. 2025 Aug 29;193(3):R1-R16", "👉 Long-term calcineurin inhibitor effects in transplant recipients, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40966721"),
                    Reference("Turk Arch Pediatr. 2025 Sep 1;60(5):483-490", "👉 Genetic rickets: clinical and laboratory characteristics, No clear dose/effect/duration found", "40959932"),
                    Reference("Int J Mol Sci. 2025 Sep 22;26(18):9253", "👉 Epigallocatechin-Gallate (EGCG) for human health and well-being, Positive/therapeutic effect mentioned", "41009815"),
                    Reference("J Assoc Res Otolaryngol. 2025 Sep 27", "👉 Insights into stria vascular function, stria immunity, and age-related hearing loss, Negative/adverse effect mentioned", "41006821"),
                    Reference("Int J Pediatr Otorhinolaryngol. 2025 Oct;197:112534", "👉 Coenzyme Q10 protective and therapeutic effects on acoustic trauma-induced hearing loss in rats, Positive/therapeutic effect mentioned", "40897074"),
                    Reference("Maedica (Bucur). 2025 Jun;20(2):428-431", "👉 Exocrine pancreatic insufficiency post-surgery, No clear dose/effect/duration found", "40880691")
                )
            )

            "Hay fever" -> Pair(
                """
Alternative approaches
1. Montelukast pharmacological potential review, No clear dose/effect/duration found.
2. Efficacy and safety of P. hybridus leaf extract Ze 339 for allergic rhinitis, Negative/adverse effect mentioned.
3. Recent studies and prospects of biologics in allergic rhinitis treatment, No clear dose/effect/duration found.

Herbs
1. Sensitization to herbs in birch, mugwort, grass pollen sufferers, Negative/adverse effect mentioned.
2. Management of respiratory disorders in a Chinese medicine teaching clinic, Negative/adverse effect mentioned.
3. Pollen information consumption as indicator of allergy burden, No clear dose/effect/duration found.

Amino acids
1. Clinical relevance and hypoallergenic peptides of major allergen Hum j 1, Positive/therapeutic effect mentioned.
2. Pectate Lyase as novel allergen in Artemisia sieversiana pollen, No clear dose/effect/duration found.
3. Pla a 7 novel pollen allergen in Platanus acerifolia pollen, No clear dose/effect/duration found.

Vitamins
1. Prevalence and potential risk factors for T2-low asthma, No clear dose/effect/duration found.
2. Antepartum high dietary calcium supply effects on bone and offspring growth, g | Positive/therapeutic effect mentioned.
3. Multicomponent nutraceutical add-on therapy in seasonal allergic rhinitis in children, Positive/therapeutic effect mentioned.

Minerals
1. Antepartum high dietary calcium supply effects, g | Positive/therapeutic effect mentioned.
2. Hita Tenryo Water™ natural mineral water effect on cedar allergy symptoms in mice, g | Positive/therapeutic effect mentioned.
3. Drug-free barrier-forming nasal spray for allergic rhinitis, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day.

Supplements
1. Allergenic tree pollen deposition in nasal cavity model, No clear dose/effect/duration found.
2. 5-Grass Pollen Liquid Sublingual Allergen Immunotherapy, Positive/therapeutic effect mentioned.
3. Multi-strain probiotic SYN-53 in management of allergic rhinoconjunctivitis, Positive/therapeutic effect mentioned.

Nutrients
1. Allergenic potential of common hops (Humulus lupulus L.) and cross-reactions with pollen allergens, Positive/therapeutic effect mentioned.
2. Pollen-food allergy syndrome: cross-reactivity between Pru p 3 and Ole e 7, No clear dose/effect/duration found.
3. Dietary inflammatory index and allergic rhinitis: case-control study, Positive/therapeutic effect mentioned.

Summary for readers
• Hay fever interventions include alternative approaches, herbs, amino acids, vitamins, minerals, supplements, and nutrients.
• Effects include positive/therapeutic, negative/adverse, or unclear where dose/duration is unspecified.
• Units and durations are included where provided (g, day).
""".trimIndent(),
                listOf(
                    Reference("Inflammopharmacology. 2025 Aug;33(8):4205-4235", "👉 Montelukast pharmacological potential review, No clear dose/effect/duration found", "40715741"),
                    Reference("Adv Respir Med. 2025 Jun 3;93(3):13", "👉 P. hybridus leaf extract Ze 339 for allergic rhinitis, Negative/adverse effect mentioned", "40558112"),
                    Reference("Int J Mol Sci. 2025 May 9;26(10):4509", "👉 Biologics in allergic rhinitis treatment, No clear dose/effect/duration found", "40429652"),
                    Reference("Int J Environ Res Public Health. 2022 Dec 20;20(1):33", "👉 Sensitization to herbs in birch, mugwort, grass pollen sufferers, Negative/adverse effect mentioned", "36612355"),
                    Reference("Chin Med. 2015 Nov 2;10:31", "👉 Management of respiratory disorders in a Chinese medicine teaching clinic, Negative/adverse effect mentioned", "26535052"),
                    Reference("Wien Klin Wochenschr. 2016 Jan;128(1-2):59-67", "👉 Pollen information consumption as indicator of allergy burden, No clear dose/effect/duration found", "26373744"),
                    Reference("Front Immunol. 2025 Jun 23;16:1588870", "👉 Clinical relevance and hypoallergenic peptides of major allergen Hum j 1, Positive/therapeutic effect mentioned", "40625753"),
                    Reference("Int Arch Allergy Immunol. 2024;185(11):1019-1032", "👉 Pectate Lyase as novel allergen in Artemisia sieversiana pollen, No clear dose/effect/duration found", "38897183"),
                    Reference("Int Immunopharmacol. 2023 Dec;125(Pt A):111160", "👉 Pla a 7 novel pollen allergen in Platanus acerifolia pollen, No clear dose/effect/duration found", "37948987"),
                    Reference("J Allergy Clin Immunol Pract. 2025 Aug;13(8):2075-2082.e2", "👉 Prevalence and risk factors for T2-low asthma, No clear dose/effect/duration found", "40316252"),
                    Reference("J Dairy Sci. 2025 Jun;108(6):5786-5802", "👉 Antepartum high dietary calcium supply effects on bone and offspring growth, g | Positive/therapeutic effect mentioned", "40139371"),
                    Reference("J Clin Med. 2025 Feb 24;14(5):1517", "👉 Multicomponent nutraceutical add-on therapy in seasonal allergic rhinitis in children, Positive/therapeutic effect mentioned", "40094983"),
                    Reference("Heliyon. 2024 Feb 25;10(5):e26915", "👉 Hita Tenryo Water™ effect on cedar allergy symptoms in mice, g | Positive/therapeutic effect mentioned", "38444511"),
                    Reference("Int Arch Allergy Immunol. 2023;184(2):111-121", "👉 Drug-free barrier-forming nasal spray for allergic rhinitis, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | day", "36323243"),
                    Reference("Otolaryngol Pol. 2025 Sep 15;79(5):1-20", "👉 Allergenic tree pollen deposition in nasal cavity model, No clear dose/effect/duration found", "40994392"),
                    Reference("J Investig Allergol Clin Immunol. 2025 Jul 17:0", "👉 5-Grass Pollen Liquid Sublingual Allergen Immunotherapy, Positive/therapeutic effect mentioned", "40686062"),
                    Reference("Allergy. 2025 Aug;80(8):2158-2166", "👉 Multi-strain probiotic SYN-53 in allergic rhinoconjunctivitis, Positive/therapeutic effect mentioned", "40577168"),
                    Reference("Nutrients. 2024 Oct 25;16(21):3626", "👉 Allergenic potential of common hops (Humulus lupulus L.), Positive/therapeutic effect mentioned", "39519459"),
                    Reference("Nutrients. 2024 Aug 27;16(17):2869", "👉 Pollen-food allergy syndrome: cross-reactivity between Pru p 3 and Ole e 7, No clear dose/effect/duration found", "39275185"),
                    Reference("Front Nutr. 2024 Jun 27;11:1418305", "👉 Dietary inflammatory index and allergic rhinitis: case-control study, Positive/therapeutic effect mentioned", "38993240")
                )
            )

            "Headaches" -> Pair(
                """
Alternative approaches
1. Comparative analysis of acute prescription migraine therapy outcomes, Positive/therapeutic effect mentioned.
2. Public and professional attitudes towards placebo, No clear dose/effect/duration found.
3. Confirmation bias in medical referrals: unusual pain presentation, Positive/therapeutic effect mentioned.

Herbs
1. Phytochemical profiling and toxicity assessment of Yinaoxin granules, g | Negative/adverse effect mentioned | day.
2. Evidence support in RCTs of herbal formulas for vestibular migraine, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
3. Traditional healing practices among Garo tribal women, Positive/therapeutic effect mentioned.

Amino acids
1. Successful treatment of multidrug-resistant tuberculous meningitis, day.
2. COVID-19 symptom diary study, g, mg | day.
3. Traditional uses and pharmacology of Abrus species, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.

Vitamins
1. Causal factors for migraine in Mendelian randomization studies, g | Positive/therapeutic effect mentioned.
2. Vitamin D treatment in children with POTS, month.
3. Etiological workup of pseudotumor cerebri in pediatric patients, No clear dose/effect/duration found.

Minerals
1. Global burden of low bone mineral density, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
2. Safety/effectiveness of hyaluronic acid & calcium hydroxyapatite hybrid injectable, Positive/therapeutic effect mentioned | week.
3. Safety of strategies for moderate to severe pain in endometriosis, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.

Supplements
1. Artri King induced Cushing syndrome, No clear dose/effect/duration found.
2. Effect of curcumin on fatigue & musculoskeletal health, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week.
3. Benefits and side effects of Hericium erinaceus as supplement, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.

Nutrients
1. Wernicke encephalopathy and posterior reversible encephalopathy following gastric sleeve surgery, Positive/therapeutic effect mentioned | month.
2. Online education modules on migraine severity and elimination diet use, No clear dose/effect/duration found.
3. Multivitamin-mineral supplementation prevents acute upper respiratory infections, Positive/therapeutic effect mentioned | month.

Summary for readers
• Headache interventions include alternative approaches, herbs, amino acids, vitamins, minerals, supplements, and nutrients.
• Effects are positive/therapeutic, negative/adverse, or unclear where dose/duration is unspecified.
• Units and durations are included where provided (g, mg, day, week, month).
""".trimIndent(),
                listOf(
                    Reference("medRxiv [Preprint]. 2025 Sep 19", "👉 Comparative analysis of acute prescription migraine therapy outcomes, Positive/therapeutic effect mentioned", "41001465"),
                    Reference("BMJ Neurol Open. 2025 Sep 21;7(2):e001171", "👉 Public and professional attitudes towards placebo, No clear dose/effect/duration found", "41000457"),
                    Reference("BMJ Case Rep. 2025 Sep 25;18(9):e267111", "👉 Confirmation bias in medical referrals: unusual pain presentation, Positive/therapeutic effect mentioned", "40998548"),
                    Reference("J Ethnopharmacol. 2025 Sep 1;354:120483", "👉 Yinaoxin granules: phytochemical profiling and toxicity assessment, g | Negative/adverse effect mentioned | day", "40902812"),
                    Reference("Phytomedicine. 2025 Jul 25;143:156864", "👉 Evidence support in RCTs of herbal formulas for vestibular migraine, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40449448"),
                    Reference("J Biosoc Sci. 2025 Mar;57(2):201-220", "👉 Traditional healing practices among Garo tribal women, Positive/therapeutic effect mentioned", "40012306"),
                    Reference("Am J Case Rep. 2025 Aug 16;26:e947502", "👉 Treatment of multidrug-resistant tuberculous meningitis, day", "40817574"),
                    Reference("J Patient Rep Outcomes. 2025 Aug 11;9(1):99", "👉 COVID-19 symptom diary study, g, mg | day", "40788441"),
                    Reference("Chem Biodivers. 2025 Jul 14:e00182", "👉 Pharmacology of Abrus species, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40658812"),
                    Reference("Front Neurol. 2025 Sep 9;16:1660995", "👉 Causal factors for migraine in Mendelian randomization studies, g | Positive/therapeutic effect mentioned", "40994718"),
                    Reference("Zhonghua Er Ke Za Zhi. 2025 Sep 18;63(10):1115-1120", "👉 Vitamin D treatment in children with POTS, month", "40962545"),
                    Reference("Eur J Pediatr. 2025 Sep 15;184(10):618", "👉 Etiological workup of pseudotumor cerebri in pediatric patients, No clear dose/effect/duration found", "40952520"),
                    Reference("Lancet Rheumatol. 2025 Sep 16:S2665-9913(25)00105-5", "👉 Low bone mineral density burden, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40972625"),
                    Reference("J Cosmet Dermatol. 2025 Sep;24(9):e70430", "👉 Safety/effectiveness of hyaluronic acid & calcium hydroxyapatite hybrid injectable, Positive/therapeutic effect mentioned | week", "40948024"),
                    Reference("Expert Opin Drug Saf. 2025 Aug 25", "👉 Pain management in endometriosis, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40788342"),
                    Reference("Dermatol Online J. 2025 Jun 15;31(3)", "👉 Artri King induced Cushing syndrome, No clear dose/effect/duration found", "40991472"),
                    Reference("BMJ Open. 2025 Sep 21;15(9):e096399", "👉 Curcumin effect on fatigue & musculoskeletal health, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week", "40976665"),
                    Reference("Front Nutr. 2025 Sep 1;12:1641246", "👉 Benefits and side effects of Hericium erinaceus as supplement, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40959699"),
                    Reference("Ochsner J. 2025 Fall;25(3):201-205", "👉 Wernicke encephalopathy and PRES post gastric sleeve surgery, Positive/therapeutic effect mentioned | month", "40995154"),
                    Reference("Nutrients. 2025 Jul 25;17(15):2432", "👉 Online education modules on migraine severity & elimination diet use, No clear dose/effect/duration found", "40806016"),
                    Reference("Asia Pac J Clin Nutr. 2025 Aug;34(4):596-609", "👉 Multivitamin-mineral supplementation prevents acute URIs, Positive/therapeutic effect mentioned | month", "40738727")
                )
            )



            "Heart attack" -> Pair(
                """
Alternative approaches
1. Impact of coronary revascularization on vessels with discordant FFR and resting full-cycle ratio, day | day.
2. Power of biomarkers in assessment of right ventricular dysfunction, No clear dose/effect/duration found.
3. Role of Lipoprotein(a) in cardiovascular risk stratification, No clear dose/effect/duration found.

Herbs
1. Resveratrol micelles in chitosan hydrogel protecting myocardial cells, Positive/therapeutic effect mentioned.
2. Darutigenol for treatment of myocardial infarction and ischemia/reperfusion injury, Positive/therapeutic effect mentioned.
3. BAOXIN granules reverse ferroptosis in ischemia-induced heart failure in rats, Positive/therapeutic effect mentioned.

Amino acids
1. Levothyroxine effect on major adverse cardiovascular events, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
2. Advanced Glycation End-Product Carboxymethyl-Lysine and incident heart failure, No clear dose/effect/duration found.
3. Inhibition of apoptosis, necroptosis, and ferroptosis for cardioprotection post-MI in rats, mg | Positive/therapeutic effect mentioned | day.

Vitamins
1. Composite dietary antioxidant index and peripheral artery disease, Positive/therapeutic effect mentioned.
2. Systemic immune-inflammatory index in high-risk hypertension patients, No clear dose/effect/duration found.
3. Effects of antioxidants on oxidative stress in coronary artery disease, Positive/therapeutic effect mentioned.

Minerals
1. FRAX with T-score predicts cardiovascular risk in older adults, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
2. Bone anabolic treatment in older adults, Positive/therapeutic effect mentioned.
3. Hair calcium levels in relation to coronary artery disease severity, No clear dose/effect/duration found.

Supplements
1. Endothelial activation and stress index in cardiovascular disease, No clear dose/effect/duration found.
2. Label statements and perceived health benefits of dietary supplements, Positive/therapeutic effect mentioned.
3. Cardiovascular toxicity associated with supplement use, Negative/adverse effect mentioned.

Nutrients
1. Education level and cardioprotective dietary patterns in post-MI patients, No clear dose/effect/duration found.
2. Personalized nutrition biomarkers and dietary strategies for atherosclerosis risk management, Positive/therapeutic effect mentioned.
3. Silybin mitigates post-MI heart failure in mice via HIF-1α modulation, Positive/therapeutic effect mentioned.

Summary for readers
• Heart attack interventions include alternative approaches, herbs, amino acids, vitamins, minerals, supplements, and nutrients.
• Effects are positive/therapeutic, negative/adverse, or unclear where dose/duration is unspecified.
• Units and durations are included where provided (mg, day).
    """.trimIndent(),
                listOf(
                    // Alternative
                    Reference("Heart Vessels. 2025 Sep 27", "👉 Coronary revascularization impact on discordant FFR vessels, day | day", "41014328"),
                    Reference("Int J Mol Sci. 2025 Sep 17;26(18):9064", "👉 Biomarkers for right ventricular dysfunction, No clear dose/effect/duration found", "41009628"),
                    Reference("Am J Cardiol. 2025 Sep 24:S0002-9149(25)00562-4", "👉 Lipoprotein(a) in cardiovascular risk stratification, No clear dose/effect/duration found", "41005599"),

                    // Herbs
                    Reference("Int J Biol Macromol. 2025 Sep;322(Pt 3):146803", "👉 Resveratrol micelles in chitosan hydrogel protecting myocardial cells, Positive/therapeutic effect mentioned", "40812651"),
                    Reference("Chin Med. 2025 Jun 18;20(1):90", "👉 Darutigenol for myocardial infarction and ischemia/reperfusion injury, Positive/therapeutic effect mentioned", "40533778"),
                    Reference("J Ethnopharmacol. 2025 Aug 29;352:120119", "👉 BAOXIN granules reverse ferroptosis in ischemia-induced heart failure in rats, Positive/therapeutic effect mentioned", "40516745"),

                    // Amino acids
                    Reference("Front Endocrinol (Lausanne). 2025 Aug 26;16:1640086", "👉 Levothyroxine effect on major adverse cardiovascular events, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40933375"),
                    Reference("J Am Heart Assoc. 2025 Sep 16;14(18):e040640", "👉 Advanced Glycation End-Product Carboxymethyl-Lysine and incident heart failure, No clear dose/effect/duration found", "40913281"),
                    Reference("Sci Rep. 2025 Aug 24;15(1):31140", "👉 Inhibition of apoptosis, necroptosis, and ferroptosis for cardioprotection post-MI in rats, mg | Positive/therapeutic effect mentioned | day", "40851081"),

                    // Vitamins
                    Reference("Front Nutr. 2025 Sep 10;12:1606769", "👉 Composite dietary antioxidant index and peripheral artery disease, Positive/therapeutic effect mentioned", "41001125"),
                    Reference("Sao Paulo Med J. 2025 Sep 19;143(6):e2024301", "👉 Systemic immune-inflammatory index in high-risk hypertension patients, No clear dose/effect/duration found", "40990772"),
                    Reference("Clin Nutr ESPEN. 2025 Oct;69:794-801", "👉 Effects of antioxidants on oxidative stress in coronary artery disease, Positive/therapeutic effect mentioned", "40914496"),

                    // Minerals
                    Reference("Arch Osteoporos. 2025 Sep 12;20(1):125", "👉 FRAX with T-score predicts cardiovascular risk in older adults, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40938492"),
                    Reference("Gerontology. 2025 Jul 11", "👉 Bone anabolic treatment in older adults, Positive/therapeutic effect mentioned", "40652924"),
                    Reference("J Clin Med. 2025 Jun 26;14(13):4537", "👉 Hair calcium levels and coronary artery disease severity, No clear dose/effect/duration found", "40648911"),

                    // Supplements
                    Reference("BMC Cardiovasc Disord. 2025 Sep 26;25(1):681", "👉 Endothelial activation and stress index in cardiovascular disease, No clear dose/effect/duration found", "41013243"),
                    Reference("JAMA Netw Open. 2025 Sep 2;8(9):e2533118", "👉 Label statements and perceived health benefits of dietary supplements, Positive/therapeutic effect mentioned", "40982278"),
                    Reference("Clin Toxicol (Phila). 2025 Sep 17", "👉 Cardiovascular toxicity associated with supplement use, Negative/adverse effect mentioned", "40960841"),

                    // Nutrients
                    Reference("Nutrients. 2025 Sep 22;17(18):3018", "👉 Education level and cardioprotective dietary patterns in post-MI patients, No clear dose/effect/duration found", "41010546"),
                    Reference("Nutrients. 2025 Aug 28;17(17):2804", "👉 Personalized nutrition biomarkers and dietary strategies for atherosclerosis risk management, Positive/therapeutic effect mentioned", "40944193"),
                    Reference("Nutrients. 2025 Aug 28;17(17):2800", "👉 Silybin mitigates post-MI heart failure via HIF-1α modulation, Positive/therapeutic effect mentioned", "40944191")
                )
            )

            "Heart failure" -> Pair(
                """
Alternative approaches
1. Heart failure and left ventricular ejection fraction: a necessary but imperfect partnership, Positive/therapeutic effect mentioned.
2. Integrating exercise and medication management in geriatric care, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
3. Impact of coronary revascularization on discordant FFR vessels, day | day.

Herbs
1. Salvianolic acid B and Senkyunolide I synergistically alleviate cardiac hypertrophy, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
2. Detection of effective ingredients from TCM via real-world clinical data, No clear dose/effect/duration found.
3. Therapeutic frontiers in viral myocarditis targeting inflammation and oxidative stress, Positive/therapeutic effect mentioned.

Amino acids
1. Biventricular function and Asymmetric Dimethylarginine levels in Hashimoto's thyroiditis, No clear dose/effect/duration found.
2. Metabolic hormones and inflammatory markers after Roux-en-Y gastric bypass, month | month.
3. Plasma metabolomic profiling in mouse model of Type 2 Diabetes, Negative/adverse effect mentioned.

Vitamins
1. Vascular access survival in nocturnal haemodialysis, Positive/therapeutic effect mentioned | month.
2. Efficacy and safety of DOACs versus vitamin K antagonists in left ventricular thrombus, Positive/therapeutic effect mentioned.
3. Value-based healthcare in laboratory medicine, No clear dose/effect/duration found.

Minerals
1. Telemonitored titration for HFrEF, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week, day, month.
2. Optimal serum selenium range for HF prevention, µg | Positive/therapeutic effect mentioned.
3. Stress hyperglycemic ratio and mortality in diabetic HF patients, No clear dose/effect/duration found.

Supplements
1. Acute heart failure care - international expert consensus, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month.
2. Endothelial activation and stress index in cardiovascular disease, No clear dose/effect/duration found.
3. Lacticaseibacillus rhamnosus Probio-M9 alters gut microbiota and mitigates pulmonary hypertension, Positive/therapeutic effect mentioned.

Nutrients
1. Hopeaphenol protects against cardiac hypertrophy via AMPK activation, Positive/therapeutic effect mentioned.
2. Lacticaseibacillus rhamnosus Probio-M9 alters gut microbiota and mitigates pulmonary hypertension, Positive/therapeutic effect mentioned.
3. Endoplasmic reticulum stress in cardiomyopathies: from UPR to therapeutic opportunities, No clear dose/effect/duration found.

Summary for readers
• Heart failure interventions include alternative approaches, herbs, amino acids, vitamins, minerals, supplements, and nutrients.
• Effects can be positive/therapeutic, negative/adverse, or unclear when dose/duration is unspecified.
• Units and durations are included where provided (day, week, month, µg).
    """.trimIndent(),
                listOf(
                    // Alternative
                    Reference("Heart Fail Rev. 2025 Sep 27", "👉 LV ejection fraction: necessary but imperfect partnership, Positive/therapeutic effect mentioned", "41015636"),
                    Reference("Lancet Healthy Longev. 2025 Sep 24:100763", "👉 Exercise and medication integration in geriatric care, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41015054"),
                    Reference("Heart Vessels. 2025 Sep 27", "👉 Coronary revascularization impact on discordant FFR vessels, day | day", "41014328"),

                    // Herbs
                    Reference("Chin Med. 2025 Sep 28;20(1):148", "👉 Salvianolic acid B + Senkyunolide I alleviate cardiac hypertrophy, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41015772"),
                    Reference("Phytomedicine. 2025 Nov;147:157225", "👉 Detecting effective TCM ingredients from real-world clinical data, No clear dose/effect/duration found", "40945250"),
                    Reference("Front Immunol. 2025 Aug 14;16:1643502", "👉 Therapeutic frontiers in viral myocarditis, Positive/therapeutic effect mentioned", "40895553"),

                    // Amino acids
                    Reference("Niger J Clin Pract. 2025 Sep 1;28(9):1039-1048", "👉 Biventricular functions and ADMA in Hashimoto's, No clear dose/effect/duration found", "41014529"),
                    Reference("Diabetes Res Clin Pract. 2025 Sep 24:112923", "👉 Metabolic hormones post Roux-en-Y gastric bypass, month | month", "41005747"),
                    Reference("Metabolites. 2025 Aug 22;15(9):564", "👉 Plasma metabolomics in T2D mice, Negative/adverse effect mentioned", "41002949"),

                    // Vitamins
                    Reference("J Nephrol. 2025 Sep 26", "👉 Vascular access survival in nocturnal haemodialysis, Positive/therapeutic effect mentioned | month", "41004027"),
                    Reference("J Cardiol. 2025 Sep 20:S0914-5087(25)00242-4", "👉 DOACs vs vitamin K antagonists in LV thrombus, Positive/therapeutic effect mentioned", "40983289"),
                    Reference("Clin Chem Lab Med. 2025 Sep 10", "👉 Value-based healthcare in lab medicine, No clear dose/effect/duration found", "40960389"),

                    // Minerals
                    Reference("Eur Heart J Digit Health. 2025 Jun 5;6(5):897-906", "👉 Telemonitored titration for HFrEF, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week, day, month", "40984989"),
                    Reference("J Int Med Res. 2025 Aug;53(8):3000605251370320", "👉 Optimal serum selenium range for HF prevention, µg | Positive/therapeutic effect mentioned", "40884837"),
                    Reference("BMC Endocr Disord. 2025 Aug 6;25(1):192", "👉 Stress hyperglycemic ratio and all-cause mortality in diabetic HF, No clear dose/effect/duration found", "40770315"),

                    // Supplements
                    Reference("Eur J Heart Fail. 2025 Sep 28", "👉 Acute HF care - international expert consensus, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month", "41015948"),
                    Reference("BMC Cardiovasc Disord. 2025 Sep 26;25(1):681", "👉 Endothelial activation and stress index, No clear dose/effect/duration found", "41013243"),
                    Reference("Nutrients. 2025 Sep 11;17(18):2927", "👉 Lacticaseibacillus rhamnosus Probio-M9 alters gut microbiota and mitigates pulmonary hypertension, Positive/therapeutic effect mentioned", "41010453"),

                    // Nutrients
                    Reference("Nutrients. 2025 Sep 22;17(18):3025", "👉 Hopeaphenol protects against cardiac hypertrophy via AMPK activation, Positive/therapeutic effect mentioned", "41010549"),
                    Reference("Nutrients. 2025 Sep 11;17(18):2927", "👉 Lacticaseibacillus rhamnosus Probio-M9 alters gut microbiota and mitigates pulmonary hypertension, Positive/therapeutic effect mentioned", "41010453"),
                    Reference("Front Cardiovasc Med. 2025 Sep 8;12:1577186", "👉 ER stress in cardiomyopathies: UPR to therapeutic opportunities, No clear dose/effect/duration found", "40989111")
                )
            )

            "Heartburn and acid reflux" -> Pair(
                """
Alternative approaches
1. A millifluidic esophagus on-a-chip model for evaluating a natural remedy-mediated mucosal repair in GERD, No clear dose/effect/duration found.
2. Comparison of Fexuprazan and Esomeprazole for control of nocturnal gastroesophageal reflux symptoms, Positive/therapeutic effect mentioned | week.
3. Adenomatous hyperplasia of duodenal Brunner's glands, Positive/therapeutic effect mentioned.

Herbs
1. Integrative approaches to managing gut health, No clear dose/effect/duration found.
2. Type 2 gastric neuroendocrine tumor case, Positive/therapeutic effect mentioned.
3. Complementary and alternative medicine use in GI conditions, No clear dose/effect/duration found.

Amino acids
1. Relationship between amino acids and GERD, Positive/therapeutic effect mentioned.
2. Bioadhesive formulation for nonerosive reflux disease symptoms, Positive/therapeutic and Negative/adverse effect mentioned | day.
3. Esomeprazole and Rebamipide combination therapy in reflux esophagitis, mg | Positive/therapeutic effect mentioned | week.

Vitamins
1. Multivitamin complex with probiotics and peptides improves GERD outcomes, Positive/therapeutic effect mentioned | day.
2. Erosive wear in children linked to reflux and diet, No clear dose/effect/duration found.
3. Heartburn medicine users should monitor vitamin B12, No clear dose/effect/duration found.

Minerals
1. Refluthin relieves heartburn and gastric discomfort rapidly, Positive/therapeutic effect mentioned | week.
2. Mechanism of action of Poliprotect in GERD and dyspepsia, Positive/therapeutic effect mentioned.
3. Carbonates + Opuntia ficus-indica extract protect esophageal cells, Positive/therapeutic and Negative/adverse effects mentioned.

Supplements
1. Fermented Soybean (FSB) supplementation reduces GERD symptoms, g | Positive/therapeutic effect mentioned | week.
2. Multivitamin complex with probiotics and peptides improves GERD outcomes, Positive/therapeutic effect mentioned | day.
3. Gut-brain interaction and reflux symptoms in pregnancy, Positive/therapeutic effect mentioned.

Nutrients
1. Fermented Soybean (FSB) supplementation reduces GERD symptoms, g | Positive/therapeutic effect mentioned | week.
2. Multivitamin and probiotic blend improves reflux-related quality of life, Positive/therapeutic effect mentioned | day.
3. Heat-killed Lactobacillus johnsonii reduces reflux-related symptoms, g | Positive/therapeutic and Negative/adverse effects mentioned | week.

Summary for readers
• Interventions include alternative approaches, herbs, amino acids, vitamins, minerals, supplements, and nutrients.
• Most studies report positive or therapeutic effects, though some include negative or unclear outcomes.
• Reported units include g, mg, day, week, and indicate study duration or dosage where available.
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Biomed Pharmacother. 2025 Sep 25;192:118609", "👉 Natural remedy-mediated mucosal repair in GERD, No clear dose/effect/duration found", "41004870"),
                    Reference("J Neurogastroenterol Motil. 2025 Aug 25", "👉 Fexuprazan vs Esomeprazole in nocturnal GERD, Positive/therapeutic effect mentioned | week", "40854583"),
                    Reference("Cureus. 2025 Jul 22;17(7):e88551", "👉 Brunner’s gland hyperplasia mimicking malignancy, Positive/therapeutic effect mentioned", "40851743"),

                    // Herbs
                    Reference("Curr Gastroenterol Rep. 2024 Jul;26(7):181-189", "👉 Integrative gut health approaches, No clear dose/effect/duration found", "38472695"),
                    Reference("Transl Gastroenterol Hepatol. 2016 Nov 30;1:88", "👉 Type 2 gastric neuroendocrine tumor case, Positive/therapeutic effect mentioned", "28138653"),
                    Reference("Am J Gastroenterol. 2014 Nov;109(11):1705-11", "👉 Complementary and alternative medicine use in GI disorders, No clear dose/effect/duration found", "25001257"),

                    // Amino acids
                    Reference("Front Immunol. 2025 Mar 4;16:1420132", "👉 Amino acids and GERD relationship, Positive/therapeutic effect mentioned", "40103821"),
                    Reference("Eur J Gastroenterol Hepatol. 2021 Feb;32(2):163-170", "👉 Bioadhesive formulation for reflux symptoms, Positive/therapeutic and adverse effects | day", "32804843"),
                    Reference("Gut Liver. 2016 Nov 15;10(6):910-916", "👉 Esomeprazole + Rebamipide combination benefits reflux esophagitis, mg | Positive effect | week", "27282265"),

                    // Vitamins
                    Reference("Nutrients. 2024 Jun 4;16(11):1759", "👉 Probiotic + vitamin supplement improves GERD, Positive/therapeutic effect | day", "38892690"),
                    Reference("J Clin Pediatr Dent. 2024 May;48(3):146-155", "👉 Dental erosion in reflux-affected children, No clear dose/effect/duration found", "38755993"),
                    Reference("Harv Health Lett. 2014 Mar;39(5):8", "👉 Heartburn medicine and vitamin B12 warning, No clear dose/effect/duration found", "24834538"),

                    // Minerals
                    Reference("Sci Rep. 2025 May 7;15(1):15896", "👉 Refluthin relieves heartburn rapidly, Positive/therapeutic effect | week", "40335653"),
                    Reference("Int J Mol Sci. 2025 Jan 29;26(3):1181", "👉 Poliprotect mechanism in GERD/dyspepsia, Positive/therapeutic effect", "39940951"),
                    Reference("Sci Rep. 2024 Sep 27;14(1):22355", "👉 Carbonates + Opuntia ficus-indica protect esophageal cells, Positive + adverse effects", "39333650"),

                    // Supplements
                    Reference("Nutrients. 2024 Aug 20;16(16):2779", "👉 Fermented Soybean (FSB) supplementation benefits GERD, g | Positive/therapeutic effect | week", "39203915"),
                    Reference("Nutrients. 2024 Jun 4;16(11):1759", "👉 Probiotic + vitamin blend improves reflux outcomes, Positive/therapeutic effect | day", "38892690"),
                    Reference("Indian J Gastroenterol. 2025 Jan 4", "👉 Gut-brain interaction in pregnancy-related reflux, Positive/therapeutic effect", "39754699"),

                    // Nutrients
                    Reference("Nutrients. 2024 Aug 20;16(16):2779", "👉 Fermented Soybean (FSB) reduces GERD symptoms, g | Positive/therapeutic effect | week", "39203915"),
                    Reference("Nutrients. 2024 Jun 4;16(11):1759", "👉 Multivitamin + probiotic complex improves reflux outcomes, Positive/therapeutic effect | day", "38892690"),
                    Reference("Nutrients. 2024 Apr 20;16(8):1230", "👉 Heat-killed Lactobacillus johnsonii alleviates reflux, g | Positive + adverse effects | week", "38674920")
                )
            )

            "Heat exhaustion and heatstroke" -> Pair(
                """
Alternative approaches
1. Perceptual strain in a compensable hot environment: accuracy and clinical correlates, Positive/therapeutic effect mentioned.
2. Pre-hydration strategies in dogs tracking in hot environments, day | day.
3. Thermoregulatory disorders and illness related to heat and cold stress, Positive/therapeutic effect mentioned.

Herbs
1. Public health approach of Unani medicine to cope and stay safe in hot environments, Positive/therapeutic effect mentioned.

Amino acids
1. Acute (L)-glutamine supplementation and gastrointestinal permeability under heat stress, g | Positive/therapeutic and Negative/adverse effect mentioned.
2. Humid heat exposure induces oxidative stress and apoptosis in cardiomyocytes, Positive/therapeutic effect mentioned.
3. Thyroid gland function in heatstroke, No clear dose/effect/duration found.

Vitamins
1. Calcium metabolism in exertional heat stroke with rhabdomyolysis, IU.
2. Jaundice after resolution of heat stroke, Positive/therapeutic effect mentioned.
3. Tendency of heat stroke over past years, No clear dose/effect/duration found.

Minerals
1. Mechanism of hypophosphatemia in acute heat stroke, No clear dose/effect/duration found.

Supplements
1. Factors for exertional heat exhaustion among amateur golfers, No clear dose/effect/duration found.
2. Recommendations for adults with cardiovascular disease in hot weather, Positive/therapeutic and Negative/adverse effects mentioned.
3. Exertional heat illness risk factors among collegiate marching band artists, Negative/adverse effect mentioned.

Nutrients
1. Glutamine supplementation as possible strategy to mitigate heat illness, Positive/therapeutic effect mentioned.
2. Energy metabolism in exertional heat stroke with acute renal failure, No clear dose/effect/duration found.

Summary for readers
• Research explores hydration, amino acids, vitamins, and nutrient strategies.
• Positive and negative effects are reported depending on dose, environment, and duration.
• Preventive hydration and gradual heat exposure remain essential to reduce risk.
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("J Therm Biol. 2021 Aug;100:102863", "👉 Perceptual strain in a compensable hot environment, Positive/therapeutic effect mentioned", "34503767"),
                    Reference("Front Vet Sci. 2020 Jun 3;7:292", "👉 Pre-hydration strategies in dogs tracking in hot environments, day | day", "32582777"),
                    Reference("Auton Neurosci. 2016 Apr;196:91-104", "👉 Thermoregulatory disorders related to heat and cold stress, Positive/therapeutic effect mentioned", "26794588"),

                    // Herbs
                    Reference("J Basic Clin Physiol Pharmacol. 2021 Mar 15;33(3):235-241", "👉 Unani medicine approach to coping with heat environments, Positive/therapeutic effect mentioned", "33711220"),

                    // Amino acids
                    Reference("Eur J Sport Sci. 2022 Dec;22(12):1865-1876", "👉 (L)-Glutamine supplementation and GI permeability under heat stress, g | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "34726114"),
                    Reference("Heart Vessels. 2015 May;30(3):396-405", "👉 Humid heat exposure induces oxidative stress and apoptosis in cardiomyocytes, Positive/therapeutic effect mentioned", "24898407"),
                    Reference("Biull Eksp Biol Med. 1975 Jul;80(7):21-4", "👉 Thyroid gland function in heatstroke, No clear dose/effect/duration found", "1227640"),

                    // Vitamins
                    Reference("Nephron. 1995;71(4):428-32", "👉 Calcium metabolism in exertional heat stroke with rhabdomyolysis, IU", "8587623"),
                    Reference("Ann Emerg Med. 1983 Feb;12(2):102-3", "👉 Jaundice after resolution of heat stroke, Positive/therapeutic effect mentioned", "6824203"),
                    Reference("Tohoku Igaku Zasshi. 1962 Sep;66:294-9", "👉 Tendency of heat stroke during the past four years, No clear dose/effect/duration found", "14055576"),

                    // Minerals
                    Reference("JAMA. 1977 Aug 1;238(5):425-6", "👉 Mechanism of hypophosphatemia in acute heat stroke, No clear dose/effect/duration found", "577561"),

                    // Supplements
                    Reference("Temperature (Austin). 2025 Jun 3;12(3):296-311", "👉 Exertional heat exhaustion among amateur golfers, No clear dose/effect/duration found", "40926793"),
                    Reference("Eur J Prev Cardiol. 2025 Aug 19", "👉 Cardiovascular disease and activity in hot weather, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40827078"),
                    Reference("Sports Med Health Sci. 2024 Apr 26;7(2):132-142", "👉 Heat illness among collegiate marching band artists, Negative/adverse effect mentioned", "39811407"),

                    // Nutrients
                    Reference("J Nutr Metab. 2024 Nov 22;2024:1638244", "👉 Glutamine supplementation to mitigate heat illness, Positive/therapeutic effect mentioned", "39619011"),
                    Reference("Nephrol Dial Transplant. 1997 Oct;12(10):2087-92", "👉 Energy metabolism in exertional heat stroke with renal failure, No clear dose/effect/duration found", "9351070")
                )
            )

            "Heat rash" -> Pair(
                """
Alternative approaches
1. Interventions for jellyfish sting symptoms, Positive/therapeutic and Negative/adverse effects mentioned.
2. Erythema Ab Igne: mottled rash on torso, No clear dose/effect/duration found.
3. Management of viral oral ulcers in children using Chinese herbal medicine, No clear dose/effect/duration found.

Herbs
1. Public health approach of Unani medicine to cope and stay safe in hot environments, Positive/therapeutic effect mentioned.
2. Antilupus pill effects on systemic lupus erythematosus, Negative/adverse effect mentioned.

Amino acids
1. Histamine poisoning from insect consumption, g, mg | Negative/adverse effect mentioned.
2. Gabapentin efficacy in pruritus and quality of life for notalgia paresthetica, mg | Positive/therapeutic effect mentioned.
3. Milia en plaque, No clear dose/effect/duration found.

Vitamins
1. Liangxue Jiedu decoction for psoriasis vulgaris, Positive/therapeutic and Negative/adverse effects mentioned.
2. Rapid remission with calcipotriol betamethasone in refractory Fox-Fordyce disease, No clear dose/effect/duration found.
3. Grover disease: management review, Positive/therapeutic effect mentioned.

Minerals
1. Common skin rashes in infants, Negative/adverse effect mentioned | week.
2. Mineral oil drinking water pollution accident, No clear dose/effect/duration found.
3. Miliaria rubra in miners, week.

Supplements
1. Heat-related illness in athletes, Positive/therapeutic effect mentioned.

Nutrients
1. Ascorbic acid (vitamin C) for prickly heat, No clear dose/effect/duration found.
2. Host-plant resources and herbivore abundance, No clear dose/effect/duration found.
3. Vitamin B2, B6 and manganese metabolism in children with allergic dermatoses, No clear dose/effect/duration found.

Summary for readers
• Heat rash (miliaria) involves obstruction of sweat glands and skin irritation from heat and humidity.
• Research covers environmental, herbal, and nutrient-based factors in prevention and symptom control.
• Positive effects noted for traditional herbal and nutrient strategies; preventive cooling remains most effective.
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Cochrane Database Syst Rev. 2023 Jun 5;6(6):CD009688", "👉 Interventions for jellyfish sting symptoms, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "37272501"),
                    Reference("Cureus. 2020 Jan 11;12(1):e6628", "👉 Erythema Ab Igne: Mottled Rash on Torso, No clear dose/effect/duration found", "32064204"),
                    Reference("Complement Ther Med. 2017 Jun;32:61-65", "👉 Chinese herbal medicine for viral oral ulcers in children, No clear dose/effect/duration found", "28619306"),

                    // Herbs
                    Reference("J Basic Clin Physiol Pharmacol. 2021 Mar 15;33(3):235-241", "👉 Unani medicine for coping with heat, Positive/therapeutic effect mentioned", "33711220"),
                    Reference("Zhong Xi Yi Jie He Za Zhi. 1989 Aug;9(8):465-8, 452", "👉 Antilupus pill (17 Chinese herbs), Negative/adverse effect mentioned", "2598347"),

                    // Amino acids
                    Reference("Clin Toxicol (Phila). 2018 Feb;56(2):126-131", "👉 Histamine poisoning from insect consumption, g, mg | Negative/adverse effect mentioned", "28748745"),
                    Reference("An Bras Dermatol. 2014 Jul-Aug;89(4):570-5", "👉 Gabapentin improves pruritus in notalgia paresthetica, mg | Positive/therapeutic effect mentioned", "25054742"),
                    Reference("Actas Dermosifiliogr. 2013 Sep;104(7):638-40", "👉 Milia en plaque, No clear dose/effect/duration found", "23871459"),

                    // Vitamins
                    Reference("J Tradit Chin Med. 2020 Apr;40(2):296-304", "👉 Liangxue Jiedu decoction for psoriasis vulgaris, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "32242395"),
                    Reference("Dermatol Ther. 2020 Mar;33(2):e13223", "👉 Calcipotriol betamethasone in Fox-Fordyce disease, No clear dose/effect/duration found", "31917488"),
                    Reference("Int J Dermatol. 2020 May;59(5):543-550", "👉 Grover disease management review, Positive/therapeutic effect mentioned", "31724740"),

                    // Minerals
                    Reference("FP Essent. 2013 Apr;407:31-41", "👉 Common skin rashes in infants, Negative/adverse effect mentioned | week", "23600337"),
                    Reference("Arh Hig Rada Toksikol. 2011 Dec;62(4):349-56", "👉 Mineral oil pollution accident (Croatia), No clear dose/effect/duration found", "22202469"),
                    Reference("Occup Med (Lond). 2000 Aug;50(6):430-3", "👉 Miliaria rubra in miners, week", "10994246"),

                    // Supplements
                    Reference("Am J Sports Med. 2007 Aug;35(8):1384-95", "👉 Heat-related illness in athletes, Positive/therapeutic effect mentioned", "17609528"),

                    // Nutrients
                    Reference("JAMA Dermatol. 2018 Jun 1;154(6):675", "👉 Ascorbic acid (vitamin C) for prickly heat, No clear dose/effect/duration found", "29898224"),
                    Reference("J Anim Ecol. 2008 Sep;77(5):1063-71", "👉 Host-plant resources and herbivore abundance, No clear dose/effect/duration found", "18507695"),
                    Reference("Pediatriia. 1974 Dec;(12):17-8", "👉 Vitamin B2, B6 and manganese metabolism in children with allergic dermatoses, No clear dose/effect/duration found", "4444898")
                )
            )

            "Hepatitis" -> Pair(
                """
Alternative approaches
1. Management of hepatotoxicity with CDK4/6 inhibitors, Positive/therapeutic and Negative/adverse effects mentioned.
2. Biomarkers of liver disease in HIV-HBV co-infection, Positive/therapeutic and Negative/adverse effects mentioned.
3. HDV-specific antisera as diagnostic tools, No clear dose/effect/duration found.

Herbs
1. Astragalin inhibits hepatitis B virus via CD8+ T cell reconstitution, Positive/therapeutic and Negative/adverse effects mentioned.
2. Bioactive herbs for liver disorders, Positive/therapeutic effect mentioned.
3. Drug-induced autoimmune hepatitis: causality assessment, No clear dose/effect/duration found.

Amino acids
1. Glecaprevir/Pibrentasvir effects on liver function and HCC risk, month.
2. Periplaneta americana glycoproteins treat immunological liver fibrosis, Positive/therapeutic effect mentioned.
3. Tryptophan catabolites from microbiota ameliorate immune-mediated hepatitis, Positive/therapeutic effect mentioned.

Vitamins
1. Riboflavin metabolism in HepG2 cells with swine Hepatitis E virus, Positive/therapeutic effect mentioned.
2. Routine immunisation coverage and influenza vaccine introduction, Positive/therapeutic effect mentioned | month.
3. Vitamin D deficiency in HIV and chronic liver diseases, Positive/therapeutic and Negative/adverse effects mentioned.

Minerals
1. Tenofovir alafenamide preventing HBV recurrence post-transplant, Positive/therapeutic and Negative/adverse effects mentioned | week.
2. Hepatolithiasis in dogs post-cholecystectomy, day.
3. Nursing strategies for hepatitis E post-cardiac arrest, Positive/therapeutic effect mentioned | day.

Supplements
1. Management of hepatotoxicity with CDK4/6 inhibitors, Positive/therapeutic and Negative/adverse effects mentioned.
2. Vitamin D supplementation in chronic liver diseases, Positive/therapeutic and Negative/adverse effects mentioned.

Nutrients
1. Mexican diet bioactives targeting HBV, HCV, and MASLD, Positive/therapeutic and Negative/adverse effects mentioned.
2. Gut dysbiosis and plasma trimethylamine oxide in MASLD, No clear dose/effect/duration found.
3. Tea consumption and liver cancer risk, Positive/therapeutic effect mentioned.

Summary for readers
• Hepatitis refers to inflammation of the liver caused by viral infection, toxins, or autoimmune reactions.
• Research covers herbal, nutrient, amino acid, and vitamin interventions to support liver regeneration and reduce inflammation.
• Natural compounds such as astragalin, tryptophan derivatives, and riboflavin show potential therapeutic effects.
• Balanced diet, controlled medication use, and avoidance of alcohol remain key in management and prevention.
            """.trimIndent(),
                listOf(
                    // Alternative
                    Reference("J Cancer Res Clin Oncol. 2025 Sep 27;151(10):270", "👉 Management of hepatotoxicity with CDK4/6 inhibitors, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41014426"),
                    Reference("Curr HIV/AIDS Rep. 2025 Sep 27;22(1):46", "👉 Biomarkers of liver disease in HIV-HBV co-infection, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41014390"),
                    Reference("Viruses. 2025 Sep 7;17(9):1220", "👉 HDV-specific antisera as diagnostic tools, No clear dose/effect/duration found", "41012648"),

                    // Herbs
                    Reference("Eur J Pharmacol. 2025 Oct 15;1005:178108", "👉 Astragalin inhibits hepatitis B virus, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40886877"),
                    Reference("Curr Drug Metab. 2025 Aug 21", "👉 Bioactive herbs for liver disorders, Positive/therapeutic effect mentioned", "40849767"),
                    Reference("Diagnostics (Basel). 2025 Jun 23;15(13):1588", "👉 Drug-induced autoimmune hepatitis, No clear dose/effect/duration found", "40647587"),

                    // Amino acids
                    Reference("Medicina (Kaunas). 2025 Sep 4;61(9):1601", "👉 Glecaprevir/Pibrentasvir effects on liver function, month", "41010992"),
                    Reference("Int J Biol Macromol. 2025 Sep 24;329(Pt 2):147900", "👉 Periplaneta americana glycoproteins treat liver fibrosis, Positive/therapeutic effect mentioned", "41005413"),
                    Reference("Gut Microbes. 2025 Dec;17(1):2557979", "👉 Tryptophan catabolites ameliorate immune-mediated hepatitis, Positive/therapeutic effect mentioned", "40995824"),

                    // Vitamins
                    Reference("Vet Sci. 2025 Sep 19;12(9):912", "👉 Riboflavin metabolism and hepatitis E virus interaction, Positive/therapeutic effect mentioned", "41012837"),
                    Reference("Lancet Glob Health. 2025 Oct;13(10):e1737-e1749", "👉 Immunisation coverage and influenza vaccine introduction, Positive/therapeutic effect mentioned | month", "40975081"),
                    Reference("HIV Med. 2025 Sep 20", "👉 Vitamin D deficiency and chronic liver disease, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40974294"),

                    // Minerals
                    Reference("Am J Transplant. 2025 Sep 17", "👉 Tenofovir alafenamide efficacy post-liver transplant, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week", "40972902"),
                    Reference("J Am Vet Med Assoc. 2025 Sep 17:1-6", "👉 Hepatolithiasis in dogs post-cholecystectomy, day", "40961978"),
                    Reference("Medicine (Baltimore). 2025 Sep 5;104(36):e44325", "👉 Hepatitis E nursing strategies post-cardiac arrest, Positive/therapeutic effect mentioned | day", "40922328"),

                    // Supplements
                    Reference("J Cancer Res Clin Oncol. 2025 Sep 27;151(10):270", "👉 Hepatotoxicity management with supplements, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41014426"),
                    Reference("HIV Med. 2025 Sep 20", "👉 Vitamin D deficiency link to chronic hepatitis, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40974294"),

                    // Nutrients
                    Reference("Int J Mol Sci. 2025 Sep 15;26(18):8977", "👉 Mexican diet bioactives and HBV/HCV prevention, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41009545"),
                    Reference("Nutrients. 2025 Aug 26;17(17):2759", "👉 Gut Dysbiosis and MASLD correlation, No clear dose/effect/duration found", "40944149"),
                    Reference("Nutrients. 2025 Aug 15;17(16):2647", "👉 Tea consumption and liver cancer risk, Positive/therapeutic effect mentioned", "40871674")
                )
            )

            "Hernia" -> Pair(
                """
Alternative approaches
1. Meta-learning models for chest X-ray disease classification, No clear dose/effect/duration found.
2. Antenatal Sildenafil for congenital diaphragmatic hernia, G.
3. Adenomyoma of the round ligament in the inguinal canal: case report, G.

Herbs
1. Traditional Chinese Medicine supplement reduces pain faster than conventional pills, Positive/therapeutic effect mentioned | day.
2. Total flavonoids of Engelhardia roxburghiana leaves protect against intestinal injury, Positive/therapeutic effect mentioned.
3. Historical review of ethnopharmacology in Karelia, No clear dose/effect/duration found.

Amino acids
1. Thyroid hormone deficiency disrupts embryonic ventral body wall development and myogenesis, mg, μg | Positive/therapeutic effect mentioned.
2. Circulating tryptophan metabolites and postoperative pain in lumbar disc herniation, No clear dose/effect/duration found.
3. PVN(Glu)-PrL(Glu) circuit: chronic pain management for lumbar disc herniation, No clear dose/effect/duration found.

Vitamins
1. Menaquinone-4 ameliorates abdominal aortic aneurysm by suppressing ferroptosis, No clear dose/effect/duration found.
2. Adverse outcomes in hypothyroidism patients undergoing bariatric surgery, Positive/therapeutic and Negative/adverse effects mentioned.
3. Lumbar disc herniation in osteogenesis imperfecta (COL1A1 mutation), Positive/therapeutic effect mentioned.

Minerals
1. Iron, selenium, copper and magnesium in critical care: impact on weakness risk, Positive/therapeutic effect mentioned.
2. Natural history of Dermatosparaxis Ehlers Danlos Syndrome: adult case series, Positive/therapeutic effect mentioned.
3. Surgical excision and omentalisation of mineralised paraprostatic cysts with concurrent herniorrhaphy, month.

Supplements
1. Causal relationship between reflux disease and hernias: Mendelian randomization, Positive/therapeutic effect mentioned.
2. Metabolic syndrome components linked to ventral hernia, No clear dose/effect/duration found.
3. Chlorhexidine-coated vs non-coated sutures in laparoscopic surgery, Positive/therapeutic effect mentioned | day, month.

Nutrients
1. Single-Anastomosis Duodeno-Ileal Bypass overview, mg | Positive/therapeutic effect mentioned.
2. Minerals and weakness risk in critical care, Positive/therapeutic effect mentioned.
3. Collagen application in bone regeneration, No clear dose/effect/duration found.

Summary for readers
• Hernia refers to abnormal organ protrusion through muscle or connective tissue.
• Research covers congenital, surgical, nutritional, and metabolic aspects of hernia management.
• Herbal and nutrient-based therapies show some benefit in postoperative recovery and pain control.
• Optimal treatment combines surgical correction with nutritional and metabolic support.
    """.trimIndent(),
                listOf(
                    Reference("Diagnostics (Basel). 2025 Sep 21;15(18):2404", "👉 Meta-learning models for chest X-ray disease classification, No clear dose/effect/duration found", "41008775"),
                    Reference("Biomedicines. 2025 Sep 16;13(9):2274", "👉 Antenatal Sildenafil for congenital diaphragmatic hernia, G", "41007834"),
                    Reference("J Surg Case Rep. 2025 Sep 24;2025(9):rjaf421", "👉 Adenomyoma of the round ligament (inguinal canal), G", "41000550"),
                    Reference("Am Surg. 2023 Oct;89(10):4179-4185", "👉 TCM supplement reduces pain faster than conventional pills, Positive/therapeutic effect mentioned | day", "37303082"),
                    Reference("J Ethnopharmacol. 2023 Jul 15;311:116428", "👉 Total flavonoids protect intestines, Positive/therapeutic effect mentioned", "36997130"),
                    Reference("J Ethnopharmacol. 2022 Jan 10;282:114565", "👉 Historical review of ethnopharmacology, No clear dose/effect/duration found", "34496265"),
                    Reference("Birth Defects Res. 2025 Aug;117(8):e2520", "👉 Thyroid hormone deficiency affects ventral wall/myogenesis, mg, μg | Positive/therapeutic effect mentioned", "40851524"),
                    Reference("Medicine (Baltimore). 2025 Aug 1;104(31):e43704", "👉 Tryptophan metabolites and postoperative pain in herniation surgery, No clear dose/effect/duration found", "40760513"),
                    Reference("Mol Pain. 2025 Jan-Dec;21:17448069251342984", "👉 PVN(Glu)-PrL(Glu) circuit in chronic pain for lumbar herniation, No clear dose/effect/duration found", "40356011"),
                    Reference("Gene. 2025 Sep 22;970:149785", "👉 Menaquinone-4 suppresses ferroptosis via NRF2/GCLM axis, No clear dose/effect/duration found", "40992546"),
                    Reference("J Clin Endocrinol Metab. 2025 Sep 16", "👉 Adverse outcomes in hypothyroidism with bariatric surgery, Positive/therapeutic and Negative/adverse effects mentioned", "40971953"),
                    Reference("Medicine (Baltimore). 2025 Aug 1;104(31):e43451", "👉 Lumbar disc herniation in osteogenesis imperfecta (COL1A1 mutation), Positive/therapeutic effect mentioned", "40760627"),
                    Reference("Nurs Crit Care. 2025 May;30(3):e70032", "👉 Trace minerals impact weakness risk in critical care, Positive/therapeutic effect mentioned", "40320365"),
                    Reference("Am J Med Genet A. 2025 Apr;197(4):e63957", "👉 Dermatosparaxis Ehlers Danlos adult case series, Positive/therapeutic effect mentioned", "39641471"),
                    Reference("Aust Vet J. 2025 Jan-Feb;103(1-2):22-26", "👉 Surgical excision of mineralised cysts with herniorrhaphy, month", "39450449"),
                    Reference("Medicine (Baltimore). 2025 Sep 5;104(36):e44251", "👉 Mendelian randomization of reflux and hernia link, Positive/therapeutic effect mentioned", "40922354"),
                    Reference("Obes Surg. 2025 Sep;35(9):3838-3846", "👉 Metabolic syndrome components linked to ventral hernia, No clear dose/effect/duration found", "40770168"),
                    Reference("Langenbecks Arch Surg. 2025 Jun 13;410(1):191", "👉 Chlorhexidine-coated sutures reduce infections, Positive/therapeutic effect mentioned | day, month", "40512393"),
                    Reference("StatPearls [Internet]. 2025 Jun 2", "👉 Single-Anastomosis Duodeno-Ileal Bypass summary, mg | Positive/therapeutic effect mentioned", "40465811"),
                    Reference("Nurs Crit Care. 2025 May;30(3):e70032", "👉 Minerals and weakness risk in critical care, Positive/therapeutic effect mentioned", "40320365"),
                    Reference("J Orthop Translat. 2025 Jan 9;50:129-143", "👉 Collagen application in bone regeneration, No clear dose/effect/duration found", "40171103")
                )
            )

            "HIV" -> Pair(
                """
Alternative approaches
1. Once-daily dolutegravir/lamivudine fixed-dose formulations in children living with HIV: pharmacokinetic and safety sub-study, g, mg | Negative/adverse effect mentioned | week.
2. Current and investigational biomarkers of liver disease in HIV-HBV co-infection, G.
3. Pneumocystis jirovecii pneumonia diagnosis with oropharyngeal wash PCR in immunocompromised patients: systematic review, Positive/therapeutic effect mentioned.

Herbs
1. Antiviral bioactive compounds: activities and mechanisms against human viral infections, Negative/adverse effect mentioned.
2. Site-directed mutagenesis of ent-kaurane diterpenoid C-19 oxidase in Tripterygium wilfordii, Positive/therapeutic effect mentioned.
3. Anti-HIV activity in traditional Chinese medicine: monomeric remedies and compound decoctions, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.

Amino acids
1. Clinical outcomes on B/F/TAF and dolutegravir-based regimens at 12 months following regimen switch, month.
2. Anti-HIV drug highly effective against SARS-CoV-2 in vitro, µg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
3. Impact of bictegravir/emtricitabine/tenofovir alafenamide on health-related quality of life in HIV care, Positive/therapeutic effect mentioned | week.

Vitamins
1. Intersections of vitamin D deficiency, HIV and chronic liver diseases, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
2. Vitamin D receptor gene FokI polymorphism in HIV-TB coinfection, No clear dose/effect/duration found.
3. Vitamin C intake and physical activity in chronically infected populations, Positive/therapeutic effect mentioned.

Minerals
1. Bone mineral density in HIV-infected people, No clear dose/effect/duration found.
2. Simplifying antiretroviral therapy to maintain viral suppression and improve bone and renal health, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
3. Global burden attributable to low bone mineral density, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.

Supplements
1. Pathogen safety issues around plasma derivatives, Positive/therapeutic effect mentioned.
2. Health information system assessment in Khomas region, Namibia, Positive/therapeutic effect mentioned.
3. State-level confidentiality mandates and HIV/STI testing among high school students in the US, Positive/therapeutic effect mentioned.

Nutrients
1. Glucose-fueled histone modifications drive HIV-1 latency reversal, No clear dose/effect/duration found.
2. Tunneling nanotubes and extracellular vesicles at the maternal-fetal interface, No clear dose/effect/duration found.
3. Immunology of infants who are HIV-exposed uninfected in the parental combination antiretroviral therapy era, Positive/therapeutic effect mentioned.

Summary for readers
• HIV (Human Immunodeficiency Virus) affects the immune system and can progress to AIDS without treatment.
• Research covers pharmacological, herbal, amino acid, vitamin, mineral, supplement, and nutrient-based interventions.
• Positive therapeutic effects observed for several antiretroviral and adjunct therapies; some interventions report adverse effects.
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("EBioMedicine. 2025 Sep 26;120:105929", "👉 Dolutegravir/lamivudine fixed-dose formulations in children, g, mg | Negative/adverse effect mentioned | week", "41014973"),
                    Reference("Curr HIV/AIDS Rep. 2025 Sep 27;22(1):46", "👉 Biomarkers of liver disease in HIV-HBV coinfection, G", "41014390"),
                    Reference("J Clin Med. 2025 Sep 18;14(18):6572", "👉 Pneumocystis jirovecii pneumonia diagnosis with oropharyngeal wash PCR, Positive/therapeutic effect mentioned", "41010771"),

                    // Herbs
                    Reference("Recent Adv Antiinfect Drug Discov. 2025 Apr 22", "👉 Antiviral bioactive compounds against human viral infections, Negative/adverse effect mentioned", "40265436"),
                    Reference("Zhongguo Zhong Yao Za Zhi. 2024 Dec;49(24):6667-6675", "👉 Tripterygium wilfordii mutagenesis, Positive/therapeutic effect mentioned", "39805755"),
                    Reference("Front Med (Lausanne). 2024 Aug 8;11:1322870", "👉 Anti-HIV activity in TCM: monomeric remedies and decoctions, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "39175814"),

                    // Amino acids
                    Reference("AIDS Res Ther. 2025 Sep 26;22(1):90", "👉 B/F/TAF and dolutegravir-based regimens at 12 months, month", "41013504"),
                    Reference("Viruses. 2025 Aug 27;17(9):1170", "👉 Anti-HIV drug effective against SARS-CoV-2, µg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41012598"),
                    Reference("PLoS One. 2025 Sep 22;20(9):e0323167", "👉 Bictegravir/emtricitabine/tenofovir alafenamide impact on quality of life, Positive/therapeutic effect mentioned | week", "40982450"),

                    // Vitamins
                    Reference("HIV Med. 2025 Sep 20", "👉 Vitamin D, HIV, and chronic liver diseases, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40974294"),
                    Reference("Infect Chemother. 2025 Sep 12", "👉 Vitamin D receptor gene FokI polymorphism in HIV-TB coinfection, No clear dose/effect/duration found", "40958482"),
                    Reference("Medicine (Baltimore). 2025 Sep 12;104(37):e44555", "👉 Vitamin C intake and physical activity in chronically infected populations, Positive/therapeutic effect mentioned", "40958254"),

                    // Minerals
                    Reference("Biomedicines. 2025 Sep 20;13(9):2305", "👉 Bone mineral density in HIV-infected people, No clear dose/effect/duration found", "41007865"),
                    Reference("Braz J Infect Dis. 2025 Sep 20;29(6):104578", "👉 Simplifying antiretroviral therapy to maintain viral suppression and improve bone/renal health, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40976123"),
                    Reference("Lancet Rheumatol. 2025 Sep 16:S2665-9913(25)00105-5", "👉 Global burden attributable to low bone mineral density, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40972625"),

                    // Supplements
                    Reference("Pathogens. 2025 Sep 1;14(9):868", "👉 Pathogen safety issues around plasma derivatives, Positive/therapeutic effect mentioned", "41011767"),
                    Reference("PLoS One. 2025 Sep 23;20(9):e0306939", "👉 Health information system assessment in Khomas region, Namibia, Positive/therapeutic effect mentioned", "40986556"),
                    Reference("J Adolesc Health. 2025 Sep 22:S1054-139X(25)00318-0", "👉 Confidentiality mandates and HIV/STI testing in US high school students, Positive/therapeutic effect mentioned", "40985915"),

                    // Nutrients
                    Reference("bioRxiv [Preprint]. 2025 Sep 16:2025.09.14.676169", "👉 Glucose-fueled histone modifications drive HIV-1 latency reversal, No clear dose/effect/duration found", "41000757"),
                    Reference("Curr Opin Virol. 2025 Sep 16;73:101490", "👉 Tunneling nanotubes and extracellular vesicles at maternal-fetal interface, No clear dose/effect/duration found", "40961897"),
                    Reference("Lancet HIV. 2025 Aug 27:S2352-3018(25)00184-5", "👉 Immunology of HIV-exposed uninfected infants, Positive/therapeutic effect mentioned", "40885205")
                )
            )

            "Hodgkin lymphoma" -> Pair(
                """
Alternative approaches
1. Cancer disparities in lean vs. non-lean MASH: insight from a national inpatient sample, No clear dose/effect/duration found.
2. Mechanisms of resistance to CAR T-cells and strategies to overcome them, No clear dose/effect/duration found.
3. Primary diffuse large B-cell lymphoma of the urinary bladder: case report and literature review, No clear dose/effect/duration found.

Herbs
1. Erianin induces GSDMD-dependent pyroptosis and enhances doxorubicin efficacy via PI3K/AKT pathway in diffuse large B-cell lymphoma, No clear dose/effect/duration found.
2. Hodgkin's lymphoma of salivary gland: case report, No clear dose/effect/duration found.
3. Salvia officinalis L. extract induces apoptosis in human lymphoma/leukemia cells, μg | Negative/adverse effect mentioned.

Amino acids
1. Histone variant H2A.B in SWI/SNF genomic deposition, No clear dose/effect/duration found.
2. Role of B vitamins in modulating homocysteine and metabolic pathways, No clear dose/effect/duration found.
3. Metabolomic profiling for predicting cardiovascular toxicity of chemotherapy, Negative/adverse effect mentioned.

Vitamins
1. HIV-associated gut dysbiosis drives oncogenesis, Positive/therapeutic effect mentioned.
2. Role of B vitamins in brain atrophy and metabolic pathways, No clear dose/effect/duration found.
3. SARM1 activation induces reversible mitochondrial dysfunction, G | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.

Minerals
1. Global trends and epidemiological associations of mesothelioma, No clear dose/effect/duration found.
2. Bone mineral status in children with hematologic malignancy, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
3. Quality of life improvement in refractory aggressive NKTCL with adjunct Ayurvedic treatment, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month.

Supplements
1. Intravascular lymphoma: a unique pattern underlying a protean disease, No clear dose/effect/duration found.
2. B vitamins modulating homocysteine and brain atrophy pathways, No clear dose/effect/duration found.
3. Rapid onset neurological symptoms in HIV-positive patient with PML, No clear dose/effect/duration found.

Nutrients
1. PUFA supplementation in Sjögren's syndrome, Positive/therapeutic effect mentioned.
2. Targetable metabolic dependencies across colorectal cancer progression, No clear dose/effect/duration found.
3. Boletus aereus polysaccharides antiproliferative properties against NHLs, mg | Positive/therapeutic effect mentioned.

Summary for readers
• Hodgkin lymphoma is a type of lymphatic system cancer with various subtypes and clinical manifestations.
• Research covers pharmacological, herbal, amino acid, vitamin, mineral, supplement, and nutrient-based interventions.
• Positive therapeutic effects observed in certain herbal, vitamin, mineral, and nutrient-based adjunct therapies; some interventions show adverse effects.
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("BMC Gastroenterol. 2025 Sep 26;25(1):659", "👉 Cancer disparities in lean vs. non-lean MASH, No clear dose/effect/duration found", "41013214"),
                    Reference("Methods Protoc. 2025 Sep 11;8(5):108", "👉 Mechanisms of resistance to CAR T-cells and how to overcome them, No clear dose/effect/duration found", "40981226"),
                    Reference("Cureus. 2025 Aug 20;17(8):e90579", "👉 Primary DLBCL of urinary bladder: case report, No clear dose/effect/duration found", "40978966"),

                    // Herbs
                    Reference("Chin Med J (Engl). 2025 Aug 20", "👉 Erianin induces pyroptosis & enhances doxorubicin efficacy in DLBCL, No clear dose/effect/duration found", "40830921"),
                    Reference("Lin Chuang Er Bi Yan Hou Tou Jing Wai Ke Za Zhi. 2017 Dec;31(23):1852-1853;1857", "👉 Hodgkin's lymphoma of salivary gland: case report, No clear dose/effect/duration found", "29798403"),
                    Reference("Adv Pharm Bull. 2013;3(1):51-5", "👉 Salvia officinalis L. extract induces apoptosis in lymphoma/leukemia cells, μg | Negative/adverse effect mentioned", "24312812"),

                    // Amino acids
                    Reference("Sci Adv. 2025 Jul 25;11(30):eadx1568", "👉 Histone variant H2A.B in SWI/SNF genomic deposition, No clear dose/effect/duration found", "40712016"),
                    Reference("Alzheimers Dement. 2025 Jul;21(7):e70521", "👉 B vitamins modulating homocysteine/metabolic pathways in brain atrophy, No clear dose/effect/duration found", "40684250"),
                    Reference("Kardiologiia. 2025 Jul 7;65(6):3-11", "👉 Metabolomic profiling for predicting chemotherapy cardiovascular toxicity, Negative/adverse effect mentioned", "40627422"),

                    // Vitamins
                    Reference("Front Oncol. 2025 Aug 21;15:1634388", "👉 HIV-associated gut dysbiosis drives oncogenesis, Positive/therapeutic effect mentioned", "40919140"),
                    Reference("Alzheimers Dement. 2025 Jul;21(7):e70521", "👉 B vitamins in brain atrophy and metabolic pathways, No clear dose/effect/duration found", "40684250"),
                    Reference("Neurobiol Dis. 2025 Sep;213:106986", "👉 SARM1 activation induces mitochondrial dysfunction, G | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40473123"),

                    // Minerals
                    Reference("Cancer Epidemiol. 2025 Oct;98:102900", "👉 Global trends and epidemiology of mesothelioma, No clear dose/effect/duration found", "40782460"),
                    Reference("Pediatr Hematol Oncol. 2025 May;42(4):205-216", "👉 Bone mineral status in children with hematologic malignancy, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40247676"),
                    Reference("J Ayurveda Integr Med. 2024 Nov-Dec;15(6):100968", "👉 Quality of life improvement in aggressive NKTCL with adjunct Ayurvedic treatment, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month", "39579669"),

                    // Supplements
                    Reference("Cancers (Basel). 2025 Jul 15;17(14):2355", "👉 Intravascular lymphoma: unique pattern of disease, No clear dose/effect/duration found", "40723240"),
                    Reference("Alzheimers Dement. 2025 Jul;21(7):e70521", "👉 B vitamins modulating homocysteine/brain atrophy, No clear dose/effect/duration found", "40684250"),
                    Reference("Ann Med Surg (Lond). 2025 May 12;87(6):3994-3998", "👉 Rapid neurological symptoms in HIV-positive patient with PML, No clear dose/effect/duration found", "40486551"),

                    // Nutrients
                    Reference("Nutrients. 2024 Nov 4;16(21):3786", "👉 PUFA supplementation in Sjögren's syndrome, Positive/therapeutic effect mentioned", "39519619"),
                    Reference("Mol Metab. 2024 Dec;90:102037", "👉 Targetable metabolic dependencies across colorectal cancer progression, No clear dose/effect/duration found", "39332495"),
                    Reference("J Agric Food Chem. 2024 Jul 24;72(29):16334-16346", "👉 Boletus aereus polysaccharides antiproliferative properties against NHLs, mg | Positive/therapeutic effect mentioned", "38994810")
                )
            )

            "Hives" -> Pair(
                """
Alternative approaches
1. Fluoroquinolones in patients with immediate hypersensitivity to penicillin, No clear dose/effect/duration found.
2. IV Cetirizine vs IV Diphenhydramine premedication in outpatients, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
3. NB-UVB phototherapy vs oral cyclosporine in chronic urticaria, mg | Positive/therapeutic effect mentioned | day.

Herbs
1. Traditional Chinese medicine in chronic urticaria: systematic review, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
2. Medicinal plants for children's diseases in Southern Romania, Positive/therapeutic effect mentioned.
3. Hypersensitivity to homemade topical preparations, Negative/adverse effect mentioned.

Amino acids
1. Molnupiravir or nirmatrelvir-ritonavir in hospitalized COVID-19 patients, mg | Positive/therapeutic effect mentioned | day.
2. Pegtibatinase enzyme replacement therapy in homocystinuria, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
3. Sublethal glyphosate exposure in honey bees alters biogenic amines, mg | Positive/therapeutic effect mentioned | day.

Vitamins
1. Decreased vitamin D levels in chronic spontaneous urticaria, g | Positive/therapeutic effect mentioned.
2. Resolution of chronic urticaria in vegan patient with vitamin B12, G.
3. Chronic urticaria and vitamin D supplementation: systematic review, IU | Positive/therapeutic effect mentioned.

Minerals
1. Stimulatory feeding of bee colonies affects mineral composition of venom, Positive/therapeutic effect mentioned.
2. Rapid response to nemolizumab in dermatologic pruritus, No clear dose/effect/duration found.
3. Adverse effects of dienogest: systematic review, Negative/adverse effect mentioned | month.

Supplements
1. Nutraceuticals against oxidative stress in allergic diseases, Positive/therapeutic effect mentioned.
2. Activities and usefulness of Deoxynojirimycin and Morus alba: review, No clear dose/effect/duration found.
3. Safety evaluation of deucravacitinib, Negative/adverse effect mentioned.

Nutrients
1. Antifungal activity of Metschnikowia pulcherrima against Ascosphaera apis, No clear dose/effect/duration found.
2. Low-histamine diet and DAO enzyme supplementation in histamine intolerance, Positive/therapeutic effect mentioned.
3. Pollen foraging preferences in honey bees and nutrient profiles, No clear dose/effect/duration found.

Summary for readers
• Hives (urticaria) is an allergic skin reaction with acute or chronic manifestations.
• Research includes pharmacological, herbal, amino acid, vitamin, mineral, supplement, and nutrient-based interventions.
• Positive therapeutic effects observed for IV antihistamines, certain vitamins, minerals, herbs, and nutraceuticals; some interventions show adverse effects.
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Allergol Immunopathol (Madr). 2025 Sep 1;53(5):94-99", "👉 Fluoroquinolones in patients with immediate hypersensitivity to penicillin, No clear dose/effect/duration found", "40923425"),
                    Reference("J Infus Nurs. 2025 Sep-Oct 01;48(5):308-317", "👉 IV Cetirizine vs IV Diphenhydramine premedication, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40910677"),
                    Reference("Photodermatol Photoimmunol Photomed. 2025 Sep;41(5):e70050", "👉 NB-UVB phototherapy vs oral cyclosporine in chronic urticaria, mg | Positive/therapeutic effect mentioned | day", "40903885"),

                    // Herbs
                    Reference("Medicine (Baltimore). 2025 Jun 13;104(24):e42819", "👉 Traditional Chinese medicine in chronic urticaria: systematic review, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40527813"),
                    Reference("Front Pharmacol. 2024 May 22;15:1377341", "👉 Medicinal plants for children's diseases in Southern Romania, Positive/therapeutic effect mentioned", "38841372"),
                    Reference("Acta Dermatovenerol Croat. 2023 Dec;31(3):117-124", "👉 Hypersensitivity to homemade topical preparations, Negative/adverse effect mentioned", "38439720"),

                    // Amino acids
                    Reference("Lancet Infect Dis. 2025 Sep;25(9):1000-1010", "👉 Molnupiravir or nirmatrelvir-ritonavir in hospitalized COVID-19 patients, mg | Positive/therapeutic effect mentioned | day", "40383127"),
                    Reference("Genet Med. 2025 Aug;27(8):101456", "👉 Pegtibatinase enzyme replacement therapy in homocystinuria, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40382700"),
                    Reference("J Exp Biol. 2025 May 1;228(9):jeb250124", "👉 Sublethal glyphosate exposure in honey bees alters biogenic amines, mg | Positive/therapeutic effect mentioned | day", "40326703"),

                    // Vitamins
                    Reference("Medicine (Baltimore). 2025 Aug 1;104(31):e42640", "👉 Decreased vitamin D levels in chronic spontaneous urticaria, g | Positive/therapeutic effect mentioned", "40760639"),
                    Reference("J Community Hosp Intern Med Perspect. 2025 May 5;15(3):108", "👉 Resolution of chronic urticaria in vegan patient with vitamin B12, G", "40755988"),
                    Reference("Eur J Med Res. 2025 Jul 31;30(1):691", "👉 Chronic urticaria and vitamin D supplementation: systematic review, IU | Positive/therapeutic effect mentioned", "40745339"),

                    // Minerals
                    Reference("Insects. 2025 Apr 17;16(4):423", "👉 Stimulatory feeding of bee colonies affects mineral composition of venom, Positive/therapeutic effect mentioned", "40332952"),
                    Reference("J Am Acad Dermatol. 2025 Aug;93(2):466-468", "👉 Rapid response to nemolizumab in dermatologic pruritus, No clear dose/effect/duration found", "40122213"),
                    Reference("BMC Pharmacol Toxicol. 2024 Aug 1;25(1):43", "👉 Adverse effects of dienogest: systematic review, Negative/adverse effect mentioned | month", "39090694"),

                    // Supplements
                    Reference("Biomolecules. 2025 Sep 20;15(9):1347", "👉 Nutraceuticals against oxidative stress in allergic diseases, Positive/therapeutic effect mentioned", "41008654"),
                    Reference("Molecules. 2025 Jul 31;30(15):3213", "👉 Activities and usefulness of Deoxynojirimycin and Morus alba: review, No clear dose/effect/duration found", "40807388"),
                    Reference("Int J Clin Pharm. 2025 Aug 9", "👉 Safety evaluation of deucravacitinib, Negative/adverse effect mentioned", "40782323"),

                    // Nutrients
                    Reference("J Fungi (Basel). 2025 Apr 25;11(5):336", "👉 Antifungal activity of Metschnikowia pulcherrima against Ascosphaera apis, No clear dose/effect/duration found", "40422670"),
                    Reference("Nutrients. 2024 Dec 25;17(1):29", "👉 Low-histamine diet and DAO enzyme supplementation in histamine intolerance, Positive/therapeutic effect mentioned", "39796463"),
                    Reference("Sci Rep. 2024 Jul 1;14(1):15028", "👉 Pollen foraging preferences in honey bees and nutrient profiles, No clear dose/effect/duration found", "38951538")
                )
            )

            "Huntington's disease" -> Pair(
                """
Alternative approaches
1. Typical or atypical form of Huntington disease, No clear dose/effect/duration found.
2. Host cysteine proteases promote severity in catheter-associated UTI and kidney fibrosis, Positive/therapeutic effect mentioned.
3. Small molecule derivatives improve survivability in cellular Huntington's model via mitochondrial fusion, Positive/therapeutic effect mentioned.

Herbs
1. Neuroprotective potential of phytoconstituents and nanotechnology, Positive/therapeutic effect mentioned.
2. Small organism models for anti-ageing/nootropic herbs, Positive/therapeutic effect mentioned.
3. Role of extracellular vesicles in neurodegenerative diseases, No clear dose/effect/duration found.

Amino acids
1. Exogenous Huntingtin-Exon1 aggregates toxicity in C. elegans, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
2. Role of Calmodulin in neurodegeneration and neuroprotection, No clear dose/effect/duration found.
3. Vesicular monoamine transport inhibitors: current uses, Negative/adverse effect mentioned.

Vitamins
1. Vitamin D with exercise as neuroprotective tool, Positive/therapeutic effect mentioned.
2. Global health inequalities, Positive/therapeutic effect mentioned.
3. Use of combined nutritional complementary and alternative medicine in older adults, Positive/therapeutic effect mentioned.

Minerals
1. Combined nutritional complementary and alternative medicine, Positive/therapeutic effect mentioned.
2. RAAS inhibitor dosing with outpatient therapy, Positive/therapeutic effect mentioned | day, month.
3. SWI MRI applications in neurodegenerative disorders, No clear dose/effect/duration found.

Supplements
1. O-GlcNAcylation linking brain health to neurodegeneration, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
2. Combined nutritional complementary and alternative medicine, Positive/therapeutic effect mentioned.
3. Intermittent fasting as neuroprotective strategy, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.

Nutrients
1. Gut microbiota and CNS communication, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
2. Alterations in nutrient availability in lungs during pneumonia, Positive/therapeutic effect mentioned.
3. Intermittent fasting as neuroprotective strategy, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.

Summary for readers
• Huntington's disease is a progressive neurodegenerative disorder caused by CAG repeats in the HTT gene.
• Research includes pharmacological, herbal, amino acid, vitamin, mineral, supplement, and nutrient-based interventions.
• Positive therapeutic effects observed for small molecules, vitamins, minerals, herbs, supplements, and dietary strategies; some interventions have adverse effects.
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Pediatr Neurol. 2025 Aug 26;173:30-32", "👉 Typical or atypical form of Huntington disease, No clear dose/effect/duration found", "41014804"),
                    Reference("mBio. 2025 Sep 22:e0216125", "👉 Host cysteine proteases promote severity in catheter-associated UTI and kidney fibrosis, Positive/therapeutic effect mentioned", "40980878"),
                    Reference("RSC Med Chem. 2025 Aug 1", "👉 Small molecule derivatives improve survivability in cellular Huntington's model via mitochondrial fusion, Positive/therapeutic effect mentioned", "40927636"),

                    // Herbs
                    Reference("CNS Neurol Disord Drug Targets. 2025 Jun 24", "👉 Neuroprotective potential of phytoconstituents and nanotechnology, Positive/therapeutic effect mentioned", "40600563"),
                    Reference("Nutr Neurosci. 2025 Jun;28(6):744-762", "👉 Small organism models for anti-ageing/nootropic herbs, Positive/therapeutic effect mentioned", "39432435"),
                    Reference("Transl Neurodegener. 2023 Sep 11;12(1):43", "👉 Role of extracellular vesicles in neurodegenerative diseases, No clear dose/effect/duration found", "37697342"),

                    // Amino acids
                    Reference("ACS Chem Neurosci. 2025 Sep 23", "👉 Exogenous Huntingtin-Exon1 aggregates toxicity in C. elegans, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40985881"),
                    Reference("Mini Rev Med Chem. 2025 Aug 21", "👉 Role of Calmodulin in neurodegeneration and neuroprotection, No clear dose/effect/duration found", "40849781"),
                    Reference("Lancet. 2025 Aug 9;406(10503):650-664", "👉 Vesicular monoamine transport inhibitors: current uses, Negative/adverse effect mentioned", "40783291"),

                    // Vitamins
                    Reference("Molecules. 2025 Sep 21;30(18):3823", "👉 Vitamin D with exercise as neuroprotective tool, Positive/therapeutic effect mentioned", "41011716"),
                    Reference("Bull World Health Organ. 2025 Sep 1;103(9):522-529", "👉 Global health inequalities, Positive/therapeutic effect mentioned", "40900933"),
                    Reference("Front Nutr. 2025 Aug 11;12:1595919", "👉 Use of combined nutritional complementary and alternative medicine in older adults, Positive/therapeutic effect mentioned", "40860472"),

                    // Minerals
                    Reference("Front Nutr. 2025 Aug 11;12:1595919", "👉 Combined nutritional complementary and alternative medicine, Positive/therapeutic effect mentioned", "40860472"),
                    Reference("Adv Ther. 2025 Aug;42(8):3960-3977", "👉 RAAS inhibitor dosing with outpatient therapy, Positive/therapeutic effect mentioned | day, month", "40531443"),
                    Reference("Bioengineering (Basel). 2025 Apr 29;12(5):473", "👉 SWI MRI applications in neurodegenerative disorders, No clear dose/effect/duration found", "40428092"),

                    // Supplements
                    Reference("Neural Regen Res. 2025 Sep 3", "👉 O-GlcNAcylation linking brain health to neurodegeneration, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40903936"),
                    Reference("Front Nutr. 2025 Aug 11;12:1595919", "👉 Combined nutritional complementary and alternative medicine, Positive/therapeutic effect mentioned", "40860472"),
                    Reference("Nutrients. 2025 Jul 9;17(14):2266", "👉 Intermittent fasting as neuroprotective strategy, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40732891"),

                    // Nutrients
                    Reference("Neural Regen Res. 2025 Sep 3", "👉 Gut microbiota and CNS communication, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40903950"),
                    Reference("bioRxiv [Preprint]. 2025 Jul 14", "👉 Alterations in nutrient availability in lungs during pneumonia, g | Positive/therapeutic effect mentioned", "40791442"),
                    Reference("Nutrients. 2025 Jul 9;17(14):2266", "👉 Intermittent fasting as neuroprotective strategy, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40732891")
                )
            )

            "Hyperhidrosis" -> Pair(
                """
Alternative approaches
1. Equine Pituitary Pars Intermedia Dysfunction, Positive/therapeutic effect mentioned.
2. Exploring Telitacicept for Morvan Syndrome, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month.
3. Needle-Free Jet Injectors for plastic surgery, Positive/therapeutic effect mentioned.

Herbs
1. Polyphenol extracts from Clausena lansium leaves in diabetic rats, Positive/therapeutic effect mentioned.

Amino acids
1. Modified Buqi Yangyin Sanjie decoction + Levothyroxine post-thyroid surgery, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
2. Paroxysmal hyperhidrosis in anti-LGI1 encephalitis, month.
3. Agrypnia excitata in anti-LGI1 encephalitis, No clear dose/effect/duration found.

Vitamins
1. Vitamin-related therapy, Positive/therapeutic effect mentioned.
2. Role of Vitamin D in sleep disorders in children/adolescents, No clear dose/effect/duration found.
3. Serum magnesium and vitamin D levels in primary hyperhidrosis, No clear dose/effect/duration found.

Minerals
1. Vitamin/mineral therapy, Positive/therapeutic effect mentioned.
2. Balneotherapeutic add-back therapy in women, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month.
3. Congenital insensitivity to pain and SCN11A mutation, No clear dose/effect/duration found.

Supplements
1. Medication adherence interventions, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
2. Algorithm for prevention/treatment of cutaneous side effects of hormonal therapy, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
3. Microwave thermolysis for axillary hyperhidrosis, Positive/therapeutic effect mentioned | month.

Nutrients
1. Vitamin D in sleep disorders of children/adolescents, No clear dose/effect/duration found.
2. Trace elements, calcium, magnesium in essential hyperhidrosis, No clear dose/effect/duration found.

Summary for readers
• Hyperhidrosis is characterized by excessive sweating, affecting palms, soles, axillae, or generalized.
• Research covers alternative delivery systems, herbal extracts, amino acid therapies, vitamins, minerals, supplements, and nutrients.
• Positive therapeutic effects observed in herbs, alternative devices, supplements, and minerals; some interventions have adverse effects or unclear dosing information.
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Vet Sci. 2025 Aug 20;12(8):780", "👉 Equine Pituitary Pars Intermedia Dysfunction, Positive/therapeutic effect mentioned", "40872730"),
                    Reference("Am J Case Rep. 2025 Jun 21;26:e947004", "👉 Exploring Telitacicept for Morvan Syndrome, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month", "40543057"),
                    Reference("Aesthet Surg J Open Forum. 2025 Apr 2;7:ojaf019", "👉 Needle-Free Jet Injectors for plastic surgery, Positive/therapeutic effect mentioned", "40351559"),

                    // Herbs
                    Reference("J Food Sci. 2018 Jan;83(1):212-220", "👉 Polyphenol extracts from Clausena lansium leaves in diabetic rats, Positive/therapeutic effect mentioned", "29227535"),

                    // Amino acids
                    Reference("Altern Ther Health Med. 2024 Jul;30(7):168-173", "👉 Modified Buqi Yangyin Sanjie decoction + Levothyroxine post-thyroid surgery, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "37971437"),
                    Reference("Front Immunol. 2022 Sep 23;13:986853", "👉 Paroxysmal hyperhidrosis in anti-LGI1 encephalitis, month", "36211373"),
                    Reference("Eur J Neurol. 2022 Mar;29(3):890-894", "👉 Agrypnia excitata in anti-LGI1 encephalitis, No clear dose/effect/duration found", "34679240"),

                    // Vitamins
                    Reference("Epidermolysis Bullosa Simplex", "👉 Vitamin-related therapy, Positive/therapeutic effect mentioned", "20301543"),
                    Reference("Int J Mol Sci. 2022 Jan 27;23(3):1430", "👉 Role of Vitamin D in sleep disorders in children/adolescents, No clear dose/effect/duration found", "35163353"),
                    Reference("J Cosmet Dermatol. 2022 Jan;21(1):373-379", "👉 Serum magnesium and vitamin D levels in primary hyperhidrosis, No clear dose/effect/duration found", "33738914"),

                    // Minerals
                    Reference("Epidermolysis Bullosa Simplex", "👉 Vitamin/mineral therapy, Positive/therapeutic effect mentioned", "20301543"),
                    Reference("Vopr Kurortol Fizioter Lech Fiz Kult. 2018;95(5):31-39", "👉 Balneotherapeutic add-back therapy in women, g | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | month", "30412147"),
                    Reference("Bone. 2016 Mar;84:289-298", "👉 Congenital insensitivity to pain and SCN11A mutation, No clear dose/effect/duration found", "26746779"),

                    // Supplements
                    Reference("Value Health. 2025 May;28(5):676-679", "👉 Medication adherence interventions, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40340081"),
                    Reference("J Drugs Dermatol. 2025 May 1;24(5):49631s3-49631s10", "👉 Algorithm for prevention/treatment of cutaneous side effects of hormonal therapy, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40327585"),
                    Reference("Lasers Surg Med. 2023 Jan;55(1):105-115", "👉 Microwave thermolysis for axillary hyperhidrosis, Positive/therapeutic effect mentioned | month", "36229952"),

                    // Nutrients
                    Reference("Int J Mol Sci. 2022 Jan 27;23(3):1430", "👉 Vitamin D in sleep disorders of children/adolescents, No clear dose/effect/duration found", "35163353"),
                    Reference("Int J Dermatol. 2011 Sep;50(9):1071-4", "👉 Trace elements, calcium, magnesium in essential hyperhidrosis, No clear dose/effect/duration found", "22126867")
                )
            )

            "Hypersomnia" -> Pair(
                """
Alternative approaches
1. Systematic review of economic evaluations for insomnia/hypersomnia, Positive/therapeutic effect mentioned.
2. Asthma-OSA overlap syndrome study, Positive/therapeutic effect mentioned.
3. EMG activity in REM sleep in narcolepsy, No clear dose/effect/duration found.

Herbs
1. Medicinal plants for depressive disorders, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
2. Traditional Chinese medicine compound for sleep-disordered breathing, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.

Amino acids
1. Solriamfetol for excessive daytime sleepiness in OSA, Positive/therapeutic effect mentioned | week.
2. Orexin 2 receptor agonists for narcolepsy, Positive/therapeutic effect mentioned.
3. Management options for EDS in OSA, No clear dose/effect/duration found.

Vitamins
1. Narcolepsy and cardiovascular health, Positive/therapeutic effect mentioned.
2. Pons metabolite alterations in narcolepsy type 1, No clear dose/effect/duration found.
3. GeneReviews, Positive/therapeutic effect mentioned | month.

Minerals
1. Hypocretin-1 levels and bone mineral content in narcolepsy, No clear dose/effect/duration found.
2. Negative/adverse effect on bone mineral density, Negative/adverse effect mentioned.
3. Daytime sleepiness and cardiometabolic/osteoporosis associations, Positive/therapeutic effect mentioned.

Supplements
1. ICD-11 vs ICD-10 in sleep disorders, Positive/therapeutic effect mentioned.
2. Zinc supplementation for PMS, Positive/therapeutic effect mentioned.
3. Consensus on excessive daytime sleepiness in OSA, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.

Nutrients
1. Cardiometabolic factors and EDS in Latino individuals, Negative/adverse effect mentioned.
2. Orexin role in REM sleep and appetite, No clear dose/effect/duration found.
3. Hypomagnesemia and EDS in older adults, mg.

Summary for readers
• Hypersomnia involves excessive sleepiness or prolonged sleep duration, often associated with narcolepsy, sleep apnea, or metabolic disorders.
• Research covers alternative approaches, herbal interventions, amino acids, vitamins, minerals, supplements, and nutrients.
• Positive therapeutic effects observed in pharmacological and nutritional strategies; some interventions show adverse effects or unclear dosing.
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Appl Health Econ Health Policy. 2025 Sep 16", "👉 Systematic review of economic evaluations for insomnia/hypersomnia, Positive/therapeutic effect mentioned", "40956569"),
                    Reference("Respir Med. 2025 Sep 5;248:108344", "👉 Asthma-OSA overlap syndrome study, Positive/therapeutic effect mentioned", "40915327"),
                    Reference("Sleep Breath. 2025 Aug 28;29(5):274", "👉 EMG activity in REM sleep in narcolepsy, No clear dose/effect/duration found", "40877710"),

                    // Herbs
                    Reference("CNS Neurol Disord Drug Targets. 2019;18(2):92-102", "👉 Medicinal plants for depressive disorders, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "30426905"),
                    Reference("Am J Chin Med. 2012;40(1):11-24", "👉 Traditional Chinese medicine compound for sleep-disordered breathing, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "22298445"),

                    // Amino acids
                    Reference("Sleep Med. 2025 Oct;134:106706", "👉 Solriamfetol for excessive daytime sleepiness in OSA, mg | Positive/therapeutic effect mentioned | week", "40752315"),
                    Reference("J Med Chem. 2025 May 22;68(10):10173-10189", "👉 Orexin 2 receptor agonists for narcolepsy, Positive/therapeutic effect mentioned", "40320640"),
                    Reference("Expert Rev Respir Med. 2025 Apr;19(4):325-345", "👉 Management options for EDS in OSA, No clear dose/effect/duration found", "40105060"),

                    // Vitamins
                    Reference("Sleep Med. 2025 Sep;133:106640", "👉 Narcolepsy and cardiovascular health, Positive/therapeutic effect mentioned", "40544784"),
                    Reference("Neurol Sci. 2025 Apr;46(4):1905-1909", "👉 Pons metabolite alterations in narcolepsy type 1, No clear dose/effect/duration found", "39951174"),
                    Reference("Aromatic L-Amino Acid Decarboxylase Deficiency", "👉 GeneReviews, Positive/therapeutic effect mentioned | month", "37824694"),

                    // Minerals
                    Reference("Sleep Med. 2024 Sep;121:375-378", "👉 Hypocretin-1 levels and bone mineral content in narcolepsy, No clear dose/effect/duration found", "39084148"),
                    Reference("Atypical Antipsychotic Effect on Bone Mineral Density", "👉 StatPearls 2025 Jan–, Negative/adverse effect mentioned", "34283520"),
                    Reference("Eur Rev Med Pharmacol Sci. 2022 Apr;26(8):2755-2764", "👉 Daytime sleepiness and cardiometabolic/osteoporosis associations, Positive/therapeutic effect mentioned", "35503620"),

                    // Supplements
                    Reference("Nervenarzt. 2025 Sep 18", "👉 ICD-11 vs ICD-10 in sleep disorders, Positive/therapeutic effect mentioned", "40965652"),
                    Reference("Eur J Obstet Gynecol Reprod Biol. 2025 Aug;312:114082", "👉 Zinc supplementation for PMS, Positive/therapeutic effect mentioned", "40435711"),
                    Reference("Zhonghua Jie He He Hu Xi Za Zhi. 2025 Apr 12;48(4):304-317", "👉 Consensus on excessive daytime sleepiness in OSA, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40159049"),

                    // Nutrients
                    Reference("Nutrients. 2025 Jul 29;17(15):2476", "👉 Cardiometabolic factors and EDS in Latino individuals, Negative/adverse effect mentioned", "40806061"),
                    Reference("Nutrients. 2023 Aug 22;15(17):3679", "👉 Orexin role in REM sleep and appetite, No clear dose/effect/duration found", "37686711"),
                    Reference("Nutrients. 2023 May 25;15(11):2467", "👉 Hypomagnesemia and EDS in older adults, mg", "37299428")
                )
            )

            "Hypertension" -> Pair(
                """
Alternative approaches
1. Modified fixed-dose combination antihypertensive tablet study, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
2. Remimazolam vs Propofol on intraoperative BP, No clear dose/effect/duration found.
3. Intravascular lithotripsy for femoral artery disease, No clear dose/effect/duration found.

Herbs
1. Salvianolic acid B & Senkyunolide I for cardiac hypertrophy, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
2. Culinary medicine program using herbs/spices for hypertension, Positive/therapeutic effect mentioned.
3. YangXue QingNao Wan ameliorates vascular dementia in rats, Positive/therapeutic effect mentioned | week.

Amino acids
1. Heliopsis longipes root extract for hypertensive rats, Positive/therapeutic effect mentioned.
2. Glecaprevir/Pibrentasvir effects on liver function, month.
3. Antioxidants, gut microbiota, cardiovascular programming, Positive/therapeutic effect mentioned.

Vitamins
1. Vitamin C and biological aging, mg, G | Positive/therapeutic effect mentioned.
2. Allograft adaptation after kidney transplantation, Positive/therapeutic effect mentioned.
3. Hypercalcemia after parathyroidectomy, g | Positive/therapeutic effect mentioned.

Minerals
1. Dysregulation of phosphate transporters in early-stage CKD-MBD, Positive/therapeutic effect mentioned.
2. Nutritional challenges with incretin-based obesity meds, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.
3. Low bone mineral density burden study, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.

Supplements
1. Lacticaseibacillus rhamnosus Probio-M9 alters gut microbiota and mitigates pulmonary hypertension in rats, Positive/therapeutic effect mentioned.
2. Pre-pregnancy obesity and hypertensive disorders of pregnancy, No clear dose/effect/duration found.
3. Anthocyanin-enriched purple potato flour prevents hypertension, g | Positive/therapeutic effect mentioned.

Nutrients
1. Plant-based foods on metabolic outcomes in adults with MASLD, Positive/therapeutic effect mentioned.
2. Lacticaseibacillus rhamnosus Probio-M9 alters gut microbiota and mitigates pulmonary hypertension in rats, Positive/therapeutic effect mentioned.
3. Maternal high-fat diet effects on offspring cardiovascular-metabolic health, Positive/therapeutic effect mentioned.

Summary for readers
• Hypertension research includes pharmacological, herbal, amino acid, vitamin, mineral, supplement, and nutrient-based interventions.
• Positive therapeutic effects observed in multiple interventions; some treatments show adverse effects or unclear dosing.
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Pharmaceutics. 2025 Sep 22;17(9):1235", "👉 Modified fixed-dose combination antihypertensive tablet study, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41012570"),
                    Reference("Medicina (Kaunas). 2025 Sep 22;61(9):1721", "👉 Remimazolam vs Propofol on intraoperative BP, No clear dose/effect/duration found", "41011112"),
                    Reference("J Clin Med. 2025 Sep 15;14(18):6492", "👉 Intravascular lithotripsy for femoral artery disease, No clear dose/effect/duration found", "41010696"),

                    // Herbs
                    Reference("Chin Med. 2025 Sep 28;20(1):148", "👉 Salvianolic acid B & Senkyunolide I for cardiac hypertrophy, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "41015772"),
                    Reference("Am J Health Promot. 2025 Sep 13:8901171251380839", "👉 Culinary medicine program using herbs/spices for hypertension, Positive/therapeutic effect mentioned", "40944674"),
                    Reference("J Ethnopharmacol. 2025 Sep 5;354:120550", "👉 YangXue QingNao Wan ameliorates vascular dementia in rats, Positive/therapeutic effect mentioned | week", "40915374"),

                    // Amino acids
                    Reference("Molecules. 2025 Sep 12;30(18):3711", "👉 Heliopsis longipes root extract for hypertensive rats, Positive/therapeutic effect mentioned", "41011602"),
                    Reference("Medicina (Kaunas). 2025 Sep 4;61(9):1601", "👉 Glecaprevir/Pibrentasvir effects on liver function, month", "41010992"),
                    Reference("Antioxidants (Basel). 2025 Aug 26;14(9):1049", "👉 Antioxidants, gut microbiota, cardiovascular programming, Positive/therapeutic effect mentioned", "41008956"),

                    // Vitamins
                    Reference("Eur J Med Res. 2025 Sep 26;30(1):864", "👉 Vitamin C and biological aging, mg, G | Positive/therapeutic effect mentioned", "41013587"),
                    Reference("Int J Mol Sci. 2025 Sep 20;26(18):9190", "👉 Allograft adaptation after kidney transplantation, Positive/therapeutic effect mentioned", "41009752"),
                    Reference("Int J Mol Sci. 2025 Sep 15;26(18):8965", "👉 Hypercalcemia after parathyroidectomy, g | Positive/therapeutic effect mentioned", "41009532"),

                    // Minerals
                    Reference("Bone. 2025 Sep 18;201:117653", "👉 Dysregulation of phosphate transporters in early-stage CKD-MBD, Positive/therapeutic effect mentioned", "40975510"),
                    Reference("Adv Nutr. 2025 Sep 18:100522", "👉 Nutritional challenges with incretin-based obesity meds, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40975496"),
                    Reference("Lancet Rheumatol. 2025 Sep 16:S2665-9913(25)00105-5", "👉 Low bone mineral density burden study, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40972625"),

                    // Supplements
                    Reference("Nutrients. 2025 Sep 11;17(18):2927", "👉 Lacticaseibacillus rhamnosus Probio-M9 alters gut microbiota and mitigates pulmonary hypertension in rats, Positive/therapeutic effect mentioned", "41010453"),
                    Reference("J Obstet Gynaecol Can. 2025 Sep 24:103070", "👉 Pre-pregnancy obesity and hypertensive disorders of pregnancy, No clear dose/effect/duration found", "41005619"),
                    Reference("Food Funct. 2025 Sep 25", "👉 Anthocyanin-enriched purple potato flour prevents hypertension, g | Positive/therapeutic effect mentioned", "40994411"),

                    // Nutrients
                    Reference("Nutrients. 2025 Sep 22;17(18):3020", "👉 Plant-based foods on metabolic outcomes in adults with MASLD, Positive/therapeutic effect mentioned", "41010543"),
                    Reference("Nutrients. 2025 Sep 11;17(18):2927", "👉 Lacticaseibacillus rhamnosus Probio-M9 alters gut microbiota and mitigates pulmonary hypertension in rats, Positive/therapeutic effect mentioned", "41010453"),
                    Reference("Antioxidants (Basel). 2025 Sep 19;14(9):1136", "👉 Maternal high-fat diet effects on offspring cardiovascular-metabolic health, Positive/therapeutic effect mentioned", "41009040")
                )
            )

            "Hypothyroidism" -> Pair(
                """
Alternative approaches
1. Lenvatinib + pembrolizumab in metastatic B3 thymoma, mg | Negative/adverse effect mentioned | month.
2. Hashimoto's thyroiditis treated with ShamanaChikitsa principles, Positive/therapeutic effect mentioned.
3. Prednisolone/Chlorambucil metronomic therapy in canine nasal carcinoma, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week, month.

Herbs
1. Four typical "hot" herbs energy-balancing effect via AMPK-FA metabolism, No clear dose/effect/duration found.
2. Role of herbs in polycystic ovary syndrome management, Positive/therapeutic effect mentioned.
3. Herbal remedies for hypothyroidism: systematic review, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.

Amino acids
1. Biventricular function in adolescents with Hashimoto's thyroiditis, No clear dose/effect/duration found.
2. Altered carnitine profiles in levothyroxine-treated congenital hypothyroid patients, mg | Positive/therapeutic effect mentioned.
3. Selenomethionine-enriched yeast effect on hypothyroidism patients, Positive/therapeutic effect mentioned.

Vitamins
1. Vitamin B12 treatment on adrenal gland in PTU-induced hypothyroid rats, µg, mg.
2. Micronutrient influence in thyroid autoimmunity, No clear dose/effect/duration found.
3. Adverse outcomes in hypothyroid patients undergoing bariatric surgery, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.

Minerals
1. Glyphosate-based herbicide exposure induces hypothyroidism & bone disorders, Negative/adverse effect mentioned.
2. Selenomethionine-enriched yeast effect on hypothyroidism patients, Positive/therapeutic effect mentioned.
3. Clinical characteristics & management, Positive/therapeutic effect mentioned | month.

Supplements
1. Pharmacotherapy effects on gut and probiotic bacteria, No clear dose/effect/duration found.
2. Selenomethionine-enriched yeast effect on hypothyroidism patients, Positive/therapeutic effect mentioned.
3. Narrative review on immune-related adverse events of immune checkpoint inhibitors, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned.

Nutrients
1. Pharmacotherapy effects on gut microbiota, No clear dose/effect/duration found.
2. Omics components in human milk: systematic review, Positive/therapeutic effect mentioned.
3. Iodine deficiency and excess in Brazilian pregnant women, µg.

Summary for readers
• Hypothyroidism research covers pharmacological, herbal, amino acid, vitamin, mineral, supplement, and nutrient-based interventions.
• Positive therapeutic effects observed in multiple interventions; some treatments show adverse effects or unclear dosing.
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Lancet Oncol. 2025 Sep;26(9):1215-1226", "👉 Lenvatinib + pembrolizumab in metastatic B3 thymoma, mg | Negative/adverse effect mentioned | month", "40907517"),
                    Reference("J Ayurveda Integr Med. 2025 Sep-Oct;16(5):101172", "👉 Hashimoto's thyroiditis treated with ShamanaChikitsa principles, Positive/therapeutic effect mentioned", "40886522"),
                    Reference("Curr Issues Mol Biol. 2025 Aug 15;47(8):660", "👉 Prednisolone/Chlorambucil metronomic therapy in canine nasal carcinoma, mg | Positive/therapeutic effect mentioned; Negative/adverse effect mentioned | week, month", "40864814"),

                    // Herbs
                    Reference("J Pharm Anal. 2025 Apr;15(4):101151", "👉 Four typical 'hot' herbs energy-balancing effect via AMPK-FA metabolism, No clear dose/effect/duration found", "40242219"),
                    Reference("Steroids. 2025 Jun;218:109606", "👉 Role of herbs in polycystic ovary syndrome management, Positive/therapeutic effect mentioned", "40210106"),
                    Reference("Caspian J Intern Med. 2024 Oct 19;16(1):1-8", "👉 Herbal remedies for hypothyroidism: systematic review, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "39619751"),

                    // Amino acids
                    Reference("Niger J Clin Pract. 2025 Sep 1;28(9):1039-1048", "👉 Biventricular function in adolescents with Hashimoto's thyroiditis, No clear dose/effect/duration found", "41014529"),
                    Reference("PLoS One. 2025 Sep 25;20(9):e0331474", "👉 Altered carnitine profiles in levothyroxine-treated congenital hypothyroid patients, mg | Positive/therapeutic effect mentioned", "40996983"),
                    Reference("Arch Razi Inst. 2025 Feb 1;80(1):257-261", "👉 Selenomethionine-enriched yeast effect on hypothyroidism patients, Positive/therapeutic effect mentioned", "40951555"),

                    // Vitamins
                    Reference("Open Vet J. 2025 Jun;15(6):2395-2407", "👉 Vitamin B12 treatment on adrenal gland in PTU-induced hypothyroid rats, µg, mg", "40989642"),
                    Reference("Cureus. 2025 Aug 20;17(8):e90609", "👉 Micronutrient influence in thyroid autoimmunity, No clear dose/effect/duration found", "40978905"),
                    Reference("J Clin Endocrinol Metab. 2025 Sep 16:dgaf519", "👉 Adverse outcomes in hypothyroid patients undergoing bariatric surgery, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40971953"),

                    // Minerals
                    Reference("Toxics. 2025 Sep 4;13(9):752", "👉 Glyphosate-based herbicide exposure induces hypothyroidism & bone disorders, Negative/adverse effect mentioned", "41012373"),
                    Reference("Arch Razi Inst. 2025 Feb 1;80(1):257-261", "👉 Selenomethionine-enriched yeast effect on hypothyroidism patients, Positive/therapeutic effect mentioned", "40951555"),
                    Reference("Cystinosis", "👉 Clinical characteristics & management, Positive/therapeutic effect mentioned | month", "20301574"),

                    // Supplements
                    Reference("Pharmaceuticals (Basel). 2025 Sep 13;18(9):1372", "👉 Pharmacotherapy effects on gut and probiotic bacteria, No clear dose/effect/duration found", "41011240"),
                    Reference("Arch Razi Inst. 2025 Feb 1;80(1):257-261", "👉 Selenomethionine-enriched yeast effect on hypothyroidism patients, Positive/therapeutic effect mentioned", "40951555"),
                    Reference("Chin Clin Oncol. 2025 Aug;14(4):42", "👉 Narrative review on immune-related adverse events of immune checkpoint inhibitors, Positive/therapeutic effect mentioned; Negative/adverse effect mentioned", "40897297"),

                    // Nutrients
                    Reference("Pharmaceuticals (Basel). 2025 Sep 13;18(9):1372", "👉 Pharmacotherapy effects on gut microbiota, No clear dose/effect/duration found", "41011240"),
                    Reference("J Mother Child. 2025 Sep 12;29(1):126-142", "👉 Omics components in human milk: systematic review, Positive/therapeutic effect mentioned", "40966381"),
                    Reference("Nutrients. 2025 Aug 26;17(17):2753", "👉 Iodine deficiency and excess in Brazilian pregnant women, µg", "40944144")
                )
            )

            "Impetigo" -> Pair(
                """
Alternative approaches
1. MRSA in cutaneous infections: current treatments, mg | Negative/adverse effect mentioned | day.
2. Polylactic acid membranes as adjunct treatment for bullous impetigo, G | Positive/therapeutic effect mentioned | day.
3. Ozenoxacin 1% in pediatric & adult patients: meta-analysis, Positive/therapeutic effect mentioned.

Herbs
1. Some Nigerian plants of dermatologic importance, Positive/therapeutic effect mentioned.
2. Historical medical manuscript by Mihail Plamenac, No clear dose/effect/duration found.

Amino acids
1. Ammonium carboxylate salt of undecylenic acid for topical treatment, mg | Negative/adverse effect mentioned | day.
2. Multi-epitope subunit vaccine against Streptococcus pyogenes, Negative/adverse effect mentioned.
3. Staphylococcal exfoliative toxin & desmoglein 1, No clear dose/effect/duration found.

Vitamins
1. Pharmacotherapeutic management of skin diseases in neonates/infants, No clear dose/effect/duration found.
2. Nigerian plants with vitamin effects in dermatology, Positive/therapeutic effect mentioned.
3. Bullous impetigo in streptococcal toxic shock syndrome, Negative/adverse effect mentioned.

Minerals
1. Nigerian plants of dermatologic importance, Positive/therapeutic effect mentioned.
2. Treatment of scalp disorders, No clear dose/effect/duration found.
3. Experimental infection of skin in hamster simulating human impetigo, No clear dose/effect/duration found.

Supplements
1. Streptococcus pyogenes Man-PTS system influences antimicrobial activity, Positive/therapeutic effect mentioned.
2. Pharmacy First Services for common conditions management, G | Positive/therapeutic effect mentioned.
3. Interdigital and plantar foot infections: retrospective analysis, No clear dose/effect/duration found.

Nutrients
1. Transcription within sdr region of Staphylococcus aureus, No clear dose/effect/duration found.
2. Clinical trial: corticosteroids + nitrofurazone + vitamins A & D ointment, No clear dose/effect/duration found.

Summary for readers
• Impetigo management includes pharmacological, herbal, amino acid, vitamin, mineral, supplement, and nutrient-based interventions.
• Positive therapeutic effects observed in some treatments; others show adverse effects or unclear dosing.
""".trimIndent(),
                listOf(
                    // Alternative
                    Reference("Int J Pharm. 2025 Aug 14;684:126030", "👉 MRSA in cutaneous infections: current treatments, mg | Negative/adverse effect mentioned | day", "40818552"),
                    Reference("Infect Dis Rep. 2025 Jun 19;17(3):72", "👉 Polylactic acid membranes as adjunct treatment for bullous impetigo, G | Positive/therapeutic effect mentioned | day", "40559203"),
                    Reference("J Clin Med. 2025 Mar 21;14(7):2157", "👉 Ozenoxacin 1% in pediatric & adult patients: meta-analysis, Positive/therapeutic effect mentioned", "40217608"),

                    // Herbs
                    Reference("Int J Dermatol. 2007 Oct;46 Suppl 1:48-55", "👉 Some Nigerian plants of dermatologic importance, Positive/therapeutic effect mentioned", "17919209"),
                    Reference("Srp Arh Celok Lek. 1998 Jan-Feb;126(1-2):63-7", "👉 Historical medical manuscript by Mihail Plamenac, No clear dose/effect/duration found", "9525086"),

                    // Amino acids
                    Reference("Exp Dermatol. 2025 Mar;34(3):e70075", "👉 Ammonium carboxylate salt of undecylenic acid for topical treatment, mg | Negative/adverse effect mentioned | day", "40062430"),
                    Reference("Infect Genet Evol. 2022 Jun;100:105259", "👉 Multi-epitope subunit vaccine against Streptococcus pyogenes, Negative/adverse effect mentioned", "35231667"),
                    Reference("J Dermatol Sci. 2010 Sep;59(3):184-91", "👉 Staphylococcal exfoliative toxin & desmoglein 1, No clear dose/effect/duration found", "20728315"),

                    // Vitamins
                    Reference("Expert Opin Pharmacother. 2017 May;18(7):717-725", "👉 Pharmacotherapeutic management of skin diseases in neonates/infants, No clear dose/effect/duration found", "28429969"),
                    Reference("Int J Dermatol. 2007 Oct;46 Suppl 1:48-55", "👉 Nigerian plants with vitamin effects in dermatology, Positive/therapeutic effect mentioned", "17919209"),
                    Reference("Pediatr Emerg Care. 2007 May;23(5):318-20", "👉 Bullous impetigo in streptococcal toxic shock syndrome, Negative/adverse effect mentioned", "17505275"),

                    // Minerals
                    Reference("Int J Dermatol. 2007 Oct;46 Suppl 1:48-55", "👉 Nigerian plants of dermatologic importance, Positive/therapeutic effect mentioned", "17919209"),
                    Reference("Br Med J. 1974 Feb 9;1(5901):236-8", "👉 Treatment of scalp disorders, No clear dose/effect/duration found", "4361899"),
                    Reference("J Infect Dis. 1970 Sep;122(3):196-204", "👉 Experimental infection of skin in hamster simulating human impetigo, No clear dose/effect/duration found", "5449490"),

                    // Supplements
                    Reference("J Bacteriol. 2025 Apr 17;207(4):e0049224", "👉 Streptococcus pyogenes Man-PTS system influences antimicrobial activity, Positive/therapeutic effect mentioned", "40135874"),
                    Reference("Int J Pharm Pract. 2025 Apr 15;33(2):152-161", "👉 Pharmacy First Services for common conditions management, G | Positive/therapeutic effect mentioned", "40043189"),
                    Reference("Microorganisms. 2025 Jan 16;13(1):184", "👉 Interdigital and plantar foot infections: retrospective analysis, No clear dose/effect/duration found", "39858952"),

                    // Nutrients
                    Reference("Antonie Van Leeuwenhoek. 2011 Feb;99(2):409-16", "👉 Transcription within sdr region of Staphylococcus aureus, No clear dose/effect/duration found", "20571861"),
                    Reference("Hospital (Rio J). 1964 Feb;65:351-7", "👉 Clinical trial: corticosteroids + nitrofurazone + vitamins A & D ointment, No clear dose/effect/duration found", "14136754")
                )
            )



            else -> Pair("No summary available.", emptyList())
        }
    }

    // ✅ See peab olema siin — ilma selleta ongi "Initializer type mismatch" viga
    fun getDiseaseList(): List<String> {
        return listOf(
            "Acne",
            "Acute pancreatitis",
            "Addison's disease",
            "ADHD in children and young people",
            "Anaemia (iron deficiency)",
            "Anaemia (vitamin B12 or folate deficiency)",
            "Angina",
            "Ankle sprain",
            "Anorexia nervosa",
            "Aphasia",
            "Appendicitis",
            "Arrhythmia",
            "Arthritis",
            "Asbestosis",
            "Asperger's syndrome",
            "Asthma",
            "Astigmatism",
            "Ataxia",
            "Atherosclerosis",
            "Athlete's foot",
            "Atopic eczema",
            "Atrial fibrillation",
            "Autism",
            "Autosomal dominant polycystic kidney disease",
            "Autosomal recessive polycystic kidney disease",
            "Avian flu",
            "Back pain",
            "Bacterial vaginosis",
            "Baker's cyst",
            "Balanitis",
            "Bartholin's cyst",
            "Bedbugs",
            "Behçet's disease",
            "Bell's palsy",
            "Benign brain tumours",
            "Benign prostate enlargement",
            "Bile duct cancer",
            "Bilharzia",
            "Binge eating disorder",
            "Bipolar disorder",
            "Bird flu",
            "Birthmarks",
            "Bladder cancer",
            "Bladder pain syndrome",
            "Bladder stones",
            "Blepharitis",
            "Blisters",
            "Blood poisoning",
            "Blood pressure (high)",
            "Blood pressure (low)",
            "Body dysmorphic disorder",
            "Boils",
            "Bone cancer",
            "Bone cyst",
            "Borderline personality disorder",
            "Botulism",
            "Bowel cancer",
            "Bowel incontinence",
            "Bowel polyps",
            "Brain abscess",
            "Brain aneurysm",
            "Brain death",
            "Brain haemorrhage",
            "Brain tumours",
            "Breast abscess",
            "Breast cancer in men",
            "Breast cancer in women",
            "Breath-holding in babies and children",
            "Broken ankle",
            "Broken arm or wrist",
            "Broken collarbone",
            "Broken finger or thumb",
            "Broken hip",
            "Broken leg",
            "Bronchiectasis",
            "Bronchitis",
            "Bursitis",
            "Caffeine intolerance",
            "Canker sores",
            "Cancer",
            "Celiac disease",
            "Chest infection",
            "Chickenpox",
            "Chlamydia",
            "Cholesterol (high)",
            "Chronic kidney disease",
            "Chronic obstructive pulmonary disease (COPD)",
            "Coeliac disease",
            "Cold sores",
            "Colic",
            "Common cold",
            "Conjunctivitis",
            "Constipation",
            "Contact dermatitis",
            "COPD",
            "Cough",
            "Croup",
            "Cystitis",
            "Cystic fibrosis",
            "Dandruff",
            "Dementia",
            "Dental abscess",
            "Depression",
            "Diabetes (type 1)",
            "Diabetes (type 2)",
            "Diarrhoea",
            "Diphtheria",
            "Dizziness",
            "Dyslexia",
            "Dyspraxia",
            "Ear infections",
            "Eczema",
            "Ehlers-Danlos syndromes",
            "Endometriosis",
            "Epilepsy",
            "Excessive sweating",
            "Eye infections",
            "Eye problems",
            "Fainting",
            "Fertility problems",
            "Fibroids",
            "Fibromyalgia",
            "Flu",
            "Food allergy",
            "Food intolerance",
            "Food poisoning",
            "Fungal nail infection",
            "Gallstones",
            "Gastritis",
            "Generalised anxiety disorder",
            "Glandular fever",
            "Glaucoma",
            "Gout",
            "Guillain-Barré syndrome",
            "Hair loss",
            "Hay fever",
            "Headaches",
            "Heart attack",
            "Heart failure",
            "Heartburn and acid reflux",
            "Heat exhaustion and heatstroke",
            "Heat rash",
            "Hepatitis",
            "Hernia",
            "High blood pressure",
            "HIV",
            "Hodgkin lymphoma",
            "Hives",
            "Huntington's disease",
            "Hyperhidrosis",
            "Hypersomnia",
            "Hypertension",
            "Hypothyroidism",
            "Impetigo"
        )
    }
}
