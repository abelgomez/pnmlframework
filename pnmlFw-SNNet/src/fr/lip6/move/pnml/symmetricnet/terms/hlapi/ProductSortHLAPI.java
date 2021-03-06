/**
 *  Copyright 2009-2016 Université Paris Ouest and Sorbonne Universités,
							Univ. Paris 06 - CNRS UMR 7606 (LIP6)
 *
 *  All rights reserved.   This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Project leader / Initial Contributor:
 *    Lom Messan Hillah - <lom-messan.hillah@lip6.fr>
 *
 *  Contributors:
 *    ${ocontributors} - <$oemails}>
 *
 *  Mailing list:
 *    lom-messan.hillah@lip6.fr
 */
/**
 * (C) Sorbonne Universités, UPMC Univ Paris 06, UMR CNRS 7606 (LIP6)
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors: 
 *    Lom HILLAH (LIP6) - Initial models and implementation
 *    Rachid Alahyane (UPMC) - Infrastructure and continuous integration
 *    Bastien Bouzerau (UPMC) - Architecture 
 *    Guillaume Giffo (UPMC) - Code generation refactoring, High-level API
 *
 * $Id ggiffo, Thu Feb 11 16:29:03 CET 2016$
 */
package fr.lip6.move.pnml.symmetricnet.terms.hlapi;

import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

import org.apache.axiom.om.OMElement;
import org.eclipse.emf.common.util.DiagnosticChain;

import fr.lip6.move.pnml.framework.hlapi.HLAPIClass;
import fr.lip6.move.pnml.framework.utils.IdRefLinker;
import fr.lip6.move.pnml.framework.utils.exception.InnerBuildException;
import fr.lip6.move.pnml.framework.utils.exception.InvalidIDException;
import fr.lip6.move.pnml.framework.utils.exception.VoidRepositoryException;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.Type;
import fr.lip6.move.pnml.symmetricnet.hlcorestructure.hlapi.TypeHLAPI;
import fr.lip6.move.pnml.symmetricnet.multisets.All;
import fr.lip6.move.pnml.symmetricnet.multisets.Empty;
import fr.lip6.move.pnml.symmetricnet.multisets.hlapi.AllHLAPI;
import fr.lip6.move.pnml.symmetricnet.multisets.hlapi.EmptyHLAPI;
import fr.lip6.move.pnml.symmetricnet.partitions.Partition;
import fr.lip6.move.pnml.symmetricnet.partitions.hlapi.PartitionHLAPI;
import fr.lip6.move.pnml.symmetricnet.terms.MultisetSort;
import fr.lip6.move.pnml.symmetricnet.terms.NamedSort;
import fr.lip6.move.pnml.symmetricnet.terms.ProductSort;
import fr.lip6.move.pnml.symmetricnet.terms.Sort;
import fr.lip6.move.pnml.symmetricnet.terms.TermsFactory;
import fr.lip6.move.pnml.symmetricnet.terms.VariableDecl;
import fr.lip6.move.pnml.symmetricnet.terms.impl.TermsFactoryImpl;


public class ProductSortHLAPI implements HLAPIClass,SortHLAPI{

	/**
	 * The contained LLAPI element.
	 */
	private ProductSort item;

	/**
	 * this constructor allows you to set all 'settable' values
	 * excepted container.
	 */
	
	public ProductSortHLAPI(){//BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createProductSort();}
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public ProductSortHLAPI(
		 MultisetSortHLAPI multi
	){//BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createProductSort();}
	
 		
 		if(multi!=null)
			item.setMulti((MultisetSort)multi.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public ProductSortHLAPI(
		 NamedSortHLAPI containerNamedSort
	){//BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createProductSort();}
	
 		
 		if(containerNamedSort!=null)
			item.setContainerNamedSort((NamedSort)containerNamedSort.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public ProductSortHLAPI(
		 VariableDeclHLAPI containerVariableDecl
	){//BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createProductSort();}
	
 		
 		if(containerVariableDecl!=null)
			item.setContainerVariableDecl((VariableDecl)containerVariableDecl.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public ProductSortHLAPI(
		 TypeHLAPI containerType
	){//BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createProductSort();}
	
 		
 		if(containerType!=null)
			item.setContainerType((Type)containerType.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public ProductSortHLAPI(
		 AllHLAPI containerAll
	){//BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createProductSort();}
	
 		
 		if(containerAll!=null)
			item.setContainerAll((All)containerAll.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public ProductSortHLAPI(
		 EmptyHLAPI containerEmpty
	){//BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createProductSort();}
	
 		
 		if(containerEmpty!=null)
			item.setContainerEmpty((Empty)containerEmpty.getContainedItem());
		
	
	}

	/**
	 * this constructor allows you to set all 'settable' values, including container if any.
	 */
	
	public ProductSortHLAPI(
		 PartitionHLAPI containerPartition
	){//BEGIN CONSTRUCTOR BODY
		TermsFactory fact = TermsFactoryImpl.eINSTANCE;
		synchronized(fact){item = fact.createProductSort();}
	
 		
 		if(containerPartition!=null)
			item.setContainerPartition((Partition)containerPartition.getContainedItem());
		
	
	}



	
	
	
	
	
	
	
	

	/**
	 * This constructor encapsulate a low level API object in HLAPI.
	 */
	public ProductSortHLAPI(ProductSort lowLevelAPI){
		item = lowLevelAPI;
	}

	// access to low level API
	/**
	 * Return encapsulated object
	 */
	public ProductSort getContainedItem(){
		return item;
	}

	//getters giving LLAPI object
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public MultisetSort getMulti(){
		return item.getMulti();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public NamedSort getContainerNamedSort(){
		return item.getContainerNamedSort();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public VariableDecl getContainerVariableDecl(){
		return item.getContainerVariableDecl();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public ProductSort getContainerProductSort(){
		return item.getContainerProductSort();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Type getContainerType(){
		return item.getContainerType();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public All getContainerAll(){
		return item.getContainerAll();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Empty getContainerEmpty(){
		return item.getContainerEmpty();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public Partition getContainerPartition(){
		return item.getContainerPartition();
	}
	
	/**
	 * Return the encapsulate Low Level API object.
	 */
	public List<Sort> getElementSort(){
		return item.getElementSort();
	}
	

	//getters giving HLAPI object
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public MultisetSortHLAPI getMultiHLAPI(){
			if(item.getMulti() == null) return null;
			return new MultisetSortHLAPI(item.getMulti());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public NamedSortHLAPI getContainerNamedSortHLAPI(){
			if(item.getContainerNamedSort() == null) return null;
			return new NamedSortHLAPI(item.getContainerNamedSort());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public VariableDeclHLAPI getContainerVariableDeclHLAPI(){
			if(item.getContainerVariableDecl() == null) return null;
			return new VariableDeclHLAPI(item.getContainerVariableDecl());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public ProductSortHLAPI getContainerProductSortHLAPI(){
			if(item.getContainerProductSort() == null) return null;
			return new ProductSortHLAPI(item.getContainerProductSort());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public TypeHLAPI getContainerTypeHLAPI(){
			if(item.getContainerType() == null) return null;
			return new TypeHLAPI(item.getContainerType());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public AllHLAPI getContainerAllHLAPI(){
			if(item.getContainerAll() == null) return null;
			return new AllHLAPI(item.getContainerAll());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public EmptyHLAPI getContainerEmptyHLAPI(){
			if(item.getContainerEmpty() == null) return null;
			return new EmptyHLAPI(item.getContainerEmpty());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 * @return : null if the element is null
		 */
		
		public PartitionHLAPI getContainerPartitionHLAPI(){
			if(item.getContainerPartition() == null) return null;
			return new PartitionHLAPI(item.getContainerPartition());
		}
		
	
	
	
	
		/**
		 * This accessor automatically encapsulate all elements of the selected sublist.
		 * WARNING : this can creates a lot of new object in memory.
		 */
		
			
		public java.util.List<SortHLAPI> getElementSortHLAPI(){
			java.util.List<SortHLAPI> retour = new ArrayList<SortHLAPI>();
			for (Sort elemnt : getElementSort()) {
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.terms.impl.MultisetSortImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.terms.hlapi.MultisetSortHLAPI(
						(fr.lip6.move.pnml.symmetricnet.terms.MultisetSort)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.terms.impl.ProductSortImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.terms.hlapi.ProductSortHLAPI(
						(fr.lip6.move.pnml.symmetricnet.terms.ProductSort)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.terms.impl.UserSortImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.terms.hlapi.UserSortHLAPI(
						(fr.lip6.move.pnml.symmetricnet.terms.UserSort)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.booleans.impl.BoolImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.BoolHLAPI(
						(fr.lip6.move.pnml.symmetricnet.booleans.Bool)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.impl.CyclicEnumerationImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.hlapi.CyclicEnumerationHLAPI(
						(fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.CyclicEnumeration)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.dots.impl.DotImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.dots.hlapi.DotHLAPI(
						(fr.lip6.move.pnml.symmetricnet.dots.Dot)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.finiteEnumerations.impl.FiniteEnumerationImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.finiteEnumerations.hlapi.FiniteEnumerationHLAPI(
						(fr.lip6.move.pnml.symmetricnet.finiteEnumerations.FiniteEnumeration)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangeImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.FiniteIntRangeHLAPI(
						(fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRange)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.integers.impl.NaturalImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.NaturalHLAPI(
						(fr.lip6.move.pnml.symmetricnet.integers.Natural)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.integers.impl.PositiveImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.PositiveHLAPI(
						(fr.lip6.move.pnml.symmetricnet.integers.Positive)elemnt
						));
					continue;
				}
				
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.integers.impl.HLIntegerImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.HLIntegerHLAPI(
						(fr.lip6.move.pnml.symmetricnet.integers.HLInteger)elemnt
						));
					continue;
				}
				
			}
			return retour;
		}
		
	
	

	//Special getter for list of generics object, return only one object type.
	
	
	
	
	
	
	
	
	
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of MultisetSortHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.terms.hlapi.MultisetSortHLAPI> getElementSort_terms_MultisetSortHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.terms.hlapi.MultisetSortHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.terms.hlapi.MultisetSortHLAPI>();
			for (Sort elemnt : getElementSort()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.terms.impl.MultisetSortImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.terms.hlapi.MultisetSortHLAPI(
						(fr.lip6.move.pnml.symmetricnet.terms.MultisetSort)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of ProductSortHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.terms.hlapi.ProductSortHLAPI> getElementSort_terms_ProductSortHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.terms.hlapi.ProductSortHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.terms.hlapi.ProductSortHLAPI>();
			for (Sort elemnt : getElementSort()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.terms.impl.ProductSortImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.terms.hlapi.ProductSortHLAPI(
						(fr.lip6.move.pnml.symmetricnet.terms.ProductSort)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of UserSortHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.terms.hlapi.UserSortHLAPI> getElementSort_terms_UserSortHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.terms.hlapi.UserSortHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.terms.hlapi.UserSortHLAPI>();
			for (Sort elemnt : getElementSort()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.terms.impl.UserSortImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.terms.hlapi.UserSortHLAPI(
						(fr.lip6.move.pnml.symmetricnet.terms.UserSort)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of BoolHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.booleans.hlapi.BoolHLAPI> getElementSort_booleans_BoolHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.booleans.hlapi.BoolHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.booleans.hlapi.BoolHLAPI>();
			for (Sort elemnt : getElementSort()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.booleans.impl.BoolImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.booleans.hlapi.BoolHLAPI(
						(fr.lip6.move.pnml.symmetricnet.booleans.Bool)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of CyclicEnumerationHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.hlapi.CyclicEnumerationHLAPI> getElementSort_cyclicEnumerations_CyclicEnumerationHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.hlapi.CyclicEnumerationHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.hlapi.CyclicEnumerationHLAPI>();
			for (Sort elemnt : getElementSort()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.impl.CyclicEnumerationImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.hlapi.CyclicEnumerationHLAPI(
						(fr.lip6.move.pnml.symmetricnet.cyclicEnumerations.CyclicEnumeration)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of DotHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.dots.hlapi.DotHLAPI> getElementSort_dots_DotHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.dots.hlapi.DotHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.dots.hlapi.DotHLAPI>();
			for (Sort elemnt : getElementSort()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.dots.impl.DotImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.dots.hlapi.DotHLAPI(
						(fr.lip6.move.pnml.symmetricnet.dots.Dot)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of FiniteEnumerationHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.finiteEnumerations.hlapi.FiniteEnumerationHLAPI> getElementSort_finiteEnumerations_FiniteEnumerationHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.finiteEnumerations.hlapi.FiniteEnumerationHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.finiteEnumerations.hlapi.FiniteEnumerationHLAPI>();
			for (Sort elemnt : getElementSort()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.finiteEnumerations.impl.FiniteEnumerationImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.finiteEnumerations.hlapi.FiniteEnumerationHLAPI(
						(fr.lip6.move.pnml.symmetricnet.finiteEnumerations.FiniteEnumeration)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of FiniteIntRangeHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.FiniteIntRangeHLAPI> getElementSort_finiteIntRanges_FiniteIntRangeHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.FiniteIntRangeHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.FiniteIntRangeHLAPI>();
			for (Sort elemnt : getElementSort()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.finiteIntRanges.impl.FiniteIntRangeImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.finiteIntRanges.hlapi.FiniteIntRangeHLAPI(
						(fr.lip6.move.pnml.symmetricnet.finiteIntRanges.FiniteIntRange)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of NaturalHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.NaturalHLAPI> getElementSort_integers_NaturalHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.NaturalHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.integers.hlapi.NaturalHLAPI>();
			for (Sort elemnt : getElementSort()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.integers.impl.NaturalImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.NaturalHLAPI(
						(fr.lip6.move.pnml.symmetricnet.integers.Natural)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of PositiveHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.PositiveHLAPI> getElementSort_integers_PositiveHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.PositiveHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.integers.hlapi.PositiveHLAPI>();
			for (Sort elemnt : getElementSort()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.integers.impl.PositiveImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.PositiveHLAPI(
						(fr.lip6.move.pnml.symmetricnet.integers.Positive)elemnt
						));
				}
			}
			return retour;
		}
		
		
		/**
		 * This accessor return a list of encapsulated subelement, only of HLIntegerHLAPI kind.
		 * WARNING : this method can creates a lot of new object in memory.
		 */
		public java.util.List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.HLIntegerHLAPI> getElementSort_integers_HLIntegerHLAPI(){
			java.util.List<fr.lip6.move.pnml.symmetricnet.integers.hlapi.HLIntegerHLAPI> retour = new ArrayList<fr.lip6.move.pnml.symmetricnet.integers.hlapi.HLIntegerHLAPI>();
			for (Sort elemnt : getElementSort()) {
				if(elemnt.getClass().equals(fr.lip6.move.pnml.symmetricnet.integers.impl.HLIntegerImpl.class)){
					retour.add(new fr.lip6.move.pnml.symmetricnet.integers.hlapi.HLIntegerHLAPI(
						(fr.lip6.move.pnml.symmetricnet.integers.HLInteger)elemnt
						));
				}
			}
			return retour;
		}
		
	
	

	//setters (including container setter if aviable)
	
	
	/**
	 * set Multi
	 */
	public void setMultiHLAPI(
	
	MultisetSortHLAPI elem){
	
	
 		if(elem!=null)
			item.setMulti((MultisetSort)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerNamedSort
	 */
	public void setContainerNamedSortHLAPI(
	
	NamedSortHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerNamedSort((NamedSort)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerVariableDecl
	 */
	public void setContainerVariableDeclHLAPI(
	
	VariableDeclHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerVariableDecl((VariableDecl)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerProductSort
	 */
	public void setContainerProductSortHLAPI(
	
	ProductSortHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerProductSort((ProductSort)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerType
	 */
	public void setContainerTypeHLAPI(
	
	TypeHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerType((Type)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerAll
	 */
	public void setContainerAllHLAPI(
	
	AllHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerAll((All)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerEmpty
	 */
	public void setContainerEmptyHLAPI(
	
	EmptyHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerEmpty((Empty)elem.getContainedItem());
	
	}
	
	/**
	 * set ContainerPartition
	 */
	public void setContainerPartitionHLAPI(
	
	PartitionHLAPI elem){
	
	
 		if(elem!=null)
			item.setContainerPartition((Partition)elem.getContainedItem());
	
	}
	

	//setters/remover for lists.
	
	
	public void addElementSortHLAPI(SortHLAPI unit){
	
		item.getElementSort().add((Sort)unit.getContainedItem());
	}

	public void removeElementSortHLAPI(SortHLAPI unit){
		item.getElementSort().remove((Sort)unit.getContainedItem());
	}
	

	//equals method
	public boolean equals(ProductSortHLAPI item){
		return item.getContainedItem().equals(getContainedItem());
	}

	//PNML
	
	/**
	 * Returns the PNML xml tree for this object.
	 */
	public String toPNML(){
		return item.toPNML();
	}
	
	/**
	 * Writes the PNML XML tree of this object into file channel.
	 */
	public void toPNML(FileChannel fc){
		 item.toPNML(fc);
	}

	/**
	 * creates an object from the xml nodes.(symetric work of toPNML)
	 */
	public void fromPNML(OMElement subRoot,IdRefLinker idr) throws InnerBuildException, InvalidIDException, VoidRepositoryException{
		item.fromPNML(subRoot,idr);
	}
	

	public boolean validateOCL(DiagnosticChain diagnostics){
		return item.validateOCL(diagnostics);
	}

}