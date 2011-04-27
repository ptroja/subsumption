package subsumption.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import subsumption.SubsumptionPackage;
import subsumption.System;
import subsumption.diagram.edit.parts.InhibitorEditPart;
import subsumption.diagram.edit.parts.InhibitorTimeEditPart;
import subsumption.diagram.edit.parts.InputEditPart;
import subsumption.diagram.edit.parts.InputInputCompartmentEditPart;
import subsumption.diagram.edit.parts.ModuleEditPart;
import subsumption.diagram.edit.parts.ModuleNameEditPart;
import subsumption.diagram.edit.parts.OutputEditPart;
import subsumption.diagram.edit.parts.OutputNameEditPart;
import subsumption.diagram.edit.parts.OutputOutputCompartmentEditPart;
import subsumption.diagram.edit.parts.SuppressorEditPart;
import subsumption.diagram.edit.parts.SuppressorTimeEditPart;
import subsumption.diagram.edit.parts.SystemEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class SubsumptionVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "subsumption.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (SystemEditPart.MODEL_ID.equals(view.getType())) {
				return SystemEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return subsumption.diagram.part.SubsumptionVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				SubsumptionDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (SubsumptionPackage.eINSTANCE.getSystem().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((System) domainElement)) {
			return SystemEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = subsumption.diagram.part.SubsumptionVisualIDRegistry
				.getModelID(containerView);
		if (!SystemEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (SystemEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = subsumption.diagram.part.SubsumptionVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SystemEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case SystemEditPart.VISUAL_ID:
			if (SubsumptionPackage.eINSTANCE.getModule().isSuperTypeOf(
					domainElement.eClass())) {
				return ModuleEditPart.VISUAL_ID;
			}
			break;
		case ModuleEditPart.VISUAL_ID:
			if (SubsumptionPackage.eINSTANCE.getInput().isSuperTypeOf(
					domainElement.eClass())) {
				return InputEditPart.VISUAL_ID;
			}
			if (SubsumptionPackage.eINSTANCE.getOutput().isSuperTypeOf(
					domainElement.eClass())) {
				return OutputEditPart.VISUAL_ID;
			}
			break;
		case InputInputCompartmentEditPart.VISUAL_ID:
			if (SubsumptionPackage.eINSTANCE.getSuppressor().isSuperTypeOf(
					domainElement.eClass())) {
				return SuppressorEditPart.VISUAL_ID;
			}
			break;
		case OutputOutputCompartmentEditPart.VISUAL_ID:
			if (SubsumptionPackage.eINSTANCE.getInhibitor().isSuperTypeOf(
					domainElement.eClass())) {
				return InhibitorEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = subsumption.diagram.part.SubsumptionVisualIDRegistry
				.getModelID(containerView);
		if (!SystemEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (SystemEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = subsumption.diagram.part.SubsumptionVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SystemEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case SystemEditPart.VISUAL_ID:
			if (ModuleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ModuleEditPart.VISUAL_ID:
			if (ModuleNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputEditPart.VISUAL_ID:
			if (InputInputCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SuppressorEditPart.VISUAL_ID:
			if (SuppressorTimeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OutputEditPart.VISUAL_ID:
			if (OutputNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputOutputCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InhibitorEditPart.VISUAL_ID:
			if (InhibitorTimeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputInputCompartmentEditPart.VISUAL_ID:
			if (SuppressorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OutputOutputCompartmentEditPart.VISUAL_ID:
			if (InhibitorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(System element) {
		return true;
	}

}
