<div class="markdown prose w-full break-words dark:prose-invert dark">
    <h1>Rentify - Property Rental Management System</h1>
    <p>Rentify is a web-based property rental management system designed to simplify the process of renting properties
        for both landlords and tenants. The system allows property owners to list their properties for rent and
        potential tenants to search for available properties based on their preferences.</p>
    <h2>Features</h2>
    <ul>
        <li><strong>User Authentication</strong>: Users can register and login to the system as landlords or tenants.
        </li>
        <li><strong>Property Listing</strong>: Landlords can list their properties for rent by providing details such as
            location, number of bedrooms, bathrooms, amenities, etc.</li>
        <li><strong>Property Search</strong>: Tenants can search for available properties based on various criteria such
            as location, number of bedrooms, bathrooms, etc.</li>
        <li><strong>Property Filtering</strong>: Tenants can apply filters to narrow down their property search based on
            specific criteria.</li>
        <li><strong>Pagination</strong>: Property search results are paginated to improve usability and performance.
        </li>
        <li><strong>Interest Submission</strong>: Tenants can express interest in a property by submitting their contact
            details.</li>
        <li><strong>Email Notifications</strong>: Landlords and tenants receive email notifications when there is an
            expression of interest in a property.</li>
    </ul>
    <h2>Tech Stack</h2>
    <ul>
        <li><strong>Backend</strong>: Spring Boot</li>
        <li><strong>Frontend</strong>: Thymeleaf, HTML, CSS</li>
        <li><strong>Database</strong>: MySQL (or your preferred database)</li>
        <li><strong>Dependency Management</strong>: Maven</li>
        <li><strong>Version Control</strong>: Git</li>
        <li><strong>Deployment</strong>: Render.com for cloud deployment</li>
    </ul>
    <h2>Installation</h2>
    <ol>
        <li>
            <p>Clone the repository:</p>
            <pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><span>bash</span><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4 text-left undefined" dir="ltr"><code class="!whitespace-pre hljs language-bash">git <span class="hljs-built_in">clone</span> &lt;https://github.com/gauravsharma049/Rentify.git&gt;
</code></div></div></pre>
        </li>
        <li>
            <p>Navigate to the project directory:</p>
            <pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><span>bash</span><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4 text-left undefined" dir="ltr"><code class="!whitespace-pre hljs language-bash"><span class="hljs-built_in">cd</span> rentify
</code></div></div></pre>
        </li>
        <li>
            <p>Build the project:</p>
            <pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><span>bash</span><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4 text-left undefined" dir="ltr"><code class="!whitespace-pre hljs language-bash">mvn clean install
</code></div></div></pre>
        </li>
        <li>
            <p>Run the application:</p>
            <pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><span>bash</span><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4 text-left undefined" dir="ltr"><code class="!whitespace-pre hljs language-bash">mvn spring-boot:run
</code></div></div></pre>
        </li>
    </ol>
    <h2>Usage</h2>
    <ul>
        <li>Access the web application at <code>http://localhost:8080</code> in your web browser.</li>
        <li>Register as a landlord or tenant to start using the application.</li>
        <li>List your properties as a landlord or search for properties as a tenant.</li>
        <li>Express interest in properties you are interested in renting.</li>
    </ul>
    
</div>