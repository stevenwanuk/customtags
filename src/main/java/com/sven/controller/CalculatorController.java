package com.sven.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sven.model.CollapsedList;
import com.sven.model.SimpleListItem;
import com.sven.model.SimpleTitleList;

@Controller
public class CalculatorController
{

    @RequestMapping("/calculatorBySpecialty")
    public ModelAndView calculatorBySpecialty()
    {
        ModelAndView mav = new ModelAndView("calculatorBySpecialty");

        mav.addObject("container1", get1());
        mav.addObject("container2", get2());
        mav.addObject("container3", get3());

        List<CollapsedList> collapseContainers = new ArrayList<>();
        collapseContainers.add(get1());
        collapseContainers.add(get2());
        collapseContainers.add(get3());
        mav.addObject("list", collapseContainers);

        return mav;
    }

    @RequestMapping("/calculator")
    public ModelAndView list()
    {
        ModelAndView mav = new ModelAndView("calculator");


        List<SimpleTitleList> list = new ArrayList<>();
        list.add(SimpleTitleList.builder().withTitle("A").withList(getAList()).build());
        list.add(SimpleTitleList.builder().withTitle("B").withList(getBList()).build());
        mav.addObject("calculatorList", list);

        
        List<CollapsedList> collapseContainers = new ArrayList<>();
        collapseContainers.add(get1());
        collapseContainers.add(get2());
        collapseContainers.add(get3());
        mav.addObject("calculatorBySpecialtyList", collapseContainers);

        return mav;
    }

    private List<SimpleListItem> getAList()
    {

        List<SimpleListItem> list = new ArrayList<>();

        list.add(SimpleListItem.builder().withTitle("A-a Gradient").withDescription(
                "Calculates difference between alveolar and arterial oxygen concentration.").build());
        list.add(SimpleListItem.builder().withTitle(
                "ABCD2 Score to Predict Stroke Risk after TIA").withDescription(
                        "Estimates the risk of stroke following transient ischemic attack.").build());
        list.add(SimpleListItem.builder().withTitle(
                "Absolute Eosinophil Count").withDescription(
                        "Assesses number of eosinophils (e.g., in people with allergic or autoimmune conditions, or parasite infections).").build());
        list.add(SimpleListItem.builder().withTitle(
                "Absolute Lymphocyte Count").withDescription(
                        "Estimates number of lymphocytes and predicts CD4 count.").build());
        list.add(SimpleListItem.builder().withTitle(
                "Absolute Neutrophil Count").withDescription(
                        "Measures number of neutrophils (used to asses neutropenia or neutrophipa).").build());

        return list;

    }
    
    private List<SimpleListItem> getBList()
    {

        List<SimpleListItem> list = new ArrayList<>();

        list.add(SimpleListItem.builder().withTitle("BAP-65 prediction of in-hospital mortality and need for mechanical ventilation in COPD").withDescription(
                "Predicts risk of mortality and need for mechanical ventilation in acute exacerbations of COPD.").build());
        list.add(SimpleListItem.builder().withTitle(
                "Base Excess Determination").withDescription(
                        "Aids in identifying acid-base disorders.").build());
        list.add(SimpleListItem.builder().withTitle(
                "Bayesian Statistics I MultiCalc").withDescription(
                        "Calculates statistics from prevalence, sensitivity, and specificity.").build());
        list.add(SimpleListItem.builder().withTitle(
                "Bayesian Statistics II MultiCalc").withDescription(
                        "Calculates statistics from true and false positives and negatives.").build());
        list.add(SimpleListItem.builder().withTitle(
                "Bedside Index of Severity in Acute Pancreatitis (BISAP) Score").withDescription(
                        "Predicts risk of mortality in acute pancreatitis.").build());

        return list;

    }

    private CollapsedList get1()
    {

        String descirption =
                "Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS.";
        return CollapsedList.builder().withTitle("Anesthesia").withDescription(
                descirption).withId("11").build();
    }

    private CollapsedList get2()
    {

        String descirption =
                "Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS.";
        return CollapsedList.builder().withTitle("Anthropometrics").withDescription(
                descirption).withId("12").build();
    }

    private CollapsedList get3()
    {

        SimpleListItem item1 = SimpleListItem.builder().withTitle(
                "CHA₂DS₂-VASc Score for Atrial Fibrillation Stroke Risk").withDescription(
                        "Calculates stroke risk for patients with atrial fibrillation, possibly better than the CHADS2 score.").build();

        SimpleListItem item2 = SimpleListItem.builder().withTitle(
                "CHADS₂ Score for Atrial Fibrillation Stroke Risk").withDescription(
                        "Estimates stroke risk in patients with atrial fibrillation.").build();

        SimpleListItem item3 = SimpleListItem.builder().withTitle(
                "Cardiac Anesthesia Risk Evaluation Score (CARE)").withDescription(
                        "Predicts mortality and morbidity after cardiac surgery.").build();

        List<SimpleListItem> list = new ArrayList<>();
        list.add(item1);
        list.add(item2);
        list.add(item3);

        return CollapsedList.builder().withTitle("Cardiology").withList(list).withId(
                "13").build();
    }
}
