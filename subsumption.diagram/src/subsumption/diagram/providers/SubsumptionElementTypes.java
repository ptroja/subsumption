package subsumption.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import subsumption.SubsumptionPackage;
import subsumption.diagram.edit.parts.InhibitorEditPart;
import subsumption.diagram.edit.parts.InputEditPart;
import subsumption.diagram.edit.parts.ModuleEditPart;
import subsumption.diagram.edit.parts.OutputActivatesEditPart;
import subsumption.diagram.edit.parts.OutputEditPart;
import subsumption.diagram.edit.parts.OutputSinkEditPart;
import subsumption.diagram.edit.parts.SuppressorEditPart;
import subsumption.diagram.edit.parts.SystemEditPart;
import subsumption.diagram.part.SubsumptionDiagramEditorPlugin;

/**
 * @generated
 */
public class SubsumptionElementTypes {

	/**
	 * @generated
	 */
	private SubsumptionElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType System_1000 = getElementType("subsumption.diagram.System_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Module_2001 = getElementType("subsumption.diagram.Module_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Input_3001 = getElementType("subsumption.diagram.Input_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Suppressor_3003 = getElementType("subsumption.diagram.Suppressor_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Output_3002 = getElementType("subsumption.diagram.Output_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Inhibitor_3004 = getElementType("subsumption.diagram.Inhibitor_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OutputSink_4001 = getElementType("subsumption.diagram.OutputSink_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OutputActivates_4002 = getElementType("subsumption.diagram.OutputActivates_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return SubsumptionDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(System_1000, SubsumptionPackage.eINSTANCE.getSystem());

			elements.put(Module_2001, SubsumptionPackage.eINSTANCE.getModule());

			elements.put(Input_3001, SubsumptionPackage.eINSTANCE.getInput());

			elements.put(Suppressor_3003,
					SubsumptionPackage.eINSTANCE.getSuppressor());

			elements.put(Output_3002, SubsumptionPackage.eINSTANCE.getOutput());

			elements.put(Inhibitor_3004,
					SubsumptionPackage.eINSTANCE.getInhibitor());

			elements.put(OutputSink_4001,
					SubsumptionPackage.eINSTANCE.getOutput_Sink());

			elements.put(OutputActivates_4002,
					SubsumptionPackage.eINSTANCE.getOutput_Activates());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(System_1000);
			KNOWN_ELEMENT_TYPES.add(Module_2001);
			KNOWN_ELEMENT_TYPES.add(Input_3001);
			KNOWN_ELEMENT_TYPES.add(Suppressor_3003);
			KNOWN_ELEMENT_TYPES.add(Output_3002);
			KNOWN_ELEMENT_TYPES.add(Inhibitor_3004);
			KNOWN_ELEMENT_TYPES.add(OutputSink_4001);
			KNOWN_ELEMENT_TYPES.add(OutputActivates_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case SystemEditPart.VISUAL_ID:
			return System_1000;
		case ModuleEditPart.VISUAL_ID:
			return Module_2001;
		case InputEditPart.VISUAL_ID:
			return Input_3001;
		case SuppressorEditPart.VISUAL_ID:
			return Suppressor_3003;
		case OutputEditPart.VISUAL_ID:
			return Output_3002;
		case InhibitorEditPart.VISUAL_ID:
			return Inhibitor_3004;
		case OutputSinkEditPart.VISUAL_ID:
			return OutputSink_4001;
		case OutputActivatesEditPart.VISUAL_ID:
			return OutputActivates_4002;
		}
		return null;
	}

}
