package subsumption.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

import subsumption.Inhibitor;
import subsumption.Input;
import subsumption.Modifier;
import subsumption.Module;
import subsumption.Output;
import subsumption.SubsumptionPackage;
import subsumption.Suppressor;
import subsumption.System;
import subsumption.diagram.edit.parts.InhibitorEditPart;
import subsumption.diagram.edit.parts.InputEditPart;
import subsumption.diagram.edit.parts.InputInputCompartmentEditPart;
import subsumption.diagram.edit.parts.ModuleEditPart;
import subsumption.diagram.edit.parts.OutputActivatesEditPart;
import subsumption.diagram.edit.parts.OutputEditPart;
import subsumption.diagram.edit.parts.OutputOutputCompartmentEditPart;
import subsumption.diagram.edit.parts.OutputSinkEditPart;
import subsumption.diagram.edit.parts.SuppressorEditPart;
import subsumption.diagram.edit.parts.SystemEditPart;
import subsumption.diagram.providers.SubsumptionElementTypes;

/**
 * @generated
 */
public class SubsumptionDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<SubsumptionNodeDescriptor> getSemanticChildren(View view) {
		switch (SubsumptionVisualIDRegistry.getVisualID(view)) {
		case SystemEditPart.VISUAL_ID:
			return getSystem_1000SemanticChildren(view);
		case ModuleEditPart.VISUAL_ID:
			return getModule_2001SemanticChildren(view);
		case InputInputCompartmentEditPart.VISUAL_ID:
			return getInputInputCompartment_7002SemanticChildren(view);
		case OutputOutputCompartmentEditPart.VISUAL_ID:
			return getOutputOutputCompartment_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SubsumptionNodeDescriptor> getSystem_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		System modelElement = (System) view.getElement();
		LinkedList<SubsumptionNodeDescriptor> result = new LinkedList<SubsumptionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getModules().iterator(); it
				.hasNext();) {
			Module childElement = (Module) it.next();
			int visualID = SubsumptionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ModuleEditPart.VISUAL_ID) {
				result.add(new SubsumptionNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SubsumptionNodeDescriptor> getModule_2001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Module modelElement = (Module) view.getElement();
		LinkedList<SubsumptionNodeDescriptor> result = new LinkedList<SubsumptionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
			Input childElement = (Input) it.next();
			int visualID = SubsumptionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InputEditPart.VISUAL_ID) {
				result.add(new SubsumptionNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOutputs().iterator(); it
				.hasNext();) {
			Output childElement = (Output) it.next();
			int visualID = SubsumptionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OutputEditPart.VISUAL_ID) {
				result.add(new SubsumptionNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SubsumptionNodeDescriptor> getInputInputCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Input modelElement = (Input) containerView.getElement();
		LinkedList<SubsumptionNodeDescriptor> result = new LinkedList<SubsumptionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSuppressedBy().iterator(); it
				.hasNext();) {
			Suppressor childElement = (Suppressor) it.next();
			int visualID = SubsumptionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SuppressorEditPart.VISUAL_ID) {
				result.add(new SubsumptionNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SubsumptionNodeDescriptor> getOutputOutputCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Output modelElement = (Output) containerView.getElement();
		LinkedList<SubsumptionNodeDescriptor> result = new LinkedList<SubsumptionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInhibitedBy().iterator(); it
				.hasNext();) {
			Inhibitor childElement = (Inhibitor) it.next();
			int visualID = SubsumptionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InhibitorEditPart.VISUAL_ID) {
				result.add(new SubsumptionNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SubsumptionLinkDescriptor> getContainedLinks(View view) {
		switch (SubsumptionVisualIDRegistry.getVisualID(view)) {
		case SystemEditPart.VISUAL_ID:
			return getSystem_1000ContainedLinks(view);
		case ModuleEditPart.VISUAL_ID:
			return getModule_2001ContainedLinks(view);
		case InputEditPart.VISUAL_ID:
			return getInput_3001ContainedLinks(view);
		case SuppressorEditPart.VISUAL_ID:
			return getSuppressor_3003ContainedLinks(view);
		case OutputEditPart.VISUAL_ID:
			return getOutput_3002ContainedLinks(view);
		case InhibitorEditPart.VISUAL_ID:
			return getInhibitor_3004ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SubsumptionLinkDescriptor> getIncomingLinks(View view) {
		switch (SubsumptionVisualIDRegistry.getVisualID(view)) {
		case ModuleEditPart.VISUAL_ID:
			return getModule_2001IncomingLinks(view);
		case InputEditPart.VISUAL_ID:
			return getInput_3001IncomingLinks(view);
		case SuppressorEditPart.VISUAL_ID:
			return getSuppressor_3003IncomingLinks(view);
		case OutputEditPart.VISUAL_ID:
			return getOutput_3002IncomingLinks(view);
		case InhibitorEditPart.VISUAL_ID:
			return getInhibitor_3004IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SubsumptionLinkDescriptor> getOutgoingLinks(View view) {
		switch (SubsumptionVisualIDRegistry.getVisualID(view)) {
		case ModuleEditPart.VISUAL_ID:
			return getModule_2001OutgoingLinks(view);
		case InputEditPart.VISUAL_ID:
			return getInput_3001OutgoingLinks(view);
		case SuppressorEditPart.VISUAL_ID:
			return getSuppressor_3003OutgoingLinks(view);
		case OutputEditPart.VISUAL_ID:
			return getOutput_3002OutgoingLinks(view);
		case InhibitorEditPart.VISUAL_ID:
			return getInhibitor_3004OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SubsumptionLinkDescriptor> getSystem_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SubsumptionLinkDescriptor> getModule_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SubsumptionLinkDescriptor> getInput_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SubsumptionLinkDescriptor> getSuppressor_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SubsumptionLinkDescriptor> getOutput_3002ContainedLinks(
			View view) {
		Output modelElement = (Output) view.getElement();
		LinkedList<SubsumptionLinkDescriptor> result = new LinkedList<SubsumptionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Output_Sink_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Output_Activates_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SubsumptionLinkDescriptor> getInhibitor_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SubsumptionLinkDescriptor> getModule_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SubsumptionLinkDescriptor> getInput_3001IncomingLinks(
			View view) {
		Input modelElement = (Input) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SubsumptionLinkDescriptor> result = new LinkedList<SubsumptionLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Output_Sink_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SubsumptionLinkDescriptor> getSuppressor_3003IncomingLinks(
			View view) {
		Suppressor modelElement = (Suppressor) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SubsumptionLinkDescriptor> result = new LinkedList<SubsumptionLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Output_Activates_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SubsumptionLinkDescriptor> getOutput_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SubsumptionLinkDescriptor> getInhibitor_3004IncomingLinks(
			View view) {
		Inhibitor modelElement = (Inhibitor) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SubsumptionLinkDescriptor> result = new LinkedList<SubsumptionLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Output_Activates_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SubsumptionLinkDescriptor> getModule_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SubsumptionLinkDescriptor> getInput_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SubsumptionLinkDescriptor> getSuppressor_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SubsumptionLinkDescriptor> getOutput_3002OutgoingLinks(
			View view) {
		Output modelElement = (Output) view.getElement();
		LinkedList<SubsumptionLinkDescriptor> result = new LinkedList<SubsumptionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Output_Sink_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Output_Activates_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SubsumptionLinkDescriptor> getInhibitor_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<SubsumptionLinkDescriptor> getIncomingFeatureModelFacetLinks_Output_Sink_4001(
			Input target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<SubsumptionLinkDescriptor> result = new LinkedList<SubsumptionLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == SubsumptionPackage.eINSTANCE
					.getOutput_Sink()) {
				result.add(new SubsumptionLinkDescriptor(setting.getEObject(),
						target, SubsumptionElementTypes.OutputSink_4001,
						OutputSinkEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SubsumptionLinkDescriptor> getIncomingFeatureModelFacetLinks_Output_Activates_4002(
			Modifier target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<SubsumptionLinkDescriptor> result = new LinkedList<SubsumptionLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == SubsumptionPackage.eINSTANCE
					.getOutput_Activates()) {
				result.add(new SubsumptionLinkDescriptor(setting.getEObject(),
						target, SubsumptionElementTypes.OutputActivates_4002,
						OutputActivatesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SubsumptionLinkDescriptor> getOutgoingFeatureModelFacetLinks_Output_Sink_4001(
			Output source) {
		LinkedList<SubsumptionLinkDescriptor> result = new LinkedList<SubsumptionLinkDescriptor>();
		for (Iterator<?> destinations = source.getSink().iterator(); destinations
				.hasNext();) {
			Input destination = (Input) destinations.next();
			result.add(new SubsumptionLinkDescriptor(source, destination,
					SubsumptionElementTypes.OutputSink_4001,
					OutputSinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SubsumptionLinkDescriptor> getOutgoingFeatureModelFacetLinks_Output_Activates_4002(
			Output source) {
		LinkedList<SubsumptionLinkDescriptor> result = new LinkedList<SubsumptionLinkDescriptor>();
		for (Iterator<?> destinations = source.getActivates().iterator(); destinations
				.hasNext();) {
			Modifier destination = (Modifier) destinations.next();
			result.add(new SubsumptionLinkDescriptor(source, destination,
					SubsumptionElementTypes.OutputActivates_4002,
					OutputActivatesEditPart.VISUAL_ID));
		}
		return result;
	}

}
