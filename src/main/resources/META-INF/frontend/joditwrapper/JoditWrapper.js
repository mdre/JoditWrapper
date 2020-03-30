import {PolymerElement,html} from '@polymer/polymer/polymer-element.js';

import '@vaadin/flow-frontend/joditwrapper/joditStyles.js';
import {Jodit} from '@vaadin/flow-frontend/joditwrapper/jodit.js';

class JoditWrapper extends PolymerElement {
    static get template() {
        return html `
            <style include='jodit-styles'>
            </style>
            
            <div id="editor"></div>
            
            `;
    }
    
    static get is() {
        return 'jodit-wrapper';
    }    
    
    initComponent() {
        const editorElement =  this.shadowRoot.querySelector("#editor");
        let docEditor = new Jodit(editorElement);;
        this.joWrapper = docEditor;
    }
  
    connectedCallback() {
        super.connectedCallback();
        console.log("connected callback!!");
        this.initComponent();
    }
  
};
customElements.define(JoditWrapper.is, JoditWrapper);