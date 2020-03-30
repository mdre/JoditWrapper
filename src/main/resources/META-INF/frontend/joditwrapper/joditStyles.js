import styles from '@vaadin/flow-frontend/joditwrapper/jodit.min.css'
const $_documentContainer = document
        .createElement('template');
$_documentContainer.innerHTML = `
  <dom-module id="jodit-styles">
    <template><style>${styles}</style></template>
  </dom-module>`;
document.head.appendChild($_documentContainer.content);


